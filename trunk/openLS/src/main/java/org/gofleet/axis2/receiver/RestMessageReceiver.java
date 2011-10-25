/*
 * Copyright (C) 2011, Emergya (http://www.emergya.es)
 *
 * @author <a href="mailto:marias@emergya.com">María Arias</a>
 *
 * This file is part of GoFleet
 *
 * This software is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * As a special exception, if you link this library with other files to
 * produce an executable, this library does not by itself cause the
 * resulting executable to be covered by the GNU General Public License.
 * This exception does not however invalidate any other reasons why the
 * executable file might be covered by the GNU General Public License.
 */
package org.gofleet.axis2.receiver;

import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.description.InOnlyAxisOperation;
import org.apache.axis2.description.WSDL2Constants;
import org.apache.axis2.receivers.RawXMLINOutMessageReceiver;
import org.apache.axis2.util.JavaUtils;
import org.apache.axis2.wsdl.WSDLUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author marias
 * 
 */
public class RestMessageReceiver extends RawXMLINOutMessageReceiver {
	Log LOG = LogFactory.getLog(RestMessageReceiver.class);

	/**
	 * 
	 * @param messageCtx
	 *            active MessageContext
	 * @throws AxisFault
	 *             if a problem occurred
	 */
	public void receive(final MessageContext messageCtx) throws AxisFault {
		if (messageCtx.isPropertyTrue(DO_ASYNC)
				|| ((messageCtx.getParameter(DO_ASYNC) != null) && JavaUtils
						.isTrueExplicitly(messageCtx.getParameter(DO_ASYNC)
								.getValue()))) {
			LOG.trace("Async");
			String mep = messageCtx.getAxisOperation()
					.getMessageExchangePattern();

			LOG.trace("MEP: " + mep);
			EndpointReference replyTo = messageCtx.getReplyTo();
			// In order to invoke the service in the ASYNC mode, the request
			// should contain ReplyTo header if the MEP of the service is not
			// InOnly type
			if ((!WSDLUtil.isOutputPresentForMEP(mep))
					|| (replyTo != null && !replyTo.hasAnonymousAddress())) {
				LOG.trace("AsyncMessageReceiverWorker");
				AsyncMessageReceiverWorker worker = new AsyncMessageReceiverWorker(
						messageCtx);
				messageCtx.getEnvelope().build();
				messageCtx.getConfigurationContext().getThreadPool()
						.execute(worker);
				LOG.trace("return");
				return;
			}
		}

		ThreadContextDescriptor tc = setThreadContext(messageCtx);
		try {
			invokeBusinessLogic(messageCtx);
		} catch (AxisFault fault) {
			LOG.error(fault, fault);
			// If we're in-only, eat this. Otherwise, toss it upwards!
			if ((messageCtx.getAxisOperation() instanceof InOnlyAxisOperation)
					&& !WSDL2Constants.MEP_URI_ROBUST_IN_ONLY.equals(messageCtx
							.getAxisOperation().getMessageExchangePattern())) {
				log.error(fault);
			} else {
				fault.setFaultType(Constants.APPLICATION_FAULT);
				throw fault;
			}
		} finally {
			LOG.trace("restoreThreadContext");
			restoreThreadContext(tc);
		}
	}
}

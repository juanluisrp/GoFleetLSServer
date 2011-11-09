
CREATE OR REPLACE FUNCTION gls_tsp_faster(routingtable text, stoptable integer[], gid text, source integer)
  RETURNS text[] AS
$$
DECLARE
	target INTEGER;
	done INTEGER;
	max INTEGER;
	source_ INTEGER;
	r RECORD;
	g RECORD;
	i INTEGER;
	routingRes INTEGER[]:='{}';
	res CHARACTER VARYING[][]:='{}';
	geometry CHARACTER VARYING;
        BEGIN
		RAISE INFO 'gls_tsp(%, %, %, %)', routingTable, stopTable, gid, source; 
		source_ := source;	
		WHILE NOT(stopTable <@ routingRes) LOOP
			RAISE INFO 'Looping on %, %', stopTable, routingRes;
			-- we put in target the next nearest element --
			SELECT t.id INTO target FROM routing s, routing t 
				WHERE  s.id = source 
				AND t.id = ANY (stopTable)
				AND NOT (t.id = ANY (routingres))
				and s.id <> t.id
				order by st_distance(t.geometry, s.geometry) asc
				limit 1;

			RAISE INFO 'SELECT rout.* FROM routing rout, 
							(select st_envelope(st_collect(geometry)) 
								as geometry from routing 
								where id = % or id = %) e
							WHERE rout.geometry && e.geometry', source_, target;
			FOR r in SELECT e.edge_id as edge, st_asText(routing.geometry) as geo,  e.cost as cost
				from shortest_path_shooting_star(
						'SELECT rout.* FROM routing rout, 
							(select st_envelope(st_collect(geometry)) 
								as geometry from routing 
								where id = ' || source_ || 
								' or id = ' || target || 
								') e
							WHERE rout.geometry && e.geometry', 
						source_, target, true, true) e, 
						routing
						WHERE e.edge_id = routing.id LOOP
				-- We update routingRes --
				RAISE INFO 'Going through %', r;
				routingRes := routingRes || r.edge;
				RAISE INFO 'RoutingRes %', routingRes;
				-- We put in res the edge, cost and geometry of the path --
				res := res || ARRAY[ARRAY[r.edge, r.cost, r.geo]]::VARCHAR[];
			END LOOP;
			SELECT target INTO source_;
		END LOOP;
		RETURN res;
        END;
$$
  LANGUAGE plpgsql IMMUTABLE
  COST 10000;

#!/bin/sh

#Configuration:
#Customize the following variables with your own environment:
DATABASE="gofleetls"
USERNAME="gofleetls"
HOST="127.0.0.1"
PORT="5432"
SHP_PATH="/var/svn/openls-seneca/trunk/NavteqQ22011_Andalucia/K2AM11100EK2000AAAEX/";


#Shouldn't touch the following code
HERE=$(pwd);
PSQL="psql -U $USERNAME $DATABASE -h $HOST -p $PORT"

cd $SHP_PATH;

echo "Loading NavTeq data"

$PSQL -c "DROP TABLE IF EXISTS cdms;"
$PSQL -c "DROP TABLE IF EXISTS rdms;"
$PSQL -c "DROP TABLE IF EXISTS actpoiloc;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy1;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy2;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy3;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy4;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy5;"
$PSQL -c "DROP TABLE IF EXISTS adminline1;"
$PSQL -c "DROP TABLE IF EXISTS adminline2;"
$PSQL -c "DROP TABLE IF EXISTS altstreets;"
$PSQL -c "DROP TABLE IF EXISTS autosvc;"
$PSQL -c "DROP TABLE IF EXISTS bordcross;"
$PSQL -c "DROP TABLE IF EXISTS business;"
$PSQL -c "DROP TABLE IF EXISTS cartocountry;"
$PSQL -c "DROP TABLE IF EXISTS cdms;"
$PSQL -c "DROP TABLE IF EXISTS cdmsdtmod;"
$PSQL -c "DROP TABLE IF EXISTS cndfileassoc;"
$PSQL -c "DROP TABLE IF EXISTS cndlanetrav;"
$PSQL -c "DROP TABLE IF EXISTS cndln;"
$PSQL -c "DROP TABLE IF EXISTS cndmod;"
$PSQL -c "DROP TABLE IF EXISTS commsvc;"
$PSQL -c "DROP TABLE IF EXISTS eduinsts;"
$PSQL -c "DROP TABLE IF EXISTS entertn;"
$PSQL -c "DROP TABLE IF EXISTS fininsts;"
$PSQL -c "DROP TABLE IF EXISTS hamlet;"
$PSQL -c "DROP TABLE IF EXISTS hospital;"
$PSQL -c "DROP TABLE IF EXISTS islands;"
$PSQL -c "DROP TABLE IF EXISTS landmark;"
$PSQL -c "DROP TABLE IF EXISTS landusea;"
$PSQL -c "DROP TABLE IF EXISTS landuseb;"
$PSQL -c "DROP TABLE IF EXISTS majhwys;"
$PSQL -c "DROP TABLE IF EXISTS misccategories;"
$PSQL -c "DROP TABLE IF EXISTS namedplc;"
$PSQL -c "DROP TABLE IF EXISTS oceans;"
$PSQL -c "DROP TABLE IF EXISTS parking;"
$PSQL -c "DROP TABLE IF EXISTS parkrec;"
$PSQL -c "DROP TABLE IF EXISTS railrds;"
$PSQL -c "DROP TABLE IF EXISTS rdms;"
$PSQL -c "DROP TABLE IF EXISTS restrnts;"
$PSQL -c "DROP TABLE IF EXISTS sechwys;"
$PSQL -c "DROP TABLE IF EXISTS shopping;"
$PSQL -c "DROP TABLE IF EXISTS streets;"
$PSQL -c "DROP TABLE IF EXISTS tanshubs;"
$PSQL -c "DROP TABLE IF EXISTS travest;"
$PSQL -c "DROP TABLE IF EXISTS waterpoly;"
$PSQL -c "DROP TABLE IF EXISTS waterseg;"
$PSQL -c "DROP TABLE IF EXISTS zlevels;"


for f in *.dbf
do
	shp2pgsql -W Latin1 -c -s 4326 -I $f | $PSQL
done;

cd $HERE

echo "Activating performance."

$PSQL -c "CREATE INDEX zlevels_combined_idx ON zlevels USING btree (link_id , point_num );" 

$PSQL -c "CREATE INDEX streets_linkid_idx ON streets USING btree (link_id);"

$PSQL -c "CREATE INDEX cdms_linkid_idx ON cdms USING btree (link_id);"
$PSQL -c "CREATE INDEX cdms_condid_idx ON cdms USING btree (cond_id);"

$PSQL -c "CREATE INDEX rdms_linkid_idx ON rdms USING btree (cond_id);"
$PSQL -c "CREATE INDEX rdms_condid_idx ON rdms USING btree (link_id);"

$PSQL -c "VACUUM ANALYZE zlevels;"
$PSQL -c "VACUUM ANALYZE rdms;"
$PSQL -c "VACUUM ANALYZE cdms;"
$PSQL -c "VACUUM ANALYZE streets;"

NOW=$(date +%s)

echo "Converting data to PgRouting format"

$PSQL -c "PERFORM gls_createTable('$NOW', 'routing');"
$PSQL -c "CREATE SEQUENCE routing_$NOW_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 CYCLE;"

$PSQL -c "INSERT INTO routing_$NOW
(SELECT 
	CASE (SELECT c.dir_travel FROM streets as c 
			where s.link_id = c.link_id limit 1)
		WHEN 'B' THEN st_length(s.the_geom)::double precision
		WHEN 'F' THEN st_length(s.the_geom)::double precision
		ELSE 'infinity'::double precision
        END as cost,
	CASE (SELECT dir_travel FROM streets 
			where link_id = streets.link_id limit 1) 
		WHEN 'B' THEN st_length(s.the_geom)::double precision
		WHEN 'T' THEN st_length(s.the_geom)::double precision
		ELSE 'infinity'::double precision
        END as reverse_cost,
        -1::integer as source,
        -1::integer as target,
        st_X(st_startpoint(s.the_geom::geometry))::double precision as x1,
        st_Y(st_startpoint(s.the_geom::geometry))::double precision as y1,
        st_X(st_endpoint(s.the_geom::geometry))::double precision as x2,
        st_Y(st_endpoint(s.the_geom::geometry))::double precision as y2,
        'infinity'::double precision as to_cost,
	man_linkid::text as rule,
        s.the_geom as geometry,
        nextval('routing_$NOW_id_seq') as id,
        s.link_id as gid
FROM 
	(SELECT gen.the_geom, gen.link_id, cond.cond_id FROM
		(select st_linefrommultipoint(st_collect(t.the_geom)) as the_geom, 
			t.link_id 
		from 
		(select the_geom, link_id 
			from zlevels order by link_id, point_num) as t
			group by t.link_id) as gen,
		cdms as cond
		where gen.link_id = cond.link_id
		cond.cond_type = 7) as s,
	rdms
WHERE rdms.cond_id = s.cond_id
AND rdms.link_id = s.link_id);"

$PSQL -c "INSERT INTO routing_$NOW  
(SELECT 
	'infinity'::double precision as cost,
	'infinity'::double precision as reverse_cost,
        -1::integer as source,
        -1::integer as target,
        st_X(st_startpoint(s.the_geom::geometry))::double precision as x1,
        st_Y(st_startpoint(s.the_geom::geometry))::double precision as y1,
        st_X(st_endpoint(s.the_geom::geometry))::double precision as x2,
        st_Y(st_endpoint(s.the_geom::geometry))::double precision as y2,
        'infinity'::double precision as to_cost,
	man_linkid::text as rule,
        s.the_geom as geometry,
        nextval('routing_$NOW_id_seq') as id,
        s.link_id as gid
FROM 
	(SELECT gen.the_geom, gen.link_id, cond.cond_id FROM
		(select st_linefrommultipoint(st_collect(t.the_geom)) as the_geom, 
			t.link_id 
		from 
		(select the_geom, link_id 
			from zlevels order by link_id, point_num) as t
			group by t.link_id) as gen,
		cdms as cond
		where gen.link_id = cond.link_id
		cond.cond_type = 4) as s,
	rdms
WHERE rdms.cond_id = s.cond_id
AND rdms.link_id = s.link_id);"

$PSQL -c "INSERT INTO routing_$NOW  
(SELECT 
	CASE (SELECT c.dir_travel FROM streets as c where s.link_id = c.link_id limit 1)
		WHEN 'B' THEN st_length(s.the_geom)::double precision
		WHEN 'F' THEN st_length(s.the_geom)::double precision
		ELSE 'infinity'::double precision
        END as cost,
	CASE (SELECT dir_travel FROM streets where link_id = streets.link_id limit 1) 
		WHEN 'B' THEN st_length(s.the_geom)::double precision
		WHEN 'T' THEN st_length(s.the_geom)::double precision
		ELSE 'infinity'::double precision
        END as reverse_cost,
        -2::integer as source,
        -2::integer as target,
        st_X(st_startpoint(s.the_geom::geometry))::double precision as x1,
        st_Y(st_startpoint(s.the_geom::geometry))::double precision as y1,
        st_X(st_endpoint(s.the_geom::geometry))::double precision as x2,
        st_Y(st_endpoint(s.the_geom::geometry))::double precision as y2,
        'infinity'::double precision as to_cost,
	''::text as rule,
        st_geometryn(s.the_geom,1) as geometry,
        nextval('routing_$NOW_id_seq') as id,
        s.link_id as gid
FROM streets s
WHERE NOT EXISTS(SELECT 1 FROM routing_$NOW r WHERE s.link_id = r.gid));"

$PSQL -c "SELECT assign_vertex_id('routing_$NOW', 0.000001, 'geometry', 'id');"

echo "Updating views"

$PSQL -c "PERFORM gls_updateTable('$NOW', 'routing');"

echo "Deleting temporary tables"

$PSQL -c "DROP TABLE IF EXISTS cdms;"
$PSQL -c "DROP TABLE IF EXISTS rdms;"
$PSQL -c "DROP TABLE IF EXISTS actpoiloc;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy1;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy2;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy3;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy4;"
$PSQL -c "DROP TABLE IF EXISTS adminbndy5;"
$PSQL -c "DROP TABLE IF EXISTS adminline1;"
$PSQL -c "DROP TABLE IF EXISTS adminline2;"
$PSQL -c "DROP TABLE IF EXISTS altstreets;"
$PSQL -c "DROP TABLE IF EXISTS autosvc;"
$PSQL -c "DROP TABLE IF EXISTS bordcross;"
$PSQL -c "DROP TABLE IF EXISTS business;"
$PSQL -c "DROP TABLE IF EXISTS cartocountry;"
$PSQL -c "DROP TABLE IF EXISTS cdms;"
$PSQL -c "DROP TABLE IF EXISTS cdmsdtmod;"
$PSQL -c "DROP TABLE IF EXISTS cndfileassoc;"
$PSQL -c "DROP TABLE IF EXISTS cndlanetrav;"
$PSQL -c "DROP TABLE IF EXISTS cndln;"
$PSQL -c "DROP TABLE IF EXISTS cndmod;"
$PSQL -c "DROP TABLE IF EXISTS commsvc;"
$PSQL -c "DROP TABLE IF EXISTS eduinsts;"
$PSQL -c "DROP TABLE IF EXISTS entertn;"
$PSQL -c "DROP TABLE IF EXISTS fininsts;"
$PSQL -c "DROP TABLE IF EXISTS hamlet;"
$PSQL -c "DROP TABLE IF EXISTS hospital;"
$PSQL -c "DROP TABLE IF EXISTS islands;"
$PSQL -c "DROP TABLE IF EXISTS landmark;"
$PSQL -c "DROP TABLE IF EXISTS landusea;"
$PSQL -c "DROP TABLE IF EXISTS landuseb;"
$PSQL -c "DROP TABLE IF EXISTS majhwys;"
$PSQL -c "DROP TABLE IF EXISTS misccategories;"
$PSQL -c "DROP TABLE IF EXISTS namedplc;"
$PSQL -c "DROP TABLE IF EXISTS oceans;"
$PSQL -c "DROP TABLE IF EXISTS parking;"
$PSQL -c "DROP TABLE IF EXISTS parkrec;"
$PSQL -c "DROP TABLE IF EXISTS railrds;"
$PSQL -c "DROP TABLE IF EXISTS rdms;"
$PSQL -c "DROP TABLE IF EXISTS restrnts;"
$PSQL -c "DROP TABLE IF EXISTS sechwys;"
$PSQL -c "DROP TABLE IF EXISTS shopping;"
$PSQL -c "DROP TABLE IF EXISTS streets;"
$PSQL -c "DROP TABLE IF EXISTS tanshubs;"
$PSQL -c "DROP TABLE IF EXISTS travest;"
$PSQL -c "DROP TABLE IF EXISTS waterpoly;"
$PSQL -c "DROP TABLE IF EXISTS waterseg;"
$PSQL -c "DROP TABLE IF EXISTS zlevels;"

echo "Importation successfull."

#!/bin/sh

#Configuration:
#Customize the following variables with your own environment:
DATABASE="gofleetls"
USERNAME="gofleetls"
HOST="192.168.1.175"
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

for f in *.shp
do
        shp2pgsql -W Latin10 -s 4326 -I -c $f | $PSQL
done;



for f in *.dbf
do
	shp2pgsql -W Latin10 -c $f | $PSQL
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

echo "Generating custom tables"

$PSQL -c "SELECT gls_createAllTables('$NOW'::VARCHAR);"
$PSQL -c "CREATE SEQUENCE id_value$NOW START 1;"

$PSQL -c "INSERT INTO street_$NOW SELECT gid, CASE WHEN st_name IS NULL THEN '' ELSE st_name END, st_GeometryN(the_geom, 1) as geom FROM streets;"
$PSQL -c "INSERT INTO municipality_subdivision_$NOW SELECT gid, CASE WHEN polygon_nm IS NULL THEN '' ELSE polygon_nm END, the_geom FROM AdminBndy5;"
$PSQL -c "INSERT INTO country_subdivision_$NOW 	SELECT gid, CASE WHEN polygon_nm IS NULL THEN '' ELSE polygon_nm END, the_geom FROM AdminBndy2;"
$PSQL -c "INSERT INTO country_$NOW SELECT 1, 'SPA', ST_Union(the_geom) FROM AdminBndy2;"
$PSQL -c "INSERT INTO municipality_$NOW SELECT nextval('id_value$NOW'), polygon_nm, the_geom FROM AdminBndy3;"
$PSQL -c "INSERT INTO municipality_$NOW SELECT nextval('id_value$NOW'), polygon_nm, the_geom FROM AdminBndy4;"

$PSQL -c "CREATE INDEX street_area_idx$NOW ON street_$NOW USING btree (st_area(geometry));"
$PSQL -c "CREATE INDEX street_geometry_idx$NOW ON street_$NOW USING gist (geometry);"
$PSQL -c "ALTER TABLE street_$NOW CLUSTER ON street_geometry_idx$NOW;"
$PSQL -c "CREATE INDEX street_id_idx$NOW ON street_$NOW USING btree (id);"
$PSQL -c "CREATE INDEX street_name_idx$NOW ON street_$NOW USING btree (name);"

$PSQL -c "CREATE INDEX municipality_subdivision_area_idx$NOW ON municipality_subdivision_$NOW USING btree (st_area(geometry));"
$PSQL -c "CREATE INDEX municipality_subdivision_geometry_idx$NOW ON municipality_subdivision_$NOW USING gist (geometry);"
$PSQL -c "ALTER TABLE municipality_subdivision_$NOW CLUSTER ON municipality_subdivision_geometry_idx$NOW;"
$PSQL -c "CREATE INDEX municipality_subdivision_id_idx$NOW ON municipality_subdivision_$NOW USING btree (id);"
$PSQL -c "CREATE INDEX municipality_subdivision_name_idx$NOW ON municipality_subdivision_$NOW USING btree (name);"

$PSQL -c "CREATE INDEX municipality_area_idx$NOW ON municipality_$NOW USING btree (st_area(geometry));"
$PSQL -c "CREATE INDEX municipality_geometry_idx$NOW ON municipality_$NOW USING gist (geometry);"
$PSQL -c "ALTER TABLE municipality_$NOW CLUSTER ON municipality_geometry_idx$NOW;"
$PSQL -c "CREATE INDEX municipality_id_idx$NOW ON municipality_$NOW USING btree (id);"
$PSQL -c "CREATE INDEX municipality_name_idx$NOW ON municipality_$NOW USING btree (name);"

$PSQL -c "CREATE INDEX country_subdivision_area_idx$NOW ON country_subdivision_$NOW USING btree (st_area(geometry));"
$PSQL -c "CREATE INDEX country_subdivision_geometry_idx$NOW ON country_subdivision_$NOW USING gist (geometry);"
$PSQL -c "ALTER TABLE country_subdivision_$NOW CLUSTER ON country_subdivision_geometry_idx;"
$PSQL -c "CREATE INDEX country_subdivision_id_idx$NOW ON country_subdivision_$NOW USING btree (id);"
$PSQL -c "CREATE INDEX country_subdivision_name_idx$NOW ON country_subdivision_$NOW USING btree (name);"

$PSQL -c "CREATE INDEX country_area_idx$NOW ON country_$NOW USING btree (st_area(geometry));"
$PSQL -c "CREATE INDEX country_geometry_idx$NOW ON country_$NOW USING gist (geometry);"
$PSQL -c "ALTER TABLE country_$NOW CLUSTER ON country_geometry_idx$NOW;"
$PSQL -c "CREATE INDEX country_id_idx$NOW ON country_$NOW USING btree (id);"
$PSQL -c "CREATE INDEX country_name_idx$NOW ON country_$NOW USING btree (name);"

$PSQL -c "CREATE INDEX routing_$NOW_gid_idx ON routing_$NOW (gid ASC NULLS LAST);"
$PSQL -c "CREATE INDEX routing_$NOW_id_idx ON routing_$NOW (id ASC NULLS LAST);"
$PSQL -c "CREATE INDEX routing_$NOW_source_idx ON routing_$NOW (source ASC NULLS LAST);"
$PSQL -c "CREATE INDEX routing_$NOW_target_idx ON routing_$NOW (target ASC NULLS LAST);"

echo "Converting data to PgRouting format"

$PSQL -c "CREATE SEQUENCE routing_id_seq$NOW INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 CYCLE;"

$PSQL -c "INSERT INTO routing_$NOW
(SELECT 
        nextval('routing_id_seq$NOW') as id,
        s.link_id as gid,
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
	s.the_geom as geometry
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
		and cond.cond_type = 7) as s,
	rdms
WHERE rdms.cond_id = s.cond_id
AND rdms.link_id = s.link_id);"

$PSQL -c "INSERT INTO routing_$NOW  
(SELECT
        nextval('routing_id_seq$NOW') as id,
        s.link_id as gid, 
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
        s.the_geom as geometry
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
		and cond.cond_type = 4) as s,
	rdms
WHERE rdms.cond_id = s.cond_id
AND rdms.link_id = s.link_id);"

$PSQL -c "INSERT INTO routing_$NOW  
(SELECT 
        nextval('routing_id_seq$NOW') as id,
        s.link_id as gid,
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
        st_geometryn(s.the_geom,1) as geometry
FROM streets s
WHERE NOT EXISTS(SELECT 1 FROM routing_$NOW r WHERE s.link_id = r.gid));"

$PSQL -c "SELECT assign_vertex_id('routing_$NOW', 0.000001, 'geometry', 'id');"

$PSQL -c "INSERT INTO routing_$NOW
(SELECT
        nextval('routing_id_seq$NOW') as id,
        source.gid as gid,
        source.cost as cost,
        source.reverse_cost as reverse_cost,
        source.source as source,
        source.target as target,
        source.x1 as x1,
        source.y1 as y1,
        source.x2 as x2,
        source.y2 as y2,
        'infinity'::double precision as to_cost,
        target.gid::text as rule,
        source.geometry as geometry
FROM 
	(SELECT r.*, z.z_level FROM routing r, zlevels z where r.gid = z.link_id order by z.point_num = (select max(point_num) from zlevels as l where l.link_id = z.link_id)) as source, 
	(SELECT r.source, z.z_level FROM routing r, zlevels z where r.gid = z.link_id and z.point_num = (select max(point_num) from zlevels as l where l.link_id = z.link_id)) as target
WHERE source.target = target.source
AND source.z_level <> target.z_level);"

$PSQL -c "DELETE FROM routing_$NOW r WHERE EXISTS (SELECT 1 FROM routing s WHERE s.gid = r.gid AND s.id <> r.id AND r.rule LIKE '');" 

echo "Updating views"

$PSQL -c "SELECT gls_updateAllTables('$NOW'::varchar);"

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

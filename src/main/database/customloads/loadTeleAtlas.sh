#!/bin/sh

echo "Script to transform TeleAtlas format to pgRouting format"
echo "Only works with routing data"
echo "It works only if the TeleAtlas data is already loaded on your database"
echo "and there is a 'routing' named table with the specific routing format"
echo "By executing this script you give us your soul and also accept that this script comes with no warranty"
echo "This means: You are the only one responsible of the damage caused by this script."

echo "Now, to important stuff:"

#Configuration:
#Customize the following variables with your own environment:
DATABASE="gofleetls"
USERNAME="gofleetls"
HOST="postgresql-apps"
PORT="5432"

NOW=$(date +%s)

echo "Generating custom tables"

$PSQL -c "CREATE SEQUENCE routing$NOW START 1;"

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

echo "Importation successfull."

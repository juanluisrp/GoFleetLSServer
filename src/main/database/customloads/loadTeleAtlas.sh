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
DATABASE="gofleet-madrid"
USERNAME="gofleet"
HOST="postgresql-apps"
PORT="5432"

NOW=$(date +%s)

PSQL="psql -U $USERNAME -h $HOST -p $PORT $DATABASE "

echo "Preparing helper views"

$PSQL -c "create or replace view
                network_00
        as
                select n.*
                from
                        t_network as n,
                        t_streets_00 as s
                where
                        st_contains(s.the_geom, n.the_geom);"
$PSQL -c "create or replace view
                network_01
        as
                select n.*
                from
                        t_network as n,
                        t_streets_01 as s
                where
                        st_contains(s.the_geom, n.the_geom);"
$PSQL -c "create or replace view
                network_02
        as
                select n.*
                from
                        t_network as n,
                        t_streets_02 as s
                where
                        st_contains(s.the_geom, n.the_geom);"
$PSQL -c "create or replace view
                network_03
        as
                select n.*
                from
                        t_network as n,
                        t_streets_03 as s
                where
                        st_contains(s.the_geom, n.the_geom);"
$PSQL -c "create or replace view
                network_04
        as
                select n.*
                from
                        t_network as n,
                        t_streets_04 as s
                where
                        st_contains(s.the_geom, n.the_geom);"
$PSQL -c "create or replace view
                network_05
        as
                select n.*
                from
                        t_network as n,
                        t_streets_05 as s
                where
                        st_contains(s.the_geom, n.the_geom);"
$PSQL -c "create or replace view
                network_06
        as
                select n.*
                from
                        t_network as n,
                        t_streets_06 as s
                where
                        st_contains(s.the_geom, n.the_geom);"
$PSQL -c "create or replace view
                network_07
        as
                select n.*
                from
                        t_network as n,
                        t_streets_07 as s
                where
                        st_contains(s.the_geom, n.the_geom);"
$PSQL -c "create or replace view 
		network_08
	as
		select n.*
		from
		 	t_network as n,
		 	t_streets_08 as s
		where 
			st_contains(s.the_geom, n.the_geom);"

echo "Processing separated types of roads"

for i in 0 1 2 3 4 5 6 7 8
do

	$PSQL -c "DROP VIEW routing_restrictions_view_0$i;"

	$PSQL -c "CREATE OR REPLACE VIEW routing_restrictions_view_0$i AS 
 	SELECT 	
		network.id, 
		network.gid, 
		network.the_geom, 
		network.x1, 
		network.y1, 
		network.x2, 
		network.y2, 
		target.id::text AS rule, 
		network.f_jnctid_fk AS source, 
		network.t_jnctid_fk AS target, 
		'Infinity'::double precision AS to_cost, 
        	CASE network.oneway
        	    WHEN 'N'::text THEN 'Infinity'::double precision
        	    WHEN 'TF'::text THEN 'Infinity'::double precision
        	    ELSE network.minutes
        	END AS cost, 
        	CASE network.oneway
        	    WHEN 'N'::text THEN 'Infinity'::double precision
        	    WHEN 'FT'::text THEN 'Infinity'::double precision
        	    ELSE network.minutes
        	END AS reverse_cost,
		network.name as name,
		network.namelc as namelc,
		network.nametyp as nametyp,
		network.rtetyp as rtetyp
   	FROM 	
		network_0$i network, 
		t_network target, 
		t_junctions junction, 
		t_maneuvers man, 
		t_maneuvers_path_index man_path
	WHERE 
		network.f_jnctid_fk = junction.gid 
		AND target.t_jnctid_fk = junction.gid 
		AND man.jnctid = junction.id 
		AND man_path.id = man.id 
		AND junction.feattyp = 4120;"

	$PSQL -c "DROP VIEW routing_norestrictions_view_0$i;"

	$PSQL -c "CREATE OR REPLACE VIEW routing_norestrictions_view_0$i AS
        SELECT
                network.id,
                network.gid,
                network.the_geom,
                network.x1,
                network.y1,
                network.x2,
                network.y2,
                ''::text AS rule,
                network.f_jnctid_fk AS source,
                network.t_jnctid_fk AS target,
                'Infinity'::double precision AS to_cost,
                CASE network.oneway
                    WHEN 'N'::text THEN 'Infinity'::double precision
                    WHEN 'TF'::text THEN 'Infinity'::double precision
                    ELSE network.minutes
                END AS cost,
                CASE network.oneway
                    WHEN 'N'::text THEN 'Infinity'::double precision
                    WHEN 'FT'::text THEN 'Infinity'::double precision
                    ELSE network.minutes
                END AS reverse_cost,
                network.name as name,
                network.namelc as namelc,
                network.nametyp as nametyp,
                network.rtetyp as rtetyp
        FROM
                network_0$i network
        WHERE
		not (exists (select 1 from routing_restrictions_view_0$i restr
				where restr.source = network.f_jnctid_fk and restr.target = network.t_jnctid_fk));"

	$PSQL -c "CREATE TABLE routing_""0$i""_$NOW
	(
	  id serial,
	  former_id numeric(15,0),
	  gid integer,
	  the_geom geometry,
	  x1 double precision,
	  y1 double precision,
	  x2 double precision,
	  y2 double precision,
	  rule text,
	  source integer,
	  target integer,
	  to_cost double precision,
	  cost double precision,
	  reverse_cost double precision,
	  name text DEFAULT 'unknown'::text
	);"

	echo "Generate gist"
	
	$PSQL -c "CREATE INDEX routing_gist_idx_$NOW$i
	  ON routing_""0$i""_$NOW
	  USING gist
	  (the_geom );"
	
	$PSQL -c "ALTER TABLE routing_""0$i""_$NOW CLUSTER ON routing_gist_idx_$NOW$i;"
	
	echo "Generate idx"

	$PSQL -c "CREATE INDEX routing_id_idx_$NOW$i
	  ON routing_""0$i""_$NOW
	  USING btree
	  (id );"
	
	echo "Generate name id"

	$PSQL -c "CREATE INDEX routing_name_idx_$NOW$i
	  ON routing_""0$i""_$NOW
	  USING btree
	  (name );"
	
	echo "Generate rule id"
	
	$PSQL -c "CREATE INDEX routing_rule_idx_$NOW$i
	  ON routing_""0$i""_$NOW
	  USING btree
	  (rule );"
	
	echo "Generate source id"	

	$PSQL -c "CREATE INDEX routing_source_idx_$NOW$i
	  ON routing_""0$i""_$NOW
	  USING btree
	  (source );"

	echo "Generate target id"
	
	$PSQL -c "CREATE INDEX routing_target_idx_$NOW$i
	  ON routing_""0$i""_$NOW
	  USING btree
	  (target);"
	
	echo "Generating routing rows"
	
	echo "Generating restrictions rows"
	
	$PSQL -c "INSERT INTO routing_""0$i""_$NOW
		(SELECT
		  null,
		  id,
		  gid,
		  the_geom,
		  x1,
		  y1,
		  x2,
		  y2,
		  rule,
		  source,
		  target,
		  to_cost,
		  cost,
		  reverse_cost,
		  name 
		from 
			routing_restrictions_view_0$i);"
		
	echo "Generating no restriction rows"
	
	$PSQL -c "INSERT INTO routing_""0$i""_$NOW
        (SELECT 
	  null,
	  id,
          gid,
          the_geom,
          x1,
          y1,
          x2,
          y2,
          rule,
          source,
          target,
          to_cost,
          cost,
          reverse_cost,
          name             
        from 
                routing_norestrictions_view_0$i);"

done

echo "Generating general route table"

$PSQL -c "SELECT INTO routing_$NOW
        (SELECT * from routing_00_$NOW)
	UNION 
        (SELECT * from routing_01_$NOW)
        UNION 
        (SELECT * from routing_02_$NOW)
        UNION 
        (SELECT * from routing_03_$NOW)
        UNION 
        (SELECT * from routing_04_$NOW)
        UNION 
        (SELECT * from routing_05_$NOW)
        UNION 
        (SELECT * from routing_06_$NOW)
        UNION 
        (SELECT * from routing_07_$NOW)
        UNION 
        (SELECT * from routing_08_$NOW);"



echo "Importation successfull."

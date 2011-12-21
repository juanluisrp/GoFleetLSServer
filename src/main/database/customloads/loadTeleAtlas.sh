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
HOST="localhost"
PORT="5432"

min_id=57240000233635

NOW=$(date +%s)

PSQL="psql -U $USERNAME -h $HOST -p $PORT $DATABASE "

echo "Preparing helper views"

for i in 0 1 2 3 4 5 6 7 8
do
    $PSQL -c "CREATE OR REPLACE VIEW network_""$i"" AS 
                 SELECT n.* FROM t_network n, t_streets_0""$i"" s
		 WHERE st_contains(s.the_geom, n.the_geom) 
  		 OR st_intersects(s.the_geom, n.the_geom) AND NOT st_touches(s.the_geom, n.the_geom);"
done

echo "Processing separated types of roads"

for i in 0 1 2 3 4 5 6 7 8
do

	
        $PSQL -c "DROP VIEW routing_norestrictions_view_0""$i"" CASCADE;"
        $PSQL -c "DROP VIEW routing_restrictions_view_0""$i"" CASCADE;"

	$PSQL -c "CREATE OR REPLACE VIEW routing_restrictions_view_0""$i"" AS 
 	SELECT 	""$i""as category,
		network.id - ""$min_id"", 
		network.gid, 
		network.the_geom, 
		network.x1, 
		network.y1, 
		network.x2, 
		network.y2, 
		(target.id - ""$min_id"")::text AS rule, 
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
		network_0""$i"" network, 
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

	$PSQL -c "CREATE OR REPLACE VIEW routing_norestrictions_view_0$i AS
        SELECT  ""$i""as category,
                network.id - ""$min_id"",
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

	$PSQL -c "CREATE OR REPLACE VIEW routing_""$i"" AS (SELECT * from routing_restrictions_view_0""$i"") union all (SELECT * from routing_norestrictions_view_0""$i"");"

done

echo "Generating general route table"

$PSQL -c "SELECT INTO routing_""$NOW""
        (SELECT * from routing_0)
	UNION ALL
        (SELECT * from routing_1)
        UNION ALL
        (SELECT * from routing_2)
        UNION ALL
        (SELECT * from routing_3)
        UNION ALL
        (SELECT * from routing_4)
        UNION ALL
        (SELECT * from routing_5)
        UNION ALL
        (SELECT * from routing_6)
        UNION ALL
        (SELECT * from routing_7)
        UNION ALL
        (SELECT * from routing_8);"

$PSQL -c "create or replace view routing as select * from routing_""$NOW"";"

$PSQL -c "CREATE INDEX routing_gist_idx_""$NOW"" ON routing_""$NOW"" USING gist (the_geom );"

$PSQL -c "ALTER TABLE routing_""$NOW"" CLUSTER ON routing_gist_idx_""$NOW"";"

$PSQL -c "CREATE INDEX routing_name_idx_""$NOW"" ON routing_""$NOW"" USING btree (name );"

$PSQL -c "CREATE INDEX routing_rule_idx_""$NOW"" ON routing_""$NOW"" USING btree (rule );"

$PSQL -c "CREATE INDEX routing_source_idx_""$NOW"" ON routing_""$NOW"" USING btree (source );"

$PSQL -c "CREATE INDEX routing_target_idx ON routing USING btree (target );"

$PSQL -c "vacuum routing_""$NOW"";"

echo "Importation successfull."

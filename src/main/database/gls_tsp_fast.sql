CREATE OR REPLACE FUNCTION hba_(source integer, target integer)
  RETURNS SETOF hba_res AS
$BODY$
  plpy.info("hba_star(", source, target, ")")
  import sys
  sys.path.insert(1, '/usr/share/gofleetls/')
  import hba_star
  res = hba_star.hba_star_pl(source,target)

  for r in res:
    yield(str(r[0]), str(r[1]), str(r[2]), str(r[3]))
  
$BODY$
  LANGUAGE plpythonu VOLATILE
  COST 2000
  ROWS 200;

CREATE OR REPLACE FUNCTION hba(source integer, target integer)
  RETURNS SETOF hba_res AS
$BODY$
DECLARE
  rec RECORD;
  res hba_res%rowtype;
BEGIN
  RETURN query select * from hba_(source,target);
END;
$BODY$
  LANGUAGE plpgsql IMMUTABLE
  COST 2000
  ROWS 200;

CREATE OR REPLACE FUNCTION hba(origin geometry, goal geometry)
  RETURNS SETOF hba_res AS
$BODY$
DECLARE
  rec RECORD;
  res hba_res%rowtype;
  s integer;
  t integer;
BEGIN
  select source into s from routing where cost <> 'Infinity' or reverse_cost <> 'Infinity' order by st_distance(the_geom, origin) asc limit 1;
  select target into t from routing where cost <> 'Infinity' or reverse_cost <> 'Infinity' order by st_distance(the_geom, goal) asc limit 1;
  RETURN QUERY select * from hba(source, target);
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 2000
  ROWS 200;


CREATE OR REPLACE FUNCTION gls_tsp(routingtable text, stoptable_g geometry[], gid text, source_g geometry)
  RETURNS SETOF hba_res AS
$BODY$
DECLARE
        source_ INTEGER;
        t INTEGER := 1;
        i INTEGER := 1;
        stoptable INTEGER[]:='{}';
        r INTEGER;
        BEGIN
		select source into source_ from routing 
			where cost <> 'Infinity' 
			or reverse_cost <> 'Infinity' 
			order by st_distance(the_geom, source_g) asc limit 1;

		-- For each "i" between lower limit and upper limit of array: --
		FOR i IN array_lower(stoptable_g,1) .. array_upper(stoptable_g,1) LOOP
			select target into t from routing 
				where cost <> 'Infinity' 
				or reverse_cost <> 'Infinity' 
				order by st_distance(the_geom, stoptable_g[i]) asc limit 1;
			stopTable := stopTable || t;
		END LOOP;

		RAISE INFO 'select * from gls_tsp(%, %, %, %)', routingTable, stopTable, gid, source_;
		
                RETURN QUERY select * from gls_tsp(routingTable, stopTable, gid, source_);
        END;
$BODY$
  LANGUAGE plpgsql IMMUTABLE
  COST 2000
  ROWS 200;

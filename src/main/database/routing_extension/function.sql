DROP TYPE IF EXISTS hba_res;
CREATE TYPE hba_res AS (id bigint, geom geometry, name text, cost double precision);

CREATE OR REPLACE FUNCTION hba(origin Geometry, goal Geometry)
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
  for rec in select * from hba_(s,t) LOOP
        res.id := rec.hba_[1];
        res.geom := rec.hba_[2];
        res.name := rec.hba_[3];
        res.cost := rec.hba_[4];
        RETURN NEXT res;
  END LOOP;
  RETURN;
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 500
  ROWS 200;


CREATE OR REPLACE FUNCTION hba(source integer, target integer)
  RETURNS SETOF hba_res AS
$BODY$
DECLARE
  rec RECORD;
  res hba_res%rowtype;
BEGIN
  for rec in select * from hba_(source,target) LOOP
	res.id := rec.hba_[1];
	res.geom := rec.hba_[2];
	res.name := rec.hba_[3];
	res.cost := rec.hba_[4];
	RETURN NEXT res;
  END LOOP;
  RETURN;
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100
  ROWS 200;


-- Function: hba_(integer, integer)

-- DROP FUNCTION hba_(integer, integer);

CREATE OR REPLACE FUNCTION hba_(source integer, target integer)
  RETURNS SETOF text[] AS
$BODY$
  plpy.info("hba_star(", source, target, ")")

  import sys
  sys.path.append('/usr/share/gofleetls')
  import hba_star
  
  res = hba_star.hba_star(source,target);

  return ["{" + str(r[0]) + "," + str(r[1]) + "," + str(r[2]) + "," + str(r[3]) + "}" for r in res]
  
$BODY$
  LANGUAGE plpythonu VOLATILE
  COST 1000
  ROWS 200;

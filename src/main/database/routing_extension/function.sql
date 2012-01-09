<<<<<<< HEAD
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
=======
CREATE OR REPLACE FUNCTION hba(origin Geometry, goal Geometry)
>>>>>>> 38c70da8c80cb21c0d0cca3b02cab8ac04cff647
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



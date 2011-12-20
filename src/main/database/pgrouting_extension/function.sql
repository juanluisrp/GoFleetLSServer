CREATE OR REPLACE FUNCTION hba(source integer, target integer)
  RETURNS setof text[] AS
$BODY$
  import sys
  sys.path.append('/usr/share/gofleetls')
  import hba_star
  
  res = hba_star.hba_star(source,target);

  return ["{" + str(r[0]) + "," + str(r[1]) + "," + str(r[2]) + "," + str(r[3]) + "}" for r in res]

$BODY$
  LANGUAGE plpythonu VOLATILE
  COST 1000;

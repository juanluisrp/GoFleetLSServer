DROP FUNCTION gls_tsp(text, integer[], text, integer);
CREATE OR REPLACE FUNCTION gls_tsp(routingtable text, stoptable integer[], gid text, source integer)
  RETURNS setof hba_res AS
$BODY$
DECLARE
        target INTEGER;
        source_ INTEGER;
        r RECORD;
        routingRes INTEGER[]:='{}';
        BEGIN
                RAISE INFO 'gls_tsp(%, %, %, %)', routingTable, stopTable, gid, source;
                source_ := source;
                WHILE NOT(stopTable <@ routingRes) LOOP
                        RAISE INFO 'Looping on %, %', stopTable, routingRes;
                        -- we put in target the next nearest element --
                        SELECT t.id INTO target FROM routing s, routing t
                                WHERE  s.id = source_
                                AND t.id = ANY (stopTable)
                                AND NOT (t.id = ANY (routingres))
                                and s.id <> t.id
                                order by st_distance(t.geometry, s.geometry) asc
                                limit 1;

                        FOR r in SELECT * from hba(source_, target) LOOP
                                routingRes := routingRes || r.id;
                                RAISE INFO 'RoutingRes %', routingRes;
                                RETURN NEXT r;
                        END LOOP;
                        SELECT target INTO source_;
                END LOOP;
        END;
$BODY$
  LANGUAGE plpgsql IMMUTABLE
  COST 2000
  ROWS 200;
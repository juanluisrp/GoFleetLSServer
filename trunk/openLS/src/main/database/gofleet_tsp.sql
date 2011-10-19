DROP FUNCTION IF EXISTS gls_tsp_next(TEXT, INTEGER[], TEXT, INTEGER, INTEGER[]);
DROP FUNCTION if exists gls_tsp(text, integer[], text, integer);

/* Function to find the nearest path */
CREATE FUNCTION gls_tsp_next(routingTable TEXT, stopTable INTEGER[], gid TEXT, source INTEGER, routingRes INTEGER[])
RETURNS INTEGER AS 
$BODY$
DECLARE
	answer INTEGER;
	r INTEGER;
	i INTEGER;
	arrayTemp INTEGER[]:= '{}';
	routingNext DOUBLE PRECISION[][]:= '{}';
	rec RECORD;
	temporalCost NUMERIC;
	res INTEGER;
        BEGIN
            RAISE INFO 'gls_tsp_next(%, %, %, %)', routingTable, stopTable, gid, source; 
	    BEGIN
		i := 1;
		-- For each "i" between lower limit and upper limit of array: --
		FOR i IN array_lower(stopTable,1) .. array_upper(stopTable,1) LOOP
			-- The element of stopTable in "i" position would be different of the source point --
			-- In that case, we put this element in a temporal array --
			IF (stopTable[i] <> source) THEN
				arrayTemp := ARRAY[stopTable[i]];
				-- We check if we haven't took it before (if it isn't contents in routingRes) --
 				IF(NOT(routingRes @> arrayTemp)) THEN
					BEGIN
						-- We look for the nearest distance for each of them --
						FOR rec in select sum(cost) as cost from 
								shortest_path_shooting_star('SELECT ' || gid || ' as id, 
									source, 
									target, 
									cost, 
									reverse_cost,
									x1,
									y1,
									x2,
									y2,
									rule,
									to_cost FROM ' || routingTable, source, stopTable[i]:: integer, false, false) LOOP
							-- We put in an array the stop number and its cost --
							routingNext:= routingNext || ARRAY[ARRAY[stopTable[i], rec.cost]]::DOUBLE PRECISION[];
						END LOOP;
					  EXCEPTION 
						WHEN internal_error THEN 
						RAISE WARNING 'Error calculating route from % to %', source, stopTable[i];
					  END;
				END IF;
			END IF;
		END LOOP;
		temporalCost:= routingNext[1][2];
		res := 1;
                -- We look for in routingNext the lower cost and we take its edge --
		FOR i IN 1 .. array_upper(routingNext, 1) LOOP
			IF(temporalCost <= routingNext[i][2])THEN
				res:=i;
				temporalCost:= routingNext[i][2];
			END IF;
		END LOOP;
		RAISE INFO 'Going to EDGE %', routingNext[res][1];   
                EXCEPTION 
                        WHEN internal_error THEN 
                        RAISE WARNING 'Error calculating next from edge %',source;
                END;
                RETURN routingNext[res][1];		
        END;
$BODY$ 
LANGUAGE 'plpgsql';

--Routing table, Stops table, ID column name, ID source
--The points table contains IDs from the routing table 
--where we need to stop
--Routing table contains all the pgrouting data
CREATE FUNCTION gls_tsp(routingTable TEXT, stopTable INTEGER[], gid TEXT, source INTEGER)
RETURNS TEXT[][] AS 
$BODY$
DECLARE
	target INTEGER;
	done INTEGER;
	max INTEGER;
	source_ INTEGER;
	r RECORD;
	g RECORD;
	i INTEGER;
	routingRes INTEGER[]:='{}';
	res CHARACTER VARYING[][]:='{}';
	geometry CHARACTER VARYING;
        BEGIN
		RAISE INFO 'gls_tsp(%, %, %, %)', routingTable, stopTable, gid, source; 
		source_ := source;	
		WHILE NOT(stopTable <@ routingRes) LOOP
			-- we put in target the next nearest element --
			SELECT * INTO target FROM gls_tsp_next(routingTable, stopTable, gid, source_, routingRes);
			FOR r in SELECT edge_id as edge, "cost" as cost
				from shortest_path_shooting_star('SELECT ' || gid || ' as id,
							source, 
							target, 
							cost, 
							reverse_cost,
							x1,
							y1,
							x2,
							y2,
							rule,
							to_cost FROM ' || routingTable, source_, target, true, true) LOOP
				-- We update routingRes --
				routingRes := routingRes || r.edge;
				FOR g IN EXECUTE ('SELECT st_asText(geometry) as the_geom FROM '||routingTable|| ' where '||r.edge||' = '||routingTable||'.' || gid) LOOP
					geometry:= g.the_geom;
				END LOOP;
				-- We put in res the edge, cost and geometry of the path --
				res := res || ARRAY[ARRAY[r.edge, r.cost, geometry]]::VARCHAR[];
			END LOOP;
			SELECT target INTO source_;
		END LOOP;
		RETURN res;
        END;
$BODY$ 
LANGUAGE 'plpgsql';

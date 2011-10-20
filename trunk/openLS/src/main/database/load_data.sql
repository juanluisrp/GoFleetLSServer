DROP FUNCTION IF EXISTS gofleet_create() CASCADE;

/* Funcion para crear las nuevas tablas con una extension numérica diferente */
CREATE FUNCTION gofleet_create() RETURNS BOOLEAN AS
$BODY$
DECLARE
	suffix numeric;
BEGIN
	SELECT round(extract(epoch from now())*1000) INTO suffix;
	RAISE INFO 'Creating tables with suffix: %',suffix;
	PERFORM gls_createAllTables(suffix::VARCHAR);
	RETURN TRUE;
END;
$BODY$ 
LANGUAGE 'plpgsql';
/* Comandos de inserción de datos en las tablas */
INSERT INTO street_1318928266126 SELECT gid, CASE WHEN st_name IS NULL THEN '' ELSE st_name END, st_GeometryN(the_geom, 1) as geom FROM streets;
INSERT INTO municipality_subdivision_1318928266126 
	SELECT gid, CASE WHEN polygon_nm IS NULL THEN '' ELSE polygon_nm END, the_geom FROM AdminBndy5;
INSERT INTO country_subdivision_1318928266126 
	SELECT gid, CASE WHEN polygon_nm IS NULL THEN '' ELSE polygon_nm END, the_geom FROM AdminBndy2;
INSERT INTO country_1318928266126 
	SELECT 1, 'SPA', ST_Union(the_geom) FROM AdminBndy2;
/* Para la de municipality se cargan todos los datos de las dos tablas con la creacion de una secuencia */
CREATE SEQUENCE id_value START 1;
INSERT INTO municipality_1318928266126 SELECT nextval('id_value'), polygon_nm, the geom FROM AdminBndy3;
INSERT INTO municipality_1318928266126 SELECT nextval('id_value'), polygon_nm, the geom FROM AdminBndy4;

/* Creacion de los índices para cada tabla */
/* STREET */

-- Index: street_area_idx
-- DROP INDEX street_area_idx;
CREATE INDEX street_area_idx
  ON street_1318928266126
  USING btree
  (st_area(geometry));
-- Index: street_geometry_idx
-- DROP INDEX street_geometry_idx;
CREATE INDEX street_geometry_idx
  ON street_1318928266126
  USING gist
  (geometry);
ALTER TABLE street_1318928266126 CLUSTER ON street_geometry_idx;
-- Index: street_id_idx
-- DROP INDEX street_id_idx;
CREATE INDEX street_id_idx
  ON street_1318928266126
  USING btree
  (id);
-- Index: street_name_idx
-- DROP INDEX street_name_idx;
CREATE INDEX street_name_idx
  ON street_1318928266126
  USING btree
  (name);

/* MUNICIPALITY_SUBDIVISION */

-- Index: municipality_subdivision_area_idx
-- DROP INDEX municipality_subdivision_area_idx;
CREATE INDEX municipality_subdivision_area_idx
  ON municipality_subdivision_1318928266126
  USING btree
  (st_area(geometry));
-- Index: municipality_subdivision_geometry_idx
-- DROP INDEX municipality_subdivision_geometry_idx;
CREATE INDEX municipality_subdivision_geometry_idx
  ON municipality_subdivision_1318928266126
  USING gist
  (geometry);
ALTER TABLE municipality_subdivision_1318928266126 CLUSTER ON municipality_subdivision_geometry_idx;
-- Index: municipality_subdivision_id_idx
-- DROP INDEX municipality_subdivision_id_idx;
CREATE INDEX municipality_subdivision_id_idx
  ON municipality_subdivision_1318928266126
  USING btree
  (id);
-- Index: municipality_subdivision_name_idx
-- DROP INDEX municipality_subdivision_name_idx;
CREATE INDEX municipality_subdivision_name_idx
  ON municipality_subdivision_1318928266126
  USING btree
  (name);

/* MUNICIPALITY */

-- Index: municipality_area_idx
-- DROP INDEX municipality_area_idx;
CREATE INDEX municipality_area_idx
  ON municipality_1318928266126
  USING btree
  (st_area(geometry));
-- Index: municipality_geometry_idx
-- DROP INDEX municipality_geometry_idx;
CREATE INDEX municipality_geometry_idx
  ON municipality_1318928266126
  USING gist
  (geometry);
ALTER TABLE municipality_1318928266126 CLUSTER ON municipality_geometry_idx;
-- Index: municipality_id_idx
-- DROP INDEX municipality_id_idx;
CREATE INDEX municipality_id_idx
  ON municipality_1318928266126
  USING btree
  (id);
-- Index: municipality_name_idx
-- DROP INDEX municipality_name_idx;
CREATE INDEX municipality_name_idx
  ON municipality_1318928266126
  USING btree
  (name);

/* COUNTRY_SUBDIVISION */

-- Index: country_subdivision_area_idx
-- DROP INDEX country_subdivision_area_idx;
CREATE INDEX country_subdivision_area_idx
  ON country_subdivision_1318928266126
  USING btree
  (st_area(geometry));
-- Index: country_subdivision_geometry_idx
-- DROP INDEX country_subdivision_geometry_idx;
CREATE INDEX country_subdivision_geometry_idx
  ON country_subdivision_1318928266126
  USING gist
  (geometry);
ALTER TABLE country_subdivision_1318928266126 CLUSTER ON country_subdivision_geometry_idx;
-- Index: country_subdivision_id_idx
-- DROP INDEX country_subdivision_id_idx;
CREATE INDEX country_subdivision_id_idx
  ON country_subdivision_1318928266126
  USING btree
  (id);
-- Index: country_subdivision_name_idx
-- DROP INDEX country_subdivision_name_idx;
CREATE INDEX country_subdivision_name_idx
  ON country_subdivision_1318928266126
  USING btree
  (name);

/* COUNTRY */

-- Index: country_area_idx
-- DROP INDEX country_area_idx;
CREATE INDEX country_area_idx
  ON country_1318928266126
  USING btree
  (st_area(geometry));
-- Index: country_geometry_idx
-- DROP INDEX country_geometry_idx;
CREATE INDEX country_geometry_idx
  ON country_1318928266126
  USING gist
  (geometry);
ALTER TABLE country_1318928266126 CLUSTER ON country_geometry_idx;
-- Index: country_id_idx
-- DROP INDEX country_id_idx;
CREATE INDEX country_id_idx
  ON country_1318928266126
  USING btree
  (id);
-- Index: country_name_idx
-- DROP INDEX country_name_idx;
CREATE INDEX country_name_idx
  ON country_1318928266126
  USING btree
  (name);





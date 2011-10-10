DROP FUNCTION IF EXISTS gls_reverse_geocoding(TEXT) CASCADE;
DROP TYPE IF EXISTS reverse_type;

/* Create an especific type to return */
CREATE TYPE reverse_type AS (
	street text,
	street_distance DOUBLE PRECISION,
	munsub text,
	munsub_distance DOUBLE PRECISION,
	mun text,
	mun_distance DOUBLE PRECISION,
	subcountry text,
	subcountry_distance DOUBLE PRECISION,
	country text,
	country_distance DOUBLE PRECISION
);

/* Function to find an address */
CREATE FUNCTION gls_reverse_geocoding(geometry TEXT)
RETURNS reverse_type AS
$BODY$
DECLARE
	geom GEOMETRY;
	street_text_name TEXT;
	stdist DOUBLE PRECISION;
	mun_sub_text_name TEXT;
	munsubdist DOUBLE PRECISION;
	mun_text_name TEXT;
	mundist DOUBLE PRECISION;
	subcoun_text_name TEXT;
	subcoundist DOUBLE PRECISION;
	country_text_name TEXT;
	coundist DOUBLE PRECISION;
	res reverse_type;
BEGIN
	/* Sacamos la geometria a partir del parametro de entrada */
	geom := ST_GeomFromText(geometry, 4326);
	/* Seleccionamos la calle */
	SELECT name, st_distance(geom, street.geometry) 
	INTO street_text_name, stdist 
	FROM street 
	order by st_distance(geom, street.geometry) 
	asc limit 1;
	/* Seleccionamos la subdivision municipal más cercana */
	SELECT name, st_distance(geom, municipality_subdivision.geometry) 
	INTO mun_sub_text_name, munsubdist 
	FROM municipality_subdivision 
	order by st_distance(geom, municipality_subdivision.geometry) 
	asc limit 1;
	/* Seleccionamos el municipio más cercano */
	SELECT name, st_distance(geom, municipality.geometry) 
	INTO mun_text_name, mundist 
	FROM municipality 
	order by st_distance(geom, municipality.geometry) 
	asc limit 1;
	/* Seleccionamos la subdivision del país mas cercano */
	SELECT name, st_distance(geom, country_subdivision.geometry) 
	INTO subcoun_text_name, subcoundist 
	FROM country_subdivision 
	order by st_distance(geom, country_subdivision.geometry) 
	asc limit 1;
	/* Seleccionamos el país mas cercano */
	SELECT name, st_distance(geom, country.geometry) 
	INTO country_text_name, coundist 
	FROM country 
	order by st_distance(geom, country.geometry) 
	asc limit 1;
	
	RAISE INFO 'Res street: %', street_text_name;
	RAISE INFO 'Res municipality subdivision: %', mun_sub_text_name;
	RAISE INFO 'Res municipality: %', mun_sub_text_name;
	RAISE INFO 'Res country subdivision: %', subcoun_text_name;
	RAISE INFO 'Res country subdivision: %', country_text_name;
	
	/* Actualizamos el resultado con el nombre de la calle */
	res.street := street_text_name;
	res.street_distance := stdist;
	res.munsub := mun_sub_text_name;
	res.munsub_distance := munsubdist;
	res.mun := mun_text_name;
	res.mun_distance := mundist;
	res.subcountry := subcoun_text_name;
	res.subcountry_distance := subcoundist;
	res.country := country_text_name;
	res.country_distance := coundist;
	RETURN res;
END;
$BODY$
LANGUAGE 'plpgsql';
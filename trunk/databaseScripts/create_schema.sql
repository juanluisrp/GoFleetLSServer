-- INIT
\set database_name gofleetls
\set user_name gofleetls
\set password_ gofleetls

;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

DROP USER IF EXISTS :user_name;
CREATE USER :user_name WITH PASSWORD ':password_';
DROP DATABASE IF EXISTS :database_name;
CREATE DATABASE :database_name WITH TEMPLATE = template_postgis ENCODING = 'UTF8' OWNER = :user_name;

\echo 'New database ' :database_name
\connect :database_name 

GRANT SELECT ON geometry_columns TO :user_name;
GRANT INSERT ON geometry_columns TO :user_name;
GRANT UPDATE ON geometry_columns TO :user_name;
GRANT DELETE ON geometry_columns TO :user_name;
GRANT SELECT ON spatial_ref_sys TO :user_name;

\echo 'Connecting to ' :database_name

\connect :database_name :user_name

SET client_encoding = 'UTF8';
SET standard_conforming_strings = off;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET escape_string_warning = off;

-- TABLES

DROP TABLE IF EXISTS configuration;
CREATE TABLE configuration (
    identificador character varying(20) NOT NULL,
    valor character varying,
    updatable boolean DEFAULT false NOT NULL
);
COMMENT ON TABLE configuration IS 'Configuration Table';

--Routing tables

DROP TABLE IF EXISTS routing_template;
CREATE TABLE routing_template (
    id serial,
    the_geom geometry,
    source integer,
    target integer,
    cost double precision DEFAULT (-1) NOT NULL,
    reverse_cost double precision DEFAULT (-1) NOT NULL,
    to_cost double precision,
    rule text,
    name character varying
);
SELECT AddGeometryColumn ('routing_template','geometry',4326, 'LINESTRING',2);

--Geocoding Tables

DROP TABLE IF EXISTS country_template;
CREATE TABLE country_template (
    id serial NOT NULL,
    name character varying(3) NOT NULL
);
SELECT AddGeometryColumn ('country_template','geometry',4326, 'MULTIPOLYGON',2);

DROP TABLE IF EXISTS country_subdivision_template;
CREATE TABLE country_subdivision_template (
    id serial NOT NULL,
    name character varying NOT NULL
);
SELECT AddGeometryColumn ('country_subdivision_template','geometry',4326, 'MULTIPOLYGON',2);

DROP TABLE IF EXISTS municipality_template;
CREATE TABLE municipality_template (
    id serial NOT NULL,
    name character varying NOT NULL
);
SELECT AddGeometryColumn ('municipality_template','geometry',4326, 'MULTIPOLYGON',2);

DROP TABLE IF EXISTS municipality_subdivision_template;
CREATE TABLE municipality_subdivision_template (
    id serial NOT NULL,
    name character varying NOT NULL
);
SELECT AddGeometryColumn ('municipality_subdivision_template','geometry',4326, 'MULTIPOLYGON',2);

DROP TABLE IF EXISTS street_template;
CREATE TABLE street_template (
    id serial NOT NULL,
    name character varying NOT NULL
);
SELECT AddGeometryColumn ('street_template','geometry',4326, 'MULTILINESTRING',2);

DROP TABLE IF EXISTS poi_template;
CREATE TABLE poi_template (
    id serial,
    name character varying
);
SELECT AddGeometryColumn ('poi_template','geometry',4326, 'POINT',2);

DROP TABLE IF EXISTS postal_code_template;
CREATE TABLE postal_code_template (
    id serial,
    code character varying NOT NULL,
    type character varying
);
SELECT AddGeometryColumn ('postal_code_template','geometry',4326, 'MULTIPOLYGON',2);

DROP TABLE IF EXISTS advanced_poi_template;
CREATE TABLE advanced_poi_template (
    id serial,
    key character varying NOT NULL,
    value character varying NOT NULL,
    poi bigint NOT NULL
);

\echo 'GofleetLS database created'
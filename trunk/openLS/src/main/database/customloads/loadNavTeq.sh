#!/bin/sh

SHP_PATH="/var/svn/openls-seneca/trunk/NavteqQ22011_Andalucia/K2AM11100EK2000AAAEX/";
HERE=pwd;

cd $SHP_PATH;

for f in *.shp
do
	shp2pgsql -c -s 4326 -i -I -N skip -D $f | psql -U gofleetls gofleetls
done;

cd $HERE;


#!/bin/sh

#Configuration:
#Customize the following variables with your own environment:
DATABASE="gofleetls"
USERNAME="gofleetls"
HOST="127.0.0.1"
PORT="5432"
SHP_PATH="/var/svn/openls-seneca/trunk/NavteqQ22011_Andalucia/K2AM11100EK2000AAAEX/";


#Shouldn't touch the following code
HERE=pwd;
cd $SHP_PATH;

for f in *.shp
do
	shp2pgsql -c -s 4326 -i -I -N skip -D $f | psql -U $USERNAME $DATABASE -h $HOST -p $PORT
done;

cd $HERE;


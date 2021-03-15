#!/usr/bin/env bash

/wait-for-it.sh pps-db:3306 --strict --quiet --timeout=30 -- echo -e "Waiting for DB to come up..."
mysql -u root -pdbRootPass -hpps-db -e "DROP DATABASE IF EXISTS plans_prices;"
mysql -u root -pdbRootPass -hpps-db -e "CREATE DATABASE IF NOT EXISTS plans_prices;"
tar -xOzf /plans_prices.sql.tar.gz | mysql -u root -pdbRootPass -hpps-db plans_prices

tail -f /dev/null

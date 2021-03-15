#!/usr/bin/env bash

mysql -u root -pdbRootPass -e "CREATE USER IF NOT EXISTS 'dbUser'@'%' IDENTIFIED BY 'dbUserPass'; FLUSH PRIVILEGES;"
mysql -u root -pdbRootPass -e "GRANT ALL PRIVILEGES ON *.* TO 'dbUser'@'%' IDENTIFIED BY 'dbUserPass'; FLUSH PRIVILEGES;"

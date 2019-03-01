#!/bin/sh
mvn clean package && docker build -t com.andriosi.fabio/spa .
docker rm -f spa || true && docker run -d -p 8080:8080 -p 4848:4848 --name spa com.andriosi.fabio/spa 

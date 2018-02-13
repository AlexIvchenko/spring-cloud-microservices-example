#!/bin/bash
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
docker rmi -f `docker images -q`
docker-compose -f docker-compose.yml -f docker-compose.dev.yml up -d --build
echo "Started docker"
docker ps -a

#!/bin/bash

docker stack  deploy -c  docker-stack.yml charon-boot-example

docker service update charon-boot-example_charon-boot-example --force
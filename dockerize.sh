#!/bin/bash

./gradlew
docker build -t fizzbuzz-enterprise-edition .
docker run -it --rm --name fizzbuzz-enterprise-edition fizzbuzz-enterprise-edition

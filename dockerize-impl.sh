#!/bin/bash

function java_build() {
    ./gradlew
}

function docker_build() {
    docker build \
        --tag enterprisequalitycoding/fizzbuzz-enterprise-edition \
        .
}

function docker_run() {
    docker run \
        --interactive \
        --tty \
        --rm \
        --name fizzbuzz-enterprise-edition \
        enterprisequalitycoding/fizzbuzz-enterprise-edition
}

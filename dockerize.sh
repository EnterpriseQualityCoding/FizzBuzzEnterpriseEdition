#!/bin/bash

set -ueo pipefail

function java_build() {
    echo "Not Implemented"
    exit 1
}

function docker_build() {
    echo "Not Implemented"
    exit 1
}

function docker_run() {
    echo "Not Implemented"
    exit 1
}

. dockerize-impl.sh

java_build
docker_build
docker_run

#!/bin/bash
JAVA_DIR=~/IdeaProjects/WorldQLClient/src/main/java
CPP_DIR=~/CLionProjects/WorldQLServer/compiled_protobuf

flatc --java -I flatbuffer -o $JAVA_DIR flatbuffer/WorldQLFB.fbs
flatc --cpp -I flatbuffer -o $CPP_DIR flatbuffer/WorldQLFB.fbs

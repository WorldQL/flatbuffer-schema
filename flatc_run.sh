#!/usr/bin/env bash
rm -rf ./generated

flatc --java -I flatbuffer -o ./generated/java flatbuffer/WorldQLFB.fbs
flatc --cpp -I flatbuffer -o ./generated/cpp flatbuffer/WorldQLFB.fbs
flatc --rust -I flatbuffer -o ./generated/rust flatbuffer/WorldQLFB.fbs
flatc --ts --gen-object-api -I flatbuffer -o ./generated/ts flatbuffer/WorldQLFB.fbs

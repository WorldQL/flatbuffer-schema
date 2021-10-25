

flatc --java -I flatbuffer -o ./generated_java flatbuffer/WorldQLFB.fbs
flatc --cpp -I flatbuffer -o ./generated_cpp flatbuffer/WorldQLFB.fbs
flatc --rust -I flatbuffer -o ./generated_rust flatbuffer/WorldQLFB.fbs
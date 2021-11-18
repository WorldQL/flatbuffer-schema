// automatically generated by the FlatBuffers compiler, do not modify

package WorldqlFb.Messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Message extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static Message getRootAsMessage(ByteBuffer _bb) { return getRootAsMessage(_bb, new Message()); }
  public static Message getRootAsMessage(ByteBuffer _bb, Message obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Message __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int instruction() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public String parameter() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer parameterAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer parameterInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String senderUuid() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer senderUuidAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer senderUuidInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public String worldName() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer worldNameAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer worldNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public int replication() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public WorldqlFb.Messages.Record records(int j) { return records(new WorldqlFb.Messages.Record(), j); }
  public WorldqlFb.Messages.Record records(WorldqlFb.Messages.Record obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int recordsLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public WorldqlFb.Messages.Record.Vector recordsVector() { return recordsVector(new WorldqlFb.Messages.Record.Vector()); }
  public WorldqlFb.Messages.Record.Vector recordsVector(WorldqlFb.Messages.Record.Vector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public WorldqlFb.Messages.Entity entities(int j) { return entities(new WorldqlFb.Messages.Entity(), j); }
  public WorldqlFb.Messages.Entity entities(WorldqlFb.Messages.Entity obj, int j) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int entitiesLength() { int o = __offset(16); return o != 0 ? __vector_len(o) : 0; }
  public WorldqlFb.Messages.Entity.Vector entitiesVector() { return entitiesVector(new WorldqlFb.Messages.Entity.Vector()); }
  public WorldqlFb.Messages.Entity.Vector entitiesVector(WorldqlFb.Messages.Entity.Vector obj) { int o = __offset(16); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public WorldqlFb.Messages.Vec3d position() { return position(new WorldqlFb.Messages.Vec3d()); }
  public WorldqlFb.Messages.Vec3d position(WorldqlFb.Messages.Vec3d obj) { int o = __offset(18); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public int flex(int j) { int o = __offset(20); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int flexLength() { int o = __offset(20); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector flexVector() { return flexVector(new ByteVector()); }
  public ByteVector flexVector(ByteVector obj) { int o = __offset(20); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer flexAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public ByteBuffer flexInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 1); }

  public static void startMessage(FlatBufferBuilder builder) { builder.startTable(9); }
  public static void addInstruction(FlatBufferBuilder builder, int instruction) { builder.addByte(0, (byte)instruction, (byte)0); }
  public static void addParameter(FlatBufferBuilder builder, int parameterOffset) { builder.addOffset(1, parameterOffset, 0); }
  public static void addSenderUuid(FlatBufferBuilder builder, int senderUuidOffset) { builder.addOffset(2, senderUuidOffset, 0); }
  public static void addWorldName(FlatBufferBuilder builder, int worldNameOffset) { builder.addOffset(3, worldNameOffset, 0); }
  public static void addReplication(FlatBufferBuilder builder, int replication) { builder.addByte(4, (byte)replication, (byte)0); }
  public static void addRecords(FlatBufferBuilder builder, int recordsOffset) { builder.addOffset(5, recordsOffset, 0); }
  public static int createRecordsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startRecordsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addEntities(FlatBufferBuilder builder, int entitiesOffset) { builder.addOffset(6, entitiesOffset, 0); }
  public static int createEntitiesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startEntitiesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addPosition(FlatBufferBuilder builder, int positionOffset) { builder.addStruct(7, positionOffset, 0); }
  public static void addFlex(FlatBufferBuilder builder, int flexOffset) { builder.addOffset(8, flexOffset, 0); }
  public static int createFlexVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createFlexVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startFlexVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endMessage(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishMessageBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedMessageBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Message get(int j) { return get(new Message(), j); }
    public Message get(Message obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}


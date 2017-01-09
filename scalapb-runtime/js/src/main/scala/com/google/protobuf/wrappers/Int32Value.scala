// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers



/** Wrapper message for `int32`.
  *
  * The JSON representation for `Int32Value` is JSON number.
  *
  * @param value
  *   The int32 value.
  */
@SerialVersionUID(0L)
final case class Int32Value(
    value: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Int32Value] with com.trueaccord.lenses.Updatable[Int32Value] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (value != 0) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, value) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = value
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.Int32Value = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __value = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.Int32Value(
          value = __value
      )
    }
    def withValue(__v: Int): Int32Value = copy(value = __v)
    def getField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = value
          if (__t != 0) __t else null
        }
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.Int32Value
}

object Int32Value extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.Int32Value] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.Int32Value] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.wrappers.Int32Value = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.wrappers.Int32Value(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int]
    )
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = WrappersProto.javaDescriptor.getMessageTypes.get(4)
  def messageCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.wrappers.Int32Value(
  )
  implicit class Int32ValueLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.wrappers.Int32Value]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.wrappers.Int32Value](_l) {
    def value: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
}
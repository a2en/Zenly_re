package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.PingProto$GroupMemberMetadataOrBuilder */
public interface PingProto$GroupMemberMetadataOrBuilder extends MessageLiteOrBuilder {
    long getBolt();

    Timestamp getLastBoltAt();

    Timestamp getMuteUntil();

    boolean getMuteUntilComeBack();

    String getNickname();

    ByteString getNicknameBytes();

    boolean hasLastBoltAt();

    boolean hasMuteUntil();
}

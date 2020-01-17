package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.core.ReloginProto$ReloginStateOrBuilder */
public interface ReloginProto$ReloginStateOrBuilder extends MessageLiteOrBuilder {
    Timestamp getLastUsed();

    String getSessionUuid();

    ByteString getSessionUuidBytes();

    UserProto$User getUser();

    boolean hasLastUsed();

    boolean hasUser();
}

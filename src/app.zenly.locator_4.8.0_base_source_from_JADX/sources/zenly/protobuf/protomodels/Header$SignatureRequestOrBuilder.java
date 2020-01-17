package zenly.protobuf.protomodels;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

public interface Header$SignatureRequestOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    String getMethod();

    ByteString getMethodBytes();

    ByteString getPayload();

    String getSessionUuid();

    ByteString getSessionUuidBytes();

    boolean hasCreatedAt();
}

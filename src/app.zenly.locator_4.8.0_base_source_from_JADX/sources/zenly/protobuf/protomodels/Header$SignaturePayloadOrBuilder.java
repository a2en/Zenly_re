package zenly.protobuf.protomodels;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

public interface Header$SignaturePayloadOrBuilder extends MessageLiteOrBuilder {
    C13835a getCipher();

    int getCipherValue();

    Timestamp getCreatedAt();

    ByteString getSignature();

    boolean hasCreatedAt();
}

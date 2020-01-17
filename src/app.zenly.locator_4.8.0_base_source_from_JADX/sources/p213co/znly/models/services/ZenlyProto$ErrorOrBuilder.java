package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.C8026d2.C8028b;

/* renamed from: co.znly.models.services.ZenlyProto$ErrorOrBuilder */
public interface ZenlyProto$ErrorOrBuilder extends MessageLiteOrBuilder {
    C8028b getCode();

    int getCodeValue();

    String getMessage();

    ByteString getMessageBytes();
}

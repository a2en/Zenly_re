package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$ConfigurationRequestOrBuilder */
public interface ZenlyProto$ConfigurationRequestOrBuilder extends MessageLiteOrBuilder {
    String getAndroidVersion();

    ByteString getAndroidVersionBytes();

    String getCoreVersion();

    ByteString getCoreVersionBytes();

    String getIosVersion();

    ByteString getIosVersionBytes();
}

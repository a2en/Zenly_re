package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.ConfigurationProto$Configuration;

/* renamed from: co.znly.models.services.ZenlyProto$ConfigurationResponseOrBuilder */
public interface ZenlyProto$ConfigurationResponseOrBuilder extends MessageLiteOrBuilder {
    ConfigurationProto$Configuration getConfiguration();

    String getMinAndroidVersion();

    ByteString getMinAndroidVersionBytes();

    String getMinCoreVersion();

    ByteString getMinCoreVersionBytes();

    String getMinIosVersion();

    ByteString getMinIosVersionBytes();

    boolean getUpgrade();

    String getUpgradeUrl();

    ByteString getUpgradeUrlBytes();

    boolean hasConfiguration();
}

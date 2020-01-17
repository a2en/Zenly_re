package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7486v;

/* renamed from: co.znly.models.services.ZenlyProto$KeyPairGenerateRequestOrBuilder */
public interface ZenlyProto$KeyPairGenerateRequestOrBuilder extends MessageLiteOrBuilder {
    String getAppBundle();

    ByteString getAppBundleBytes();

    String getAppFlavor();

    ByteString getAppFlavorBytes();

    String getAppVersion();

    ByteString getAppVersionBytes();

    ByteString getBoxPublicKey();

    String getDeviceOsUuid();

    ByteString getDeviceOsUuidBytes();

    String getPushToken();

    ByteString getPushTokenBytes();

    C7486v getType();

    int getTypeValue();
}

package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.DeviceProto$DeviceInfoOrBuilder */
public interface DeviceProto$DeviceInfoOrBuilder extends MessageLiteOrBuilder {
    String getAcceptLanguages();

    ByteString getAcceptLanguagesBytes();

    String getAppBundle();

    ByteString getAppBundleBytes();

    String getAppFlavor();

    ByteString getAppFlavorBytes();

    String getAppVersion();

    ByteString getAppVersionBytes();

    String getCoreVersion();

    ByteString getCoreVersionBytes();

    String getModel();

    ByteString getModelBytes();

    String getOsVersion();

    ByteString getOsVersionBytes();

    C7486v getType();

    int getTypeValue();
}

package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7458s.C7460b;

/* renamed from: co.znly.models.DeviceProto$DeviceOrBuilder */
public interface DeviceProto$DeviceOrBuilder extends MessageLiteOrBuilder {
    String getAdvertisingId();

    ByteString getAdvertisingIdBytes();

    String getAppBundle();

    ByteString getAppBundleBytes();

    String getAppFlavor();

    ByteString getAppFlavorBytes();

    String getAppVersion();

    ByteString getAppVersionBytes();

    String getAppsflyerId();

    ByteString getAppsflyerIdBytes();

    C7450r getContactsAuthorizationStatus();

    int getContactsAuthorizationStatusValue();

    String getCoreVersion();

    ByteString getCoreVersionBytes();

    Timestamp getCreatedAt();

    String getLocale();

    ByteString getLocaleBytes();

    C7450r getLocationAuthorizationStatus();

    int getLocationAuthorizationStatusValue();

    String getModel();

    ByteString getModelBytes();

    String getOsUuid();

    ByteString getOsUuidBytes();

    String getOsVersion();

    ByteString getOsVersionBytes();

    Duration getPingInterval();

    C7450r getPushAuthorizationStatus();

    int getPushAuthorizationStatusValue();

    String getPushToken();

    ByteString getPushTokenBytes();

    String getPushkitToken();

    ByteString getPushkitTokenBytes();

    Duration getReachableTimeout();

    C7460b getTamperState();

    int getTamperStateValue();

    C7486v getType();

    int getTypeValue();

    Timestamp getUpdatedAt();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    C7478u getZenlyStatus();

    int getZenlyStatusValue();

    boolean hasCreatedAt();

    boolean hasPingInterval();

    boolean hasReachableTimeout();

    boolean hasUpdatedAt();
}

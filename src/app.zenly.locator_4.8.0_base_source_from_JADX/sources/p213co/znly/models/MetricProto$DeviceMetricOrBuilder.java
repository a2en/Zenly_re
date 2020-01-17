package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.MetricProto$DeviceMetricOrBuilder */
public interface MetricProto$DeviceMetricOrBuilder extends MessageLiteOrBuilder {
    String getAppVersion();

    ByteString getAppVersionBytes();

    String getCoreVersion();

    ByteString getCoreVersionBytes();

    long getCorrelationId();

    Timestamp getCreatedAt();

    String getDeviceUuid();

    ByteString getDeviceUuidBytes();

    C7445q0 getLifecycle();

    int getLifecycleValue();

    C7473t0 getMetricFamily();

    long getOffset();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasCreatedAt();

    boolean hasMetricFamily();
}

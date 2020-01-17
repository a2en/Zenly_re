package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.MetricProto$DeviceMetricFlatOrBuilder */
public interface MetricProto$DeviceMetricFlatOrBuilder extends MessageLiteOrBuilder {
    String getAppBundle();

    ByteString getAppBundleBytes();

    String getAppVersion();

    ByteString getAppVersionBytes();

    double getBatteryCharge();

    String getBatteryStatus();

    ByteString getBatteryStatusBytes();

    String getCoreVersion();

    ByteString getCoreVersionBytes();

    long getCorrelationId();

    Timestamp getCreatedAt();

    String getDeviceUuid();

    ByteString getDeviceUuidBytes();

    int getGoGoroutines();

    int getGpsUsage();

    int getGrpcConns();

    C7445q0 getLifecycle();

    int getLifecycleValue();

    String getNetworkConnectivity();

    ByteString getNetworkConnectivityBytes();

    long getOffset();

    int getRusageCpuCores();

    long getRusageCpuSystimeUs();

    long getRusageCpuUsertimeUs();

    long getRusageCtxSwInvol();

    long getRusageCtxSwVol();

    long getRusageMemIdRss();

    long getRusageMemIsRss();

    long getRusageMemIxRss();

    long getRusageMemMaxRss();

    long getRusageMemSwaps();

    C7429o0 getUnaryCallLatency();

    double getUptimeSeconds();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasCreatedAt();

    boolean hasUnaryCallLatency();
}

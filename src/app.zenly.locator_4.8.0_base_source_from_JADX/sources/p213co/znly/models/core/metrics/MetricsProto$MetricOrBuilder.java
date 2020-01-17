package p213co.znly.models.core.metrics;

import java.util.Map;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.core.metrics.C7164b.C7167c;

/* renamed from: co.znly.models.core.metrics.MetricsProto$MetricOrBuilder */
public interface MetricsProto$MetricOrBuilder extends MessageLiteOrBuilder {
    boolean containsMeta(String str);

    float getFloat();

    long getInt();

    String getKey();

    ByteString getKeyBytes();

    @Deprecated
    Map<String, String> getMeta();

    int getMetaCount();

    Map<String, String> getMetaMap();

    String getMetaOrDefault(String str, String str2);

    String getMetaOrThrow(String str);

    C7167c getValueCase();
}

package p213co.znly.models.core.metrics;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.metrics.MetricsProto$MetricsSnapshotOrBuilder */
public interface MetricsProto$MetricsSnapshotOrBuilder extends MessageLiteOrBuilder {
    C7164b getMetrics(int i);

    int getMetricsCount();

    List<C7164b> getMetricsList();

    Timestamp getTime();

    boolean hasTime();
}

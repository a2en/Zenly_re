package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.MetricProto$SummaryOrBuilder */
public interface MetricProto$SummaryOrBuilder extends MessageLiteOrBuilder {
    C7488v0 getQuantile(int i);

    int getQuantileCount();

    List<C7488v0> getQuantileList();

    long getSampleCount();

    double getSampleSum();
}

package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.MetricProto$HistogramOrBuilder */
public interface MetricProto$HistogramOrBuilder extends MessageLiteOrBuilder {
    C7381l0 getBucket(int i);

    int getBucketCount();

    List<C7381l0> getBucketList();

    long getSampleCount();

    double getSampleSum();
}

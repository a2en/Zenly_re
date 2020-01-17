package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.MetricProto$MetricOrBuilder */
public interface MetricProto$MetricOrBuilder extends MessageLiteOrBuilder {
    C7389m0 getCounter();

    C7398n0 getGauge();

    C7429o0 getHistogram();

    C7438p0 getLabel(int i);

    int getLabelCount();

    List<C7438p0> getLabelList();

    C7496w0 getSummary();

    long getTimestampMs();

    C7504x0 getUntyped();

    boolean hasCounter();

    boolean hasGauge();

    boolean hasHistogram();

    boolean hasSummary();

    boolean hasUntyped();
}

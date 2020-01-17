package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.MetricProto$MetricFamilyOrBuilder */
public interface MetricProto$MetricFamilyOrBuilder extends MessageLiteOrBuilder {
    String getHelp();

    ByteString getHelpBytes();

    C7462s0 getMetric(int i);

    int getMetricCount();

    List<C7462s0> getMetricList();

    String getName();

    ByteString getNameBytes();

    C7480u0 getType();

    int getTypeValue();
}

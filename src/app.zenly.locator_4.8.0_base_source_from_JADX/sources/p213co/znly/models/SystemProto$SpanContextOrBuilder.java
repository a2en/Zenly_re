package p213co.znly.models;

import java.util.Map;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.SystemProto$SpanContextOrBuilder */
public interface SystemProto$SpanContextOrBuilder extends MessageLiteOrBuilder {
    boolean containsBaggage(String str);

    @Deprecated
    Map<String, String> getBaggage();

    int getBaggageCount();

    Map<String, String> getBaggageMap();

    String getBaggageOrDefault(String str, String str2);

    String getBaggageOrThrow(String str);

    long getFlags();

    long getParentSpanId();

    boolean getSampled();

    long getSpanId();

    long getTraceId();

    ByteString getTraceIdBinary();
}

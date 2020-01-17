package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.TypesProto$InvokerProtoOrBuilder */
public interface TypesProto$InvokerProtoOrBuilder extends MessageLiteOrBuilder {
    String getCorrelationId();

    ByteString getCorrelationIdBytes();

    String getMethod();

    ByteString getMethodBytes();

    ByteString getRequestBytes();
}

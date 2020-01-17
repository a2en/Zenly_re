package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.SystemProto$Span;

/* renamed from: co.znly.models.services.ZenlyProto$TracingSendRequestOrBuilder */
public interface ZenlyProto$TracingSendRequestOrBuilder extends MessageLiteOrBuilder {
    SystemProto$Span getSpans(int i);

    int getSpansCount();

    List<SystemProto$Span> getSpansList();
}

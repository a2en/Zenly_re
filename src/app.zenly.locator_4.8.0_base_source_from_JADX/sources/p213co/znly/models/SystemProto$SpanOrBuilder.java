package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.SystemProto$Span.C6860b;
import p213co.znly.models.SystemProto$Span.C6862c;

/* renamed from: co.znly.models.SystemProto$SpanOrBuilder */
public interface SystemProto$SpanOrBuilder extends MessageLiteOrBuilder {
    C7468s2 getContext();

    Duration getDuration();

    C6860b getLogs(int i);

    int getLogsCount();

    List<C6860b> getLogsList();

    String getOperation();

    ByteString getOperationBytes();

    Timestamp getStart();

    C6862c getTags(int i);

    int getTagsCount();

    List<C6862c> getTagsList();

    boolean hasContext();

    boolean hasDuration();

    boolean hasStart();
}

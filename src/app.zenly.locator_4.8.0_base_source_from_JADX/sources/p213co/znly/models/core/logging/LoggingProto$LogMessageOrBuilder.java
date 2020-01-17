package p213co.znly.models.core.logging;

import java.util.Map;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.core.logging.C7151b.C7154c;

/* renamed from: co.znly.models.core.logging.LoggingProto$LogMessageOrBuilder */
public interface LoggingProto$LogMessageOrBuilder extends MessageLiteOrBuilder {
    boolean containsFields(String str);

    @Deprecated
    Map<String, String> getFields();

    int getFieldsCount();

    Map<String, String> getFieldsMap();

    String getFieldsOrDefault(String str, String str2);

    String getFieldsOrThrow(String str);

    C7154c getLevel();

    int getLevelValue();

    String getMessage();

    ByteString getMessageBytes();

    Timestamp getTime();

    boolean hasTime();
}

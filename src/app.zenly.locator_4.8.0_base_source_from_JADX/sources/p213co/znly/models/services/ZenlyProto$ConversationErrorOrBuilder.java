package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.C8347w1.C8349b;

/* renamed from: co.znly.models.services.ZenlyProto$ConversationErrorOrBuilder */
public interface ZenlyProto$ConversationErrorOrBuilder extends MessageLiteOrBuilder {
    C8349b getCode();

    int getCodeValue();

    String getUserUUIDs(int i);

    ByteString getUserUUIDsBytes(int i);

    int getUserUUIDsCount();

    List<String> getUserUUIDsList();
}

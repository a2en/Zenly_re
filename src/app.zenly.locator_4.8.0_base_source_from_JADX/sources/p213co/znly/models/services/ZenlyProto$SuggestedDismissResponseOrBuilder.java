package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$SuggestedDismissResponseOrBuilder */
public interface ZenlyProto$SuggestedDismissResponseOrBuilder extends MessageLiteOrBuilder {
    C8359w4 getError();

    String getErrorMessages(int i);

    ByteString getErrorMessagesBytes(int i);

    int getErrorMessagesCount();

    List<String> getErrorMessagesList();

    boolean hasError();
}

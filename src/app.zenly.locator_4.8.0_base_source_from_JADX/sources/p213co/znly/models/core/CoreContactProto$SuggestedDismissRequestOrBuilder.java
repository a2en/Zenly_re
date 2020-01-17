package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.CoreContactProto$SuggestedDismissRequestOrBuilder */
public interface CoreContactProto$SuggestedDismissRequestOrBuilder extends MessageLiteOrBuilder {
    String getContactUuids(int i);

    ByteString getContactUuidsBytes(int i);

    int getContactUuidsCount();

    List<String> getContactUuidsList();

    String getUserUuids(int i);

    ByteString getUserUuidsBytes(int i);

    int getUserUuidsCount();

    List<String> getUserUuidsList();
}

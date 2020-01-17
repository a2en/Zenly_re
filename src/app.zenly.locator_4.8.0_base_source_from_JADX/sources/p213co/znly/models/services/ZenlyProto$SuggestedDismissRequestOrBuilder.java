package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$SuggestedDismissRequestOrBuilder */
public interface ZenlyProto$SuggestedDismissRequestOrBuilder extends MessageLiteOrBuilder {
    String getPhoneNumbers(int i);

    ByteString getPhoneNumbersBytes(int i);

    int getPhoneNumbersCount();

    List<String> getPhoneNumbersList();

    String getUserUuids(int i);

    ByteString getUserUuidsBytes(int i);

    int getUserUuidsCount();

    List<String> getUserUuidsList();
}

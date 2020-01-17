package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.ContactProto$PhoneNumberListOrBuilder */
public interface ContactProto$PhoneNumberListOrBuilder extends MessageLiteOrBuilder {
    String getPhoneNumbers(int i);

    ByteString getPhoneNumbersBytes(int i);

    int getPhoneNumbersCount();

    List<String> getPhoneNumbersList();
}

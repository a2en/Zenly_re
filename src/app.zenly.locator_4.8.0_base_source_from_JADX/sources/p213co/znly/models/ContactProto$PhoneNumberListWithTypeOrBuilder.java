package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.ContactProto$PhoneNumberListWithTypeOrBuilder */
public interface ContactProto$PhoneNumberListWithTypeOrBuilder extends MessageLiteOrBuilder {
    String getDeprecatedPhoneNumbers(int i);

    ByteString getDeprecatedPhoneNumbersBytes(int i);

    int getDeprecatedPhoneNumbersCount();

    List<String> getDeprecatedPhoneNumbersList();

    C7377l getPhoneNumbers(int i);

    int getPhoneNumbersCount();

    List<C7377l> getPhoneNumbersList();
}

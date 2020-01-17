package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.ContactProto$ContactOrBuilder */
public interface ContactProto$ContactOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    String getDeviceContactId();

    ByteString getDeviceContactIdBytes();

    String getDeviceUuid();

    ByteString getDeviceUuidBytes();

    String getFirst();

    ByteString getFirstBytes();

    String getFull();

    ByteString getFullBytes();

    boolean getHidden();

    String getLast();

    ByteString getLastBytes();

    String getMiddle();

    ByteString getMiddleBytes();

    String getPhoneNumbers(int i);

    ByteString getPhoneNumbersBytes(int i);

    int getPhoneNumbersCount();

    List<String> getPhoneNumbersList();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();
}

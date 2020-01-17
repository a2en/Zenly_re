package p213co.znly.models.verify;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.verify.AuthenticationProto$AuthenticationOrBuilder */
public interface AuthenticationProto$AuthenticationOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    ByteString getData();

    String getDataType();

    ByteString getDataTypeBytes();

    String getPhoneNumber();

    ByteString getPhoneNumberBytes();

    C8447a getType();

    int getTypeValue();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();
}

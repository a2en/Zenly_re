package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.UserProto$UsernameIngestResponseOrBuilder */
public interface UserProto$UsernameIngestResponseOrBuilder extends MessageLiteOrBuilder {
    boolean getAcquired();

    C7368j3 getErrorCode();

    int getErrorCodeValue();

    String getErrorMessage();

    ByteString getErrorMessageBytes();
}

package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.UploadProto$UploadTaskStatusOrBuilder */
public interface UploadProto$UploadTaskStatusOrBuilder extends MessageLiteOrBuilder {
    String getError();

    ByteString getErrorBytes();

    C7064b3 getState();

    int getStateValue();

    int getStatusCode();

    boolean getSuccess();

    long getTaskId();

    String getUuid();

    ByteString getUuidBytes();
}

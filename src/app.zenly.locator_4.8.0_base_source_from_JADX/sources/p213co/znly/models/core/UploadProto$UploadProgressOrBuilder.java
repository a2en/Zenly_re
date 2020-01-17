package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.UploadProto$UploadProgressOrBuilder */
public interface UploadProto$UploadProgressOrBuilder extends MessageLiteOrBuilder {
    C7268z2 getProgress();

    long getTaskId();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasProgress();
}

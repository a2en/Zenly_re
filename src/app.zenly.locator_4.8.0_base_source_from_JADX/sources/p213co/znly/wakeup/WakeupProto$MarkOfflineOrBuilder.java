package p213co.znly.wakeup;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7458s;

/* renamed from: co.znly.wakeup.WakeupProto$MarkOfflineOrBuilder */
public interface WakeupProto$MarkOfflineOrBuilder extends MessageLiteOrBuilder {
    C7458s getDevice();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasDevice();
}

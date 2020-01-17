package p213co.znly.wakeup;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7458s;

/* renamed from: co.znly.wakeup.WakeupProto$SendWakeupOrBuilder */
public interface WakeupProto$SendWakeupOrBuilder extends MessageLiteOrBuilder {
    C7458s getDevice();

    C8459c getMetadata();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasDevice();

    boolean hasMetadata();
}

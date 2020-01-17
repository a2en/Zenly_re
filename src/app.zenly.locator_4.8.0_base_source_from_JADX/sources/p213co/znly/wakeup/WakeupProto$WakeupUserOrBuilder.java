package p213co.znly.wakeup;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7458s;

/* renamed from: co.znly.wakeup.WakeupProto$WakeupUserOrBuilder */
public interface WakeupProto$WakeupUserOrBuilder extends MessageLiteOrBuilder {
    C7458s getDevice();

    C8459c getMetadata();

    String getReplyTo();

    ByteString getReplyToBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasDevice();

    boolean hasMetadata();
}

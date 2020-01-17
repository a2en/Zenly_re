package p213co.znly.models.bubble;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.bubble.BubbleProto$BubbleIcon.C6963b;
import p213co.znly.models.bubble.BubbleProto$BubbleIcon.C6964c;
import p213co.znly.models.bubble.BubbleProto$BubbleIcon.C6966d;
import p213co.znly.models.bubble.BubbleProto$BubbleIcon.C6968e;

/* renamed from: co.znly.models.bubble.BubbleProto$BubbleIconOrBuilder */
public interface BubbleProto$BubbleIconOrBuilder extends MessageLiteOrBuilder {
    C6963b getContentCase();

    Timestamp getCreatedAt();

    C6964c getEmoji();

    C6966d getImage();

    C6968e getText();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();
}

package p213co.znly.models.bubble;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7272d0;

/* renamed from: co.znly.models.bubble.BubbleProto$BubbleOrBuilder */
public interface BubbleProto$BubbleOrBuilder extends MessageLiteOrBuilder {
    String getBadgeUrl();

    ByteString getBadgeUrlBytes();

    C7272d0 getBoundingBox();

    String getBubbleId();

    ByteString getBubbleIdBytes();

    String getBubbleName();

    ByteString getBubbleNameBytes();

    Timestamp getCreatedAt();

    BubbleProto$BubbleIcon getIcons(int i);

    int getIconsCount();

    List<BubbleProto$BubbleIcon> getIconsList();

    String getTcUuid();

    ByteString getTcUuidBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasBoundingBox();

    boolean hasCreatedAt();
}

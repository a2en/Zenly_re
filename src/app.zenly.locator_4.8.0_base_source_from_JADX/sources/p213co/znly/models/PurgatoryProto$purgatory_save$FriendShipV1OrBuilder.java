package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.PurgatoryProto$purgatory_save$FriendShipV1OrBuilder */
public interface PurgatoryProto$purgatory_save$FriendShipV1OrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    String getFriendRequestUuid();

    ByteString getFriendRequestUuidBytes();

    C7492v2 getGhostedType();

    int getGhostedTypeValue();

    Timestamp getGhostedUntil();

    TrackingContextProto$TrackingContext getLastTrackingContexts(int i);

    int getLastTrackingContextsCount();

    List<TrackingContextProto$TrackingContext> getLastTrackingContextsList();

    C7492v2 getRemoteGhostType();

    int getRemoteGhostTypeValue();

    Timestamp getRemoteGhostUntil();

    Timestamp getUpdatedAt();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();

    boolean hasGhostedUntil();

    boolean hasRemoteGhostUntil();

    boolean hasUpdatedAt();
}

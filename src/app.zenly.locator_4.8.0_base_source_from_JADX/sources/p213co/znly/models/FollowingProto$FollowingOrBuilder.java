package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.FollowingProto$FollowingOrBuilder */
public interface FollowingProto$FollowingOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    String getFrom();

    ByteString getFromBytes();

    C7494w getGhostType();

    int getGhostTypeValue();

    Timestamp getGhostUntil();

    Timestamp getGhostedUntil();

    TrackingContextProto$TrackingContext getLastTrackingContexts(int i);

    int getLastTrackingContextsCount();

    List<TrackingContextProto$TrackingContext> getLastTrackingContextsList();

    C7502x getNotificationSettings();

    int getNotificationSettingsValue();

    int getPosition();

    C7494w getRemoteGhostType();

    int getRemoteGhostTypeValue();

    String getTo();

    ByteString getToBytes();

    boolean hasCreatedAt();

    boolean hasGhostUntil();

    boolean hasGhostedUntil();
}

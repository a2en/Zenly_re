package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6810b;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.FriendRequestProto$FriendRequest.Origin;

/* renamed from: co.znly.models.FriendRequestProto$FriendRequestOrBuilder */
public interface FriendRequestProto$FriendRequestOrBuilder extends MessageLiteOrBuilder {
    String getAuthorName();

    ByteString getAuthorNameBytes();

    String getAuthorPhoneNumber();

    ByteString getAuthorPhoneNumberBytes();

    String getAuthorUuid();

    ByteString getAuthorUuidBytes();

    Timestamp getCreatedAt();

    boolean getIsAuthorFirstInvite();

    boolean getIsDeleted();

    Origin getOrigin();

    C6950b0 getOriginatedFrom();

    Timestamp getSentAt9(int i);

    int getSentAt9Count();

    List<Timestamp> getSentAt9List();

    int getSentAtCount10();

    C6810b getSource();

    int getSourceValue();

    C6812c getStatus();

    int getStatusValue();

    boolean getTargetExists();

    String getTargetHashedPhoneNumber();

    ByteString getTargetHashedPhoneNumberBytes();

    String getTargetName();

    ByteString getTargetNameBytes();

    String getTargetPhoneNumber();

    ByteString getTargetPhoneNumberBytes();

    String getTargetUuid();

    ByteString getTargetUuidBytes();

    Timestamp getUpdatedAt();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();

    boolean hasOrigin();

    boolean hasOriginatedFrom();

    boolean hasUpdatedAt();
}

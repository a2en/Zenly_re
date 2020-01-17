package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$UserEngagementStats.C6929b;

/* renamed from: co.znly.models.UserProto$UserMetadataOrBuilder */
public interface UserProto$UserMetadataOrBuilder extends MessageLiteOrBuilder {
    Timestamp getBirthdate();

    String getEmojisPacksUnlocked(int i);

    ByteString getEmojisPacksUnlockedBytes(int i);

    int getEmojisPacksUnlockedCount();

    List<String> getEmojisPacksUnlockedList();

    C6929b getEngagementLevel();

    int getEngagementLevelValue();

    boolean getFootstepsWebSharing();

    C7278d3 getIdCardStyle();

    int getIdCardStyleValue();

    Timestamp getTosValidatedAt();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasBirthdate();

    boolean hasTosValidatedAt();
}

package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.CampaignProto$CampaignMemberOrBuilder */
public interface CampaignProto$CampaignMemberOrBuilder extends MessageLiteOrBuilder {
    Timestamp getJoinedAt();

    String getOrganization();

    ByteString getOrganizationBytes();

    C7295f getOrganizationType();

    int getOrganizationTypeValue();

    Timestamp getRemovedAt();

    int getScore();

    String getUniversityUuid();

    ByteString getUniversityUuidBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasJoinedAt();

    boolean hasRemovedAt();
}

package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7295f;

/* renamed from: co.znly.models.services.ZenlyProto$UniversitiesCampaignsSignupResponseOrBuilder */
public interface ZenlyProto$UniversitiesCampaignsSignupResponseOrBuilder extends MessageLiteOrBuilder {
    boolean getIsSubscribed();

    int getNbMembers();

    int getNbRequiredMembers();

    String getOrganization();

    ByteString getOrganizationBytes();

    C7295f getOrganizationType();

    int getOrganizationTypeValue();

    String getUniversityUuid();

    ByteString getUniversityUuidBytes();
}

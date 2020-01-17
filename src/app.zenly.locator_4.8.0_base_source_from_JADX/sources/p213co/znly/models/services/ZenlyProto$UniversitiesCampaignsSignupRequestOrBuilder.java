package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7295f;

/* renamed from: co.znly.models.services.ZenlyProto$UniversitiesCampaignsSignupRequestOrBuilder */
public interface ZenlyProto$UniversitiesCampaignsSignupRequestOrBuilder extends MessageLiteOrBuilder {
    String getOrganization();

    ByteString getOrganizationBytes();

    C7295f getOrganizationType();

    int getOrganizationTypeValue();

    String getUniversityUuid();

    ByteString getUniversityUuidBytes();
}

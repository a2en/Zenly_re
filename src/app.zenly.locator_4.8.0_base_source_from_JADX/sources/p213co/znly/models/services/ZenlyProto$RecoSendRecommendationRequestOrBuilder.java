package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$RecoSendRecommendationRequestOrBuilder */
public interface ZenlyProto$RecoSendRecommendationRequestOrBuilder extends MessageLiteOrBuilder {
    String getNewcomerUuid();

    ByteString getNewcomerUuidBytes();

    String getPotentialMatchUuid();

    ByteString getPotentialMatchUuidBytes();

    String getRecommendationUuid();

    ByteString getRecommendationUuidBytes();
}

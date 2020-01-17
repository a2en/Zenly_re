package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.recommendations.C7886b;

/* renamed from: co.znly.models.services.ZenlyProto$RecoAcknowledgePotentialMatchRequestOrBuilder */
public interface ZenlyProto$RecoAcknowledgePotentialMatchRequestOrBuilder extends MessageLiteOrBuilder {
    C7886b getAck();

    int getAckValue();

    String getNewcomerUuid();

    ByteString getNewcomerUuidBytes();

    String getPotentialMatchUuid();

    ByteString getPotentialMatchUuidBytes();

    String getRecommendationUuid();

    ByteString getRecommendationUuidBytes();
}

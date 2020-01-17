package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.recommendations.C7888c;

/* renamed from: co.znly.models.services.ZenlyProto$RecoAcknowledgeRecommendationRequestOrBuilder */
public interface ZenlyProto$RecoAcknowledgeRecommendationRequestOrBuilder extends MessageLiteOrBuilder {
    C7888c getAck();

    int getAckValue();

    String getAcknowledgedUserUuid();

    ByteString getAcknowledgedUserUuidBytes();

    String getRecommendationUuid();

    ByteString getRecommendationUuidBytes();
}

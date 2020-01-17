package p213co.znly.models.verify;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.verify.ProviderProto$Provider$FuzzyInfoOrBuilder */
public interface ProviderProto$Provider$FuzzyInfoOrBuilder extends MessageLiteOrBuilder {
    C8449b getCapability();

    int getCapabilityValue();

    double getGravity();

    double getMax();

    C8451c getProviderId();

    int getProviderIdValue();

    String getTokenKey();

    ByteString getTokenKeyBytes();

    Timestamp getUpdatedAt();

    double getValue();

    boolean hasUpdatedAt();
}

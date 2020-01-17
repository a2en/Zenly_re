package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.CoreUserProto$DescendantOrBuilder */
public interface CoreUserProto$DescendantOrBuilder extends MessageLiteOrBuilder {
    String getAvatarUrlPrefix();

    ByteString getAvatarUrlPrefixBytes();

    int getAvatarVersion();

    Timestamp getCreatedAt();

    Timestamp getDescendantSince();

    String getName();

    ByteString getNameBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();

    boolean hasDescendantSince();
}

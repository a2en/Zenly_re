package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$WireStringCacheStreamDownOrBuilder */
public interface ZenlyProto$WireStringCacheStreamDownOrBuilder extends MessageLiteOrBuilder {
    String getLastCachedHash();

    ByteString getLastCachedHashBytes();

    String getLastCachedValue();

    ByteString getLastCachedValueBytes();

    int getLastCachedValueIdx();
}

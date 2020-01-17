package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$WireStringCacheStreamUpOrBuilder */
public interface ZenlyProto$WireStringCacheStreamUpOrBuilder extends MessageLiteOrBuilder {
    String getCachedValues(int i);

    ByteString getCachedValuesBytes(int i);

    int getCachedValuesCount();

    List<String> getCachedValuesList();

    String getLastCachedHash();

    ByteString getLastCachedHashBytes();

    String getLastCachedValue();

    ByteString getLastCachedValueBytes();
}

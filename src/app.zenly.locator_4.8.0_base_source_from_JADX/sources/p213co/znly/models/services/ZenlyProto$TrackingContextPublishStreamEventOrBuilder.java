package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ZenlyProto$TrackingContextPublishStreamEventOrBuilder */
public interface ZenlyProto$TrackingContextPublishStreamEventOrBuilder extends MessageLiteOrBuilder {
    long getSeq();

    String getWatchersUuids(int i);

    ByteString getWatchersUuidsBytes(int i);

    int getWatchersUuidsCount();

    List<String> getWatchersUuidsList();
}

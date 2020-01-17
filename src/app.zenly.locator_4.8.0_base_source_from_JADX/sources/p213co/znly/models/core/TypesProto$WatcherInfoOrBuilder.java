package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.core.TypesProto$WatcherInfoOrBuilder */
public interface TypesProto$WatcherInfoOrBuilder extends MessageLiteOrBuilder {
    String getWatcherUuids(int i);

    ByteString getWatcherUuidsBytes(int i);

    int getWatcherUuidsCount();

    List<String> getWatcherUuidsList();
}

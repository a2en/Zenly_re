package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.ActivityBeaconProto$ActivityBeaconOrBuilder */
public interface ActivityBeaconProto$ActivityBeaconOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    String getDeviceUuid();

    ByteString getDeviceUuidBytes();

    ByteString getMeta();

    String getName();

    ByteString getNameBytes();

    String getPayload();

    ByteString getPayloadBytes();

    String getTags(int i);

    ByteString getTagsBytes(int i);

    int getTagsCount();

    List<String> getTagsList();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    boolean hasCreatedAt();
}

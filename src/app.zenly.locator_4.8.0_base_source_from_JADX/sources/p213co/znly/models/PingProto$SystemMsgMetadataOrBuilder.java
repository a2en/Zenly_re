package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.PingProto$SystemMsgMetadataOrBuilder */
public interface PingProto$SystemMsgMetadataOrBuilder extends MessageLiteOrBuilder {
    String getAuthorUuid();

    ByteString getAuthorUuidBytes();

    String getRename();

    ByteString getRenameBytes();

    String getTargetUuids(int i);

    ByteString getTargetUuidsBytes(int i);

    int getTargetUuidsCount();

    List<String> getTargetUuidsList();
}

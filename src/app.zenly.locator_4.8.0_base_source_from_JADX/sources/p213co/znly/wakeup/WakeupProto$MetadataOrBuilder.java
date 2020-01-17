package p213co.znly.wakeup;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.wakeup.WakeupProto$MetadataOrBuilder */
public interface WakeupProto$MetadataOrBuilder extends MessageLiteOrBuilder {
    C8457b getAction();

    int getActionValue();

    String getOriginCycleUuid();

    ByteString getOriginCycleUuidBytes();

    String getOriginUserUuid();

    ByteString getOriginUserUuidBytes();

    C8461d getReason();

    int getReasonValue();

    String getSequenceId();

    ByteString getSequenceIdBytes();

    int getSequenceNumber();

    String getWatcherUuids(int i);

    ByteString getWatcherUuidsBytes(int i);

    int getWatcherUuidsCount();

    List<String> getWatcherUuidsList();
}

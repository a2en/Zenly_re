package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.ContactProto$SuggestedContactsOrBuilder */
public interface ContactProto$SuggestedContactsOrBuilder extends MessageLiteOrBuilder {
    int getAlgoVersion();

    Timestamp getCreatedAt();

    C7387m getDataVariant();

    int getDataVariantValue();

    C7396n getRuntimeVariant();

    int getRuntimeVariantValue();

    C7427o getSuggestedKeys(int i);

    int getSuggestedKeysCount();

    List<C7427o> getSuggestedKeysList();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasCreatedAt();
}

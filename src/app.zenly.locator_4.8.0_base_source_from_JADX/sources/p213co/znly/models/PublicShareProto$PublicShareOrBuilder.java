package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.PublicShareProto$PublicShare.C6854b;

/* renamed from: co.znly.models.PublicShareProto$PublicShareOrBuilder */
public interface PublicShareProto$PublicShareOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    Timestamp getInvalidUntil();

    String getMessage();

    ByteString getMessageBytes();

    C6854b getMetadata(int i);

    int getMetadataCount();

    List<C6854b> getMetadataList();

    TrackingContextProto$TrackingContext getTrackingContext();

    Timestamp getUpdatedAt();

    String getUrl();

    ByteString getUrlBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    Timestamp getValidUntil();

    boolean hasCreatedAt();

    boolean hasInvalidUntil();

    boolean hasTrackingContext();

    boolean hasUpdatedAt();

    boolean hasValidUntil();
}

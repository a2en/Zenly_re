package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7354j0.C7358d;
import p213co.znly.models.C7354j0.C7360e;
import p213co.znly.models.C7354j0.C7362f;

/* renamed from: co.znly.models.MediaProto$MediaOrBuilder */
public interface MediaProto$MediaOrBuilder extends MessageLiteOrBuilder {
    Timestamp getCreatedAt();

    C7358d getEncodings(int i);

    int getEncodingsCount();

    List<C7358d> getEncodingsList();

    int getEncodingsValue(int i);

    List<Integer> getEncodingsValueList();

    C7341i0 getHash();

    int getOriginalHeight();

    long getOriginalSizeBytes();

    int getOriginalWidth();

    int getPreviewHeight();

    int getPreviewWidth();

    String getReplyTo();

    ByteString getReplyToBytes();

    C7360e getType();

    int getTypeValue();

    String getUploadFilepath();

    ByteString getUploadFilepathBytes();

    String getUrlPrefix();

    ByteString getUrlPrefixBytes();

    String getUserUuid();

    ByteString getUserUuidBytes();

    String getUuid();

    ByteString getUuidBytes();

    Timestamp getValidUntil();

    C7362f getVariants(int i);

    int getVariantsCount();

    List<C7362f> getVariantsList();

    int getVariantsValue(int i);

    List<Integer> getVariantsValueList();

    boolean hasCreatedAt();

    boolean hasHash();

    boolean hasValidUntil();
}

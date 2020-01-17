package p213co.znly.models;

import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserAnnotationProto$UserAnnotation.C6911a;

/* renamed from: co.znly.models.UserAnnotationProto$UserAnnotationOrBuilder */
public interface UserAnnotationProto$UserAnnotationOrBuilder extends MessageLiteOrBuilder {
    C6911a getBrumpAnnotation();

    Timestamp getBrumpAnnotationExpiration();

    String getUserUuid();

    ByteString getUserUuidBytes();

    boolean hasBrumpAnnotation();

    boolean hasBrumpAnnotationExpiration();
}

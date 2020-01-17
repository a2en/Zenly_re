package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserAnnotationProto$UserAnnotation;

/* renamed from: co.znly.models.services.ZenlyProto$UserAnnotationResponseOrBuilder */
public interface ZenlyProto$UserAnnotationResponseOrBuilder extends MessageLiteOrBuilder {
    UserAnnotationProto$UserAnnotation getAnnotations(int i);

    int getAnnotationsCount();

    List<UserAnnotationProto$UserAnnotation> getAnnotationsList();

    C8131j5 getError();

    boolean hasError();
}

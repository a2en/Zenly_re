package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape;

/* renamed from: co.znly.models.services.ZenlyProto$FootstepsShapeResponseOrBuilder */
public interface ZenlyProto$FootstepsShapeResponseOrBuilder extends MessageLiteOrBuilder {
    ReverseGeoCoderProto$Shape getShapes(int i);

    int getShapesCount();

    List<ReverseGeoCoderProto$Shape> getShapesList();
}

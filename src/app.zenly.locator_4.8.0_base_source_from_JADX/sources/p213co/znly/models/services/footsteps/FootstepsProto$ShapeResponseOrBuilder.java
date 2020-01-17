package p213co.znly.models.services.footsteps;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape;

/* renamed from: co.znly.models.services.footsteps.FootstepsProto$ShapeResponseOrBuilder */
public interface FootstepsProto$ShapeResponseOrBuilder extends MessageLiteOrBuilder {
    ReverseGeoCoderProto$Shape getShapes(int i);

    int getShapesCount();

    List<ReverseGeoCoderProto$Shape> getShapesList();
}

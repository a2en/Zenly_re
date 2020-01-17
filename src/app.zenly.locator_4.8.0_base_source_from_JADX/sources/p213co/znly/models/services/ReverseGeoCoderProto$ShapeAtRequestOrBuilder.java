package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$ShapeAtRequestOrBuilder */
public interface ReverseGeoCoderProto$ShapeAtRequestOrBuilder extends MessageLiteOrBuilder {
    boolean getIncludeShapes();

    String getLocale();

    ByteString getLocaleBytes();

    C6950b0 getPoint(int i);

    int getPointCount();

    List<C6950b0> getPointList();

    C7917e getTypeOfShape();

    int getTypeOfShapeValue();
}

package p213co.znly.models.places;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C7297f0;
import p213co.znly.models.places.PlaceProto$PlaceData.C7867b;

/* renamed from: co.znly.models.places.PlaceProto$PlaceDataOrBuilder */
public interface PlaceProto$PlaceDataOrBuilder extends MessageLiteOrBuilder {
    C7867b getCategories(int i);

    int getCategoriesCount();

    List<C7867b> getCategoriesList();

    long getId();

    String getName();

    ByteString getNameBytes();

    C7871b getPersonalPlace();

    C6950b0 getPoint();

    C7297f0 getPolygon();

    C7877e getShape();

    int getShapeValue();

    boolean hasPersonalPlace();

    boolean hasPoint();

    boolean hasPolygon();
}

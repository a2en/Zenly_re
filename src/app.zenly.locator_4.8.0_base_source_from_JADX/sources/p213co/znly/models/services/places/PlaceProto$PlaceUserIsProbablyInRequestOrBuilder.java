package p213co.znly.models.services.places;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.places.PlaceProto$PlaceUserIsProbablyInRequestOrBuilder */
public interface PlaceProto$PlaceUserIsProbablyInRequestOrBuilder extends MessageLiteOrBuilder {
    String getLocale();

    ByteString getLocaleBytes();

    String getUserId(int i);

    ByteString getUserIdBytes(int i);

    int getUserIdCount();

    List<String> getUserIdList();
}

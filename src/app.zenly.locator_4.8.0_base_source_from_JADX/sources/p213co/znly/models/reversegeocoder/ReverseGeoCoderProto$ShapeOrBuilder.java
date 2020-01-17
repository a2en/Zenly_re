package p213co.znly.models.reversegeocoder;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C6950b0;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape.C7893b;
import p213co.znly.models.reversegeocoder.ReverseGeoCoderProto$Shape.C7895c;

/* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$ShapeOrBuilder */
public interface ReverseGeoCoderProto$ShapeOrBuilder extends MessageLiteOrBuilder {
    double getAreaSqm();

    C6950b0 getCentroid();

    long getCountryId();

    String getCountryIsoCode();

    ByteString getCountryIsoCodeBytes();

    long getId();

    String getLocalizedName();

    ByteString getLocalizedNameBytes();

    C7893b getOuters(int i);

    int getOutersCount();

    List<C7893b> getOutersList();

    C7895c getParentCountry();

    C7917e getType();

    int getTypeValue();

    boolean hasCentroid();

    boolean hasParentCountry();
}

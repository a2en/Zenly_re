package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.ReverseGeoCoderProto$CovererResponse$CoveringOrBuilder */
public interface ReverseGeoCoderProto$CovererResponse$CoveringOrBuilder extends MessageLiteOrBuilder {
    long getId();

    long getTiles(int i);

    int getTilesCount();

    List<Long> getTilesList();

    C8038e getType();

    int getTypeValue();
}

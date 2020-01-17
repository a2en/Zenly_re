package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.reversegeocoder.C7921g;

/* renamed from: co.znly.models.core.GeoProto$RouteUserETARequestOrBuilder */
public interface GeoProto$RouteUserETARequestOrBuilder extends MessageLiteOrBuilder {
    C7921g getModes(int i);

    int getModesCount();

    List<C7921g> getModesList();

    int getModesValue(int i);

    List<Integer> getModesValueList();

    boolean getReversed();

    String getUserUuids(int i);

    ByteString getUserUuidsBytes(int i);

    int getUserUuidsCount();

    List<String> getUserUuidsList();
}

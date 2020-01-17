package p213co.znly.models.reversegeocoder;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.reversegeocoder.ReverseGeoCoderProto$CheckinOrBuilder */
public interface ReverseGeoCoderProto$CheckinOrBuilder extends MessageLiteOrBuilder {
    C7913c getCheckins(int i);

    int getCheckinsCount();

    List<C7913c> getCheckinsList();

    ReverseGeoCoderProto$Shape getShape();

    boolean hasShape();
}

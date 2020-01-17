package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.services.ZenlyProto$UserVisitPointResponse.UserVisitPoint;

/* renamed from: co.znly.models.services.ZenlyProto$UserVisitPointStreamEventOrBuilder */
public interface ZenlyProto$UserVisitPointStreamEventOrBuilder extends MessageLiteOrBuilder {
    UserVisitPoint getUserVisitPoints(int i);

    int getUserVisitPointsCount();

    List<UserVisitPoint> getUserVisitPointsList();
}

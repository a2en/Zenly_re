package p213co.znly.models.services.usermonitor;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.usermonitor.UserMonitorProto$UserMonitoringOnMeResponseOrBuilder */
public interface UserMonitorProto$UserMonitoringOnMeResponseOrBuilder extends MessageLiteOrBuilder {
    C8324f getError();

    C8318c getMonitoringsInfo(int i);

    int getMonitoringsInfoCount();

    List<C8318c> getMonitoringsInfoList();

    boolean hasError();
}

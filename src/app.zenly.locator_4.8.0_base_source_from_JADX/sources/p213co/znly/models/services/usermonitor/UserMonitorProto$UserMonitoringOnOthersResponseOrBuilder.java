package p213co.znly.models.services.usermonitor;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.services.usermonitor.UserMonitorProto$UserMonitoringOnOthersResponseOrBuilder */
public interface UserMonitorProto$UserMonitoringOnOthersResponseOrBuilder extends MessageLiteOrBuilder {
    C8324f getError();

    C8318c getMonitoringsInfo(int i);

    int getMonitoringsInfoCount();

    List<C8318c> getMonitoringsInfoList();

    boolean hasError();
}

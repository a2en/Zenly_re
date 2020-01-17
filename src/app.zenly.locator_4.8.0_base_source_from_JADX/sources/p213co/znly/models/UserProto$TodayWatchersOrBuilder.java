package p213co.znly.models;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: co.znly.models.UserProto$TodayWatchersOrBuilder */
public interface UserProto$TodayWatchersOrBuilder extends MessageLiteOrBuilder {
    int getDay();

    String getTimezone();

    ByteString getTimezoneBytes();

    C7325g3 getWatchers(int i);

    int getWatchersCount();

    List<C7325g3> getWatchersList();
}

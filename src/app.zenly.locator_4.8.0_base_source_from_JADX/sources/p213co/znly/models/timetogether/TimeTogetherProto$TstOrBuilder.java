package p213co.znly.models.timetogether;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst.C8430b;

/* renamed from: co.znly.models.timetogether.TimeTogetherProto$TstOrBuilder */
public interface TimeTogetherProto$TstOrBuilder extends MessageLiteOrBuilder {
    int getBestStreak();

    C8430b getCategories(int i);

    int getCategoriesCount();

    List<C8430b> getCategoriesList();

    C8435c getFriendsMet();

    int getMeetCount();

    boolean getOngoing();

    int getStreak();

    long getTimeTogetherAllTime();

    long getTimeTogetherCurrentWeek();

    C8439e getTrend();

    long getTrendGraph(int i);

    int getTrendGraphCount();

    List<Long> getTrendGraphList();

    int getTrendValue();

    Timestamp getTs();

    String getUserId();

    ByteString getUserIdBytes();

    boolean hasFriendsMet();

    boolean hasTs();
}

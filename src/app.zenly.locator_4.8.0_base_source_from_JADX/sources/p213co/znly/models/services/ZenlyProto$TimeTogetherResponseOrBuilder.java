package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.timetogether.C8437d;
import p213co.znly.models.timetogether.TimeTogetherProto$FriendsPerCategory;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;

/* renamed from: co.znly.models.services.ZenlyProto$TimeTogetherResponseOrBuilder */
public interface ZenlyProto$TimeTogetherResponseOrBuilder extends MessageLiteOrBuilder {
    TimeTogetherProto$FriendsPerCategory getFriends(int i);

    int getFriendsCount();

    List<TimeTogetherProto$FriendsPerCategory> getFriendsList();

    C8437d getMyTst();

    TimeTogetherProto$Tst getTsts(int i);

    int getTstsCount();

    List<TimeTogetherProto$Tst> getTstsList();

    String getUserId();

    ByteString getUserIdBytes();

    boolean hasMyTst();
}

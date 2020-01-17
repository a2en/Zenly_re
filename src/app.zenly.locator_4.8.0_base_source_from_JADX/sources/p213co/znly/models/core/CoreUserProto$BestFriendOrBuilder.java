package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$BestFriend.C6918b;
import p213co.znly.models.UserProto$BestFriend.C6920c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.ZenlyProto$BestFriend.C7938b;
import p213co.znly.models.timetogether.C8433b;

/* renamed from: co.znly.models.core.CoreUserProto$BestFriendOrBuilder */
public interface CoreUserProto$BestFriendOrBuilder extends MessageLiteOrBuilder {
    C7938b getBestCategories(int i);

    int getBestCategoriesCount();

    List<C7938b> getBestCategoriesList();

    C8433b getCategories(int i);

    int getCategoriesCount();

    List<C8433b> getCategoriesList();

    int getCategoriesValue(int i);

    List<Integer> getCategoriesValueList();

    C6918b getFacts();

    UserProto$User getFriend();

    C6920c getLevel();

    int getLevelValue();

    Timestamp getValidUntil();

    boolean hasFacts();

    boolean hasFriend();

    boolean hasValidUntil();
}

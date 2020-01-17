package p213co.znly.models.services;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$BestFriend.C6918b;
import p213co.znly.models.UserProto$BestFriend.C6920c;
import p213co.znly.models.services.ZenlyProto$BestFriend.C7938b;

/* renamed from: co.znly.models.services.ZenlyProto$BestFriendOrBuilder */
public interface ZenlyProto$BestFriendOrBuilder extends MessageLiteOrBuilder {
    C7938b getCategories(int i);

    int getCategoriesCount();

    List<C7938b> getCategoriesList();

    C6918b getFacts();

    C6920c getLevel();

    int getLevelValue();

    String getUserUuid();

    ByteString getUserUuidBytes();

    Timestamp getValidUntil();

    boolean hasFacts();

    boolean hasValidUntil();
}

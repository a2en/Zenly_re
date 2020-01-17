package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7280e;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$FriendStreamEventOrBuilder */
public interface ZenlyProto$FriendStreamEventOrBuilder extends MessageLiteOrBuilder {
    UserProto$User getFriend();

    C7280e getOp();

    int getOpValue();

    boolean hasFriend();
}

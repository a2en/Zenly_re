package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7270d;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$BrumpStreamDownEventOrBuilder */
public interface ZenlyProto$BrumpStreamDownEventOrBuilder extends MessageLiteOrBuilder {
    C7270d getBrumpInfo();

    boolean getIsFriend();

    UserProto$User getUser();

    boolean hasBrumpInfo();

    boolean hasUser();
}

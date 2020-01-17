package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7402n2;

/* renamed from: co.znly.models.core.ReloginProto$SessionReloginResponseOrBuilder */
public interface ReloginProto$SessionReloginResponseOrBuilder extends MessageLiteOrBuilder {
    boolean getCanRetry();

    C7402n2 getSession();

    boolean hasSession();
}

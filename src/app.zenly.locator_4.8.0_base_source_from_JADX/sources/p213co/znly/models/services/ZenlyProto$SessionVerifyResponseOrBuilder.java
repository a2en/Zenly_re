package p213co.znly.models.services;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.C7402n2;
import p213co.znly.models.UserPreferencesProto$UserPreferences;
import p213co.znly.models.UserProto$User;

/* renamed from: co.znly.models.services.ZenlyProto$SessionVerifyResponseOrBuilder */
public interface ZenlyProto$SessionVerifyResponseOrBuilder extends MessageLiteOrBuilder {
    C8254r1 getConfiguration();

    C8275s4 getError();

    boolean getForcedOnboardingEnabled();

    UserProto$User getMe();

    C7402n2 getSession();

    UserPreferencesProto$UserPreferences getUserPreferences();

    boolean hasConfiguration();

    boolean hasError();

    boolean hasMe();

    boolean hasSession();

    boolean hasUserPreferences();
}

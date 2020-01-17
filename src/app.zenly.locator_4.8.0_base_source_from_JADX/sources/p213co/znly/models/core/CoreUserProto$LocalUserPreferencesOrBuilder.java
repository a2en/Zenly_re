package p213co.znly.models.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserPreferencesProto$UserPreferences;

/* renamed from: co.znly.models.core.CoreUserProto$LocalUserPreferencesOrBuilder */
public interface CoreUserProto$LocalUserPreferencesOrBuilder extends MessageLiteOrBuilder {
    boolean getIsDirty();

    UserPreferencesProto$UserPreferences getUserPreferences();

    int getVersion();

    boolean hasUserPreferences();
}

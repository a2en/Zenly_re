package p213co.znly.models.core;

import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLiteOrBuilder;
import p213co.znly.models.UserProto$UserEngagementStats.C6929b;

/* renamed from: co.znly.models.core.UICacheProto$UiCacheIconUnlockOrBuilder */
public interface UICacheProto$UiCacheIconUnlockOrBuilder extends MessageLiteOrBuilder {
    C6929b getEngagementLevel();

    int getEngagementLevelValue();

    boolean getHasNewLevels();

    C6929b getUnwrappedEngagementLevels(int i);

    int getUnwrappedEngagementLevelsCount();

    List<C6929b> getUnwrappedEngagementLevelsList();

    int getUnwrappedEngagementLevelsValue(int i);

    List<Integer> getUnwrappedEngagementLevelsValueList();
}

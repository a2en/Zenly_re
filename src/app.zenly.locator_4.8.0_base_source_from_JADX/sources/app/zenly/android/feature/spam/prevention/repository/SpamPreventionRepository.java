package app.zenly.android.feature.spam.prevention.repository;

import app.zenly.android.feature.spam.prevention.model.C1468a;
import app.zenly.android.feature.spam.prevention.model.SpammedUser;
import java.util.List;
import p389io.reactivex.C12279e;

public interface SpamPreventionRepository {
    C12279e<Boolean> cancelAllFriendRequests();

    C12279e<Boolean> cancelFriendRequest(String str);

    C12279e<List<SpammedUser>> getSpammedUsers();

    C12279e<C1468a> isSpamThresholdReachedOnNextRequest();

    C12279e<Integer> uponNextRequestGetFriendRequestCount();
}

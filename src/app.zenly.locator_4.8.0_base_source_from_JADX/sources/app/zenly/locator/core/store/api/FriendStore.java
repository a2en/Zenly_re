package app.zenly.locator.core.store.api;

import java.util.List;
import java.util.Map;
import p389io.reactivex.C12279e;

public interface FriendStore {
    C12279e<List<C2936a0>> bestFriends();

    C12279e<C2936a0> friend(String str);

    C2936a0 friendCache(String str);

    C12279e<List<C2936a0>> friends();

    List<C2936a0> friendsCache();

    C12279e<Map<String, C2936a0>> friendsMap();
}

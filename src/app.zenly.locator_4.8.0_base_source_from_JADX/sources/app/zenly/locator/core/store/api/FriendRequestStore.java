package app.zenly.locator.core.store.api;

import java.util.List;
import java.util.Map;
import p389io.reactivex.C12279e;

public interface FriendRequestStore {
    C12279e<C2956k0> friendRequest(String str);

    C2956k0 friendRequestCache(String str);

    C12279e<List<C2956k0>> friendRequests();

    C12279e<Map<String, C2956k0>> friendRequestsMap();
}

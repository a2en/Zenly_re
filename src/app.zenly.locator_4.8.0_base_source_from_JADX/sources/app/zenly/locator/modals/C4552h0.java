package app.zenly.locator.modals;

import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.modals.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C4552h0 implements Function {

    /* renamed from: e */
    private final /* synthetic */ FriendRequestStore f12181e;

    public /* synthetic */ C4552h0(FriendRequestStore friendRequestStore) {
        this.f12181e = friendRequestStore;
    }

    public final Object apply(Object obj) {
        return this.f12181e.friendRequest(((C2956k0) obj).mo9124d()).mo36487e(1);
    }
}

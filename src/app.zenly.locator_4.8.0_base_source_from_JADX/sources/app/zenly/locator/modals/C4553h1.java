package app.zenly.locator.modals;

import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.modals.h1 */
/* compiled from: lambda */
public final /* synthetic */ class C4553h1 implements Function {

    /* renamed from: e */
    private final /* synthetic */ FriendRequestStore f12182e;

    public /* synthetic */ C4553h1(FriendRequestStore friendRequestStore) {
        this.f12182e = friendRequestStore;
    }

    public final Object apply(Object obj) {
        return this.f12182e.friendRequest(((C2956k0) obj).mo9124d()).mo36487e(1);
    }
}

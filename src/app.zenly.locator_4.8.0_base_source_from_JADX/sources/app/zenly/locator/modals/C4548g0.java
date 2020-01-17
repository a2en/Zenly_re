package app.zenly.locator.modals;

import app.zenly.locator.core.store.api.FriendshipStore;
import p213co.znly.models.services.C8273s3;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.modals.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C4548g0 implements Function {

    /* renamed from: e */
    private final /* synthetic */ FriendshipStore f12177e;

    public /* synthetic */ C4548g0(FriendshipStore friendshipStore) {
        this.f12177e = friendshipStore;
    }

    public final Object apply(Object obj) {
        return this.f12177e.friendship(((C8273s3) obj).getNotification().getLocationRequest().getAuthor().getUuid()).mo36487e(1).mo36501i(new C4549g1((C8273s3) obj));
    }
}

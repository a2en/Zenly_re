package app.zenly.locator.modals;

import app.zenly.locator.core.store.api.FriendshipStore;
import p213co.znly.models.services.C8273s3;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.modals.a0 */
/* compiled from: lambda */
public final /* synthetic */ class C4523a0 implements Function {

    /* renamed from: e */
    private final /* synthetic */ FriendshipStore f12141e;

    public /* synthetic */ C4523a0(FriendshipStore friendshipStore) {
        this.f12141e = friendshipStore;
    }

    public final Object apply(Object obj) {
        return this.f12141e.friendship(((C8273s3) obj).getNotification().getDisableGhost().getAuthor().getUuid()).mo36487e(1).mo36501i(new C4638o0((C8273s3) obj));
    }
}

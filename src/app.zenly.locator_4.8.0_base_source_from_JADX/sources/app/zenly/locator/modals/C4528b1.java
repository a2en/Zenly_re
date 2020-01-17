package app.zenly.locator.modals;

import app.zenly.locator.core.store.api.FriendRequestStore;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.modals.b1 */
/* compiled from: lambda */
public final /* synthetic */ class C4528b1 implements Function {

    /* renamed from: e */
    private final /* synthetic */ C12279e f12146e;

    /* renamed from: f */
    private final /* synthetic */ FriendRequestStore f12147f;

    public /* synthetic */ C4528b1(C12279e eVar, FriendRequestStore friendRequestStore) {
        this.f12146e = eVar;
        this.f12147f = friendRequestStore;
    }

    public final Object apply(Object obj) {
        return this.f12146e.mo36459b((Predicate<? super T>) C4679s0.f12439e).mo36459b((Predicate<? super T>) new C4685u0<Object>((UserProto$User) obj)).mo36459b((Predicate<? super T>) C4527b0.f12145e).mo36509m(new C4552h0(this.f12147f)).mo36501i(C4524a1.f12142e);
    }
}

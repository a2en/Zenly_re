package app.zenly.locator.modals;

import app.zenly.locator.core.store.api.FriendRequestStore;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.modals.v0 */
/* compiled from: lambda */
public final /* synthetic */ class C4688v0 implements Function {

    /* renamed from: e */
    private final /* synthetic */ C12279e f12450e;

    /* renamed from: f */
    private final /* synthetic */ C12279e f12451f;

    /* renamed from: g */
    private final /* synthetic */ FriendRequestStore f12452g;

    public /* synthetic */ C4688v0(C12279e eVar, C12279e eVar2, FriendRequestStore friendRequestStore) {
        this.f12450e = eVar;
        this.f12451f = eVar2;
        this.f12452g = friendRequestStore;
    }

    public final Object apply(Object obj) {
        return C12279e.m32621b((ObservableSource<? extends T>) this.f12450e.mo36501i(C4532c1.f12151e), (ObservableSource<? extends T>) this.f12451f.mo36459b((Predicate<? super T>) C4535d0.f12153e).mo36459b((Predicate<? super T>) new C4544f1<Object>((UserProto$User) obj)).mo36459b((Predicate<? super T>) C4663q0.f12416e).mo36509m(new C4553h1(this.f12452g)).mo36501i(C4567j0.f12198e));
    }
}

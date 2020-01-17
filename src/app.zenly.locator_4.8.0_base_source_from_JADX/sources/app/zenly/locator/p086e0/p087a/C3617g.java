package app.zenly.locator.p086e0.p087a;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C6947a3;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.e0.a.g */
public final class C3617g {

    /* renamed from: a */
    private final C12785a<Boolean> f9723a;

    /* renamed from: b */
    private final C12279e<UserProto$User> f9724b;

    /* renamed from: app.zenly.locator.e0.a.g$a */
    static final class C3618a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3618a f9725e = new C3618a();

        C3618a() {
        }

        /* renamed from: a */
        public final boolean mo10107a(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            return userProto$User.getBlockRelationship() == C6947a3.f17115g;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo10107a((UserProto$User) obj));
        }
    }

    public C3617g(C12279e<UserProto$User> eVar) {
        C12932j.m33818b(eVar, "userObservable");
        this.f9724b = eVar;
        C12785a<Boolean> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<Boolean>()");
        this.f9723a = u;
    }

    /* renamed from: a */
    public final C12279e<Boolean> mo10105a() {
        C12279e<Boolean> b = C12279e.m32621b((ObservableSource<? extends T>) this.f9724b.mo36501i(C3618a.f9725e), (ObservableSource<? extends T>) this.f9723a.mo36986r());
        C12932j.m33815a((Object) b, "Observable.merge(isBlock…edSubject.toSerialized())");
        return b;
    }

    /* renamed from: a */
    public final void mo10106a(boolean z) {
        this.f9723a.onNext(Boolean.valueOf(z));
    }
}

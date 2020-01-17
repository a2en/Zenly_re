package app.zenly.locator;

import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.g */
public final class C3818g implements AuthenticatedLifecycle, AuthenticatedNotifier {

    /* renamed from: a */
    private static final C12785a<Boolean> f10167a;

    /* renamed from: b */
    public static final C3818g f10168b = new C3818g();

    static {
        C12785a<Boolean> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<Boolean>()");
        f10167a = u;
    }

    private C3818g() {
    }

    /* renamed from: a */
    public static final C3818g m11315a() {
        return f10168b;
    }

    public C12279e<Boolean> isAuthenticated() {
        C12279e<Boolean> d = f10167a.mo36477d();
        C12932j.m33815a((Object) d, "subject.distinctUntilChanged()");
        return d;
    }

    public void setAuthenticated(boolean z) {
        f10167a.onNext(Boolean.valueOf(z));
    }
}

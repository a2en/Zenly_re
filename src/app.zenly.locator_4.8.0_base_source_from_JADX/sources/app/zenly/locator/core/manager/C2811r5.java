package app.zenly.locator.core.manager;

import android.text.TextUtils;
import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7286e2;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.manager.r5 */
public final class C2811r5 {

    /* renamed from: a */
    private final C12279e<C7286e2> f8048a;

    /* renamed from: b */
    private final C12279e<C7286e2> f8049b;

    /* renamed from: app.zenly.locator.core.manager.r5$b */
    private static class C2813b {

        /* renamed from: a */
        static final C2811r5 f8050a = new C2811r5();
    }

    /* renamed from: app.zenly.locator.core.manager.r5$c */
    private static final class C2814c {

        /* renamed from: a */
        public final UserProto$User f8051a;

        /* renamed from: b */
        public final C7286e2 f8052b;

        /* renamed from: a */
        public boolean mo8850a() {
            return TextUtils.equals(this.f8051a.getUuid(), this.f8052b.getUserUuid());
        }

        private C2814c(UserProto$User userProto$User, C7286e2 e2Var) {
            this.f8051a = userProto$User;
            this.f8052b = e2Var;
        }
    }

    /* renamed from: a */
    static /* synthetic */ C2814c m9283a(C7286e2 e2Var, UserProto$User userProto$User) throws Exception {
        return new C2814c(userProto$User, e2Var);
    }

    /* renamed from: c */
    public static C2811r5 m9286c() {
        return C2813b.f8050a;
    }

    private C2811r5() {
        ZenlyCore a = C5448c.m15478a();
        C12279e a2 = a.userPlacesStream().mo36426a((ObservableSource<? extends U>) a.userMeStream(), (BiFunction<? super T, ? super U, ? extends R>) C2856x4.f8099a);
        this.f8048a = a2.mo36459b((Predicate<? super T>) C2830t4.f8069e).mo36501i(C2838u4.f8081e);
        this.f8049b = a2.mo36459b((Predicate<? super T>) C2844v4.f8087e).mo36501i(C2850w4.f8093e);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m9287c(C2814c cVar) throws Exception {
        return !cVar.mo8850a();
    }

    /* renamed from: b */
    public C12279e<C7286e2> mo8849b() {
        return this.f8048a;
    }

    /* renamed from: a */
    public C12279e<C7286e2> mo8848a() {
        return this.f8049b;
    }
}

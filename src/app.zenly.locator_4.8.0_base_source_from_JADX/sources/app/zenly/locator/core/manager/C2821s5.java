package app.zenly.locator.core.manager;

import android.text.TextUtils;
import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.ZenlyProto$UserVisitPointResponse.UserVisitPoint;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.manager.s5 */
public final class C2821s5 {

    /* renamed from: a */
    private final C12279e<UserVisitPoint> f8059a;

    /* renamed from: b */
    private final C12279e<UserVisitPoint> f8060b;

    /* renamed from: app.zenly.locator.core.manager.s5$b */
    private static class C2823b {

        /* renamed from: a */
        static final C2821s5 f8061a = new C2821s5();
    }

    /* renamed from: app.zenly.locator.core.manager.s5$c */
    private static final class C2824c {

        /* renamed from: a */
        public final UserProto$User f8062a;

        /* renamed from: b */
        public final UserVisitPoint f8063b;

        /* renamed from: a */
        public boolean mo8853a() {
            return TextUtils.equals(this.f8062a.getUuid(), this.f8063b.getUserUuid());
        }

        private C2824c(UserProto$User userProto$User, UserVisitPoint userVisitPoint) {
            this.f8062a = userProto$User;
            this.f8063b = userVisitPoint;
        }
    }

    /* renamed from: c */
    public static C2821s5 m9296c() {
        return C2823b.f8061a;
    }

    private C2821s5() {
        ZenlyCore a = C5448c.m15478a();
        C12279e a2 = a.userVisitPointsRealtimeStream().mo36509m(C2652c5.f7812e).mo36426a((ObservableSource<? extends U>) a.userMeStream(), (BiFunction<? super T, ? super U, ? extends R>) C2645b5.f7805a);
        this.f8059a = a2.mo36459b((Predicate<? super T>) C2862y4.f8105e).mo36501i(C2659d5.f7819e);
        this.f8060b = a2.mo36459b((Predicate<? super T>) C2868z4.f8111e).mo36501i(C2638a5.f7798e);
    }

    /* renamed from: a */
    static /* synthetic */ C2824c m9292a(UserVisitPoint userVisitPoint, UserProto$User userProto$User) throws Exception {
        return new C2824c(userProto$User, userVisitPoint);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m9297c(C2824c cVar) throws Exception {
        return !cVar.mo8853a();
    }

    /* renamed from: b */
    public C12279e<UserVisitPoint> mo8852b() {
        return this.f8059a;
    }

    /* renamed from: a */
    public C12279e<UserVisitPoint> mo8851a() {
        return this.f8060b;
    }
}

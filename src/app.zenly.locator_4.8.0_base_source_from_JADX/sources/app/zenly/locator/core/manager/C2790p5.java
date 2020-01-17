package app.zenly.locator.core.manager;

import android.text.TextUtils;
import app.zenly.locator.p143s.p148l.C5448c;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserAnnotationProto$UserAnnotation;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.manager.p5 */
public class C2790p5 {

    /* renamed from: a */
    private final C12279e<UserAnnotationProto$UserAnnotation> f8020a;

    /* renamed from: b */
    private final C12279e<UserAnnotationProto$UserAnnotation> f8021b;

    /* renamed from: app.zenly.locator.core.manager.p5$b */
    private static class C2792b {

        /* renamed from: a */
        static final C2790p5 f8022a = new C2790p5();
    }

    /* renamed from: app.zenly.locator.core.manager.p5$c */
    private static final class C2793c {

        /* renamed from: a */
        public final UserProto$User f8023a;

        /* renamed from: b */
        public final UserAnnotationProto$UserAnnotation f8024b;

        /* renamed from: a */
        public boolean mo8842a() {
            return TextUtils.equals(this.f8023a.getUuid(), this.f8024b.getUserUuid());
        }

        private C2793c(UserProto$User userProto$User, UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation) {
            this.f8023a = userProto$User;
            this.f8024b = userAnnotationProto$UserAnnotation;
        }
    }

    /* renamed from: c */
    public static C2790p5 m9272c() {
        return C2792b.f8022a;
    }

    private C2790p5() {
        ZenlyCore a = C5448c.m15478a();
        C12279e a2 = a.userAnnotationStream().mo36501i(C2789p4.f8019e).mo36426a((ObservableSource<? extends U>) a.userMeStream(), (BiFunction<? super T, ? super U, ? extends R>) C2820s4.f8058a);
        this.f8020a = a2.mo36459b((Predicate<? super T>) C2775o4.f8003e).mo36501i(C2799q4.f8030e);
        this.f8021b = a2.mo36459b((Predicate<? super T>) C2810r4.f8047e).mo36501i(C2768n4.f7996e);
    }

    /* renamed from: a */
    static /* synthetic */ C2793c m9268a(UserAnnotationProto$UserAnnotation userAnnotationProto$UserAnnotation, UserProto$User userProto$User) throws Exception {
        return new C2793c(userProto$User, userAnnotationProto$UserAnnotation);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m9273c(C2793c cVar) throws Exception {
        return !cVar.mo8842a();
    }

    /* renamed from: b */
    public C12279e<UserAnnotationProto$UserAnnotation> mo8841b() {
        return this.f8020a;
    }

    /* renamed from: a */
    public C12279e<UserAnnotationProto$UserAnnotation> mo8840a() {
        return this.f8021b;
    }
}

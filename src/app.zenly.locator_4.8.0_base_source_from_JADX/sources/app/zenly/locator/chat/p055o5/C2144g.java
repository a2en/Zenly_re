package app.zenly.locator.chat.p055o5;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7391m1;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.BiPredicate;

/* renamed from: app.zenly.locator.chat.o5.g */
public final class C2144g {

    /* renamed from: a */
    private final C12279e<C7391m1> f6650a;

    /* renamed from: app.zenly.locator.chat.o5.g$a */
    static final class C2145a<T1, T2> implements BiPredicate<C7391m1, C7391m1> {

        /* renamed from: a */
        final /* synthetic */ C2144g f6651a;

        C2145a(C2144g gVar) {
            this.f6651a = gVar;
        }

        /* renamed from: a */
        public final boolean test(C7391m1 m1Var, C7391m1 m1Var2) {
            C12932j.m33818b(m1Var, "last");
            C12932j.m33818b(m1Var2, "current");
            return !this.f6651a.m7901a(m1Var2, m1Var);
        }
    }

    public C2144g(C12279e<C7391m1> eVar) {
        C12932j.m33818b(eVar, "activityStream");
        this.f6650a = eVar;
    }

    /* renamed from: a */
    public final C12279e<C7391m1> mo7977a() {
        C12279e<C7391m1> a = this.f6650a.mo36431a((BiPredicate<? super T, ? super T>) new C2145a<Object,Object>(this));
        C12932j.m33815a((Object) a, "activityStream\n         …ayInterrupt\n            }");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m7901a(C7391m1 m1Var, C7391m1 m1Var2) {
        if (m1Var != C7391m1.INAPP || m1Var2 == C7391m1.TYPING || m1Var2 == C7391m1.READING) {
            return false;
        }
        return true;
    }
}

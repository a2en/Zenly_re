package app.zenly.locator.cards.p046m;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.cards.CardSwitcherFragment;
import app.zenly.locator.userprofile.p198me.C6067c;
import app.zenly.locator.userprofile.p198me.p199g.C6081a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.services.C7983a5;
import p213co.znly.models.services.C8163m0;
import p389io.reactivex.C12286f;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.cards.m.a */
public final class C1847a {

    /* renamed from: a */
    private final ZenlySchedulers f6066a = C1351e.m6372a(C6067c.f15275b.mo19916a("bffs"));

    /* renamed from: b */
    private final C6081a f6067b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final CardSwitcherFragment f6068c;

    /* renamed from: app.zenly.locator.cards.m.a$a */
    static final class C1848a<T> implements Consumer<C8163m0> {

        /* renamed from: e */
        final /* synthetic */ C1847a f6069e;

        C1848a(C1847a aVar) {
            this.f6069e = aVar;
        }

        /* renamed from: a */
        public final void accept(C8163m0 m0Var) {
            this.f6069e.f6068c.mo7367e();
        }
    }

    /* renamed from: app.zenly.locator.cards.m.a$b */
    static final class C1849b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C1847a f6070e;

        C1849b(C1847a aVar) {
            this.f6070e = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f6070e.f6068c.mo7366d();
        }
    }

    /* renamed from: app.zenly.locator.cards.m.a$c */
    static final class C1850c<T> implements Consumer<C7983a5> {

        /* renamed from: e */
        final /* synthetic */ C1847a f6071e;

        C1850c(C1847a aVar) {
            this.f6071e = aVar;
        }

        /* renamed from: a */
        public final void accept(C7983a5 a5Var) {
            this.f6071e.f6068c.mo7367e();
        }
    }

    /* renamed from: app.zenly.locator.cards.m.a$d */
    static final class C1851d<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C1847a f6072e;

        C1851d(C1847a aVar) {
            this.f6072e = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f6072e.f6068c.mo7366d();
        }
    }

    public C1847a(C6081a aVar, CardSwitcherFragment cardSwitcherFragment) {
        C12932j.m33818b(aVar, "bffRepository");
        C12932j.m33818b(cardSwitcherFragment, "view");
        this.f6067b = aVar;
        this.f6068c = cardSwitcherFragment;
    }

    /* renamed from: b */
    public final void mo7500b(String str) {
        C12932j.m33818b(str, "userUuid");
        this.f6067b.mo13899b(str).mo36534a(3, TimeUnit.SECONDS).mo36535a((C12286f) this.f6066a.getMainThread()).mo36544b((C12286f) this.f6066a.getComputation()).mo36533a((Consumer<? super T>) new C1850c<Object>(this), (Consumer<? super Throwable>) new C1851d<Object>(this));
    }

    /* renamed from: a */
    public final void mo7499a(String str) {
        C12932j.m33818b(str, "userUuid");
        this.f6067b.mo13897a(str).mo36534a(3, TimeUnit.SECONDS).mo36535a((C12286f) this.f6066a.getMainThread()).mo36544b((C12286f) this.f6066a.getComputation()).mo36533a((Consumer<? super T>) new C1848a<Object>(this), (Consumer<? super Throwable>) new C1849b<Object>(this));
    }
}

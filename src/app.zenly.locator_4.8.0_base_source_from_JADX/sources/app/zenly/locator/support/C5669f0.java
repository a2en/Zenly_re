package app.zenly.locator.support;

import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.support.model.C5718k;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.support.f0 */
public final class C5669f0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5674g0 f14439a = new C5674g0(this.f14442d);

    /* renamed from: b */
    private final C12275b f14440b = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5659d0 f14441c;

    /* renamed from: d */
    private final C5724n0 f14442d;

    /* renamed from: app.zenly.locator.support.f0$a */
    static final class C5670a<T> implements Consumer<List<? extends C5718k>> {

        /* renamed from: e */
        final /* synthetic */ C5669f0 f14443e;

        C5670a(C5669f0 f0Var) {
            this.f14443e = f0Var;
        }

        /* renamed from: a */
        public final void accept(List<C5718k> list) {
            this.f14443e.f14439a.mo13336a();
        }
    }

    /* renamed from: app.zenly.locator.support.f0$b */
    static final class C5671b<T> implements Consumer<List<? extends C5718k>> {

        /* renamed from: e */
        final /* synthetic */ C5669f0 f14444e;

        C5671b(C5669f0 f0Var) {
            this.f14444e = f0Var;
        }

        /* renamed from: a */
        public final void accept(List<C5718k> list) {
            C5659d0 a = this.f14444e.f14441c;
            C12932j.m33815a((Object) list, "tickets");
            a.mo13324a(C12857w.m33688i((Iterable) list));
            this.f14444e.f14441c.mo13326e(false);
        }
    }

    /* renamed from: app.zenly.locator.support.f0$c */
    static final class C5672c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5669f0 f14445e;

        C5672c(C5669f0 f0Var) {
            this.f14445e = f0Var;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f14445e.f14441c.mo23920b(), R.string.commons_content_oopserror, 0).show();
        }
    }

    public C5669f0(C5659d0 d0Var, C5724n0 n0Var) {
        C12932j.m33818b(d0Var, "controller");
        C12932j.m33818b(n0Var, "zendeskSdk");
        this.f14441c = d0Var;
        this.f14442d = n0Var;
    }

    /* renamed from: c */
    private final Disposable m15990c() {
        return this.f14439a.mo13337b().mo36455b((Consumer<? super T>) new C5670a<Object>(this)).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5671b<Object>(this), (Consumer<? super Throwable>) new C5672c<Object>(this));
    }

    /* renamed from: a */
    public final void mo13330a() {
        this.f14440b.add(m15990c());
    }

    /* renamed from: b */
    public final void mo13332b() {
        this.f14440b.mo36401a();
    }

    /* renamed from: a */
    public final void mo13331a(C5718k kVar) {
        C12932j.m33818b(kVar, "ticket");
        this.f14441c.mo13325d(kVar.f14520e.getId());
        this.f14442d.mo13397a(kVar.f14520e);
    }
}

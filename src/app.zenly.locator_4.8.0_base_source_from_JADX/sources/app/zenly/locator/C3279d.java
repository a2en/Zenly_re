package app.zenly.locator;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import com.snap.p327ui.recycling.prefetch.C11739b;
import kotlin.C12898h;
import kotlin.C12899i;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p263b.p264a.p266e.C7702b;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12777c;

/* renamed from: app.zenly.locator.d */
public abstract class C3279d<T> extends ZenlyController {

    /* renamed from: U */
    static final /* synthetic */ KProperty[] f9136U;

    /* renamed from: P */
    private Disposable f9137P;

    /* renamed from: Q */
    private ViewGroup f9138Q;

    /* renamed from: R */
    private boolean f9139R;

    /* renamed from: S */
    private final Lazy f9140S = C12896f.m33750a(C12898h.PUBLICATION, new C3283d(this));

    /* renamed from: T */
    private T f9141T;

    /* renamed from: app.zenly.locator.d$a */
    public static final class C3280a {
        private C3280a() {
        }

        public /* synthetic */ C3280a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.d$b */
    static final class C3281b<T> implements Consumer<View> {

        /* renamed from: e */
        final /* synthetic */ C3279d f9142e;

        C3281b(C3279d dVar) {
            this.f9142e = dVar;
        }

        /* renamed from: a */
        public final void accept(View view) {
            C3279d dVar = this.f9142e;
            C12932j.m33815a((Object) view, "contentView");
            dVar.m10396a(view, C3279d.m10392a(this.f9142e));
        }
    }

    /* renamed from: app.zenly.locator.d$c */
    static final class C3282c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C3282c f9143e = new C3282c();

        C3282c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32028a(th);
        }
    }

    /* renamed from: app.zenly.locator.d$d */
    static final class C3283d extends C12933k implements Function0<ZenlySchedulers> {

        /* renamed from: f */
        final /* synthetic */ C3279d f9144f;

        C3283d(C3279d dVar) {
            this.f9144f = dVar;
            super(0);
        }

        public final ZenlySchedulers invoke() {
            C3279d dVar = this.f9144f;
            return dVar.m10394a(dVar.mo7192B());
        }
    }

    /* renamed from: app.zenly.locator.d$e */
    static final class C3284e<T> implements Consumer<C12899i<? extends View, ? extends T>> {

        /* renamed from: e */
        final /* synthetic */ C3279d f9145e;

        C3284e(C3279d dVar) {
            this.f9145e = dVar;
        }

        /* renamed from: a */
        public final void accept(C12899i<? extends View, ? extends T> iVar) {
            View view = (View) iVar.mo37202a();
            Object b = iVar.mo37203b();
            this.f9145e.mo9739a(b);
            if (this.f9145e.mo9737G()) {
                C3279d dVar = this.f9145e;
                C12932j.m33815a((Object) view, "contentView");
                Context context = view.getContext();
                C12932j.m33815a((Object) context, "contentView.context");
                dVar.mo9738a(context, b);
            }
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3279d.class), "schedulers", "getSchedulers()Lapp/zenly/android/feature/base/scheduling/ZenlySchedulers;");
        C12946x.m33839a((C12940r) sVar);
        f9136U = new KProperty[]{sVar};
        new C3280a(null);
    }

    public C3279d(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
    }

    /* renamed from: B */
    public abstract C7702b mo7192B();

    /* renamed from: C */
    public abstract int mo9733C();

    /* renamed from: D */
    public int mo9734D() {
        return R.layout.controller_placeholder;
    }

    /* renamed from: E */
    public final T mo9735E() {
        return this.f9141T;
    }

    /* renamed from: F */
    public final ZenlySchedulers mo9736F() {
        Lazy lazy = this.f9140S;
        KProperty kProperty = f9136U[0];
        return (ZenlySchedulers) lazy.getValue();
    }

    /* renamed from: G */
    public final boolean mo9737G() {
        return this.f9139R;
    }

    /* renamed from: a */
    public void mo9738a(Context context, T t) {
        C12932j.m33818b(context, "context");
    }

    /* renamed from: b */
    public abstract C12291g<T> mo9740b(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        Disposable disposable = this.f9137P;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f9141T = null;
        this.f9139R = false;
        super.mo7066c(view);
    }

    /* renamed from: d */
    public void mo9311d(boolean z) {
        super.mo9311d(z);
        if (this.f9137P == null && z) {
            C12777c cVar = C12777c.f33323a;
            ViewGroup viewGroup = this.f9138Q;
            String str = "viewContainer";
            if (viewGroup != null) {
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                C12932j.m33815a((Object) from, "LayoutInflater.from(viewContainer.context)");
                C12291g a = m10395a(from);
                ViewGroup viewGroup2 = this.f9138Q;
                if (viewGroup2 != null) {
                    Context context = viewGroup2.getContext();
                    C12932j.m33815a((Object) context, "viewContainer.context");
                    this.f9137P = cVar.mo36957a(a, mo9740b(context)).mo36544b((C12286f) mo9736F().getUserInteractive()).mo36535a((C12286f) mo9736F().getMainThread()).mo36551d((Consumer<? super T>) new C3284e<Object>(this));
                    return;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: e */
    public void mo7061e(View view) {
        C12932j.m33818b(view, "view");
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewGroup m10392a(C3279d dVar) {
        ViewGroup viewGroup = dVar.f9138Q;
        if (viewGroup != null) {
            return viewGroup;
        }
        C12932j.m33820c("viewContainer");
        throw null;
    }

    /* renamed from: a */
    public final void mo9739a(T t) {
        this.f9141T = t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final ZenlySchedulers m10394a(C7702b bVar) {
        return C1351e.m6372a(bVar.mo19916a("AsyncPresenterController"));
    }

    /* renamed from: a */
    private final C12291g<View> m10395a(LayoutInflater layoutInflater) {
        C12291g<View> a = new C11739b(mo9736F().getInflations(), layoutInflater, null).mo34557a(mo9733C()).mo36544b((C12286f) mo9736F().getInflations()).mo36535a((C12286f) mo9736F().getMainThread()).mo36549c((Consumer<? super T>) new C3281b<Object>(this)).mo36537a((Consumer<? super Throwable>) C3282c.f9143e);
        C12932j.m33815a((Object) a, "CompletableViewPrefetche…oOnError { Timber.e(it) }");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(mo9734D(), viewGroup, false);
        if (inflate != null) {
            this.f9138Q = (ViewGroup) inflate;
            ViewGroup viewGroup2 = this.f9138Q;
            if (viewGroup2 != null) {
                return viewGroup2;
            }
            C12932j.m33820c("viewContainer");
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12956q m10396a(View view, ViewGroup viewGroup) {
        C12956q qVar;
        C7707a.m18761b("performOnCreateContentView");
        if (viewGroup != null) {
            try {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
                C7707a.m18761b("performOnContentViewCreated");
                mo7061e(view);
                C12956q qVar2 = C12956q.f33541a;
                C7707a.m18759a();
                this.f9139R = true;
                qVar = C12956q.f33541a;
            } catch (Throwable th) {
                C7707a.m18759a();
                throw th;
            }
        } else {
            qVar = null;
        }
        C7707a.m18759a();
        return qVar;
    }
}

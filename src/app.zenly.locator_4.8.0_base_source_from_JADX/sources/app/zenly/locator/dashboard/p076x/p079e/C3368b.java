package app.zenly.locator.dashboard.p076x.p079e;

import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.C2545e0.C2549b0;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.dashboard.p075w.C3327b.C3328a;
import app.zenly.locator.dashboard.p081z.C3424c;
import app.zenly.locator.dashboard.p081z.C3425d;
import app.zenly.locator.dashboard.p081z.C3426e;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7712e;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.dashboard.x.e.b */
public final class C3368b extends C12292a implements ObservableSectionController {

    /* renamed from: f */
    private final C12279e<C3318o> f9342f;

    /* renamed from: g */
    private final C12279e<C3328a> f9343g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final List<C2545e0> f9344h;

    /* renamed from: app.zenly.locator.dashboard.x.e.b$a */
    public static final class C3369a {
        private C3369a() {
        }

        public /* synthetic */ C3369a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.b$b */
    public static final class C3370b<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C3368b f9345a;

        public C3370b(C3368b bVar) {
            this.f9345a = bVar;
        }

        public final R apply(T1 t1, T2 t2) {
            C3328a aVar = (C3328a) t2;
            if (!((Boolean) t1).booleanValue() || this.f9345a.f9344h.isEmpty()) {
                return C11751f.m30859a();
            }
            int i = C3372c.f9347a[aVar.ordinal()];
            if (i == 1) {
                C3424c cVar = new C3424c(R.string.map_search_section_broadcastedInvite, aVar);
                C2545e0 e0Var = (C2545e0) C12857w.m33683g(this.f9345a.f9344h);
                if (e0Var == null) {
                    e0Var = C2549b0.f7613e;
                }
                return C7712e.f19340a.mo19921a((C11722a) cVar, C12846n.m33635a(new C3426e(e0Var)));
            } else if (i != 2) {
                if (i == 3) {
                    return C11751f.m30859a();
                }
                throw new NoWhenBranchMatchedException();
            } else if (this.f9345a.f9344h.size() < 2) {
                return C11751f.m30859a();
            } else {
                return C7712e.f19340a.mo19921a((C11722a) new C3424c(R.string.map_search_section_broadcastedInvite, aVar), C12846n.m33635a(new C3425d(this.f9345a.f9344h)));
            }
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.b$c */
    static final class C3371c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3371c f9346e = new C3371c();

        C3371c() {
        }

        /* renamed from: a */
        public final boolean mo9875a(C3318o oVar) {
            C12932j.m33818b(oVar, "it");
            return oVar.mo9818b();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo9875a((C3318o) obj));
        }
    }

    static {
        new C3369a(null);
    }

    public C3368b(C12279e<C3318o> eVar, C12279e<C3328a> eVar2, List<? extends C2545e0> list) {
        C12932j.m33818b(eVar, "queryStateObservable");
        C12932j.m33818b(eVar2, "broadcastInviteSectionObservable");
        C12932j.m33818b(list, "availableSharingOptions");
        this.f9342f = eVar;
        this.f9343g = eVar2;
        this.f9344h = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e i = this.f9342f.mo36501i(C3371c.f9346e);
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) i, "isQueryEmptyObservable");
        C12279e<Seekable<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) i, (ObservableSource<? extends T2>) this.f9343g, (BiFunction<? super T1, ? super T2, ? extends R>) new C3370b<Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…}\n            }\n        }");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "model");
    }

    public void onViewRecycled(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "viewModel");
    }
}

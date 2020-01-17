package app.zenly.locator.support.p171t0.p173g.p175i.p178e;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.base.scheduling.C1342b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.android.feature.polenta.widget.SearchBar.OnCloseListener;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p017a0.p041t.C1684a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.support.C5659d0;
import app.zenly.locator.support.C5667e0;
import app.zenly.locator.support.C5688j0;
import app.zenly.locator.support.C5724n0;
import app.zenly.locator.support.C5724n0.C5736e;
import app.zenly.locator.support.C5724n0.C5738f;
import app.zenly.locator.support.p168di.C5665b;
import app.zenly.locator.support.p171t0.C5815b;
import app.zenly.locator.support.p171t0.p173g.C5829c;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p179d.C5866a;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.p181f.C5869a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import java.io.Serializable;
import java.util.Map;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.services.C7973a0;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.support.t0.g.i.e.a */
public final class C5855a extends ZenlyController {
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final String f14809Z = f14809Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public static final String f14810a0 = f14810a0;

    /* renamed from: b0 */
    public static final C5856a f14811b0 = new C5856a(null);

    /* renamed from: P */
    private final C2918b f14812P;

    /* renamed from: Q */
    private final C5738f f14813Q;

    /* renamed from: R */
    private final C12275b f14814R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final C12275b f14815S;

    /* renamed from: T */
    private final C5815b f14816T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final ZenlySchedulers f14817U;

    /* renamed from: V */
    private C5688j0 f14818V;

    /* renamed from: W */
    private C11705b f14819W;

    /* renamed from: X */
    private C5724n0 f14820X;

    /* renamed from: Y */
    private SearchBar f14821Y;

    /* renamed from: app.zenly.locator.support.t0.g.i.e.a$a */
    public static final class C5856a {
        private C5856a() {
        }

        /* renamed from: a */
        public final C5855a mo13539a(C2918b bVar, C5738f fVar) {
            C12932j.m33818b(bVar, "placeTag");
            C12932j.m33818b(fVar, "reason");
            C3197d dVar = new C3197d(new Bundle());
            dVar.mo9609a(C5855a.f14809Z, (Serializable) bVar);
            dVar.mo9607a(C5855a.f14810a0, fVar.ordinal());
            Bundle a = dVar.mo9605a();
            C12932j.m33815a((Object) a, "BundleBuilder(Bundle())\n…                 .build()");
            return new C5855a(a);
        }

        public /* synthetic */ C5856a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.t0.g.i.e.a$b */
    public static final class C5857b implements OnCloseListener {

        /* renamed from: a */
        final /* synthetic */ C5855a f14822a;

        C5857b(C5855a aVar) {
            this.f14822a = aVar;
        }

        public void onClose() {
            this.f14822a.mo23946k().mo23997a((C8819d) this.f14822a);
        }
    }

    /* renamed from: app.zenly.locator.support.t0.g.i.e.a$c */
    static final class C5858c extends C12933k implements Function1<String, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5855a f14823f;

        /* renamed from: g */
        final /* synthetic */ View f14824g;

        C5858c(C5855a aVar, View view) {
            this.f14823f = aVar;
            this.f14824g = view;
            super(1);
        }

        /* renamed from: a */
        public final void mo13540a(String str) {
            C12932j.m33818b(str, "it");
            if (!(str.length() == 0)) {
                C5855a aVar = this.f14823f;
                View view = this.f14824g;
                C12932j.m33815a((Object) view, "view");
                Context context = view.getContext();
                C12932j.m33815a((Object) context, "view.context");
                aVar.mo13538a(context, str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo13540a((String) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.support.t0.g.i.e.a$d */
    static final class C5859d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5859d f14825e = new C5859d();

        C5859d() {
        }

        /* renamed from: a */
        public final String apply(CharSequence charSequence) {
            C12932j.m33818b(charSequence, "it");
            return C13029r.m34033f(charSequence).toString();
        }
    }

    /* renamed from: app.zenly.locator.support.t0.g.i.e.a$e */
    static final class C5860e extends C12933k implements Function3<View, View, View, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5688j0 f14826f;

        /* renamed from: g */
        final /* synthetic */ C5855a f14827g;

        /* renamed from: h */
        final /* synthetic */ Context f14828h;

        /* renamed from: app.zenly.locator.support.t0.g.i.e.a$e$a */
        static final class C5861a<T> implements Consumer<C7973a0> {

            /* renamed from: e */
            final /* synthetic */ C5860e f14829e;

            /* renamed from: app.zenly.locator.support.t0.g.i.e.a$e$a$a */
            static final class C5862a extends C12933k implements Function0<C12956q> {

                /* renamed from: f */
                final /* synthetic */ C5861a f14830f;

                C5862a(C5861a aVar) {
                    this.f14830f = aVar;
                    super(0);
                }

                public final void invoke() {
                    this.f14830f.f14829e.f14827g.mo23946k().mo24015o();
                }
            }

            C5861a(C5860e eVar) {
                this.f14829e = eVar;
            }

            /* renamed from: a */
            public final void accept(C7973a0 a0Var) {
                C5343a.m15160U().mo12797L();
                C5343a.m15160U().mo12862b(C5447b.m15477d(C5448c.m15478a()));
                BaseActivity u = this.f14829e.f14827g.mo9312u();
                if (u != null) {
                    C8831g b = u.mo8413b();
                    if (b != null && b.mo24012j()) {
                        b.mo24014n();
                    }
                }
                C5829c cVar = C5829c.f14738a;
                Activity A = this.f14829e.f14827g.mo9304A();
                C12932j.m33815a((Object) A, "requireActivity()");
                cVar.mo13510a(A, new C5862a(this));
            }
        }

        /* renamed from: app.zenly.locator.support.t0.g.i.e.a$e$b */
        static final class C5863b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            final /* synthetic */ C5860e f14831e;

            /* renamed from: f */
            final /* synthetic */ View f14832f;

            /* renamed from: g */
            final /* synthetic */ View f14833g;

            /* renamed from: h */
            final /* synthetic */ View f14834h;

            C5863b(C5860e eVar, View view, View view2, View view3) {
                this.f14831e = eVar;
                this.f14832f = view;
                this.f14833g = view2;
                this.f14834h = view3;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.f14832f.setClickable(true);
                this.f14833g.setVisibility(0);
                this.f14834h.setVisibility(8);
                C5829c cVar = C5829c.f14738a;
                Activity A = this.f14831e.f14827g.mo9304A();
                C12932j.m33815a((Object) A, "requireActivity()");
                cVar.mo13508a(A);
            }
        }

        C5860e(C5688j0 j0Var, C5855a aVar, String str, Context context) {
            this.f14826f = j0Var;
            this.f14827g = aVar;
            this.f14828h = context;
            super(3);
        }

        /* renamed from: a */
        public final void mo13542a(View view, View view2, View view3) {
            C12932j.m33818b(view, "button");
            C12932j.m33818b(view2, "text");
            C12932j.m33818b(view3, "loader");
            view.setClickable(false);
            view2.setVisibility(8);
            view3.setVisibility(0);
            Disposable a = C5855a.m16318c(this.f14827g).mo13394a(this.f14826f.mo13347a(this.f14828h, C5855a.m16318c(this.f14827g))).mo36428a((C12286f) this.f14827g.f14817U.getMainThread()).mo36412a((Consumer<? super T>) new C5861a<Object>(this), (Consumer<? super Throwable>) new C5863b<Object>(this, view, view2, view3));
            C12932j.m33815a((Object) a, "zendeskSdk.saveTicket(it…))\n                    })");
            C12773a.m33432a(a, this.f14827g.f14815S);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo13542a((View) obj, (View) obj2, (View) obj3);
            return C12956q.f33541a;
        }
    }

    public C5855a(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        Serializable serializable = bundle.getSerializable(f14809Z);
        if (serializable != null) {
            this.f14812P = (C2918b) serializable;
            this.f14813Q = C5738f.values()[bundle.getInt(f14810a0)];
            this.f14814R = new C12275b();
            this.f14815S = new C12275b();
            this.f14816T = new C5815b();
            this.f14817U = C1351e.m6372a(C5667e0.f14437b.mo19916a("placePicker"));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.models.Place.Tag");
    }

    /* renamed from: c */
    public static final /* synthetic */ C5724n0 m16318c(C5855a aVar) {
        C5724n0 n0Var = aVar.f14820X;
        if (n0Var != null) {
            return n0Var;
        }
        C12932j.m33820c("zendeskSdk");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f14814R.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        this.f14820X = C5665b.m15987a(context).mo13329a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C8819d l = mo23947l();
        if (!(l instanceof C5659d0)) {
            l = null;
        }
        C5659d0 d0Var = (C5659d0) l;
        this.f14818V = d0Var != null ? d0Var.mo7192B() : null;
        C11705b bVar = this.f14819W;
        if (bVar != null) {
            C12773a.m33432a(bVar.mo34464b(), this.f14814R);
        } else {
            C12932j.m33820c("adapter");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f14815S.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C12932j.m33818b(layoutInflater2, "inflater");
        C12932j.m33818b(viewGroup2, "container");
        View inflate = layoutInflater2.inflate(R.layout.controller_place_picker, viewGroup2, false);
        int i = C5864b.f14835a[this.f14812P.ordinal()];
        int i2 = i != 1 ? i != 2 ? i != 3 ? C7674a.f19294a : R.string.support_places_picker_title_work : R.string.support_places_picker_title_school : R.string.support_places_picker_title_home;
        String str = "view";
        if (C7674a.m18692a(i2)) {
            C12932j.m33815a((Object) inflate, str);
            ((ScreenBar) inflate.findViewById(C3891l.screen_bar)).setTitle(i2);
        }
        C12932j.m33815a((Object) inflate, str);
        SearchBar searchBar = (SearchBar) inflate.findViewById(C3891l.search_bar);
        String str2 = "view.search_bar";
        C12932j.m33815a((Object) searchBar, str2);
        this.f14821Y = searchBar;
        SearchBar searchBar2 = this.f14821Y;
        String str3 = "searchBar";
        if (searchBar2 != null) {
            searchBar2.setCloseListener(new C5857b(this));
            SearchBar searchBar3 = this.f14821Y;
            if (searchBar3 != null) {
                searchBar3.setSubmitListener(new C5858c(this, inflate));
                SearchBar searchBar4 = this.f14821Y;
                if (searchBar4 != null) {
                    searchBar4.performClick();
                    C11700c cVar = new C11700c();
                    Context context = inflate.getContext();
                    String str4 = "view.context";
                    C12932j.m33815a((Object) context, str4);
                    Disposable b = cVar.mo34449b(new C5866a(this, context));
                    C12932j.m33815a((Object) b, "bus.subscribe(EventDispa…  view.context\n        ))");
                    C12773a.m33432a(b, this.f14815S);
                    C11727c cVar2 = new C11727c(C12846n.m33635a(C5865c.class));
                    EventDispatcher a = cVar.mo34447a();
                    C12932j.m33815a((Object) a, "bus.eventDispatcher");
                    C1342b computation = this.f14817U.getComputation();
                    C1342b mainThread = this.f14817U.getMainThread();
                    Context context2 = inflate.getContext();
                    C12932j.m33815a((Object) context2, str4);
                    C5815b bVar = this.f14816T;
                    SearchBar searchBar5 = (SearchBar) inflate.findViewById(C3891l.search_bar);
                    C12932j.m33815a((Object) searchBar5, str2);
                    C12279e d = C1684a.m7016a(searchBar5).mo36501i(C5859d.f14825e).mo36477d();
                    C12932j.m33815a((Object) d, "RxSearchBar.textChanges(…  .distinctUntilChanged()");
                    C11705b bVar2 = new C11705b(cVar2, a, computation, mainThread, C12846n.m33635a(new C5869a(context2, bVar, d)), null, 32, null);
                    this.f14819W = bVar2;
                    RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C3891l.place_picker_recycler_view);
                    C12932j.m33815a((Object) recyclerView, "view.place_picker_recycler_view");
                    C11705b bVar3 = this.f14819W;
                    if (bVar3 != null) {
                        recyclerView.setAdapter(bVar3);
                        return inflate;
                    }
                    C12932j.m33820c("adapter");
                    throw null;
                }
                C12932j.m33820c(str3);
                throw null;
            }
            C12932j.m33820c(str3);
            throw null;
        }
        C12932j.m33820c(str3);
        throw null;
    }

    /* renamed from: a */
    public final void mo13538a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str2, "placeAddress");
        SearchBar searchBar = this.f14821Y;
        if (searchBar != null) {
            C1297b.m6239a((View) searchBar, false);
            C5688j0 j0Var = this.f14818V;
            if (j0Var != null) {
                j0Var.mo13357d().clear();
                Map d = j0Var.mo13357d();
                Integer valueOf = Integer.valueOf(this.f14812P.mo9024a().getNumber());
                C5736e eVar = new C5736e(this.f14813Q, null, null, str, 6, null);
                d.put(valueOf, eVar);
                C5829c cVar = C5829c.f14738a;
                Activity A = mo9304A();
                C12932j.m33815a((Object) A, "requireActivity()");
                cVar.mo13509a(A, this.f14812P, str, this.f14813Q, new C5860e(j0Var, this, str2, context));
                return;
            }
            return;
        }
        C12932j.m33820c("searchBar");
        throw null;
    }
}

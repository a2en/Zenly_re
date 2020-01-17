package app.zenly.locator.support.p171t0.p173g;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
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
import app.zenly.locator.support.p171t0.p173g.p174h.C5847a;
import app.zenly.locator.support.p171t0.p173g.p187j.C5885a;
import app.zenly.locator.support.p194u0.C5917a;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.services.C7973a0;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.support.t0.g.f */
public final class C5840f extends ZenlyController {
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final String f14764X = f14764X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public static final String f14765Y = f14765Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public static final String f14766Z = f14766Z;

    /* renamed from: a0 */
    public static final C5841a f14767a0 = new C5841a(null);

    /* renamed from: P */
    private final C2918b f14768P;

    /* renamed from: Q */
    private final String f14769Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C12275b f14770R;

    /* renamed from: S */
    private final C5815b f14771S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final ZenlySchedulers f14772T;

    /* renamed from: U */
    private C5688j0 f14773U;

    /* renamed from: V */
    private C11705b f14774V;

    /* renamed from: W */
    private C5724n0 f14775W;

    /* renamed from: app.zenly.locator.support.t0.g.f$a */
    public static final class C5841a {
        private C5841a() {
        }

        /* renamed from: a */
        public final C5840f mo13517a(long j, C2918b bVar, String str) {
            C12932j.m33818b(bVar, "placeTag");
            C12932j.m33818b(str, "placeAddress");
            C3197d dVar = new C3197d(new Bundle());
            dVar.mo9608a(C5840f.f14764X, j);
            dVar.mo9609a(C5840f.f14765Y, (Serializable) bVar);
            dVar.mo9610a(C5840f.f14766Z, str);
            Bundle a = dVar.mo9605a();
            C12932j.m33815a((Object) a, "BundleBuilder(Bundle())\n…                 .build()");
            return new C5840f(a);
        }

        public /* synthetic */ C5841a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.t0.g.f$b */
    static final class C5842b extends C12933k implements Function3<View, View, View, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C5688j0 f14776f;

        /* renamed from: g */
        final /* synthetic */ C5840f f14777g;

        /* renamed from: h */
        final /* synthetic */ Context f14778h;

        /* renamed from: app.zenly.locator.support.t0.g.f$b$a */
        static final class C5843a<T> implements Consumer<C7973a0> {

            /* renamed from: e */
            final /* synthetic */ C5842b f14779e;

            /* renamed from: app.zenly.locator.support.t0.g.f$b$a$a */
            static final class C5844a extends C12933k implements Function0<C12956q> {

                /* renamed from: f */
                final /* synthetic */ C5843a f14780f;

                C5844a(C5843a aVar) {
                    this.f14780f = aVar;
                    super(0);
                }

                public final void invoke() {
                    this.f14780f.f14779e.f14777g.mo23946k().mo24015o();
                }
            }

            C5843a(C5842b bVar) {
                this.f14779e = bVar;
            }

            /* renamed from: a */
            public final void accept(C7973a0 a0Var) {
                C5343a.m15160U().mo12797L();
                C5343a.m15160U().mo12862b(C5447b.m15477d(C5448c.m15478a()));
                BaseActivity u = this.f14779e.f14777g.mo9312u();
                if (u != null) {
                    C8831g b = u.mo8413b();
                    if (b != null && b.mo24012j()) {
                        b.mo24014n();
                    }
                }
                C5829c cVar = C5829c.f14738a;
                Activity A = this.f14779e.f14777g.mo9304A();
                C12932j.m33815a((Object) A, "requireActivity()");
                cVar.mo13510a(A, new C5844a(this));
            }
        }

        /* renamed from: app.zenly.locator.support.t0.g.f$b$b */
        static final class C5845b<T> implements Consumer<Throwable> {

            /* renamed from: e */
            final /* synthetic */ C5842b f14781e;

            /* renamed from: f */
            final /* synthetic */ View f14782f;

            /* renamed from: g */
            final /* synthetic */ View f14783g;

            /* renamed from: h */
            final /* synthetic */ View f14784h;

            C5845b(C5842b bVar, View view, View view2, View view3) {
                this.f14781e = bVar;
                this.f14782f = view;
                this.f14783g = view2;
                this.f14784h = view3;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.f14782f.setClickable(true);
                this.f14783g.setVisibility(0);
                this.f14784h.setVisibility(8);
                C5829c cVar = C5829c.f14738a;
                Activity A = this.f14781e.f14777g.mo9304A();
                C12932j.m33815a((Object) A, "requireActivity()");
                cVar.mo13508a(A);
            }
        }

        C5842b(C5688j0 j0Var, C5840f fVar, C2918b bVar, C5738f fVar2, long j, String str, Context context) {
            this.f14776f = j0Var;
            this.f14777g = fVar;
            this.f14778h = context;
            super(3);
        }

        /* renamed from: a */
        public final void mo13518a(View view, View view2, View view3) {
            C12932j.m33818b(view, "button");
            C12932j.m33818b(view2, "text");
            C12932j.m33818b(view3, "loader");
            view.setClickable(false);
            view2.setVisibility(8);
            view3.setVisibility(0);
            Disposable a = C5840f.m16291c(this.f14777g).mo13394a(this.f14776f.mo13347a(this.f14778h, C5840f.m16291c(this.f14777g))).mo36428a((C12286f) this.f14777g.f14772T.getMainThread()).mo36412a((Consumer<? super T>) new C5843a<Object>(this), (Consumer<? super Throwable>) new C5845b<Object>(this, view, view2, view3));
            C12932j.m33815a((Object) a, "zendeskSdk.saveTicket(it…))\n                    })");
            C12773a.m33432a(a, this.f14777g.f14770R);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo13518a((View) obj, (View) obj2, (View) obj3);
            return C12956q.f33541a;
        }
    }

    public C5840f(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        bundle.getLong(f14764X);
        Serializable serializable = bundle.getSerializable(f14765Y);
        if (serializable != null) {
            this.f14768P = (C2918b) serializable;
            String string = bundle.getString(f14766Z);
            if (string != null) {
                C12932j.m33815a((Object) string, "args.getString(KEY_PLACE_ADDRESS)!!");
                this.f14769Q = string;
                this.f14770R = new C12275b();
                this.f14771S = new C5815b();
                this.f14772T = C1351e.m6372a(C5667e0.f14437b.mo19916a("PlaceIssues"));
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.models.Place.Tag");
    }

    /* renamed from: c */
    public static final /* synthetic */ C5724n0 m16291c(C5840f fVar) {
        C5724n0 n0Var = fVar.f14775W;
        if (n0Var != null) {
            return n0Var;
        }
        C12932j.m33820c("zendeskSdk");
        throw null;
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
        this.f14775W = C5665b.m15987a(context).mo13329a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C8819d l = mo23947l();
        C5688j0 j0Var = null;
        if (!(l instanceof C5659d0)) {
            l = null;
        }
        C5659d0 d0Var = (C5659d0) l;
        if (d0Var != null) {
            j0Var = d0Var.mo7192B();
        }
        this.f14773U = j0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f14770R.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_ticket_wrong_place_reason, viewGroup, false);
        int i = C5846g.f14785a[this.f14768P.ordinal()];
        int i2 = i != 1 ? i != 2 ? i != 3 ? C7674a.f19294a : R.string.support_places_title_work : R.string.support_places_title_school : R.string.support_places_title_home;
        String str = "view";
        if (C7674a.m18692a(i2)) {
            C12932j.m33815a((Object) inflate, str);
            ((ScreenBar) inflate.findViewById(C3891l.screen_bar)).setTitle(i2);
        }
        C12932j.m33815a((Object) inflate, str);
        ((ScreenBar) inflate.findViewById(C3891l.screen_bar)).setSubtitle(this.f14769Q);
        C11700c cVar = new C11700c();
        C11727c cVar2 = new C11727c(C12846n.m33635a(C5827a.class));
        EventDispatcher a = cVar.mo34447a();
        C12932j.m33815a((Object) a, "bus.eventDispatcher");
        C11705b bVar = new C11705b(cVar2, a, this.f14772T.getComputation(), this.f14772T.getMainThread(), C12846n.m33635a(new C5885a(this.f14768P, this.f14769Q, this.f14771S)), null, 32, null);
        this.f14774V = bVar;
        Context context = inflate.getContext();
        C12932j.m33815a((Object) context, "view.context");
        Disposable b = cVar.mo34449b(new C5847a(this, context));
        C12932j.m33815a((Object) b, "bus.subscribe(EventDispa…roxy(this, view.context))");
        C12773a.m33432a(b, this.f14770R);
        C11705b bVar2 = this.f14774V;
        String str2 = "adapter";
        if (bVar2 != null) {
            C12773a.m33432a(bVar2.mo34464b(), this.f14770R);
            ((RecyclerView) inflate.findViewById(C3891l.options)).mo5045a((C1074l) new C5917a(inflate.getResources().getDimensionPixelOffset(R.dimen.spacing_200)));
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C3891l.options);
            C12932j.m33815a((Object) recyclerView, "view.options");
            C11705b bVar3 = this.f14774V;
            if (bVar3 != null) {
                recyclerView.setAdapter(bVar3);
                return inflate;
            }
            C12932j.m33820c(str2);
            throw null;
        }
        C12932j.m33820c(str2);
        throw null;
    }

    /* renamed from: a */
    public final void mo13516a(Context context, long j, C2918b bVar, String str, C5738f fVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(bVar, "placeTag");
        C12932j.m33818b(str, "placeAddress");
        C12932j.m33818b(fVar, "reason");
        C5688j0 j0Var = this.f14773U;
        if (j0Var != null) {
            j0Var.mo13357d().clear();
            Map d = j0Var.mo13357d();
            Integer valueOf = Integer.valueOf(bVar.mo9024a().getNumber());
            C5736e eVar = new C5736e(fVar, null, Long.valueOf(j), str, 2, null);
            d.put(valueOf, eVar);
            C5829c cVar = C5829c.f14738a;
            Activity A = mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            C5738f fVar2 = fVar;
            C5842b bVar2 = new C5842b(j0Var, this, bVar, fVar2, j, str, context);
            cVar.mo13509a(A, bVar, str, fVar2, bVar2);
        }
    }
}

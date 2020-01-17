package app.zenly.locator.support.p171t0.p173g;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.report.base.ReportFeedbackController;
import app.zenly.locator.support.C5659d0;
import app.zenly.locator.support.C5667e0;
import app.zenly.locator.support.C5688j0;
import app.zenly.locator.support.C5724n0;
import app.zenly.locator.support.C5724n0.C5736e;
import app.zenly.locator.support.C5724n0.C5738f;
import app.zenly.locator.support.p168di.C5665b;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import java.io.Serializable;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.services.C7973a0;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.support.t0.g.d */
public final class C5832d extends ReportFeedbackController {
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final String f14741h0 = f14741h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static final String f14742i0 = f14742i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public static final String f14743j0 = f14743j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public static final String f14744k0 = f14744k0;

    /* renamed from: l0 */
    public static final C5833a f14745l0 = new C5833a(null);
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final long f14746Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final C2918b f14747a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public final String f14748b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C5738f f14749c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public final ZenlySchedulers f14750d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C12275b f14751e0;

    /* renamed from: f0 */
    private C5724n0 f14752f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C5688j0 f14753g0;

    /* renamed from: app.zenly.locator.support.t0.g.d$a */
    public static final class C5833a {
        private C5833a() {
        }

        /* renamed from: a */
        public final C5832d mo13512a(long j, C2918b bVar, String str, C5738f fVar) {
            C12932j.m33818b(bVar, "placeTag");
            C12932j.m33818b(str, "placeAddress");
            C12932j.m33818b(fVar, "reason");
            C3197d dVar = new C3197d(new Bundle());
            dVar.mo9608a(C5832d.f14741h0, j);
            dVar.mo9609a(C5832d.f14742i0, (Serializable) bVar);
            dVar.mo9610a(C5832d.f14743j0, str);
            dVar.mo9607a(C5832d.f14744k0, fVar.ordinal());
            Bundle a = dVar.mo9605a();
            C12932j.m33815a((Object) a, "BundleBuilder(Bundle())\n…                 .build()");
            return new C5832d(a);
        }

        public /* synthetic */ C5833a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.support.t0.g.d$b */
    static final class C5834b implements OnReasonListener {

        /* renamed from: a */
        final /* synthetic */ C5832d f14754a;

        /* renamed from: app.zenly.locator.support.t0.g.d$b$a */
        static final class C5835a extends C12933k implements Function3<View, View, View, C12956q> {

            /* renamed from: f */
            final /* synthetic */ C5688j0 f14755f;

            /* renamed from: g */
            final /* synthetic */ C5834b f14756g;

            /* renamed from: app.zenly.locator.support.t0.g.d$b$a$a */
            static final class C5836a<T> implements Consumer<C7973a0> {

                /* renamed from: e */
                final /* synthetic */ C5835a f14757e;

                /* renamed from: app.zenly.locator.support.t0.g.d$b$a$a$a */
                static final class C5837a extends C12933k implements Function0<C12956q> {

                    /* renamed from: f */
                    final /* synthetic */ C5836a f14758f;

                    C5837a(C5836a aVar) {
                        this.f14758f = aVar;
                        super(0);
                    }

                    public final void invoke() {
                        this.f14758f.f14757e.f14756g.f14754a.mo23946k().mo24015o();
                    }
                }

                C5836a(C5835a aVar) {
                    this.f14757e = aVar;
                }

                /* renamed from: a */
                public final void accept(C7973a0 a0Var) {
                    C5343a.m15160U().mo12797L();
                    C5343a.m15160U().mo12862b(C5447b.m15477d(C5448c.m15478a()));
                    BaseActivity u = this.f14757e.f14756g.f14754a.mo9312u();
                    if (u != null) {
                        C8831g b = u.mo8413b();
                        if (b != null && b.mo24012j()) {
                            b.mo24014n();
                        }
                    }
                    C5829c cVar = C5829c.f14738a;
                    Activity A = this.f14757e.f14756g.f14754a.mo9304A();
                    C12932j.m33815a((Object) A, "requireActivity()");
                    cVar.mo13510a(A, new C5837a(this));
                }
            }

            /* renamed from: app.zenly.locator.support.t0.g.d$b$a$b */
            static final class C5838b<T> implements Consumer<Throwable> {

                /* renamed from: e */
                final /* synthetic */ C5835a f14759e;

                /* renamed from: f */
                final /* synthetic */ View f14760f;

                /* renamed from: g */
                final /* synthetic */ View f14761g;

                /* renamed from: h */
                final /* synthetic */ View f14762h;

                C5838b(C5835a aVar, View view, View view2, View view3) {
                    this.f14759e = aVar;
                    this.f14760f = view;
                    this.f14761g = view2;
                    this.f14762h = view3;
                }

                /* renamed from: a */
                public final void accept(Throwable th) {
                    this.f14760f.setClickable(true);
                    this.f14761g.setVisibility(0);
                    this.f14762h.setVisibility(8);
                    C5829c cVar = C5829c.f14738a;
                    Activity A = this.f14759e.f14756g.f14754a.mo9304A();
                    C12932j.m33815a((Object) A, "requireActivity()");
                    cVar.mo13508a(A);
                }
            }

            C5835a(C5688j0 j0Var, C5834b bVar, String str) {
                this.f14755f = j0Var;
                this.f14756g = bVar;
                super(3);
            }

            /* renamed from: a */
            public final void mo13513a(View view, View view2, View view3) {
                C12932j.m33818b(view, "button");
                C12932j.m33818b(view2, "text");
                C12932j.m33818b(view3, "loader");
                view.setClickable(false);
                view2.setVisibility(8);
                view3.setVisibility(0);
                C5724n0 h = C5832d.m16276h(this.f14756g.f14754a);
                C5688j0 j0Var = this.f14755f;
                Activity A = this.f14756g.f14754a.mo9304A();
                C12932j.m33815a((Object) A, "requireActivity()");
                Disposable a = h.mo13394a(j0Var.mo13347a(A, C5832d.m16276h(this.f14756g.f14754a))).mo36428a((C12286f) this.f14756g.f14754a.f14750d0.getMainThread()).mo36412a((Consumer<? super T>) new C5836a<Object>(this), (Consumer<? super Throwable>) new C5838b<Object>(this, view, view2, view3));
                C12932j.m33815a((Object) a, "zendeskSdk.saveTicket(it…                       })");
                C12773a.m33432a(a, this.f14756g.f14754a.f14751e0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                mo13513a((View) obj, (View) obj2, (View) obj3);
                return C12956q.f33541a;
            }
        }

        C5834b(C5832d dVar) {
            this.f14754a = dVar;
        }

        public final void onReasonSelected(String str) {
            C5688j0 g = this.f14754a.f14753g0;
            if (g != null) {
                C5499a aVar = C5498a.f14119e;
                Activity A = this.f14754a.mo9304A();
                String str2 = "requireActivity()";
                C12932j.m33815a((Object) A, str2);
                C5498a.m15602a(aVar.mo13125a(A), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
                g.mo13357d().clear();
                g.mo13357d().put(Integer.valueOf(this.f14754a.f14747a0.mo9024a().getNumber()), new C5736e(this.f14754a.f14749c0, str, Long.valueOf(this.f14754a.f14746Z), this.f14754a.f14748b0));
                C5829c cVar = C5829c.f14738a;
                Activity A2 = this.f14754a.mo9304A();
                C12932j.m33815a((Object) A2, str2);
                cVar.mo13509a(A2, this.f14754a.f14747a0, this.f14754a.f14748b0, this.f14754a.f14749c0, new C5835a(g, this, str));
            }
        }
    }

    public C5832d(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        this.f14746Z = bundle.getLong(f14741h0);
        Serializable serializable = bundle.getSerializable(f14742i0);
        if (serializable != null) {
            this.f14747a0 = (C2918b) serializable;
            String string = bundle.getString(f14743j0);
            if (string != null) {
                C12932j.m33815a((Object) string, "args.getString(KEY_PLACE_ADDRESS)!!");
                this.f14748b0 = string;
                this.f14749c0 = C5738f.values()[bundle.getInt(f14744k0)];
                this.f14750d0 = C1351e.m6372a(C5667e0.f14437b.mo19916a("reportPlaceIssue"));
                this.f14751e0 = new C12275b();
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.models.Place.Tag");
    }

    /* renamed from: h */
    public static final /* synthetic */ C5724n0 m16276h(C5832d dVar) {
        C5724n0 n0Var = dVar.f14752f0;
        if (n0Var != null) {
            return n0Var;
        }
        C12932j.m33820c("zendeskSdk");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo7192B() {
        C5499a aVar = C5498a.f14119e;
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        C5498a.m15602a(aVar.mo13125a(A), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        mo23946k().mo23997a((C8819d) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        this.f14752f0 = C5665b.m15987a(context).mo13329a();
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
        this.f14753g0 = j0Var;
        EditText editText = this.f13739V;
        C12932j.m33815a((Object) editText, "mFeedback");
        C1297b.m6241b(editText);
        mo12770a((OnReasonListener) new C5834b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f14751e0.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View a = super.mo7054a(layoutInflater, viewGroup);
        C12932j.m33815a((Object) a, "super.onCreateView(inflater, container)");
        RelativeLayout relativeLayout = (RelativeLayout) a.findViewById(C3891l.report_feedback_description_container);
        C12932j.m33815a((Object) relativeLayout, "view.report_feedback_description_container");
        relativeLayout.setVisibility(8);
        AppCompatTextView appCompatTextView = (AppCompatTextView) a.findViewById(C3891l.report_feedback_tag);
        C12932j.m33815a((Object) appCompatTextView, "view.report_feedback_tag");
        appCompatTextView.setVisibility(8);
        ((ScreenBar) a.findViewById(C3891l.screen_bar)).setTitle((int) R.string.support_places_other_home);
        int i = C5839e.f14763a[this.f14747a0.ordinal()];
        if (i == 1) {
            this.f13739V.setHint(R.string.support_places_other_placeholder_home);
        } else if (i == 2) {
            this.f13739V.setHint(R.string.support_places_other_placeholder_school);
        } else if (i != 3) {
            this.f13739V.setHint(null);
        } else {
            this.f13739V.setHint(R.string.support_places_other_placeholder_work);
        }
        return a;
    }
}

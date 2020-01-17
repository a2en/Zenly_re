package app.zenly.locator.map.view;

import android.content.Context;
import android.os.Handler;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import androidx.core.content.C0540a;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.MapControllerContract.C2457a;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.models.C2874c0.C2875a;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2908w.C2911c;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.map.text.C4301d;
import app.zenly.locator.map.view.animator.CapsuleViewAnimator;
import app.zenly.locator.map.view.animator.CapsuleViewAnimator.OnCompleteListener;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

public final class CapsulesStatesView extends LinearLayout implements Callback {

    /* renamed from: g0 */
    static final /* synthetic */ KProperty[] f11608g0;

    /* renamed from: A */
    private Function1<? super C2457a, C12956q> f11609A;

    /* renamed from: B */
    private final ViewVisibilityAggregatedHelper<?> f11610B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final Handler f11611C;

    /* renamed from: D */
    private final Provider<C2718k5> f11612D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final Map<View, CapsuleViewAnimator> f11613E;

    /* renamed from: F */
    private final Lazy f11614F;

    /* renamed from: G */
    private final Lazy f11615G;

    /* renamed from: H */
    private final Lazy f11616H;

    /* renamed from: I */
    private final Lazy f11617I;

    /* renamed from: J */
    private final Lazy f11618J;

    /* renamed from: K */
    private final Lazy f11619K;

    /* renamed from: L */
    private final Lazy f11620L;

    /* renamed from: M */
    private final Lazy f11621M;

    /* renamed from: N */
    private final Lazy f11622N;

    /* renamed from: O */
    private final Lazy f11623O;

    /* renamed from: P */
    private final Lazy f11624P;

    /* renamed from: Q */
    private final Lazy f11625Q;

    /* renamed from: R */
    private final OnClickListener f11626R;

    /* renamed from: S */
    private final Runnable f11627S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public MapCapsuleView f11628T;

    /* renamed from: U */
    private C4337c f11629U;

    /* renamed from: V */
    private boolean f11630V;

    /* renamed from: W */
    private long f11631W;

    /* renamed from: a0 */
    private boolean f11632a0;

    /* renamed from: b0 */
    private final C4356v f11633b0;

    /* renamed from: c0 */
    private final C4355u f11634c0;

    /* renamed from: d0 */
    private final C4354t f11635d0;

    /* renamed from: e0 */
    private final C4358x f11636e0;

    /* renamed from: f0 */
    private final C4357w f11637f0;

    /* renamed from: v */
    private Listener f11638v;

    /* renamed from: w */
    private C2896p f11639w;

    /* renamed from: x */
    private C2458b f11640x;

    /* renamed from: y */
    private boolean f11641y;

    /* renamed from: z */
    private C2457a f11642z;

    public interface Listener {
        void onCalloutClick(C2457a aVar);
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$a */
    public static final class C4335a implements Provider<C2718k5> {

        /* renamed from: a */
        final /* synthetic */ Context f11643a;

        public C4335a(Context context) {
            this.f11643a = context;
        }

        public C2718k5 get() {
            return C2666b.m9049a(this.f11643a).mo8763a();
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$b */
    public static final class C4336b {
        private C4336b() {
        }

        public /* synthetic */ C4336b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$c */
    private abstract class C4337c implements Runnable {
        public C4337c() {
        }

        /* renamed from: a */
        public abstract void mo11409a(C2896p pVar);

        /* renamed from: a */
        public abstract boolean mo11410a();

        /* renamed from: b */
        public final void mo11411b() {
            CapsulesStatesView.this.f11611C.removeCallbacks(this);
        }

        public void run() {
            CapsulesStatesView.this.f11611C.removeCallbacks(this);
            C2896p friend = CapsulesStatesView.this.getFriend();
            if (friend != null && mo11410a()) {
                mo11409a(friend);
                CapsulesStatesView.this.f11611C.postDelayed(this, 1000);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$d */
    static final class C4338d extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11645f;

        C4338d(CapsulesStatesView capsulesStatesView) {
            this.f11645f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11645f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_blurred);
            C12932j.m33815a((Object) viewStub, "capsule_blurred");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$e */
    static final class C4339e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CapsulesStatesView f11646e;

        C4339e(CapsulesStatesView capsulesStatesView) {
            this.f11646e = capsulesStatesView;
        }

        public final void onClick(View view) {
            Listener listener = this.f11646e.getListener();
            if (listener != null) {
                listener.onCalloutClick(this.f11646e.getState());
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$f */
    static final class C4340f extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11647f;

        C4340f(CapsulesStatesView capsulesStatesView) {
            this.f11647f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11647f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_heading);
            C12932j.m33815a((Object) viewStub, "capsule_heading");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$g */
    static final class C4341g extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11648f;

        C4341g(CapsulesStatesView capsulesStatesView) {
            this.f11648f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11648f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_heading_outdated_gray);
            C12932j.m33815a((Object) viewStub, "capsule_heading_outdated_gray");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$h */
    static final class C4342h extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11649f;

        C4342h(CapsulesStatesView capsulesStatesView) {
            this.f11649f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11649f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_heading_outdated_pink);
            C12932j.m33815a((Object) viewStub, "capsule_heading_outdated_pink");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$i */
    static final class C4343i extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11650f;

        C4343i(CapsulesStatesView capsulesStatesView) {
            this.f11650f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11650f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_live);
            C12932j.m33815a((Object) viewStub, "capsule_live");
            return capsulesStatesView.m12911a(viewStub, false);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$j */
    static final class C4344j extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11651f;

        C4344j(CapsulesStatesView capsulesStatesView) {
            this.f11651f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11651f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_location_disabled);
            C12932j.m33815a((Object) viewStub, "capsule_location_disabled");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$k */
    static final class C4345k extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11652f;

        C4345k(CapsulesStatesView capsulesStatesView) {
            this.f11652f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11652f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_low_precision);
            C12932j.m33815a((Object) viewStub, "capsule_low_precision");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$l */
    static final class C4346l extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11653f;

        C4346l(CapsulesStatesView capsulesStatesView) {
            this.f11653f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11653f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_outdated_gray);
            C12932j.m33815a((Object) viewStub, "capsule_outdated_gray");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$m */
    static final class C4347m extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11654f;

        C4347m(CapsulesStatesView capsulesStatesView) {
            this.f11654f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11654f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_outdated_pink);
            C12932j.m33815a((Object) viewStub, "capsule_outdated_pink");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$n */
    static final class C4348n extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11655f;

        C4348n(CapsulesStatesView capsulesStatesView) {
            this.f11655f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11655f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_sleeping);
            C12932j.m33815a((Object) viewStub, "capsule_sleeping");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$o */
    static final class C4349o extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11656f;

        C4349o(CapsulesStatesView capsulesStatesView) {
            this.f11656f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11656f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_sleeping_outdated_gray);
            C12932j.m33815a((Object) viewStub, "capsule_sleeping_outdated_gray");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$p */
    static final class C4350p extends C12933k implements Function0<MapCapsuleView> {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11657f;

        C4350p(CapsulesStatesView capsulesStatesView) {
            this.f11657f = capsulesStatesView;
            super(0);
        }

        public final MapCapsuleView invoke() {
            CapsulesStatesView capsulesStatesView = this.f11657f;
            ViewStub viewStub = (ViewStub) capsulesStatesView.findViewById(C3891l.capsule_sleeping_outdated_pink);
            C12932j.m33815a((Object) viewStub, "capsule_sleeping_outdated_pink");
            return capsulesStatesView.m12911a(viewStub, true);
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$q */
    static final class C4351q implements Runnable {

        /* renamed from: e */
        final /* synthetic */ CapsulesStatesView f11658e;

        C4351q(CapsulesStatesView capsulesStatesView) {
            this.f11658e = capsulesStatesView;
        }

        public final void run() {
            this.f11658e.m12927g();
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$r */
    static final class C4352r extends C12933k implements Function1<C2457a, C12956q> {

        /* renamed from: f */
        public static final C4352r f11659f = new C4352r();

        C4352r() {
            super(1);
        }

        /* renamed from: a */
        public final void mo11415a(C2457a aVar) {
            C12932j.m33818b(aVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11415a((C2457a) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$s */
    public static final class C4353s implements OnCompleteListener {

        /* renamed from: a */
        final /* synthetic */ CapsulesStatesView f11660a;

        /* renamed from: b */
        final /* synthetic */ MapCapsuleView f11661b;

        C4353s(CapsulesStatesView capsulesStatesView, MapCapsuleView mapCapsuleView) {
            this.f11660a = capsulesStatesView;
            this.f11661b = mapCapsuleView;
        }

        public void onComplete(boolean z) {
            MapCapsuleView mapCapsuleView = this.f11661b;
            if (mapCapsuleView != null && C12932j.m33817a((Object) mapCapsuleView, (Object) this.f11660a.f11628T)) {
                Object obj = this.f11660a.f11613E.get(mapCapsuleView);
                if (obj != null) {
                    CapsuleViewAnimator.m13048b((CapsuleViewAnimator) obj, 0, null, 3, null);
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$t */
    public static final class C4354t extends C4337c {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11662f;

        /* renamed from: g */
        final /* synthetic */ Context f11663g;

        C4354t(CapsulesStatesView capsulesStatesView, Context context) {
            this.f11662f = capsulesStatesView;
            this.f11663g = context;
            super();
        }

        /* renamed from: a */
        public boolean mo11410a() {
            return this.f11662f.m12917b();
        }

        /* renamed from: a */
        public void mo11409a(C2896p pVar) {
            String str;
            C12932j.m33818b(pVar, "friend");
            C2918b d = pVar.f8222z.mo8995d().mo9005c().mo9017d();
            MapCapsuleView b = this.f11662f.f11628T;
            if (b != null) {
                int i = C4386c.f11848b[d.ordinal()];
                if (i == 1) {
                    str = this.f11663g.getString(R.string.contextView_capsule_heading_changedFromHome);
                } else if (i == 2) {
                    str = this.f11663g.getString(R.string.contextView_capsule_heading_changedFromWork);
                } else if (i == 3) {
                    str = this.f11663g.getString(R.string.contextView_capsule_heading_changedFromSchool);
                } else if (i == 4) {
                    str = "";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                b.setTitle(str);
            }
            MapCapsuleView b2 = this.f11662f.f11628T;
            if (b2 != null) {
                b2.setText(DateUtils.getRelativeTimeSpanString(this.f11662f.getLastTcTimestamp()));
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$u */
    public static final class C4355u extends C4337c {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11664f;

        /* renamed from: g */
        final /* synthetic */ Context f11665g;

        C4355u(CapsulesStatesView capsulesStatesView, Context context) {
            this.f11664f = capsulesStatesView;
            this.f11665g = context;
            super();
        }

        /* renamed from: a */
        public boolean mo11410a() {
            return this.f11664f.m12914a();
        }

        /* renamed from: a */
        public void mo11409a(C2896p pVar) {
            String str;
            C12932j.m33818b(pVar, "friend");
            if (pVar.f8222z.mo8997f() == C2911c.STATIC) {
                MapCapsuleView b = this.f11664f.f11628T;
                if (b != null) {
                    b.setTitle(null);
                }
                MapCapsuleView b2 = this.f11664f.f11628T;
                if (b2 != null) {
                    b2.setText(this.f11665g.getString(R.string.contextView_capsule_heading_stopped));
                }
            } else if (pVar.f8222z.mo8995d().mo9006d()) {
                MapCapsuleView b3 = this.f11664f.f11628T;
                if (b3 != null) {
                    b3.setTitle(this.f11665g.getString(R.string.contextView_capsule_heading_arrival));
                }
                long a = pVar.f8222z.mo8995d().mo8999a() - System.currentTimeMillis();
                MapCapsuleView b4 = this.f11664f.f11628T;
                if (b4 != null) {
                    b4.setText(C4301d.f11508f.mo11334a(this.f11665g, a));
                }
            } else {
                C2918b d = pVar.f8222z.mo8995d().mo9005c().mo9017d();
                MapCapsuleView b5 = this.f11664f.f11628T;
                if (b5 != null) {
                    b5.setTitle(null);
                }
                MapCapsuleView b6 = this.f11664f.f11628T;
                if (b6 != null) {
                    int i = C4386c.f11847a[d.ordinal()];
                    if (i == 1) {
                        str = this.f11665g.getString(R.string.contextView_capsule_heading_toHome);
                    } else if (i == 2) {
                        str = this.f11665g.getString(R.string.contextView_capsule_heading_toWork);
                    } else if (i != 3) {
                        str = "";
                    } else {
                        str = this.f11665g.getString(R.string.contextView_capsule_heading_toSchool);
                    }
                    b6.setText(str);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$v */
    public static final class C4356v extends C4337c {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11666f;

        C4356v(CapsulesStatesView capsulesStatesView) {
            this.f11666f = capsulesStatesView;
            super();
        }

        /* renamed from: a */
        public boolean mo11410a() {
            return this.f11666f.m12922d() || this.f11666f.m12920c();
        }

        /* renamed from: a */
        public void mo11409a(C2896p pVar) {
            C12932j.m33818b(pVar, "friend");
            MapCapsuleView b = this.f11666f.f11628T;
            if (b != null) {
                b.setText(DateUtils.getRelativeTimeSpanString(this.f11666f.getLastTcTimestamp()));
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$w */
    public static final class C4357w extends C4337c {

        /* renamed from: f */
        final /* synthetic */ CapsulesStatesView f11667f;

        C4357w(CapsulesStatesView capsulesStatesView) {
            this.f11667f = capsulesStatesView;
            super();
        }

        /* renamed from: a */
        public boolean mo11410a() {
            return this.f11667f.m12925f();
        }

        /* renamed from: a */
        public void mo11409a(C2896p pVar) {
            C12932j.m33818b(pVar, "friend");
            MapCapsuleView b = this.f11667f.f11628T;
            if (b != null) {
                b.setText(DateUtils.getRelativeTimeSpanString(this.f11667f.getLastTcTimestamp()));
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.CapsulesStatesView$x */
    public static final class C4358x extends C4337c {

        /* renamed from: f */
        private final long f11668f = TimeUnit.MINUTES.toMillis(1);

        /* renamed from: g */
        final /* synthetic */ CapsulesStatesView f11669g;

        /* renamed from: h */
        final /* synthetic */ Context f11670h;

        C4358x(CapsulesStatesView capsulesStatesView, Context context) {
            this.f11669g = capsulesStatesView;
            this.f11670h = context;
            super();
        }

        /* renamed from: a */
        public boolean mo11410a() {
            return this.f11669g.m12923e();
        }

        /* renamed from: a */
        public void mo11409a(C2896p pVar) {
            C12932j.m33818b(pVar, "friend");
            MapCapsuleView b = this.f11669g.f11628T;
            if (b != null) {
                long c = pVar.f8192A.mo8929c() - System.currentTimeMillis();
                if (c < 0) {
                    b.setTitle(null);
                    b.setText(this.f11670h.getString(R.string.contextView_capsule_sleeping));
                    return;
                }
                b.setTitle(this.f11670h.getString(R.string.contextView_capsule_sleeping_wakeUpETA));
                b.setText(C5521c.m15669a(this.f11670h, C12973l.m33887a(c, this.f11668f)));
            }
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleLive", "getCapsuleLive()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleOutdatedGray", "getCapsuleOutdatedGray()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleOutdatedPink", "getCapsuleOutdatedPink()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleHeading", "getCapsuleHeading()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar4);
        C12941s sVar5 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleHeadingOutdatedGray", "getCapsuleHeadingOutdatedGray()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar5);
        C12941s sVar6 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleHeadingOutdatedPink", "getCapsuleHeadingOutdatedPink()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar6);
        C12941s sVar7 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleSleeping", "getCapsuleSleeping()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar7);
        C12941s sVar8 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleSleepingOutdatedGray", "getCapsuleSleepingOutdatedGray()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar8);
        C12941s sVar9 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleSleepingOutdatedPink", "getCapsuleSleepingOutdatedPink()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar9);
        C12941s sVar10 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleBlurred", "getCapsuleBlurred()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar10);
        C12941s sVar11 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleLowPrecision", "getCapsuleLowPrecision()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar11);
        C12941s sVar12 = new C12941s(C12946x.m33834a(CapsulesStatesView.class), "capsuleLocationDisabled", "getCapsuleLocationDisabled()Lapp/zenly/locator/map/view/MapCapsuleView;");
        C12946x.m33839a((C12940r) sVar12);
        f11608g0 = new KProperty[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12};
        new C4336b(null);
    }

    public CapsulesStatesView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CapsulesStatesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CapsulesStatesView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final MapCapsuleView getCapsuleBlurred() {
        Lazy lazy = this.f11623O;
        KProperty kProperty = f11608g0[9];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleHeading() {
        Lazy lazy = this.f11617I;
        KProperty kProperty = f11608g0[3];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleHeadingOutdatedGray() {
        Lazy lazy = this.f11618J;
        KProperty kProperty = f11608g0[4];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleHeadingOutdatedPink() {
        Lazy lazy = this.f11619K;
        KProperty kProperty = f11608g0[5];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleLive() {
        Lazy lazy = this.f11614F;
        KProperty kProperty = f11608g0[0];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleLocationDisabled() {
        Lazy lazy = this.f11625Q;
        KProperty kProperty = f11608g0[11];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleLowPrecision() {
        Lazy lazy = this.f11624P;
        KProperty kProperty = f11608g0[10];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleOutdatedGray() {
        Lazy lazy = this.f11615G;
        KProperty kProperty = f11608g0[1];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleOutdatedPink() {
        Lazy lazy = this.f11616H;
        KProperty kProperty = f11608g0[2];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleSleeping() {
        Lazy lazy = this.f11620L;
        KProperty kProperty = f11608g0[6];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleSleepingOutdatedGray() {
        Lazy lazy = this.f11621M;
        KProperty kProperty = f11608g0[7];
        return (MapCapsuleView) lazy.getValue();
    }

    private final MapCapsuleView getCapsuleSleepingOutdatedPink() {
        Lazy lazy = this.f11622N;
        KProperty kProperty = f11608g0[8];
        return (MapCapsuleView) lazy.getValue();
    }

    /* access modifiers changed from: private */
    public final long getLastTcTimestamp() {
        C2896p pVar = this.f11639w;
        if (pVar != null) {
            return ((C2718k5) this.f11612D.get()).mo8791c(pVar.f8197a);
        }
        return 0;
    }

    private final int getMonitoringIconColor() {
        if (this.f11641y) {
            return C0540a.m2536a(getContext(), (int) R.color.yellow);
        }
        return C0540a.m2536a(getContext(), (int) R.color.gray);
    }

    public final C2458b getFocusMode() {
        return this.f11640x;
    }

    public final C2896p getFriend() {
        return this.f11639w;
    }

    public final boolean getHasMonitoring() {
        return this.f11641y;
    }

    public final Listener getListener() {
        return this.f11638v;
    }

    public final Function1<C2457a, C12956q> getOnStateChange() {
        return this.f11609A;
    }

    public final C2457a getState() {
        return this.f11642z;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11610B;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6427b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11610B;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6428c();
        }
        super.onDetachedFromWindow();
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11610B;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6425a(z);
        }
    }

    public void onVisibilityAggregatedChanged(boolean z) {
        if (z) {
            C4337c cVar = this.f11629U;
            if (cVar != null) {
                cVar.run();
                return;
            }
            return;
        }
        C4337c cVar2 = this.f11629U;
        if (cVar2 != null) {
            cVar2.mo11411b();
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C12932j.m33818b(view, "changedView");
        super.onVisibilityChanged(view, i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11610B;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6424a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f11610B;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6423a(i);
        }
    }

    public final void setFocusMode(C2458b bVar) {
        C12932j.m33818b(bVar, "value");
        if (bVar != this.f11640x) {
            this.f11640x = bVar;
            m12927g();
        }
    }

    public final void setFriend(C2896p pVar) {
        if (!C12932j.m33817a((Object) this.f11639w, (Object) pVar)) {
            boolean z = false;
            this.f11630V = false;
            this.f11631W = 0;
            if (pVar != null) {
                z = pVar.f8214r;
            }
            this.f11632a0 = !z;
        }
        this.f11639w = pVar;
        m12927g();
    }

    public final void setHasMonitoring(boolean z) {
        if (z != this.f11641y) {
            this.f11641y = z;
            m12927g();
        }
    }

    public final void setListener(Listener listener) {
        this.f11638v = listener;
    }

    public final void setOnStateChange(Function1<? super C2457a, C12956q> function1) {
        C12932j.m33818b(function1, "<set-?>");
        this.f11609A = function1;
    }

    public CapsulesStatesView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f11640x = C2458b.NORMAL;
        this.f11642z = C2457a.NONE;
        this.f11609A = C4352r.f11659f;
        this.f11610B = new ViewVisibilityAggregatedHelper<>(this);
        this.f11611C = new Handler();
        this.f11613E = new LinkedHashMap();
        this.f11614F = C12896f.m33751a(new C4343i(this));
        this.f11615G = C12896f.m33751a(new C4346l(this));
        this.f11616H = C12896f.m33751a(new C4347m(this));
        this.f11617I = C12896f.m33751a(new C4340f(this));
        this.f11618J = C12896f.m33751a(new C4341g(this));
        this.f11619K = C12896f.m33751a(new C4342h(this));
        this.f11620L = C12896f.m33751a(new C4348n(this));
        this.f11621M = C12896f.m33751a(new C4349o(this));
        this.f11622N = C12896f.m33751a(new C4350p(this));
        this.f11623O = C12896f.m33751a(new C4338d(this));
        this.f11624P = C12896f.m33751a(new C4345k(this));
        this.f11625Q = C12896f.m33751a(new C4344j(this));
        this.f11626R = new C4339e(this);
        this.f11627S = new C4351q(this);
        LayoutInflater.from(context).inflate(R.layout.map_view_capsules_states, this);
        this.f11612D = new C4335a(context);
        this.f11633b0 = new C4356v(this);
        this.f11634c0 = new C4355u(this, context);
        this.f11635d0 = new C4354t(this, context);
        this.f11636e0 = new C4358x(this, context);
        this.f11637f0 = new C4357w(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m12917b() {
        return C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleHeadingOutdatedGray()) || C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleHeadingOutdatedPink());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m12920c() {
        return C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleLocationDisabled());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m12922d() {
        return C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleOutdatedGray()) || C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleOutdatedPink());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m12923e() {
        return C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleSleeping());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final boolean m12925f() {
        return C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleSleepingOutdatedGray()) || C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleSleepingOutdatedPink());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01c4  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m12927g() {
        /*
            r12 = this;
            android.os.Handler r0 = r12.f11611C
            java.lang.Runnable r1 = r12.f11627S
            r0.removeCallbacks(r1)
            app.zenly.locator.core.models.p r0 = r12.f11639w
            r1 = 0
            if (r0 != 0) goto L_0x0033
            app.zenly.locator.map.view.CapsulesStatesView$c r0 = r12.f11629U
            if (r0 == 0) goto L_0x0013
            r0.mo11411b()
        L_0x0013:
            r12.f11629U = r1
            app.zenly.locator.map.view.MapCapsuleView r0 = r12.f11628T
            if (r0 == 0) goto L_0x002c
            java.util.Map<android.view.View, app.zenly.locator.map.view.animator.CapsuleViewAnimator> r2 = r12.f11613E
            java.lang.Object r0 = r2.get(r0)
            r2 = r0
            app.zenly.locator.map.view.animator.CapsuleViewAnimator r2 = (app.zenly.locator.map.view.animator.CapsuleViewAnimator) r2
            if (r2 == 0) goto L_0x002c
            r3 = 0
            r5 = 0
            r6 = 3
            r7 = 0
            app.zenly.locator.map.view.animator.CapsuleViewAnimator.m13045a(r2, r3, r5, r6, r7)
        L_0x002c:
            r12.f11628T = r1
            app.zenly.locator.core.contracts.MapControllerContract$a r0 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.NONE
            r12.f11642z = r0
            return
        L_0x0033:
            boolean r2 = r0.f8214r
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L_0x00bd
            r12.f11631W = r3
            r12.f11632a0 = r5
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.NONE
            boolean r3 = r12.f11630V
            if (r3 == 0) goto L_0x007a
            boolean r3 = r0.f8211o
            if (r3 != 0) goto L_0x007a
            boolean r3 = r0.f8193B
            if (r3 != 0) goto L_0x0055
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.LOCATION_DISABLED
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleLocationDisabled()
            app.zenly.locator.map.view.CapsulesStatesView$v r4 = r12.f11633b0
            goto L_0x00ab
        L_0x0055:
            boolean r3 = r12.m12915a(r0)
            if (r3 == 0) goto L_0x0064
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.HEADING_OUTDATED
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleHeadingOutdatedPink()
            app.zenly.locator.map.view.CapsulesStatesView$t r4 = r12.f11635d0
            goto L_0x00ab
        L_0x0064:
            boolean r3 = r12.m12918b(r0)
            if (r3 == 0) goto L_0x0073
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.SLEEPING_OUTDATED
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleSleepingOutdatedPink()
            app.zenly.locator.map.view.CapsulesStatesView$w r4 = r12.f11637f0
            goto L_0x00ab
        L_0x0073:
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleOutdatedPink()
            app.zenly.locator.map.view.CapsulesStatesView$v r4 = r12.f11633b0
            goto L_0x00ab
        L_0x007a:
            boolean r3 = r0.f8193B
            if (r3 != 0) goto L_0x0087
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.LOCATION_DISABLED
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleLocationDisabled()
            app.zenly.locator.map.view.CapsulesStatesView$v r4 = r12.f11633b0
            goto L_0x00ab
        L_0x0087:
            boolean r3 = r12.m12915a(r0)
            if (r3 == 0) goto L_0x0096
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.HEADING_OUTDATED
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleHeadingOutdatedGray()
            app.zenly.locator.map.view.CapsulesStatesView$t r4 = r12.f11635d0
            goto L_0x00ab
        L_0x0096:
            boolean r3 = r12.m12918b(r0)
            if (r3 == 0) goto L_0x00a5
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.SLEEPING_OUTDATED
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleSleepingOutdatedGray()
            app.zenly.locator.map.view.CapsulesStatesView$w r4 = r12.f11637f0
            goto L_0x00ab
        L_0x00a5:
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleOutdatedGray()
            app.zenly.locator.map.view.CapsulesStatesView$v r4 = r12.f11633b0
        L_0x00ab:
            app.zenly.locator.core.contracts.MapControllerContract$a r6 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.NONE
            if (r2 != r6) goto L_0x0135
            boolean r2 = r0.mo8976a()
            if (r2 == 0) goto L_0x00b9
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.OUT_OF_BATTERY
            goto L_0x0135
        L_0x00b9:
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.TIMED_OUT
            goto L_0x0135
        L_0x00bd:
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r12.f11631W
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00cc
            r2 = 900(0x384, double:4.447E-321)
            long r2 = r2 + r6
            r12.f11631W = r2
        L_0x00cc:
            boolean r2 = r12.f11632a0
            if (r2 == 0) goto L_0x00ea
            long r2 = r12.f11631W
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ea
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.LIVE
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleLive()
            android.os.Handler r4 = r12.f11611C
            java.lang.Runnable r8 = r12.f11627S
            long r9 = r12.f11631W
            long r9 = r9 - r6
            r6 = 1
            long r9 = r9 + r6
            r4.postDelayed(r8, r9)
            goto L_0x00f4
        L_0x00ea:
            boolean r2 = r0.f8208l
            if (r2 == 0) goto L_0x00f6
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.CITY_MODE
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleBlurred()
        L_0x00f4:
            r4 = r1
            goto L_0x0135
        L_0x00f6:
            boolean r2 = r0.f8204h
            if (r2 == 0) goto L_0x0105
            boolean r2 = r0.f8205i
            if (r2 != 0) goto L_0x0105
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.NO_WIFI
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleLowPrecision()
            goto L_0x00f4
        L_0x0105:
            boolean r2 = r12.m12915a(r0)
            if (r2 == 0) goto L_0x011b
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.HEADING
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleHeading()
            int r4 = r12.getMonitoringIconColor()
            r3.setTextIconTint(r4)
            app.zenly.locator.map.view.CapsulesStatesView$u r4 = r12.f11634c0
            goto L_0x0135
        L_0x011b:
            boolean r2 = r12.m12918b(r0)
            if (r2 == 0) goto L_0x0131
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.SLEEPING
            app.zenly.locator.map.view.MapCapsuleView r3 = r12.getCapsuleSleeping()
            int r4 = r12.getMonitoringIconColor()
            r3.setTextIconTint(r4)
            app.zenly.locator.map.view.CapsulesStatesView$x r4 = r12.f11636e0
            goto L_0x0135
        L_0x0131:
            app.zenly.locator.core.contracts.MapControllerContract$a r2 = app.zenly.locator.core.contracts.MapControllerContract.C2457a.LIVE
            r3 = r1
            r4 = r3
        L_0x0135:
            app.zenly.locator.map.view.MapCapsuleView r6 = r12.f11628T
            if (r3 == r6) goto L_0x0175
            r12.f11628T = r3
            if (r6 == 0) goto L_0x015b
            if (r3 != 0) goto L_0x0142
            r7 = 300(0x12c, double:1.48E-321)
            goto L_0x0144
        L_0x0142:
            r7 = 50
        L_0x0144:
            java.util.Map<android.view.View, app.zenly.locator.map.view.animator.CapsuleViewAnimator> r9 = r12.f11613E
            java.lang.Object r6 = r9.get(r6)
            if (r6 == 0) goto L_0x0157
            app.zenly.locator.map.view.animator.CapsuleViewAnimator r6 = (app.zenly.locator.map.view.animator.CapsuleViewAnimator) r6
            app.zenly.locator.map.view.CapsulesStatesView$s r1 = new app.zenly.locator.map.view.CapsulesStatesView$s
            r1.<init>(r12, r3)
            r6.mo11514a(r7, r1)
            goto L_0x0175
        L_0x0157:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r1
        L_0x015b:
            if (r3 == 0) goto L_0x0175
            java.util.Map<android.view.View, app.zenly.locator.map.view.animator.CapsuleViewAnimator> r6 = r12.f11613E
            java.lang.Object r3 = r6.get(r3)
            if (r3 == 0) goto L_0x0171
            r6 = r3
            app.zenly.locator.map.view.animator.CapsuleViewAnimator r6 = (app.zenly.locator.map.view.animator.CapsuleViewAnimator) r6
            r7 = 0
            r9 = 0
            r10 = 3
            r11 = 0
            app.zenly.locator.map.view.animator.CapsuleViewAnimator.m13048b(r6, r7, r9, r10, r11)
            goto L_0x0175
        L_0x0171:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r1
        L_0x0175:
            app.zenly.locator.map.view.CapsulesStatesView$c r1 = r12.f11629U
            boolean r1 = kotlin.jvm.internal.C12932j.m33817a(r4, r1)
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0198
            app.zenly.locator.map.view.CapsulesStatesView$c r1 = r12.f11629U
            if (r1 == 0) goto L_0x0185
            r1.mo11411b()
        L_0x0185:
            r12.f11629U = r4
            app.zenly.android.base.view.ViewVisibilityAggregatedHelper<?> r1 = r12.f11610B
            if (r1 == 0) goto L_0x0198
            boolean r1 = r1.mo6426a()
            if (r1 != r5) goto L_0x0198
            app.zenly.locator.map.view.CapsulesStatesView$c r1 = r12.f11629U
            if (r1 == 0) goto L_0x0198
            r1.run()
        L_0x0198:
            app.zenly.locator.map.view.CapsulesStatesView$c r1 = r12.f11629U
            if (r1 == 0) goto L_0x019f
            r1.mo11409a(r0)
        L_0x019f:
            boolean r1 = r12.m12923e()
            if (r1 == 0) goto L_0x01b5
            app.zenly.android.base.view.ViewVisibilityAggregatedHelper<?> r1 = r12.f11610B
            if (r1 == 0) goto L_0x01b5
            boolean r1 = r1.mo6426a()
            if (r1 != r5) goto L_0x01b5
            app.zenly.locator.map.view.CapsulesStatesView$x r1 = r12.f11636e0
            r1.run()
            goto L_0x01ba
        L_0x01b5:
            app.zenly.locator.map.view.CapsulesStatesView$x r1 = r12.f11636e0
            r1.mo11411b()
        L_0x01ba:
            boolean r0 = r0.f8211o
            if (r0 == 0) goto L_0x01c0
            r12.f11630V = r5
        L_0x01c0:
            app.zenly.locator.core.contracts.MapControllerContract$a r0 = r12.f11642z
            if (r2 == r0) goto L_0x01cd
            r12.f11642z = r2
            kotlin.jvm.functions.Function1<? super app.zenly.locator.core.contracts.MapControllerContract$a, kotlin.q> r0 = r12.f11609A
            app.zenly.locator.core.contracts.MapControllerContract$a r1 = r12.f11642z
            r0.invoke(r1)
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.view.CapsulesStatesView.m12927g():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m12914a() {
        return C12932j.m33817a((Object) this.f11628T, (Object) getCapsuleHeading());
    }

    /* renamed from: b */
    private final boolean m12918b(C2896p pVar) {
        boolean z = this.f11640x == C2458b.NORMAL;
        if (pVar.f8192A.mo8930d() != C2875a.ASLEEP || !z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final MapCapsuleView m12911a(ViewStub viewStub, boolean z) {
        View inflate = viewStub.inflate();
        if (inflate != null) {
            MapCapsuleView mapCapsuleView = (MapCapsuleView) inflate;
            this.f11613E.put(mapCapsuleView, new CapsuleViewAnimator(mapCapsuleView));
            if (z) {
                mapCapsuleView.setOnClickListener(this.f11626R);
            }
            return mapCapsuleView;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.map.view.MapCapsuleView");
    }

    /* renamed from: a */
    private final boolean m12915a(C2896p pVar) {
        return pVar.f8222z.mo8994c() && (this.f11640x == C2458b.NORMAL);
    }
}

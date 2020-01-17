package app.zenly.locator.map.marker.heading;

import android.content.Context;
import android.graphics.PointF;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.MotionEvent;
import android.widget.FrameLayout.LayoutParams;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.map.marker.C4167b0;
import app.zenly.locator.map.marker.C4178e0;
import app.zenly.locator.map.marker.C4178e0.C4179a;
import app.zenly.locator.map.marker.C4187h0;
import app.zenly.locator.map.marker.MarkerView;
import app.zenly.locator.map.view.HeadingRouteView;
import app.zenly.locator.p143s.p150n.C5464h;
import kotlin.C12956q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.marker.heading.c */
public final class C4200c extends C4187h0 {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final HeadingRouteView f11253F;

    /* renamed from: G */
    private C4167b0 f11254G;

    /* renamed from: H */
    private C4208e f11255H;

    /* renamed from: I */
    private C4208e f11256I;

    /* renamed from: J */
    private boolean f11257J;

    /* renamed from: K */
    private Function1<? super C4203c, C12956q> f11258K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C4202b f11259L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C4202b f11260M;

    /* renamed from: N */
    private Function0<C12956q> f11261N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f11262O;

    /* renamed from: P */
    private final FrameCallback f11263P = new C4206f(this);

    /* renamed from: Q */
    private final C4205e f11264Q;

    /* renamed from: app.zenly.locator.map.marker.heading.c$a */
    private enum C4201a {
        LIGHT(R.color.gray_medium, R.color.gray_medium, R.color.green, R.color.blue),
        DARK(R.color.white, R.color.white, R.color.green, R.color.blue);
        

        /* renamed from: e */
        private final int f11268e;

        /* renamed from: f */
        private final int f11269f;

        /* renamed from: g */
        private final int f11270g;

        /* renamed from: h */
        private final int f11271h;

        private C4201a(int i, int i2, int i3, int i4) {
            this.f11268e = i;
            this.f11269f = i2;
            this.f11270g = i3;
            this.f11271h = i4;
        }

        /* renamed from: a */
        public final int mo11193a() {
            return this.f11270g;
        }

        /* renamed from: b */
        public final int mo11194b() {
            return this.f11271h;
        }

        /* renamed from: c */
        public final int mo11195c() {
            return this.f11268e;
        }

        /* renamed from: d */
        public final int mo11196d() {
            return this.f11269f;
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.c$b */
    public enum C4202b {
        ABOVE,
        BELOW,
        UNDEFINED
    }

    /* renamed from: app.zenly.locator.map.marker.heading.c$c */
    public enum C4203c {
        PAST,
        FUTURE
    }

    /* renamed from: app.zenly.locator.map.marker.heading.c$d */
    public enum C4204d {
        COLLAPSE(2131231238),
        EXPAND(2131231252);
        

        /* renamed from: e */
        private final int f11282e;

        private C4204d(int i) {
            this.f11282e = i;
        }

        /* renamed from: a */
        public final int mo11197a() {
            return this.f11282e;
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.c$e */
    public static final class C4205e extends C4179a<C4178e0<MarkerView>> {

        /* renamed from: a */
        final /* synthetic */ C4200c f11283a;

        C4205e(C4200c cVar) {
            this.f11283a = cVar;
        }

        /* renamed from: b */
        public void mo10913b(C4178e0<MarkerView> e0Var) {
            this.f11283a.m12523a();
        }

        /* renamed from: c */
        public void mo10914c(C4178e0<MarkerView> e0Var) {
            this.f11283a.m12523a();
        }

        /* renamed from: d */
        public void mo10915d(C4178e0<MarkerView> e0Var) {
            this.f11283a.m12523a();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.c$f */
    static final class C4206f implements FrameCallback {

        /* renamed from: e */
        final /* synthetic */ C4200c f11284e;

        C4206f(C4200c cVar) {
            this.f11284e = cVar;
        }

        public final void doFrame(long j) {
            this.f11284e.f11262O = false;
            C4208e fromMarker = this.f11284e.getFromMarker();
            C4208e toMarker = this.f11284e.getToMarker();
            C4167b0 friendMarker = this.f11284e.getFriendMarker();
            if (fromMarker == null || toMarker == null || friendMarker == null) {
                this.f11284e.f11253F.mo11450a();
                return;
            }
            PointF pointF = null;
            PointF a = fromMarker.mo11019A() ? this.f11284e.m12518a((C4178e0<?>) fromMarker) : null;
            if (toMarker.mo11019A()) {
                pointF = this.f11284e.m12518a((C4178e0<?>) toMarker);
            }
            PointF a2 = this.f11284e.m12518a((C4178e0<?>) friendMarker);
            if (a2 == null || (a == null && pointF == null)) {
                this.f11284e.f11253F.mo11450a();
            } else {
                this.f11284e.f11253F.mo11452a(a, pointF, a2);
            }
            C4202b a3 = this.f11284e.m12520a(a, a2);
            C4202b a4 = this.f11284e.m12520a(pointF, a2);
            if (a3 != this.f11284e.getPlaceOriginPosition() || a4 != this.f11284e.getPlaceDestinationPosition()) {
                this.f11284e.f11259L = a3;
                this.f11284e.f11260M = a4;
                Function0 onPlacesPositionChange = this.f11284e.getOnPlacesPositionChange();
                if (onPlacesPositionChange != null) {
                    C12956q qVar = (C12956q) onPlacesPositionChange.invoke();
                }
            }
        }
    }

    public C4200c(Context context) {
        C12932j.m33818b(context, "context");
        super(context);
        HeadingRouteView headingRouteView = new HeadingRouteView(context, null, 0, 0, 14, null);
        this.f11253F = headingRouteView;
        C4202b bVar = C4202b.UNDEFINED;
        this.f11259L = bVar;
        this.f11260M = bVar;
        this.f11253F.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f11253F);
        m12526b();
        this.f11264Q = new C4205e(this);
    }

    public final C4167b0 getFriendMarker() {
        return this.f11254G;
    }

    public final C4208e getFromMarker() {
        return this.f11255H;
    }

    public final Function1<C4203c, C12956q> getOnHeadingRouteClick() {
        return this.f11258K;
    }

    public final Function0<C12956q> getOnPlacesPositionChange() {
        return this.f11261N;
    }

    public final C4202b getPlaceDestinationPosition() {
        return this.f11260M;
    }

    public final C4202b getPlaceOriginPosition() {
        return this.f11259L;
    }

    public final C4208e getToMarker() {
        return this.f11256I;
    }

    public final void setDarkMode(boolean z) {
        if (z != this.f11257J) {
            this.f11257J = z;
            m12526b();
        }
    }

    public final void setFriendMarker(C4167b0 b0Var) {
        if (!C12932j.m33817a((Object) b0Var, (Object) this.f11254G)) {
            C4167b0 b0Var2 = this.f11254G;
            if (b0Var2 != null) {
                b0Var2.mo11105b((C4179a) this.f11264Q);
            }
            this.f11254G = b0Var;
            if (b0Var != null) {
                b0Var.mo11099a((C4179a) this.f11264Q);
            }
            m12523a();
        }
    }

    public final void setFromMarker(C4208e eVar) {
        if (!C12932j.m33817a((Object) eVar, (Object) this.f11255H)) {
            C4208e eVar2 = this.f11255H;
            if (eVar2 != null) {
                eVar2.mo11105b((C4179a) this.f11264Q);
            }
            this.f11255H = eVar;
            if (eVar != null) {
                eVar.mo11099a((C4179a) this.f11264Q);
            }
            m12523a();
        }
    }

    public final void setOnHeadingRouteClick(Function1<? super C4203c, C12956q> function1) {
        this.f11258K = function1;
    }

    public final void setOnPlacesPositionChange(Function0<C12956q> function0) {
        this.f11261N = function0;
    }

    public final void setToMarker(C4208e eVar) {
        if (!C12932j.m33817a((Object) eVar, (Object) this.f11256I)) {
            C4208e eVar2 = this.f11256I;
            if (eVar2 != null) {
                eVar2.mo11105b((C4179a) this.f11264Q);
            }
            this.f11256I = eVar;
            if (eVar != null) {
                eVar.mo11099a((C4179a) this.f11264Q);
            }
            m12523a();
        }
    }

    /* renamed from: b */
    private final void m12526b() {
        C4201a aVar;
        if (this.f11257J) {
            aVar = C4201a.DARK;
        } else {
            aVar = C4201a.LIGHT;
        }
        this.f11253F.mo11451a(C0540a.m2536a(getContext(), aVar.mo11195c()), C0540a.m2536a(getContext(), aVar.mo11196d()), C0540a.m2536a(getContext(), aVar.mo11193a()), C0540a.m2536a(getContext(), aVar.mo11194b()));
    }

    /* renamed from: a */
    public final void mo11178a(C4203c cVar, C4204d dVar) {
        C12932j.m33818b(cVar, "route");
        C12932j.m33818b(dVar, "indicator");
        int i = C4207d.f11285a[cVar.ordinal()];
        if (i == 1) {
            this.f11253F.setPastAnnotation(getContext().getDrawable(dVar.mo11197a()));
        } else if (i == 2) {
            this.f11253F.setFutureAnnotation(getContext().getDrawable(dVar.mo11197a()));
        }
    }

    /* renamed from: a */
    public final boolean mo11179a(MotionEvent motionEvent) {
        C12932j.m33818b(motionEvent, "e");
        int i = C4207d.f11286b[this.f11253F.mo11449a(motionEvent).ordinal()];
        if (i == 1) {
            Function1<? super C4203c, C12956q> function1 = this.f11258K;
            if (function1 == null) {
                return true;
            }
            C12956q qVar = (C12956q) function1.invoke(C4203c.FUTURE);
            return true;
        } else if (i == 2) {
            Function1<? super C4203c, C12956q> function12 = this.f11258K;
            if (function12 == null) {
                return true;
            }
            C12956q qVar2 = (C12956q) function12.invoke(C4203c.PAST);
            return true;
        } else if (i == 3) {
            return false;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C4202b m12520a(PointF pointF, PointF pointF2) {
        if (pointF == null || pointF2 == null) {
            return C4202b.UNDEFINED;
        }
        if (pointF.y - pointF2.y > ((float) 0)) {
            return C4202b.BELOW;
        }
        return C4202b.ABOVE;
    }

    /* renamed from: a */
    public void mo11137a(C5464h hVar) {
        super.mo11137a(hVar);
        m12523a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final PointF m12518a(C4178e0<?> e0Var) {
        PointF pointF = new PointF();
        if (e0Var.mo11112g() != null) {
            e0Var.mo11096a(pointF);
            pointF.set(e0Var.mo11113j().x + pointF.x, e0Var.mo11113j().y + pointF.y);
        } else {
            this.f11199h.toScreenLocation(e0Var.mo11114k(), pointF);
            if (Float.isNaN(pointF.x) || Float.isNaN(pointF.y)) {
                return null;
            }
        }
        return pointF;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12523a() {
        if (!this.f11262O) {
            this.f11262O = true;
            Choreographer.getInstance().postFrameCallback(this.f11263P);
        }
    }
}

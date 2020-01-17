package app.zenly.locator.map.marker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import app.zenly.android.feature.map.widget.BatteryView;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.MapControllerContract.C2457a;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import app.zenly.locator.core.models.C2874c0;
import app.zenly.locator.core.models.C2874c0.C2875a;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.util.C3234r;
import app.zenly.locator.map.C3896a1;
import app.zenly.locator.map.marker.C4167b0.C4169b;
import app.zenly.locator.map.marker.C4178e0.C4179a;
import app.zenly.locator.map.p106f1.C3941a;
import app.zenly.locator.map.p109i1.C4028l1;
import app.zenly.locator.map.p109i1.C4059r1;
import app.zenly.locator.map.p109i1.p110s1.C4062a;
import app.zenly.locator.map.p111j1.C4081c;
import app.zenly.locator.map.view.CapsulesStatesView;
import app.zenly.locator.map.view.CapsulesStatesView.Listener;
import app.zenly.locator.map.view.p117d.C4387a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5409b;
import app.zenly.locator.p143s.p150n.C5464h;
import app.zenly.locator.p143s.p162w.p166f.C5587a;
import p213co.znly.models.C7408n3;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.map.marker.a0 */
public class C4162a0 extends FocusedMarkerOverlay<C4167b0> {

    /* renamed from: C */
    private final C4164b f11073C = new C4164b(this, null);

    /* renamed from: D */
    private final Point f11074D = new Point();

    /* renamed from: E */
    private final Point f11075E = new Point();

    /* renamed from: F */
    private final C12275b f11076F = new C12275b();

    /* renamed from: G */
    private View f11077G;

    /* renamed from: H */
    private View f11078H;

    /* renamed from: I */
    private View f11079I;

    /* renamed from: J */
    private final Rect f11080J = new Rect();

    /* renamed from: K */
    private FrameLayout f11081K;

    /* renamed from: L */
    private CapsulesStatesView f11082L;

    /* renamed from: M */
    private BatteryView f11083M;

    /* renamed from: N */
    private ParticleView f11084N;

    /* renamed from: O */
    private View f11085O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f11086P = false;

    /* renamed from: Q */
    private C3941a f11087Q;

    /* renamed from: R */
    private PointF f11088R = new PointF();

    /* renamed from: S */
    private C4387a f11089S;

    /* renamed from: T */
    private Bitmap f11090T;

    /* renamed from: U */
    private C4081c f11091U;

    /* renamed from: V */
    private ParticleAnimation f11092V;

    /* renamed from: W */
    private C4165c f11093W = C4165c.TOPO;

    /* renamed from: a0 */
    private Listener f11094a0;

    /* renamed from: b0 */
    private C2458b f11095b0 = C2458b.NORMAL;

    /* renamed from: c0 */
    private final OnLayoutChangeListener f11096c0 = new C4216i(this);

    /* renamed from: d0 */
    private C5409b f11097d0 = new C4163a();

    /* renamed from: app.zenly.locator.map.marker.a0$a */
    class C4163a extends C5409b {
        C4163a() {
        }

        /* renamed from: b */
        public void mo11008b(C5407g gVar, int i) {
            C4162a0.this.m12199c(i);
        }
    }

    /* renamed from: app.zenly.locator.map.marker.a0$b */
    private final class C4164b extends C4169b {
        private C4164b() {
        }

        /* renamed from: c */
        public void mo11015c(C4167b0 b0Var, boolean z) {
            C4162a0.this.m12195b();
        }

        /* renamed from: g */
        public void mo10912a(C4167b0 b0Var, boolean z) {
            C4162a0.this.f11086P = z;
            C4162a0.this.m12198c();
        }

        /* synthetic */ C4164b(C4162a0 a0Var, C4163a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo10913b(C4167b0 b0Var) {
            C4162a0.this.m12203e();
        }

        /* renamed from: b */
        public void mo10915d(C4167b0 b0Var) {
            C4162a0.this.m12201d();
        }

        /* renamed from: d */
        public void mo11016d(C4167b0 b0Var, boolean z) {
            C4162a0.this.m12195b();
        }

        /* renamed from: a */
        public void mo10954a(C4178e0 e0Var, double d) {
            C4162a0.this.m12205f();
        }

        /* renamed from: a */
        public void mo11010a(C4167b0 b0Var, int i, boolean z) {
            C4162a0.this.m12195b();
        }

        /* renamed from: a */
        public void mo11011a(C4167b0 b0Var, Bitmap bitmap) {
            C4162a0.this.m12207g();
        }

        /* renamed from: a */
        public void mo11013a(C4167b0 b0Var, C2890k kVar) {
            C4162a0.this.m12207g();
        }

        /* renamed from: a */
        public void mo11012a(C4167b0 b0Var, C2874c0 c0Var) {
            C4162a0.this.m12207g();
            C4162a0.this.m12195b();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.a0$c */
    private enum C4165c {
        TOPO,
        SAT
    }

    public C4162a0(Context context) {
        super(context);
        m12189a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m12207g() {
        boolean z = this.f11095b0 == C2458b.NORMAL;
        if (this.f11086P) {
            T t = this.f10911A;
            if (t != null && z) {
                if (((C4167b0) t).mo11025P().f8192A.mo8930d() == C2875a.ASLEEP) {
                    if (this.f11090T == null) {
                        this.f11090T = BitmapFactory.decodeResource(getResources(), 2131230934);
                    }
                    this.f11089S.mo11518a(((C4167b0) this.f10911A).mo11024O(), ((C4167b0) this.f10911A).mo11023N(), this.f11090T);
                    return;
                }
                this.f11089S.mo11518a(((C4167b0) this.f10911A).mo11024O(), ((C4167b0) this.f10911A).mo11023N(), null);
                return;
            }
        }
        this.f11090T = null;
        this.f11089S.mo11518a(null, null, null);
    }

    /* renamed from: h */
    private Disposable m12208h() {
        return C4059r1.m11760g().mo10728e().mo36459b((Predicate<? super T>) C4222k.f11330e).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C4228l<Object>(this));
    }

    private void setWeather(C4081c cVar) {
        C4081c cVar2 = this.f11091U;
        C7408n3 n3Var = cVar2 != null ? cVar2.f10705b : C7408n3.WEATHER_TYPE_UNKNOWN;
        this.f11091U = cVar;
        if ((cVar != null ? cVar.f10705b : C7408n3.WEATHER_TYPE_UNKNOWN) != n3Var) {
            m12193a(false);
        }
    }

    public CapsulesStatesView getCapsulesStatesView() {
        return this.f11082L;
    }

    public Class<C4167b0> getMarkerClass() {
        return C4167b0.class;
    }

    /* access modifiers changed from: protected */
    public ViewGroup getMarkerContainer() {
        return this.f11081K;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11076F.add(m12208h());
        C5407g.m15386a(getContext()).mo12971a(this.f11097d0);
        m12199c(C5407g.m15386a(getContext()).mo12983f());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11076F.mo36401a();
        C5407g.m15386a(getContext()).mo12976b(this.f11097d0);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11075E.set(i, i2);
        m12193a(false);
        m12203e();
        m12205f();
    }

    public void setCapsulesStateListener(Listener listener) {
        this.f11094a0 = listener;
        this.f11082L.setListener(listener);
    }

    public void setFocusMode(C2458b bVar) {
        if (this.f11095b0 != bVar) {
            this.f11095b0 = bVar;
            m12198c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m12203e() {
        if (this.f11086P) {
            T t = this.f10911A;
            if (!(t == null || ((C4167b0) t).mo11025P().f8200d == null)) {
                this.f10913z.toScreenLocation(((C4167b0) this.f10911A).mo11025P().f8200d, this.f11088R);
                this.f11087Q.mo10588a(this.f11088R);
                this.f11085O.setVisibility(0);
                return;
            }
        }
        this.f11085O.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m12205f() {
        if (this.f11086P) {
            T t = this.f10911A;
            if (t != null && ((C4167b0) t).mo11025P().f8200d != null) {
                this.f11087Q.mo10587a((float) (((C4167b0) this.f10911A).mo11025P().f8203g / this.f10913z.getMetersPerPixelAtLatitude(((C4167b0) this.f10911A).mo11025P().f8200d.mo13060b())));
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo11000b(View view) {
        if (this.f11094a0 != null && this.f11086P) {
            T t = this.f10911A;
            if (t != null && !((C4167b0) t).mo11030U() && ((C4167b0) this.f10911A).mo11025P().mo8976a()) {
                this.f11094a0.onCalloutClick(C2457a.OUT_OF_BATTERY);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12198c() {
        m12195b();
        m12207g();
        m12193a(!this.f11086P);
        m12203e();
        m12205f();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m12201d() {
        int i;
        int i2;
        int i3;
        int i4;
        T t = this.f10911A;
        if (t != null) {
            ((AvatarMarkerView) ((C4167b0) t).mo11112g()).mo10978a(this.f11080J);
            int x = (int) (((AvatarMarkerView) ((C4167b0) this.f10911A).mo11112g()).getX() + ((float) this.f11080J.left));
            float y = ((AvatarMarkerView) ((C4167b0) this.f10911A).mo11112g()).getY();
            Rect rect = this.f11080J;
            int i5 = (int) (y + ((float) rect.top));
            int width = rect.width();
            int height = this.f11080J.height();
            if (x < 0) {
                i = x * -1;
                i2 = 0;
            } else {
                i2 = x;
                i = 0;
            }
            if (i5 < 0) {
                i3 = i5 * -1;
                i4 = 0;
            } else {
                i4 = i5;
                i3 = 0;
            }
            m12190a(this.f11077G, i2, i4, width, height);
            m12190a(this.f11078H, 0, 0, i, -1);
            m12190a(this.f11079I, 0, 0, -1, i3);
            this.f11089S.mo11517a(((AvatarMarkerView) ((C4167b0) this.f10911A).mo11112g()).getX() + ((float) this.f11080J.centerX()), ((AvatarMarkerView) ((C4167b0) this.f10911A).mo11112g()).getY() + ((float) this.f11080J.top));
        }
    }

    /* renamed from: a */
    private void m12189a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.map_view_focused_marker_overlay, this);
        setClipChildren(false);
        this.f11077G = findViewById(R.id.marker_position);
        this.f11078H = findViewById(R.id.start_negative_spacer);
        this.f11079I = findViewById(R.id.top_negative_spacer);
        this.f11082L = (CapsulesStatesView) findViewById(R.id.capsules_states_view);
        this.f11083M = (BatteryView) findViewById(R.id.battery);
        this.f11081K = (FrameLayout) findViewById(R.id.marker_container);
        this.f11084N = (ParticleView) findViewById(R.id.particle_view);
        this.f11085O = findViewById(R.id.raw_position);
        this.f11087Q = new C3941a(context);
        this.f11085O.setBackground(this.f11087Q);
        this.f11089S = new C4387a(this.f11084N, 0, new C4028l1(context));
        this.f11083M.setOnClickListener(new C4219j(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10862d(C4167b0 b0Var) {
        b0Var.mo11105b((C4179a) this.f11073C);
        ((AvatarMarkerView) b0Var.mo11112g()).removeOnLayoutChangeListener(this.f11096c0);
        C3896a1.m11470r().mo10511c().mo13171a(((AvatarMarkerView) b0Var.mo11112g()).getMarkerShape());
        this.f11086P = false;
        m12198c();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0007, code lost:
        if (r2 != 3) goto L_0x0013;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12199c(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L_0x000f
            r0 = 2
            if (r2 == r0) goto L_0x000a
            r0 = 3
            if (r2 == r0) goto L_0x000f
            goto L_0x0013
        L_0x000a:
            app.zenly.locator.map.marker.a0$c r2 = app.zenly.locator.map.marker.C4162a0.C4165c.SAT
            r1.f11093W = r2
            goto L_0x0013
        L_0x000f:
            app.zenly.locator.map.marker.a0$c r2 = app.zenly.locator.map.marker.C4162a0.C4165c.TOPO
            r1.f11093W = r2
        L_0x0013:
            r2 = 0
            r1.m12193a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.C4162a0.m12199c(int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12195b() {
        boolean z = this.f11095b0 == C2458b.NORMAL;
        if (!this.f11086P || this.f10911A == null || !z) {
            this.f11083M.setVisibility(8);
            return;
        }
        if (this.f11083M.getVisibility() == 8) {
            this.f11083M.setAnimated(false);
            this.f11083M.setBatteryLevel(Math.max(1, ((C4167b0) this.f10911A).mo11022M() - 20));
            this.f11083M.setPlugged(((C4167b0) this.f10911A).mo11029T());
            this.f11083M.setVisibility(0);
        }
        this.f11083M.setAnimated(true);
        this.f11083M.setBatteryLevel(((C4167b0) this.f10911A).mo11022M());
        this.f11083M.setPlugged(((C4167b0) this.f10911A).mo11029T());
        if (!((C4167b0) this.f10911A).mo11025P().f8214r && !((C4167b0) this.f10911A).mo11025P().f8193B) {
            this.f11083M.setStyleOverride(2132082977);
        } else if (((C4167b0) this.f10911A).mo11025P().f8192A.mo8930d() == C2875a.ASLEEP) {
            this.f11083M.setStyleOverride(2132082978);
        } else {
            this.f11083M.setStyleOverride(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10861c(C4167b0 b0Var) {
        b0Var.mo11099a((C4179a) this.f11073C);
        this.f11073C.mo10915d(b0Var);
        this.f11086P = b0Var.mo11122w();
        ((AvatarMarkerView) b0Var.mo11112g()).addOnLayoutChangeListener(this.f11096c0);
        if (this.f11086P) {
            m12198c();
        }
        C3896a1.m11470r().mo10511c().mo13172b(((AvatarMarkerView) b0Var.mo11112g()).getMarkerShape());
    }

    /* renamed from: a */
    public /* synthetic */ void mo10997a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m12201d();
    }

    /* renamed from: a */
    public /* synthetic */ void mo10998a(C4062a aVar) throws Exception {
        setWeather(aVar.mo10733b());
    }

    /* renamed from: a */
    public void mo10859a(C5464h hVar) {
        m12203e();
        m12205f();
    }

    /* renamed from: a */
    private void m12190a(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.leftMargin != i || layoutParams.topMargin != i2 || layoutParams.width != i3 || layoutParams.height != i4) {
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
            layoutParams.width = i3;
            layoutParams.height = i4;
            view.requestLayout();
        }
    }

    /* renamed from: a */
    private void m12193a(boolean z) {
        ParticleAnimation particleAnimation = this.f11092V;
        if (particleAnimation != null) {
            particleAnimation.mo9493a(z);
            this.f11092V = null;
        }
        if (this.f11095b0 == C2458b.NORMAL) {
            C7408n3 n3Var = (this.f11091U == null || !this.f11086P || C3234r.m10251b(getContext())) ? C7408n3.WEATHER_TYPE_UNKNOWN : this.f11091U.f10705b;
            int i = this.f11093W == C4165c.SAT ? -1 : -7826756;
            switch (n3Var.getNumber() & 983047) {
                case 65537:
                    this.f11092V = C5587a.m15797a(getContext(), this.f11074D, this.f11075E, i);
                    break;
                case 65538:
                    this.f11092V = C5587a.m15802d(getContext(), this.f11074D, this.f11075E);
                    break;
                case 131073:
                    this.f11092V = C5587a.m15801c(getContext(), this.f11074D, this.f11075E, i);
                    break;
                case 131074:
                    this.f11092V = C5587a.m15798b(getContext(), this.f11074D, this.f11075E);
                    break;
                case 262145:
                    this.f11092V = C5587a.m15803d(getContext(), this.f11074D, this.f11075E, i);
                    break;
                case 262146:
                    this.f11092V = C5587a.m15800c(getContext(), this.f11074D, this.f11075E);
                    break;
                case 524289:
                    this.f11092V = C5587a.m15799b(getContext(), this.f11074D, this.f11075E, i);
                    break;
                case 524290:
                    this.f11092V = C5587a.m15796a(getContext(), this.f11074D, this.f11075E);
                    break;
            }
            ParticleAnimation particleAnimation2 = this.f11092V;
            if (particleAnimation2 != null) {
                particleAnimation2.mo9486a(1);
                this.f11084N.mo9542a(this.f11092V);
                this.f11092V.mo9509q();
            }
        }
    }
}

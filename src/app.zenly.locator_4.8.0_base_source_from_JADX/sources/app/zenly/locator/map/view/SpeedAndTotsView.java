package app.zenly.locator.map.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.base.util.C1302f;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3229p;
import app.zenly.locator.core.widget.CircleProgressView;
import app.zenly.locator.p143s.p146j.C5432b;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;

public class SpeedAndTotsView extends FrameLayout {

    /* renamed from: M */
    private static final TimeInterpolator f11784M = C7657c.m18641a();

    /* renamed from: N */
    private static final TimeInterpolator f11785N = C7657c.m18649e();

    /* renamed from: O */
    private static final TimeInterpolator f11786O = C7657c.m18650f();

    /* renamed from: P */
    private static final TimeInterpolator f11787P = C7657c.m18641a();

    /* renamed from: A */
    private boolean f11788A = false;

    /* renamed from: B */
    private boolean f11789B = false;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public long f11790C = -1;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f11791D = -1;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f11792E = -1;

    /* renamed from: F */
    private long f11793F = -1;

    /* renamed from: G */
    private boolean f11794G;

    /* renamed from: H */
    private final AnimatorListener f11795H = new C4376b();

    /* renamed from: I */
    private final Runnable f11796I = new C4377c();

    /* renamed from: J */
    private final Runnable f11797J = new C4385b(this);

    /* renamed from: K */
    private final C5432b f11798K = new C4378d();

    /* renamed from: L */
    private final C5432b f11799L = new C4379e();

    /* renamed from: e */
    private CircleProgressView f11800e;

    /* renamed from: f */
    private TextView f11801f;

    /* renamed from: g */
    private TextView f11802g;

    /* renamed from: h */
    private int f11803h;

    /* renamed from: i */
    private int f11804i;

    /* renamed from: j */
    private int f11805j;

    /* renamed from: k */
    private int f11806k;

    /* renamed from: l */
    private int f11807l;

    /* renamed from: m */
    private int f11808m;

    /* renamed from: n */
    private int f11809n;

    /* renamed from: o */
    private int f11810o;

    /* renamed from: p */
    private int f11811p;

    /* renamed from: q */
    private String f11812q;

    /* renamed from: r */
    private String f11813r;

    /* renamed from: s */
    private int f11814s;

    /* renamed from: t */
    private int f11815t;

    /* renamed from: u */
    private int f11816u;

    /* renamed from: v */
    private int f11817v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f11818w = 0;

    /* renamed from: x */
    private int f11819x = -1;

    /* renamed from: y */
    private String f11820y = "";
    /* access modifiers changed from: private */

    /* renamed from: z */
    public double f11821z = -1.0d;

    /* renamed from: app.zenly.locator.map.view.SpeedAndTotsView$a */
    class C4375a implements OnLayoutChangeListener {
        C4375a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SpeedAndTotsView.this.removeOnLayoutChangeListener(this);
            SpeedAndTotsView speedAndTotsView = SpeedAndTotsView.this;
            speedAndTotsView.onVisibilityChanged(speedAndTotsView, speedAndTotsView.getVisibility());
        }
    }

    /* renamed from: app.zenly.locator.map.view.SpeedAndTotsView$b */
    class C4376b extends C5432b {
        C4376b() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            SpeedAndTotsView.this.setVisibility(4);
        }
    }

    /* renamed from: app.zenly.locator.map.view.SpeedAndTotsView$c */
    class C4377c implements Runnable {
        C4377c() {
        }

        public void run() {
            if (SpeedAndTotsView.this.f11821z != -1.0d) {
                float max = Math.max(0.0f, ((float) (System.currentTimeMillis() - SpeedAndTotsView.this.f11790C)) / 1000.0f);
                if (max >= 1.0f || !SpeedAndTotsView.this.isShown()) {
                    SpeedAndTotsView speedAndTotsView = SpeedAndTotsView.this;
                    speedAndTotsView.m13018a(speedAndTotsView.f11792E, true);
                    SpeedAndTotsView.this.f11790C = -1;
                    SpeedAndTotsView.this.f11791D = -1;
                    SpeedAndTotsView.this.f11792E = -1;
                } else {
                    SpeedAndTotsView.this.m13018a((int) (((float) SpeedAndTotsView.this.f11791D) + (((float) (SpeedAndTotsView.this.f11792E - SpeedAndTotsView.this.f11791D)) * max)), true);
                    SpeedAndTotsView.this.postDelayed(this, 100);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.map.view.SpeedAndTotsView$d */
    class C4378d extends C5432b {
        C4378d() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            SpeedAndTotsView.this.m13030g();
        }
    }

    /* renamed from: app.zenly.locator.map.view.SpeedAndTotsView$e */
    class C4379e extends C5432b {
        C4379e() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            SpeedAndTotsView.this.f11818w = 0;
        }
    }

    /* renamed from: app.zenly.locator.map.view.SpeedAndTotsView$f */
    static /* synthetic */ class C4380f {

        /* renamed from: a */
        static final /* synthetic */ int[] f11827a = new int[C3229p.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.core.util.p[] r0 = app.zenly.locator.core.util.C3229p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11827a = r0
                int[] r0 = f11827a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.core.util.p r1 = app.zenly.locator.core.util.C3229p.US     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11827a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.core.util.p r1 = app.zenly.locator.core.util.C3229p.UK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11827a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.core.util.p r1 = app.zenly.locator.core.util.C3229p.SI     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.view.SpeedAndTotsView.C4380f.<clinit>():void");
        }
    }

    public SpeedAndTotsView(Context context) {
        super(context);
        m13029f();
    }

    /* renamed from: f */
    private void m13029f() {
        this.f11803h = C0540a.m2536a(getContext(), (int) R.color.green_dark);
        boolean z = false;
        this.f11804i = 0;
        this.f11805j = 0;
        this.f11806k = C0540a.m2536a(getContext(), (int) R.color.blue_black);
        this.f11807l = 0;
        this.f11808m = C0540a.m2536a(getContext(), (int) R.color.blue_light);
        this.f11809n = C0540a.m2536a(getContext(), (int) R.color.gray_dark);
        this.f11810o = 0;
        this.f11811p = 0;
        this.f11812q = getContext().getString(R.string.units_symbols_kmh);
        this.f11813r = getContext().getString(R.string.units_symbols_mph);
        this.f11814s = R.plurals.units_symbols_days;
        this.f11815t = R.plurals.units_symbols_hours;
        this.f11816u = R.plurals.units_symbols_min;
        this.f11817v = R.plurals.units_symbols_sec;
        LayoutInflater.from(getContext()).inflate(R.layout.view_speed_and_tots, this);
        this.f11800e = (CircleProgressView) findViewById(R.id.circle_progress_view);
        this.f11801f = (TextView) findViewById(R.id.value_text);
        this.f11802g = (TextView) findViewById(R.id.unit_text);
        if (getVisibility() == 0) {
            z = true;
        }
        this.f11794G = z;
        addOnLayoutChangeListener(new C4375a());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m13030g() {
        this.f11818w = 2;
        m13031h();
        ViewPropertyAnimator animate = this.f11801f.animate();
        animate.cancel();
        animate.scaleX(1.0f).scaleY(1.0f).setInterpolator(f11786O).setDuration(150).setListener(this.f11799L);
    }

    /* renamed from: h */
    private void m13031h() {
        this.f11801f.setText(C7706a.m18751a(getContext(), this.f11819x));
    }

    private void setUnit(String str) {
        if (!TextUtils.equals(str, this.f11820y)) {
            this.f11820y = str;
            this.f11802g.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            removeCallbacks(this.f11797J);
            removeCallbacks(this.f11796I);
            int i2 = this.f11792E;
            if (i2 > -1) {
                m13018a(i2, false);
                this.f11790C = -1;
                this.f11791D = -1;
                this.f11792E = -1;
            }
        } else if (this.f11793F > -1) {
            m13020a(false);
        }
    }

    public void setTimeOnTheSpot(long j) {
        if (this.f11793F != j) {
            removeCallbacks(this.f11796I);
            this.f11821z = -1.0d;
            this.f11793F = j;
            this.f11800e.setCircleBackgroundColor(this.f11806k);
            this.f11800e.setCircleBorderColor(this.f11807l);
            this.f11800e.setCircleProgressColor(this.f11808m);
            m13020a(false);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f11794G = i == 0;
    }

    /* renamed from: e */
    private void m13027e() {
        if (this.f11818w == 0) {
            this.f11818w = 1;
            ViewPropertyAnimator animate = this.f11801f.animate();
            animate.cancel();
            animate.scaleX(0.1f).scaleY(0.1f).setInterpolator(f11787P).setDuration(150).setListener(this.f11798K);
        }
    }

    /* renamed from: d */
    public void mo11503d() {
        if (!this.f11794G) {
            animate().cancel();
            setScaleX(0.0f);
            setScaleY(0.0f);
            setVisibility(0);
            animate().scaleX(1.0f).scaleY(1.0f).setDuration(300).setInterpolator(f11784M).setListener(null).start();
        }
    }

    /* renamed from: b */
    public boolean mo11501b() {
        return this.f11794G && getVisibility() == 0;
    }

    /* renamed from: c */
    public /* synthetic */ void mo11502c() {
        m13020a(true);
    }

    /* renamed from: b */
    private void m13023b(int i, boolean z) {
        if (i != this.f11819x) {
            this.f11819x = i;
            if (!z || !isShown()) {
                m13031h();
            } else {
                m13027e();
            }
        }
    }

    /* renamed from: a */
    public void mo11499a() {
        if (this.f11794G) {
            this.f11794G = false;
            if (getVisibility() == 0) {
                animate().cancel();
                animate().scaleX(0.0f).scaleY(0.0f).setDuration(150).setInterpolator(f11785N).setListener(this.f11795H).start();
            }
        }
    }

    /* renamed from: a */
    public void mo11500a(double d, boolean z, boolean z2) {
        int i;
        if (this.f11821z != d || this.f11788A != z || this.f11789B != z2) {
            removeCallbacks(this.f11797J);
            this.f11800e.mo9658a(0.0f, 100.0f);
            boolean z3 = false;
            boolean z4 = this.f11821z != -1.0d;
            boolean z5 = !z4 || z != this.f11788A;
            if (d != this.f11821z) {
                z3 = true;
            }
            this.f11793F = -1;
            this.f11821z = d;
            this.f11788A = z;
            this.f11789B = z2;
            if (z5) {
                this.f11800e.setCircleBackgroundColor(z ? this.f11809n : this.f11803h);
                this.f11800e.setCircleBorderColor(z ? this.f11810o : this.f11804i);
                this.f11800e.setCircleProgressColor(z ? this.f11811p : this.f11805j);
            }
            if (z3) {
                removeCallbacks(this.f11796I);
                int i2 = C4380f.f11827a[C3229p.m10233a(getContext()).ordinal()];
                if (i2 == 1 || i2 == 2) {
                    i = (int) Math.round(C1302f.METERS_PER_SECOND.mo6420c(d));
                    setUnit(this.f11813r);
                } else {
                    i = (int) Math.round(C1302f.METERS_PER_SECOND.mo6418a(d));
                    setUnit(this.f11812q);
                }
                if (!z4 || !z2 || Math.abs(i - this.f11819x) < 2 || !isShown()) {
                    this.f11790C = -1;
                    this.f11791D = -1;
                    this.f11792E = -1;
                    m13018a(i, z4);
                } else {
                    this.f11790C = System.currentTimeMillis();
                    this.f11791D = this.f11819x;
                    this.f11792E = i;
                    postDelayed(this.f11796I, 100);
                }
            }
        }
    }

    public SpeedAndTotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13029f();
    }

    public SpeedAndTotsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13029f();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13018a(int i, boolean z) {
        m13023b(i, z && i > this.f11819x && Math.floor((double) (((float) i) / 5.0f)) != Math.floor((double) (((float) this.f11819x) / 5.0f)));
    }

    /* renamed from: a */
    private void m13020a(boolean z) {
        int i;
        long j;
        int i2;
        int i3;
        removeCallbacks(this.f11797J);
        if (isShown() && this.f11793F != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f11793F;
            int i4 = 360;
            if (currentTimeMillis >= 86400000) {
                i3 = (int) (currentTimeMillis / 86400000);
                i = this.f11814s;
                i2 = (int) ((((double) (currentTimeMillis - (((long) i3) * 86400000))) / 8.64E7d) * 360.0d);
                j = 240000;
            } else if (currentTimeMillis >= 3600000) {
                i3 = (int) (currentTimeMillis / 3600000);
                i = this.f11815t;
                i2 = (int) ((((double) (currentTimeMillis - (((long) i3) * 3600000))) / 3600000.0d) * 360.0d);
                j = 10000;
            } else if (currentTimeMillis >= 60000) {
                i3 = (int) (currentTimeMillis / 60000);
                i2 = (int) ((currentTimeMillis - (((long) i3) * 60000)) / 1000);
                i4 = 60;
                i = this.f11816u;
                j = 1000;
            } else {
                i3 = (int) (currentTimeMillis / 1000);
                j = 1000;
                z = false;
                i2 = 0;
                i = this.f11817v;
                i4 = 100;
            }
            m13023b(i3, z);
            setUnit(getResources().getQuantityString(i, i3));
            this.f11800e.mo9658a((float) i2, (float) i4);
            postDelayed(this.f11797J, (j - (currentTimeMillis % j)) + 1);
        }
    }
}

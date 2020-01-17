package app.zenly.locator.map.marker;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.map.marker.MarkerView;
import app.zenly.locator.p143s.p150n.C5457b;
import app.zenly.locator.p143s.p150n.C5459d;
import java.util.ArrayList;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.map.marker.e0 */
public abstract class C4178e0<V extends MarkerView> {

    /* renamed from: a */
    private final Context f11155a;

    /* renamed from: b */
    private final String f11156b;

    /* renamed from: c */
    private boolean f11157c = false;

    /* renamed from: d */
    private V f11158d;

    /* renamed from: e */
    private float f11159e = -1.0f;

    /* renamed from: f */
    private int f11160f = 0;

    /* renamed from: g */
    private boolean f11161g = true;

    /* renamed from: h */
    private boolean f11162h = true;

    /* renamed from: i */
    private final C5459d f11163i = new C5459d(Double.NaN, Double.NaN);

    /* renamed from: j */
    private double f11164j = 0.0d;

    /* renamed from: k */
    private float f11165k = 0.0f;

    /* renamed from: l */
    private boolean f11166l = false;

    /* renamed from: m */
    private boolean f11167m = false;

    /* renamed from: n */
    private boolean f11168n = false;

    /* renamed from: o */
    private final float f11169o;

    /* renamed from: p */
    private final float f11170p;

    /* renamed from: q */
    private boolean f11171q = false;

    /* renamed from: r */
    private ValueAnimator f11172r;

    /* renamed from: s */
    private final PointF f11173s = new PointF();

    /* renamed from: t */
    private final PointF f11174t = new PointF();

    /* renamed from: u */
    private final PointF f11175u = new PointF();

    /* renamed from: v */
    private Boolean f11176v = null;

    /* renamed from: w */
    private Boolean f11177w = null;

    /* renamed from: x */
    protected ArrayList<C4179a> f11178x = new ArrayList<>();

    /* renamed from: y */
    private AnimatorUpdateListener f11179y = new C4239p(this);

    /* renamed from: app.zenly.locator.map.marker.e0$a */
    public static class C4179a<T extends C4178e0> {
        /* renamed from: a */
        public void mo10911a(T t) {
        }

        /* renamed from: a */
        public void mo10954a(C4178e0 e0Var, double d) {
        }

        /* renamed from: a */
        public void mo10912a(T t, boolean z) {
        }

        /* renamed from: b */
        public void mo10913b(T t) {
        }

        /* renamed from: b */
        public void mo11077b(T t, boolean z) {
        }

        /* renamed from: c */
        public void mo10914c(T t) {
        }

        /* renamed from: c */
        public void mo11126c(T t, boolean z) {
        }

        /* renamed from: d */
        public void mo10915d(T t) {
        }

        /* renamed from: d */
        public void mo10916d(T t, boolean z) {
        }

        /* renamed from: e */
        public void mo10917e(T t) {
        }

        /* renamed from: f */
        public void mo11127f(T t) {
        }
    }

    protected C4178e0(Context context, String str) {
        this.f11155a = context;
        this.f11156b = str;
        this.f11169o = context.getResources().getDimension(R.dimen.marker_no_move_threshold);
        this.f11170p = context.getResources().getDimension(R.dimen.marker_no_anim_threshold);
    }

    /* renamed from: A */
    public boolean mo11019A() {
        return !Double.isNaN(this.f11163i.mo13060b()) && !Double.isNaN(this.f11163i.mo13062c());
    }

    /* renamed from: B */
    public boolean mo11020B() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo11085C() {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo10911a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo11086D() {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo10913b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo11087E() {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo10914c(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo11088F() {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo10915d(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo11061G() {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo10917e(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo11089H() {
        MarkerView g = mo11112g();
        if (g != null) {
            g.setZ((float) mo11046q());
        }
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo11127f(this);
        }
    }

    /* renamed from: I */
    public void mo11062I() {
        ValueAnimator valueAnimator = this.f11172r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f11173s.set(0.0f, 0.0f);
        this.f11174t.set(0.0f, 0.0f);
        this.f11175u.set(0.0f, 0.0f);
    }

    /* renamed from: a */
    public abstract void mo11033a();

    /* renamed from: a */
    public void mo11034a(float f, float f2) {
    }

    /* renamed from: a */
    public void mo11097a(PointF pointF, boolean z) {
        float max = Math.max(Math.abs(pointF.x - this.f11175u.x), Math.abs(pointF.y - this.f11175u.y));
        if (max > this.f11169o) {
            ValueAnimator valueAnimator = this.f11172r;
            if (valueAnimator == null) {
                this.f11172r = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                this.f11172r.setInterpolator(C7657c.m18649e());
                this.f11172r.addUpdateListener(this.f11179y);
                this.f11172r.setDuration(300);
            } else {
                valueAnimator.cancel();
            }
            this.f11173s.set(this.f11174t);
            this.f11175u.set(pointF);
            MarkerView g = mo11112g();
            if (g == null) {
                this.f11174t.set(this.f11175u);
            } else if (!z || max <= this.f11170p) {
                this.f11174t.set(this.f11175u);
                g.setTranslationX(pointF.x);
                g.setTranslationY(pointF.y);
                mo11088F();
            } else {
                this.f11172r.start();
            }
        }
    }

    /* renamed from: b */
    public void mo11103b(double d) {
        if (Double.compare(this.f11164j, d) != 0) {
            this.f11164j = d;
            mo11090a(d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11107c() {
        boolean B = mo11020B();
        if (this.f11177w != Boolean.valueOf(B)) {
            this.f11177w = Boolean.valueOf(B);
            mo11061G();
        }
    }

    /* renamed from: d */
    public float mo11069d() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11108d(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo10916d(this, z);
        }
    }

    /* renamed from: e */
    public float mo11070e() {
        return 0.0f;
    }

    /* renamed from: e */
    public void mo11109e(boolean z) {
        this.f11161g = z;
    }

    /* renamed from: f */
    public Context mo11110f() {
        return this.f11155a;
    }

    /* renamed from: g */
    public final V mo11112g() {
        return this.f11158d;
    }

    /* renamed from: h */
    public int mo11071h() {
        return 17;
    }

    /* renamed from: h */
    public void mo11039h(boolean z) {
        if (z != this.f11168n) {
            this.f11168n = z;
            mo11106b(z);
        }
    }

    /* renamed from: i */
    public void mo11072i(boolean z) {
        this.f11157c = z;
    }

    /* renamed from: j */
    public PointF mo11113j() {
        return this.f11174t;
    }

    /* renamed from: k */
    public C5459d mo11114k() {
        return this.f11163i;
    }

    /* renamed from: l */
    public double mo11043l() {
        return this.f11164j;
    }

    /* renamed from: m */
    public int mo11073m() {
        return C0540a.m2536a(this.f11155a, (int) R.color.gray_medium);
    }

    /* renamed from: n */
    public RectF mo11115n() {
        RectF rectF = new RectF();
        MarkerView g = mo11112g();
        if (g != null) {
            float[] fArr = new float[2];
            g.mo10879a(fArr);
            float significantAreaRadius = g.getSignificantAreaRadius();
            rectF.left = fArr[0] - significantAreaRadius;
            rectF.top = fArr[1] - significantAreaRadius;
            rectF.right = fArr[0] + significantAreaRadius;
            rectF.bottom = fArr[1] + significantAreaRadius;
        }
        return rectF;
    }

    /* renamed from: o */
    public String mo11116o() {
        return this.f11156b;
    }

    /* renamed from: p */
    public float mo11117p() {
        return this.f11165k;
    }

    /* renamed from: q */
    public int mo11046q() {
        return this.f11160f;
    }

    /* renamed from: r */
    public abstract V mo11076r();

    /* renamed from: s */
    public void mo11118s() {
        boolean A = mo11019A();
        this.f11163i.mo13061b(Double.NaN);
        this.f11163i.mo13063c(Double.NaN);
        if (A) {
            mo11102b();
        }
    }

    /* renamed from: t */
    public boolean mo11119t() {
        return this.f11157c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marker[z:");
        sb.append(mo11046q());
        sb.append(", uuid:");
        sb.append(mo11116o());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo11120u() {
        return this.f11161g;
    }

    /* renamed from: v */
    public boolean mo11121v() {
        return this.f11162h;
    }

    /* renamed from: w */
    public boolean mo11122w() {
        return this.f11167m;
    }

    /* renamed from: x */
    public boolean mo11123x() {
        return this.f11168n;
    }

    /* renamed from: y */
    public final boolean mo11124y() {
        return this.f11171q;
    }

    /* renamed from: z */
    public boolean mo11125z() {
        return this.f11166l;
    }

    /* renamed from: f */
    public void mo11111f(boolean z) {
        this.f11162h = z;
    }

    /* renamed from: g */
    public void mo11038g(boolean z) {
        if (z != this.f11167m) {
            this.f11167m = z;
            mo11101a(z);
        }
    }

    /* renamed from: i */
    public int mo11040i() {
        return mo11046q();
    }

    /* renamed from: j */
    public void mo11041j(boolean z) {
        if (z != this.f11171q) {
            this.f11171q = z;
            mo11037c(z);
        }
    }

    /* renamed from: k */
    public void mo11042k(boolean z) {
        if (z != this.f11166l) {
            this.f11166l = z;
            mo11108d(z);
        }
    }

    /* renamed from: b */
    public void mo11104b(float f, float f2) {
        if (f != this.f11159e) {
            this.f11159e = f;
            mo11034a(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11037c(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo11126c(this, z);
        }
    }

    /* renamed from: b */
    public void mo11105b(C4179a aVar) {
        this.f11178x.remove(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11102b() {
        boolean A = mo11019A();
        if (this.f11176v != Boolean.valueOf(A)) {
            this.f11176v = Boolean.valueOf(A);
            mo11087E();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11106b(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo11077b(this, z);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11095a(ValueAnimator valueAnimator) {
        MarkerView g = mo11112g();
        if (g != null) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            PointF pointF = this.f11174t;
            PointF pointF2 = this.f11173s;
            float f = pointF2.x;
            PointF pointF3 = this.f11175u;
            pointF.x = f + ((pointF3.x - f) * animatedFraction);
            float f2 = pointF2.y;
            pointF.y = f2 + ((pointF3.y - f2) * animatedFraction);
            g.setTranslationX(pointF.x);
            g.setTranslationY(this.f11174t.y);
            mo11088F();
            return;
        }
        mo11097a(this.f11175u, false);
    }

    /* renamed from: a */
    public void mo11100a(C5459d dVar) {
        if (dVar == null) {
            mo11091a(Double.NaN, Double.NaN);
        } else {
            mo11091a(dVar.mo13060b(), dVar.mo13062c());
        }
    }

    /* renamed from: a */
    public void mo11091a(double d, double d2) {
        boolean z = true;
        boolean z2 = !Double.isNaN(this.f11163i.mo13060b()) && !Double.isNaN(this.f11163i.mo13062c());
        if (Double.isNaN(d) || Double.isNaN(d2)) {
            z = false;
        }
        if (!C5457b.m15510b(this.f11163i.mo13060b(), this.f11163i.mo13062c(), d, d2)) {
            this.f11163i.mo13061b(d);
            this.f11163i.mo13063c(d2);
            if (z2 != z) {
                mo11102b();
            }
            mo11086D();
        }
    }

    /* renamed from: a */
    public void mo11092a(float f) {
        this.f11165k = f;
    }

    /* renamed from: a */
    public void mo11098a(V v) {
        this.f11158d = v;
    }

    /* renamed from: a */
    public void mo11094a(int i) {
        this.f11160f = i;
        mo11089H();
    }

    /* renamed from: a */
    public void mo11099a(C4179a aVar) {
        if (!this.f11178x.contains(aVar)) {
            this.f11178x.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11090a(double d) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo10954a(this, d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11101a(boolean z) {
        for (int size = this.f11178x.size() - 1; size >= 0; size--) {
            ((C4179a) this.f11178x.get(size)).mo10912a(this, z);
        }
    }

    /* renamed from: a */
    public void mo11096a(PointF pointF) {
        mo11093a(mo11069d(), mo11070e(), pointF);
    }

    /* renamed from: a */
    public void mo11093a(float f, float f2, PointF pointF) {
        int i;
        int i2;
        MarkerView g = mo11112g();
        if (g != null) {
            if (g.getWidth() == 0 || g.getHeight() == 0) {
                g.measure(0, 0);
                i2 = g.getMeasuredWidth();
                i = g.getMeasuredHeight();
            } else {
                i2 = g.getWidth();
                i = g.getHeight();
            }
            float f3 = (float) i2;
            float f4 = (float) i;
            pointF.set((f3 * f) - ((f - (g.getPivotX() / f3)) * (f3 - (g.getScaleX() * f3))), (f4 * f2) - ((f2 - (g.getPivotY() / f4)) * (f4 - (g.getScaleY() * f4))));
        }
    }
}

package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.core.widget.a */
public abstract class C0671a implements OnTouchListener {

    /* renamed from: v */
    private static final int f2874v = ViewConfiguration.getTapTimeout();

    /* renamed from: e */
    final C0672a f2875e = new C0672a();

    /* renamed from: f */
    private final Interpolator f2876f = new AccelerateInterpolator();

    /* renamed from: g */
    final View f2877g;

    /* renamed from: h */
    private Runnable f2878h;

    /* renamed from: i */
    private float[] f2879i = {0.0f, 0.0f};

    /* renamed from: j */
    private float[] f2880j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k */
    private int f2881k;

    /* renamed from: l */
    private int f2882l;

    /* renamed from: m */
    private float[] f2883m = {0.0f, 0.0f};

    /* renamed from: n */
    private float[] f2884n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f2885o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: p */
    private boolean f2886p;

    /* renamed from: q */
    boolean f2887q;

    /* renamed from: r */
    boolean f2888r;

    /* renamed from: s */
    boolean f2889s;

    /* renamed from: t */
    private boolean f2890t;

    /* renamed from: u */
    private boolean f2891u;

    /* renamed from: androidx.core.widget.a$a */
    private static class C0672a {

        /* renamed from: a */
        private int f2892a;

        /* renamed from: b */
        private int f2893b;

        /* renamed from: c */
        private float f2894c;

        /* renamed from: d */
        private float f2895d;

        /* renamed from: e */
        private long f2896e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2897f = 0;

        /* renamed from: g */
        private int f2898g = 0;

        /* renamed from: h */
        private int f2899h = 0;

        /* renamed from: i */
        private long f2900i = -1;

        /* renamed from: j */
        private float f2901j;

        /* renamed from: k */
        private int f2902k;

        C0672a() {
        }

        /* renamed from: a */
        private float m3146a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3516a(int i) {
            this.f2893b = i;
        }

        /* renamed from: b */
        public void mo3518b(int i) {
            this.f2892a = i;
        }

        /* renamed from: c */
        public int mo3519c() {
            return this.f2899h;
        }

        /* renamed from: d */
        public int mo3520d() {
            float f = this.f2894c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int mo3521e() {
            float f = this.f2895d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean mo3522f() {
            return this.f2900i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2900i + ((long) this.f2902k);
        }

        /* renamed from: g */
        public void mo3523g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2902k = C0671a.m3127a((int) (currentAnimationTimeMillis - this.f2896e), 0, this.f2893b);
            this.f2901j = m3147a(currentAnimationTimeMillis);
            this.f2900i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void mo3524h() {
            this.f2896e = AnimationUtils.currentAnimationTimeMillis();
            this.f2900i = -1;
            this.f2897f = this.f2896e;
            this.f2901j = 0.5f;
            this.f2898g = 0;
            this.f2899h = 0;
        }

        /* renamed from: a */
        private float m3147a(long j) {
            if (j < this.f2896e) {
                return 0.0f;
            }
            long j2 = this.f2900i;
            if (j2 < 0 || j < j2) {
                return C0671a.m3124a(((float) (j - this.f2896e)) / ((float) this.f2892a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f2901j;
            return (1.0f - f) + (f * C0671a.m3124a(((float) j3) / ((float) this.f2902k), 0.0f, 1.0f));
        }

        /* renamed from: b */
        public int mo3517b() {
            return this.f2898g;
        }

        /* renamed from: a */
        public void mo3514a() {
            if (this.f2897f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m3146a(m3147a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f2897f;
                this.f2897f = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f2898g = (int) (this.f2894c * f);
                this.f2899h = (int) (f * this.f2895d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo3515a(float f, float f2) {
            this.f2894c = f;
            this.f2895d = f2;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class C0673b implements Runnable {
        C0673b() {
        }

        public void run() {
            C0671a aVar = C0671a.this;
            if (aVar.f2889s) {
                if (aVar.f2887q) {
                    aVar.f2887q = false;
                    aVar.f2875e.mo3524h();
                }
                C0672a aVar2 = C0671a.this.f2875e;
                if (aVar2.mo3522f() || !C0671a.this.mo3504b()) {
                    C0671a.this.f2889s = false;
                    return;
                }
                C0671a aVar3 = C0671a.this;
                if (aVar3.f2888r) {
                    aVar3.f2888r = false;
                    aVar3.mo3500a();
                }
                aVar2.mo3514a();
                C0671a.this.mo3501a(aVar2.mo3517b(), aVar2.mo3519c());
                ViewCompat.m2826a(C0671a.this.f2877g, (Runnable) this);
            }
        }
    }

    public C0671a(View view) {
        this.f2877g = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int i = (int) ((f * 315.0f) + 0.5f);
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3503b(f2, f2);
        float f3 = (float) i;
        mo3506c(f3, f3);
        mo3509d(1);
        mo3498a(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3508d(0.2f, 0.2f);
        mo3510e(1.0f, 1.0f);
        mo3507c(f2874v);
        mo3512f(500);
        mo3511e(500);
    }

    /* renamed from: a */
    static float m3124a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m3127a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public C0671a mo3499a(boolean z) {
        if (this.f2890t && !z) {
            m3128c();
        }
        this.f2890t = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo3501a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo3502a(int i);

    /* renamed from: b */
    public C0671a mo3503b(float f, float f2) {
        float[] fArr = this.f2885o;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public abstract boolean mo3505b(int i);

    /* renamed from: c */
    public C0671a mo3506c(float f, float f2) {
        float[] fArr = this.f2884n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: d */
    public C0671a mo3509d(int i) {
        this.f2881k = i;
        return this;
    }

    /* renamed from: e */
    public C0671a mo3510e(float f, float f2) {
        float[] fArr = this.f2883m;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: f */
    public C0671a mo3512f(int i) {
        this.f2875e.mo3518b(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2890t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m3128c()
            goto L_0x0058
        L_0x001a:
            r5.f2888r = r2
            r5.f2886p = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2877g
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m3126a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2877g
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m3126a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2875e
            r7.mo3515a(r0, r6)
            boolean r6 = r5.f2889s
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3504b()
            if (r6 == 0) goto L_0x0058
            r5.m3129d()
        L_0x0058:
            boolean r6 = r5.f2891u
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2889s
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0671a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: f */
    private float m3130f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2881k;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f2889s || this.f2881k != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: d */
    public C0671a mo3508d(float f, float f2) {
        float[] fArr = this.f2879i;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3504b() {
        C0672a aVar = this.f2875e;
        int e = aVar.mo3521e();
        int d = aVar.mo3520d();
        return (e != 0 && mo3505b(e)) || (d != 0 && mo3502a(d));
    }

    /* renamed from: c */
    public C0671a mo3507c(int i) {
        this.f2882l = i;
        return this;
    }

    /* renamed from: e */
    public C0671a mo3511e(int i) {
        this.f2875e.mo3516a(i);
        return this;
    }

    /* renamed from: c */
    private void m3128c() {
        if (this.f2887q) {
            this.f2889s = false;
        } else {
            this.f2875e.mo3523g();
        }
    }

    /* renamed from: d */
    private void m3129d() {
        if (this.f2878h == null) {
            this.f2878h = new C0673b();
        }
        this.f2889s = true;
        this.f2887q = true;
        if (!this.f2886p) {
            int i = this.f2882l;
            if (i > 0) {
                ViewCompat.m2827a(this.f2877g, this.f2878h, (long) i);
                this.f2886p = true;
            }
        }
        this.f2878h.run();
        this.f2886p = true;
    }

    /* renamed from: a */
    public C0671a mo3498a(float f, float f2) {
        float[] fArr = this.f2880j;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    private float m3126a(int i, float f, float f2, float f3) {
        float a = m3125a(this.f2879i[i], f2, this.f2880j[i], f);
        int i2 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f2883m[i];
        float f5 = this.f2884n[i];
        float f6 = this.f2885o[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m3124a(a * f7, f5, f6);
        }
        return -m3124a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    private float m3125a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m3124a(f * f2, 0.0f, f3);
        float f6 = m3130f(f2 - f4, a) - m3130f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f2876f.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2876f.getInterpolation(f6);
        }
        return m3124a(f5, -1.0f, 1.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3500a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2877g.onTouchEvent(obtain);
        obtain.recycle();
    }
}

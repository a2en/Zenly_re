package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1076n;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: androidx.recyclerview.widget.i */
class C1121i extends C1074l implements OnItemTouchListener {

    /* renamed from: D */
    private static final int[] f4283D = {16842919};

    /* renamed from: E */
    private static final int[] f4284E = new int[0];

    /* renamed from: A */
    int f4285A = 0;

    /* renamed from: B */
    private final Runnable f4286B = new C1122a();

    /* renamed from: C */
    private final C1076n f4287C = new C1123b();

    /* renamed from: a */
    private final int f4288a;

    /* renamed from: b */
    private final int f4289b;

    /* renamed from: c */
    final StateListDrawable f4290c;

    /* renamed from: d */
    final Drawable f4291d;

    /* renamed from: e */
    private final int f4292e;

    /* renamed from: f */
    private final int f4293f;

    /* renamed from: g */
    private final StateListDrawable f4294g;

    /* renamed from: h */
    private final Drawable f4295h;

    /* renamed from: i */
    private final int f4296i;

    /* renamed from: j */
    private final int f4297j;

    /* renamed from: k */
    int f4298k;

    /* renamed from: l */
    int f4299l;

    /* renamed from: m */
    float f4300m;

    /* renamed from: n */
    int f4301n;

    /* renamed from: o */
    int f4302o;

    /* renamed from: p */
    float f4303p;

    /* renamed from: q */
    private int f4304q = 0;

    /* renamed from: r */
    private int f4305r = 0;

    /* renamed from: s */
    private RecyclerView f4306s;

    /* renamed from: t */
    private boolean f4307t = false;

    /* renamed from: u */
    private boolean f4308u = false;

    /* renamed from: v */
    private int f4309v = 0;

    /* renamed from: w */
    private int f4310w = 0;

    /* renamed from: x */
    private final int[] f4311x = new int[2];

    /* renamed from: y */
    private final int[] f4312y = new int[2];

    /* renamed from: z */
    final ValueAnimator f4313z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: androidx.recyclerview.widget.i$a */
    class C1122a implements Runnable {
        C1122a() {
        }

        public void run() {
            C1121i.this.mo5704a(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    class C1123b extends C1076n {
        C1123b() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C1121i.this.mo5705a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    private class C1124c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4316a = false;

        C1124c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f4316a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f4316a) {
                this.f4316a = false;
                return;
            }
            if (((Float) C1121i.this.f4313z.getAnimatedValue()).floatValue() == 0.0f) {
                C1121i iVar = C1121i.this;
                iVar.f4285A = 0;
                iVar.mo5709b(0);
            } else {
                C1121i iVar2 = C1121i.this;
                iVar2.f4285A = 2;
                iVar2.mo5703a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$d */
    private class C1125d implements AnimatorUpdateListener {
        C1125d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1121i.this.f4290c.setAlpha(floatValue);
            C1121i.this.f4291d.setAlpha(floatValue);
            C1121i.this.mo5703a();
        }
    }

    C1121i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f4290c = stateListDrawable;
        this.f4291d = drawable;
        this.f4294g = stateListDrawable2;
        this.f4295h = drawable2;
        this.f4292e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4293f = Math.max(i, drawable.getIntrinsicWidth());
        this.f4296i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4297j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4288a = i2;
        this.f4289b = i3;
        this.f4290c.setAlpha(255);
        this.f4291d.setAlpha(255);
        this.f4313z.addListener(new C1124c());
        this.f4313z.addUpdateListener(new C1125d());
        mo5706a(recyclerView);
    }

    /* renamed from: c */
    private void m5494c() {
        this.f4306s.removeCallbacks(this.f4286B);
    }

    /* renamed from: d */
    private void m5496d() {
        this.f4306s.mo5065b((C1074l) this);
        this.f4306s.mo5064b((OnItemTouchListener) this);
        this.f4306s.mo5066b(this.f4287C);
        m5494c();
    }

    /* renamed from: e */
    private int[] m5497e() {
        int[] iArr = this.f4312y;
        int i = this.f4289b;
        iArr[0] = i;
        iArr[1] = this.f4304q - i;
        return iArr;
    }

    /* renamed from: f */
    private int[] m5498f() {
        int[] iArr = this.f4311x;
        int i = this.f4289b;
        iArr[0] = i;
        iArr[1] = this.f4305r - i;
        return iArr;
    }

    /* renamed from: g */
    private boolean m5499g() {
        return ViewCompat.m2862o(this.f4306s) == 1;
    }

    /* renamed from: h */
    private void m5500h() {
        this.f4306s.mo5045a((C1074l) this);
        this.f4306s.mo5043a((OnItemTouchListener) this);
        this.f4306s.mo5047a(this.f4287C);
    }

    /* renamed from: a */
    public void mo5706a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4306s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5496d();
            }
            this.f4306s = recyclerView;
            if (this.f4306s != null) {
                m5500h();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5709b(int i) {
        if (i == 2 && this.f4309v != 2) {
            this.f4290c.setState(f4283D);
            m5494c();
        }
        if (i == 0) {
            mo5703a();
        } else {
            mo5708b();
        }
        if (this.f4309v == 2 && i != 2) {
            this.f4290c.setState(f4284E);
            m5495c(1200);
        } else if (i == 1) {
            m5495c(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f4309v = i;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1082s sVar) {
        if (this.f4304q == this.f4306s.getWidth() && this.f4305r == this.f4306s.getHeight()) {
            if (this.f4285A != 0) {
                if (this.f4307t) {
                    m5493b(canvas);
                }
                if (this.f4308u) {
                    m5491a(canvas);
                }
            }
            return;
        }
        this.f4304q = this.f4306s.getWidth();
        this.f4305r = this.f4306s.getHeight();
        mo5709b(0);
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4309v;
        if (i == 1) {
            boolean b = mo5710b(motionEvent.getX(), motionEvent.getY());
            boolean a = mo5707a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b && !a) {
                return false;
            }
            if (a) {
                this.f4310w = 1;
                this.f4303p = (float) ((int) motionEvent.getX());
            } else if (b) {
                this.f4310w = 2;
                this.f4300m = (float) ((int) motionEvent.getY());
            }
            mo5709b(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4309v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = mo5710b(motionEvent.getX(), motionEvent.getY());
                boolean a = mo5707a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f4310w = 1;
                        this.f4303p = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f4310w = 2;
                        this.f4300m = (float) ((int) motionEvent.getY());
                    }
                    mo5709b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f4309v == 2) {
                this.f4300m = 0.0f;
                this.f4303p = 0.0f;
                mo5709b(1);
                this.f4310w = 0;
            } else if (motionEvent.getAction() == 2 && this.f4309v == 2) {
                mo5708b();
                if (this.f4310w == 1) {
                    m5490a(motionEvent.getX());
                }
                if (this.f4310w == 2) {
                    m5492b(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: c */
    private void m5495c(int i) {
        m5494c();
        this.f4306s.postDelayed(this.f4286B, (long) i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5703a() {
        this.f4306s.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5704a(int i) {
        int i2 = this.f4285A;
        if (i2 == 1) {
            this.f4313z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f4285A = 3;
        ValueAnimator valueAnimator = this.f4313z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f4313z.setDuration((long) i);
        this.f4313z.start();
    }

    /* renamed from: b */
    public void mo5708b() {
        int i = this.f4285A;
        if (i != 0) {
            if (i == 3) {
                this.f4313z.cancel();
            } else {
                return;
            }
        }
        this.f4285A = 1;
        ValueAnimator valueAnimator = this.f4313z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f4313z.setDuration(500);
        this.f4313z.setStartDelay(0);
        this.f4313z.start();
    }

    /* renamed from: a */
    private void m5491a(Canvas canvas) {
        int i = this.f4305r;
        int i2 = this.f4296i;
        int i3 = i - i2;
        int i4 = this.f4302o;
        int i5 = this.f4301n;
        int i6 = i4 - (i5 / 2);
        this.f4294g.setBounds(0, 0, i5, i2);
        this.f4295h.setBounds(0, 0, this.f4304q, this.f4297j);
        canvas.translate(0.0f, (float) i3);
        this.f4295h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f4294g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: b */
    private void m5493b(Canvas canvas) {
        int i = this.f4304q;
        int i2 = this.f4292e;
        int i3 = i - i2;
        int i4 = this.f4299l;
        int i5 = this.f4298k;
        int i6 = i4 - (i5 / 2);
        this.f4290c.setBounds(0, 0, i2, i5);
        this.f4291d.setBounds(0, 0, this.f4293f, this.f4305r);
        if (m5499g()) {
            this.f4291d.draw(canvas);
            canvas.translate((float) this.f4292e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4290c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f4292e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f4291d.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f4290c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5705a(int i, int i2) {
        int computeVerticalScrollRange = this.f4306s.computeVerticalScrollRange();
        int i3 = this.f4305r;
        this.f4307t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f4288a;
        int computeHorizontalScrollRange = this.f4306s.computeHorizontalScrollRange();
        int i4 = this.f4304q;
        this.f4308u = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f4288a;
        if (this.f4307t || this.f4308u) {
            if (this.f4307t) {
                float f = (float) i3;
                this.f4299l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f4298k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f4308u) {
                float f2 = (float) i4;
                this.f4302o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f4301n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f4309v;
            if (i5 == 0 || i5 == 1) {
                mo5709b(1);
            }
            return;
        }
        if (this.f4309v != 0) {
            mo5709b(0);
        }
    }

    /* renamed from: b */
    private void m5492b(float f) {
        int[] f2 = m5498f();
        float max = Math.max((float) f2[0], Math.min((float) f2[1], f));
        if (Math.abs(((float) this.f4299l) - max) >= 2.0f) {
            int a = m5489a(this.f4300m, max, f2, this.f4306s.computeVerticalScrollRange(), this.f4306s.computeVerticalScrollOffset(), this.f4305r);
            if (a != 0) {
                this.f4306s.scrollBy(0, a);
            }
            this.f4300m = max;
        }
    }

    /* renamed from: a */
    private void m5490a(float f) {
        int[] e = m5497e();
        float max = Math.max((float) e[0], Math.min((float) e[1], f));
        if (Math.abs(((float) this.f4302o) - max) >= 2.0f) {
            int a = m5489a(this.f4303p, max, e, this.f4306s.computeHorizontalScrollRange(), this.f4306s.computeHorizontalScrollOffset(), this.f4304q);
            if (a != 0) {
                this.f4306s.scrollBy(a, 0);
            }
            this.f4303p = max;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5710b(float f, float f2) {
        if (!m5499g() ? f >= ((float) (this.f4304q - this.f4292e)) : f <= ((float) (this.f4292e / 2))) {
            int i = this.f4299l;
            int i2 = this.f4298k;
            if (f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private int m5489a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5707a(float f, float f2) {
        if (f2 >= ((float) (this.f4305r - this.f4296i))) {
            int i = this.f4302o;
            int i2 = this.f4301n;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }
}

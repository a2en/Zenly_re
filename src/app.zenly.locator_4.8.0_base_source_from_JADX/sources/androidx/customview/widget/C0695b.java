package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.android.volley.toolbox.C8733j;
import java.util.Arrays;

/* renamed from: androidx.customview.widget.b */
public class C0695b {

    /* renamed from: w */
    private static final Interpolator f2951w = new C0696a();

    /* renamed from: a */
    private int f2952a;

    /* renamed from: b */
    private int f2953b;

    /* renamed from: c */
    private int f2954c = -1;

    /* renamed from: d */
    private float[] f2955d;

    /* renamed from: e */
    private float[] f2956e;

    /* renamed from: f */
    private float[] f2957f;

    /* renamed from: g */
    private float[] f2958g;

    /* renamed from: h */
    private int[] f2959h;

    /* renamed from: i */
    private int[] f2960i;

    /* renamed from: j */
    private int[] f2961j;

    /* renamed from: k */
    private int f2962k;

    /* renamed from: l */
    private VelocityTracker f2963l;

    /* renamed from: m */
    private float f2964m;

    /* renamed from: n */
    private float f2965n;

    /* renamed from: o */
    private int f2966o;

    /* renamed from: p */
    private int f2967p;

    /* renamed from: q */
    private OverScroller f2968q;

    /* renamed from: r */
    private final C0698c f2969r;

    /* renamed from: s */
    private View f2970s;

    /* renamed from: t */
    private boolean f2971t;

    /* renamed from: u */
    private final ViewGroup f2972u;

    /* renamed from: v */
    private final Runnable f2973v = new C0697b();

    /* renamed from: androidx.customview.widget.b$a */
    static class C0696a implements Interpolator {
        C0696a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.customview.widget.b$b */
    class C0697b implements Runnable {
        C0697b() {
        }

        public void run() {
            C0695b.this.mo3584b(0);
        }
    }

    /* renamed from: androidx.customview.widget.b$c */
    public static abstract class C0698c {
        /* renamed from: a */
        public int mo3592a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo3593a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo3594a(View view, int i, int i2);

        /* renamed from: a */
        public void mo3595a(int i, int i2) {
        }

        /* renamed from: a */
        public abstract void mo3596a(View view, float f, float f2);

        /* renamed from: a */
        public void mo3597a(View view, int i) {
        }

        /* renamed from: a */
        public abstract void mo3598a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo3599b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo3600b(View view, int i, int i2);

        /* renamed from: b */
        public void mo3601b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo3602b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo3603b(View view, int i);

        /* renamed from: c */
        public abstract void mo3604c(int i);
    }

    private C0695b(Context context, ViewGroup viewGroup, C0698c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f2972u = viewGroup;
            this.f2969r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f2966o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2953b = viewConfiguration.getScaledTouchSlop();
            this.f2964m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2965n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2968q = new OverScroller(context, f2951w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public static C0695b m3271a(ViewGroup viewGroup, C0698c cVar) {
        return new C0695b(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: d */
    private void m3285d(int i) {
        float[] fArr = this.f2955d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f2955d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f2956e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f2957f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f2958g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f2959h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2960i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2961j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2955d = fArr2;
            this.f2956e = fArr3;
            this.f2957f = fArr4;
            this.f2958g = fArr5;
            this.f2959h = iArr;
            this.f2960i = iArr2;
            this.f2961j = iArr3;
        }
    }

    /* renamed from: e */
    private boolean m3286e(int i) {
        if (mo3580a(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    /* renamed from: b */
    public int mo3583b() {
        return this.f2953b;
    }

    /* renamed from: c */
    public boolean mo3589c(int i, int i2) {
        if (this.f2971t) {
            return m3279b(i, i2, (int) this.f2963l.getXVelocity(this.f2954c), (int) this.f2963l.getYVelocity(this.f2954c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    public static C0695b m3270a(ViewGroup viewGroup, float f, C0698c cVar) {
        C0695b a = m3271a(viewGroup, cVar);
        a.f2953b = (int) (((float) a.f2953b) * (1.0f / f));
        return a;
    }

    /* renamed from: b */
    public boolean mo3588b(View view, int i, int i2) {
        this.f2970s = view;
        this.f2954c = -1;
        boolean b = m3279b(i, i2, 0, 0);
        if (!b && this.f2952a == 0 && this.f2970s != null) {
            this.f2970s = null;
        }
        return b;
    }

    /* renamed from: a */
    public void mo3579a(View view, int i) {
        if (view.getParent() == this.f2972u) {
            this.f2970s = view;
            this.f2954c = i;
            this.f2969r.mo3597a(view, i);
            mo3584b(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f2972u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private boolean m3279b(int i, int i2, int i3, int i4) {
        int left = this.f2970s.getLeft();
        int top = this.f2970s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f2968q.abortAnimation();
            mo3584b(0);
            return false;
        }
        this.f2968q.startScroll(left, top, i5, i6, m3269a(this.f2970s, i5, i6, i3, i4));
        mo3584b(2);
        return true;
    }

    /* renamed from: c */
    private void m3280c() {
        float[] fArr = this.f2955d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2956e, 0.0f);
            Arrays.fill(this.f2957f, 0.0f);
            Arrays.fill(this.f2958g, 0.0f);
            Arrays.fill(this.f2959h, 0);
            Arrays.fill(this.f2960i, 0);
            Arrays.fill(this.f2961j, 0);
            this.f2962k = 0;
        }
    }

    /* renamed from: a */
    public void mo3577a() {
        this.f2954c = -1;
        m3280c();
        VelocityTracker velocityTracker = this.f2963l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2963l = null;
        }
    }

    /* renamed from: b */
    private int m3277b(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f2972u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m3266a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: a */
    private int m3269a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m3268a(i3, (int) this.f2965n, (int) this.f2964m);
        int a2 = m3268a(i4, (int) this.f2965n, (int) this.f2964m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m3277b(i, a, this.f2969r.mo3593a(view))) * f5) + (((float) m3277b(i2, a2, this.f2969r.mo3599b(view))) * f6));
    }

    /* renamed from: c */
    private void m3281c(int i) {
        if (this.f2955d != null && mo3580a(i)) {
            this.f2955d[i] = 0.0f;
            this.f2956e[i] = 0.0f;
            this.f2957f[i] = 0.0f;
            this.f2958g[i] = 0.0f;
            this.f2959h[i] = 0;
            this.f2960i[i] = 0;
            this.f2961j[i] = 0;
            this.f2962k = (~(1 << i)) & this.f2962k;
        }
    }

    /* renamed from: b */
    private void m3278b(float f, float f2, int i) {
        m3285d(i);
        float[] fArr = this.f2955d;
        this.f2957f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f2956e;
        this.f2958g[i] = f2;
        fArr2[i] = f2;
        this.f2959h[i] = m3283d((int) f, (int) f2);
        this.f2962k |= 1 << i;
    }

    /* renamed from: a */
    private int m3268a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private float m3267a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: d */
    private void m3284d() {
        this.f2963l.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, this.f2964m);
        m3272a(m3267a(this.f2963l.getXVelocity(this.f2954c), this.f2965n, this.f2964m), m3267a(this.f2963l.getYVelocity(this.f2954c), this.f2965n, this.f2964m));
    }

    /* renamed from: a */
    private float m3266a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: c */
    private void m3282c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m3286e(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2957f[pointerId] = x;
                this.f2958g[pointerId] = y;
            }
        }
    }

    /* renamed from: a */
    public boolean mo3582a(boolean z) {
        if (this.f2952a == 2) {
            boolean computeScrollOffset = this.f2968q.computeScrollOffset();
            int currX = this.f2968q.getCurrX();
            int currY = this.f2968q.getCurrY();
            int left = currX - this.f2970s.getLeft();
            int top = currY - this.f2970s.getTop();
            if (left != 0) {
                ViewCompat.m2846d(this.f2970s, left);
            }
            if (top != 0) {
                ViewCompat.m2848e(this.f2970s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f2969r.mo3598a(this.f2970s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f2968q.getFinalX() && currY == this.f2968q.getFinalY()) {
                this.f2968q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f2972u.post(this.f2973v);
                } else {
                    mo3584b(0);
                }
            }
        }
        if (this.f2952a == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3584b(int i) {
        this.f2972u.removeCallbacks(this.f2973v);
        if (this.f2952a != i) {
            this.f2952a = i;
            this.f2969r.mo3604c(i);
            if (this.f2952a == 0) {
                this.f2970s = null;
            }
        }
    }

    /* renamed from: d */
    private int m3283d(int i, int i2) {
        int i3 = i < this.f2972u.getLeft() + this.f2966o ? 1 : 0;
        if (i2 < this.f2972u.getTop() + this.f2966o) {
            i3 |= 4;
        }
        if (i > this.f2972u.getRight() - this.f2966o) {
            i3 |= 2;
        }
        return i2 > this.f2972u.getBottom() - this.f2966o ? i3 | 8 : i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3587b(View view, int i) {
        if (view == this.f2970s && this.f2954c == i) {
            return true;
        }
        if (view == null || !this.f2969r.mo3603b(view, i)) {
            return false;
        }
        this.f2954c = i;
        mo3579a(view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3586b(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo3577a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f2963l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f2963l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f2963l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m3281c(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m3278b(r7, r1, r2)
            int r3 = r0.f2952a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f2959h
            r1 = r1[r2]
            int r3 = r0.f2967p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            androidx.customview.widget.b$c r4 = r0.f2969r
            r1 = r1 & r3
            r4.mo3601b(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo3576a(r3, r1)
            android.view.View r3 = r0.f2970s
            if (r1 != r3) goto L_0x0031
            r0.mo3587b(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f2955d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f2956e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m3286e(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f2955d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f2956e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo3576a(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m3276a(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            androidx.customview.widget.b$c r14 = r0.f2969r
            int r12 = r14.mo3594a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            androidx.customview.widget.b$c r5 = r0.f2969r
            int r5 = r5.mo3600b(r7, r15, r14)
            androidx.customview.widget.b$c r14 = r0.f2969r
            int r14 = r14.mo3593a(r7)
            androidx.customview.widget.b$c r15 = r0.f2969r
            int r15 = r15.mo3599b(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m3273a(r9, r10, r4)
            int r5 = r0.f2952a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo3587b(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m3282c(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo3577a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m3278b(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo3576a(r2, r3)
            android.view.View r3 = r0.f2970s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f2952a
            if (r3 != r4) goto L_0x0125
            r0.mo3587b(r2, r1)
        L_0x0125:
            int[] r2 = r0.f2959h
            r2 = r2[r1]
            int r3 = r0.f2967p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            androidx.customview.widget.b$c r4 = r0.f2969r
            r2 = r2 & r3
            r4.mo3601b(r2, r1)
        L_0x0135:
            int r1 = r0.f2952a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.C0695b.mo3586b(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m3272a(float f, float f2) {
        this.f2971t = true;
        this.f2969r.mo3596a(this.f2970s, f, f2);
        this.f2971t = false;
        if (this.f2952a == 1) {
            mo3584b(0);
        }
    }

    /* renamed from: a */
    public boolean mo3580a(int i) {
        return ((1 << i) & this.f2962k) != 0;
    }

    /* renamed from: a */
    public void mo3578a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo3577a();
        }
        if (this.f2963l == null) {
            this.f2963l = VelocityTracker.obtain();
        }
        this.f2963l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View a = mo3576a((int) x, (int) y);
            m3278b(x, y, pointerId);
            mo3587b(a, pointerId);
            int i3 = this.f2959h[pointerId];
            int i4 = this.f2967p;
            if ((i3 & i4) != 0) {
                this.f2969r.mo3601b(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f2952a == 1) {
                m3284d();
            }
            mo3577a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f2952a == 1) {
                    m3272a(0.0f, 0.0f);
                }
                mo3577a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m3278b(x2, y2, pointerId2);
                if (this.f2952a == 0) {
                    mo3587b(mo3576a((int) x2, (int) y2), pointerId2);
                    int i5 = this.f2959h[pointerId2];
                    int i6 = this.f2967p;
                    if ((i5 & i6) != 0) {
                        this.f2969r.mo3601b(i5 & i6, pointerId2);
                    }
                } else if (mo3585b((int) x2, (int) y2)) {
                    mo3587b(this.f2970s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f2952a == 1 && pointerId3 == this.f2954c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f2954c) {
                            View a2 = mo3576a((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f2970s;
                            if (a2 == view && mo3587b(view, pointerId4)) {
                                i = this.f2954c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m3284d();
                    }
                }
                m3281c(pointerId3);
            }
        } else if (this.f2952a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m3286e(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f2955d[pointerId5];
                    float f2 = y3 - this.f2956e[pointerId5];
                    m3273a(f, f2, pointerId5);
                    if (this.f2952a != 1) {
                        View a3 = mo3576a((int) x3, (int) y3);
                        if (m3276a(a3, f, f2) && mo3587b(a3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m3282c(motionEvent);
        } else if (m3286e(this.f2954c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2954c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f2957f;
            int i7 = this.f2954c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f2958g[i7]);
            m3274a(this.f2970s.getLeft() + i8, this.f2970s.getTop() + i9, i8, i9);
            m3282c(motionEvent);
        }
    }

    /* renamed from: b */
    public boolean mo3585b(int i, int i2) {
        return mo3581a(this.f2970s, i, i2);
    }

    /* renamed from: a */
    private void m3273a(float f, float f2, int i) {
        int i2 = 1;
        if (!m3275a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m3275a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m3275a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m3275a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f2960i;
            iArr[i] = iArr[i] | i2;
            this.f2969r.mo3595a(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m3275a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f2959h[i] & i2) != i2 || (this.f2967p & i2) == 0 || (this.f2961j[i] & i2) == i2 || (this.f2960i[i] & i2) == i2)) {
            int i3 = this.f2953b;
            if (abs > ((float) i3) || abs2 > ((float) i3)) {
                if (abs < abs2 * 0.5f && this.f2969r.mo3602b(i2)) {
                    int[] iArr = this.f2961j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f2960i[i] & i2) == 0 && abs > ((float) this.f2953b)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m3276a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f2969r.mo3593a(view) > 0;
        boolean z3 = this.f2969r.mo3599b(view) > 0;
        if (z2 && z3) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f2953b;
            if (f3 > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f2953b)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f2953b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    private void m3274a(int i, int i2, int i3, int i4) {
        int left = this.f2970s.getLeft();
        int top = this.f2970s.getTop();
        if (i3 != 0) {
            i = this.f2969r.mo3594a(this.f2970s, i, i3);
            ViewCompat.m2846d(this.f2970s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f2969r.mo3600b(this.f2970s, i2, i4);
            ViewCompat.m2848e(this.f2970s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f2969r.mo3598a(this.f2970s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    public boolean mo3581a(View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public View mo3576a(int i, int i2) {
        for (int childCount = this.f2972u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f2972u;
            this.f2969r.mo3592a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }
}

package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.OverScroller;

/* renamed from: com.github.chrisbanes.photoview.d */
public class C9958d implements OnTouchListener, OnLayoutChangeListener {

    /* renamed from: J */
    private static float f26114J = 3.0f;

    /* renamed from: K */
    private static float f26115K = 1.75f;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static float f26116L = 1.0f;

    /* renamed from: M */
    private static int f26117M = 200;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static int f26118N = 1;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public OnSingleFlingListener f26119A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public OnViewDragListener f26120B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C9964f f26121C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f26122D = 2;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f26123E = 2;

    /* renamed from: F */
    private float f26124F;

    /* renamed from: G */
    private boolean f26125G = true;

    /* renamed from: H */
    private ScaleType f26126H = ScaleType.FIT_CENTER;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C9957c f26127I = new C9959a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Interpolator f26128e = new AccelerateDecelerateInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26129f = f26117M;

    /* renamed from: g */
    private float f26130g = f26116L;

    /* renamed from: h */
    private float f26131h = f26115K;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f26132i = f26114J;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f26133j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f26134k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ImageView f26135l;

    /* renamed from: m */
    private GestureDetector f26136m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C9955b f26137n;

    /* renamed from: o */
    private final Matrix f26138o = new Matrix();

    /* renamed from: p */
    private final Matrix f26139p = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Matrix f26140q = new Matrix();

    /* renamed from: r */
    private final RectF f26141r = new RectF();

    /* renamed from: s */
    private final float[] f26142s = new float[9];

    /* renamed from: t */
    private OnMatrixChangedListener f26143t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public OnPhotoTapListener f26144u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public OnOutsidePhotoTapListener f26145v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public OnViewTapListener f26146w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public OnClickListener f26147x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public OnLongClickListener f26148y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public OnScaleChangedListener f26149z;

    /* renamed from: com.github.chrisbanes.photoview.d$a */
    class C9959a implements C9957c {
        C9959a() {
        }

        /* renamed from: a */
        public void mo26863a(float f, float f2, float f3, float f4) {
            C9958d dVar = C9958d.this;
            dVar.f26121C = new C9964f(dVar.f26135l.getContext());
            C9964f u = C9958d.this.f26121C;
            C9958d dVar2 = C9958d.this;
            int a = dVar2.m24903b(dVar2.f26135l);
            C9958d dVar3 = C9958d.this;
            u.mo26904a(a, dVar3.m24897a(dVar3.f26135l), (int) f3, (int) f4);
            C9958d.this.f26135l.post(C9958d.this.f26121C);
        }

        public void onDrag(float f, float f2) {
            if (!C9958d.this.f26137n.mo26858b()) {
                if (C9958d.this.f26120B != null) {
                    C9958d.this.f26120B.onDrag(f, f2);
                }
                C9958d.this.f26140q.postTranslate(f, f2);
                C9958d.this.m24920l();
                ViewParent parent = C9958d.this.f26135l.getParent();
                if (!C9958d.this.f26133j || C9958d.this.f26137n.mo26858b() || C9958d.this.f26134k) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((C9958d.this.f26122D == 2 || ((C9958d.this.f26122D == 0 && f >= 1.0f) || ((C9958d.this.f26122D == 1 && f <= -1.0f) || ((C9958d.this.f26123E == 0 && f2 >= 1.0f) || (C9958d.this.f26123E == 1 && f2 <= -1.0f))))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        /* renamed from: a */
        public void mo26862a(float f, float f2, float f3) {
            if (C9958d.this.mo26891f() < C9958d.this.f26132i || f < 1.0f) {
                if (C9958d.this.f26149z != null) {
                    C9958d.this.f26149z.onScaleChange(f, f2, f3);
                }
                C9958d.this.f26140q.postScale(f, f, f2, f3);
                C9958d.this.m24920l();
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.d$b */
    class C9960b extends SimpleOnGestureListener {
        C9960b() {
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C9958d.this.f26119A == null || C9958d.this.mo26891f() > C9958d.f26116L || motionEvent.getPointerCount() > C9958d.f26118N || motionEvent2.getPointerCount() > C9958d.f26118N) {
                return false;
            }
            return C9958d.this.f26119A.onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (C9958d.this.f26148y != null) {
                C9958d.this.f26148y.onLongClick(C9958d.this.f26135l);
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.d$c */
    class C9961c implements OnDoubleTapListener {
        C9961c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float f = C9958d.this.mo26891f();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (f < C9958d.this.mo26887d()) {
                    C9958d.this.mo26867a(C9958d.this.mo26887d(), x, y, true);
                } else if (f < C9958d.this.mo26887d() || f >= C9958d.this.mo26885c()) {
                    C9958d.this.mo26867a(C9958d.this.mo26889e(), x, y, true);
                } else {
                    C9958d.this.mo26867a(C9958d.this.mo26885c(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (C9958d.this.f26147x != null) {
                C9958d.this.f26147x.onClick(C9958d.this.f26135l);
            }
            RectF a = C9958d.this.mo26865a();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (C9958d.this.f26146w != null) {
                C9958d.this.f26146w.onViewTap(C9958d.this.f26135l, x, y);
            }
            if (a != null) {
                if (a.contains(x, y)) {
                    float width = (x - a.left) / a.width();
                    float height = (y - a.top) / a.height();
                    if (C9958d.this.f26144u != null) {
                        C9958d.this.f26144u.onPhotoTap(C9958d.this.f26135l, width, height);
                    }
                    return true;
                } else if (C9958d.this.f26145v != null) {
                    C9958d.this.f26145v.onOutsidePhotoTap(C9958d.this.f26135l);
                }
            }
            return false;
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.d$d */
    static /* synthetic */ class C9962d {

        /* renamed from: a */
        static final /* synthetic */ int[] f26153a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26153a = r0
                int[] r0 = f26153a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f26153a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f26153a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f26153a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.chrisbanes.photoview.C9958d.C9962d.<clinit>():void");
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.d$e */
    private class C9963e implements Runnable {

        /* renamed from: e */
        private final float f26154e;

        /* renamed from: f */
        private final float f26155f;

        /* renamed from: g */
        private final long f26156g = System.currentTimeMillis();

        /* renamed from: h */
        private final float f26157h;

        /* renamed from: i */
        private final float f26158i;

        public C9963e(float f, float f2, float f3, float f4) {
            this.f26154e = f3;
            this.f26155f = f4;
            this.f26157h = f;
            this.f26158i = f2;
        }

        /* renamed from: a */
        private float m24965a() {
            return C9958d.this.f26128e.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f26156g)) * 1.0f) / ((float) C9958d.this.f26129f)));
        }

        public void run() {
            float a = m24965a();
            float f = this.f26157h;
            C9958d.this.f26127I.mo26862a((f + ((this.f26158i - f) * a)) / C9958d.this.mo26891f(), this.f26154e, this.f26155f);
            if (a < 1.0f) {
                C9954a.m24885a(C9958d.this.f26135l, this);
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.d$f */
    private class C9964f implements Runnable {

        /* renamed from: e */
        private final OverScroller f26160e;

        /* renamed from: f */
        private int f26161f;

        /* renamed from: g */
        private int f26162g;

        public C9964f(Context context) {
            this.f26160e = new OverScroller(context);
        }

        /* renamed from: a */
        public void mo26903a() {
            this.f26160e.forceFinished(true);
        }

        public void run() {
            if (!this.f26160e.isFinished() && this.f26160e.computeScrollOffset()) {
                int currX = this.f26160e.getCurrX();
                int currY = this.f26160e.getCurrY();
                C9958d.this.f26140q.postTranslate((float) (this.f26161f - currX), (float) (this.f26162g - currY));
                C9958d.this.m24920l();
                this.f26161f = currX;
                this.f26162g = currY;
                C9954a.m24885a(C9958d.this.f26135l, this);
            }
        }

        /* renamed from: a */
        public void mo26904a(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF a = C9958d.this.mo26865a();
            if (a != null) {
                int round = Math.round(-a.left);
                float f = (float) i;
                if (f < a.width()) {
                    i5 = Math.round(a.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-a.top);
                float f2 = (float) i2;
                if (f2 < a.height()) {
                    i7 = Math.round(a.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.f26161f = round;
                this.f26162g = round2;
                if (!(round == i5 && round2 == i7)) {
                    this.f26160e.fling(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }
    }

    public C9958d(ImageView imageView) {
        this.f26135l = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f26124F = 0.0f;
            this.f26137n = new C9955b(imageView.getContext(), this.f26127I);
            this.f26136m = new GestureDetector(imageView.getContext(), new C9960b());
            this.f26136m.setOnDoubleTapListener(new C9961c());
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            m24902a(this.f26135l.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f26125G
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00be
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = com.github.chrisbanes.photoview.C9965e.m24971a(r0)
            if (r0 == 0) goto L_0x00be
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x006e
            if (r0 == r2) goto L_0x001b
            r3 = 3
            if (r0 == r3) goto L_0x001b
            goto L_0x007a
        L_0x001b:
            float r0 = r10.mo26891f()
            float r3 = r10.f26130g
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            android.graphics.RectF r0 = r10.mo26865a()
            if (r0 == 0) goto L_0x007a
            com.github.chrisbanes.photoview.d$e r9 = new com.github.chrisbanes.photoview.d$e
            float r5 = r10.mo26891f()
            float r6 = r10.f26130g
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L_0x006c
        L_0x0044:
            float r0 = r10.mo26891f()
            float r3 = r10.f26132i
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            android.graphics.RectF r0 = r10.mo26865a()
            if (r0 == 0) goto L_0x007a
            com.github.chrisbanes.photoview.d$e r9 = new com.github.chrisbanes.photoview.d$e
            float r5 = r10.mo26891f()
            float r6 = r10.f26132i
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L_0x006c:
            r11 = 1
            goto L_0x007b
        L_0x006e:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x0077
            r11.requestDisallowInterceptTouchEvent(r2)
        L_0x0077:
            r10.m24918k()
        L_0x007a:
            r11 = 0
        L_0x007b:
            com.github.chrisbanes.photoview.b r0 = r10.f26137n
            if (r0 == 0) goto L_0x00b2
            boolean r11 = r0.mo26858b()
            com.github.chrisbanes.photoview.b r0 = r10.f26137n
            boolean r0 = r0.mo26856a()
            com.github.chrisbanes.photoview.b r3 = r10.f26137n
            boolean r3 = r3.mo26857a(r12)
            if (r11 != 0) goto L_0x009b
            com.github.chrisbanes.photoview.b r11 = r10.f26137n
            boolean r11 = r11.mo26858b()
            if (r11 != 0) goto L_0x009b
            r11 = 1
            goto L_0x009c
        L_0x009b:
            r11 = 0
        L_0x009c:
            if (r0 != 0) goto L_0x00a8
            com.github.chrisbanes.photoview.b r0 = r10.f26137n
            boolean r0 = r0.mo26856a()
            if (r0 != 0) goto L_0x00a8
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            if (r11 == 0) goto L_0x00ae
            if (r0 == 0) goto L_0x00ae
            r1 = 1
        L_0x00ae:
            r10.f26134k = r1
            r1 = r3
            goto L_0x00b3
        L_0x00b2:
            r1 = r11
        L_0x00b3:
            android.view.GestureDetector r11 = r10.f26136m
            if (r11 == 0) goto L_0x00be
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L_0x00be
            r1 = 1
        L_0x00be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.chrisbanes.photoview.C9958d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: k */
    private void m24918k() {
        C9964f fVar = this.f26121C;
        if (fVar != null) {
            fVar.mo26903a();
            this.f26121C = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m24920l() {
        if (m24922m()) {
            m24906b(m24923n());
        }
    }

    /* renamed from: m */
    private boolean m24922m() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        RectF a = m24899a(m24923n());
        if (a == null) {
            return false;
        }
        float height = a.height();
        float width = a.width();
        float a2 = (float) m24897a(this.f26135l);
        float f7 = 0.0f;
        if (height <= a2) {
            int i = C9962d.f26153a[this.f26126H.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f5 = (a2 - height) / 2.0f;
                    f6 = a.top;
                } else {
                    f5 = a2 - height;
                    f6 = a.top;
                }
                f4 = f5 - f6;
            } else {
                f4 = -a.top;
            }
            this.f26123E = 2;
            f = f4;
        } else {
            float f8 = a.top;
            if (f8 > 0.0f) {
                this.f26123E = 0;
                f = -f8;
            } else {
                float f9 = a.bottom;
                if (f9 < a2) {
                    this.f26123E = 1;
                    f = a2 - f9;
                } else {
                    this.f26123E = -1;
                    f = 0.0f;
                }
            }
        }
        float b = (float) m24903b(this.f26135l);
        if (width <= b) {
            int i2 = C9962d.f26153a[this.f26126H.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f2 = (b - width) / 2.0f;
                    f3 = a.left;
                } else {
                    f2 = b - width;
                    f3 = a.left;
                }
                f7 = f2 - f3;
            } else {
                f7 = -a.left;
            }
            this.f26122D = 2;
        } else {
            float f10 = a.left;
            if (f10 > 0.0f) {
                this.f26122D = 0;
                f7 = -f10;
            } else {
                float f11 = a.right;
                if (f11 < b) {
                    f7 = b - f11;
                    this.f26122D = 1;
                } else {
                    this.f26122D = -1;
                }
            }
        }
        this.f26140q.postTranslate(f7, f);
        return true;
    }

    /* renamed from: n */
    private Matrix m24923n() {
        this.f26139p.set(this.f26138o);
        this.f26139p.postConcat(this.f26140q);
        return this.f26139p;
    }

    /* renamed from: o */
    private void m24925o() {
        this.f26140q.reset();
        mo26888d(this.f26124F);
        m24906b(m24923n());
        m24922m();
    }

    /* renamed from: c */
    public float mo26885c() {
        return this.f26132i;
    }

    /* renamed from: d */
    public void mo26888d(float f) {
        this.f26140q.postRotate(f % 360.0f);
        m24920l();
    }

    /* renamed from: e */
    public void mo26890e(float f) {
        this.f26140q.setRotate(f % 360.0f);
        m24920l();
    }

    /* renamed from: f */
    public float mo26891f() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) m24896a(this.f26140q, 0), 2.0d)) + ((float) Math.pow((double) m24896a(this.f26140q, 3), 2.0d))));
    }

    /* renamed from: g */
    public ScaleType mo26893g() {
        return this.f26126H;
    }

    /* renamed from: h */
    public void mo26894h() {
        if (this.f26125G) {
            m24902a(this.f26135l.getDrawable());
        } else {
            m24925o();
        }
    }

    /* renamed from: b */
    public void mo26883b(float f) {
        C9965e.m24969a(this.f26130g, f, this.f26132i);
        this.f26131h = f;
    }

    /* renamed from: c */
    public void mo26886c(float f) {
        C9965e.m24969a(f, this.f26131h, this.f26132i);
        this.f26130g = f;
    }

    /* renamed from: a */
    public void mo26870a(OnDoubleTapListener onDoubleTapListener) {
        this.f26136m.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* renamed from: d */
    public float mo26887d() {
        return this.f26131h;
    }

    /* renamed from: e */
    public float mo26889e() {
        return this.f26130g;
    }

    /* renamed from: a */
    public void mo26877a(OnScaleChangedListener onScaleChangedListener) {
        this.f26149z = onScaleChangedListener;
    }

    /* renamed from: b */
    public void mo26884b(boolean z) {
        this.f26125G = z;
        mo26894h();
    }

    /* renamed from: f */
    public void mo26892f(float f) {
        mo26868a(f, false);
    }

    /* renamed from: a */
    public void mo26878a(OnSingleFlingListener onSingleFlingListener) {
        this.f26119A = onSingleFlingListener;
    }

    /* renamed from: a */
    public RectF mo26865a() {
        m24922m();
        return m24899a(m24923n());
    }

    /* renamed from: b */
    public Matrix mo26882b() {
        return this.f26139p;
    }

    /* renamed from: b */
    private void m24906b(Matrix matrix) {
        this.f26135l.setImageMatrix(matrix);
        if (this.f26143t != null) {
            RectF a = m24899a(matrix);
            if (a != null) {
                this.f26143t.onMatrixChanged(a);
            }
        }
    }

    /* renamed from: a */
    public void mo26881a(boolean z) {
        this.f26133j = z;
    }

    /* renamed from: a */
    public void mo26866a(float f) {
        C9965e.m24969a(this.f26130g, this.f26131h, f);
        this.f26132i = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m24903b(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: a */
    public void mo26872a(OnLongClickListener onLongClickListener) {
        this.f26148y = onLongClickListener;
    }

    /* renamed from: a */
    public void mo26871a(OnClickListener onClickListener) {
        this.f26147x = onClickListener;
    }

    /* renamed from: a */
    public void mo26874a(OnMatrixChangedListener onMatrixChangedListener) {
        this.f26143t = onMatrixChangedListener;
    }

    /* renamed from: a */
    public void mo26876a(OnPhotoTapListener onPhotoTapListener) {
        this.f26144u = onPhotoTapListener;
    }

    /* renamed from: a */
    public void mo26875a(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.f26145v = onOutsidePhotoTapListener;
    }

    /* renamed from: a */
    public void mo26880a(OnViewTapListener onViewTapListener) {
        this.f26146w = onViewTapListener;
    }

    /* renamed from: a */
    public void mo26879a(OnViewDragListener onViewDragListener) {
        this.f26120B = onViewDragListener;
    }

    /* renamed from: a */
    public void mo26868a(float f, boolean z) {
        mo26867a(f, (float) (this.f26135l.getRight() / 2), (float) (this.f26135l.getBottom() / 2), z);
    }

    /* renamed from: a */
    public void mo26867a(float f, float f2, float f3, boolean z) {
        if (f < this.f26130g || f > this.f26132i) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            ImageView imageView = this.f26135l;
            C9963e eVar = new C9963e(mo26891f(), f, f2, f3);
            imageView.post(eVar);
        } else {
            this.f26140q.setScale(f, f, f2, f3);
            m24920l();
        }
    }

    /* renamed from: a */
    public void mo26873a(ScaleType scaleType) {
        if (C9965e.m24970a(scaleType) && scaleType != this.f26126H) {
            this.f26126H = scaleType;
            mo26894h();
        }
    }

    /* renamed from: a */
    public void mo26869a(int i) {
        this.f26129f = i;
    }

    /* renamed from: a */
    private float m24896a(Matrix matrix, int i) {
        matrix.getValues(this.f26142s);
        return this.f26142s[i];
    }

    /* renamed from: a */
    private RectF m24899a(Matrix matrix) {
        Drawable drawable = this.f26135l.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f26141r.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.f26141r);
        return this.f26141r;
    }

    /* renamed from: a */
    private void m24902a(Drawable drawable) {
        if (drawable != null) {
            float b = (float) m24903b(this.f26135l);
            float a = (float) m24897a(this.f26135l);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f26138o.reset();
            float f = (float) intrinsicWidth;
            float f2 = b / f;
            float f3 = (float) intrinsicHeight;
            float f4 = a / f3;
            ScaleType scaleType = this.f26126H;
            if (scaleType == ScaleType.CENTER) {
                this.f26138o.postTranslate((b - f) / 2.0f, (a - f3) / 2.0f);
            } else if (scaleType == ScaleType.CENTER_CROP) {
                float max = Math.max(f2, f4);
                this.f26138o.postScale(max, max);
                this.f26138o.postTranslate((b - (f * max)) / 2.0f, (a - (f3 * max)) / 2.0f);
            } else if (scaleType == ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f2, f4));
                this.f26138o.postScale(min, min);
                this.f26138o.postTranslate((b - (f * min)) / 2.0f, (a - (f3 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                RectF rectF2 = new RectF(0.0f, 0.0f, b, a);
                if (((int) this.f26124F) % 180 != 0) {
                    rectF = new RectF(0.0f, 0.0f, f3, f);
                }
                int i = C9962d.f26153a[this.f26126H.ordinal()];
                if (i == 1) {
                    this.f26138o.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
                } else if (i == 2) {
                    this.f26138o.setRectToRect(rectF, rectF2, ScaleToFit.START);
                } else if (i == 3) {
                    this.f26138o.setRectToRect(rectF, rectF2, ScaleToFit.END);
                } else if (i == 4) {
                    this.f26138o.setRectToRect(rectF, rectF2, ScaleToFit.FILL);
                }
            }
            m24925o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m24897a(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }
}

package app.zenly.locator.core.p072ui.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.p143s.p146j.C5432b;
import com.android.volley.toolbox.C8733j;
import java.util.LinkedList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer */
public final class InAppNotificationContainer extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final LinkedList<C3140d> f8621e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3140d f8622f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f8623g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ValueAnimator f8624h;

    /* renamed from: i */
    private final ValueAnimator f8625i;

    /* renamed from: j */
    private final ValueAnimator f8626j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ValueAnimator f8627k;

    /* renamed from: l */
    private final int f8628l;

    /* renamed from: m */
    private final int f8629m;

    /* renamed from: n */
    private final int f8630n;

    /* renamed from: o */
    private final GestureDetector f8631o;

    /* renamed from: p */
    private final VelocityTracker f8632p;

    /* renamed from: q */
    private int f8633q;

    /* renamed from: r */
    private float f8634r;

    /* renamed from: s */
    private int f8635s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Runnable f8636t;

    /* renamed from: u */
    private final AnimatorUpdateListener f8637u;

    /* renamed from: v */
    private final AnimatorUpdateListener f8638v;

    /* renamed from: w */
    private final AnimatorUpdateListener f8639w;

    /* renamed from: x */
    private final C3123c f8640x;

    /* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer$a */
    public static final class C3121a extends SimpleOnGestureListener {
        C3121a() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C12932j.m33818b(motionEvent, "e");
            return true;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer$b */
    public static final class C3122b {
        private C3122b() {
        }

        public /* synthetic */ C3122b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer$c */
    public static final class C3123c extends C5432b {

        /* renamed from: b */
        final /* synthetic */ InAppNotificationContainer f8641b;

        C3123c(InAppNotificationContainer inAppNotificationContainer) {
            this.f8641b = inAppNotificationContainer;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            if (!z) {
                this.f8641b.f8627k = null;
                if (animator == this.f8641b.f8624h) {
                    C3140d c = this.f8641b.f8622f;
                    if (c == null || !c.mo9467b()) {
                        this.f8641b.f8623g = System.currentTimeMillis();
                        InAppNotificationContainer inAppNotificationContainer = this.f8641b;
                        inAppNotificationContainer.postDelayed(inAppNotificationContainer.f8636t, this.f8641b.f8621e.size() == 0 ? 2000 : 200);
                    }
                } else {
                    this.f8641b.f8622f = null;
                    this.f8641b.f8623g = 0;
                    this.f8641b.removeAllViews();
                    this.f8641b.setVisibility(8);
                    if (this.f8641b.f8621e.size() > 0) {
                        InAppNotificationContainer inAppNotificationContainer2 = this.f8641b;
                        Object poll = inAppNotificationContainer2.f8621e.poll();
                        C12932j.m33815a(poll, "waitingNotifications.poll()");
                        inAppNotificationContainer2.mo9409b((C3140d) poll);
                    }
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animation");
            super.onAnimationStart(animator);
            C3140d c = this.f8641b.f8622f;
            if (c != null) {
                View c2 = c.mo9468c();
                if (c2 != null) {
                    c2.setScaleX(1.0f);
                    c2.setScaleY(1.0f);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer$d */
    static final class C3124d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InAppNotificationContainer f8642a;

        C3124d(InAppNotificationContainer inAppNotificationContainer) {
            this.f8642a = inAppNotificationContainer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3140d c = this.f8642a.f8622f;
            if (c != null) {
                View c2 = c.mo9468c();
                if (c2 != null) {
                    C12932j.m33815a((Object) valueAnimator, "animation");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        float floatValue = ((Float) animatedValue).floatValue();
                        c2.setTranslationX(0.0f);
                        c2.setTranslationY(((float) (-this.f8642a.getHeight())) * (1.0f - floatValue));
                        c2.setAlpha(floatValue);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer$e */
    static final class C3125e implements Runnable {

        /* renamed from: e */
        final /* synthetic */ InAppNotificationContainer f8643e;

        C3125e(InAppNotificationContainer inAppNotificationContainer) {
            this.f8643e = inAppNotificationContainer;
        }

        public final void run() {
            this.f8643e.m9797a();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer$f */
    static final class C3126f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InAppNotificationContainer f8644a;

        C3126f(InAppNotificationContainer inAppNotificationContainer) {
            this.f8644a = inAppNotificationContainer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3140d c = this.f8644a.f8622f;
            if (c != null) {
                View c2 = c.mo9468c();
                if (c2 != null) {
                    C12932j.m33815a((Object) valueAnimator, "animation");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        float floatValue = ((Float) animatedValue).floatValue();
                        float f = (0.2f * floatValue) + 1.0f;
                        c2.setScaleX(f);
                        c2.setScaleY(f);
                        c2.setAlpha(1.0f - floatValue);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer$g */
    static final class C3127g implements Runnable {

        /* renamed from: e */
        final /* synthetic */ InAppNotificationContainer f8645e;

        C3127g(InAppNotificationContainer inAppNotificationContainer) {
            this.f8645e = inAppNotificationContainer;
        }

        public final void run() {
            C3140d c = this.f8645e.f8622f;
            if (c != null) {
                c.mo9470e();
            }
            this.f8645e.m9797a();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.InAppNotificationContainer$h */
    static final class C3128h implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InAppNotificationContainer f8646a;

        C3128h(InAppNotificationContainer inAppNotificationContainer) {
            this.f8646a = inAppNotificationContainer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3140d c = this.f8646a.f8622f;
            if (c != null) {
                View c2 = c.mo9468c();
                if (c2 != null) {
                    C12932j.m33815a((Object) valueAnimator, "animation");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        float floatValue = ((Float) animatedValue).floatValue();
                        float f = 1.0f - (0.2f * floatValue);
                        c2.setScaleX(f);
                        c2.setScaleY(f);
                        c2.setAlpha(1.0f - floatValue);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
            }
        }
    }

    static {
        new C3122b(null);
    }

    public InAppNotificationContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public InAppNotificationContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ InAppNotificationContainer(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C12932j.m33818b(r4, r0)
            app.zenly.locator.core.ui.view.d r0 = r3.f8622f
            if (r0 == 0) goto L_0x0088
            android.view.GestureDetector r1 = r3.f8631o
            boolean r1 = r1.onTouchEvent(r4)
            r2 = 1
            if (r1 == 0) goto L_0x001f
            r0.mo9469d()
            boolean r4 = r0.mo9466a()
            if (r4 == 0) goto L_0x001e
            r3.m9797a()
        L_0x001e:
            return r2
        L_0x001f:
            int r0 = r4.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x006d
            r1 = -1
            if (r0 == r2) goto L_0x004d
            r2 = 2
            if (r0 == r2) goto L_0x0031
            r2 = 3
            if (r0 == r2) goto L_0x004d
            goto L_0x0083
        L_0x0031:
            android.view.VelocityTracker r0 = r3.f8632p
            r0.addMovement(r4)
            int r0 = r3.f8633q
            int r0 = r4.findPointerIndex(r0)
            r3.f8635s = r0
            int r0 = r3.f8635s
            if (r0 == r1) goto L_0x0083
            float r0 = r4.getX(r0)
            float r1 = r3.f8634r
            float r0 = r0 - r1
            r3.m9798a(r0)
            goto L_0x0083
        L_0x004d:
            int r0 = r3.f8633q
            int r0 = r4.findPointerIndex(r0)
            r3.f8635s = r0
            int r0 = r3.f8635s
            if (r0 == r1) goto L_0x0069
            float r0 = r4.getX(r0)
            float r1 = r3.getTranslationX()
            float r1 = r1 + r0
            float r0 = r3.f8634r
            float r1 = r1 - r0
            r3.m9804b(r1)
            goto L_0x0083
        L_0x0069:
            r3.m9803b()
            goto L_0x0083
        L_0x006d:
            int r0 = r4.getActionIndex()
            r3.f8635s = r0
            int r0 = r3.f8635s
            int r0 = r4.getPointerId(r0)
            r3.f8633q = r0
            int r0 = r3.f8635s
            float r0 = r4.getX(r0)
            r3.f8634r = r0
        L_0x0083:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        L_0x0088:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.p072ui.view.InAppNotificationContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public InAppNotificationContainer(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f8621e = new LinkedList<>();
        this.f8624h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f8625i = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f8626j = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f8633q = -1;
        this.f8636t = new C3125e(this);
        this.f8637u = new C3124d(this);
        this.f8638v = new C3126f(this);
        this.f8639w = new C3128h(this);
        this.f8640x = new C3123c(this);
        setClickable(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C12932j.m33815a((Object) viewConfiguration, "config");
        this.f8628l = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8629m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f8630n = C3200e0.m10183a(context, 24);
        VelocityTracker obtain = VelocityTracker.obtain();
        C12932j.m33815a((Object) obtain, "VelocityTracker.obtain()");
        this.f8632p = obtain;
        this.f8631o = new GestureDetector(context, new C3121a());
        this.f8624h.addListener(this.f8640x);
        this.f8625i.addListener(this.f8640x);
        this.f8626j.addListener(this.f8640x);
        this.f8624h.addUpdateListener(this.f8637u);
        this.f8625i.addUpdateListener(this.f8638v);
        this.f8626j.addUpdateListener(this.f8639w);
    }

    /* renamed from: b */
    public final void mo9409b(C3140d dVar) {
        C12932j.m33818b(dVar, "notification");
        removeCallbacks(this.f8636t);
        if (this.f8622f != null) {
            this.f8621e.add(dVar);
            C3140d dVar2 = this.f8622f;
            if ((dVar2 == null || !dVar2.mo9467b()) && this.f8627k == null) {
                long currentTimeMillis = System.currentTimeMillis() - this.f8623g;
                if (currentTimeMillis > 200) {
                    ValueAnimator valueAnimator = this.f8626j;
                    valueAnimator.start();
                    this.f8627k = valueAnimator;
                    return;
                }
                removeCallbacks(this.f8636t);
                postDelayed(this.f8636t, 200 - currentTimeMillis);
                return;
            }
            return;
        }
        this.f8622f = dVar;
        setVisibility(0);
        addView(dVar.mo9468c());
        ValueAnimator valueAnimator2 = this.f8624h;
        valueAnimator2.start();
        this.f8627k = valueAnimator2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9797a() {
        if (this.f8622f != null) {
            removeCallbacks(this.f8636t);
            ValueAnimator valueAnimator = this.f8627k;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f8621e.size() > 0 ? this.f8626j : this.f8625i;
            valueAnimator2.start();
            this.f8627k = valueAnimator2;
        }
    }

    /* renamed from: a */
    public final void mo9408a(C3140d dVar) {
        C12932j.m33818b(dVar, "notification");
        if (dVar == this.f8622f) {
            m9797a();
        } else {
            this.f8621e.remove(dVar);
        }
    }

    /* renamed from: a */
    private final void m9798a(float f) {
        C3140d dVar = this.f8622f;
        if (dVar != null) {
            View c = dVar.mo9468c();
            if (c != null) {
                c.setTranslationX(f);
            }
        }
    }

    /* renamed from: b */
    private final void m9804b(float f) {
        C3140d dVar = this.f8622f;
        if (dVar != null) {
            View c = dVar.mo9468c();
            if (c != null) {
                VelocityTracker velocityTracker = this.f8632p;
                velocityTracker.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, (float) this.f8629m);
                int i = 1;
                if (Math.abs(f) > ((float) (c.getWidth() / 2)) || (Math.abs(f) > ((float) this.f8630n) && Math.abs((int) velocityTracker.getXVelocity(this.f8633q)) > this.f8628l)) {
                    int a = C3200e0.m10183a(getContext(), 24);
                    if (f < ((float) 0)) {
                        i = -1;
                    }
                    c.animate().translationX((float) (i * (c.getWidth() + a))).setInterpolator(C7657c.m18650f()).setDuration(200).withEndAction(new C3127g(this)).start();
                    return;
                }
                m9803b();
            }
        }
    }

    /* renamed from: b */
    private final void m9803b() {
        C3140d dVar = this.f8622f;
        if (dVar != null) {
            View c = dVar.mo9468c();
            if (c != null) {
                c.animate().translationX(0.0f).setInterpolator(C7657c.m18650f()).setDuration(200).start();
            }
        }
    }
}

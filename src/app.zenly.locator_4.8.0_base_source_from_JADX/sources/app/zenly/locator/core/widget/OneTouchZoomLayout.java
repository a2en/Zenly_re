package app.zenly.locator.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.view.C0636b;
import androidx.dynamicanimation.animation.C0728d;
import androidx.dynamicanimation.animation.C0730f;
import androidx.dynamicanimation.animation.C0731g;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.map.C3900b1;
import app.zenly.locator.p143s.C5407g;
import java.util.HashSet;
import java.util.Set;
import p214e.p234h.p235e.C7614a;

public class OneTouchZoomLayout extends FrameLayout {

    /* renamed from: e */
    private C0636b f9077e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public OneTouchZoomeable f9078f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Set<OneTouchZoomListener> f9079g = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public double f9080h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public double f9081i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public double f9082j;

    /* renamed from: k */
    private final Point f9083k = new Point();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Path f9084l = new Path();

    /* renamed from: m */
    private int f9085m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f9086n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Paint f9087o = new Paint(1);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3900b1 f9088p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C5407g f9089q;

    /* renamed from: r */
    private C0730f f9090r;

    /* renamed from: s */
    private C0730f f9091s;

    public interface OneTouchZoomListener {
        void onZoomLevelChanged(float f);

        void onZoomStarted();

        void onZoomStopped();
    }

    public interface OneTouchZoomeable {
        double getCurrentZoom();

        double getMaxZoom();

        double getMinZoom();

        boolean isAvailable();
    }

    /* renamed from: app.zenly.locator.core.widget.OneTouchZoomLayout$b */
    private class C3255b extends SimpleOnGestureListener {

        /* renamed from: e */
        private boolean f9092e;

        /* renamed from: f */
        private boolean f9093f;

        /* renamed from: g */
        private boolean f9094g;

        private C3255b() {
        }

        /* renamed from: a */
        private void m10356a() {
            if (OneTouchZoomLayout.this.f9089q.mo12983f() == 2) {
                OneTouchZoomLayout.this.f9087o.setColor(C7614a.m18493c(OneTouchZoomLayout.this.f9088p.f10337f, 76));
            } else {
                OneTouchZoomLayout.this.f9087o.setColor(C7614a.m18493c(OneTouchZoomLayout.this.f9088p.f10338g, 76));
            }
        }

        public boolean onDown(MotionEvent motionEvent) {
            this.f9092e = OneTouchZoomLayout.this.m10338a(motionEvent.getX(), motionEvent.getY());
            this.f9093f = false;
            if (OneTouchZoomLayout.this.f9084l.isEmpty()) {
                OneTouchZoomLayout.this.f9086n = motionEvent.getX() < ((float) (OneTouchZoomLayout.this.getWidth() / 2)) ? 0 : OneTouchZoomLayout.this.getWidth();
                m10356a();
            }
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = true;
            if (motionEvent2.getPointerCount() > 1) {
                return this.f9094g;
            }
            if (!this.f9093f) {
                this.f9093f = true;
                if (OneTouchZoomLayout.this.f9078f == null || !OneTouchZoomLayout.this.f9078f.isAvailable() || !this.f9092e || Math.abs(f2) <= Math.abs(f)) {
                    z = false;
                }
                this.f9094g = z;
                if (this.f9094g) {
                    OneTouchZoomLayout.this.m10335a((int) motionEvent2.getX(), (int) motionEvent2.getY());
                    OneTouchZoomLayout.this.postInvalidateOnAnimation();
                    OneTouchZoomLayout oneTouchZoomLayout = OneTouchZoomLayout.this;
                    oneTouchZoomLayout.f9081i = oneTouchZoomLayout.f9078f.getMinZoom();
                    OneTouchZoomLayout oneTouchZoomLayout2 = OneTouchZoomLayout.this;
                    oneTouchZoomLayout2.f9082j = oneTouchZoomLayout2.f9078f.getMaxZoom();
                    OneTouchZoomLayout oneTouchZoomLayout3 = OneTouchZoomLayout.this;
                    oneTouchZoomLayout3.f9080h = oneTouchZoomLayout3.f9078f.getCurrentZoom();
                    for (OneTouchZoomListener onZoomStarted : OneTouchZoomLayout.this.f9079g) {
                        onZoomStarted.onZoomStarted();
                    }
                    return this.f9094g;
                }
            }
            if (this.f9094g) {
                OneTouchZoomLayout.this.m10335a((int) motionEvent2.getX(), (int) motionEvent2.getY());
                OneTouchZoomLayout.this.postInvalidateOnAnimation();
                float a = OneTouchZoomLayout.this.m10330a(f2);
                for (OneTouchZoomListener onZoomLevelChanged : OneTouchZoomLayout.this.f9079g) {
                    onZoomLevelChanged.onZoomLevelChanged(a);
                }
            } else {
                OneTouchZoomLayout.this.m10334a();
            }
            return this.f9094g;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            OneTouchZoomLayout.this.m10334a();
            return super.onSingleTapUp(motionEvent);
        }
    }

    public OneTouchZoomLayout(Context context) {
        super(context);
        m10336a(context);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f9084l.isEmpty()) {
            canvas.drawPath(this.f9084l, this.f9087o);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f9077e.mo3384a(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            for (OneTouchZoomListener onZoomStopped : this.f9079g) {
                onZoomStopped.onZoomStopped();
            }
            m10334a();
        }
        return this.f9077e.mo3384a(motionEvent);
    }

    public void setZoomeable(OneTouchZoomeable oneTouchZoomeable) {
        this.f9078f = oneTouchZoomeable;
    }

    /* renamed from: c */
    private void m10345c() {
        this.f9084l.reset();
        postInvalidateOnAnimation();
    }

    /* renamed from: b */
    public /* synthetic */ void mo9692b(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.f9083k.y = (int) f;
        m10342b();
        postInvalidateOnAnimation();
    }

    /* renamed from: b */
    public /* synthetic */ void mo9693b(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.f9091s = null;
        if (this.f9090r == null) {
            m10345c();
        }
    }

    public OneTouchZoomLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10336a(context);
    }

    /* renamed from: a */
    private void m10336a(Context context) {
        setWillNotDraw(false);
        this.f9077e = new C0636b(getContext(), new C3255b());
        this.f9077e.mo3383a(false);
        this.f9087o.setStyle(Style.FILL);
        this.f9085m = context.getResources().getDimensionPixelSize(R.dimen.spacing_400);
        this.f9089q = C5407g.m15386a(context);
        this.f9088p = C3900b1.m11503a(this.f9089q.mo12981e(), C3900b1.GOOGLE_MAP);
    }

    /* renamed from: b */
    private void m10342b() {
        int height = (int) (((float) getHeight()) * 0.1f);
        int height2 = (int) (((float) getHeight()) * 0.2f);
        Point point = this.f9083k;
        int i = point.x;
        int i2 = point.y;
        int i3 = i2 - height;
        int i4 = height + i2;
        int i5 = this.f9086n;
        int i6 = -height2;
        int i7 = (int) (((float) i2) * 0.7f);
        int height3 = getHeight() + height2;
        int i8 = this.f9086n;
        int height4 = (int) (((float) getHeight()) - (((float) (getHeight() - this.f9083k.y)) * 0.7f));
        this.f9084l.reset();
        this.f9084l.moveTo((float) i5, (float) i6);
        Path path = this.f9084l;
        float f = (float) i5;
        float f2 = (float) i7;
        float f3 = (float) i;
        float f4 = (float) i3;
        Point point2 = this.f9083k;
        path.cubicTo(f, f2, f3, f4, (float) point2.x, (float) point2.y);
        this.f9084l.cubicTo((float) i, (float) i4, (float) i8, (float) height4, (float) i5, (float) height3);
        this.f9084l.close();
    }

    public OneTouchZoomLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10336a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10334a() {
        if (this.f9090r == null && this.f9091s == null && !this.f9084l.isEmpty()) {
            C0728d dVar = new C0728d((float) this.f9083k.x);
            C0731g gVar = new C0731g((float) this.f9086n);
            gVar.mo3684c(1500.0f);
            gVar.mo3680a(0.5f);
            C0730f fVar = new C0730f(dVar, (float) this.f9086n);
            fVar.mo3620c(1.0f);
            C0730f fVar2 = fVar;
            fVar2.mo3672a(gVar);
            fVar2.mo3614a((OnAnimationUpdateListener) new C3266d(this));
            C0730f fVar3 = fVar2;
            fVar3.mo3613a((OnAnimationEndListener) new C3265c(this));
            this.f9090r = fVar3;
            this.f9090r.mo3622d();
            C0728d dVar2 = new C0728d((float) this.f9083k.y);
            C0731g gVar2 = new C0731g(((float) getHeight()) / 2.0f);
            gVar2.mo3684c(1500.0f);
            gVar2.mo3680a(0.5f);
            C0730f fVar4 = new C0730f(dVar2, ((float) getHeight()) / 2.0f);
            fVar4.mo3620c(1.0f);
            C0730f fVar5 = fVar4;
            fVar5.mo3672a(gVar2);
            fVar5.mo3614a((OnAnimationUpdateListener) new C3264b(this));
            C0730f fVar6 = fVar5;
            fVar6.mo3613a((OnAnimationEndListener) new C3263a(this));
            this.f9091s = fVar6;
            this.f9091s.mo3622d();
        }
    }

    /* renamed from: b */
    public boolean mo9694b(OneTouchZoomListener oneTouchZoomListener) {
        return this.f9079g.remove(oneTouchZoomListener);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9689a(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.f9083k.x = (int) f;
        m10342b();
        postInvalidateOnAnimation();
    }

    /* renamed from: a */
    public /* synthetic */ void mo9690a(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.f9090r = null;
        if (this.f9091s == null) {
            m10345c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10338a(float f, float f2) {
        int a = C3200e0.m10183a(getContext(), 46);
        return f2 > ((float) C3200e0.m10183a(getContext(), 20)) && (f < ((float) a) || f > ((float) (getMeasuredWidth() - a)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public float m10330a(float f) {
        double min = (double) Math.min(Math.max(Math.abs(f) / 60.0f, 0.5f), 1.5f);
        double d = this.f9082j;
        double d2 = this.f9080h;
        this.f9080h = Math.max(Math.min(d2 + (((double) ((-f) / -500.0f)) * min * (((d - d2) / (0.25d * d)) + 7.5d)), d), this.f9081i);
        return (float) this.f9080h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10335a(int i, int i2) {
        C0730f fVar = this.f9090r;
        if (fVar != null) {
            fVar.mo3676g();
        }
        C0730f fVar2 = this.f9091s;
        if (fVar2 != null) {
            fVar2.mo3676g();
        }
        this.f9083k.x = this.f9086n == 0 ? i + this.f9085m : i - this.f9085m;
        this.f9083k.y = i2;
        m10342b();
    }

    /* renamed from: a */
    public void mo9691a(OneTouchZoomListener oneTouchZoomListener) {
        if (!this.f9079g.contains(oneTouchZoomListener)) {
            this.f9079g.add(oneTouchZoomListener);
        }
    }
}

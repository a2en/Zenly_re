package com.github.chrisbanes.photoview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.android.volley.toolbox.C8733j;

/* renamed from: com.github.chrisbanes.photoview.b */
class C9955b {

    /* renamed from: a */
    private int f26103a = -1;

    /* renamed from: b */
    private int f26104b = 0;

    /* renamed from: c */
    private final ScaleGestureDetector f26105c;

    /* renamed from: d */
    private VelocityTracker f26106d;

    /* renamed from: e */
    private boolean f26107e;

    /* renamed from: f */
    private float f26108f;

    /* renamed from: g */
    private float f26109g;

    /* renamed from: h */
    private final float f26110h;

    /* renamed from: i */
    private final float f26111i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9957c f26112j;

    /* renamed from: com.github.chrisbanes.photoview.b$a */
    class C9956a implements OnScaleGestureListener {
        C9956a() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor >= 0.0f) {
                C9955b.this.f26112j.mo26862a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            }
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    C9955b(Context context, C9957c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f26111i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f26110h = (float) viewConfiguration.getScaledTouchSlop();
        this.f26112j = cVar;
        this.f26105c = new ScaleGestureDetector(context, new C9956a());
    }

    /* renamed from: b */
    private float m24888b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f26104b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    private float m24889c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f26104b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: d */
    private boolean m24890d(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f26103a = motionEvent.getPointerId(0);
            this.f26106d = VelocityTracker.obtain();
            VelocityTracker velocityTracker = this.f26106d;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            this.f26108f = m24888b(motionEvent);
            this.f26109g = m24889c(motionEvent);
            this.f26107e = false;
        } else if (action == 1) {
            this.f26103a = -1;
            if (this.f26107e && this.f26106d != null) {
                this.f26108f = m24888b(motionEvent);
                this.f26109g = m24889c(motionEvent);
                this.f26106d.addMovement(motionEvent);
                this.f26106d.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
                float xVelocity = this.f26106d.getXVelocity();
                float yVelocity = this.f26106d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f26111i) {
                    this.f26112j.mo26863a(this.f26108f, this.f26109g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f26106d;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f26106d = null;
            }
        } else if (action == 2) {
            float b = m24888b(motionEvent);
            float c = m24889c(motionEvent);
            float f = b - this.f26108f;
            float f2 = c - this.f26109g;
            if (!this.f26107e) {
                this.f26107e = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f26110h);
            }
            if (this.f26107e) {
                this.f26112j.onDrag(f, f2);
                this.f26108f = b;
                this.f26109g = c;
                VelocityTracker velocityTracker3 = this.f26106d;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f26103a = -1;
            VelocityTracker velocityTracker4 = this.f26106d;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.f26106d = null;
            }
        } else if (action == 6) {
            int a = C9965e.m24968a(motionEvent.getAction());
            if (motionEvent.getPointerId(a) == this.f26103a) {
                int i = a == 0 ? 1 : 0;
                this.f26103a = motionEvent.getPointerId(i);
                this.f26108f = motionEvent.getX(i);
                this.f26109g = motionEvent.getY(i);
            }
        }
        int i2 = this.f26103a;
        if (i2 == -1) {
            i2 = 0;
        }
        this.f26104b = motionEvent.findPointerIndex(i2);
        return true;
    }

    /* renamed from: a */
    public boolean mo26856a() {
        return this.f26107e;
    }

    /* renamed from: a */
    public boolean mo26857a(MotionEvent motionEvent) {
        try {
            this.f26105c.onTouchEvent(motionEvent);
            return m24890d(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo26858b() {
        return this.f26105c.isInProgress();
    }
}

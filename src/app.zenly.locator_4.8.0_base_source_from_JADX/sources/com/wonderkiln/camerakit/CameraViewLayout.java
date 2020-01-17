package com.wonderkiln.camerakit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.widget.FrameLayout;

public abstract class CameraViewLayout extends FrameLayout {

    /* renamed from: e */
    private ScaleGestureDetector f31156e;

    /* renamed from: f */
    private GestureDetector f31157f;

    /* renamed from: g */
    private SimpleOnGestureListener f31158g;

    /* renamed from: h */
    private OnScaleGestureListener f31159h;

    /* renamed from: com.wonderkiln.camerakit.CameraViewLayout$a */
    class C11952a extends SimpleOnGestureListener {
        C11952a() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            CameraViewLayout.this.mo35474a();
            return super.onDoubleTap(motionEvent);
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            CameraViewLayout.this.mo35475a(motionEvent.getX() / ((float) CameraViewLayout.this.getWidth()), motionEvent.getY() / ((float) CameraViewLayout.this.getHeight()));
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    /* renamed from: com.wonderkiln.camerakit.CameraViewLayout$b */
    class C11953b implements OnScaleGestureListener {
        C11953b() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            CameraViewLayout.this.mo35476a(scaleGestureDetector.getScaleFactor(), false);
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            CameraViewLayout.this.mo35476a(scaleGestureDetector.getScaleFactor(), true);
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public CameraViewLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35474a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35475a(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo35476a(float f, boolean z);

    /* access modifiers changed from: protected */
    public abstract C11966b getCameraImpl();

    /* access modifiers changed from: protected */
    public abstract C11989q getPreviewImpl();

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f31157f.onTouchEvent(motionEvent);
        this.f31156e.onTouchEvent(motionEvent);
        return true;
    }

    public CameraViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31158g = new C11952a();
        this.f31159h = new C11953b();
        this.f31157f = new GestureDetector(context, this.f31158g);
        this.f31156e = new ScaleGestureDetector(context, this.f31159h);
    }
}

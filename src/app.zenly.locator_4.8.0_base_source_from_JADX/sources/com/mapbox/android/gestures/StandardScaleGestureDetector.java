package com.mapbox.android.gestures;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class StandardScaleGestureDetector extends C11295h<StandardOnScaleGestureListener> {

    /* renamed from: A */
    private static final Set<Integer> f29148A = new HashSet();

    /* renamed from: t */
    private ScaleGestureDetector f29149t;

    /* renamed from: u */
    OnScaleGestureListener f29150u = new C11286a();

    /* renamed from: v */
    private boolean f29151v;

    /* renamed from: w */
    private boolean f29152w;

    /* renamed from: x */
    float f29153x;

    /* renamed from: y */
    float f29154y;

    /* renamed from: z */
    private float f29155z;

    public interface StandardOnScaleGestureListener {
        boolean onScale(StandardScaleGestureDetector standardScaleGestureDetector);

        boolean onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector);

        void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector, float f, float f2);
    }

    /* renamed from: com.mapbox.android.gestures.StandardScaleGestureDetector$a */
    class C11286a implements OnScaleGestureListener {
        C11286a() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return StandardScaleGestureDetector.this.mo32774a(scaleGestureDetector);
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return StandardScaleGestureDetector.this.mo32776b(scaleGestureDetector);
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            StandardScaleGestureDetector.this.mo32778c(scaleGestureDetector);
        }
    }

    /* renamed from: com.mapbox.android.gestures.StandardScaleGestureDetector$b */
    public static class C11287b implements StandardOnScaleGestureListener {
    }

    static {
        f29148A.add(Integer.valueOf(1));
    }

    public StandardScaleGestureDetector(Context context, C11288a aVar) {
        super(context, aVar);
        this.f29149t = new ScaleGestureDetector(context, this.f29150u);
        try {
            mo32782s();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo32774a(ScaleGestureDetector scaleGestureDetector) {
        if (this.f29153x == 0.0f) {
            this.f29153x = scaleGestureDetector.getCurrentSpan();
        }
        this.f29154y = Math.abs(this.f29153x - scaleGestureDetector.getCurrentSpan());
        boolean z = false;
        if (mo32827o() || !mo32722a(1) || this.f29154y < this.f29155z) {
            if (!mo32827o()) {
                return true;
            }
            if (scaleGestureDetector.getScaleFactor() < 1.0f) {
                z = true;
            }
            this.f29152w = z;
            return ((StandardOnScaleGestureListener) this.f29172g).onScale(this);
        } else if (!((StandardOnScaleGestureListener) this.f29172g).onScaleBegin(this)) {
            return false;
        } else {
            mo32825k();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo32776b(ScaleGestureDetector scaleGestureDetector) {
        this.f29153x = scaleGestureDetector.getCurrentSpan();
        if (!mo32722a(1)) {
            return false;
        }
        this.f29195q = VelocityTracker.obtain();
        if (this.f29155z == 0.0f && ((StandardOnScaleGestureListener) this.f29172g).onScaleBegin(this)) {
            mo32825k();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo32778c(ScaleGestureDetector scaleGestureDetector) {
        this.f29151v = true;
        mo32727l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo32727l() {
        if (!mo32827o()) {
            super.mo32727l();
            return;
        }
        if (this.f29151v) {
            super.mo32727l();
            ((StandardOnScaleGestureListener) this.f29172g).onScaleEnd(this, this.f29196r, this.f29197s);
            this.f29151v = false;
        }
    }

    /* renamed from: n */
    public void mo32779n() {
        super.mo32779n();
        this.f29151v = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Set<Integer> mo32728p() {
        return f29148A;
    }

    /* renamed from: q */
    public float mo32780q() {
        return this.f29149t.getScaleFactor();
    }

    /* renamed from: r */
    public boolean mo32781r() {
        return this.f29152w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo32782s() throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = this.f29149t.getClass().getDeclaredField("mMinSpan");
        declaredField.setAccessible(true);
        if (VERSION.SDK_INT >= 24) {
            declaredField.set(this.f29149t, Integer.valueOf((int) this.f29166a.getResources().getDimension(C11296i.mapbox_internalScaleMinSpan24)));
        } else {
            declaredField.set(this.f29149t, Integer.valueOf((int) this.f29166a.getResources().getDimension(C11296i.mapbox_internalScaleMinSpan23)));
        }
        Field declaredField2 = this.f29149t.getClass().getDeclaredField("mSpanSlop");
        declaredField2.setAccessible(true);
        declaredField2.set(this.f29149t, Integer.valueOf(ViewConfiguration.get(this.f29166a).getScaledTouchSlop()));
    }

    /* renamed from: c */
    public void mo32777c(int i) {
        mo32775b(this.f29166a.getResources().getDimension(i));
    }

    /* renamed from: b */
    public void mo32775b(float f) {
        this.f29155z = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32723a(MotionEvent motionEvent) {
        super.mo32723a(motionEvent);
        return this.f29149t.onTouchEvent(motionEvent);
    }
}

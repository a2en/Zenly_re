package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.android.volley.toolbox.C8733j;
import java.util.Set;

/* renamed from: com.mapbox.android.gestures.h */
public abstract class C11295h<L> extends C11292e<L> {

    /* renamed from: n */
    private final Set<Integer> f29192n = mo32728p();

    /* renamed from: o */
    private boolean f29193o;

    /* renamed from: p */
    private boolean f29194p;

    /* renamed from: q */
    VelocityTracker f29195q;

    /* renamed from: r */
    float f29196r;

    /* renamed from: s */
    float f29197s;

    public C11295h(Context context, C11288a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32723a(MotionEvent motionEvent) {
        if (this.f29194p) {
            this.f29194p = false;
            mo32727l();
        }
        VelocityTracker velocityTracker = this.f29195q;
        if (velocityTracker != null) {
            velocityTracker.addMovement(mo32804a());
        }
        boolean a = super.mo32723a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            VelocityTracker velocityTracker2 = this.f29195q;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        } else if (actionMasked == 1 || actionMasked == 6) {
            if (this.f29189k.size() < mo32725h() && this.f29193o) {
                mo32727l();
                return true;
            }
        } else if (actionMasked == 3) {
            VelocityTracker velocityTracker3 = this.f29195q;
            if (velocityTracker3 != null) {
                velocityTracker3.clear();
            }
            if (this.f29193o) {
                mo32727l();
                return true;
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo32825k() {
        this.f29193o = true;
        if (this.f29195q == null) {
            this.f29195q = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo32727l() {
        this.f29193o = false;
        VelocityTracker velocityTracker = this.f29195q;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
            this.f29196r = this.f29195q.getXVelocity();
            this.f29197s = this.f29195q.getYVelocity();
            this.f29195q.recycle();
            this.f29195q = null;
        }
        mo32726j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Set<Integer> mo32826m() {
        return this.f29192n;
    }

    /* renamed from: n */
    public void mo32779n() {
        if (mo32827o()) {
            this.f29194p = true;
        }
    }

    /* renamed from: o */
    public boolean mo32827o() {
        return this.f29193o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract Set<Integer> mo32728p();

    /* renamed from: a */
    public void mo32806a(boolean z) {
        super.mo32806a(z);
        if (!z) {
            mo32779n();
        }
    }
}

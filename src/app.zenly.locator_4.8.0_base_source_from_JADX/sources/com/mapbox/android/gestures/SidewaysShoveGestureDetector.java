package com.mapbox.android.gestures;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public class SidewaysShoveGestureDetector extends C11295h<OnSidewaysShoveGestureListener> {

    /* renamed from: x */
    private static final Set<Integer> f29140x = new HashSet();

    /* renamed from: t */
    private float f29141t;

    /* renamed from: u */
    private float f29142u;

    /* renamed from: v */
    float f29143v;

    /* renamed from: w */
    float f29144w;

    public interface OnSidewaysShoveGestureListener {
        boolean onSidewaysShove(SidewaysShoveGestureDetector sidewaysShoveGestureDetector, float f, float f2);

        boolean onSidewaysShoveBegin(SidewaysShoveGestureDetector sidewaysShoveGestureDetector);

        void onSidewaysShoveEnd(SidewaysShoveGestureDetector sidewaysShoveGestureDetector, float f, float f2);
    }

    static {
        f29140x.add(Integer.valueOf(14));
    }

    public SidewaysShoveGestureDetector(Context context, C11288a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32722a(int i) {
        return Math.abs(this.f29143v) >= this.f29142u && super.mo32722a(i);
    }

    /* renamed from: b */
    public void mo32753b(float f) {
        this.f29141t = f;
    }

    /* renamed from: c */
    public void mo32754c(float f) {
        this.f29142u = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32724d() {
        super.mo32724d();
        this.f29144w = mo32756q();
        this.f29143v += this.f29144w;
        if (mo32827o()) {
            float f = this.f29144w;
            if (f != 0.0f) {
                return ((OnSidewaysShoveGestureListener) this.f29172g).onSidewaysShove(this, f, this.f29143v);
            }
        }
        if (!mo32722a(14) || !((OnSidewaysShoveGestureListener) this.f29172g).onSidewaysShoveBegin(this)) {
            return false;
        }
        mo32825k();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo32747i() {
        return super.mo32747i() || !mo32757r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo32726j() {
        super.mo32726j();
        this.f29143v = 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo32727l() {
        super.mo32727l();
        ((OnSidewaysShoveGestureListener) this.f29172g).onSidewaysShoveEnd(this, this.f29196r, this.f29197s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Set<Integer> mo32728p() {
        return f29140x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public float mo32756q() {
        return ((mo32804a().getX(mo32804a().findPointerIndex(((Integer) this.f29189k.get(0)).intValue())) + mo32804a().getX(mo32804a().findPointerIndex(((Integer) this.f29189k.get(1)).intValue()))) / 2.0f) - ((mo32809c().getX(mo32809c().findPointerIndex(((Integer) this.f29189k.get(0)).intValue())) + mo32809c().getX(mo32809c().findPointerIndex(((Integer) this.f29189k.get(1)).intValue()))) / 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo32757r() {
        C11291d dVar = (C11291d) this.f29190l.get(new C11294g((Integer) this.f29189k.get(0), (Integer) this.f29189k.get(1)));
        if (Math.abs(Math.toDegrees(Math.abs(Math.atan2((double) dVar.mo32815c(), (double) dVar.mo32813a()))) - 90.0d) <= ((double) this.f29141t)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo32755c(int i) {
        mo32754c(this.f29166a.getResources().getDimension(i));
    }
}

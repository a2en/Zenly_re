package com.mapbox.android.gestures;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public class ShoveGestureDetector extends C11295h<OnShoveGestureListener> {

    /* renamed from: x */
    private static final Set<Integer> f29135x = new HashSet();

    /* renamed from: t */
    private float f29136t;

    /* renamed from: u */
    private float f29137u;

    /* renamed from: v */
    float f29138v;

    /* renamed from: w */
    float f29139w;

    public interface OnShoveGestureListener {
        boolean onShove(ShoveGestureDetector shoveGestureDetector, float f, float f2);

        boolean onShoveBegin(ShoveGestureDetector shoveGestureDetector);

        void onShoveEnd(ShoveGestureDetector shoveGestureDetector, float f, float f2);
    }

    /* renamed from: com.mapbox.android.gestures.ShoveGestureDetector$a */
    public static class C11283a implements OnShoveGestureListener {
    }

    static {
        f29135x.add(Integer.valueOf(3));
    }

    public ShoveGestureDetector(Context context, C11288a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32722a(int i) {
        return Math.abs(this.f29138v) >= this.f29137u && super.mo32722a(i);
    }

    /* renamed from: b */
    public void mo32744b(float f) {
        this.f29136t = f;
    }

    /* renamed from: c */
    public void mo32745c(float f) {
        this.f29137u = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32724d() {
        super.mo32724d();
        this.f29139w = mo32748q();
        this.f29138v += this.f29139w;
        if (mo32827o()) {
            float f = this.f29139w;
            if (f != 0.0f) {
                return ((OnShoveGestureListener) this.f29172g).onShove(this, f, this.f29138v);
            }
        }
        if (!mo32722a(3) || !((OnShoveGestureListener) this.f29172g).onShoveBegin(this)) {
            return false;
        }
        mo32825k();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo32747i() {
        return super.mo32747i() || !mo32749r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo32726j() {
        super.mo32726j();
        this.f29138v = 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo32727l() {
        super.mo32727l();
        ((OnShoveGestureListener) this.f29172g).onShoveEnd(this, this.f29196r, this.f29197s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Set<Integer> mo32728p() {
        return f29135x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public float mo32748q() {
        return ((mo32804a().getY(mo32804a().findPointerIndex(((Integer) this.f29189k.get(0)).intValue())) + mo32804a().getY(mo32804a().findPointerIndex(((Integer) this.f29189k.get(1)).intValue()))) / 2.0f) - ((mo32809c().getY(mo32809c().findPointerIndex(((Integer) this.f29189k.get(0)).intValue())) + mo32809c().getY(mo32809c().findPointerIndex(((Integer) this.f29189k.get(1)).intValue()))) / 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo32749r() {
        C11291d dVar = (C11291d) this.f29190l.get(new C11294g((Integer) this.f29189k.get(0), (Integer) this.f29189k.get(1)));
        double degrees = Math.toDegrees(Math.abs(Math.atan2((double) dVar.mo32815c(), (double) dVar.mo32813a())));
        float f = this.f29136t;
        if (degrees <= ((double) f) || 180.0d - degrees <= ((double) f)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo32746c(int i) {
        mo32745c(this.f29166a.getResources().getDimension(i));
    }
}

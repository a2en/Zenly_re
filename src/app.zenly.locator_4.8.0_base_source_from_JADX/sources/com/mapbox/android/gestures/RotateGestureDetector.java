package com.mapbox.android.gestures;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

public class RotateGestureDetector extends C11295h<OnRotateGestureListener> {

    /* renamed from: w */
    private static final Set<Integer> f29131w = new HashSet();

    /* renamed from: t */
    private float f29132t;

    /* renamed from: u */
    float f29133u;

    /* renamed from: v */
    float f29134v;

    public interface OnRotateGestureListener {
        boolean onRotate(RotateGestureDetector rotateGestureDetector, float f, float f2);

        boolean onRotateBegin(RotateGestureDetector rotateGestureDetector);

        void onRotateEnd(RotateGestureDetector rotateGestureDetector, float f, float f2, float f3);
    }

    /* renamed from: com.mapbox.android.gestures.RotateGestureDetector$a */
    public static class C11282a implements OnRotateGestureListener {
    }

    static {
        f29131w.add(Integer.valueOf(2));
    }

    public RotateGestureDetector(Context context, C11288a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32722a(int i) {
        return Math.abs(this.f29133u) >= this.f29132t && super.mo32722a(i);
    }

    /* renamed from: b */
    public void mo32739b(float f) {
        this.f29132t = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32724d() {
        super.mo32724d();
        this.f29134v = mo32740q();
        this.f29133u += this.f29134v;
        if (mo32827o()) {
            float f = this.f29134v;
            if (f != 0.0f) {
                return ((OnRotateGestureListener) this.f29172g).onRotate(this, f, this.f29133u);
            }
        }
        if (!mo32722a(2) || !((OnRotateGestureListener) this.f29172g).onRotateBegin(this)) {
            return false;
        }
        mo32825k();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo32726j() {
        super.mo32726j();
        this.f29133u = 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo32727l() {
        super.mo32727l();
        if (this.f29134v == 0.0f) {
            this.f29196r = 0.0f;
            this.f29197s = 0.0f;
        }
        ((OnRotateGestureListener) this.f29172g).onRotateEnd(this, this.f29196r, this.f29197s, mo32738a(this.f29196r, this.f29197s));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Set<Integer> mo32728p() {
        return f29131w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public float mo32740q() {
        C11291d dVar = (C11291d) this.f29190l.get(new C11294g((Integer) this.f29189k.get(0), (Integer) this.f29189k.get(1)));
        return (float) Math.toDegrees(Math.atan2((double) dVar.mo32817e(), (double) dVar.mo32816d()) - Math.atan2((double) dVar.mo32815c(), (double) dVar.mo32813a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo32738a(float f, float f2) {
        float abs = Math.abs((float) (((double) ((mo32821f().x * f2) + (mo32821f().y * f))) / (Math.pow((double) mo32821f().x, 2.0d) + Math.pow((double) mo32821f().y, 2.0d))));
        return this.f29134v < 0.0f ? -abs : abs;
    }
}

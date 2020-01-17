package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Iterator;

public class MultiFingerTapGestureDetector extends C11292e<OnMultiFingerTapGestureListener> {

    /* renamed from: n */
    private long f29126n;

    /* renamed from: o */
    private float f29127o;

    /* renamed from: p */
    private boolean f29128p;

    /* renamed from: q */
    private boolean f29129q;

    /* renamed from: r */
    private int f29130r;

    public interface OnMultiFingerTapGestureListener {
        boolean onMultiFingerTap(MultiFingerTapGestureDetector multiFingerTapGestureDetector, int i);
    }

    public MultiFingerTapGestureDetector(Context context, C11288a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32723a(MotionEvent motionEvent) {
        super.mo32723a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 5) {
                    if (this.f29129q) {
                        this.f29128p = true;
                    }
                    this.f29130r = this.f29189k.size();
                } else if (actionMasked == 6) {
                    this.f29129q = true;
                }
            } else if (!this.f29128p) {
                this.f29128p = mo32734a(this.f29190l);
            }
            return false;
        }
        if (mo32722a(4)) {
            z = ((OnMultiFingerTapGestureListener) this.f29172g).onMultiFingerTap(this, this.f29130r);
        }
        mo32726j();
        return z;
    }

    /* renamed from: b */
    public void mo32735b(float f) {
        this.f29127o = f;
    }

    /* renamed from: c */
    public void mo32736c(int i) {
        mo32735b(this.f29166a.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo32726j() {
        super.mo32726j();
        this.f29130r = 0;
        this.f29128p = false;
        this.f29129q = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo32734a(HashMap<C11294g, C11291d> hashMap) {
        Iterator it = hashMap.values().iterator();
        do {
            boolean z = false;
            if (!it.hasNext()) {
                return false;
            }
            C11291d dVar = (C11291d) it.next();
            float abs = Math.abs(dVar.mo32813a() - dVar.mo32816d());
            float abs2 = Math.abs(dVar.mo32815c() - dVar.mo32817e());
            float f = this.f29127o;
            if (abs > f || abs2 > f) {
                z = true;
            }
            this.f29128p = z;
        } while (!this.f29128p);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32722a(int i) {
        if (this.f29130r <= 1 || this.f29128p || mo32807b() >= this.f29126n || !super.mo32722a(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo32733a(long j) {
        this.f29126n = j;
    }
}

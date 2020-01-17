package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.mapbox.android.gestures.e */
public abstract class C11292e<L> extends C11289b<L> {

    /* renamed from: h */
    private final float f29186h;

    /* renamed from: i */
    private float f29187i;

    /* renamed from: j */
    private final C11293f f29188j = new C11293f();

    /* renamed from: k */
    final List<Integer> f29189k = new ArrayList();

    /* renamed from: l */
    final HashMap<C11294g, C11291d> f29190l = new HashMap<>();

    /* renamed from: m */
    private PointF f29191m = new PointF();

    public C11292e(Context context, C11288a aVar) {
        super(context, aVar);
        this.f29186h = (float) ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    /* renamed from: c */
    private void m29070c(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            this.f29189k.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        } else if (actionMasked == 1 || actionMasked == 6) {
            this.f29189k.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        }
    }

    /* renamed from: k */
    private void mo32825k() {
        this.f29190l.clear();
        int i = 0;
        while (i < this.f29189k.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f29189k.size(); i3++) {
                int intValue = ((Integer) this.f29189k.get(i)).intValue();
                int intValue2 = ((Integer) this.f29189k.get(i3)).intValue();
                float x = mo32809c().getX(mo32809c().findPointerIndex(intValue));
                float y = mo32809c().getY(mo32809c().findPointerIndex(intValue));
                float x2 = mo32809c().getX(mo32809c().findPointerIndex(intValue2)) - x;
                float y2 = mo32809c().getY(mo32809c().findPointerIndex(intValue2)) - y;
                float x3 = mo32804a().getX(mo32804a().findPointerIndex(intValue));
                float y3 = mo32804a().getY(mo32804a().findPointerIndex(intValue));
                this.f29190l.put(new C11294g(Integer.valueOf(intValue), Integer.valueOf(intValue2)), new C11291d(x2, y2, mo32804a().getX(mo32804a().findPointerIndex(intValue2)) - x3, mo32804a().getY(mo32804a().findPointerIndex(intValue2)) - y3));
            }
            i = i2;
        }
    }

    /* renamed from: l */
    private boolean mo32727l() {
        for (C11291d b : this.f29190l.values()) {
            if (b.mo32814b() < this.f29187i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32723a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean a = this.f29188j.mo32823a(actionMasked, motionEvent.getPointerCount(), this.f29189k.size());
        if (a) {
            if (this instanceof C11295h) {
                C11295h hVar = (C11295h) this;
                if (hVar.mo32827o()) {
                    hVar.mo32727l();
                }
            }
            this.f29189k.clear();
            this.f29190l.clear();
        }
        if (!a || actionMasked == 0) {
            m29070c(motionEvent);
        }
        if (a) {
            Log.w("MultiFingerGesture", "Some MotionEvents were not passed to the library.");
            return false;
        }
        if (actionMasked == 2 && this.f29189k.size() >= mo32725h() && mo32820e()) {
            mo32825k();
            if (!mo32747i()) {
                this.f29191m = C11297j.m29095a(motionEvent);
                return mo32724d();
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo32819b(int i) {
        mo32818a(this.f29166a.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32724d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo32820e() {
        return mo32804a().getPressure() / mo32809c().getPressure() > 0.67f;
    }

    /* renamed from: f */
    public PointF mo32821f() {
        return this.f29191m;
    }

    /* renamed from: g */
    public int mo32822g() {
        return this.f29189k.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo32725h() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo32747i() {
        boolean z;
        DisplayMetrics displayMetrics = this.f29166a.getResources().getDisplayMetrics();
        float f = (float) displayMetrics.widthPixels;
        float f2 = this.f29186h;
        float f3 = f - f2;
        float f4 = ((float) displayMetrics.heightPixels) - f2;
        for (Integer intValue : this.f29189k) {
            int findPointerIndex = mo32804a().findPointerIndex(intValue.intValue());
            float a = C11297j.m29094a(mo32804a(), findPointerIndex);
            float b = C11297j.m29096b(mo32804a(), findPointerIndex);
            if (a < f2 || b < f2 || a > f3 || b > f4) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return mo32727l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo32726j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32722a(int i) {
        return super.mo32722a(i) && !mo32747i();
    }

    /* renamed from: a */
    public void mo32818a(float f) {
        this.f29187i = f;
    }
}

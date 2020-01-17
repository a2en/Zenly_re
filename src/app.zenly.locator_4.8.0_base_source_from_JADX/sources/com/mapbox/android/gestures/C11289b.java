package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.mapbox.android.gestures.b */
public abstract class C11289b<L> {

    /* renamed from: a */
    protected final Context f29166a;

    /* renamed from: b */
    private final C11288a f29167b;

    /* renamed from: c */
    private MotionEvent f29168c;

    /* renamed from: d */
    private MotionEvent f29169d;

    /* renamed from: e */
    private long f29170e;

    /* renamed from: f */
    private boolean f29171f = true;

    /* renamed from: g */
    protected L f29172g;

    public C11289b(Context context, C11288a aVar) {
        this.f29166a = context;
        this.f29167b = aVar;
    }

    /* renamed from: c */
    private boolean m29053c(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        MotionEvent motionEvent2 = this.f29169d;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.f29169d = null;
        }
        MotionEvent motionEvent3 = this.f29168c;
        if (motionEvent3 != null) {
            this.f29169d = MotionEvent.obtain(motionEvent3);
            this.f29168c.recycle();
            this.f29168c = null;
        }
        this.f29168c = MotionEvent.obtain(motionEvent);
        this.f29170e = this.f29168c.getEventTime() - this.f29168c.getDownTime();
        return mo32723a(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32722a(int i) {
        if (this.f29172g == null || !this.f29171f) {
            return false;
        }
        for (Set<Integer> set : this.f29167b.mo32800c()) {
            if (set.contains(Integer.valueOf(i))) {
                for (Integer intValue : set) {
                    int intValue2 = intValue.intValue();
                    Iterator it = this.f29167b.mo32789a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C11289b bVar = (C11289b) it.next();
                            if (bVar instanceof C11295h) {
                                C11295h hVar = (C11295h) bVar;
                                if (hVar.mo32826m().contains(Integer.valueOf(intValue2)) && hVar.mo32827o()) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                continue;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo32723a(MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo32808b(MotionEvent motionEvent) {
        return m29053c(motionEvent);
    }

    /* renamed from: b */
    public long mo32807b() {
        return this.f29170e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32805a(L l) {
        this.f29172g = l;
    }

    /* renamed from: a */
    public MotionEvent mo32804a() {
        return this.f29168c;
    }

    /* renamed from: c */
    public MotionEvent mo32809c() {
        return this.f29169d;
    }

    /* renamed from: a */
    public void mo32806a(boolean z) {
        this.f29171f = z;
    }
}

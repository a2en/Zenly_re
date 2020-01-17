package com.airbnb.lottie.p287p;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.p005q.C0668b;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8659a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p214e.p228e.C7585h;

/* renamed from: com.airbnb.lottie.p.q */
class C8641q {

    /* renamed from: a */
    private static final Interpolator f22198a = new LinearInterpolator();

    /* renamed from: b */
    private static C7585h<WeakReference<Interpolator>> f22199b;

    /* renamed from: c */
    static C8631a f22200c = C8631a.m20077a("t", "s", "e", "o", "i", "h", "to", "ti");

    C8641q() {
    }

    /* renamed from: a */
    private static C7585h<WeakReference<Interpolator>> m20124a() {
        if (f22199b == null) {
            f22199b = new C7585h<>();
        }
        return f22199b;
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m20125a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (C8641q.class) {
            weakReference = (WeakReference) m20124a().mo19617a(i);
        }
        return weakReference;
    }

    /* renamed from: a */
    private static void m20126a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C8641q.class) {
            f22199b.mo19622c(i, weakReference);
        }
    }

    /* renamed from: a */
    static <T> C8659a<T> m20123a(C8630c cVar, C8506c cVar2, float f, C8626j0<T> j0Var, boolean z) throws IOException {
        if (z) {
            return m20121a(cVar2, cVar, f, j0Var);
        }
        return m20122a(cVar, f, j0Var);
    }

    /* renamed from: a */
    private static <T> C8659a<T> m20121a(C8506c cVar, C8630c cVar2, float f, C8626j0<T> j0Var) throws IOException {
        Interpolator interpolator;
        Object obj;
        C8630c cVar3 = cVar2;
        float f2 = f;
        C8626j0<T> j0Var2 = j0Var;
        cVar2.mo23229b();
        Interpolator interpolator2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f3 = 0.0f;
        while (cVar2.mo23233f()) {
            switch (cVar3.mo23225a(f22200c)) {
                case 0:
                    f3 = (float) cVar2.mo23235h();
                    break;
                case 1:
                    obj3 = j0Var2.mo23224a(cVar3, f2);
                    break;
                case 2:
                    obj2 = j0Var2.mo23224a(cVar3, f2);
                    break;
                case 3:
                    pointF = C8639p.m20119d(cVar2, f);
                    break;
                case 4:
                    pointF2 = C8639p.m20119d(cVar2, f);
                    break;
                case 5:
                    if (cVar2.mo23236i() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = C8639p.m20119d(cVar2, f);
                    break;
                case 7:
                    pointF4 = C8639p.m20119d(cVar2, f);
                    break;
                default:
                    cVar2.mo23240m();
                    break;
            }
        }
        cVar2.mo23231d();
        if (z) {
            interpolator = f22198a;
            obj = obj3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator = f22198a;
            } else {
                float f4 = -f2;
                pointF.x = C8657g.m20181a(pointF.x, f4, f2);
                pointF.y = C8657g.m20181a(pointF.y, -100.0f, 100.0f);
                pointF2.x = C8657g.m20181a(pointF2.x, f4, f2);
                pointF2.y = C8657g.m20181a(pointF2.y, -100.0f, 100.0f);
                int a = C8658h.m20195a(pointF.x, pointF.y, pointF2.x, pointF2.y);
                WeakReference a2 = m20125a(a);
                if (a2 != null) {
                    interpolator2 = (Interpolator) a2.get();
                }
                if (a2 == null || interpolator2 == null) {
                    interpolator2 = C0668b.m3090a(pointF.x / f2, pointF.y / f2, pointF2.x / f2, pointF2.y / f2);
                    try {
                        m20126a(a, new WeakReference(interpolator2));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
                interpolator = interpolator2;
            }
            obj = obj2;
        }
        C8659a aVar = new C8659a(cVar, obj3, obj, interpolator, f3, null);
        aVar.f22247m = pointF3;
        aVar.f22248n = pointF4;
        return aVar;
    }

    /* renamed from: a */
    private static <T> C8659a<T> m20122a(C8630c cVar, float f, C8626j0<T> j0Var) throws IOException {
        return new C8659a<>(j0Var.mo23224a(cVar, f));
    }
}

package com.airbnb.lottie.p289q;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.model.C8541a;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.C8571k;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.g */
public class C8657g {

    /* renamed from: a */
    private static PointF f22228a = new PointF();

    /* renamed from: a */
    public static double m20180a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static int m20184a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: a */
    public static PointF m20186a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    private static int m20189b(int i, int i2) {
        return i - (i2 * m20183a(i, i2));
    }

    /* renamed from: b */
    public static boolean m20190b(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: c */
    public static float m20191c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static void m20187a(C8571k kVar, Path path) {
        path.reset();
        PointF b = kVar.mo23125b();
        path.moveTo(b.x, b.y);
        f22228a.set(b.x, b.y);
        for (int i = 0; i < kVar.mo23123a().size(); i++) {
            C8541a aVar = (C8541a) kVar.mo23123a().get(i);
            PointF a = aVar.mo23039a();
            PointF b2 = aVar.mo23041b();
            PointF c = aVar.mo23043c();
            if (!a.equals(f22228a) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f22228a.set(c.x, c.y);
        }
        if (kVar.mo23126c()) {
            path.close();
        }
    }

    /* renamed from: a */
    static int m20182a(float f, float f2) {
        return m20189b((int) f, (int) f2);
    }

    /* renamed from: a */
    private static int m20183a(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: a */
    public static int m20185a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: a */
    public static float m20181a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static void m20188a(C8582e eVar, int i, List<C8582e> list, C8582e eVar2, KeyPathElementContent keyPathElementContent) {
        if (eVar.mo23167a(keyPathElementContent.getName(), i)) {
            list.add(eVar2.mo23166a(keyPathElementContent.getName()).mo23165a((KeyPathElement) keyPathElementContent));
        }
    }
}

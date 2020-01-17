package app.zenly.locator.map.p116n1;

import android.graphics.PointF;
import app.zenly.locator.map.p116n1.C4276d.C4278b;
import app.zenly.locator.map.p116n1.C4276d.C4278b.C4279a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12930h;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.n1.e */
public final class C4280e {

    /* renamed from: a */
    public static final C4280e f11477a = new C4280e();

    private C4280e() {
    }

    /* renamed from: b */
    private final PointF m12722b(C4279a aVar, PointF pointF) {
        PointF a = aVar.mo11311a();
        PointF d = aVar.mo11314d();
        if (a.x == d.x && a.y == d.y) {
            return a;
        }
        float f = d.x;
        float f2 = a.x;
        float f3 = (f - f2) * (pointF.x - f2);
        float f4 = d.y;
        float f5 = a.y;
        float f6 = f3 + ((f4 - f5) * (pointF.y - f5));
        double d2 = (double) 2.0f;
        float pow = f6 / (((float) Math.pow((double) (f - f2), d2)) + ((float) Math.pow((double) (d.y - a.y), d2)));
        if (pow <= 1.0f) {
            if (pow < 0.0f) {
                d = a;
            } else {
                float f7 = 1.0f - pow;
                d = new PointF((a.x * f7) + (d.x * pow), (f7 * a.y) + (pow * d.y));
            }
        }
        return d;
    }

    /* renamed from: a */
    public final float mo11318a(C4278b bVar, double d, PointF pointF) {
        C4278b bVar2 = bVar;
        PointF pointF2 = pointF;
        C12932j.m33818b(bVar2, "curve");
        C12932j.m33818b(pointF2, "out");
        float b = (bVar.mo11305b() + bVar.mo11306c()) / 2.0f;
        C4279a a = m12720a(bVar2, 0, bVar.mo11307d().size(), b);
        if (a != null) {
            PointF a2 = a.mo11311a();
            PointF d2 = a.mo11314d();
            double d3 = (double) (d2.x - a2.x);
            double d4 = (double) (d2.y - a2.y);
            double b2 = (double) ((((bVar.mo11305b() + bVar.mo11306c()) / 2.0f) - a.mo11312b()) / (a.mo11313c() - a.mo11312b()));
            double d5 = ((double) a2.x) + (d3 * b2);
            double d6 = ((double) a2.y) + (b2 * d4);
            double d7 = d3 / d4;
            double d8 = -d7;
            double d9 = (d7 * d5) + d6;
            double d10 = (double) 2;
            double pow = Math.pow(d8, d10) + 1.0d;
            PointF pointF3 = d2;
            double d11 = (((d8 * d9) - (d8 * d6)) - d5) * 2.0d;
            double sqrt = Math.sqrt(Math.pow(d11, d10) - ((((double) 4) * pow) * ((Math.pow(d5, d10) + Math.pow(d9 - d6, d10)) - Math.pow(d, d10))));
            double d12 = pow * d10;
            double d13 = -d11;
            double d14 = (d13 + sqrt) / d12;
            double d15 = (d8 * d14) + d9;
            double d16 = (d13 - sqrt) / d12;
            double d17 = (d8 * d16) + d9;
            PointF a3 = ((C4279a) C12857w.m33682f(bVar.mo11307d())).mo11311a();
            PointF pointF4 = a2;
            double d18 = d16;
            if ((Math.pow(d14 - ((double) a3.x), d10) + Math.pow(d15 - ((double) a3.y), d10)) - (Math.pow(d16 - ((double) a3.x), d10) + Math.pow(d17 - ((double) a3.y), d10)) > 1.0d) {
                pointF.set((float) d14, (float) d15);
            } else {
                pointF.set((float) d18, (float) d17);
            }
            PointF pointF5 = pointF3;
            PointF pointF6 = pointF4;
            return (float) Math.toDegrees(((double) ((float) Math.atan2((double) (pointF5.x - pointF6.x), (double) (pointF5.y - pointF6.y)))) + 1.5707963267948966d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Segment not found. phaseIn: ");
        sb.append(bVar.mo11305b());
        sb.append(", phaseOut: ");
        sb.append(bVar.mo11306c());
        sb.append(", middlePhase: ");
        sb.append(b);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final float mo11319a(C4276d dVar, PointF pointF) {
        C12932j.m33818b(dVar, "segmentedCurve");
        C12932j.m33818b(pointF, "point");
        float f = -1.0f;
        for (C4278b a : dVar.mo11295b()) {
            float a2 = f11477a.m12719a(a, pointF);
            if (f == -1.0f) {
                f = a2;
            } else if (a2 > ((float) -1)) {
                f = Math.min(f, a2);
            }
        }
        return f;
    }

    /* renamed from: a */
    private final float m12719a(C4278b bVar, PointF pointF) {
        if (bVar.mo11307d().isEmpty()) {
            return -1.0f;
        }
        PointF b = m12722b(m12721a(bVar, 0, bVar.mo11307d().size(), pointF), pointF);
        return (float) Math.hypot((double) (pointF.x - b.x), (double) (pointF.y - b.y));
    }

    /* renamed from: a */
    private final C4279a m12720a(C4278b bVar, int i, int i2, float f) {
        if (i == i2) {
            return null;
        }
        int i3 = (i + i2) / 2;
        C4279a aVar = (C4279a) bVar.mo11307d().get(i3);
        float b = aVar.mo11312b();
        float c = aVar.mo11313c();
        if (f < b || f > c) {
            if (f < aVar.mo11312b()) {
                aVar = m12720a(bVar, i, C12973l.m33885a(i3, 0), f);
            } else {
                aVar = m12720a(bVar, C12973l.m33890b(i3 + 1, i2), i2, f);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private final C4279a m12721a(C4278b bVar, int i, int i2, PointF pointF) {
        float f;
        float f2;
        int i3 = (i + i2) / 2;
        C4279a aVar = (C4279a) bVar.mo11307d().get(i3);
        float a = m12718a(aVar, pointF);
        if (i3 > 0) {
            f = m12718a((C4279a) bVar.mo11307d().get(i3 - 1), pointF);
        } else {
            f = C12930h.f33513b.mo37276a();
        }
        if (i3 < bVar.mo11307d().size() - 1) {
            f2 = m12718a((C4279a) bVar.mo11307d().get(i3 + 1), pointF);
        } else {
            f2 = C12930h.f33513b.mo37276a();
        }
        if (f < a) {
            return m12721a(bVar, i, i3 - 1, pointF);
        }
        return f2 < a ? m12721a(bVar, i3 + 1, i2, pointF) : aVar;
    }

    /* renamed from: a */
    private final float m12718a(C4279a aVar, PointF pointF) {
        double d = (double) 2;
        return ((float) Math.pow((double) (((aVar.mo11311a().x + aVar.mo11314d().x) / 2.0f) - pointF.x), d)) + ((float) Math.pow((double) (((aVar.mo11311a().y + aVar.mo11314d().y) / 2.0f) - pointF.y), d));
    }

    /* renamed from: a */
    public final C4278b mo11320a(List<C4278b> list) {
        Object obj;
        C12932j.m33818b(list, "curves");
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                C4278b bVar = (C4278b) obj;
                float c = bVar.mo11306c() - bVar.mo11305b();
                do {
                    Object next = it.next();
                    C4278b bVar2 = (C4278b) next;
                    float c2 = bVar2.mo11306c() - bVar2.mo11305b();
                    if (Float.compare(c, c2) < 0) {
                        obj = next;
                        c = c2;
                    }
                } while (it.hasNext());
            }
        }
        if (obj != null) {
            return (C4278b) obj;
        }
        C12932j.m33814a();
        throw null;
    }
}

package app.zenly.locator.p143s.p150n;

import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.C7272d0;
import p213co.znly.models.C7272d0.C7273a;
import p213co.znly.models.core.C7222t2;

/* renamed from: app.zenly.locator.s.n.b */
public final class C5457b {
    /* renamed from: a */
    public static double m15493a(double d) {
        return (d / 6378137.0d) * 57.29577951308232d;
    }

    /* renamed from: a */
    public static double m15494a(double d, double d2) {
        return m15508b(d, m15493a(d2));
    }

    /* renamed from: a */
    private static double m15496a(double d, double d2, double d3, double d4) {
        double d5 = d + d2;
        while (d5 < d3) {
            d5 = d4 - (d3 - d5);
        }
        while (d5 > d4) {
            d5 = (d5 - d4) + d3;
        }
        return d5;
    }

    /* renamed from: b */
    public static double m15507b(double d) {
        return (d * 6378137.0d) / 57.29577951308232d;
    }

    /* renamed from: b */
    private static double m15508b(double d, double d2) {
        return m15496a(d, d2, -85.05112878d, 85.05112878d);
    }

    /* renamed from: b */
    public static double m15509b(double d, double d2, double d3) {
        return d + ((d2 - d) * d3);
    }

    /* renamed from: c */
    private static double m15512c(double d, double d2) {
        return m15496a(d, d2, -180.0d, 180.0d);
    }

    /* renamed from: c */
    public static double m15513c(double d, double d2, double d3) {
        return d + ((d2 - d) * d3);
    }

    /* renamed from: a */
    public static double m15495a(double d, double d2, double d3) {
        return m15512c(d, m15493a(d3) / Math.cos((d2 * 3.141592653589793d) / 180.0d));
    }

    /* renamed from: b */
    public static boolean m15510b(double d, double d2, double d3, double d4) {
        return Math.abs(d - d3) < 1.0E-6d && Math.abs(d2 - d4) < 1.0E-6d;
    }

    /* renamed from: c */
    private static double m15511c(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return Math.max(Math.min(Math.log((sin + 1.0d) / (1.0d - sin)) / 2.0d, 3.141592653589793d), -3.141592653589793d) / 2.0d;
    }

    /* renamed from: a */
    public static C5460e m15500a(C7222t2 t2Var) {
        return m15499a(t2Var.getCenter(), m15507b((double) t2Var.getRadius()));
    }

    /* renamed from: a */
    public static C5460e m15499a(C6950b0 b0Var, double d) {
        double d2 = -d;
        double a = m15494a(b0Var.getLatitude(), d2);
        double a2 = m15495a(b0Var.getLongitude(), b0Var.getLatitude(), d2);
        double a3 = m15494a(b0Var.getLatitude(), d);
        double a4 = m15495a(b0Var.getLongitude(), b0Var.getLatitude(), d);
        return C5460e.m15531a(new C5459d(a, a2), new C5459d(a3, a4));
    }

    /* renamed from: a */
    public static C7272d0 m15501a(C5460e eVar) {
        C7273a newBuilder = C7272d0.newBuilder();
        C6951a newBuilder2 = C6950b0.newBuilder();
        newBuilder2.setLatitude(eVar.f14048a);
        newBuilder2.setLongitude(eVar.f14051d);
        newBuilder.mo19192b(newBuilder2);
        C6951a newBuilder3 = C6950b0.newBuilder();
        newBuilder3.setLatitude(eVar.f14049b);
        newBuilder3.setLongitude(eVar.f14050c);
        newBuilder.mo19191a(newBuilder3);
        return (C7272d0) newBuilder.build();
    }

    /* renamed from: a */
    public static double m15498a(C5460e eVar, float f, float f2, int i, double d) {
        double c = (m15511c(eVar.f14048a) - m15511c(eVar.f14049b)) / 3.141592653589793d;
        double d2 = eVar.f14050c - eVar.f14051d;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        float f3 = (float) i;
        return Math.min(Math.min(m15497a(f2, f3, c), m15497a(f, f3, d2 / 360.0d)), d);
    }

    /* renamed from: a */
    public static boolean m15505a(C5460e eVar, C5460e eVar2) {
        boolean z = true;
        if (eVar == null && eVar2 == null) {
            return true;
        }
        if ((eVar == null) != (eVar2 == null)) {
            return false;
        }
        if (Math.abs(eVar.f14048a - eVar2.f14048a) >= 1.0E-6d || Math.abs(eVar.f14049b - eVar2.f14049b) >= 1.0E-6d || Math.abs(eVar.f14050c - eVar2.f14050c) >= 1.0E-6d || Math.abs(eVar.f14051d - eVar2.f14051d) >= 1.0E-6d) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m15504a(C5459d dVar, C5459d dVar2) {
        boolean z = true;
        if (dVar == null && dVar2 == null) {
            return true;
        }
        boolean z2 = dVar == null;
        if (dVar2 != null) {
            z = false;
        }
        if (z2 != z) {
            return false;
        }
        return m15510b(dVar.mo13060b(), dVar.mo13062c(), dVar2.mo13060b(), dVar2.mo13062c());
    }

    /* renamed from: a */
    public static boolean m15506a(C5464h hVar, C5464h hVar2) {
        boolean z = true;
        if (hVar == null && hVar2 == null) {
            return true;
        }
        if ((hVar == null) != (hVar2 == null)) {
            return false;
        }
        if (!m15504a(hVar.f14060a, hVar2.f14060a) || !m15504a(hVar.f14061b, hVar2.f14061b) || !m15504a(hVar.f14063d, hVar2.f14063d) || !m15504a(hVar.f14062c, hVar2.f14062c)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m15503a(double d, double d2, double d3, double d4, double d5) {
        boolean z = false;
        if (d < 0.0d) {
            return false;
        }
        if (Math.abs(d2 - d4) * d < 1.0d && d * Math.abs(d3 - d5) < 1.0d) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static double m15497a(float f, float f2, double d) {
        return Math.log(((double) (f / f2)) / d) / 0.6931471805599453d;
    }

    /* renamed from: a */
    public static void m15502a(C5459d dVar, C5459d dVar2, double d, C5459d dVar3) {
        dVar3.mo13061b(m15509b(dVar.mo13060b(), dVar2.mo13060b(), d));
        dVar3.mo13063c(m15513c(dVar.mo13062c(), dVar2.mo13062c(), d));
    }
}

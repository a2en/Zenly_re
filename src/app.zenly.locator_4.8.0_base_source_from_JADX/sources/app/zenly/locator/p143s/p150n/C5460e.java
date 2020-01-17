package app.zenly.locator.p143s.p150n;

import java.util.List;

/* renamed from: app.zenly.locator.s.n.e */
public class C5460e {

    /* renamed from: a */
    public double f14048a;

    /* renamed from: b */
    public double f14049b;

    /* renamed from: c */
    public double f14050c;

    /* renamed from: d */
    public double f14051d;

    /* renamed from: app.zenly.locator.s.n.e$a */
    public static class C5461a {

        /* renamed from: a */
        private double f14052a = 90.0d;

        /* renamed from: b */
        private double f14053b = 180.0d;

        /* renamed from: c */
        private double f14054c = -90.0d;

        /* renamed from: d */
        private double f14055d = -180.0d;

        /* renamed from: a */
        public void mo13073a(C5459d dVar) {
            this.f14052a = Math.min(this.f14052a, dVar.mo13060b());
            this.f14053b = Math.min(this.f14053b, dVar.mo13062c());
            this.f14054c = Math.max(this.f14054c, dVar.mo13060b());
            this.f14055d = Math.max(this.f14055d, dVar.mo13062c());
        }

        /* renamed from: a */
        public C5460e mo13072a() {
            C5460e eVar = new C5460e(this.f14054c, this.f14055d, this.f14052a, this.f14053b);
            return eVar;
        }
    }

    public C5460e() {
    }

    /* renamed from: a */
    public void mo13068a(double d) {
        this.f14048a = C5457b.m15494a(this.f14048a, d);
        double d2 = -d;
        this.f14051d = C5457b.m15495a(this.f14051d, this.f14048a, d2);
        this.f14049b = C5457b.m15494a(this.f14049b, d2);
        this.f14050c = C5457b.m15495a(this.f14050c, this.f14049b, d);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5460e)) {
            return false;
        }
        C5460e eVar = (C5460e) obj;
        if (!(this.f14048a == eVar.f14048a && this.f14049b == eVar.f14049b && this.f14050c == eVar.f14050c && this.f14051d == eVar.f14051d)) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("N:");
        sb.append(this.f14048a);
        sb.append("; E:");
        sb.append(this.f14050c);
        sb.append("; S:");
        sb.append(this.f14049b);
        sb.append("; W:");
        sb.append(this.f14051d);
        return sb.toString();
    }

    public C5460e(double d, double d2, double d3, double d4) {
        this.f14048a = d;
        this.f14050c = d2;
        this.f14049b = d3;
        this.f14051d = d4;
    }

    /* renamed from: a */
    public C5459d mo13067a() {
        C5459d dVar = new C5459d();
        mo13069a(dVar);
        return dVar;
    }

    /* renamed from: a */
    public void mo13069a(C5459d dVar) {
        dVar.mo13061b((this.f14048a + this.f14049b) / 2.0d);
        dVar.mo13063c((this.f14050c + this.f14051d) / 2.0d);
    }

    /* renamed from: a */
    public static C5460e m15531a(C5459d... dVarArr) {
        C5461a aVar = new C5461a();
        for (C5459d a : dVarArr) {
            aVar.mo13073a(a);
        }
        return aVar.mo13072a();
    }

    /* renamed from: a */
    public static C5460e m15530a(List<C5459d> list) {
        C5461a aVar = new C5461a();
        for (C5459d a : list) {
            aVar.mo13073a(a);
        }
        return aVar.mo13072a();
    }

    /* renamed from: a */
    public static C5460e m15529a(C5459d dVar, double d) {
        double d2 = -d;
        double a = C5457b.m15494a(dVar.mo13060b(), d2);
        double a2 = C5457b.m15495a(dVar.mo13062c(), dVar.mo13060b(), d2);
        double a3 = C5457b.m15494a(dVar.mo13060b(), d);
        double a4 = C5457b.m15495a(dVar.mo13062c(), dVar.mo13060b(), d);
        return m15531a(new C5459d(a, a2), new C5459d(a3, a4));
    }
}

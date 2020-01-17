package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0447g;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.i */
class C0430i {

    /* renamed from: d */
    public static int f1804d;

    /* renamed from: a */
    public boolean f1805a;

    /* renamed from: b */
    C0433k f1806b = null;

    /* renamed from: c */
    ArrayList<C0433k> f1807c = new ArrayList<>();

    public C0430i(C0433k kVar, int i) {
        f1804d++;
        this.f1806b = kVar;
    }

    /* renamed from: b */
    private long m1878b(C0423d dVar, long j) {
        C0433k kVar = dVar.f1783d;
        if (kVar instanceof C0427g) {
            return j;
        }
        int size = dVar.f1790k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) dVar.f1790k.get(i);
            if (dependency instanceof C0423d) {
                C0423d dVar2 = (C0423d) dependency;
                if (dVar2.f1783d != kVar) {
                    j2 = Math.max(j2, m1878b(dVar2, ((long) dVar2.f1785f) + j));
                }
            }
        }
        if (dVar == kVar.f1818h) {
            long d = j + kVar.mo2464d();
            j2 = Math.max(Math.max(j2, m1878b(kVar.f1819i, d)), d - ((long) kVar.f1819i.f1785f));
        }
        return j2;
    }

    /* renamed from: a */
    public void mo2482a(C0433k kVar) {
        this.f1807c.add(kVar);
    }

    /* renamed from: a */
    private long m1877a(C0423d dVar, long j) {
        C0433k kVar = dVar.f1783d;
        if (kVar instanceof C0427g) {
            return j;
        }
        int size = dVar.f1790k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            Dependency dependency = (Dependency) dVar.f1790k.get(i);
            if (dependency instanceof C0423d) {
                C0423d dVar2 = (C0423d) dependency;
                if (dVar2.f1783d != kVar) {
                    j2 = Math.min(j2, m1877a(dVar2, ((long) dVar2.f1785f) + j));
                }
            }
        }
        if (dVar == kVar.f1819i) {
            long d = j - kVar.mo2464d();
            j2 = Math.min(Math.min(j2, m1877a(kVar.f1818h, d)), d - ((long) kVar.f1818h.f1785f));
        }
        return j2;
    }

    /* renamed from: a */
    public long mo2481a(C0447g gVar, int i) {
        long j;
        int i2;
        long j2;
        C0433k kVar = this.f1806b;
        long j3 = 0;
        if (kVar instanceof C0421b) {
            if (((C0421b) kVar).f1816f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(kVar instanceof C0428h)) {
                return 0;
            }
        } else if (!(kVar instanceof C0431j)) {
            return 0;
        }
        C0423d dVar = (i == 0 ? gVar.f1920d : gVar.f1922e).f1818h;
        C0423d dVar2 = (i == 0 ? gVar.f1920d : gVar.f1922e).f1819i;
        boolean contains = this.f1806b.f1818h.f1791l.contains(dVar);
        boolean contains2 = this.f1806b.f1819i.f1791l.contains(dVar2);
        long d = this.f1806b.mo2464d();
        if (!contains || !contains2) {
            if (contains) {
                C0423d dVar3 = this.f1806b.f1818h;
                j = Math.max(m1878b(dVar3, (long) dVar3.f1785f), ((long) this.f1806b.f1818h.f1785f) + d);
            } else if (contains2) {
                C0423d dVar4 = this.f1806b.f1819i;
                j = Math.max(-m1877a(dVar4, (long) dVar4.f1785f), ((long) (-this.f1806b.f1819i.f1785f)) + d);
            } else {
                C0433k kVar2 = this.f1806b;
                j2 = ((long) kVar2.f1818h.f1785f) + kVar2.mo2464d();
                i2 = this.f1806b.f1819i.f1785f;
            }
            return j;
        }
        long b = m1878b(this.f1806b.f1818h, 0);
        long a = m1877a(this.f1806b.f1819i, 0);
        long j4 = b - d;
        int i3 = this.f1806b.f1819i.f1785f;
        if (j4 >= ((long) (-i3))) {
            j4 += (long) i3;
        }
        long j5 = (-a) - d;
        int i4 = this.f1806b.f1818h.f1785f;
        long j6 = j5 - ((long) i4);
        if (j6 >= ((long) i4)) {
            j6 -= (long) i4;
        }
        float b2 = this.f1806b.f1812b.mo2557b(i);
        if (b2 > 0.0f) {
            j3 = (long) ((((float) j6) / b2) + (((float) j4) / (1.0f - b2)));
        }
        float f = (float) j3;
        long j7 = ((long) ((f * b2) + 0.5f)) + d + ((long) ((f * (1.0f - b2)) + 0.5f));
        C0433k kVar3 = this.f1806b;
        j2 = ((long) kVar3.f1818h.f1785f) + j7;
        i2 = kVar3.f1819i.f1785f;
        j = j2 - ((long) i2);
        return j;
    }
}

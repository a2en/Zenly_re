package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.constraintlayout.solver.widgets.h */
public class C0448h {

    /* renamed from: a */
    public List<C0444f> f1992a;

    /* renamed from: b */
    public boolean f1993b = false;

    /* renamed from: c */
    List<C0444f> f1994c;

    /* renamed from: d */
    List<C0444f> f1995d;

    C0448h(List<C0444f> list) {
        new ArrayList();
        new ArrayList();
        new HashSet();
        new HashSet();
        this.f1994c = new ArrayList();
        this.f1995d = new ArrayList();
        this.f1992a = list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C0444f> mo2643a() {
        if (!this.f1994c.isEmpty()) {
            return this.f1994c;
        }
        int size = this.f1992a.size();
        for (int i = 0; i < size; i++) {
            C0444f fVar = (C0444f) this.f1992a.get(i);
            if (!fVar.f1961x0) {
                m2069a((ArrayList) this.f1994c, fVar);
            }
        }
        this.f1995d.clear();
        this.f1995d.addAll(this.f1992a);
        this.f1995d.removeAll(this.f1994c);
        return this.f1994c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2644b() {
        int size = this.f1995d.size();
        for (int i = 0; i < size; i++) {
            m2068a((C0444f) this.f1995d.get(i));
        }
    }

    /* renamed from: a */
    private void m2069a(ArrayList<C0444f> arrayList, C0444f fVar) {
        if (!fVar.f1963y0) {
            arrayList.add(fVar);
            fVar.f1963y0 = true;
            if (!fVar.mo2531G()) {
                if (fVar instanceof C0453k) {
                    C0453k kVar = (C0453k) fVar;
                    int i = kVar.f2036K0;
                    for (int i2 = 0; i2 < i; i2++) {
                        m2069a(arrayList, kVar.f2035J0[i2]);
                    }
                }
                for (C0439e eVar : fVar.f1897J) {
                    C0439e eVar2 = eVar.f1855d;
                    if (eVar2 != null) {
                        C0444f fVar2 = eVar2.f1853b;
                        if (!(eVar2 == null || fVar2 == fVar.mo2601q())) {
                            m2069a(arrayList, fVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2068a(androidx.constraintlayout.solver.widgets.C0444f r7) {
        /*
            r6 = this;
            boolean r0 = r7.f1961x0
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r7.mo2531G()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1886D
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            androidx.constraintlayout.solver.widgets.e r3 = r7.f1886D
            androidx.constraintlayout.solver.widgets.e r3 = r3.f1855d
            goto L_0x0021
        L_0x001d:
            androidx.constraintlayout.solver.widgets.e r3 = r7.f1882B
            androidx.constraintlayout.solver.widgets.e r3 = r3.f1855d
        L_0x0021:
            if (r3 == 0) goto L_0x0049
            androidx.constraintlayout.solver.widgets.f r4 = r3.f1853b
            boolean r4 = r4.mo2584h(r1)
            if (r4 != 0) goto L_0x0030
            androidx.constraintlayout.solver.widgets.f r4 = r3.f1853b
            r6.m2068a(r4)
        L_0x0030:
            androidx.constraintlayout.solver.widgets.e$d r4 = r3.f1854c
            androidx.constraintlayout.solver.widgets.e$d r5 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT
            if (r4 != r5) goto L_0x0040
            androidx.constraintlayout.solver.widgets.f r3 = r3.f1853b
            int r4 = r3.f1905R
            int r3 = r3.mo2525A()
            int r3 = r3 + r4
            goto L_0x004a
        L_0x0040:
            androidx.constraintlayout.solver.widgets.e$d r5 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT
            if (r4 != r5) goto L_0x0049
            androidx.constraintlayout.solver.widgets.f r3 = r3.f1853b
            int r3 = r3.f1905R
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x0054
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1886D
            int r0 = r0.mo2514b()
            int r3 = r3 - r0
            goto L_0x0060
        L_0x0054:
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1882B
            int r0 = r0.mo2514b()
            int r4 = r7.mo2525A()
            int r0 = r0 + r4
            int r3 = r3 + r0
        L_0x0060:
            int r0 = r7.mo2525A()
            int r0 = r3 - r0
            r7.mo2541a(r0, r3)
            androidx.constraintlayout.solver.widgets.C0454l.m2110b(r7, r1, r0)
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1890F
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
            if (r0 == 0) goto L_0x0093
            androidx.constraintlayout.solver.widgets.f r1 = r0.f1853b
            boolean r1 = r1.mo2584h(r2)
            if (r1 != 0) goto L_0x007f
            androidx.constraintlayout.solver.widgets.f r1 = r0.f1853b
            r6.m2068a(r1)
        L_0x007f:
            androidx.constraintlayout.solver.widgets.f r0 = r0.f1853b
            int r1 = r0.f1906S
            int r0 = r0.f1917b0
            int r1 = r1 + r0
            int r0 = r7.f1917b0
            int r1 = r1 - r0
            int r0 = r7.f1902O
            int r0 = r0 + r1
            r7.mo2576d(r1, r0)
            androidx.constraintlayout.solver.widgets.C0454l.m2110b(r7, r2, r1)
            return
        L_0x0093:
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1888E
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
            if (r0 == 0) goto L_0x009a
            r1 = 1
        L_0x009a:
            if (r1 == 0) goto L_0x00a1
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1888E
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
            goto L_0x00a5
        L_0x00a1:
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1884C
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
        L_0x00a5:
            if (r0 == 0) goto L_0x00cc
            androidx.constraintlayout.solver.widgets.f r4 = r0.f1853b
            boolean r4 = r4.mo2584h(r2)
            if (r4 != 0) goto L_0x00b4
            androidx.constraintlayout.solver.widgets.f r4 = r0.f1853b
            r6.m2068a(r4)
        L_0x00b4:
            androidx.constraintlayout.solver.widgets.e$d r4 = r0.f1854c
            androidx.constraintlayout.solver.widgets.e$d r5 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM
            if (r4 != r5) goto L_0x00c4
            androidx.constraintlayout.solver.widgets.f r0 = r0.f1853b
            int r3 = r0.f1906S
            int r0 = r0.mo2589k()
            int r3 = r3 + r0
            goto L_0x00cc
        L_0x00c4:
            androidx.constraintlayout.solver.widgets.e$d r5 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP
            if (r4 != r5) goto L_0x00cc
            androidx.constraintlayout.solver.widgets.f r0 = r0.f1853b
            int r3 = r0.f1906S
        L_0x00cc:
            if (r1 == 0) goto L_0x00d6
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1888E
            int r0 = r0.mo2514b()
            int r3 = r3 - r0
            goto L_0x00e2
        L_0x00d6:
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1884C
            int r0 = r0.mo2514b()
            int r1 = r7.mo2589k()
            int r0 = r0 + r1
            int r3 = r3 + r0
        L_0x00e2:
            int r0 = r7.mo2589k()
            int r0 = r3 - r0
            r7.mo2576d(r0, r3)
            androidx.constraintlayout.solver.widgets.C0454l.m2110b(r7, r2, r0)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0448h.m2068a(androidx.constraintlayout.solver.widgets.f):void");
    }
}

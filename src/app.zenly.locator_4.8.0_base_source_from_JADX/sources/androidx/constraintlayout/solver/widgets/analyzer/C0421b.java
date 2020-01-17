package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0439e;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0447g;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.b */
public class C0421b extends C0433k {

    /* renamed from: k */
    ArrayList<C0433k> f1772k = new ArrayList<>();

    /* renamed from: l */
    private int f1773l;

    public C0421b(C0444f fVar, int i) {
        super(fVar);
        this.f1816f = i;
        m1837f();
    }

    /* renamed from: f */
    private void m1837f() {
        C0444f fVar;
        C0444f fVar2 = this.f1812b;
        C0444f f = fVar2.mo2579f(this.f1816f);
        while (true) {
            C0444f fVar3 = f;
            fVar = fVar2;
            fVar2 = fVar3;
            if (fVar2 == null) {
                break;
            }
            f = fVar2.mo2579f(this.f1816f);
        }
        this.f1812b = fVar;
        this.f1772k.add(fVar.mo2582g(this.f1816f));
        C0444f e = fVar.mo2577e(this.f1816f);
        while (e != null) {
            this.f1772k.add(e.mo2582g(this.f1816f));
            e = e.mo2577e(this.f1816f);
        }
        Iterator it = this.f1772k.iterator();
        while (it.hasNext()) {
            C0433k kVar = (C0433k) it.next();
            int i = this.f1816f;
            if (i == 0) {
                kVar.f1812b.f1916b = this;
            } else if (i == 1) {
                kVar.f1812b.f1918c = this;
            }
        }
        if ((this.f1816f == 0 && ((C0447g) this.f1812b.mo2601q()).mo2628Z()) && this.f1772k.size() > 1) {
            ArrayList<C0433k> arrayList = this.f1772k;
            this.f1812b = ((C0433k) arrayList.get(arrayList.size() - 1)).f1812b;
        }
        this.f1773l = this.f1816f == 0 ? this.f1812b.mo2593m() : this.f1812b.mo2616x();
    }

    /* renamed from: g */
    private C0444f m1838g() {
        for (int i = 0; i < this.f1772k.size(); i++) {
            C0433k kVar = (C0433k) this.f1772k.get(i);
            if (kVar.f1812b.mo2620z() != 8) {
                return kVar.f1812b;
            }
        }
        return null;
    }

    /* renamed from: h */
    private C0444f m1839h() {
        for (int size = this.f1772k.size() - 1; size >= 0; size--) {
            C0433k kVar = (C0433k) this.f1772k.get(size);
            if (kVar.f1812b.mo2620z() != 8) {
                return kVar.f1812b;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2461a() {
        Iterator it = this.f1772k.iterator();
        while (it.hasNext()) {
            ((C0433k) it.next()).mo2461a();
        }
        int size = this.f1772k.size();
        if (size >= 1) {
            C0444f fVar = ((C0433k) this.f1772k.get(0)).f1812b;
            C0444f fVar2 = ((C0433k) this.f1772k.get(size - 1)).f1812b;
            if (this.f1816f == 0) {
                C0439e eVar = fVar.f1882B;
                C0439e eVar2 = fVar2.f1886D;
                C0423d a = mo2487a(eVar, 0);
                int b = eVar.mo2514b();
                C0444f g = m1838g();
                if (g != null) {
                    b = g.f1882B.mo2514b();
                }
                if (a != null) {
                    mo2490a(this.f1818h, a, b);
                }
                C0423d a2 = mo2487a(eVar2, 0);
                int b2 = eVar2.mo2514b();
                C0444f h = m1839h();
                if (h != null) {
                    b2 = h.f1886D.mo2514b();
                }
                if (a2 != null) {
                    mo2490a(this.f1819i, a2, -b2);
                }
            } else {
                C0439e eVar3 = fVar.f1884C;
                C0439e eVar4 = fVar2.f1888E;
                C0423d a3 = mo2487a(eVar3, 1);
                int b3 = eVar3.mo2514b();
                C0444f g2 = m1838g();
                if (g2 != null) {
                    b3 = g2.f1884C.mo2514b();
                }
                if (a3 != null) {
                    mo2490a(this.f1818h, a3, b3);
                }
                C0423d a4 = mo2487a(eVar4, 1);
                int b4 = eVar4.mo2514b();
                C0444f h2 = m1839h();
                if (h2 != null) {
                    b4 = h2.f1888E.mo2514b();
                }
                if (a4 != null) {
                    mo2490a(this.f1819i, a4, -b4);
                }
            }
            this.f1818h.f1780a = this;
            this.f1819i.f1780a = this;
        }
    }

    /* renamed from: b */
    public void mo2462b() {
        for (int i = 0; i < this.f1772k.size(); i++) {
            ((C0433k) this.f1772k.get(i)).mo2462b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2463c() {
        this.f1813c = null;
        Iterator it = this.f1772k.iterator();
        while (it.hasNext()) {
            ((C0433k) it.next()).mo2463c();
        }
    }

    /* renamed from: d */
    public long mo2464d() {
        long j = 0;
        for (int i = 0; i < this.f1772k.size(); i++) {
            C0433k kVar = (C0433k) this.f1772k.get(i);
            j = j + ((long) kVar.f1818h.f1785f) + kVar.mo2464d() + ((long) kVar.f1819i.f1785f);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo2465e() {
        int size = this.f1772k.size();
        for (int i = 0; i < size; i++) {
            if (!((C0433k) this.f1772k.get(i)).mo2465e()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f1816f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator it = this.f1772k.iterator();
        while (it.hasNext()) {
            C0433k kVar = (C0433k) it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("<");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(kVar);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("> ");
            sb2 = sb7.toString();
        }
        return sb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019e, code lost:
        if (r7 != r11) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c6, code lost:
        if (r7 != r11) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r2.f1815e.f1789j != false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r23) {
        /*
            r22 = this;
            r0 = r22
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r0.f1818h
            boolean r1 = r1.f1789j
            if (r1 == 0) goto L_0x0421
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r0.f1819i
            boolean r1 = r1.f1789j
            if (r1 != 0) goto L_0x0010
            goto L_0x0421
        L_0x0010:
            androidx.constraintlayout.solver.widgets.f r1 = r0.f1812b
            androidx.constraintlayout.solver.widgets.f r1 = r1.mo2601q()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof androidx.constraintlayout.solver.widgets.C0447g
            if (r3 == 0) goto L_0x0023
            androidx.constraintlayout.solver.widgets.g r1 = (androidx.constraintlayout.solver.widgets.C0447g) r1
            boolean r1 = r1.mo2628Z()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r0.f1819i
            int r3 = r3.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r4 = r0.f1818h
            int r4 = r4.f1786g
            int r3 = r3 - r4
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r4 = r0.f1772k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r8 = r0.f1772k
            java.lang.Object r8 = r8.get(r5)
            androidx.constraintlayout.solver.widgets.analyzer.k r8 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r8
            androidx.constraintlayout.solver.widgets.f r8 = r8.f1812b
            int r8 = r8.mo2620z()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r10 = r0.f1772k
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.k r10 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r10
            androidx.constraintlayout.solver.widgets.f r10 = r10.f1812b
            int r10 = r10.mo2620z()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L_0x0106
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0072:
            if (r13 >= r4) goto L_0x00f8
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r2 = r0.f1772k
            java.lang.Object r2 = r2.get(r13)
            androidx.constraintlayout.solver.widgets.analyzer.k r2 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r2
            androidx.constraintlayout.solver.widgets.f r11 = r2.f1812b
            int r11 = r11.mo2620z()
            if (r11 != r7) goto L_0x0086
            goto L_0x00f1
        L_0x0086:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0091
            if (r13 < r5) goto L_0x0091
            androidx.constraintlayout.solver.widgets.analyzer.d r11 = r2.f1818h
            int r11 = r11.f1785f
            int r14 = r14 + r11
        L_0x0091:
            androidx.constraintlayout.solver.widgets.analyzer.e r11 = r2.f1815e
            int r11 = r11.f1786g
            androidx.constraintlayout.solver.widgets.f$b r7 = r2.f1814d
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r7 == r10) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            if (r7 == 0) goto L_0x00be
            int r10 = r0.f1816f
            if (r10 != 0) goto L_0x00af
            androidx.constraintlayout.solver.widgets.f r10 = r2.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.h r10 = r10.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.e r10 = r10.f1815e
            boolean r10 = r10.f1789j
            if (r10 != 0) goto L_0x00af
            return
        L_0x00af:
            int r10 = r0.f1816f
            if (r10 != r12) goto L_0x00d2
            androidx.constraintlayout.solver.widgets.f r10 = r2.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r10 = r10.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r10 = r10.f1815e
            boolean r10 = r10.f1789j
            if (r10 != 0) goto L_0x00d2
            return
        L_0x00be:
            int r10 = r2.f1811a
            if (r10 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            androidx.constraintlayout.solver.widgets.analyzer.e r7 = r2.f1815e
            int r11 = r7.f1801m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            androidx.constraintlayout.solver.widgets.analyzer.e r10 = r2.f1815e
            boolean r10 = r10.f1789j
            if (r10 == 0) goto L_0x00d2
        L_0x00d1:
            r7 = 1
        L_0x00d2:
            if (r7 != 0) goto L_0x00e6
            int r15 = r15 + 1
            androidx.constraintlayout.solver.widgets.f r7 = r2.f1812b
            float[] r7 = r7.f1887D0
            int r10 = r0.f1816f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00e7
            float r17 = r17 + r7
            goto L_0x00e7
        L_0x00e6:
            int r14 = r14 + r11
        L_0x00e7:
            if (r13 >= r8) goto L_0x00f1
            if (r13 >= r6) goto L_0x00f1
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = r2.f1819i
            int r2 = r2.f1785f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f1:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0072
        L_0x00f8:
            if (r14 < r3) goto L_0x0103
            if (r15 != 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0103:
            r2 = r16
            goto L_0x010b
        L_0x0106:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010b:
            androidx.constraintlayout.solver.widgets.analyzer.d r7 = r0.f1818h
            int r7 = r7.f1786g
            if (r1 == 0) goto L_0x0115
            androidx.constraintlayout.solver.widgets.analyzer.d r7 = r0.f1819i
            int r7 = r7.f1786g
        L_0x0115:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x012c
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0125
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012c
        L_0x0125:
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012c:
            if (r15 <= 0) goto L_0x0231
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L_0x0139:
            if (r13 >= r4) goto L_0x01e6
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r12 = r0.f1772k
            java.lang.Object r12 = r12.get(r13)
            androidx.constraintlayout.solver.widgets.analyzer.k r12 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r12
            androidx.constraintlayout.solver.widgets.f r9 = r12.f1812b
            int r9 = r9.mo2620z()
            r18 = r11
            r11 = 8
            if (r9 != r11) goto L_0x0151
            goto L_0x01d1
        L_0x0151:
            androidx.constraintlayout.solver.widgets.f$b r9 = r12.f1814d
            androidx.constraintlayout.solver.widgets.f$b r11 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x01d1
            androidx.constraintlayout.solver.widgets.analyzer.e r9 = r12.f1815e
            boolean r9 = r9.f1789j
            if (r9 != 0) goto L_0x01d1
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0173
            androidx.constraintlayout.solver.widgets.f r11 = r12.f1812b
            float[] r11 = r11.f1887D0
            int r9 = r0.f1816f
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r11 = (int) r9
            goto L_0x0175
        L_0x0173:
            r11 = r18
        L_0x0175:
            int r9 = r0.f1816f
            if (r9 != 0) goto L_0x01a1
            androidx.constraintlayout.solver.widgets.f r9 = r12.f1812b
            r19 = r10
            int r10 = r9.f1942o
            int r9 = r9.f1940n
            r20 = r14
            int r14 = r12.f1811a
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L_0x0193
            androidx.constraintlayout.solver.widgets.analyzer.e r7 = r12.f1815e
            int r7 = r7.f1801m
            int r7 = java.lang.Math.min(r11, r7)
            goto L_0x0194
        L_0x0193:
            r7 = r11
        L_0x0194:
            int r7 = java.lang.Math.max(r9, r7)
            if (r10 <= 0) goto L_0x019e
            int r7 = java.lang.Math.min(r10, r7)
        L_0x019e:
            if (r7 == r11) goto L_0x01cb
            goto L_0x01c8
        L_0x01a1:
            r21 = r7
            r19 = r10
            r20 = r14
            androidx.constraintlayout.solver.widgets.f r7 = r12.f1812b
            int r9 = r7.f1948r
            int r7 = r7.f1946q
            int r10 = r12.f1811a
            r14 = 1
            if (r10 != r14) goto L_0x01bb
            androidx.constraintlayout.solver.widgets.analyzer.e r10 = r12.f1815e
            int r10 = r10.f1801m
            int r10 = java.lang.Math.min(r11, r10)
            goto L_0x01bc
        L_0x01bb:
            r10 = r11
        L_0x01bc:
            int r7 = java.lang.Math.max(r7, r10)
            if (r9 <= 0) goto L_0x01c6
            int r7 = java.lang.Math.min(r9, r7)
        L_0x01c6:
            if (r7 == r11) goto L_0x01cb
        L_0x01c8:
            int r16 = r16 + 1
            r11 = r7
        L_0x01cb:
            androidx.constraintlayout.solver.widgets.analyzer.e r7 = r12.f1815e
            r7.mo2476a(r11)
            goto L_0x01d7
        L_0x01d1:
            r21 = r7
            r19 = r10
            r20 = r14
        L_0x01d7:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L_0x0139
        L_0x01e6:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L_0x0222
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L_0x01f0:
            if (r7 >= r4) goto L_0x0220
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r10 = r0.f1772k
            java.lang.Object r10 = r10.get(r7)
            androidx.constraintlayout.solver.widgets.analyzer.k r10 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r10
            androidx.constraintlayout.solver.widgets.f r11 = r10.f1812b
            int r11 = r11.mo2620z()
            r12 = 8
            if (r11 != r12) goto L_0x0205
            goto L_0x021d
        L_0x0205:
            if (r7 <= 0) goto L_0x020e
            if (r7 < r5) goto L_0x020e
            androidx.constraintlayout.solver.widgets.analyzer.d r11 = r10.f1818h
            int r11 = r11.f1785f
            int r9 = r9 + r11
        L_0x020e:
            androidx.constraintlayout.solver.widgets.analyzer.e r11 = r10.f1815e
            int r11 = r11.f1786g
            int r9 = r9 + r11
            if (r7 >= r8) goto L_0x021d
            if (r7 >= r6) goto L_0x021d
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r10.f1819i
            int r10 = r10.f1785f
            int r10 = -r10
            int r9 = r9 + r10
        L_0x021d:
            int r7 = r7 + 1
            goto L_0x01f0
        L_0x0220:
            r14 = r9
            goto L_0x0224
        L_0x0222:
            r14 = r20
        L_0x0224:
            int r7 = r0.f1773l
            r9 = 2
            if (r7 != r9) goto L_0x022f
            if (r16 != 0) goto L_0x022f
            r7 = 0
            r0.f1773l = r7
            goto L_0x0237
        L_0x022f:
            r7 = 0
            goto L_0x0237
        L_0x0231:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L_0x0237:
            if (r14 <= r3) goto L_0x023b
            r0.f1773l = r9
        L_0x023b:
            int r9 = r0.f1773l
            r10 = 1
            if (r9 != r10) goto L_0x02dd
            if (r2 <= r10) goto L_0x0247
            int r3 = r3 - r14
            int r2 = r2 - r10
            int r2 = r3 / r2
            goto L_0x024f
        L_0x0247:
            if (r2 != r10) goto L_0x024e
            int r3 = r3 - r14
            r2 = 2
            int r2 = r3 / 2
            goto L_0x024f
        L_0x024e:
            r2 = 0
        L_0x024f:
            if (r15 <= 0) goto L_0x0252
            r2 = 0
        L_0x0252:
            r3 = r21
        L_0x0254:
            if (r7 >= r4) goto L_0x0421
            if (r1 == 0) goto L_0x025d
            int r9 = r7 + 1
            int r9 = r4 - r9
            goto L_0x025e
        L_0x025d:
            r9 = r7
        L_0x025e:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r10 = r0.f1772k
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.k r9 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r9
            androidx.constraintlayout.solver.widgets.f r10 = r9.f1812b
            int r10 = r10.mo2620z()
            r11 = 8
            if (r10 != r11) goto L_0x027b
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            r10.mo2476a(r3)
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r9.f1819i
            r9.mo2476a(r3)
            goto L_0x02d9
        L_0x027b:
            if (r7 <= 0) goto L_0x0282
            if (r1 == 0) goto L_0x0281
            int r3 = r3 - r2
            goto L_0x0282
        L_0x0281:
            int r3 = r3 + r2
        L_0x0282:
            if (r7 <= 0) goto L_0x0293
            if (r7 < r5) goto L_0x0293
            if (r1 == 0) goto L_0x028e
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            int r10 = r10.f1785f
            int r3 = r3 - r10
            goto L_0x0293
        L_0x028e:
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            int r10 = r10.f1785f
            int r3 = r3 + r10
        L_0x0293:
            if (r1 == 0) goto L_0x029b
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1819i
            r10.mo2476a(r3)
            goto L_0x02a0
        L_0x029b:
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            r10.mo2476a(r3)
        L_0x02a0:
            androidx.constraintlayout.solver.widgets.analyzer.e r10 = r9.f1815e
            int r11 = r10.f1786g
            androidx.constraintlayout.solver.widgets.f$b r12 = r9.f1814d
            androidx.constraintlayout.solver.widgets.f$b r13 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x02b1
            int r12 = r9.f1811a
            r13 = 1
            if (r12 != r13) goto L_0x02b1
            int r11 = r10.f1801m
        L_0x02b1:
            if (r1 == 0) goto L_0x02b5
            int r3 = r3 - r11
            goto L_0x02b6
        L_0x02b5:
            int r3 = r3 + r11
        L_0x02b6:
            if (r1 == 0) goto L_0x02be
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            r10.mo2476a(r3)
            goto L_0x02c3
        L_0x02be:
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1819i
            r10.mo2476a(r3)
        L_0x02c3:
            r10 = 1
            r9.f1817g = r10
            if (r7 >= r8) goto L_0x02d9
            if (r7 >= r6) goto L_0x02d9
            if (r1 == 0) goto L_0x02d3
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r9.f1819i
            int r9 = r9.f1785f
            int r9 = -r9
            int r3 = r3 - r9
            goto L_0x02d9
        L_0x02d3:
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r9.f1819i
            int r9 = r9.f1785f
            int r9 = -r9
            int r3 = r3 + r9
        L_0x02d9:
            int r7 = r7 + 1
            goto L_0x0254
        L_0x02dd:
            if (r9 != 0) goto L_0x0371
            int r3 = r3 - r14
            r9 = 1
            int r2 = r2 + r9
            int r2 = r3 / r2
            if (r15 <= 0) goto L_0x02e7
            r2 = 0
        L_0x02e7:
            r3 = r21
        L_0x02e9:
            if (r7 >= r4) goto L_0x0421
            if (r1 == 0) goto L_0x02f2
            int r9 = r7 + 1
            int r9 = r4 - r9
            goto L_0x02f3
        L_0x02f2:
            r9 = r7
        L_0x02f3:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r10 = r0.f1772k
            java.lang.Object r9 = r10.get(r9)
            androidx.constraintlayout.solver.widgets.analyzer.k r9 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r9
            androidx.constraintlayout.solver.widgets.f r10 = r9.f1812b
            int r10 = r10.mo2620z()
            r11 = 8
            if (r10 != r11) goto L_0x0310
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            r10.mo2476a(r3)
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r9.f1819i
            r9.mo2476a(r3)
            goto L_0x036d
        L_0x0310:
            if (r1 == 0) goto L_0x0314
            int r3 = r3 - r2
            goto L_0x0315
        L_0x0314:
            int r3 = r3 + r2
        L_0x0315:
            if (r7 <= 0) goto L_0x0326
            if (r7 < r5) goto L_0x0326
            if (r1 == 0) goto L_0x0321
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            int r10 = r10.f1785f
            int r3 = r3 - r10
            goto L_0x0326
        L_0x0321:
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            int r10 = r10.f1785f
            int r3 = r3 + r10
        L_0x0326:
            if (r1 == 0) goto L_0x032e
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1819i
            r10.mo2476a(r3)
            goto L_0x0333
        L_0x032e:
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            r10.mo2476a(r3)
        L_0x0333:
            androidx.constraintlayout.solver.widgets.analyzer.e r10 = r9.f1815e
            int r11 = r10.f1786g
            androidx.constraintlayout.solver.widgets.f$b r12 = r9.f1814d
            androidx.constraintlayout.solver.widgets.f$b r13 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x0348
            int r12 = r9.f1811a
            r13 = 1
            if (r12 != r13) goto L_0x0348
            int r10 = r10.f1801m
            int r11 = java.lang.Math.min(r11, r10)
        L_0x0348:
            if (r1 == 0) goto L_0x034c
            int r3 = r3 - r11
            goto L_0x034d
        L_0x034c:
            int r3 = r3 + r11
        L_0x034d:
            if (r1 == 0) goto L_0x0355
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1818h
            r10.mo2476a(r3)
            goto L_0x035a
        L_0x0355:
            androidx.constraintlayout.solver.widgets.analyzer.d r10 = r9.f1819i
            r10.mo2476a(r3)
        L_0x035a:
            if (r7 >= r8) goto L_0x036d
            if (r7 >= r6) goto L_0x036d
            if (r1 == 0) goto L_0x0367
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r9.f1819i
            int r9 = r9.f1785f
            int r9 = -r9
            int r3 = r3 - r9
            goto L_0x036d
        L_0x0367:
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r9.f1819i
            int r9 = r9.f1785f
            int r9 = -r9
            int r3 = r3 + r9
        L_0x036d:
            int r7 = r7 + 1
            goto L_0x02e9
        L_0x0371:
            r2 = 2
            if (r9 != r2) goto L_0x0421
            int r2 = r0.f1816f
            if (r2 != 0) goto L_0x037f
            androidx.constraintlayout.solver.widgets.f r2 = r0.f1812b
            float r2 = r2.mo2591l()
            goto L_0x0385
        L_0x037f:
            androidx.constraintlayout.solver.widgets.f r2 = r0.f1812b
            float r2 = r2.mo2614w()
        L_0x0385:
            if (r1 == 0) goto L_0x038b
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9 - r2
        L_0x038b:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0397
            if (r15 <= 0) goto L_0x0398
        L_0x0397:
            r2 = 0
        L_0x0398:
            if (r1 == 0) goto L_0x039d
            int r2 = r21 - r2
            goto L_0x039f
        L_0x039d:
            int r2 = r21 + r2
        L_0x039f:
            if (r7 >= r4) goto L_0x0421
            if (r1 == 0) goto L_0x03a8
            int r3 = r7 + 1
            int r3 = r4 - r3
            goto L_0x03a9
        L_0x03a8:
            r3 = r7
        L_0x03a9:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r9 = r0.f1772k
            java.lang.Object r3 = r9.get(r3)
            androidx.constraintlayout.solver.widgets.analyzer.k r3 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r3
            androidx.constraintlayout.solver.widgets.f r9 = r3.f1812b
            int r9 = r9.mo2620z()
            r10 = 8
            if (r9 != r10) goto L_0x03c7
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r3.f1818h
            r9.mo2476a(r2)
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r3.f1819i
            r3.mo2476a(r2)
            r13 = 1
            goto L_0x041d
        L_0x03c7:
            if (r7 <= 0) goto L_0x03d8
            if (r7 < r5) goto L_0x03d8
            if (r1 == 0) goto L_0x03d3
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r3.f1818h
            int r9 = r9.f1785f
            int r2 = r2 - r9
            goto L_0x03d8
        L_0x03d3:
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r3.f1818h
            int r9 = r9.f1785f
            int r2 = r2 + r9
        L_0x03d8:
            if (r1 == 0) goto L_0x03e0
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r3.f1819i
            r9.mo2476a(r2)
            goto L_0x03e5
        L_0x03e0:
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r3.f1818h
            r9.mo2476a(r2)
        L_0x03e5:
            androidx.constraintlayout.solver.widgets.analyzer.e r9 = r3.f1815e
            int r11 = r9.f1786g
            androidx.constraintlayout.solver.widgets.f$b r12 = r3.f1814d
            androidx.constraintlayout.solver.widgets.f$b r13 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x03f7
            int r12 = r3.f1811a
            r13 = 1
            if (r12 != r13) goto L_0x03f8
            int r11 = r9.f1801m
            goto L_0x03f8
        L_0x03f7:
            r13 = 1
        L_0x03f8:
            if (r1 == 0) goto L_0x03fc
            int r2 = r2 - r11
            goto L_0x03fd
        L_0x03fc:
            int r2 = r2 + r11
        L_0x03fd:
            if (r1 == 0) goto L_0x0405
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r3.f1818h
            r9.mo2476a(r2)
            goto L_0x040a
        L_0x0405:
            androidx.constraintlayout.solver.widgets.analyzer.d r9 = r3.f1819i
            r9.mo2476a(r2)
        L_0x040a:
            if (r7 >= r8) goto L_0x041d
            if (r7 >= r6) goto L_0x041d
            if (r1 == 0) goto L_0x0417
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r3.f1819i
            int r3 = r3.f1785f
            int r3 = -r3
            int r2 = r2 - r3
            goto L_0x041d
        L_0x0417:
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r3.f1819i
            int r3 = r3.f1785f
            int r3 = -r3
            int r2 = r2 + r3
        L_0x041d:
            int r7 = r7 + 1
            goto L_0x039f
        L_0x0421:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C0421b.update(androidx.constraintlayout.solver.widgets.analyzer.Dependency):void");
    }
}

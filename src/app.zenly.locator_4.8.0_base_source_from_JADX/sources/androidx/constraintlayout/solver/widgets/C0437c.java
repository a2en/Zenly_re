package androidx.constraintlayout.solver.widgets;

import p214e.p229f.p232b.C7600e;

/* renamed from: androidx.constraintlayout.solver.widgets.c */
class C0437c {
    /* renamed from: a */
    static void m1912a(C0447g gVar, C7600e eVar, int i) {
        int i2;
        C0438d[] dVarArr;
        int i3;
        if (i == 0) {
            int i4 = gVar.f1983U0;
            dVarArr = gVar.f1986X0;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = gVar.f1984V0;
            i2 = i5;
            dVarArr = gVar.f1985W0;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            C0438d dVar = dVarArr[i6];
            dVar.mo2505a();
            if (!gVar.mo2504z(4)) {
                m1913a(gVar, eVar, i, i3, dVar);
            } else if (!C0454l.m2109a(gVar, eVar, i, i3, dVar)) {
                m1913a(gVar, eVar, i, i3, dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.f1965z0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.f1881A0 == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x036c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1913a(androidx.constraintlayout.solver.widgets.C0447g r36, p214e.p229f.p232b.C7600e r37, int r38, int r39, androidx.constraintlayout.solver.widgets.C0438d r40) {
        /*
            r0 = r36
            r9 = r37
            r1 = r40
            androidx.constraintlayout.solver.widgets.f r10 = r1.f1831a
            androidx.constraintlayout.solver.widgets.f r11 = r1.f1833c
            androidx.constraintlayout.solver.widgets.f r12 = r1.f1832b
            androidx.constraintlayout.solver.widgets.f r13 = r1.f1834d
            androidx.constraintlayout.solver.widgets.f r2 = r1.f1835e
            float r3 = r1.f1841k
            androidx.constraintlayout.solver.widgets.f r4 = r1.f1836f
            androidx.constraintlayout.solver.widgets.f r4 = r1.f1837g
            androidx.constraintlayout.solver.widgets.f$b[] r4 = r0.f1899L
            r4 = r4[r38]
            androidx.constraintlayout.solver.widgets.f$b r5 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r38 != 0) goto L_0x0038
            int r8 = r2.f1965z0
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.f1965z0
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.f1965z0
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f1881A0
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f1881A0
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f1881A0
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r15 = r8
            r8 = r10
            r16 = r14
            r14 = r5
            r5 = 0
        L_0x0053:
            r21 = 0
            if (r5 != 0) goto L_0x0124
            androidx.constraintlayout.solver.widgets.e[] r6 = r8.f1897J
            r6 = r6[r39]
            if (r4 != 0) goto L_0x0063
            if (r14 == 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r23 = 4
            goto L_0x0065
        L_0x0063:
            r23 = 1
        L_0x0065:
            int r24 = r6.mo2514b()
            androidx.constraintlayout.solver.widgets.e r7 = r6.f1855d
            if (r7 == 0) goto L_0x0075
            if (r8 == r10) goto L_0x0075
            int r7 = r7.mo2514b()
            int r24 = r24 + r7
        L_0x0075:
            r7 = r24
            if (r14 == 0) goto L_0x0083
            if (r8 == r10) goto L_0x0083
            if (r8 == r12) goto L_0x0083
            r24 = r3
            r23 = r5
            r3 = 6
            goto L_0x0093
        L_0x0083:
            if (r15 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r3
            r23 = r5
            r3 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r3
            r3 = r23
            r23 = r5
        L_0x0093:
            androidx.constraintlayout.solver.widgets.e r5 = r6.f1855d
            if (r5 == 0) goto L_0x00bc
            if (r8 != r12) goto L_0x00a6
            r25 = r15
            e.f.b.i r15 = r6.f1860i
            e.f.b.i r5 = r5.f1860i
            r26 = r2
            r2 = 5
            r9.mo19712b(r15, r5, r7, r2)
            goto L_0x00b2
        L_0x00a6:
            r26 = r2
            r25 = r15
            e.f.b.i r2 = r6.f1860i
            e.f.b.i r5 = r5.f1860i
            r15 = 6
            r9.mo19712b(r2, r5, r7, r15)
        L_0x00b2:
            e.f.b.i r2 = r6.f1860i
            androidx.constraintlayout.solver.widgets.e r5 = r6.f1855d
            e.f.b.i r5 = r5.f1860i
            r9.mo19698a(r2, r5, r7, r3)
            goto L_0x00c0
        L_0x00bc:
            r26 = r2
            r25 = r15
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r8.mo2620z()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            androidx.constraintlayout.solver.widgets.f$b[] r2 = r8.f1899L
            r2 = r2[r38]
            androidx.constraintlayout.solver.widgets.f$b r3 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e4
            androidx.constraintlayout.solver.widgets.e[] r2 = r8.f1897J
            int r3 = r39 + 1
            r3 = r2[r3]
            e.f.b.i r3 = r3.f1860i
            r2 = r2[r39]
            e.f.b.i r2 = r2.f1860i
            r5 = 5
            r6 = 0
            r9.mo19712b(r3, r2, r6, r5)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            androidx.constraintlayout.solver.widgets.e[] r2 = r8.f1897J
            r2 = r2[r39]
            e.f.b.i r2 = r2.f1860i
            androidx.constraintlayout.solver.widgets.e[] r3 = r0.f1897J
            r3 = r3[r39]
            e.f.b.i r3 = r3.f1860i
            r5 = 6
            r9.mo19712b(r2, r3, r6, r5)
        L_0x00f5:
            androidx.constraintlayout.solver.widgets.e[] r2 = r8.f1897J
            int r3 = r39 + 1
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.e r2 = r2.f1855d
            if (r2 == 0) goto L_0x0114
            androidx.constraintlayout.solver.widgets.f r2 = r2.f1853b
            androidx.constraintlayout.solver.widgets.e[] r3 = r2.f1897J
            r5 = r3[r39]
            androidx.constraintlayout.solver.widgets.e r5 = r5.f1855d
            if (r5 == 0) goto L_0x0114
            r3 = r3[r39]
            androidx.constraintlayout.solver.widgets.e r3 = r3.f1855d
            androidx.constraintlayout.solver.widgets.f r3 = r3.f1853b
            if (r3 == r8) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r8 = r21
            r5 = r23
            goto L_0x011c
        L_0x011b:
            r5 = 1
        L_0x011c:
            r3 = r24
            r15 = r25
            r2 = r26
            goto L_0x0053
        L_0x0124:
            r26 = r2
            r24 = r3
            r25 = r15
            if (r13 == 0) goto L_0x014b
            androidx.constraintlayout.solver.widgets.e[] r2 = r11.f1897J
            int r3 = r39 + 1
            r5 = r2[r3]
            androidx.constraintlayout.solver.widgets.e r5 = r5.f1855d
            if (r5 == 0) goto L_0x014b
            androidx.constraintlayout.solver.widgets.e[] r5 = r13.f1897J
            r5 = r5[r3]
            e.f.b.i r6 = r5.f1860i
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.e r2 = r2.f1855d
            e.f.b.i r2 = r2.f1860i
            int r3 = r5.mo2514b()
            int r3 = -r3
            r5 = 5
            r9.mo19715c(r6, r2, r3, r5)
        L_0x014b:
            if (r4 == 0) goto L_0x0165
            androidx.constraintlayout.solver.widgets.e[] r0 = r0.f1897J
            int r2 = r39 + 1
            r0 = r0[r2]
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.e[] r3 = r11.f1897J
            r4 = r3[r2]
            e.f.b.i r4 = r4.f1860i
            r2 = r3[r2]
            int r2 = r2.mo2514b()
            r3 = 6
            r9.mo19712b(r0, r4, r2, r3)
        L_0x0165:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r0 = r1.f1838h
            if (r0 == 0) goto L_0x0216
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0216
            boolean r4 = r1.f1848r
            if (r4 == 0) goto L_0x017c
            boolean r4 = r1.f1850t
            if (r4 != 0) goto L_0x017c
            int r4 = r1.f1840j
            float r4 = (float) r4
            goto L_0x017e
        L_0x017c:
            r4 = r24
        L_0x017e:
            r5 = 0
            r7 = r21
            r6 = 0
            r28 = 0
        L_0x0184:
            if (r6 >= r2) goto L_0x0216
            java.lang.Object r8 = r0.get(r6)
            androidx.constraintlayout.solver.widgets.f r8 = (androidx.constraintlayout.solver.widgets.C0444f) r8
            float[] r15 = r8.f1887D0
            r15 = r15[r38]
            int r17 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r17 >= 0) goto L_0x01b2
            boolean r15 = r1.f1850t
            if (r15 == 0) goto L_0x01ab
            androidx.constraintlayout.solver.widgets.e[] r8 = r8.f1897J
            int r15 = r39 + 1
            r15 = r8[r15]
            e.f.b.i r15 = r15.f1860i
            r8 = r8[r39]
            e.f.b.i r8 = r8.f1860i
            r3 = 0
            r5 = 4
            r9.mo19698a(r15, r8, r3, r5)
            r5 = 6
            goto L_0x01c9
        L_0x01ab:
            r5 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01b4
        L_0x01b2:
            r5 = 4
            r3 = 0
        L_0x01b4:
            int r22 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r22 != 0) goto L_0x01ce
            androidx.constraintlayout.solver.widgets.e[] r8 = r8.f1897J
            int r15 = r39 + 1
            r15 = r8[r15]
            e.f.b.i r15 = r15.f1860i
            r8 = r8[r39]
            e.f.b.i r8 = r8.f1860i
            r3 = 0
            r5 = 6
            r9.mo19698a(r15, r8, r3, r5)
        L_0x01c9:
            r24 = r0
            r20 = r2
            goto L_0x020c
        L_0x01ce:
            r3 = 0
            r5 = 6
            if (r7 == 0) goto L_0x0205
            androidx.constraintlayout.solver.widgets.e[] r7 = r7.f1897J
            r3 = r7[r39]
            e.f.b.i r3 = r3.f1860i
            int r20 = r39 + 1
            r7 = r7[r20]
            e.f.b.i r7 = r7.f1860i
            androidx.constraintlayout.solver.widgets.e[] r5 = r8.f1897J
            r24 = r0
            r0 = r5[r39]
            e.f.b.i r0 = r0.f1860i
            r5 = r5[r20]
            e.f.b.i r5 = r5.f1860i
            r20 = r2
            e.f.b.b r2 = r37.mo19711b()
            r27 = r2
            r29 = r4
            r30 = r15
            r31 = r3
            r32 = r7
            r33 = r0
            r34 = r5
            r27.mo19671a(r28, r29, r30, r31, r32, r33, r34)
            r9.mo19703a(r2)
            goto L_0x0209
        L_0x0205:
            r24 = r0
            r20 = r2
        L_0x0209:
            r7 = r8
            r28 = r15
        L_0x020c:
            int r6 = r6 + 1
            r2 = r20
            r0 = r24
            r3 = 1
            r5 = 0
            goto L_0x0184
        L_0x0216:
            if (r12 == 0) goto L_0x0278
            if (r12 == r13) goto L_0x021c
            if (r14 == 0) goto L_0x0278
        L_0x021c:
            androidx.constraintlayout.solver.widgets.e[] r0 = r10.f1897J
            r1 = r0[r39]
            androidx.constraintlayout.solver.widgets.e[] r2 = r11.f1897J
            int r3 = r39 + 1
            r2 = r2[r3]
            r4 = r0[r39]
            androidx.constraintlayout.solver.widgets.e r4 = r4.f1855d
            if (r4 == 0) goto L_0x0234
            r0 = r0[r39]
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
            e.f.b.i r0 = r0.f1860i
            r4 = r0
            goto L_0x0236
        L_0x0234:
            r4 = r21
        L_0x0236:
            androidx.constraintlayout.solver.widgets.e[] r0 = r11.f1897J
            r5 = r0[r3]
            androidx.constraintlayout.solver.widgets.e r5 = r5.f1855d
            if (r5 == 0) goto L_0x0246
            r0 = r0[r3]
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
            e.f.b.i r0 = r0.f1860i
            r5 = r0
            goto L_0x0248
        L_0x0246:
            r5 = r21
        L_0x0248:
            if (r12 != r13) goto L_0x0250
            androidx.constraintlayout.solver.widgets.e[] r0 = r12.f1897J
            r1 = r0[r39]
            r2 = r0[r3]
        L_0x0250:
            if (r4 == 0) goto L_0x049d
            if (r5 == 0) goto L_0x049d
            if (r38 != 0) goto L_0x025b
            r0 = r26
            float r0 = r0.f1927g0
            goto L_0x025f
        L_0x025b:
            r0 = r26
            float r0 = r0.f1929h0
        L_0x025f:
            r6 = r0
            int r3 = r1.mo2514b()
            int r7 = r2.mo2514b()
            e.f.b.i r1 = r1.f1860i
            e.f.b.i r8 = r2.f1860i
            r10 = 5
            r0 = r37
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.mo19707a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x049d
        L_0x0278:
            if (r25 == 0) goto L_0x0370
            if (r12 == 0) goto L_0x0370
            int r0 = r1.f1840j
            if (r0 <= 0) goto L_0x0287
            int r1 = r1.f1839i
            if (r1 != r0) goto L_0x0287
            r17 = 1
            goto L_0x0289
        L_0x0287:
            r17 = 0
        L_0x0289:
            r14 = r12
            r15 = r14
        L_0x028b:
            if (r14 == 0) goto L_0x049d
            androidx.constraintlayout.solver.widgets.f[] r0 = r14.f1891F0
            r0 = r0[r38]
            r8 = r0
        L_0x0292:
            if (r8 == 0) goto L_0x02a1
            int r0 = r8.mo2620z()
            r6 = 8
            if (r0 != r6) goto L_0x02a3
            androidx.constraintlayout.solver.widgets.f[] r0 = r8.f1891F0
            r8 = r0[r38]
            goto L_0x0292
        L_0x02a1:
            r6 = 8
        L_0x02a3:
            if (r8 != 0) goto L_0x02ae
            if (r14 != r13) goto L_0x02a8
            goto L_0x02ae
        L_0x02a8:
            r18 = r8
            r19 = 6
            goto L_0x0363
        L_0x02ae:
            androidx.constraintlayout.solver.widgets.e[] r0 = r14.f1897J
            r0 = r0[r39]
            e.f.b.i r1 = r0.f1860i
            androidx.constraintlayout.solver.widgets.e r2 = r0.f1855d
            if (r2 == 0) goto L_0x02bb
            e.f.b.i r2 = r2.f1860i
            goto L_0x02bd
        L_0x02bb:
            r2 = r21
        L_0x02bd:
            if (r15 == r14) goto L_0x02c8
            androidx.constraintlayout.solver.widgets.e[] r2 = r15.f1897J
            int r3 = r39 + 1
            r2 = r2[r3]
            e.f.b.i r2 = r2.f1860i
            goto L_0x02dd
        L_0x02c8:
            if (r14 != r12) goto L_0x02dd
            if (r15 != r14) goto L_0x02dd
            androidx.constraintlayout.solver.widgets.e[] r2 = r10.f1897J
            r3 = r2[r39]
            androidx.constraintlayout.solver.widgets.e r3 = r3.f1855d
            if (r3 == 0) goto L_0x02db
            r2 = r2[r39]
            androidx.constraintlayout.solver.widgets.e r2 = r2.f1855d
            e.f.b.i r2 = r2.f1860i
            goto L_0x02dd
        L_0x02db:
            r2 = r21
        L_0x02dd:
            int r0 = r0.mo2514b()
            androidx.constraintlayout.solver.widgets.e[] r3 = r14.f1897J
            int r4 = r39 + 1
            r3 = r3[r4]
            int r3 = r3.mo2514b()
            if (r8 == 0) goto L_0x02ff
            androidx.constraintlayout.solver.widgets.e[] r5 = r8.f1897J
            r5 = r5[r39]
            e.f.b.i r7 = r5.f1860i
            androidx.constraintlayout.solver.widgets.e[] r6 = r14.f1897J
            r6 = r6[r4]
            e.f.b.i r6 = r6.f1860i
            r35 = r7
            r7 = r6
            r6 = r35
            goto L_0x0312
        L_0x02ff:
            androidx.constraintlayout.solver.widgets.e[] r5 = r11.f1897J
            r5 = r5[r4]
            androidx.constraintlayout.solver.widgets.e r5 = r5.f1855d
            if (r5 == 0) goto L_0x030a
            e.f.b.i r6 = r5.f1860i
            goto L_0x030c
        L_0x030a:
            r6 = r21
        L_0x030c:
            androidx.constraintlayout.solver.widgets.e[] r7 = r14.f1897J
            r7 = r7[r4]
            e.f.b.i r7 = r7.f1860i
        L_0x0312:
            if (r5 == 0) goto L_0x0319
            int r5 = r5.mo2514b()
            int r3 = r3 + r5
        L_0x0319:
            if (r15 == 0) goto L_0x0324
            androidx.constraintlayout.solver.widgets.e[] r5 = r15.f1897J
            r5 = r5[r4]
            int r5 = r5.mo2514b()
            int r0 = r0 + r5
        L_0x0324:
            if (r1 == 0) goto L_0x02a8
            if (r2 == 0) goto L_0x02a8
            if (r6 == 0) goto L_0x02a8
            if (r7 == 0) goto L_0x02a8
            if (r14 != r12) goto L_0x0336
            androidx.constraintlayout.solver.widgets.e[] r0 = r12.f1897J
            r0 = r0[r39]
            int r0 = r0.mo2514b()
        L_0x0336:
            r5 = r0
            if (r14 != r13) goto L_0x0344
            androidx.constraintlayout.solver.widgets.e[] r0 = r13.f1897J
            r0 = r0[r4]
            int r0 = r0.mo2514b()
            r18 = r0
            goto L_0x0346
        L_0x0344:
            r18 = r3
        L_0x0346:
            if (r17 == 0) goto L_0x034b
            r20 = 6
            goto L_0x034d
        L_0x034b:
            r20 = 4
        L_0x034d:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r3 = r5
            r22 = 6
            r23 = 4
            r5 = r6
            r19 = 6
            r6 = r7
            r7 = r18
            r18 = r8
            r8 = r20
            r0.mo19707a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0363:
            int r0 = r14.mo2620z()
            r8 = 8
            if (r0 == r8) goto L_0x036c
            r15 = r14
        L_0x036c:
            r14 = r18
            goto L_0x028b
        L_0x0370:
            r8 = 8
            r19 = 6
            if (r16 == 0) goto L_0x049d
            if (r12 == 0) goto L_0x049d
            int r0 = r1.f1840j
            if (r0 <= 0) goto L_0x0383
            int r1 = r1.f1839i
            if (r1 != r0) goto L_0x0383
            r17 = 1
            goto L_0x0385
        L_0x0383:
            r17 = 0
        L_0x0385:
            r14 = r12
            r15 = r14
        L_0x0387:
            if (r14 == 0) goto L_0x043f
            androidx.constraintlayout.solver.widgets.f[] r0 = r14.f1891F0
            r0 = r0[r38]
        L_0x038d:
            if (r0 == 0) goto L_0x039a
            int r1 = r0.mo2620z()
            if (r1 != r8) goto L_0x039a
            androidx.constraintlayout.solver.widgets.f[] r0 = r0.f1891F0
            r0 = r0[r38]
            goto L_0x038d
        L_0x039a:
            if (r14 == r12) goto L_0x042c
            if (r14 == r13) goto L_0x042c
            if (r0 == 0) goto L_0x042c
            if (r0 != r13) goto L_0x03a5
            r7 = r21
            goto L_0x03a6
        L_0x03a5:
            r7 = r0
        L_0x03a6:
            androidx.constraintlayout.solver.widgets.e[] r0 = r14.f1897J
            r0 = r0[r39]
            e.f.b.i r1 = r0.f1860i
            androidx.constraintlayout.solver.widgets.e r2 = r0.f1855d
            if (r2 == 0) goto L_0x03b2
            e.f.b.i r2 = r2.f1860i
        L_0x03b2:
            androidx.constraintlayout.solver.widgets.e[] r2 = r15.f1897J
            int r3 = r39 + 1
            r2 = r2[r3]
            e.f.b.i r2 = r2.f1860i
            int r0 = r0.mo2514b()
            androidx.constraintlayout.solver.widgets.e[] r4 = r14.f1897J
            r4 = r4[r3]
            int r4 = r4.mo2514b()
            if (r7 == 0) goto L_0x03d8
            androidx.constraintlayout.solver.widgets.e[] r5 = r7.f1897J
            r5 = r5[r39]
            e.f.b.i r6 = r5.f1860i
            androidx.constraintlayout.solver.widgets.e r8 = r5.f1855d
            if (r8 == 0) goto L_0x03d5
            e.f.b.i r8 = r8.f1860i
            goto L_0x03eb
        L_0x03d5:
            r8 = r21
            goto L_0x03eb
        L_0x03d8:
            androidx.constraintlayout.solver.widgets.e[] r5 = r14.f1897J
            r5 = r5[r3]
            androidx.constraintlayout.solver.widgets.e r5 = r5.f1855d
            if (r5 == 0) goto L_0x03e3
            e.f.b.i r6 = r5.f1860i
            goto L_0x03e5
        L_0x03e3:
            r6 = r21
        L_0x03e5:
            androidx.constraintlayout.solver.widgets.e[] r8 = r14.f1897J
            r8 = r8[r3]
            e.f.b.i r8 = r8.f1860i
        L_0x03eb:
            if (r5 == 0) goto L_0x03f2
            int r5 = r5.mo2514b()
            int r4 = r4 + r5
        L_0x03f2:
            r18 = r4
            if (r15 == 0) goto L_0x03ff
            androidx.constraintlayout.solver.widgets.e[] r4 = r15.f1897J
            r3 = r4[r3]
            int r3 = r3.mo2514b()
            int r0 = r0 + r3
        L_0x03ff:
            r3 = r0
            if (r17 == 0) goto L_0x0405
            r20 = 6
            goto L_0x0407
        L_0x0405:
            r20 = 4
        L_0x0407:
            if (r1 == 0) goto L_0x0423
            if (r2 == 0) goto L_0x0423
            if (r6 == 0) goto L_0x0423
            if (r8 == 0) goto L_0x0423
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r5 = r6
            r6 = r8
            r22 = r7
            r7 = r18
            r18 = r15
            r15 = 8
            r8 = r20
            r0.mo19707a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0429
        L_0x0423:
            r22 = r7
            r18 = r15
            r15 = 8
        L_0x0429:
            r0 = r22
            goto L_0x0430
        L_0x042c:
            r18 = r15
            r15 = 8
        L_0x0430:
            int r1 = r14.mo2620z()
            if (r1 == r15) goto L_0x0437
            goto L_0x0439
        L_0x0437:
            r14 = r18
        L_0x0439:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x0387
        L_0x043f:
            androidx.constraintlayout.solver.widgets.e[] r0 = r12.f1897J
            r0 = r0[r39]
            androidx.constraintlayout.solver.widgets.e[] r1 = r10.f1897J
            r1 = r1[r39]
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1855d
            androidx.constraintlayout.solver.widgets.e[] r2 = r13.f1897J
            int r3 = r39 + 1
            r10 = r2[r3]
            androidx.constraintlayout.solver.widgets.e[] r2 = r11.f1897J
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.e r14 = r2.f1855d
            if (r1 == 0) goto L_0x048c
            if (r12 == r13) goto L_0x0466
            e.f.b.i r2 = r0.f1860i
            e.f.b.i r1 = r1.f1860i
            int r0 = r0.mo2514b()
            r15 = 4
            r9.mo19698a(r2, r1, r0, r15)
            goto L_0x048d
        L_0x0466:
            r15 = 4
            if (r14 == 0) goto L_0x048d
            e.f.b.i r2 = r0.f1860i
            e.f.b.i r3 = r1.f1860i
            int r4 = r0.mo2514b()
            r5 = 1056964608(0x3f000000, float:0.5)
            e.f.b.i r6 = r10.f1860i
            e.f.b.i r7 = r14.f1860i
            int r8 = r10.mo2514b()
            r17 = 4
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.mo19707a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x048d
        L_0x048c:
            r15 = 4
        L_0x048d:
            if (r14 == 0) goto L_0x049d
            if (r12 == r13) goto L_0x049d
            e.f.b.i r0 = r10.f1860i
            e.f.b.i r1 = r14.f1860i
            int r2 = r10.mo2514b()
            int r2 = -r2
            r9.mo19698a(r0, r1, r2, r15)
        L_0x049d:
            if (r25 != 0) goto L_0x04a1
            if (r16 == 0) goto L_0x0501
        L_0x04a1:
            if (r12 == 0) goto L_0x0501
            androidx.constraintlayout.solver.widgets.e[] r0 = r12.f1897J
            r0 = r0[r39]
            androidx.constraintlayout.solver.widgets.e[] r1 = r13.f1897J
            int r2 = r39 + 1
            r1 = r1[r2]
            androidx.constraintlayout.solver.widgets.e r3 = r0.f1855d
            if (r3 == 0) goto L_0x04b4
            e.f.b.i r3 = r3.f1860i
            goto L_0x04b6
        L_0x04b4:
            r3 = r21
        L_0x04b6:
            androidx.constraintlayout.solver.widgets.e r4 = r1.f1855d
            if (r4 == 0) goto L_0x04bd
            e.f.b.i r4 = r4.f1860i
            goto L_0x04bf
        L_0x04bd:
            r4 = r21
        L_0x04bf:
            if (r11 == r13) goto L_0x04ce
            androidx.constraintlayout.solver.widgets.e[] r4 = r11.f1897J
            r4 = r4[r2]
            androidx.constraintlayout.solver.widgets.e r4 = r4.f1855d
            if (r4 == 0) goto L_0x04cc
            e.f.b.i r4 = r4.f1860i
            goto L_0x04ce
        L_0x04cc:
            r4 = r21
        L_0x04ce:
            r5 = r4
            if (r12 != r13) goto L_0x04dc
            androidx.constraintlayout.solver.widgets.e[] r0 = r12.f1897J
            r1 = r0[r39]
            r0 = r0[r2]
            r35 = r1
            r1 = r0
            r0 = r35
        L_0x04dc:
            if (r3 == 0) goto L_0x0501
            if (r5 == 0) goto L_0x0501
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.mo2514b()
            if (r13 != 0) goto L_0x04e9
            goto L_0x04ea
        L_0x04e9:
            r11 = r13
        L_0x04ea:
            androidx.constraintlayout.solver.widgets.e[] r7 = r11.f1897J
            r2 = r7[r2]
            int r7 = r2.mo2514b()
            e.f.b.i r2 = r0.f1860i
            e.f.b.i r8 = r1.f1860i
            r10 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo19707a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0501:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0437c.m1913a(androidx.constraintlayout.solver.widgets.g, e.f.b.e, int, int, androidx.constraintlayout.solver.widgets.d):void");
    }
}

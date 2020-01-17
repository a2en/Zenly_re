package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import p214e.p229f.p232b.C7600e;

/* renamed from: androidx.constraintlayout.solver.widgets.l */
public class C0454l {

    /* renamed from: a */
    static boolean[] f2037a = new boolean[3];

    /* renamed from: a */
    static void m2105a(C0447g gVar, C7600e eVar, C0444f fVar) {
        fVar.f1926g = -1;
        fVar.f1928h = -1;
        if (gVar.f1899L[0] != C0446b.WRAP_CONTENT && fVar.f1899L[0] == C0446b.MATCH_PARENT) {
            int i = fVar.f1882B.f1856e;
            int A = gVar.mo2525A() - fVar.f1886D.f1856e;
            C0439e eVar2 = fVar.f1882B;
            eVar2.f1860i = eVar.mo19701a((Object) eVar2);
            C0439e eVar3 = fVar.f1886D;
            eVar3.f1860i = eVar.mo19701a((Object) eVar3);
            eVar.mo19706a(fVar.f1882B.f1860i, i);
            eVar.mo19706a(fVar.f1886D.f1860i, A);
            fVar.f1926g = 2;
            fVar.mo2541a(i, A);
        }
        if (gVar.f1899L[1] != C0446b.WRAP_CONTENT && fVar.f1899L[1] == C0446b.MATCH_PARENT) {
            int i2 = fVar.f1884C.f1856e;
            int k = gVar.mo2589k() - fVar.f1888E.f1856e;
            C0439e eVar4 = fVar.f1884C;
            eVar4.f1860i = eVar.mo19701a((Object) eVar4);
            C0439e eVar5 = fVar.f1888E;
            eVar5.f1860i = eVar.mo19701a((Object) eVar5);
            eVar.mo19706a(fVar.f1884C.f1860i, i2);
            eVar.mo19706a(fVar.f1888E.f1860i, k);
            if (fVar.f1917b0 > 0 || fVar.mo2620z() == 8) {
                C0439e eVar6 = fVar.f1890F;
                eVar6.f1860i = eVar.mo19701a((Object) eVar6);
                eVar.mo19706a(fVar.f1890F.f1860i, fVar.f1917b0 + i2);
            }
            fVar.f1928h = 2;
            fVar.mo2576d(i2, k);
        }
    }

    /* renamed from: a */
    public static final boolean m2106a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: b */
    static void m2110b(C0444f fVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        fVar.f1897J[i3].mo2517e().f2041f = fVar.mo2601q().f1897J[i3].mo2517e();
        fVar.f1897J[i3].mo2517e().f2042g = (float) i2;
        fVar.f1897J[i3].mo2517e().f2051b = 1;
        fVar.f1897J[i4].mo2517e().f2041f = fVar.mo2601q().f1897J[i3].mo2517e();
        fVar.f1897J[i4].mo2517e().f2042g = (float) (fVar.mo2574d(i) + i2);
        fVar.f1897J[i4].mo2517e().f2051b = 1;
    }

    /* renamed from: a */
    private static boolean m2107a(C0444f fVar, int i) {
        if (fVar.f1899L[i] != C0446b.MATCH_CONSTRAINT) {
            return false;
        }
        if (i == 0) {
            if (!(fVar.f1934k == 0 && fVar.f1940n == 0 && fVar.f1942o == 0)) {
                return false;
            }
        } else if (!(fVar.f1936l == 0 && fVar.f1946q == 0 && fVar.f1948r == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m2108a(C0444f fVar, int i, int i2) {
        if (fVar.f1903P != 0.0f) {
            if (fVar.f1899L[i == 0 ? (char) 1 : 0] != C0446b.MATCH_CONSTRAINT && (i2 & 16) == 16) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m2104a(int i, C0444f fVar) {
        int i2 = i;
        C0444f fVar2 = fVar;
        fVar.mo2538P();
        C0456n e = fVar2.f1882B.mo2517e();
        C0456n e2 = fVar2.f1884C.mo2517e();
        C0456n e3 = fVar2.f1886D.mo2517e();
        C0456n e4 = fVar2.f1888E.mo2517e();
        boolean z = false;
        boolean z2 = (i2 & 8) == 8;
        boolean z3 = fVar2.f1899L[0] == C0446b.MATCH_CONSTRAINT && m2107a(fVar2, 0);
        if (!(e.f2043h == 4 || e3.f2043h == 4)) {
            if (fVar2.f1899L[0] == C0446b.FIXED || (z3 && fVar.mo2620z() == 8)) {
                if (fVar2.f1882B.f1855d == null && fVar2.f1886D.f1855d == null) {
                    e.mo2658b(1);
                    e3.mo2658b(1);
                    if (z2) {
                        e3.mo2656a(e, 1, fVar.mo2605s());
                    } else {
                        e3.mo2655a(e, fVar.mo2525A());
                    }
                } else if (fVar2.f1882B.f1855d != null && fVar2.f1886D.f1855d == null) {
                    e.mo2658b(1);
                    e3.mo2658b(1);
                    if (z2) {
                        e3.mo2656a(e, 1, fVar.mo2605s());
                    } else {
                        e3.mo2655a(e, fVar.mo2525A());
                    }
                } else if (fVar2.f1882B.f1855d == null && fVar2.f1886D.f1855d != null) {
                    e.mo2658b(1);
                    e3.mo2658b(1);
                    e.mo2655a(e3, -fVar.mo2525A());
                    if (z2) {
                        e.mo2656a(e3, -1, fVar.mo2605s());
                    } else {
                        e.mo2655a(e3, -fVar.mo2525A());
                    }
                } else if (!(fVar2.f1882B.f1855d == null || fVar2.f1886D.f1855d == null)) {
                    e.mo2658b(2);
                    e3.mo2658b(2);
                    if (z2) {
                        fVar.mo2605s().mo2666a(e);
                        fVar.mo2605s().mo2666a(e3);
                        e.mo2660b(e3, -1, fVar.mo2605s());
                        e3.mo2660b(e, 1, fVar.mo2605s());
                    } else {
                        e.mo2659b(e3, (float) (-fVar.mo2525A()));
                        e3.mo2659b(e, (float) fVar.mo2525A());
                    }
                }
            } else if (z3 && m2108a(fVar2, 0, i2)) {
                C0418a.m1832a(fVar);
                int A = fVar.mo2525A();
                e.mo2658b(1);
                e3.mo2658b(1);
                if (fVar2.f1882B.f1855d == null && fVar2.f1886D.f1855d == null) {
                    if (z2) {
                        e3.mo2656a(e, 1, fVar.mo2605s());
                    } else {
                        e3.mo2655a(e, A);
                    }
                } else if (fVar2.f1882B.f1855d == null || fVar2.f1886D.f1855d != null) {
                    if (fVar2.f1882B.f1855d != null || fVar2.f1886D.f1855d == null) {
                        if (!(fVar2.f1882B.f1855d == null || fVar2.f1886D.f1855d == null)) {
                            if (z2) {
                                fVar.mo2605s().mo2666a(e);
                                fVar.mo2605s().mo2666a(e3);
                            }
                            if (fVar2.f1903P == 0.0f) {
                                e.mo2658b(3);
                                e3.mo2658b(3);
                                e.mo2659b(e3, 0.0f);
                                e3.mo2659b(e, 0.0f);
                            } else {
                                e.mo2658b(2);
                                e3.mo2658b(2);
                                e.mo2659b(e3, (float) (-A));
                                e3.mo2659b(e, (float) A);
                                fVar2.mo2611u(A);
                            }
                        }
                    } else if (z2) {
                        e.mo2656a(e3, -1, fVar.mo2605s());
                    } else {
                        e.mo2655a(e3, -A);
                    }
                } else if (z2) {
                    e3.mo2656a(e, 1, fVar.mo2605s());
                } else {
                    e3.mo2655a(e, A);
                }
            }
        }
        if (fVar2.f1899L[1] == C0446b.MATCH_CONSTRAINT && m2107a(fVar2, 1)) {
            z = true;
        }
        if (e2.f2043h != 4 && e4.f2043h != 4) {
            if (fVar2.f1899L[1] == C0446b.FIXED || (z && fVar.mo2620z() == 8)) {
                if (fVar2.f1884C.f1855d == null && fVar2.f1888E.f1855d == null) {
                    e2.mo2658b(1);
                    e4.mo2658b(1);
                    if (z2) {
                        e4.mo2656a(e2, 1, fVar.mo2603r());
                    } else {
                        e4.mo2655a(e2, fVar.mo2589k());
                    }
                    C0439e eVar = fVar2.f1890F;
                    if (eVar.f1855d != null) {
                        eVar.mo2517e().mo2658b(1);
                        e2.mo2653a(1, fVar2.f1890F.mo2517e(), -fVar2.f1917b0);
                    }
                } else if (fVar2.f1884C.f1855d != null && fVar2.f1888E.f1855d == null) {
                    e2.mo2658b(1);
                    e4.mo2658b(1);
                    if (z2) {
                        e4.mo2656a(e2, 1, fVar.mo2603r());
                    } else {
                        e4.mo2655a(e2, fVar.mo2589k());
                    }
                    if (fVar2.f1917b0 > 0) {
                        fVar2.f1890F.mo2517e().mo2653a(1, e2, fVar2.f1917b0);
                    }
                } else if (fVar2.f1884C.f1855d == null && fVar2.f1888E.f1855d != null) {
                    e2.mo2658b(1);
                    e4.mo2658b(1);
                    if (z2) {
                        e2.mo2656a(e4, -1, fVar.mo2603r());
                    } else {
                        e2.mo2655a(e4, -fVar.mo2589k());
                    }
                    if (fVar2.f1917b0 > 0) {
                        fVar2.f1890F.mo2517e().mo2653a(1, e2, fVar2.f1917b0);
                    }
                } else if (fVar2.f1884C.f1855d != null && fVar2.f1888E.f1855d != null) {
                    e2.mo2658b(2);
                    e4.mo2658b(2);
                    if (z2) {
                        e2.mo2660b(e4, -1, fVar.mo2603r());
                        e4.mo2660b(e2, 1, fVar.mo2603r());
                        fVar.mo2603r().mo2666a(e2);
                        fVar.mo2605s().mo2666a(e4);
                    } else {
                        e2.mo2659b(e4, (float) (-fVar.mo2589k()));
                        e4.mo2659b(e2, (float) fVar.mo2589k());
                    }
                    if (fVar2.f1917b0 > 0) {
                        fVar2.f1890F.mo2517e().mo2653a(1, e2, fVar2.f1917b0);
                    }
                }
            } else if (z && m2108a(fVar2, 1, i2)) {
                C0418a.m1832a(fVar);
                int k = fVar.mo2589k();
                e2.mo2658b(1);
                e4.mo2658b(1);
                if (fVar2.f1884C.f1855d == null && fVar2.f1888E.f1855d == null) {
                    if (z2) {
                        e4.mo2656a(e2, 1, fVar.mo2603r());
                    } else {
                        e4.mo2655a(e2, k);
                    }
                } else if (fVar2.f1884C.f1855d == null || fVar2.f1888E.f1855d != null) {
                    if (fVar2.f1884C.f1855d != null || fVar2.f1888E.f1855d == null) {
                        if (fVar2.f1884C.f1855d != null && fVar2.f1888E.f1855d != null) {
                            if (z2) {
                                fVar.mo2603r().mo2666a(e2);
                                fVar.mo2605s().mo2666a(e4);
                            }
                            if (fVar2.f1903P == 0.0f) {
                                e2.mo2658b(3);
                                e4.mo2658b(3);
                                e2.mo2659b(e4, 0.0f);
                                e4.mo2659b(e2, 0.0f);
                                return;
                            }
                            e2.mo2658b(2);
                            e4.mo2658b(2);
                            e2.mo2659b(e4, (float) (-k));
                            e4.mo2659b(e2, (float) k);
                            fVar2.mo2594m(k);
                            if (fVar2.f1917b0 > 0) {
                                fVar2.f1890F.mo2517e().mo2653a(1, e2, fVar2.f1917b0);
                            }
                        }
                    } else if (z2) {
                        e2.mo2656a(e4, -1, fVar.mo2603r());
                    } else {
                        e2.mo2655a(e4, -k);
                    }
                } else if (z2) {
                    e4.mo2656a(e2, 1, fVar.mo2603r());
                } else {
                    e4.mo2655a(e2, k);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r7.f1965z0 == 2) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r7.f1881A0 == 2) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m2109a(androidx.constraintlayout.solver.widgets.C0447g r20, p214e.p229f.p232b.C7600e r21, int r22, int r23, androidx.constraintlayout.solver.widgets.C0438d r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r24
            androidx.constraintlayout.solver.widgets.f r3 = r2.f1831a
            androidx.constraintlayout.solver.widgets.f r4 = r2.f1833c
            androidx.constraintlayout.solver.widgets.f r5 = r2.f1832b
            androidx.constraintlayout.solver.widgets.f r6 = r2.f1834d
            androidx.constraintlayout.solver.widgets.f r7 = r2.f1835e
            int r8 = r2.f1840j
            float r9 = r2.f1841k
            androidx.constraintlayout.solver.widgets.f r10 = r2.f1836f
            androidx.constraintlayout.solver.widgets.f r10 = r2.f1837g
            r11 = r20
            androidx.constraintlayout.solver.widgets.f$b[] r10 = r11.f1899L
            r10 = r10[r1]
            androidx.constraintlayout.solver.widgets.f$b r11 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            int r10 = r2.f1843m
            float r10 = (float) r10
            int r11 = r2.f1844n
            int r11 = r2.f1842l
            boolean r2 = r2.f1845o
            r12 = 0
            if (r2 != 0) goto L_0x002d
            return r12
        L_0x002d:
            r2 = 2
            r13 = 1
            if (r1 != 0) goto L_0x0047
            int r14 = r7.f1965z0
            if (r14 != 0) goto L_0x0037
            r14 = 1
            goto L_0x0038
        L_0x0037:
            r14 = 0
        L_0x0038:
            int r15 = r7.f1965z0
            if (r15 != r13) goto L_0x003e
            r15 = 1
            goto L_0x003f
        L_0x003e:
            r15 = 0
        L_0x003f:
            int r7 = r7.f1965z0
            if (r7 != r2) goto L_0x0045
        L_0x0043:
            r2 = 1
            goto L_0x005a
        L_0x0045:
            r2 = 0
            goto L_0x005a
        L_0x0047:
            int r14 = r7.f1881A0
            if (r14 != 0) goto L_0x004d
            r14 = 1
            goto L_0x004e
        L_0x004d:
            r14 = 0
        L_0x004e:
            int r15 = r7.f1881A0
            if (r15 != r13) goto L_0x0054
            r15 = 1
            goto L_0x0055
        L_0x0054:
            r15 = 0
        L_0x0055:
            int r7 = r7.f1881A0
            if (r7 != r2) goto L_0x0045
            goto L_0x0043
        L_0x005a:
            androidx.constraintlayout.solver.widgets.e[] r7 = r3.f1897J
            r7 = r7[r23]
            androidx.constraintlayout.solver.widgets.n r7 = r7.mo2517e()
            androidx.constraintlayout.solver.widgets.e[] r12 = r4.f1897J
            int r16 = r23 + 1
            r12 = r12[r16]
            androidx.constraintlayout.solver.widgets.n r12 = r12.mo2517e()
            androidx.constraintlayout.solver.widgets.n r13 = r7.f2039d
            if (r13 == 0) goto L_0x02db
            r17 = r11
            androidx.constraintlayout.solver.widgets.n r11 = r12.f2039d
            if (r11 != 0) goto L_0x0078
            goto L_0x02db
        L_0x0078:
            int r13 = r13.f2051b
            r0 = 1
            if (r13 != r0) goto L_0x02d9
            int r11 = r11.f2051b
            if (r11 == r0) goto L_0x0083
            goto L_0x02d9
        L_0x0083:
            r0 = 0
            if (r2 != 0) goto L_0x008d
            if (r14 != 0) goto L_0x008d
            if (r15 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r11 = 0
            goto L_0x00a6
        L_0x008d:
            if (r5 == 0) goto L_0x0099
            androidx.constraintlayout.solver.widgets.e[] r11 = r5.f1897J
            r11 = r11[r23]
            int r11 = r11.mo2514b()
            float r11 = (float) r11
            goto L_0x009a
        L_0x0099:
            r11 = 0
        L_0x009a:
            if (r6 == 0) goto L_0x00a6
            androidx.constraintlayout.solver.widgets.e[] r13 = r6.f1897J
            r13 = r13[r16]
            int r13 = r13.mo2514b()
            float r13 = (float) r13
            float r11 = r11 + r13
        L_0x00a6:
            androidx.constraintlayout.solver.widgets.n r13 = r7.f2039d
            float r13 = r13.f2042g
            androidx.constraintlayout.solver.widgets.n r12 = r12.f2039d
            float r12 = r12.f2042g
            int r18 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r18 >= 0) goto L_0x00b4
            float r12 = r12 - r13
            goto L_0x00b6
        L_0x00b4:
            float r12 = r13 - r12
        L_0x00b6:
            float r12 = r12 - r10
            r10 = 8
            r18 = 1
            if (r8 <= 0) goto L_0x0187
            androidx.constraintlayout.solver.widgets.f r2 = r3.mo2601q()
            if (r2 == 0) goto L_0x00d1
            androidx.constraintlayout.solver.widgets.f r2 = r3.mo2601q()
            androidx.constraintlayout.solver.widgets.f$b[] r2 = r2.f1899L
            r2 = r2[r1]
            androidx.constraintlayout.solver.widgets.f$b r11 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r2 != r11) goto L_0x00d1
            r2 = 0
            return r2
        L_0x00d1:
            if (r5 == 0) goto L_0x00dd
            androidx.constraintlayout.solver.widgets.e[] r2 = r5.f1897J
            r2 = r2[r23]
            int r2 = r2.mo2514b()
            float r2 = (float) r2
            float r12 = r12 - r2
        L_0x00dd:
            if (r6 == 0) goto L_0x00e9
            androidx.constraintlayout.solver.widgets.e[] r2 = r6.f1897J
            r2 = r2[r16]
            int r2 = r2.mo2514b()
            float r2 = (float) r2
            float r12 = r12 - r2
        L_0x00e9:
            if (r3 == 0) goto L_0x0185
            e.f.b.f r2 = p214e.p229f.p232b.C7600e.f19121r
            if (r2 == 0) goto L_0x0101
            long r5 = r2.f19138A
            long r5 = r5 - r18
            r2.f19138A = r5
            long r5 = r2.f19159s
            long r5 = r5 + r18
            r2.f19159s = r5
            long r5 = r2.f19165y
            long r5 = r5 + r18
            r2.f19165y = r5
        L_0x0101:
            androidx.constraintlayout.solver.widgets.f[] r2 = r3.f1891F0
            r2 = r2[r1]
            if (r2 != 0) goto L_0x010e
            if (r3 != r4) goto L_0x010a
            goto L_0x010e
        L_0x010a:
            r6 = r21
            goto L_0x0182
        L_0x010e:
            androidx.constraintlayout.solver.widgets.f$b r5 = r3.mo2568c(r1)
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0136
            float r5 = (float) r8
            float r5 = r12 / r5
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x012e
            float[] r5 = r3.f1887D0
            r6 = r5[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0129
            r5 = 0
            goto L_0x012e
        L_0x0129:
            r5 = r5[r1]
            float r5 = r5 * r12
            float r5 = r5 / r9
        L_0x012e:
            int r6 = r3.mo2620z()
            if (r6 != r10) goto L_0x013b
            r5 = 0
            goto L_0x013b
        L_0x0136:
            int r5 = r3.mo2574d(r1)
            float r5 = (float) r5
        L_0x013b:
            androidx.constraintlayout.solver.widgets.e[] r6 = r3.f1897J
            r6 = r6[r23]
            int r6 = r6.mo2514b()
            float r6 = (float) r6
            float r13 = r13 + r6
            androidx.constraintlayout.solver.widgets.e[] r6 = r3.f1897J
            r6 = r6[r23]
            androidx.constraintlayout.solver.widgets.n r6 = r6.mo2517e()
            androidx.constraintlayout.solver.widgets.n r11 = r7.f2041f
            r6.mo2654a(r11, r13)
            androidx.constraintlayout.solver.widgets.e[] r6 = r3.f1897J
            r6 = r6[r16]
            androidx.constraintlayout.solver.widgets.n r6 = r6.mo2517e()
            androidx.constraintlayout.solver.widgets.n r11 = r7.f2041f
            float r13 = r13 + r5
            r6.mo2654a(r11, r13)
            androidx.constraintlayout.solver.widgets.e[] r5 = r3.f1897J
            r5 = r5[r23]
            androidx.constraintlayout.solver.widgets.n r5 = r5.mo2517e()
            r6 = r21
            r5.mo2657a(r6)
            androidx.constraintlayout.solver.widgets.e[] r5 = r3.f1897J
            r5 = r5[r16]
            androidx.constraintlayout.solver.widgets.n r5 = r5.mo2517e()
            r5.mo2657a(r6)
            androidx.constraintlayout.solver.widgets.e[] r3 = r3.f1897J
            r3 = r3[r16]
            int r3 = r3.mo2514b()
            float r3 = (float) r3
            float r13 = r13 + r3
        L_0x0182:
            r3 = r2
            goto L_0x00e9
        L_0x0185:
            r2 = 1
            return r2
        L_0x0187:
            r6 = r21
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0190
            r2 = 1
            r14 = 0
            r15 = 0
        L_0x0190:
            if (r2 == 0) goto L_0x020d
            float r12 = r12 - r11
            float r0 = r3.mo2557b(r1)
            float r12 = r12 * r0
            float r13 = r13 + r12
        L_0x019a:
            if (r3 == 0) goto L_0x0212
            e.f.b.f r0 = p214e.p229f.p232b.C7600e.f19121r
            if (r0 == 0) goto L_0x01b2
            long r8 = r0.f19138A
            long r8 = r8 - r18
            r0.f19138A = r8
            long r8 = r0.f19159s
            long r8 = r8 + r18
            r0.f19159s = r8
            long r8 = r0.f19165y
            long r8 = r8 + r18
            r0.f19165y = r8
        L_0x01b2:
            androidx.constraintlayout.solver.widgets.f[] r0 = r3.f1891F0
            r0 = r0[r1]
            if (r0 != 0) goto L_0x01ba
            if (r3 != r4) goto L_0x020b
        L_0x01ba:
            if (r1 != 0) goto L_0x01c1
            int r2 = r3.mo2525A()
            goto L_0x01c5
        L_0x01c1:
            int r2 = r3.mo2589k()
        L_0x01c5:
            float r2 = (float) r2
            androidx.constraintlayout.solver.widgets.e[] r5 = r3.f1897J
            r5 = r5[r23]
            int r5 = r5.mo2514b()
            float r5 = (float) r5
            float r13 = r13 + r5
            androidx.constraintlayout.solver.widgets.e[] r5 = r3.f1897J
            r5 = r5[r23]
            androidx.constraintlayout.solver.widgets.n r5 = r5.mo2517e()
            androidx.constraintlayout.solver.widgets.n r8 = r7.f2041f
            r5.mo2654a(r8, r13)
            androidx.constraintlayout.solver.widgets.e[] r5 = r3.f1897J
            r5 = r5[r16]
            androidx.constraintlayout.solver.widgets.n r5 = r5.mo2517e()
            androidx.constraintlayout.solver.widgets.n r8 = r7.f2041f
            float r13 = r13 + r2
            r5.mo2654a(r8, r13)
            androidx.constraintlayout.solver.widgets.e[] r2 = r3.f1897J
            r2 = r2[r23]
            androidx.constraintlayout.solver.widgets.n r2 = r2.mo2517e()
            r2.mo2657a(r6)
            androidx.constraintlayout.solver.widgets.e[] r2 = r3.f1897J
            r2 = r2[r16]
            androidx.constraintlayout.solver.widgets.n r2 = r2.mo2517e()
            r2.mo2657a(r6)
            androidx.constraintlayout.solver.widgets.e[] r2 = r3.f1897J
            r2 = r2[r16]
            int r2 = r2.mo2514b()
            float r2 = (float) r2
            float r13 = r13 + r2
        L_0x020b:
            r3 = r0
            goto L_0x019a
        L_0x020d:
            if (r14 != 0) goto L_0x0215
            if (r15 == 0) goto L_0x0212
            goto L_0x0215
        L_0x0212:
            r0 = 1
            goto L_0x02d8
        L_0x0215:
            if (r14 == 0) goto L_0x0219
        L_0x0217:
            float r12 = r12 - r11
            goto L_0x021c
        L_0x0219:
            if (r15 == 0) goto L_0x021c
            goto L_0x0217
        L_0x021c:
            int r11 = r17 + 1
            float r0 = (float) r11
            float r0 = r12 / r0
            r2 = r17
            if (r15 == 0) goto L_0x0230
            r8 = 1
            if (r2 <= r8) goto L_0x022c
            int r11 = r2 + -1
            float r0 = (float) r11
            goto L_0x022e
        L_0x022c:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x022e:
            float r0 = r12 / r0
        L_0x0230:
            int r8 = r3.mo2620z()
            if (r8 == r10) goto L_0x0239
            float r8 = r13 + r0
            goto L_0x023a
        L_0x0239:
            r8 = r13
        L_0x023a:
            if (r15 == 0) goto L_0x024a
            r9 = 1
            if (r2 <= r9) goto L_0x024a
            androidx.constraintlayout.solver.widgets.e[] r2 = r5.f1897J
            r2 = r2[r23]
            int r2 = r2.mo2514b()
            float r2 = (float) r2
            float r8 = r13 + r2
        L_0x024a:
            if (r14 == 0) goto L_0x0258
            if (r5 == 0) goto L_0x0258
            androidx.constraintlayout.solver.widgets.e[] r2 = r5.f1897J
            r2 = r2[r23]
            int r2 = r2.mo2514b()
            float r2 = (float) r2
            float r8 = r8 + r2
        L_0x0258:
            if (r3 == 0) goto L_0x0212
            e.f.b.f r2 = p214e.p229f.p232b.C7600e.f19121r
            if (r2 == 0) goto L_0x0270
            long r11 = r2.f19138A
            long r11 = r11 - r18
            r2.f19138A = r11
            long r11 = r2.f19159s
            long r11 = r11 + r18
            r2.f19159s = r11
            long r11 = r2.f19165y
            long r11 = r11 + r18
            r2.f19165y = r11
        L_0x0270:
            androidx.constraintlayout.solver.widgets.f[] r2 = r3.f1891F0
            r2 = r2[r1]
            if (r2 != 0) goto L_0x0278
            if (r3 != r4) goto L_0x02d6
        L_0x0278:
            if (r1 != 0) goto L_0x027f
            int r9 = r3.mo2525A()
            goto L_0x0283
        L_0x027f:
            int r9 = r3.mo2589k()
        L_0x0283:
            float r9 = (float) r9
            if (r3 == r5) goto L_0x0290
            androidx.constraintlayout.solver.widgets.e[] r11 = r3.f1897J
            r11 = r11[r23]
            int r11 = r11.mo2514b()
            float r11 = (float) r11
            float r8 = r8 + r11
        L_0x0290:
            androidx.constraintlayout.solver.widgets.e[] r11 = r3.f1897J
            r11 = r11[r23]
            androidx.constraintlayout.solver.widgets.n r11 = r11.mo2517e()
            androidx.constraintlayout.solver.widgets.n r12 = r7.f2041f
            r11.mo2654a(r12, r8)
            androidx.constraintlayout.solver.widgets.e[] r11 = r3.f1897J
            r11 = r11[r16]
            androidx.constraintlayout.solver.widgets.n r11 = r11.mo2517e()
            androidx.constraintlayout.solver.widgets.n r12 = r7.f2041f
            float r13 = r8 + r9
            r11.mo2654a(r12, r13)
            androidx.constraintlayout.solver.widgets.e[] r11 = r3.f1897J
            r11 = r11[r23]
            androidx.constraintlayout.solver.widgets.n r11 = r11.mo2517e()
            r11.mo2657a(r6)
            androidx.constraintlayout.solver.widgets.e[] r11 = r3.f1897J
            r11 = r11[r16]
            androidx.constraintlayout.solver.widgets.n r11 = r11.mo2517e()
            r11.mo2657a(r6)
            androidx.constraintlayout.solver.widgets.e[] r3 = r3.f1897J
            r3 = r3[r16]
            int r3 = r3.mo2514b()
            float r3 = (float) r3
            float r9 = r9 + r3
            float r8 = r8 + r9
            if (r2 == 0) goto L_0x02d6
            int r3 = r2.mo2620z()
            if (r3 == r10) goto L_0x02d6
            float r8 = r8 + r0
        L_0x02d6:
            r3 = r2
            goto L_0x0258
        L_0x02d8:
            return r0
        L_0x02d9:
            r0 = 0
            return r0
        L_0x02db:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0454l.m2109a(androidx.constraintlayout.solver.widgets.g, e.f.b.e, int, int, androidx.constraintlayout.solver.widgets.d):boolean");
    }
}

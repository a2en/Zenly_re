package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer;
import androidx.constraintlayout.solver.widgets.analyzer.C0422c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p214e.p229f.p232b.C7600e;

/* renamed from: androidx.constraintlayout.solver.widgets.g */
public class C0447g extends C0462s {

    /* renamed from: K0 */
    BasicMeasure f1973K0 = new BasicMeasure(this);

    /* renamed from: L0 */
    public C0422c f1974L0 = new C0422c(this);

    /* renamed from: M0 */
    private Measurer f1975M0 = null;

    /* renamed from: N0 */
    private boolean f1976N0 = false;

    /* renamed from: O0 */
    protected C7600e f1977O0 = new C7600e();

    /* renamed from: P0 */
    private C0459q f1978P0;

    /* renamed from: Q0 */
    int f1979Q0;

    /* renamed from: R0 */
    int f1980R0;

    /* renamed from: S0 */
    int f1981S0;

    /* renamed from: T0 */
    int f1982T0;

    /* renamed from: U0 */
    int f1983U0 = 0;

    /* renamed from: V0 */
    int f1984V0 = 0;

    /* renamed from: W0 */
    C0438d[] f1985W0 = new C0438d[4];

    /* renamed from: X0 */
    C0438d[] f1986X0 = new C0438d[4];

    /* renamed from: Y0 */
    public List<C0448h> f1987Y0 = new ArrayList();

    /* renamed from: Z0 */
    private int f1988Z0 = 7;

    /* renamed from: a1 */
    public boolean f1989a1 = false;

    /* renamed from: b1 */
    private boolean f1990b1 = false;

    /* renamed from: c1 */
    private boolean f1991c1 = false;

    /* renamed from: f0 */
    private void m2041f0() {
        this.f1983U0 = 0;
        this.f1984V0 = 0;
    }

    /* renamed from: A */
    public void mo2621A(int i) {
        this.f1988Z0 = i;
    }

    /* renamed from: J */
    public void mo2534J() {
        this.f1977O0.mo19718f();
        this.f1979Q0 = 0;
        this.f1981S0 = 0;
        this.f1980R0 = 0;
        this.f1982T0 = 0;
        this.f1987Y0.clear();
        this.f1989a1 = false;
        super.mo2534J();
    }

    /* JADX WARNING: type inference failed for: r10v11, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v33 */
    /* JADX WARNING: type inference failed for: r10v34 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r10v11, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 382
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0302  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2622S() {
        /*
            r21 = this;
            r1 = r21
            int r2 = r1.f1905R
            int r3 = r1.f1906S
            int r0 = r21.mo2525A()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r21.mo2589k()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f1990b1 = r4
            r1.f1991c1 = r4
            androidx.constraintlayout.solver.widgets.f r0 = r1.f1900M
            if (r0 == 0) goto L_0x0046
            androidx.constraintlayout.solver.widgets.q r0 = r1.f1978P0
            if (r0 != 0) goto L_0x002a
            androidx.constraintlayout.solver.widgets.q r0 = new androidx.constraintlayout.solver.widgets.q
            r0.<init>(r1)
            r1.f1978P0 = r0
        L_0x002a:
            androidx.constraintlayout.solver.widgets.q r0 = r1.f1978P0
            r0.mo2669b(r1)
            int r0 = r1.f1979Q0
            r1.mo2617x(r0)
            int r0 = r1.f1980R0
            r1.mo2619y(r0)
            r21.mo2535K()
            e.f.b.e r0 = r1.f1977O0
            e.f.b.c r0 = r0.mo19716d()
            r1.mo2551a(r0)
            goto L_0x004a
        L_0x0046:
            r1.f1905R = r4
            r1.f1906S = r4
        L_0x004a:
            r0 = 64
            boolean r0 = r1.mo2504z(r0)
            r7 = 1
            if (r0 != 0) goto L_0x005e
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = r1.mo2504z(r0)
            if (r0 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r0 = 0
            goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            e.f.b.e r8 = r1.f1977O0
            r8.f19128g = r4
            r8.f19129h = r4
            int r8 = r1.f1988Z0
            r9 = 8
            r10 = 32
            if (r8 == 0) goto L_0x00d3
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r1.mo2504z(r9)
            if (r0 != 0) goto L_0x007e
            boolean r0 = r1.mo2504z(r10)
            if (r0 != 0) goto L_0x007e
            r21.mo2636c0()
        L_0x007e:
            boolean r0 = r1.mo2504z(r10)
            if (r0 != 0) goto L_0x0087
            r21.mo2635b0()
        L_0x0087:
            boolean r0 = r1.mo2504z(r4)
            if (r0 == 0) goto L_0x00ce
            java.util.ArrayList r0 = r21.mo2496Q()
            int r8 = r0.size()
            r11 = 0
        L_0x0096:
            if (r11 >= r8) goto L_0x00b3
            java.lang.Object r12 = r0.get(r11)
            androidx.constraintlayout.solver.widgets.f r12 = (androidx.constraintlayout.solver.widgets.C0444f) r12
            boolean r13 = r12.mo2532H()
            if (r13 == 0) goto L_0x00a7
            r12.mo2586i(r4)
        L_0x00a7:
            boolean r13 = r12.mo2533I()
            if (r13 == 0) goto L_0x00b0
            r12.mo2586i(r7)
        L_0x00b0:
            int r11 = r11 + 1
            goto L_0x0096
        L_0x00b3:
            r11 = 0
        L_0x00b4:
            if (r11 >= r8) goto L_0x00ce
            java.lang.Object r12 = r0.get(r11)
            androidx.constraintlayout.solver.widgets.f r12 = (androidx.constraintlayout.solver.widgets.C0444f) r12
            boolean r13 = r12.mo2533I()
            if (r13 != 0) goto L_0x00c8
            boolean r13 = r12.mo2532H()
            if (r13 == 0) goto L_0x00cb
        L_0x00c8:
            r12.mo2536N()
        L_0x00cb:
            int r11 = r11 + 1
            goto L_0x00b4
        L_0x00ce:
            e.f.b.e r0 = r1.f1977O0
            r0.f19128g = r7
            goto L_0x00dd
        L_0x00d3:
            int r8 = r1.f1988Z0
            if (r8 == 0) goto L_0x00dd
            if (r0 == 0) goto L_0x00dd
            e.f.b.e r0 = r1.f1977O0
            r0.f19129h = r7
        L_0x00dd:
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r1.f1899L
            r8 = r0[r7]
            r11 = r0[r4]
            r21.m2041f0()
            java.util.List<androidx.constraintlayout.solver.widgets.h> r0 = r1.f1987Y0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00ff
            java.util.List<androidx.constraintlayout.solver.widgets.h> r0 = r1.f1987Y0
            r0.clear()
            java.util.List<androidx.constraintlayout.solver.widgets.h> r0 = r1.f1987Y0
            androidx.constraintlayout.solver.widgets.h r12 = new androidx.constraintlayout.solver.widgets.h
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r13 = r1.f2067J0
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x00ff:
            java.util.List<androidx.constraintlayout.solver.widgets.h> r0 = r1.f1987Y0
            int r12 = r0.size()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r13 = r1.f2067J0
            androidx.constraintlayout.solver.widgets.f$b r0 = r21.mo2595n()
            androidx.constraintlayout.solver.widgets.f$b r14 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r0 == r14) goto L_0x011a
            androidx.constraintlayout.solver.widgets.f$b r0 = r21.mo2618y()
            androidx.constraintlayout.solver.widgets.f$b r14 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r0 != r14) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r14 = 0
            goto L_0x011b
        L_0x011a:
            r14 = 1
        L_0x011b:
            r0 = 0
            r15 = 0
        L_0x011d:
            if (r15 >= r12) goto L_0x0363
            boolean r9 = r1.f1989a1
            if (r9 != 0) goto L_0x0363
            java.util.List<androidx.constraintlayout.solver.widgets.h> r9 = r1.f1987Y0
            java.lang.Object r9 = r9.get(r15)
            androidx.constraintlayout.solver.widgets.h r9 = (androidx.constraintlayout.solver.widgets.C0448h) r9
            boolean r9 = r9.f1993b
            if (r9 == 0) goto L_0x0133
            r19 = r12
            goto L_0x0357
        L_0x0133:
            boolean r9 = r1.mo2504z(r10)
            if (r9 == 0) goto L_0x0168
            androidx.constraintlayout.solver.widgets.f$b r9 = r21.mo2595n()
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            if (r9 != r10) goto L_0x015a
            androidx.constraintlayout.solver.widgets.f$b r9 = r21.mo2618y()
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            if (r9 != r10) goto L_0x015a
            java.util.List<androidx.constraintlayout.solver.widgets.h> r9 = r1.f1987Y0
            java.lang.Object r9 = r9.get(r15)
            androidx.constraintlayout.solver.widgets.h r9 = (androidx.constraintlayout.solver.widgets.C0448h) r9
            java.util.List r9 = r9.mo2643a()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r1.f2067J0 = r9
            goto L_0x0168
        L_0x015a:
            java.util.List<androidx.constraintlayout.solver.widgets.h> r9 = r1.f1987Y0
            java.lang.Object r9 = r9.get(r15)
            androidx.constraintlayout.solver.widgets.h r9 = (androidx.constraintlayout.solver.widgets.C0448h) r9
            java.util.List<androidx.constraintlayout.solver.widgets.f> r9 = r9.f1992a
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r1.f2067J0 = r9
        L_0x0168:
            r21.m2041f0()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r9 = r1.f2067J0
            int r9 = r9.size()
            r10 = 0
        L_0x0172:
            if (r10 >= r9) goto L_0x018a
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r4 = r1.f2067J0
            java.lang.Object r4 = r4.get(r10)
            androidx.constraintlayout.solver.widgets.f r4 = (androidx.constraintlayout.solver.widgets.C0444f) r4
            boolean r7 = r4 instanceof androidx.constraintlayout.solver.widgets.C0462s
            if (r7 == 0) goto L_0x0185
            androidx.constraintlayout.solver.widgets.s r4 = (androidx.constraintlayout.solver.widgets.C0462s) r4
            r4.mo2622S()
        L_0x0185:
            int r10 = r10 + 1
            r4 = 0
            r7 = 1
            goto L_0x0172
        L_0x018a:
            r7 = r0
            r0 = 0
            r4 = 1
        L_0x018d:
            if (r4 == 0) goto L_0x0346
            r17 = r4
            r10 = 1
            int r4 = r0 + 1
            e.f.b.e r0 = r1.f1977O0     // Catch:{ Exception -> 0x01d1 }
            r0.mo19718f()     // Catch:{ Exception -> 0x01d1 }
            r21.m2041f0()     // Catch:{ Exception -> 0x01d1 }
            e.f.b.e r0 = r1.f1977O0     // Catch:{ Exception -> 0x01d1 }
            r1.mo2564b(r0)     // Catch:{ Exception -> 0x01d1 }
            r0 = 0
        L_0x01a2:
            if (r0 >= r9) goto L_0x01b8
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r10 = r1.f2067J0     // Catch:{ Exception -> 0x01d1 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ Exception -> 0x01d1 }
            androidx.constraintlayout.solver.widgets.f r10 = (androidx.constraintlayout.solver.widgets.C0444f) r10     // Catch:{ Exception -> 0x01d1 }
            r18 = r7
            e.f.b.e r7 = r1.f1977O0     // Catch:{ Exception -> 0x01cf }
            r10.mo2564b(r7)     // Catch:{ Exception -> 0x01cf }
            int r0 = r0 + 1
            r7 = r18
            goto L_0x01a2
        L_0x01b8:
            r18 = r7
            e.f.b.e r0 = r1.f1977O0     // Catch:{ Exception -> 0x01cf }
            boolean r7 = r1.mo2637d(r0)     // Catch:{ Exception -> 0x01cf }
            if (r7 == 0) goto L_0x01ca
            e.f.b.e r0 = r1.f1977O0     // Catch:{ Exception -> 0x01c8 }
            r0.mo19717e()     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01ca
        L_0x01c8:
            r0 = move-exception
            goto L_0x01d6
        L_0x01ca:
            r17 = r7
            r19 = r12
            goto L_0x01f3
        L_0x01cf:
            r0 = move-exception
            goto L_0x01d4
        L_0x01d1:
            r0 = move-exception
            r18 = r7
        L_0x01d4:
            r7 = r17
        L_0x01d6:
            r0.printStackTrace()
            java.io.PrintStream r10 = java.lang.System.out
            r17 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r7.append(r12)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r10.println(r0)
        L_0x01f3:
            if (r17 == 0) goto L_0x01fe
            e.f.b.e r7 = r1.f1977O0
            boolean[] r10 = androidx.constraintlayout.solver.widgets.C0454l.f2037a
            r1.mo2632a(r7, r10)
        L_0x01fc:
            r10 = 2
            goto L_0x0247
        L_0x01fe:
            e.f.b.e r7 = r1.f1977O0
            r1.mo2571c(r7)
            r7 = 0
        L_0x0204:
            if (r7 >= r9) goto L_0x01fc
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r10 = r1.f2067J0
            java.lang.Object r10 = r10.get(r7)
            androidx.constraintlayout.solver.widgets.f r10 = (androidx.constraintlayout.solver.widgets.C0444f) r10
            androidx.constraintlayout.solver.widgets.f$b[] r12 = r10.f1899L
            r16 = 0
            r12 = r12[r16]
            androidx.constraintlayout.solver.widgets.f$b r0 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r12 != r0) goto L_0x0229
            int r0 = r10.mo2525A()
            int r12 = r10.mo2527C()
            if (r0 >= r12) goto L_0x0229
            boolean[] r0 = androidx.constraintlayout.solver.widgets.C0454l.f2037a
            r7 = 2
            r12 = 1
            r0[r7] = r12
            goto L_0x01fc
        L_0x0229:
            r12 = 1
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r10.f1899L
            r0 = r0[r12]
            androidx.constraintlayout.solver.widgets.f$b r12 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r0 != r12) goto L_0x0243
            int r0 = r10.mo2589k()
            int r10 = r10.mo2526B()
            if (r0 >= r10) goto L_0x0243
            boolean[] r0 = androidx.constraintlayout.solver.widgets.C0454l.f2037a
            r7 = 1
            r10 = 2
            r0[r10] = r7
            goto L_0x0247
        L_0x0243:
            r10 = 2
            int r7 = r7 + 1
            goto L_0x0204
        L_0x0247:
            if (r14 == 0) goto L_0x02c1
            r7 = 8
            if (r4 >= r7) goto L_0x02c1
            boolean[] r0 = androidx.constraintlayout.solver.widgets.C0454l.f2037a
            boolean r0 = r0[r10]
            if (r0 == 0) goto L_0x02c1
            r0 = 0
            r10 = 0
            r12 = 0
        L_0x0256:
            if (r0 >= r9) goto L_0x0280
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r7 = r1.f2067J0
            java.lang.Object r7 = r7.get(r0)
            androidx.constraintlayout.solver.widgets.f r7 = (androidx.constraintlayout.solver.widgets.C0444f) r7
            r17 = r4
            int r4 = r7.f1905R
            int r20 = r7.mo2525A()
            int r4 = r4 + r20
            int r10 = java.lang.Math.max(r10, r4)
            int r4 = r7.f1906S
            int r7 = r7.mo2589k()
            int r4 = r4 + r7
            int r12 = java.lang.Math.max(r12, r4)
            int r0 = r0 + 1
            r4 = r17
            r7 = 8
            goto L_0x0256
        L_0x0280:
            r17 = r4
            int r0 = r1.f1919c0
            int r0 = java.lang.Math.max(r0, r10)
            int r4 = r1.f1921d0
            int r4 = java.lang.Math.max(r4, r12)
            androidx.constraintlayout.solver.widgets.f$b r7 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r11 != r7) goto L_0x02a6
            int r7 = r21.mo2525A()
            if (r7 >= r0) goto L_0x02a6
            r1.mo2611u(r0)
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r1.f1899L
            androidx.constraintlayout.solver.widgets.f$b r7 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            r10 = 0
            r0[r10] = r7
            r0 = 1
            r18 = 1
            goto L_0x02a7
        L_0x02a6:
            r0 = 0
        L_0x02a7:
            androidx.constraintlayout.solver.widgets.f$b r7 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r8 != r7) goto L_0x02be
            int r7 = r21.mo2589k()
            if (r7 >= r4) goto L_0x02be
            r1.mo2594m(r4)
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r1.f1899L
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            r7 = 1
            r0[r7] = r4
            r0 = 1
            r7 = 1
            goto L_0x02c6
        L_0x02be:
            r7 = r18
            goto L_0x02c6
        L_0x02c1:
            r17 = r4
            r7 = r18
            r0 = 0
        L_0x02c6:
            int r4 = r1.f1919c0
            int r10 = r21.mo2525A()
            int r4 = java.lang.Math.max(r4, r10)
            int r10 = r21.mo2525A()
            if (r4 <= r10) goto L_0x02e2
            r1.mo2611u(r4)
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r1.f1899L
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            r7 = 0
            r0[r7] = r4
            r0 = 1
            r7 = 1
        L_0x02e2:
            int r4 = r1.f1921d0
            int r10 = r21.mo2589k()
            int r4 = java.lang.Math.max(r4, r10)
            int r10 = r21.mo2589k()
            if (r4 <= r10) goto L_0x02ff
            r1.mo2594m(r4)
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r1.f1899L
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            r10 = 1
            r0[r10] = r4
            r0 = 1
            r7 = 1
            goto L_0x0300
        L_0x02ff:
            r10 = 1
        L_0x0300:
            if (r7 != 0) goto L_0x033f
            androidx.constraintlayout.solver.widgets.f$b[] r4 = r1.f1899L
            r12 = 0
            r4 = r4[r12]
            androidx.constraintlayout.solver.widgets.f$b r12 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r4 != r12) goto L_0x0321
            if (r5 <= 0) goto L_0x0321
            int r4 = r21.mo2525A()
            if (r4 <= r5) goto L_0x0321
            r1.f1990b1 = r10
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r1.f1899L
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            r7 = 0
            r0[r7] = r4
            r1.mo2611u(r5)
            r0 = 1
            r7 = 1
        L_0x0321:
            androidx.constraintlayout.solver.widgets.f$b[] r4 = r1.f1899L
            r4 = r4[r10]
            androidx.constraintlayout.solver.widgets.f$b r12 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r4 != r12) goto L_0x033f
            if (r6 <= 0) goto L_0x033f
            int r4 = r21.mo2589k()
            if (r4 <= r6) goto L_0x033f
            r1.f1991c1 = r10
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r1.f1899L
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            r0[r10] = r4
            r1.mo2594m(r6)
            r4 = 1
            r7 = 1
            goto L_0x0340
        L_0x033f:
            r4 = r0
        L_0x0340:
            r0 = r17
            r12 = r19
            goto L_0x018d
        L_0x0346:
            r18 = r7
            r19 = r12
            java.util.List<androidx.constraintlayout.solver.widgets.h> r0 = r1.f1987Y0
            java.lang.Object r0 = r0.get(r15)
            androidx.constraintlayout.solver.widgets.h r0 = (androidx.constraintlayout.solver.widgets.C0448h) r0
            r0.mo2644b()
            r0 = r18
        L_0x0357:
            int r15 = r15 + 1
            r12 = r19
            r4 = 0
            r7 = 1
            r9 = 8
            r10 = 32
            goto L_0x011d
        L_0x0363:
            r1.f2067J0 = r13
            androidx.constraintlayout.solver.widgets.f r4 = r1.f1900M
            if (r4 == 0) goto L_0x0395
            int r2 = r1.f1919c0
            int r3 = r21.mo2525A()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.f1921d0
            int r4 = r21.mo2589k()
            int r3 = java.lang.Math.max(r3, r4)
            androidx.constraintlayout.solver.widgets.q r4 = r1.f1978P0
            r4.mo2668a(r1)
            int r4 = r1.f1979Q0
            int r2 = r2 + r4
            int r4 = r1.f1981S0
            int r2 = r2 + r4
            r1.mo2611u(r2)
            int r2 = r1.f1980R0
            int r3 = r3 + r2
            int r2 = r1.f1982T0
            int r3 = r3 + r2
            r1.mo2594m(r3)
            goto L_0x0399
        L_0x0395:
            r1.f1905R = r2
            r1.f1906S = r3
        L_0x0399:
            if (r0 == 0) goto L_0x03a3
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r1.f1899L
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r8
        L_0x03a3:
            e.f.b.e r0 = r1.f1977O0
            e.f.b.c r0 = r0.mo19716d()
            r1.mo2551a(r0)
            androidx.constraintlayout.solver.widgets.g r0 = r21.mo2678R()
            if (r1 != r0) goto L_0x03b5
            r21.mo2537O()
        L_0x03b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0447g.mo2622S():void");
    }

    /* renamed from: U */
    public Measurer mo2623U() {
        return this.f1975M0;
    }

    /* renamed from: V */
    public int mo2624V() {
        return this.f1988Z0;
    }

    /* renamed from: W */
    public boolean mo2625W() {
        return false;
    }

    /* renamed from: X */
    public void mo2626X() {
        this.f1974L0.mo2472b();
    }

    /* renamed from: Y */
    public boolean mo2627Y() {
        return this.f1991c1;
    }

    /* renamed from: Z */
    public boolean mo2628Z() {
        return this.f1976N0;
    }

    /* renamed from: a */
    public boolean mo2633a(boolean z, int i) {
        return this.f1974L0.mo2471a(z, i);
    }

    /* renamed from: a0 */
    public boolean mo2634a0() {
        return this.f1990b1;
    }

    /* renamed from: b0 */
    public void mo2635b0() {
        if (!mo2504z(8)) {
            mo2499a(this.f1988Z0);
        }
        mo2639d0();
    }

    /* renamed from: c0 */
    public void mo2636c0() {
        int size = this.f2067J0.size();
        mo2494L();
        for (int i = 0; i < size; i++) {
            ((C0444f) this.f2067J0.get(i)).mo2494L();
        }
    }

    /* renamed from: d */
    public boolean mo2638d(boolean z) {
        return this.f1974L0.mo2470a(z);
    }

    /* renamed from: d0 */
    public void mo2639d0() {
        C0456n e = mo2539a(C0443d.LEFT).mo2517e();
        C0456n e2 = mo2539a(C0443d.TOP).mo2517e();
        e.mo2654a((C0456n) null, 0.0f);
        e2.mo2654a((C0456n) null, 0.0f);
    }

    /* renamed from: e */
    public boolean mo2640e(boolean z) {
        return this.f1974L0.mo2473b(z);
    }

    /* renamed from: e0 */
    public void mo2641e0() {
        this.f1973K0.mo2454a(this);
    }

    /* renamed from: f */
    public void mo2642f(boolean z) {
        this.f1976N0 = z;
    }

    /* renamed from: z */
    public boolean mo2504z(int i) {
        return (this.f1988Z0 & i) == i;
    }

    /* renamed from: e */
    private void m2040e(C0444f fVar) {
        int i = this.f1984V0 + 1;
        C0438d[] dVarArr = this.f1985W0;
        if (i >= dVarArr.length) {
            this.f1985W0 = (C0438d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f1985W0[this.f1984V0] = new C0438d(fVar, 1, mo2628Z());
        this.f1984V0++;
    }

    /* renamed from: a */
    public void mo2629a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f1973K0.mo2455a(this, i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: d */
    public boolean mo2637d(C7600e eVar) {
        mo2501a(eVar);
        int size = this.f2067J0.size();
        for (int i = 0; i < size; i++) {
            C0444f fVar = (C0444f) this.f2067J0.get(i);
            if (fVar instanceof C0461r) {
                fVar.mo2501a(eVar);
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            C0444f fVar2 = (C0444f) this.f2067J0.get(i2);
            if (fVar2 instanceof C0447g) {
                C0446b[] bVarArr = fVar2.f1899L;
                C0446b bVar = bVarArr[0];
                C0446b bVar2 = bVarArr[1];
                if (bVar == C0446b.WRAP_CONTENT) {
                    fVar2.mo2548a(C0446b.FIXED);
                }
                if (bVar2 == C0446b.WRAP_CONTENT) {
                    fVar2.mo2562b(C0446b.FIXED);
                }
                fVar2.mo2501a(eVar);
                if (bVar == C0446b.WRAP_CONTENT) {
                    fVar2.mo2548a(bVar);
                }
                if (bVar2 == C0446b.WRAP_CONTENT) {
                    fVar2.mo2562b(bVar2);
                }
            } else {
                C0454l.m2105a(this, eVar, fVar2);
                if (!(fVar2 instanceof C0461r)) {
                    fVar2.mo2501a(eVar);
                }
            }
        }
        if (this.f1983U0 > 0) {
            C0437c.m1912a(this, eVar, 0);
        }
        if (this.f1984V0 > 0) {
            C0437c.m1912a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: a */
    public void mo2630a(Measurer measurer) {
        this.f1975M0 = measurer;
        this.f1974L0.mo2468a(measurer);
    }

    /* renamed from: a */
    public void mo2632a(C7600e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo2571c(eVar);
        int size = this.f2067J0.size();
        for (int i = 0; i < size; i++) {
            C0444f fVar = (C0444f) this.f2067J0.get(i);
            fVar.mo2571c(eVar);
            if (fVar.f1899L[0] == C0446b.MATCH_CONSTRAINT && fVar.mo2525A() < fVar.mo2527C()) {
                zArr[2] = true;
            }
            if (fVar.f1899L[1] == C0446b.MATCH_CONSTRAINT && fVar.mo2589k() < fVar.mo2526B()) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: a */
    public void mo2555a(boolean z, boolean z2) {
        super.mo2555a(z, z2);
        int size = this.f2067J0.size();
        for (int i = 0; i < size; i++) {
            ((C0444f) this.f2067J0.get(i)).mo2555a(z, z2);
        }
    }

    /* renamed from: a */
    public void mo2499a(int i) {
        super.mo2499a(i);
        int size = this.f2067J0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0444f) this.f2067J0.get(i2)).mo2499a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2631a(C0444f fVar, int i) {
        if (i == 0) {
            m2039d(fVar);
        } else if (i == 1) {
            m2040e(fVar);
        }
    }

    /* renamed from: d */
    private void m2039d(C0444f fVar) {
        int i = this.f1983U0 + 1;
        C0438d[] dVarArr = this.f1986X0;
        if (i >= dVarArr.length) {
            this.f1986X0 = (C0438d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f1986X0[this.f1983U0] = new C0438d(fVar, 0, mo2628Z());
        this.f1983U0++;
    }
}

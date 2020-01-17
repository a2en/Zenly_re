package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import java.util.ArrayList;
import java.util.HashMap;
import p214e.p229f.p232b.C7600e;
import p214e.p229f.p232b.C7605i;

/* renamed from: androidx.constraintlayout.solver.widgets.j */
public class C0451j extends C0444f {

    /* renamed from: J0 */
    protected float f2028J0 = -1.0f;

    /* renamed from: K0 */
    protected int f2029K0 = -1;

    /* renamed from: L0 */
    protected int f2030L0 = -1;

    /* renamed from: M0 */
    private C0439e f2031M0 = this.f1884C;

    /* renamed from: N0 */
    private int f2032N0;

    /* renamed from: O0 */
    private boolean f2033O0;

    /* renamed from: androidx.constraintlayout.solver.widgets.j$a */
    static /* synthetic */ class C0452a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2034a = new int[C0443d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.e$d[] r0 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2034a = r0
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BASELINE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f2034a     // Catch:{ NoSuchFieldError -> 0x006e }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0451j.C0452a.<clinit>():void");
        }
    }

    public C0451j() {
        this.f2032N0 = 0;
        this.f2033O0 = false;
        new C0455m();
        this.f1898K.clear();
        this.f1898K.add(this.f2031M0);
        int length = this.f1897J.length;
        for (int i = 0; i < length; i++) {
            this.f1897J[i] = this.f2031M0;
        }
    }

    /* renamed from: A */
    public void mo2646A(int i) {
        if (i > -1) {
            this.f2028J0 = -1.0f;
            this.f2029K0 = -1;
            this.f2030L0 = i;
        }
    }

    /* renamed from: B */
    public void mo2647B(int i) {
        if (this.f2032N0 != i) {
            this.f2032N0 = i;
            this.f1898K.clear();
            if (this.f2032N0 == 1) {
                this.f2031M0 = this.f1882B;
            } else {
                this.f2031M0 = this.f1884C;
            }
            this.f1898K.add(this.f2031M0);
            int length = this.f1897J.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1897J[i2] = this.f2031M0;
            }
        }
    }

    /* renamed from: Q */
    public int mo2496Q() {
        return this.f2032N0;
    }

    /* renamed from: R */
    public int mo2648R() {
        return this.f2029K0;
    }

    /* renamed from: S */
    public int mo2649S() {
        return this.f2030L0;
    }

    /* renamed from: T */
    public float mo2650T() {
        return this.f2028J0;
    }

    /* renamed from: a */
    public void mo2500a(C0444f fVar, HashMap<C0444f, C0444f> hashMap) {
        super.mo2500a(fVar, hashMap);
        C0451j jVar = (C0451j) fVar;
        this.f2028J0 = jVar.f2028J0;
        this.f2029K0 = jVar.f2029K0;
        this.f2030L0 = jVar.f2030L0;
        mo2647B(jVar.f2032N0);
    }

    /* renamed from: a */
    public boolean mo2502a() {
        return true;
    }

    /* renamed from: b */
    public ArrayList<C0439e> mo2558b() {
        return this.f1898K;
    }

    /* renamed from: c */
    public void mo2571c(C7600e eVar) {
        if (mo2601q() != null) {
            int b = eVar.mo19710b((Object) this.f2031M0);
            if (this.f2032N0 == 1) {
                mo2617x(b);
                mo2619y(0);
                mo2594m(mo2601q().mo2589k());
                mo2611u(0);
            } else {
                mo2617x(0);
                mo2619y(b);
                mo2611u(mo2601q().mo2525A());
                mo2594m(0);
            }
        }
    }

    /* renamed from: e */
    public void mo2651e(float f) {
        if (f > -1.0f) {
            this.f2028J0 = f;
            this.f2029K0 = -1;
            this.f2030L0 = -1;
        }
    }

    /* renamed from: z */
    public void mo2504z(int i) {
        if (i > -1) {
            this.f2028J0 = -1.0f;
            this.f2029K0 = i;
            this.f2030L0 = -1;
        }
    }

    /* renamed from: a */
    public C0439e mo2539a(C0443d dVar) {
        switch (C0452a.f2034a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f2032N0 == 1) {
                    return this.f2031M0;
                }
                break;
            case 3:
            case 4:
                if (this.f2032N0 == 0) {
                    return this.f2031M0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    /* renamed from: a */
    public void mo2499a(int i) {
        C0444f q = mo2601q();
        if (q != null) {
            if (mo2496Q() == 1) {
                this.f1884C.mo2517e().mo2653a(1, q.f1884C.mo2517e(), 0);
                this.f1888E.mo2517e().mo2653a(1, q.f1884C.mo2517e(), 0);
                if (this.f2029K0 != -1) {
                    this.f1882B.mo2517e().mo2653a(1, q.f1882B.mo2517e(), this.f2029K0);
                    this.f1886D.mo2517e().mo2653a(1, q.f1882B.mo2517e(), this.f2029K0);
                } else if (this.f2030L0 != -1) {
                    this.f1882B.mo2517e().mo2653a(1, q.f1886D.mo2517e(), -this.f2030L0);
                    this.f1886D.mo2517e().mo2653a(1, q.f1886D.mo2517e(), -this.f2030L0);
                } else if (this.f2028J0 != -1.0f && q.mo2595n() == C0446b.FIXED) {
                    int i2 = (int) (((float) q.f1901N) * this.f2028J0);
                    this.f1882B.mo2517e().mo2653a(1, q.f1882B.mo2517e(), i2);
                    this.f1886D.mo2517e().mo2653a(1, q.f1882B.mo2517e(), i2);
                }
            } else {
                this.f1882B.mo2517e().mo2653a(1, q.f1882B.mo2517e(), 0);
                this.f1886D.mo2517e().mo2653a(1, q.f1882B.mo2517e(), 0);
                if (this.f2029K0 != -1) {
                    this.f1884C.mo2517e().mo2653a(1, q.f1884C.mo2517e(), this.f2029K0);
                    this.f1888E.mo2517e().mo2653a(1, q.f1884C.mo2517e(), this.f2029K0);
                } else if (this.f2030L0 != -1) {
                    this.f1884C.mo2517e().mo2653a(1, q.f1888E.mo2517e(), -this.f2030L0);
                    this.f1888E.mo2517e().mo2653a(1, q.f1888E.mo2517e(), -this.f2030L0);
                } else if (this.f2028J0 != -1.0f && q.mo2618y() == C0446b.FIXED) {
                    int i3 = (int) (((float) q.f1902O) * this.f2028J0);
                    this.f1884C.mo2517e().mo2653a(1, q.f1884C.mo2517e(), i3);
                    this.f1888E.mo2517e().mo2653a(1, q.f1884C.mo2517e(), i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2501a(C7600e eVar) {
        C0447g gVar = (C0447g) mo2601q();
        if (gVar != null) {
            C0439e a = gVar.mo2539a(C0443d.LEFT);
            C0439e a2 = gVar.mo2539a(C0443d.RIGHT);
            C0444f fVar = this.f1900M;
            boolean z = fVar != null && fVar.f1899L[0] == C0446b.WRAP_CONTENT;
            if (this.f2032N0 == 0) {
                a = gVar.mo2539a(C0443d.TOP);
                a2 = gVar.mo2539a(C0443d.BOTTOM);
                C0444f fVar2 = this.f1900M;
                z = fVar2 != null && fVar2.f1899L[1] == C0446b.WRAP_CONTENT;
            }
            if (this.f2029K0 != -1) {
                C7605i a3 = eVar.mo19701a((Object) this.f2031M0);
                eVar.mo19698a(a3, eVar.mo19701a((Object) a), this.f2029K0, 6);
                if (z) {
                    eVar.mo19712b(eVar.mo19701a((Object) a2), a3, 0, 5);
                }
            } else if (this.f2030L0 != -1) {
                C7605i a4 = eVar.mo19701a((Object) this.f2031M0);
                C7605i a5 = eVar.mo19701a((Object) a2);
                eVar.mo19698a(a4, a5, -this.f2030L0, 6);
                if (z) {
                    eVar.mo19712b(a4, eVar.mo19701a((Object) a), 0, 5);
                    eVar.mo19712b(a5, a4, 0, 5);
                }
            } else if (this.f2028J0 != -1.0f) {
                eVar.mo19703a(C7600e.m18448a(eVar, eVar.mo19701a((Object) this.f2031M0), eVar.mo19701a((Object) a), eVar.mo19701a((Object) a2), this.f2028J0, this.f2033O0));
            }
        }
    }
}

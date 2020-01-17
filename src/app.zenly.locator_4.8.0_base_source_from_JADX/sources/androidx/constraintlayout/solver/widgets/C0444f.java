package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0439e.C0442c;
import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.analyzer.C0421b;
import androidx.constraintlayout.solver.widgets.analyzer.C0423d;
import androidx.constraintlayout.solver.widgets.analyzer.C0428h;
import androidx.constraintlayout.solver.widgets.analyzer.C0431j;
import androidx.constraintlayout.solver.widgets.analyzer.C0433k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p214e.p229f.p232b.C7598c;
import p214e.p229f.p232b.C7600e;

/* renamed from: androidx.constraintlayout.solver.widgets.f */
public class C0444f {

    /* renamed from: I0 */
    public static float f1879I0 = 0.5f;

    /* renamed from: A */
    private boolean f1880A;

    /* renamed from: A0 */
    int f1881A0;

    /* renamed from: B */
    public C0439e f1882B = new C0439e(this, C0443d.LEFT);

    /* renamed from: B0 */
    boolean f1883B0;

    /* renamed from: C */
    public C0439e f1884C = new C0439e(this, C0443d.TOP);

    /* renamed from: C0 */
    boolean f1885C0;

    /* renamed from: D */
    public C0439e f1886D = new C0439e(this, C0443d.RIGHT);

    /* renamed from: D0 */
    public float[] f1887D0;

    /* renamed from: E */
    public C0439e f1888E = new C0439e(this, C0443d.BOTTOM);

    /* renamed from: E0 */
    protected C0444f[] f1889E0;

    /* renamed from: F */
    C0439e f1890F = new C0439e(this, C0443d.BASELINE);

    /* renamed from: F0 */
    protected C0444f[] f1891F0;

    /* renamed from: G */
    C0439e f1892G = new C0439e(this, C0443d.CENTER_X);

    /* renamed from: G0 */
    C0444f f1893G0;

    /* renamed from: H */
    C0439e f1894H = new C0439e(this, C0443d.CENTER_Y);

    /* renamed from: H0 */
    C0444f f1895H0;

    /* renamed from: I */
    C0439e f1896I = new C0439e(this, C0443d.CENTER);

    /* renamed from: J */
    public C0439e[] f1897J = {this.f1882B, this.f1886D, this.f1884C, this.f1888E, this.f1890F, this.f1896I};

    /* renamed from: K */
    protected ArrayList<C0439e> f1898K = new ArrayList<>();

    /* renamed from: L */
    public C0446b[] f1899L;

    /* renamed from: M */
    public C0444f f1900M;

    /* renamed from: N */
    int f1901N;

    /* renamed from: O */
    int f1902O;

    /* renamed from: P */
    public float f1903P;

    /* renamed from: Q */
    protected int f1904Q;

    /* renamed from: R */
    protected int f1905R;

    /* renamed from: S */
    protected int f1906S;

    /* renamed from: T */
    int f1907T;

    /* renamed from: U */
    int f1908U;

    /* renamed from: V */
    private int f1909V;

    /* renamed from: W */
    private int f1910W;

    /* renamed from: X */
    private int f1911X;

    /* renamed from: Y */
    private int f1912Y;

    /* renamed from: Z */
    protected int f1913Z;

    /* renamed from: a */
    public boolean f1914a = false;

    /* renamed from: a0 */
    protected int f1915a0;

    /* renamed from: b */
    public C0421b f1916b;

    /* renamed from: b0 */
    int f1917b0;

    /* renamed from: c */
    public C0421b f1918c;

    /* renamed from: c0 */
    protected int f1919c0;

    /* renamed from: d */
    public C0428h f1920d = new C0428h(this);

    /* renamed from: d0 */
    protected int f1921d0;

    /* renamed from: e */
    public C0431j f1922e = new C0431j(this);

    /* renamed from: e0 */
    private int f1923e0;

    /* renamed from: f */
    public boolean[] f1924f = {true, true};

    /* renamed from: f0 */
    private int f1925f0;

    /* renamed from: g */
    public int f1926g = -1;

    /* renamed from: g0 */
    float f1927g0;

    /* renamed from: h */
    public int f1928h = -1;

    /* renamed from: h0 */
    float f1929h0;

    /* renamed from: i */
    C0457o f1930i;

    /* renamed from: i0 */
    private Object f1931i0;

    /* renamed from: j */
    C0457o f1932j;

    /* renamed from: j0 */
    private int f1933j0;

    /* renamed from: k */
    public int f1934k = 0;

    /* renamed from: k0 */
    private int f1935k0;

    /* renamed from: l */
    public int f1936l = 0;

    /* renamed from: l0 */
    private String f1937l0;

    /* renamed from: m */
    public int[] f1938m = new int[2];

    /* renamed from: m0 */
    private String f1939m0;

    /* renamed from: n */
    public int f1940n = 0;

    /* renamed from: n0 */
    int f1941n0;

    /* renamed from: o */
    public int f1942o = 0;

    /* renamed from: o0 */
    int f1943o0;

    /* renamed from: p */
    public float f1944p = 1.0f;

    /* renamed from: p0 */
    int f1945p0;

    /* renamed from: q */
    public int f1946q = 0;

    /* renamed from: q0 */
    int f1947q0;

    /* renamed from: r */
    public int f1948r = 0;

    /* renamed from: r0 */
    boolean f1949r0;

    /* renamed from: s */
    public float f1950s = 1.0f;

    /* renamed from: s0 */
    boolean f1951s0;

    /* renamed from: t */
    public boolean f1952t;

    /* renamed from: t0 */
    boolean f1953t0;

    /* renamed from: u */
    public boolean f1954u;

    /* renamed from: u0 */
    boolean f1955u0;

    /* renamed from: v */
    int f1956v = -1;

    /* renamed from: v0 */
    boolean f1957v0;

    /* renamed from: w */
    float f1958w = 1.0f;

    /* renamed from: w0 */
    boolean f1959w0;

    /* renamed from: x */
    private int[] f1960x = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: x0 */
    boolean f1961x0;

    /* renamed from: y */
    private float f1962y = 0.0f;

    /* renamed from: y0 */
    boolean f1963y0;

    /* renamed from: z */
    private boolean f1964z = false;

    /* renamed from: z0 */
    int f1965z0;

    /* renamed from: androidx.constraintlayout.solver.widgets.f$a */
    static /* synthetic */ class C0445a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1966a = new int[C0443d.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f1967b = new int[C0446b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0093 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.f$b[] r0 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1967b = r0
                r0 = 1
                int[] r1 = f1967b     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.f$b r2 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f1967b     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.widgets.f$b r3 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f1967b     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f1967b     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.widgets.f$b r5 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                androidx.constraintlayout.solver.widgets.e$d[] r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f1966a = r4
                int[] r4 = f1966a     // Catch:{ NoSuchFieldError -> 0x0048 }
                androidx.constraintlayout.solver.widgets.e$d r5 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = f1966a     // Catch:{ NoSuchFieldError -> 0x0052 }
                androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f1966a     // Catch:{ NoSuchFieldError -> 0x005c }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f1966a     // Catch:{ NoSuchFieldError -> 0x0066 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = f1966a     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BASELINE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f1966a     // Catch:{ NoSuchFieldError -> 0x007c }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r0 = f1966a     // Catch:{ NoSuchFieldError -> 0x0087 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f1966a     // Catch:{ NoSuchFieldError -> 0x0093 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f1966a     // Catch:{ NoSuchFieldError -> 0x009f }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.NONE     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0444f.C0445a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.f$b */
    public enum C0446b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0444f() {
        C0446b bVar = C0446b.FIXED;
        this.f1899L = new C0446b[]{bVar, bVar};
        this.f1900M = null;
        this.f1901N = 0;
        this.f1902O = 0;
        this.f1903P = 0.0f;
        this.f1904Q = -1;
        this.f1905R = 0;
        this.f1906S = 0;
        this.f1907T = 0;
        this.f1908U = 0;
        this.f1909V = 0;
        this.f1910W = 0;
        this.f1911X = 0;
        this.f1912Y = 0;
        this.f1913Z = 0;
        this.f1915a0 = 0;
        this.f1917b0 = 0;
        float f = f1879I0;
        this.f1927g0 = f;
        this.f1929h0 = f;
        this.f1933j0 = 0;
        this.f1935k0 = 0;
        this.f1937l0 = null;
        this.f1939m0 = null;
        this.f1961x0 = false;
        this.f1963y0 = false;
        this.f1965z0 = 0;
        this.f1881A0 = 0;
        this.f1887D0 = new float[]{-1.0f, -1.0f};
        this.f1889E0 = new C0444f[]{null, null};
        this.f1891F0 = new C0444f[]{null, null};
        this.f1893G0 = null;
        this.f1895H0 = null;
        mo2496Q();
    }

    /* renamed from: Q */
    private void mo2496Q() {
        this.f1898K.add(this.f1882B);
        this.f1898K.add(this.f1884C);
        this.f1898K.add(this.f1886D);
        this.f1898K.add(this.f1888E);
        this.f1898K.add(this.f1892G);
        this.f1898K.add(this.f1894H);
        this.f1898K.add(this.f1896I);
        this.f1898K.add(this.f1890F);
    }

    /* renamed from: A */
    public int mo2525A() {
        if (this.f1935k0 == 8) {
            return 0;
        }
        return this.f1901N;
    }

    /* renamed from: B */
    public int mo2526B() {
        return this.f1925f0;
    }

    /* renamed from: C */
    public int mo2527C() {
        return this.f1923e0;
    }

    /* renamed from: D */
    public int mo2528D() {
        return this.f1905R;
    }

    /* renamed from: E */
    public int mo2529E() {
        return this.f1906S;
    }

    /* renamed from: F */
    public boolean mo2530F() {
        return this.f1964z;
    }

    /* renamed from: G */
    public boolean mo2531G() {
        if (this.f1882B.mo2517e().f2051b == 1 && this.f1886D.mo2517e().f2051b == 1 && this.f1884C.mo2517e().f2051b == 1 && this.f1888E.mo2517e().f2051b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public boolean mo2532H() {
        C0439e eVar = this.f1882B;
        C0439e eVar2 = eVar.f1855d;
        if (eVar2 == null || eVar2.f1855d != eVar) {
            C0439e eVar3 = this.f1886D;
            C0439e eVar4 = eVar3.f1855d;
            if (eVar4 == null || eVar4.f1855d != eVar3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    public boolean mo2533I() {
        C0439e eVar = this.f1884C;
        C0439e eVar2 = eVar.f1855d;
        if (eVar2 == null || eVar2.f1855d != eVar) {
            C0439e eVar3 = this.f1888E;
            C0439e eVar4 = eVar3.f1855d;
            if (eVar4 == null || eVar4.f1855d != eVar3) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    public void mo2534J() {
        this.f1882B.mo2523k();
        this.f1884C.mo2523k();
        this.f1886D.mo2523k();
        this.f1888E.mo2523k();
        this.f1890F.mo2523k();
        this.f1892G.mo2523k();
        this.f1894H.mo2523k();
        this.f1896I.mo2523k();
        this.f1900M = null;
        this.f1962y = 0.0f;
        this.f1901N = 0;
        this.f1902O = 0;
        this.f1903P = 0.0f;
        this.f1904Q = -1;
        this.f1905R = 0;
        this.f1906S = 0;
        this.f1909V = 0;
        this.f1910W = 0;
        this.f1911X = 0;
        this.f1912Y = 0;
        this.f1913Z = 0;
        this.f1915a0 = 0;
        this.f1917b0 = 0;
        this.f1919c0 = 0;
        this.f1921d0 = 0;
        this.f1923e0 = 0;
        this.f1925f0 = 0;
        float f = f1879I0;
        this.f1927g0 = f;
        this.f1929h0 = f;
        C0446b[] bVarArr = this.f1899L;
        C0446b bVar = C0446b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f1931i0 = null;
        this.f1933j0 = 0;
        this.f1935k0 = 0;
        this.f1939m0 = null;
        this.f1957v0 = false;
        this.f1959w0 = false;
        this.f1965z0 = 0;
        this.f1881A0 = 0;
        this.f1883B0 = false;
        this.f1885C0 = false;
        float[] fArr = this.f1887D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1926g = -1;
        this.f1928h = -1;
        int[] iArr = this.f1960x;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1934k = 0;
        this.f1936l = 0;
        this.f1944p = 1.0f;
        this.f1950s = 1.0f;
        this.f1942o = Integer.MAX_VALUE;
        this.f1948r = Integer.MAX_VALUE;
        this.f1940n = 0;
        this.f1946q = 0;
        this.f1956v = -1;
        this.f1958w = 1.0f;
        C0457o oVar = this.f1930i;
        if (oVar != null) {
            oVar.mo2661c();
        }
        C0457o oVar2 = this.f1932j;
        if (oVar2 != null) {
            oVar2.mo2661c();
        }
        this.f1961x0 = false;
        this.f1963y0 = false;
        boolean[] zArr = this.f1924f;
        zArr[0] = true;
        zArr[1] = true;
    }

    /* renamed from: K */
    public void mo2535K() {
        C0444f q = mo2601q();
        if (q == null || !(q instanceof C0447g) || !((C0447g) mo2601q()).mo2625W()) {
            int size = this.f1898K.size();
            for (int i = 0; i < size; i++) {
                ((C0439e) this.f1898K.get(i)).mo2523k();
            }
        }
    }

    /* renamed from: L */
    public void mo2494L() {
        for (C0439e e : this.f1897J) {
            e.mo2517e().mo2661c();
        }
    }

    /* renamed from: M */
    public void mo2495M() {
    }

    /* renamed from: N */
    public void mo2536N() {
        int length = this.f1897J.length;
        int i = 0;
        while (i < length) {
            C0456n e = this.f1897J[i].mo2517e();
            C0439e h = e.f2038c.mo2520h();
            if (h != null) {
                e.f2039d = h.mo2517e();
                if (h.mo2520h() == e.f2038c) {
                    e.f2043h = 4;
                    h.mo2517e().f2043h = 4;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: O */
    public void mo2537O() {
        int i = this.f1905R;
        int i2 = this.f1906S;
        int i3 = this.f1901N + i;
        int i4 = this.f1902O + i2;
        this.f1909V = i;
        this.f1910W = i2;
        this.f1911X = i3 - i;
        this.f1912Y = i4 - i2;
    }

    /* renamed from: P */
    public void mo2538P() {
        for (C0439e e : this.f1897J) {
            e.mo2517e().mo2663e();
        }
    }

    /* renamed from: a */
    public void mo2549a(C0444f fVar) {
    }

    /* renamed from: a */
    public void mo2554a(boolean z) {
        this.f1964z = z;
    }

    /* renamed from: b */
    public void mo2566b(boolean z) {
        this.f1880A = z;
    }

    /* renamed from: c */
    public int mo2567c() {
        return this.f1917b0;
    }

    /* renamed from: c */
    public void mo2572c(boolean z) {
    }

    /* renamed from: d */
    public int mo2574d(int i) {
        if (i == 0) {
            return mo2525A();
        }
        if (i == 1) {
            return mo2589k();
        }
        return 0;
    }

    /* renamed from: e */
    public Object mo2578e() {
        return this.f1931i0;
    }

    /* renamed from: f */
    public String mo2580f() {
        return this.f1937l0;
    }

    /* renamed from: g */
    public C0433k mo2582g(int i) {
        if (i == 0) {
            return this.f1920d;
        }
        if (i == 1) {
            return this.f1922e;
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo2584h(int i) {
        int i2 = i * 2;
        if (this.f1897J[i2].mo2517e().f2051b == 1 && this.f1897J[i2 + 1].mo2517e().f2051b == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo2586i(int i) {
        int i2 = i * 2;
        this.f1897J[i2].mo2517e().f2051b = 0;
        this.f1897J[i2 + 1].mo2517e().f2051b = 0;
    }

    /* renamed from: j */
    public int mo2587j() {
        return this.f1910W + this.f1915a0;
    }

    /* renamed from: k */
    public int mo2589k() {
        if (this.f1935k0 == 8) {
            return 0;
        }
        return this.f1902O;
    }

    /* renamed from: l */
    public float mo2591l() {
        return this.f1927g0;
    }

    /* renamed from: m */
    public void mo2594m(int i) {
        this.f1902O = i;
        int i2 = this.f1902O;
        int i3 = this.f1921d0;
        if (i2 < i3) {
            this.f1902O = i3;
        }
    }

    /* renamed from: n */
    public void mo2596n(int i) {
        this.f1965z0 = i;
    }

    /* renamed from: o */
    public void mo2598o(int i) {
        this.f1960x[1] = i;
    }

    /* renamed from: p */
    public void mo2600p(int i) {
        this.f1960x[0] = i;
    }

    /* renamed from: q */
    public C0444f mo2601q() {
        return this.f1900M;
    }

    /* renamed from: r */
    public C0457o mo2603r() {
        if (this.f1932j == null) {
            this.f1932j = new C0457o();
        }
        return this.f1932j;
    }

    /* renamed from: s */
    public C0457o mo2605s() {
        if (this.f1930i == null) {
            this.f1930i = new C0457o();
        }
        return this.f1930i;
    }

    /* renamed from: t */
    public void mo2608t(int i) {
        this.f1935k0 = i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = " ";
        String str3 = "";
        if (this.f1939m0 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("type: ");
            sb2.append(this.f1939m0);
            sb2.append(str2);
            str = sb2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.f1937l0 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("id: ");
            sb3.append(this.f1937l0);
            sb3.append(str2);
            str3 = sb3.toString();
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.f1905R);
        sb.append(", ");
        sb.append(this.f1906S);
        sb.append(") - (");
        sb.append(this.f1901N);
        String str4 = " x ";
        sb.append(str4);
        sb.append(this.f1902O);
        sb.append(") wrap: (");
        sb.append(this.f1923e0);
        sb.append(str4);
        sb.append(this.f1925f0);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo2610u() {
        return this.f1905R + this.f1913Z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo2612v() {
        return this.f1906S + this.f1915a0;
    }

    /* renamed from: w */
    public float mo2614w() {
        return this.f1929h0;
    }

    /* renamed from: x */
    public void mo2617x(int i) {
        this.f1905R = i;
    }

    /* renamed from: y */
    public void mo2619y(int i) {
        this.f1906S = i;
    }

    /* renamed from: z */
    public int mo2620z() {
        return this.f1935k0;
    }

    /* renamed from: z */
    private boolean mo2504z(int i) {
        int i2 = i * 2;
        C0439e[] eVarArr = this.f1897J;
        if (!(eVarArr[i2].f1855d == null || eVarArr[i2].f1855d.f1855d == eVarArr[i2])) {
            int i3 = i2 + 1;
            if (eVarArr[i3].f1855d != null && eVarArr[i3].f1855d.f1855d == eVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2499a(int i) {
        C0454l.m2104a(i, this);
    }

    /* renamed from: b */
    public void mo2563b(C0444f fVar) {
        this.f1900M = fVar;
    }

    /* renamed from: c */
    public void mo2570c(int i, int i2) {
        this.f1905R = i;
        this.f1906S = i2;
    }

    /* renamed from: e */
    public C0444f mo2577e(int i) {
        if (i == 0) {
            C0439e eVar = this.f1886D;
            C0439e eVar2 = eVar.f1855d;
            if (eVar2 != null && eVar2.f1855d == eVar) {
                return eVar2.f1853b;
            }
        } else if (i == 1) {
            C0439e eVar3 = this.f1888E;
            C0439e eVar4 = eVar3.f1855d;
            if (eVar4 != null && eVar4.f1855d == eVar3) {
                return eVar4.f1853b;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C0444f mo2579f(int i) {
        if (i == 0) {
            C0439e eVar = this.f1882B;
            C0439e eVar2 = eVar.f1855d;
            if (eVar2 != null && eVar2.f1855d == eVar) {
                return eVar2.f1853b;
            }
        } else if (i == 1) {
            C0439e eVar3 = this.f1884C;
            C0439e eVar4 = eVar3.f1855d;
            if (eVar4 != null && eVar4.f1855d == eVar3) {
                return eVar4.f1853b;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void mo2588j(int i) {
        this.f1917b0 = i;
    }

    /* renamed from: l */
    public void mo2592l(int i) {
        this.f1910W = i - this.f1915a0;
        this.f1906S = this.f1910W;
    }

    /* renamed from: n */
    public C0446b mo2595n() {
        return this.f1899L[0];
    }

    /* renamed from: o */
    public int mo2597o() {
        return this.f1921d0;
    }

    /* renamed from: p */
    public int mo2599p() {
        return this.f1919c0;
    }

    /* renamed from: q */
    public void mo2602q(int i) {
        if (i < 0) {
            this.f1921d0 = 0;
        } else {
            this.f1921d0 = i;
        }
    }

    /* renamed from: t */
    public int mo2607t() {
        return mo2528D() + this.f1901N;
    }

    /* renamed from: u */
    public void mo2611u(int i) {
        this.f1901N = i;
        int i2 = this.f1901N;
        int i3 = this.f1919c0;
        if (i2 < i3) {
            this.f1901N = i3;
        }
    }

    /* renamed from: v */
    public void mo2613v(int i) {
        this.f1925f0 = i;
    }

    /* renamed from: w */
    public void mo2615w(int i) {
        this.f1923e0 = i;
    }

    /* renamed from: x */
    public int mo2616x() {
        return this.f1881A0;
    }

    /* renamed from: y */
    public C0446b mo2618y() {
        return this.f1899L[1];
    }

    /* renamed from: a */
    public void mo2551a(C7598c cVar) {
        this.f1882B.mo2508a(cVar);
        this.f1884C.mo2508a(cVar);
        this.f1886D.mo2508a(cVar);
        this.f1888E.mo2508a(cVar);
        this.f1890F.mo2508a(cVar);
        this.f1896I.mo2508a(cVar);
        this.f1892G.mo2508a(cVar);
        this.f1894H.mo2508a(cVar);
    }

    /* renamed from: b */
    public void mo2564b(C7600e eVar) {
        eVar.mo19701a((Object) this.f1882B);
        eVar.mo19701a((Object) this.f1884C);
        eVar.mo19701a((Object) this.f1886D);
        eVar.mo19701a((Object) this.f1888E);
        if (this.f1917b0 > 0) {
            eVar.mo19701a((Object) this.f1890F);
        }
    }

    /* renamed from: d */
    public int mo2573d() {
        return mo2529E() + this.f1902O;
    }

    /* renamed from: g */
    public float mo2581g() {
        return this.f1903P;
    }

    /* renamed from: h */
    public int mo2583h() {
        return this.f1904Q;
    }

    /* renamed from: i */
    public int mo2585i() {
        return this.f1909V + this.f1913Z;
    }

    /* renamed from: k */
    public void mo2590k(int i) {
        this.f1909V = i - this.f1913Z;
        this.f1905R = this.f1909V;
    }

    /* renamed from: c */
    public void mo2569c(float f) {
        this.f1929h0 = f;
    }

    /* renamed from: d */
    public void mo2576d(int i, int i2) {
        this.f1906S = i;
        this.f1902O = i2 - i;
        int i3 = this.f1902O;
        int i4 = this.f1921d0;
        if (i3 < i4) {
            this.f1902O = i4;
        }
    }

    /* renamed from: m */
    public int mo2593m() {
        return this.f1965z0;
    }

    /* renamed from: r */
    public void mo2604r(int i) {
        if (i < 0) {
            this.f1919c0 = 0;
        } else {
            this.f1919c0 = i;
        }
    }

    /* renamed from: s */
    public void mo2606s(int i) {
        this.f1881A0 = i;
    }

    /* renamed from: c */
    public C0446b mo2568c(int i) {
        if (i == 0) {
            return mo2595n();
        }
        if (i == 1) {
            return mo2618y();
        }
        return null;
    }

    /* renamed from: c */
    public void mo2571c(C7600e eVar) {
        int b = eVar.mo19710b((Object) this.f1882B);
        int b2 = eVar.mo19710b((Object) this.f1884C);
        int b3 = eVar.mo19710b((Object) this.f1886D);
        int b4 = eVar.mo19710b((Object) this.f1888E);
        C0428h hVar = this.f1920d;
        C0423d dVar = hVar.f1818h;
        if (dVar.f1789j) {
            C0423d dVar2 = hVar.f1819i;
            if (dVar2.f1789j) {
                b = dVar.f1786g;
                b3 = dVar2.f1786g;
            }
        }
        C0431j jVar = this.f1922e;
        C0423d dVar3 = jVar.f1818h;
        if (dVar3.f1789j) {
            C0423d dVar4 = jVar.f1819i;
            if (dVar4.f1789j) {
                b2 = dVar3.f1786g;
                b4 = dVar4.f1786g;
            }
        }
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == Integer.MAX_VALUE || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE) {
            b4 = 0;
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        mo2543a(b, b2, b3, b4);
    }

    /* renamed from: d */
    public void mo2575d(float f) {
        this.f1887D0[1] = f;
    }

    /* renamed from: b */
    public float mo2557b(int i) {
        if (i == 0) {
            return this.f1927g0;
        }
        if (i == 1) {
            return this.f1929h0;
        }
        return -1.0f;
    }

    /* renamed from: a */
    public void mo2550a(C0444f fVar, float f, int i) {
        C0443d dVar = C0443d.CENTER;
        mo2544a(dVar, fVar, dVar, i, 0);
        this.f1962y = f;
    }

    /* renamed from: b */
    public ArrayList<C0439e> mo2558b() {
        return this.f1898K;
    }

    /* renamed from: b */
    public void mo2560b(int i, int i2) {
        this.f1913Z = i;
        this.f1915a0 = i2;
    }

    /* renamed from: a */
    public void mo2553a(String str) {
        this.f1937l0 = str;
    }

    /* renamed from: a */
    public void mo2542a(int i, int i2, int i3, float f) {
        this.f1934k = i;
        this.f1940n = i2;
        this.f1942o = i3;
        this.f1944p = f;
        if (f < 1.0f && this.f1934k == 0) {
            this.f1934k = 2;
        }
    }

    /* renamed from: b */
    public void mo2561b(int i, int i2, int i3, float f) {
        this.f1936l = i;
        this.f1946q = i2;
        this.f1948r = i3;
        this.f1950s = f;
        if (f < 1.0f && this.f1936l == 0) {
            this.f1936l = 2;
        }
    }

    /* renamed from: a */
    public void mo2540a(float f) {
        this.f1927g0 = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2565b(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f1903P = r9
            r8.f1904Q = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f1903P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0444f.mo2565b(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r5 < r3) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r4 < r2) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2543a(int r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            int r4 = r4 - r2
            int r5 = r5 - r3
            r1.f1905R = r2
            r1.f1906S = r3
            int r2 = r1.f1935k0
            r3 = 0
            r0 = 8
            if (r2 != r0) goto L_0x0012
            r1.f1901N = r3
            r1.f1902O = r3
            return
        L_0x0012:
            androidx.constraintlayout.solver.widgets.f$b[] r2 = r1.f1899L
            r2 = r2[r3]
            androidx.constraintlayout.solver.widgets.f$b r3 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            if (r2 != r3) goto L_0x001f
            int r2 = r1.f1901N
            if (r4 >= r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = r4
        L_0x0020:
            androidx.constraintlayout.solver.widgets.f$b[] r3 = r1.f1899L
            r4 = 1
            r3 = r3[r4]
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            if (r3 != r4) goto L_0x002e
            int r3 = r1.f1902O
            if (r5 >= r3) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r3 = r5
        L_0x002f:
            r1.f1901N = r2
            r1.f1902O = r3
            int r2 = r1.f1902O
            int r3 = r1.f1921d0
            if (r2 >= r3) goto L_0x003b
            r1.f1902O = r3
        L_0x003b:
            int r2 = r1.f1901N
            int r3 = r1.f1919c0
            if (r2 >= r3) goto L_0x0043
            r1.f1901N = r3
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0444f.mo2543a(int, int, int, int):void");
    }

    /* renamed from: a */
    public void mo2541a(int i, int i2) {
        this.f1905R = i;
        this.f1901N = i2 - i;
        int i3 = this.f1901N;
        int i4 = this.f1919c0;
        if (i3 < i4) {
            this.f1901N = i4;
        }
    }

    /* renamed from: a */
    public void mo2552a(Object obj) {
        this.f1931i0 = obj;
    }

    /* renamed from: a */
    public boolean mo2502a() {
        return this.f1935k0 != 8;
    }

    /* renamed from: a */
    public void mo2544a(C0443d dVar, C0444f fVar, C0443d dVar2, int i, int i2) {
        mo2539a(dVar).mo2512a(fVar.mo2539a(dVar2), i, i2, C0442c.STRONG, 0, true);
    }

    /* renamed from: b */
    public void mo2559b(float f) {
        this.f1887D0[0] = f;
    }

    /* renamed from: b */
    public void mo2562b(C0446b bVar) {
        this.f1899L[1] = bVar;
        if (bVar == C0446b.WRAP_CONTENT) {
            mo2594m(this.f1925f0);
        }
    }

    /* renamed from: a */
    public void mo2546a(C0439e eVar, C0439e eVar2, int i) {
        mo2547a(eVar, eVar2, i, C0442c.STRONG, 0);
    }

    /* renamed from: a */
    public void mo2547a(C0439e eVar, C0439e eVar2, int i, C0442c cVar, int i2) {
        if (eVar.mo2516d() == this) {
            mo2545a(eVar.mo2521i(), eVar2.mo2516d(), eVar2.mo2521i(), i, cVar, i2);
        }
    }

    /* renamed from: a */
    public void mo2545a(C0443d dVar, C0444f fVar, C0443d dVar2, int i, C0442c cVar, int i2) {
        boolean z;
        C0443d dVar3 = dVar;
        C0444f fVar2 = fVar;
        C0443d dVar4 = dVar2;
        int i3 = i2;
        C0443d dVar5 = C0443d.CENTER;
        int i4 = 0;
        if (dVar3 == dVar5) {
            if (dVar4 == dVar5) {
                C0439e a = mo2539a(C0443d.LEFT);
                C0439e a2 = mo2539a(C0443d.RIGHT);
                C0439e a3 = mo2539a(C0443d.TOP);
                C0439e a4 = mo2539a(C0443d.BOTTOM);
                boolean z2 = true;
                if ((a == null || !a.mo2522j()) && (a2 == null || !a2.mo2522j())) {
                    C0443d dVar6 = C0443d.LEFT;
                    C0444f fVar3 = fVar;
                    C0442c cVar2 = cVar;
                    int i5 = i2;
                    mo2545a(dVar6, fVar3, dVar6, 0, cVar2, i5);
                    C0443d dVar7 = C0443d.RIGHT;
                    mo2545a(dVar7, fVar3, dVar7, 0, cVar2, i5);
                    z = true;
                } else {
                    z = false;
                }
                if ((a3 == null || !a3.mo2522j()) && (a4 == null || !a4.mo2522j())) {
                    C0443d dVar8 = C0443d.TOP;
                    C0444f fVar4 = fVar;
                    C0442c cVar3 = cVar;
                    int i6 = i2;
                    mo2545a(dVar8, fVar4, dVar8, 0, cVar3, i6);
                    C0443d dVar9 = C0443d.BOTTOM;
                    mo2545a(dVar9, fVar4, dVar9, 0, cVar3, i6);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    mo2539a(C0443d.CENTER).mo2511a(fVar2.mo2539a(C0443d.CENTER), 0, i3);
                } else if (z) {
                    mo2539a(C0443d.CENTER_X).mo2511a(fVar2.mo2539a(C0443d.CENTER_X), 0, i3);
                } else if (z2) {
                    mo2539a(C0443d.CENTER_Y).mo2511a(fVar2.mo2539a(C0443d.CENTER_Y), 0, i3);
                }
            } else if (dVar4 == C0443d.LEFT || dVar4 == C0443d.RIGHT) {
                mo2545a(C0443d.LEFT, fVar, dVar2, 0, cVar, i2);
                try {
                    mo2545a(C0443d.RIGHT, fVar, dVar2, 0, cVar, i2);
                    mo2539a(C0443d.CENTER).mo2511a(fVar.mo2539a(dVar2), 0, i3);
                } catch (Throwable th) {
                    throw th;
                }
            } else if (dVar4 == C0443d.TOP || dVar4 == C0443d.BOTTOM) {
                C0444f fVar5 = fVar;
                C0443d dVar10 = dVar2;
                C0442c cVar4 = cVar;
                int i7 = i2;
                mo2545a(C0443d.TOP, fVar5, dVar10, 0, cVar4, i7);
                mo2545a(C0443d.BOTTOM, fVar5, dVar10, 0, cVar4, i7);
                mo2539a(C0443d.CENTER).mo2511a(fVar.mo2539a(dVar2), 0, i3);
            }
        } else if (dVar3 == C0443d.CENTER_X && (dVar4 == C0443d.LEFT || dVar4 == C0443d.RIGHT)) {
            C0439e a5 = mo2539a(C0443d.LEFT);
            C0439e a6 = fVar.mo2539a(dVar2);
            C0439e a7 = mo2539a(C0443d.RIGHT);
            a5.mo2511a(a6, 0, i3);
            a7.mo2511a(a6, 0, i3);
            mo2539a(C0443d.CENTER_X).mo2511a(a6, 0, i3);
        } else if (dVar3 == C0443d.CENTER_Y && (dVar4 == C0443d.TOP || dVar4 == C0443d.BOTTOM)) {
            C0439e a8 = fVar.mo2539a(dVar2);
            mo2539a(C0443d.TOP).mo2511a(a8, 0, i3);
            mo2539a(C0443d.BOTTOM).mo2511a(a8, 0, i3);
            mo2539a(C0443d.CENTER_Y).mo2511a(a8, 0, i3);
        } else {
            C0443d dVar11 = C0443d.CENTER_X;
            if (dVar3 == dVar11 && dVar4 == dVar11) {
                mo2539a(C0443d.LEFT).mo2511a(fVar2.mo2539a(C0443d.LEFT), 0, i3);
                mo2539a(C0443d.RIGHT).mo2511a(fVar2.mo2539a(C0443d.RIGHT), 0, i3);
                mo2539a(C0443d.CENTER_X).mo2511a(fVar.mo2539a(dVar2), 0, i3);
                return;
            }
            C0443d dVar12 = C0443d.CENTER_Y;
            if (dVar3 == dVar12 && dVar4 == dVar12) {
                mo2539a(C0443d.TOP).mo2511a(fVar2.mo2539a(C0443d.TOP), 0, i3);
                mo2539a(C0443d.BOTTOM).mo2511a(fVar2.mo2539a(C0443d.BOTTOM), 0, i3);
                mo2539a(C0443d.CENTER_Y).mo2511a(fVar.mo2539a(dVar2), 0, i3);
                return;
            }
            C0439e a9 = mo2539a(dVar);
            C0439e a10 = fVar.mo2539a(dVar2);
            if (a9.mo2509a(a10)) {
                if (dVar3 == C0443d.BASELINE) {
                    C0439e a11 = mo2539a(C0443d.TOP);
                    C0439e a12 = mo2539a(C0443d.BOTTOM);
                    if (a11 != null) {
                        a11.mo2523k();
                    }
                    if (a12 != null) {
                        a12.mo2523k();
                    }
                } else {
                    if (dVar3 == C0443d.TOP || dVar3 == C0443d.BOTTOM) {
                        C0439e a13 = mo2539a(C0443d.BASELINE);
                        if (a13 != null) {
                            a13.mo2523k();
                        }
                        C0439e a14 = mo2539a(C0443d.CENTER);
                        if (a14.mo2520h() != a10) {
                            a14.mo2523k();
                        }
                        C0439e c = mo2539a(dVar).mo2515c();
                        C0439e a15 = mo2539a(C0443d.CENTER_Y);
                        if (a15.mo2522j()) {
                            c.mo2523k();
                            a15.mo2523k();
                        }
                    } else if (dVar3 == C0443d.LEFT || dVar3 == C0443d.RIGHT) {
                        C0439e a16 = mo2539a(C0443d.CENTER);
                        if (a16.mo2520h() != a10) {
                            a16.mo2523k();
                        }
                        C0439e c2 = mo2539a(dVar).mo2515c();
                        C0439e a17 = mo2539a(C0443d.CENTER_X);
                        if (a17.mo2522j()) {
                            c2.mo2523k();
                            a17.mo2523k();
                        }
                    }
                    i4 = i;
                }
                a9.mo2513a(a10, i4, cVar, i3);
                a10.mo2516d().mo2549a(a9.mo2516d());
            }
        }
    }

    /* renamed from: a */
    public C0439e mo2539a(C0443d dVar) {
        switch (C0445a.f1966a[dVar.ordinal()]) {
            case 1:
                return this.f1882B;
            case 2:
                return this.f1884C;
            case 3:
                return this.f1886D;
            case 4:
                return this.f1888E;
            case 5:
                return this.f1890F;
            case 6:
                return this.f1896I;
            case 7:
                return this.f1892G;
            case 8:
                return this.f1894H;
            case 9:
                return null;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    /* renamed from: a */
    public void mo2548a(C0446b bVar) {
        this.f1899L[0] = bVar;
        if (bVar == C0446b.WRAP_CONTENT) {
            mo2611u(this.f1923e0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2501a(p214e.p229f.p232b.C7600e r41) {
        /*
            r40 = this;
            r15 = r40
            r11 = r41
            androidx.constraintlayout.solver.widgets.e r0 = r15.f1882B
            e.f.b.i r7 = r11.mo19701a(r0)
            androidx.constraintlayout.solver.widgets.e r0 = r15.f1886D
            e.f.b.i r5 = r11.mo19701a(r0)
            androidx.constraintlayout.solver.widgets.e r0 = r15.f1884C
            e.f.b.i r4 = r11.mo19701a(r0)
            androidx.constraintlayout.solver.widgets.e r0 = r15.f1888E
            e.f.b.i r2 = r11.mo19701a(r0)
            androidx.constraintlayout.solver.widgets.e r0 = r15.f1890F
            e.f.b.i r1 = r11.mo19701a(r0)
            e.f.b.f r0 = p214e.p229f.p232b.C7600e.f19121r
            r8 = 1
            if (r0 == 0) goto L_0x002d
            long r12 = r0.f19140C
            long r12 = r12 + r8
            r0.f19140C = r12
        L_0x002d:
            androidx.constraintlayout.solver.widgets.analyzer.h r0 = r15.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r0.f1818h
            boolean r3 = r3.f1789j
            r12 = 0
            if (r3 == 0) goto L_0x00d7
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1819i
            boolean r0 = r0.f1789j
            if (r0 == 0) goto L_0x00d7
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r15.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r0.f1818h
            boolean r3 = r3.f1789j
            if (r3 == 0) goto L_0x00d7
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1819i
            boolean r0 = r0.f1789j
            if (r0 == 0) goto L_0x00d7
            e.f.b.f r0 = p214e.p229f.p232b.C7600e.f19121r
            if (r0 == 0) goto L_0x0053
            long r13 = r0.f19157q
            long r13 = r13 + r8
            r0.f19157q = r13
        L_0x0053:
            androidx.constraintlayout.solver.widgets.analyzer.h r0 = r15.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1818h
            int r0 = r0.f1786g
            r11.mo19706a(r7, r0)
            androidx.constraintlayout.solver.widgets.analyzer.h r0 = r15.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1819i
            int r0 = r0.f1786g
            r11.mo19706a(r5, r0)
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r15.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1818h
            int r0 = r0.f1786g
            r11.mo19706a(r4, r0)
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r15.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1819i
            int r0 = r0.f1786g
            r11.mo19706a(r2, r0)
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r15.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1808k
            int r0 = r0.f1786g
            r11.mo19706a(r1, r0)
            androidx.constraintlayout.solver.widgets.f r0 = r15.f1900M
            if (r0 == 0) goto L_0x00d6
            if (r0 == 0) goto L_0x0090
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r0.f1899L
            r0 = r0[r12]
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r0 != r1) goto L_0x0090
            r0 = 1
            goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            androidx.constraintlayout.solver.widgets.f r1 = r15.f1900M
            if (r1 == 0) goto L_0x00a0
            androidx.constraintlayout.solver.widgets.f$b[] r1 = r1.f1899L
            r3 = 1
            r1 = r1[r3]
            androidx.constraintlayout.solver.widgets.f$b r3 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r1 != r3) goto L_0x00a0
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r0 == 0) goto L_0x00bb
            boolean[] r0 = r15.f1924f
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r40.mo2532H()
            if (r0 != 0) goto L_0x00bb
            androidx.constraintlayout.solver.widgets.f r0 = r15.f1900M
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1886D
            e.f.b.i r0 = r11.mo19701a(r0)
            r3 = 6
            r11.mo19712b(r0, r5, r12, r3)
        L_0x00bb:
            if (r1 == 0) goto L_0x00d6
            boolean[] r0 = r15.f1924f
            r1 = 1
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r40.mo2533I()
            if (r0 != 0) goto L_0x00d6
            androidx.constraintlayout.solver.widgets.f r0 = r15.f1900M
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1888E
            e.f.b.i r0 = r11.mo19701a(r0)
            r1 = 6
            r11.mo19712b(r0, r2, r12, r1)
        L_0x00d6:
            return
        L_0x00d7:
            e.f.b.f r0 = p214e.p229f.p232b.C7600e.f19121r
            if (r0 == 0) goto L_0x00e0
            long r13 = r0.f19158r
            long r13 = r13 + r8
            r0.f19158r = r13
        L_0x00e0:
            androidx.constraintlayout.solver.widgets.f r0 = r15.f1900M
            r14 = 8
            if (r0 == 0) goto L_0x0171
            if (r0 == 0) goto L_0x00f2
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r0.f1899L
            r0 = r0[r12]
            androidx.constraintlayout.solver.widgets.f$b r3 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r0 != r3) goto L_0x00f2
            r0 = 1
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            androidx.constraintlayout.solver.widgets.f r3 = r15.f1900M
            if (r3 == 0) goto L_0x0102
            androidx.constraintlayout.solver.widgets.f$b[] r3 = r3.f1899L
            r6 = 1
            r3 = r3[r6]
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r3 != r6) goto L_0x0102
            r3 = 1
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            boolean r6 = r15.mo2504z(r12)
            if (r6 == 0) goto L_0x0113
            androidx.constraintlayout.solver.widgets.f r6 = r15.f1900M
            androidx.constraintlayout.solver.widgets.g r6 = (androidx.constraintlayout.solver.widgets.C0447g) r6
            r6.mo2631a(r15, r12)
            r6 = 1
            r13 = 1
            goto L_0x0118
        L_0x0113:
            boolean r13 = r40.mo2532H()
            r6 = 1
        L_0x0118:
            boolean r8 = r15.mo2504z(r6)
            if (r8 == 0) goto L_0x0127
            androidx.constraintlayout.solver.widgets.f r8 = r15.f1900M
            androidx.constraintlayout.solver.widgets.g r8 = (androidx.constraintlayout.solver.widgets.C0447g) r8
            r8.mo2631a(r15, r6)
            r6 = 1
            goto L_0x012b
        L_0x0127:
            boolean r6 = r40.mo2533I()
        L_0x012b:
            if (r0 == 0) goto L_0x0149
            int r8 = r15.f1935k0
            if (r8 == r14) goto L_0x0149
            androidx.constraintlayout.solver.widgets.e r8 = r15.f1882B
            androidx.constraintlayout.solver.widgets.e r8 = r8.f1855d
            if (r8 != 0) goto L_0x0149
            androidx.constraintlayout.solver.widgets.e r8 = r15.f1886D
            androidx.constraintlayout.solver.widgets.e r8 = r8.f1855d
            if (r8 != 0) goto L_0x0149
            androidx.constraintlayout.solver.widgets.f r8 = r15.f1900M
            androidx.constraintlayout.solver.widgets.e r8 = r8.f1886D
            e.f.b.i r8 = r11.mo19701a(r8)
            r9 = 1
            r11.mo19712b(r8, r5, r12, r9)
        L_0x0149:
            if (r3 == 0) goto L_0x016b
            int r8 = r15.f1935k0
            if (r8 == r14) goto L_0x016b
            androidx.constraintlayout.solver.widgets.e r8 = r15.f1884C
            androidx.constraintlayout.solver.widgets.e r8 = r8.f1855d
            if (r8 != 0) goto L_0x016b
            androidx.constraintlayout.solver.widgets.e r8 = r15.f1888E
            androidx.constraintlayout.solver.widgets.e r8 = r8.f1855d
            if (r8 != 0) goto L_0x016b
            androidx.constraintlayout.solver.widgets.e r8 = r15.f1890F
            if (r8 != 0) goto L_0x016b
            androidx.constraintlayout.solver.widgets.f r8 = r15.f1900M
            androidx.constraintlayout.solver.widgets.e r8 = r8.f1888E
            e.f.b.i r8 = r11.mo19701a(r8)
            r9 = 1
            r11.mo19712b(r8, r2, r12, r9)
        L_0x016b:
            r23 = r6
            r18 = r13
            r13 = r3
            goto L_0x0177
        L_0x0171:
            r0 = 0
            r13 = 0
            r18 = 0
            r23 = 0
        L_0x0177:
            int r3 = r15.f1901N
            int r6 = r15.f1919c0
            if (r3 >= r6) goto L_0x017e
            r3 = r6
        L_0x017e:
            int r6 = r15.f1902O
            int r8 = r15.f1921d0
            if (r6 >= r8) goto L_0x0185
            r6 = r8
        L_0x0185:
            androidx.constraintlayout.solver.widgets.f$b[] r8 = r15.f1899L
            r8 = r8[r12]
            androidx.constraintlayout.solver.widgets.f$b r9 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r8 == r9) goto L_0x018f
            r8 = 1
            goto L_0x0190
        L_0x018f:
            r8 = 0
        L_0x0190:
            androidx.constraintlayout.solver.widgets.f$b[] r9 = r15.f1899L
            r10 = 1
            r9 = r9[r10]
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r9 == r10) goto L_0x019b
            r9 = 1
            goto L_0x019c
        L_0x019b:
            r9 = 0
        L_0x019c:
            int r10 = r15.f1904Q
            r15.f1956v = r10
            float r10 = r15.f1903P
            r15.f1958w = r10
            int r12 = r15.f1934k
            int r14 = r15.f1936l
            r21 = 0
            r22 = 4
            r24 = r4
            int r10 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r10 <= 0) goto L_0x024d
            int r10 = r15.f1935k0
            r4 = 8
            if (r10 == r4) goto L_0x024d
            androidx.constraintlayout.solver.widgets.f$b[] r10 = r15.f1899L
            r19 = 0
            r10 = r10[r19]
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            r26 = r1
            if (r10 != r4) goto L_0x01c7
            if (r12 != 0) goto L_0x01c7
            r12 = 3
        L_0x01c7:
            androidx.constraintlayout.solver.widgets.f$b[] r4 = r15.f1899L
            r10 = 1
            r4 = r4[r10]
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r4 != r10) goto L_0x01d3
            if (r14 != 0) goto L_0x01d3
            r14 = 3
        L_0x01d3:
            androidx.constraintlayout.solver.widgets.f$b[] r4 = r15.f1899L
            r10 = 0
            r1 = r4[r10]
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r1 != r10) goto L_0x01ea
            r1 = 1
            r4 = r4[r1]
            if (r4 != r10) goto L_0x01ea
            r1 = 3
            if (r12 != r1) goto L_0x01eb
            if (r14 != r1) goto L_0x01eb
            r15.mo2556a(r0, r13, r8, r9)
            goto L_0x0242
        L_0x01ea:
            r1 = 3
        L_0x01eb:
            androidx.constraintlayout.solver.widgets.f$b[] r4 = r15.f1899L
            r8 = 0
            r9 = r4[r8]
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x020e
            if (r12 != r1) goto L_0x020e
            r15.f1956v = r8
            float r1 = r15.f1958w
            int r3 = r15.f1902O
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = (int) r1
            r8 = 1
            r3 = r4[r8]
            r22 = r1
            r30 = r6
            if (r3 == r10) goto L_0x0246
            r28 = r14
            r27 = 4
            goto L_0x0257
        L_0x020e:
            r8 = 1
            androidx.constraintlayout.solver.widgets.f$b[] r1 = r15.f1899L
            r1 = r1[r8]
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r1 != r4) goto L_0x0242
            r1 = 3
            if (r14 != r1) goto L_0x0242
            r15.f1956v = r8
            int r1 = r15.f1904Q
            r4 = -1
            if (r1 != r4) goto L_0x0228
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r15.f1958w
            float r1 = r1 / r4
            r15.f1958w = r1
        L_0x0228:
            float r1 = r15.f1958w
            int r4 = r15.f1901N
            float r4 = (float) r4
            float r1 = r1 * r4
            int r1 = (int) r1
            androidx.constraintlayout.solver.widgets.f$b[] r4 = r15.f1899L
            r6 = 0
            r4 = r4[r6]
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            r30 = r1
            r22 = r3
            r27 = r12
            if (r4 == r6) goto L_0x0248
            r28 = 4
            goto L_0x0257
        L_0x0242:
            r22 = r3
            r30 = r6
        L_0x0246:
            r27 = r12
        L_0x0248:
            r28 = r14
            r29 = 1
            goto L_0x0259
        L_0x024d:
            r26 = r1
            r22 = r3
            r30 = r6
            r27 = r12
            r28 = r14
        L_0x0257:
            r29 = 0
        L_0x0259:
            int[] r1 = r15.f1938m
            r3 = 0
            r1[r3] = r27
            r3 = 1
            r1[r3] = r28
            if (r29 == 0) goto L_0x026d
            int r1 = r15.f1956v
            r4 = -1
            if (r1 == 0) goto L_0x026a
            if (r1 != r4) goto L_0x026e
        L_0x026a:
            r25 = 1
            goto L_0x0270
        L_0x026d:
            r4 = -1
        L_0x026e:
            r25 = 0
        L_0x0270:
            androidx.constraintlayout.solver.widgets.f$b[] r1 = r15.f1899L
            r3 = 0
            r1 = r1[r3]
            androidx.constraintlayout.solver.widgets.f$b r3 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r1 != r3) goto L_0x0280
            boolean r1 = r15 instanceof androidx.constraintlayout.solver.widgets.C0447g
            if (r1 == 0) goto L_0x0280
            r31 = 1
            goto L_0x0282
        L_0x0280:
            r31 = 0
        L_0x0282:
            androidx.constraintlayout.solver.widgets.e r1 = r15.f1896I
            boolean r1 = r1.mo2522j()
            r14 = 1
            r32 = r1 ^ 1
            int r1 = r15.f1926g
            r12 = 2
            r33 = 0
            if (r1 == r12) goto L_0x0354
            androidx.constraintlayout.solver.widgets.analyzer.h r1 = r15.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r1.f1818h
            boolean r6 = r3.f1789j
            if (r6 == 0) goto L_0x02dc
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r1.f1819i
            boolean r1 = r1.f1789j
            if (r1 != 0) goto L_0x02a1
            goto L_0x02dc
        L_0x02a1:
            int r1 = r3.f1786g
            r11.mo19706a(r7, r1)
            androidx.constraintlayout.solver.widgets.analyzer.h r1 = r15.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r1.f1819i
            int r1 = r1.f1786g
            r11.mo19706a(r5, r1)
            androidx.constraintlayout.solver.widgets.f r1 = r15.f1900M
            if (r1 == 0) goto L_0x02ce
            if (r0 == 0) goto L_0x02ce
            boolean[] r0 = r15.f1924f
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x02ce
            boolean r0 = r40.mo2532H()
            if (r0 != 0) goto L_0x02ce
            androidx.constraintlayout.solver.widgets.f r0 = r15.f1900M
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1886D
            e.f.b.i r0 = r11.mo19701a(r0)
            r10 = 6
            r11.mo19712b(r0, r5, r1, r10)
        L_0x02ce:
            r38 = r2
            r35 = r13
            r39 = r24
            r37 = r26
            r24 = r5
            r26 = r7
            goto L_0x0362
        L_0x02dc:
            r10 = 6
            androidx.constraintlayout.solver.widgets.f r1 = r15.f1900M
            if (r1 == 0) goto L_0x02ea
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1886D
            e.f.b.i r1 = r11.mo19701a(r1)
            r16 = r1
            goto L_0x02ec
        L_0x02ea:
            r16 = r33
        L_0x02ec:
            androidx.constraintlayout.solver.widgets.f r1 = r15.f1900M
            if (r1 == 0) goto L_0x02f9
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1882B
            e.f.b.i r1 = r11.mo19701a(r1)
            r17 = r1
            goto L_0x02fb
        L_0x02f9:
            r17 = r33
        L_0x02fb:
            boolean[] r1 = r15.f1924f
            r19 = 0
            boolean r3 = r1[r19]
            androidx.constraintlayout.solver.widgets.f$b[] r1 = r15.f1899L
            r6 = r1[r19]
            androidx.constraintlayout.solver.widgets.e r8 = r15.f1882B
            androidx.constraintlayout.solver.widgets.e r9 = r15.f1886D
            int r1 = r15.f1905R
            r21 = 6
            r10 = r1
            int r1 = r15.f1919c0
            r34 = r3
            r3 = 0
            r12 = r1
            int[] r1 = r15.f1960x
            r1 = r1[r3]
            r35 = r13
            r13 = r1
            float r1 = r15.f1927g0
            r14 = r1
            int r1 = r15.f1940n
            r19 = r1
            int r1 = r15.f1942o
            r20 = r1
            float r1 = r15.f1944p
            r21 = r1
            r36 = r0
            r0 = r40
            r37 = r26
            r1 = r41
            r38 = r2
            r2 = r36
            r39 = r24
            r4 = r17
            r24 = r5
            r5 = r16
            r26 = r7
            r7 = r31
            r11 = r22
            r15 = r25
            r16 = r18
            r17 = r27
            r18 = r28
            r22 = r32
            r3 = r34
            r0.m1936a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0360
        L_0x0354:
            r38 = r2
            r35 = r13
            r39 = r24
            r37 = r26
            r24 = r5
            r26 = r7
        L_0x0360:
            r15 = r40
        L_0x0362:
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r15.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r0.f1818h
            boolean r2 = r1.f1789j
            if (r2 == 0) goto L_0x03b2
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1819i
            boolean r0 = r0.f1789j
            if (r0 == 0) goto L_0x03b2
            int r0 = r1.f1786g
            r11 = r41
            r7 = r39
            r11.mo19706a(r7, r0)
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r15.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1819i
            int r0 = r0.f1786g
            r5 = r38
            r11.mo19706a(r5, r0)
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r15.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1808k
            int r0 = r0.f1786g
            r1 = r37
            r11.mo19706a(r1, r0)
            androidx.constraintlayout.solver.widgets.f r0 = r15.f1900M
            if (r0 == 0) goto L_0x03ad
            if (r23 != 0) goto L_0x03ad
            if (r35 == 0) goto L_0x03ad
            boolean[] r2 = r15.f1924f
            r4 = 1
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x03aa
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1888E
            e.f.b.i r0 = r11.mo19701a(r0)
            r2 = 6
            r3 = 0
            r11.mo19712b(r0, r5, r3, r2)
            goto L_0x03b0
        L_0x03aa:
            r2 = 6
            r3 = 0
            goto L_0x03b0
        L_0x03ad:
            r2 = 6
            r3 = 0
            r4 = 1
        L_0x03b0:
            r12 = 0
            goto L_0x03be
        L_0x03b2:
            r11 = r41
            r1 = r37
            r5 = r38
            r7 = r39
            r2 = 6
            r3 = 0
            r4 = 1
            r12 = 1
        L_0x03be:
            int r0 = r15.f1928h
            r6 = 2
            if (r0 != r6) goto L_0x03c4
            r12 = 0
        L_0x03c4:
            if (r12 == 0) goto L_0x047a
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r15.f1899L
            r0 = r0[r4]
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r0 != r6) goto L_0x03d5
            boolean r0 = r15 instanceof androidx.constraintlayout.solver.widgets.C0447g
            if (r0 == 0) goto L_0x03d5
            r16 = 1
            goto L_0x03d7
        L_0x03d5:
            r16 = 0
        L_0x03d7:
            if (r29 == 0) goto L_0x03e3
            int r0 = r15.f1956v
            if (r0 == r4) goto L_0x03e0
            r6 = -1
            if (r0 != r6) goto L_0x03e3
        L_0x03e0:
            r17 = 1
            goto L_0x03e5
        L_0x03e3:
            r17 = 0
        L_0x03e5:
            int r0 = r15.f1917b0
            if (r0 <= 0) goto L_0x0414
            androidx.constraintlayout.solver.widgets.e r0 = r15.f1890F
            androidx.constraintlayout.solver.widgets.n r0 = r0.mo2517e()
            int r0 = r0.f2051b
            if (r0 != r4) goto L_0x03fd
            androidx.constraintlayout.solver.widgets.e r0 = r15.f1890F
            androidx.constraintlayout.solver.widgets.n r0 = r0.mo2517e()
            r0.mo2657a(r11)
            goto L_0x041d
        L_0x03fd:
            int r0 = r40.mo2567c()
            r11.mo19698a(r1, r7, r0, r2)
            androidx.constraintlayout.solver.widgets.e r0 = r15.f1890F
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
            if (r0 == 0) goto L_0x041d
            e.f.b.i r0 = r11.mo19701a(r0)
            r11.mo19698a(r1, r0, r3, r2)
            r22 = 0
            goto L_0x041f
        L_0x0414:
            int r0 = r15.f1935k0
            r6 = 8
            if (r0 != r6) goto L_0x041d
            r11.mo19698a(r1, r7, r3, r2)
        L_0x041d:
            r22 = r32
        L_0x041f:
            androidx.constraintlayout.solver.widgets.f r0 = r15.f1900M
            if (r0 == 0) goto L_0x042c
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1888E
            e.f.b.i r0 = r11.mo19701a(r0)
            r18 = r0
            goto L_0x042e
        L_0x042c:
            r18 = r33
        L_0x042e:
            androidx.constraintlayout.solver.widgets.f r0 = r15.f1900M
            if (r0 == 0) goto L_0x043a
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1884C
            e.f.b.i r0 = r11.mo19701a(r0)
            r33 = r0
        L_0x043a:
            boolean[] r0 = r15.f1924f
            boolean r3 = r0[r4]
            androidx.constraintlayout.solver.widgets.f$b[] r0 = r15.f1899L
            r6 = r0[r4]
            androidx.constraintlayout.solver.widgets.e r8 = r15.f1884C
            androidx.constraintlayout.solver.widgets.e r9 = r15.f1888E
            int r10 = r15.f1906S
            int r12 = r15.f1921d0
            int[] r0 = r15.f1960x
            r13 = r0[r4]
            float r14 = r15.f1929h0
            int r0 = r15.f1946q
            r19 = r0
            int r0 = r15.f1948r
            r20 = r0
            float r0 = r15.f1950s
            r21 = r0
            r0 = r40
            r1 = r41
            r2 = r35
            r4 = r33
            r25 = r5
            r5 = r18
            r31 = r7
            r7 = r16
            r11 = r30
            r15 = r17
            r16 = r23
            r17 = r28
            r18 = r27
            r0.m1936a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x047e
        L_0x047a:
            r25 = r5
            r31 = r7
        L_0x047e:
            if (r29 == 0) goto L_0x04a9
            r6 = 6
            r7 = r40
            int r0 = r7.f1956v
            r1 = 1
            if (r0 != r1) goto L_0x0498
            float r5 = r7.f1958w
            r0 = r41
            r1 = r25
            r2 = r31
            r3 = r24
            r4 = r26
            r0.mo19709a(r1, r2, r3, r4, r5, r6)
            goto L_0x04ab
        L_0x0498:
            float r5 = r7.f1958w
            r6 = 6
            r0 = r41
            r1 = r24
            r2 = r26
            r3 = r25
            r4 = r31
            r0.mo19709a(r1, r2, r3, r4, r5, r6)
            goto L_0x04ab
        L_0x04a9:
            r7 = r40
        L_0x04ab:
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1896I
            boolean r0 = r0.mo2522j()
            if (r0 == 0) goto L_0x04d3
            androidx.constraintlayout.solver.widgets.e r0 = r7.f1896I
            androidx.constraintlayout.solver.widgets.e r0 = r0.mo2520h()
            androidx.constraintlayout.solver.widgets.f r0 = r0.mo2516d()
            float r1 = r7.f1962y
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.solver.widgets.e r2 = r7.f1896I
            int r2 = r2.mo2514b()
            r3 = r41
            r3.mo19702a(r7, r0, r1, r2)
        L_0x04d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0444f.mo2501a(e.f.b.e):void");
    }

    /* renamed from: a */
    public void mo2556a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f1956v == -1) {
            if (z3 && !z4) {
                this.f1956v = 0;
            } else if (!z3 && z4) {
                this.f1956v = 1;
                if (this.f1904Q == -1) {
                    this.f1958w = 1.0f / this.f1958w;
                }
            }
        }
        if (this.f1956v == 0 && (!this.f1884C.mo2522j() || !this.f1888E.mo2522j())) {
            this.f1956v = 1;
        } else if (this.f1956v == 1 && (!this.f1882B.mo2522j() || !this.f1886D.mo2522j())) {
            this.f1956v = 0;
        }
        if (this.f1956v == -1 && (!this.f1884C.mo2522j() || !this.f1888E.mo2522j() || !this.f1882B.mo2522j() || !this.f1886D.mo2522j())) {
            if (this.f1884C.mo2522j() && this.f1888E.mo2522j()) {
                this.f1956v = 0;
            } else if (this.f1882B.mo2522j() && this.f1886D.mo2522j()) {
                this.f1958w = 1.0f / this.f1958w;
                this.f1956v = 1;
            }
        }
        if (this.f1956v == -1) {
            if (z && !z2) {
                this.f1956v = 0;
            } else if (!z && z2) {
                this.f1958w = 1.0f / this.f1958w;
                this.f1956v = 1;
            }
        }
        if (this.f1956v == -1) {
            if (this.f1940n > 0 && this.f1946q == 0) {
                this.f1956v = 0;
            } else if (this.f1940n == 0 && this.f1946q > 0) {
                this.f1958w = 1.0f / this.f1958w;
                this.f1956v = 1;
            }
        }
        if (this.f1956v == -1 && z && z2) {
            this.f1958w = 1.0f / this.f1958w;
            this.f1956v = 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0116  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1936a(p214e.p229f.p232b.C7600e r25, boolean r26, boolean r27, p214e.p229f.p232b.C7605i r28, p214e.p229f.p232b.C7605i r29, androidx.constraintlayout.solver.widgets.C0444f.C0446b r30, boolean r31, androidx.constraintlayout.solver.widgets.C0439e r32, androidx.constraintlayout.solver.widgets.C0439e r33, int r34, int r35, int r36, int r37, float r38, boolean r39, boolean r40, int r41, int r42, int r43, int r44, float r45, boolean r46) {
        /*
            r24 = this;
            r0 = r24
            r10 = r25
            r11 = r28
            r12 = r29
            r13 = r32
            r14 = r33
            r1 = r36
            r2 = r37
            r3 = r42
            e.f.b.i r15 = r10.mo19701a(r13)
            e.f.b.i r9 = r10.mo19701a(r14)
            androidx.constraintlayout.solver.widgets.e r4 = r32.mo2520h()
            e.f.b.i r8 = r10.mo19701a(r4)
            androidx.constraintlayout.solver.widgets.e r4 = r33.mo2520h()
            e.f.b.i r7 = r10.mo19701a(r4)
            boolean r4 = r10.f19128g
            r6 = 0
            r5 = 1
            if (r4 == 0) goto L_0x006a
            androidx.constraintlayout.solver.widgets.n r4 = r32.mo2517e()
            int r4 = r4.f2051b
            if (r4 != r5) goto L_0x006a
            androidx.constraintlayout.solver.widgets.n r4 = r33.mo2517e()
            int r4 = r4.f2051b
            if (r4 != r5) goto L_0x006a
            e.f.b.f r1 = p214e.p229f.p232b.C7600e.m18455h()
            if (r1 == 0) goto L_0x0051
            e.f.b.f r1 = p214e.p229f.p232b.C7600e.m18455h()
            long r2 = r1.f19159s
            r4 = 1
            long r2 = r2 + r4
            r1.f19159s = r2
        L_0x0051:
            androidx.constraintlayout.solver.widgets.n r1 = r32.mo2517e()
            r1.mo2657a(r10)
            androidx.constraintlayout.solver.widgets.n r1 = r33.mo2517e()
            r1.mo2657a(r10)
            if (r40 != 0) goto L_0x0069
            if (r26 == 0) goto L_0x0069
            if (r27 == 0) goto L_0x0069
            r1 = 6
            r10.mo19712b(r12, r9, r6, r1)
        L_0x0069:
            return
        L_0x006a:
            e.f.b.f r4 = p214e.p229f.p232b.C7600e.m18455h()
            if (r4 == 0) goto L_0x007f
            e.f.b.f r4 = p214e.p229f.p232b.C7600e.m18455h()
            r19 = r7
            long r6 = r4.f19138A
            r16 = 1
            long r6 = r6 + r16
            r4.f19138A = r6
            goto L_0x0081
        L_0x007f:
            r19 = r7
        L_0x0081:
            boolean r16 = r32.mo2522j()
            boolean r17 = r33.mo2522j()
            androidx.constraintlayout.solver.widgets.e r4 = r0.f1896I
            boolean r20 = r4.mo2522j()
            if (r16 == 0) goto L_0x0093
            r4 = 1
            goto L_0x0094
        L_0x0093:
            r4 = 0
        L_0x0094:
            if (r17 == 0) goto L_0x0098
            int r4 = r4 + 1
        L_0x0098:
            if (r20 == 0) goto L_0x009c
            int r4 = r4 + 1
        L_0x009c:
            r7 = r4
            if (r39 == 0) goto L_0x00a1
            r4 = 3
            goto L_0x00a3
        L_0x00a1:
            r4 = r41
        L_0x00a3:
            int[] r21 = androidx.constraintlayout.solver.widgets.C0444f.C0445a.f1967b
            int r22 = r30.ordinal()
            r6 = r21[r22]
            r12 = 2
            if (r6 == r5) goto L_0x00b6
            if (r6 == r12) goto L_0x00b6
            r12 = 3
            if (r6 == r12) goto L_0x00b6
            r12 = 4
            if (r6 == r12) goto L_0x00b8
        L_0x00b6:
            r6 = 0
            goto L_0x00bc
        L_0x00b8:
            if (r4 != r12) goto L_0x00bb
            goto L_0x00b6
        L_0x00bb:
            r6 = 1
        L_0x00bc:
            int r12 = r0.f1935k0
            r5 = 8
            if (r12 != r5) goto L_0x00c5
            r5 = 0
            r6 = 0
            goto L_0x00c7
        L_0x00c5:
            r5 = r35
        L_0x00c7:
            if (r46 == 0) goto L_0x00e4
            if (r16 != 0) goto L_0x00d5
            if (r17 != 0) goto L_0x00d5
            if (r20 != 0) goto L_0x00d5
            r12 = r34
            r10.mo19706a(r15, r12)
            goto L_0x00e4
        L_0x00d5:
            if (r16 == 0) goto L_0x00e4
            if (r17 != 0) goto L_0x00e4
            int r12 = r32.mo2514b()
            r22 = r7
            r7 = 6
            r10.mo19698a(r15, r8, r12, r7)
            goto L_0x00e7
        L_0x00e4:
            r22 = r7
            r7 = 6
        L_0x00e7:
            if (r6 != 0) goto L_0x0116
            if (r31 == 0) goto L_0x00ff
            r7 = 0
            r12 = 3
            r10.mo19698a(r9, r15, r7, r12)
            r5 = 6
            if (r1 <= 0) goto L_0x00f6
            r10.mo19712b(r9, r15, r1, r5)
        L_0x00f6:
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r7) goto L_0x0104
            r10.mo19715c(r9, r15, r2, r5)
            goto L_0x0104
        L_0x00ff:
            r2 = 6
            r12 = 3
            r10.mo19698a(r9, r15, r5, r2)
        L_0x0104:
            r0 = r27
            r3 = r43
            r2 = r44
            r31 = r4
            r12 = r6
            r23 = r8
            r14 = r9
            r13 = r19
            r1 = r22
            goto L_0x020a
        L_0x0116:
            r12 = 3
            r2 = -2
            r7 = r43
            if (r7 != r2) goto L_0x0120
            r7 = r44
            r12 = r5
            goto L_0x0123
        L_0x0120:
            r12 = r7
            r7 = r44
        L_0x0123:
            if (r7 != r2) goto L_0x0127
            r2 = r5
            goto L_0x0128
        L_0x0127:
            r2 = r7
        L_0x0128:
            if (r12 <= 0) goto L_0x013c
            if (r26 == 0) goto L_0x0131
            r7 = 1
            if (r4 != r7) goto L_0x0131
            r7 = 0
            goto L_0x0132
        L_0x0131:
            r7 = 1
        L_0x0132:
            if (r7 == 0) goto L_0x0138
            r7 = 6
            r10.mo19712b(r9, r15, r12, r7)
        L_0x0138:
            int r5 = java.lang.Math.max(r5, r12)
        L_0x013c:
            if (r2 <= 0) goto L_0x0152
            if (r26 == 0) goto L_0x0145
            r7 = 1
            if (r4 != r7) goto L_0x0145
            r7 = 0
            goto L_0x0146
        L_0x0145:
            r7 = 1
        L_0x0146:
            if (r7 == 0) goto L_0x014d
            r7 = 6
            r10.mo19715c(r9, r15, r2, r7)
            goto L_0x014e
        L_0x014d:
            r7 = 6
        L_0x014e:
            int r5 = java.lang.Math.min(r5, r2)
        L_0x0152:
            r7 = 1
            if (r4 != r7) goto L_0x017a
            if (r26 == 0) goto L_0x015e
            r7 = 6
            r10.mo19698a(r9, r15, r5, r7)
            r7 = 1
            r14 = 4
            goto L_0x016c
        L_0x015e:
            r7 = 6
            if (r40 == 0) goto L_0x0167
            r14 = 4
            r10.mo19698a(r9, r15, r5, r14)
            r7 = 1
            goto L_0x016c
        L_0x0167:
            r7 = 1
            r14 = 4
            r10.mo19698a(r9, r15, r5, r7)
        L_0x016c:
            r3 = r27
            r31 = r4
            r0 = r5
            r23 = r8
            r14 = r9
            r13 = r19
            r1 = r22
            goto L_0x01ee
        L_0x017a:
            r7 = 2
            r14 = 4
            if (r4 != r7) goto L_0x01e3
            androidx.constraintlayout.solver.widgets.e$d r6 = r32.mo2521i()
            androidx.constraintlayout.solver.widgets.e$d r7 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP
            if (r6 == r7) goto L_0x01a8
            androidx.constraintlayout.solver.widgets.e$d r6 = r32.mo2521i()
            androidx.constraintlayout.solver.widgets.e$d r7 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM
            if (r6 != r7) goto L_0x018f
            goto L_0x01a8
        L_0x018f:
            androidx.constraintlayout.solver.widgets.f r6 = r0.f1900M
            androidx.constraintlayout.solver.widgets.e$d r7 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT
            androidx.constraintlayout.solver.widgets.e r6 = r6.mo2539a(r7)
            e.f.b.i r6 = r10.mo19701a(r6)
            androidx.constraintlayout.solver.widgets.f r7 = r0.f1900M
            androidx.constraintlayout.solver.widgets.e$d r14 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT
            androidx.constraintlayout.solver.widgets.e r7 = r7.mo2539a(r14)
            e.f.b.i r7 = r10.mo19701a(r7)
            goto L_0x01c0
        L_0x01a8:
            androidx.constraintlayout.solver.widgets.f r6 = r0.f1900M
            androidx.constraintlayout.solver.widgets.e$d r7 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP
            androidx.constraintlayout.solver.widgets.e r6 = r6.mo2539a(r7)
            e.f.b.i r6 = r10.mo19701a(r6)
            androidx.constraintlayout.solver.widgets.f r7 = r0.f1900M
            androidx.constraintlayout.solver.widgets.e$d r14 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM
            androidx.constraintlayout.solver.widgets.e r7 = r7.mo2539a(r14)
            e.f.b.i r7 = r10.mo19701a(r7)
        L_0x01c0:
            r14 = r6
            e.f.b.b r6 = r25.mo19711b()
            r13 = r4
            r4 = r6
            r0 = r5
            r3 = 6
            r5 = r9
            r3 = r6
            r31 = r13
            r13 = 0
            r6 = r15
            r13 = r19
            r1 = r22
            r23 = r8
            r8 = r14
            r14 = r9
            r9 = r45
            r4.mo19678a(r5, r6, r7, r8, r9)
            r10.mo19703a(r3)
            r3 = r27
            r6 = 0
            goto L_0x01ee
        L_0x01e3:
            r31 = r4
            r0 = r5
            r23 = r8
            r14 = r9
            r13 = r19
            r1 = r22
            r3 = 1
        L_0x01ee:
            if (r6 == 0) goto L_0x0207
            r4 = 2
            if (r1 == r4) goto L_0x0207
            if (r39 != 0) goto L_0x0207
            int r0 = java.lang.Math.max(r12, r0)
            if (r2 <= 0) goto L_0x01ff
            int r0 = java.lang.Math.min(r2, r0)
        L_0x01ff:
            r4 = 6
            r10.mo19698a(r14, r15, r0, r4)
            r0 = r3
            r3 = r12
            r12 = 0
            goto L_0x020a
        L_0x0207:
            r0 = r3
            r3 = r12
            r12 = r6
        L_0x020a:
            if (r46 == 0) goto L_0x0354
            if (r40 == 0) goto L_0x0210
            goto L_0x0354
        L_0x0210:
            if (r16 != 0) goto L_0x0217
            if (r17 != 0) goto L_0x0217
            if (r20 != 0) goto L_0x0217
            goto L_0x021b
        L_0x0217:
            if (r16 == 0) goto L_0x0221
            if (r17 != 0) goto L_0x0221
        L_0x021b:
            r27 = r0
            r0 = 6
            r1 = 0
            goto L_0x034a
        L_0x0221:
            r9 = 5
            if (r16 != 0) goto L_0x0237
            if (r17 == 0) goto L_0x0237
            int r1 = r33.mo2514b()
            int r1 = -r1
            r2 = 6
            r10.mo19698a(r14, r13, r1, r2)
            if (r26 == 0) goto L_0x021b
            r1 = 0
            r10.mo19712b(r15, r11, r1, r9)
            goto L_0x0347
        L_0x0237:
            r1 = 0
            if (r16 == 0) goto L_0x0347
            if (r17 == 0) goto L_0x0347
            if (r12 == 0) goto L_0x02c0
            if (r26 == 0) goto L_0x0247
            if (r36 != 0) goto L_0x0247
            r4 = 6
            r10.mo19712b(r14, r15, r1, r4)
            goto L_0x0248
        L_0x0247:
            r4 = 6
        L_0x0248:
            if (r31 != 0) goto L_0x0274
            if (r2 > 0) goto L_0x0252
            if (r3 <= 0) goto L_0x024f
            goto L_0x0252
        L_0x024f:
            r1 = 6
            r6 = 0
            goto L_0x0254
        L_0x0252:
            r1 = 4
            r6 = 1
        L_0x0254:
            int r5 = r32.mo2514b()
            r8 = r23
            r10.mo19698a(r15, r8, r5, r1)
            int r5 = r33.mo2514b()
            int r5 = -r5
            r10.mo19698a(r14, r13, r5, r1)
            if (r2 > 0) goto L_0x026c
            if (r3 <= 0) goto L_0x026a
            goto L_0x026c
        L_0x026a:
            r1 = 0
            goto L_0x026d
        L_0x026c:
            r1 = 1
        L_0x026d:
            r17 = r6
            r6 = 6
            r7 = 1
            r16 = 5
            goto L_0x0281
        L_0x0274:
            r6 = r31
            r8 = r23
            r7 = 1
            if (r6 != r7) goto L_0x0284
            r1 = 1
            r6 = 6
            r16 = 6
            r17 = 1
        L_0x0281:
            r5 = r24
            goto L_0x02cb
        L_0x0284:
            r1 = 3
            if (r6 != r1) goto L_0x02bb
            r1 = r42
            r3 = 2
            r6 = 6
            if (r1 == r3) goto L_0x0292
            if (r1 != r7) goto L_0x0290
            goto L_0x0292
        L_0x0290:
            r1 = 0
            goto L_0x0293
        L_0x0292:
            r1 = 1
        L_0x0293:
            r5 = r24
            if (r1 != 0) goto L_0x02b4
            if (r39 != 0) goto L_0x02a2
            int r1 = r5.f1956v
            r3 = -1
            if (r1 == r3) goto L_0x02a2
            if (r2 > 0) goto L_0x02a2
            r1 = 6
            goto L_0x02a3
        L_0x02a2:
            r1 = 4
        L_0x02a3:
            int r2 = r32.mo2514b()
            r10.mo19698a(r15, r8, r2, r1)
            int r2 = r33.mo2514b()
            int r2 = -r2
            r10.mo19698a(r14, r13, r2, r1)
            r1 = 1
            goto L_0x02b5
        L_0x02b4:
            r1 = 0
        L_0x02b5:
            r17 = r1
            r1 = 1
            r16 = 5
            goto L_0x02cb
        L_0x02bb:
            r6 = 6
            r5 = r24
            r1 = 0
            goto L_0x02c7
        L_0x02c0:
            r8 = r23
            r6 = 6
            r7 = 1
            r5 = r24
            r1 = 1
        L_0x02c7:
            r16 = 5
            r17 = 0
        L_0x02cb:
            if (r1 == 0) goto L_0x030f
            int r4 = r32.mo2514b()
            int r18 = r33.mo2514b()
            r1 = r25
            r2 = r15
            r3 = r8
            r5 = r38
            r27 = r0
            r0 = 6
            r6 = r13
            r19 = 1
            r7 = r14
            r0 = r8
            r8 = r18
            r18 = 5
            r9 = r16
            r1.mo19707a(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r32
            androidx.constraintlayout.solver.widgets.e r2 = r1.f1855d
            androidx.constraintlayout.solver.widgets.f r2 = r2.f1853b
            boolean r2 = r2 instanceof androidx.constraintlayout.solver.widgets.C0436b
            r3 = r33
            androidx.constraintlayout.solver.widgets.e r4 = r3.f1855d
            androidx.constraintlayout.solver.widgets.f r4 = r4.f1853b
            boolean r4 = r4 instanceof androidx.constraintlayout.solver.widgets.C0436b
            if (r2 == 0) goto L_0x0307
            if (r4 != 0) goto L_0x0307
            r19 = r26
            r2 = 1
            r5 = 5
            r18 = 6
            goto L_0x031d
        L_0x0307:
            if (r2 != 0) goto L_0x0318
            if (r4 == 0) goto L_0x0318
            r2 = r26
            r5 = 6
            goto L_0x031d
        L_0x030f:
            r1 = r32
            r3 = r33
            r27 = r0
            r0 = r8
            r18 = 5
        L_0x0318:
            r2 = r26
            r19 = r2
            r5 = 5
        L_0x031d:
            if (r17 == 0) goto L_0x0322
            r4 = 6
            r5 = 6
            goto L_0x0324
        L_0x0322:
            r4 = r18
        L_0x0324:
            if (r12 != 0) goto L_0x0328
            if (r19 != 0) goto L_0x032a
        L_0x0328:
            if (r17 == 0) goto L_0x0331
        L_0x032a:
            int r1 = r32.mo2514b()
            r10.mo19712b(r15, r0, r1, r5)
        L_0x0331:
            if (r12 != 0) goto L_0x0335
            if (r2 != 0) goto L_0x0337
        L_0x0335:
            if (r17 == 0) goto L_0x033f
        L_0x0337:
            int r0 = r33.mo2514b()
            int r0 = -r0
            r10.mo19715c(r14, r13, r0, r4)
        L_0x033f:
            r0 = 6
            r1 = 0
            if (r26 == 0) goto L_0x034a
            r10.mo19712b(r15, r11, r1, r0)
            goto L_0x034a
        L_0x0347:
            r27 = r0
            r0 = 6
        L_0x034a:
            if (r26 == 0) goto L_0x0353
            if (r27 == 0) goto L_0x0353
            r2 = r29
            r10.mo19712b(r2, r14, r1, r0)
        L_0x0353:
            return
        L_0x0354:
            r2 = r29
            r27 = r0
            r4 = r1
            r0 = 6
            r1 = 0
            r3 = 2
            if (r4 >= r3) goto L_0x0368
            if (r26 == 0) goto L_0x0368
            if (r27 == 0) goto L_0x0368
            r10.mo19712b(r15, r11, r1, r0)
            r10.mo19712b(r2, r14, r1, r0)
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0444f.m1936a(e.f.b.e, boolean, boolean, e.f.b.i, e.f.b.i, androidx.constraintlayout.solver.widgets.f$b, boolean, androidx.constraintlayout.solver.widgets.e, androidx.constraintlayout.solver.widgets.e, int, int, int, int, float, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: a */
    public void mo2500a(C0444f fVar, HashMap<C0444f, C0444f> hashMap) {
        this.f1926g = fVar.f1926g;
        this.f1928h = fVar.f1928h;
        C0444f fVar2 = null;
        this.f1930i = fVar.f1930i == null ? null : new C0457o();
        this.f1932j = fVar.f1932j == null ? null : new C0457o();
        this.f1934k = fVar.f1934k;
        this.f1936l = fVar.f1936l;
        int[] iArr = this.f1938m;
        int[] iArr2 = fVar.f1938m;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f1940n = fVar.f1940n;
        this.f1942o = fVar.f1942o;
        this.f1946q = fVar.f1946q;
        this.f1948r = fVar.f1948r;
        this.f1950s = fVar.f1950s;
        this.f1952t = fVar.f1952t;
        this.f1954u = fVar.f1954u;
        this.f1956v = fVar.f1956v;
        this.f1958w = fVar.f1958w;
        int[] iArr3 = fVar.f1960x;
        this.f1960x = Arrays.copyOf(iArr3, iArr3.length);
        this.f1962y = fVar.f1962y;
        this.f1964z = fVar.f1964z;
        this.f1880A = fVar.f1880A;
        this.f1882B.mo2523k();
        this.f1884C.mo2523k();
        this.f1886D.mo2523k();
        this.f1888E.mo2523k();
        this.f1890F.mo2523k();
        this.f1892G.mo2523k();
        this.f1894H.mo2523k();
        this.f1896I.mo2523k();
        this.f1899L = (C0446b[]) Arrays.copyOf(this.f1899L, 2);
        this.f1900M = this.f1900M == null ? null : (C0444f) hashMap.get(fVar.f1900M);
        this.f1901N = fVar.f1901N;
        this.f1902O = fVar.f1902O;
        this.f1903P = fVar.f1903P;
        this.f1904Q = fVar.f1904Q;
        this.f1905R = fVar.f1905R;
        this.f1906S = fVar.f1906S;
        this.f1907T = fVar.f1907T;
        this.f1908U = fVar.f1908U;
        this.f1909V = fVar.f1909V;
        this.f1910W = fVar.f1910W;
        this.f1911X = fVar.f1911X;
        this.f1912Y = fVar.f1912Y;
        this.f1913Z = fVar.f1913Z;
        this.f1915a0 = fVar.f1915a0;
        this.f1917b0 = fVar.f1917b0;
        this.f1919c0 = fVar.f1919c0;
        this.f1921d0 = fVar.f1921d0;
        this.f1923e0 = fVar.f1923e0;
        this.f1925f0 = fVar.f1925f0;
        this.f1927g0 = fVar.f1927g0;
        this.f1929h0 = fVar.f1929h0;
        this.f1931i0 = fVar.f1931i0;
        this.f1933j0 = fVar.f1933j0;
        this.f1935k0 = fVar.f1935k0;
        this.f1937l0 = fVar.f1937l0;
        this.f1939m0 = fVar.f1939m0;
        this.f1941n0 = fVar.f1941n0;
        this.f1943o0 = fVar.f1943o0;
        this.f1945p0 = fVar.f1945p0;
        this.f1947q0 = fVar.f1947q0;
        this.f1949r0 = fVar.f1949r0;
        this.f1951s0 = fVar.f1951s0;
        this.f1953t0 = fVar.f1953t0;
        this.f1955u0 = fVar.f1955u0;
        this.f1957v0 = fVar.f1957v0;
        this.f1959w0 = fVar.f1959w0;
        this.f1961x0 = fVar.f1961x0;
        this.f1963y0 = fVar.f1963y0;
        this.f1965z0 = fVar.f1965z0;
        this.f1881A0 = fVar.f1881A0;
        this.f1883B0 = fVar.f1883B0;
        this.f1885C0 = fVar.f1885C0;
        float[] fArr = this.f1887D0;
        float[] fArr2 = fVar.f1887D0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        C0444f[] fVarArr = this.f1889E0;
        C0444f[] fVarArr2 = fVar.f1889E0;
        fVarArr[0] = fVarArr2[0];
        fVarArr[1] = fVarArr2[1];
        C0444f[] fVarArr3 = this.f1891F0;
        C0444f[] fVarArr4 = fVar.f1891F0;
        fVarArr3[0] = fVarArr4[0];
        fVarArr3[1] = fVarArr4[1];
        C0444f fVar3 = fVar.f1893G0;
        this.f1893G0 = fVar3 == null ? null : (C0444f) hashMap.get(fVar3);
        C0444f fVar4 = fVar.f1895H0;
        if (fVar4 != null) {
            fVar2 = (C0444f) hashMap.get(fVar4);
        }
        this.f1895H0 = fVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r0 < r8) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        if (r2 < r8) goto L_0x0076;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2555a(boolean r8, boolean r9) {
        /*
            r7 = this;
            androidx.constraintlayout.solver.widgets.analyzer.h r0 = r7.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r0.f1818h
            int r1 = r1.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.j r2 = r7.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r2.f1818h
            int r3 = r3.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r0.f1819i
            int r0 = r0.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = r2.f1819i
            int r2 = r2.f1786g
            int r4 = r0 - r1
            int r5 = r2 - r3
            r6 = 0
            if (r4 < 0) goto L_0x0032
            if (r5 < 0) goto L_0x0032
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L_0x0032
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto L_0x0032
            if (r3 == r4) goto L_0x0032
            if (r3 == r5) goto L_0x0032
            if (r0 == r4) goto L_0x0032
            if (r0 == r5) goto L_0x0032
            if (r2 == r4) goto L_0x0032
            if (r2 != r5) goto L_0x0036
        L_0x0032:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0036:
            int r0 = r0 - r1
            int r2 = r2 - r3
            if (r8 == 0) goto L_0x003c
            r7.f1905R = r1
        L_0x003c:
            if (r9 == 0) goto L_0x0040
            r7.f1906S = r3
        L_0x0040:
            int r1 = r7.f1935k0
            r3 = 8
            if (r1 != r3) goto L_0x004b
            r7.f1901N = r6
            r7.f1902O = r6
            return
        L_0x004b:
            if (r8 == 0) goto L_0x0065
            androidx.constraintlayout.solver.widgets.f$b[] r8 = r7.f1899L
            r8 = r8[r6]
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            if (r8 != r1) goto L_0x005a
            int r8 = r7.f1901N
            if (r0 >= r8) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r8 = r0
        L_0x005b:
            r7.f1901N = r8
            int r8 = r7.f1901N
            int r0 = r7.f1919c0
            if (r8 >= r0) goto L_0x0065
            r7.f1901N = r0
        L_0x0065:
            if (r9 == 0) goto L_0x0080
            androidx.constraintlayout.solver.widgets.f$b[] r8 = r7.f1899L
            r9 = 1
            r8 = r8[r9]
            androidx.constraintlayout.solver.widgets.f$b r9 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            if (r8 != r9) goto L_0x0075
            int r8 = r7.f1902O
            if (r2 >= r8) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r8 = r2
        L_0x0076:
            r7.f1902O = r8
            int r8 = r7.f1902O
            int r9 = r7.f1921d0
            if (r8 >= r9) goto L_0x0080
            r7.f1902O = r9
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0444f.mo2555a(boolean, boolean):void");
    }
}

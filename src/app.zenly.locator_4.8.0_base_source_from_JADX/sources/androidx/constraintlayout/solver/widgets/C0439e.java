package androidx.constraintlayout.solver.widgets;

import p214e.p229f.p232b.C7598c;
import p214e.p229f.p232b.C7605i;
import p214e.p229f.p232b.C7605i.C7606a;

/* renamed from: androidx.constraintlayout.solver.widgets.e */
public class C0439e {

    /* renamed from: a */
    private C0456n f1852a = new C0456n(this);

    /* renamed from: b */
    public final C0444f f1853b;

    /* renamed from: c */
    public final C0443d f1854c;

    /* renamed from: d */
    public C0439e f1855d;

    /* renamed from: e */
    public int f1856e = 0;

    /* renamed from: f */
    int f1857f = -1;

    /* renamed from: g */
    private C0442c f1858g = C0442c.NONE;

    /* renamed from: h */
    private int f1859h;

    /* renamed from: i */
    C7605i f1860i;

    /* renamed from: androidx.constraintlayout.solver.widgets.e$a */
    static /* synthetic */ class C0440a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1861a = new int[C0443d.values().length];

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
                f1861a = r0
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BASELINE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f1861a     // Catch:{ NoSuchFieldError -> 0x006e }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.NONE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0439e.C0440a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.e$b */
    public enum C0441b {
        RELAXED,
        STRICT
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.e$c */
    public enum C0442c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.e$d */
    public enum C0443d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0439e(C0444f fVar, C0443d dVar) {
        C0441b bVar = C0441b.RELAXED;
        this.f1859h = 0;
        this.f1853b = fVar;
        this.f1854c = dVar;
    }

    /* renamed from: a */
    public void mo2508a(C7598c cVar) {
        C7605i iVar = this.f1860i;
        if (iVar == null) {
            this.f1860i = new C7605i(C7606a.UNRESTRICTED, null);
        } else {
            iVar.mo19722a();
        }
    }

    /* renamed from: b */
    public int mo2514b() {
        if (this.f1853b.mo2620z() == 8) {
            return 0;
        }
        if (this.f1857f > -1) {
            C0439e eVar = this.f1855d;
            if (eVar != null && eVar.f1853b.mo2620z() == 8) {
                return this.f1857f;
            }
        }
        return this.f1856e;
    }

    /* renamed from: c */
    public final C0439e mo2515c() {
        switch (C0440a.f1861a[this.f1854c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f1853b.f1886D;
            case 3:
                return this.f1853b.f1882B;
            case 4:
                return this.f1853b.f1888E;
            case 5:
                return this.f1853b.f1884C;
            default:
                throw new AssertionError(this.f1854c.name());
        }
    }

    /* renamed from: d */
    public C0444f mo2516d() {
        return this.f1853b;
    }

    /* renamed from: e */
    public C0456n mo2517e() {
        return this.f1852a;
    }

    /* renamed from: f */
    public C7605i mo2518f() {
        return this.f1860i;
    }

    /* renamed from: g */
    public C0442c mo2519g() {
        return this.f1858g;
    }

    /* renamed from: h */
    public C0439e mo2520h() {
        return this.f1855d;
    }

    /* renamed from: i */
    public C0443d mo2521i() {
        return this.f1854c;
    }

    /* renamed from: j */
    public boolean mo2522j() {
        return this.f1855d != null;
    }

    /* renamed from: k */
    public void mo2523k() {
        this.f1855d = null;
        this.f1856e = 0;
        this.f1857f = -1;
        this.f1858g = C0442c.STRONG;
        this.f1859h = 0;
        C0441b bVar = C0441b.RELAXED;
        this.f1852a.mo2661c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1853b.mo2580f());
        sb.append(":");
        sb.append(this.f1854c.toString());
        return sb.toString();
    }

    /* renamed from: a */
    public int mo2506a() {
        return this.f1859h;
    }

    /* renamed from: a */
    public boolean mo2513a(C0439e eVar, int i, C0442c cVar, int i2) {
        return mo2512a(eVar, i, -1, cVar, i2, false);
    }

    /* renamed from: a */
    public boolean mo2512a(C0439e eVar, int i, int i2, C0442c cVar, int i3, boolean z) {
        if (eVar == null) {
            this.f1855d = null;
            this.f1856e = 0;
            this.f1857f = -1;
            this.f1858g = C0442c.NONE;
            this.f1859h = 2;
            return true;
        } else if (!z && !mo2509a(eVar)) {
            return false;
        } else {
            this.f1855d = eVar;
            if (i > 0) {
                this.f1856e = i;
            } else {
                this.f1856e = 0;
            }
            this.f1857f = i2;
            this.f1858g = cVar;
            this.f1859h = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo2511a(C0439e eVar, int i, int i2) {
        return mo2512a(eVar, i, -1, C0442c.STRONG, i2, false);
    }

    /* renamed from: a */
    public boolean mo2510a(C0439e eVar, int i) {
        return mo2512a(eVar, i, -1, C0442c.STRONG, 0, false);
    }

    /* renamed from: a */
    public boolean mo2509a(C0439e eVar) {
        boolean z = false;
        if (eVar == null) {
            return false;
        }
        C0443d i = eVar.mo2521i();
        C0443d dVar = this.f1854c;
        if (i != dVar) {
            switch (C0440a.f1861a[dVar.ordinal()]) {
                case 1:
                    if (!(i == C0443d.BASELINE || i == C0443d.CENTER_X || i == C0443d.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case 2:
                case 3:
                    boolean z2 = i == C0443d.LEFT || i == C0443d.RIGHT;
                    if (eVar.mo2516d() instanceof C0451j) {
                        z2 = z2 || i == C0443d.CENTER_X;
                    }
                    return z2;
                case 4:
                case 5:
                    boolean z3 = i == C0443d.TOP || i == C0443d.BOTTOM;
                    if (eVar.mo2516d() instanceof C0451j) {
                        z3 = z3 || i == C0443d.CENTER_Y;
                    }
                    return z3;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f1854c.name());
            }
        } else if (dVar != C0443d.BASELINE || (eVar.mo2516d().mo2530F() && mo2516d().mo2530F())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo2507a(int i) {
        if (mo2522j()) {
            this.f1857f = i;
        }
    }
}

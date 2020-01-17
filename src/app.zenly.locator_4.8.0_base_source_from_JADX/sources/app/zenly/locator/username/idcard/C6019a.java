package app.zenly.locator.username.idcard;

import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12963e;
import kotlin.ranges.ClosedFloatingPointRange;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.username.idcard.a */
public final class C6019a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C6019a f15148f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C6019a f15149g;

    /* renamed from: h */
    public static final C6020a f15150h = new C6020a(null);

    /* renamed from: a */
    private final int f15151a;

    /* renamed from: b */
    private final C12963e f15152b;

    /* renamed from: c */
    private final ClosedFloatingPointRange<Float> f15153c;

    /* renamed from: d */
    private final ClosedFloatingPointRange<Float> f15154d;

    /* renamed from: e */
    private final int f15155e;

    /* renamed from: app.zenly.locator.username.idcard.a$a */
    public static final class C6020a {
        private C6020a() {
        }

        /* renamed from: a */
        public final C6019a mo13788a() {
            return C6019a.f15148f;
        }

        /* renamed from: b */
        public final C6019a mo13789b() {
            return C6019a.f15149g;
        }

        public /* synthetic */ C6020a(C12928f fVar) {
            this();
        }
    }

    static {
        C6019a aVar = new C6019a(2131230828, new C12963e(1, 10), C12971j.m33881a(0.15f, 0.6f), C12971j.m33881a(0.2f, 2.0f), 10);
        f15148f = aVar;
        C6019a aVar2 = new C6019a(C7674a.f19294a, new C12963e(0, 0), C12971j.m33881a(0.0f, 0.0f), C12971j.m33881a(0.0f, 0.0f), 0);
        f15149g = aVar2;
    }

    public C6019a(int i, C12963e eVar, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i2) {
        C12932j.m33818b(eVar, "speedRange");
        C12932j.m33818b(closedFloatingPointRange, "alphaRange");
        C12932j.m33818b(closedFloatingPointRange2, "scaleRange");
        this.f15151a = i;
        this.f15152b = eVar;
        this.f15153c = closedFloatingPointRange;
        this.f15154d = closedFloatingPointRange2;
        this.f15155e = i2;
    }

    /* renamed from: a */
    public final ClosedFloatingPointRange<Float> mo13780a() {
        return this.f15153c;
    }

    /* renamed from: b */
    public final int mo13781b() {
        return this.f15155e;
    }

    /* renamed from: c */
    public final int mo13782c() {
        return this.f15151a;
    }

    /* renamed from: d */
    public final ClosedFloatingPointRange<Float> mo13783d() {
        return this.f15154d;
    }

    /* renamed from: e */
    public final C12963e mo13784e() {
        return this.f15152b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6019a) {
                C6019a aVar = (C6019a) obj;
                if ((this.f15151a == aVar.f15151a) && C12932j.m33817a((Object) this.f15152b, (Object) aVar.f15152b) && C12932j.m33817a((Object) this.f15153c, (Object) aVar.f15153c) && C12932j.m33817a((Object) this.f15154d, (Object) aVar.f15154d)) {
                    if (this.f15155e == aVar.f15155e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int a = Integer.valueOf(this.f15151a).hashCode() * 31;
        C12963e eVar = this.f15152b;
        int i = 0;
        int hashCode = (a + (eVar != null ? eVar.hashCode() : 0)) * 31;
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f15153c;
        int hashCode2 = (hashCode + (closedFloatingPointRange != null ? closedFloatingPointRange.hashCode() : 0)) * 31;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.f15154d;
        if (closedFloatingPointRange2 != null) {
            i = closedFloatingPointRange2.hashCode();
        }
        return ((hashCode2 + i) * 31) + Integer.valueOf(this.f15155e).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BokehConfig(drawableResId=");
        sb.append(this.f15151a);
        sb.append(", speedRange=");
        sb.append(this.f15152b);
        sb.append(", alphaRange=");
        sb.append(this.f15153c);
        sb.append(", scaleRange=");
        sb.append(this.f15154d);
        sb.append(", count=");
        sb.append(this.f15155e);
        sb.append(")");
        return sb.toString();
    }
}

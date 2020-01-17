package p333g.p339c.p346c.p351d;

import com.facebook.common.internal.C9536j;
import java.util.Arrays;

/* renamed from: g.c.c.d.e */
public class C12049e {

    /* renamed from: a */
    private C12050a f31428a = C12050a.BITMAP_ONLY;

    /* renamed from: b */
    private boolean f31429b = false;

    /* renamed from: c */
    private float[] f31430c = null;

    /* renamed from: d */
    private int f31431d = 0;

    /* renamed from: e */
    private float f31432e = 0.0f;

    /* renamed from: f */
    private int f31433f = 0;

    /* renamed from: g */
    private float f31434g = 0.0f;

    /* renamed from: h */
    private boolean f31435h = false;

    /* renamed from: i */
    private boolean f31436i = false;

    /* renamed from: g.c.c.d.e$a */
    public enum C12050a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: j */
    private float[] m31816j() {
        if (this.f31430c == null) {
            this.f31430c = new float[8];
        }
        return this.f31430c;
    }

    /* renamed from: a */
    public C12049e mo35752a(boolean z) {
        this.f31429b = z;
        return this;
    }

    /* renamed from: b */
    public C12049e mo35755b(int i) {
        this.f31431d = i;
        this.f31428a = C12050a.OVERLAY_COLOR;
        return this;
    }

    /* renamed from: c */
    public float[] mo35756c() {
        return this.f31430c;
    }

    /* renamed from: d */
    public int mo35757d() {
        return this.f31431d;
    }

    /* renamed from: e */
    public float mo35758e() {
        return this.f31434g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12049e.class != obj.getClass()) {
            return false;
        }
        C12049e eVar = (C12049e) obj;
        if (this.f31429b == eVar.f31429b && this.f31431d == eVar.f31431d && Float.compare(eVar.f31432e, this.f31432e) == 0 && this.f31433f == eVar.f31433f && Float.compare(eVar.f31434g, this.f31434g) == 0 && this.f31428a == eVar.f31428a && this.f31435h == eVar.f31435h && this.f31436i == eVar.f31436i) {
            return Arrays.equals(this.f31430c, eVar.f31430c);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo35760f() {
        return this.f31436i;
    }

    /* renamed from: g */
    public boolean mo35761g() {
        return this.f31429b;
    }

    /* renamed from: h */
    public C12050a mo35762h() {
        return this.f31428a;
    }

    public int hashCode() {
        C12050a aVar = this.f31428a;
        int i = 0;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f31429b ? 1 : 0)) * 31;
        float[] fArr = this.f31430c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f31431d) * 31;
        float f = this.f31432e;
        int floatToIntBits = (((hashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f31433f) * 31;
        float f2 = this.f31434g;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return ((((floatToIntBits + i) * 31) + (this.f31435h ? 1 : 0)) * 31) + (this.f31436i ? 1 : 0);
    }

    /* renamed from: i */
    public boolean mo35764i() {
        return this.f31435h;
    }

    /* renamed from: a */
    public C12049e mo35750a(float f, float f2, float f3, float f4) {
        float[] j = m31816j();
        j[1] = f;
        j[0] = f;
        j[3] = f2;
        j[2] = f2;
        j[5] = f3;
        j[4] = f3;
        j[7] = f4;
        j[6] = f4;
        return this;
    }

    /* renamed from: b */
    public float mo35753b() {
        return this.f31432e;
    }

    /* renamed from: b */
    public C12049e mo35754b(float f) {
        C9536j.m23276a(f >= 0.0f, (Object) "the padding cannot be < 0");
        this.f31434g = f;
        return this;
    }

    /* renamed from: a */
    public C12049e mo35749a(float f) {
        C9536j.m23276a(f >= 0.0f, (Object) "the border width cannot be < 0");
        this.f31432e = f;
        return this;
    }

    /* renamed from: a */
    public C12049e mo35751a(int i) {
        this.f31433f = i;
        return this;
    }

    /* renamed from: a */
    public int mo35748a() {
        return this.f31433f;
    }
}

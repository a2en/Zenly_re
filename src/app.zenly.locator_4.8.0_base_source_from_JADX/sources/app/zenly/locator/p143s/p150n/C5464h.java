package app.zenly.locator.p143s.p150n;

import com.android.volley.toolbox.C8733j;
import java.util.Objects;

/* renamed from: app.zenly.locator.s.n.h */
public class C5464h {

    /* renamed from: a */
    public C5459d f14060a = new C5459d();

    /* renamed from: b */
    public C5459d f14061b = new C5459d();

    /* renamed from: c */
    public C5459d f14062c = new C5459d();

    /* renamed from: d */
    public C5459d f14063d = new C5459d();

    /* renamed from: e */
    private C5460e f14064e = new C5460e();

    /* renamed from: b */
    private double m15548b(double... dArr) {
        double d = Double.MAX_VALUE;
        for (int i = 0; i < dArr.length; i++) {
            if (!Double.isNaN(dArr[i])) {
                d = Math.min(d, dArr[i]);
            }
        }
        return d;
    }

    /* renamed from: a */
    public C5464h mo13081a(C5464h hVar) {
        this.f14060a.mo13061b(hVar.f14060a.mo13060b());
        this.f14060a.mo13063c(hVar.f14060a.mo13062c());
        this.f14061b.mo13061b(hVar.f14061b.mo13060b());
        this.f14061b.mo13063c(hVar.f14061b.mo13062c());
        this.f14062c.mo13061b(hVar.f14062c.mo13060b());
        this.f14062c.mo13063c(hVar.f14062c.mo13062c());
        this.f14063d.mo13061b(hVar.f14063d.mo13060b());
        this.f14063d.mo13063c(hVar.f14063d.mo13062c());
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5464h)) {
            return false;
        }
        boolean z = true;
        if (obj == this) {
            return true;
        }
        C5464h hVar = (C5464h) obj;
        if (!Objects.equals(this.f14060a, hVar.f14060a) || !Objects.equals(this.f14061b, hVar.f14061b) || !Objects.equals(this.f14062c, hVar.f14062c) || !Objects.equals(this.f14063d, hVar.f14063d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return m15547a(this.f14060a) + 90 + ((m15547a(this.f14061b) + 90) * C8733j.DEFAULT_IMAGE_TIMEOUT_MS) + ((m15547a(this.f14062c) + 180) * 1000000) + ((m15547a(this.f14063d) + 180) * 1000000000);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[topLeft [");
        sb.append(this.f14060a);
        sb.append("], topRight [");
        sb.append(this.f14061b);
        sb.append("], bottomLeft [");
        sb.append(this.f14062c);
        sb.append("], bottomRight [");
        sb.append(this.f14063d);
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a */
    public C5460e mo13080a() {
        this.f14064e.f14048a = m15546a(this.f14060a.mo13060b(), this.f14061b.mo13060b(), this.f14063d.mo13060b(), this.f14062c.mo13060b());
        this.f14064e.f14049b = m15548b(this.f14060a.mo13060b(), this.f14061b.mo13060b(), this.f14063d.mo13060b(), this.f14062c.mo13060b());
        this.f14064e.f14051d = m15548b(this.f14060a.mo13062c(), this.f14061b.mo13062c(), this.f14063d.mo13062c(), this.f14062c.mo13062c());
        this.f14064e.f14050c = m15546a(this.f14060a.mo13062c(), this.f14061b.mo13062c(), this.f14063d.mo13062c(), this.f14062c.mo13062c());
        return this.f14064e;
    }

    /* renamed from: a */
    private double m15546a(double... dArr) {
        double d = -1.7976931348623157E308d;
        for (int i = 0; i < dArr.length; i++) {
            if (!Double.isNaN(dArr[i])) {
                d = Math.max(d, dArr[i]);
            }
        }
        return d;
    }

    /* renamed from: a */
    private int m15547a(C5459d dVar) {
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}

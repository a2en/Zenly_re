package app.zenly.locator.support.p171t0.p173g.p175i.p178e.p183h;

import app.zenly.locator.support.p171t0.p173g.p175i.p178e.C5865c;
import com.snap.p327ui.recycling.p328d.C11722a;

/* renamed from: app.zenly.locator.support.t0.g.i.e.h.a */
public final class C5876a extends C11722a {

    /* renamed from: f */
    private final int f14857f;

    public C5876a(int i) {
        super(C5865c.EMPTY, (long) i);
        this.f14857f = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5876a) {
                if (this.f14857f == ((C5876a) obj).f14857f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo13562f() {
        return this.f14857f;
    }

    public int hashCode() {
        return Integer.valueOf(this.f14857f).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmptyViewModel(description=");
        sb.append(this.f14857f);
        sb.append(")");
        return sb.toString();
    }
}

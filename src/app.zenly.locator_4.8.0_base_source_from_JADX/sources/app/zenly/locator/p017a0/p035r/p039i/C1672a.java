package app.zenly.locator.p017a0.p035r.p039i;

import app.zenly.locator.p017a0.p035r.C1656d;
import com.snap.p327ui.recycling.p328d.C11722a;

/* renamed from: app.zenly.locator.a0.r.i.a */
public final class C1672a extends C11722a {

    /* renamed from: f */
    private final int f5714f;

    public C1672a(int i) {
        super(C1656d.EMPTY, (long) i);
        this.f5714f = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1672a) {
                if (this.f5714f == ((C1672a) obj).f5714f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo7275f() {
        return this.f5714f;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5714f).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmptyViewModel(description=");
        sb.append(this.f5714f);
        sb.append(")");
        return sb.toString();
    }
}

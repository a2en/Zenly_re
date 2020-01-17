package app.zenly.locator.p017a0.p030q.p034f;

import app.zenly.locator.p017a0.p030q.C1617b;
import com.snap.p327ui.recycling.p328d.C11722a;

/* renamed from: app.zenly.locator.a0.q.f.a */
public final class C1645a extends C11722a {

    /* renamed from: f */
    private final int f5661f;

    public C1645a(int i) {
        super(C1617b.EMPTY_INVITED, (long) i);
        this.f5661f = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1645a) {
                if (this.f5661f == ((C1645a) obj).f5661f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo7232f() {
        return this.f5661f;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5661f).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmptyViewModel(description=");
        sb.append(this.f5661f);
        sb.append(")");
        return sb.toString();
    }
}

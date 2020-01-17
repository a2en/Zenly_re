package app.zenly.locator.p017a0.p030q.p034f;

import app.zenly.locator.p017a0.p030q.C1617b;
import com.snap.p327ui.recycling.p328d.C11722a;

/* renamed from: app.zenly.locator.a0.q.f.b */
public final class C1646b extends C11722a {

    /* renamed from: f */
    private final int f5662f;

    public C1646b(int i) {
        super(C1617b.EMPTY_FRIEND, (long) i);
        this.f5662f = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1646b) {
                if (this.f5662f == ((C1646b) obj).f5662f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo7236f() {
        return this.f5662f;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5662f).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmptyWithButtonViewModel(description=");
        sb.append(this.f5662f);
        sb.append(")");
        return sb.toString();
    }
}

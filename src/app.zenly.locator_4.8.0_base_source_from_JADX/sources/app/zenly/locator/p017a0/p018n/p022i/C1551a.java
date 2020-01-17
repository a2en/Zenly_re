package app.zenly.locator.p017a0.p018n.p022i;

import app.zenly.locator.p017a0.p018n.C1537d;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.n.i.a */
public final class C1551a extends C11722a {

    /* renamed from: f */
    private final int f5467f;

    public C1551a(int i) {
        super(C1537d.BLOCKED_COUNT, 1);
        this.f5467f = i;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return this.f5467f == ((C1551a) aVar).f5467f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1551a) {
                if (this.f5467f == ((C1551a) obj).f5467f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo7090f() {
        return this.f5467f;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5467f).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BlockedUserCountViewModel(count=");
        sb.append(this.f5467f);
        sb.append(")");
        return sb.toString();
    }
}

package app.zenly.locator.p017a0.p030q.p034f;

import app.zenly.locator.p017a0.p030q.C1617b;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.q.f.e */
public final class C1649e extends C11722a {

    /* renamed from: f */
    private final int f5670f;

    public C1649e(int i) {
        super(C1617b.SECTION, (long) i);
        this.f5670f = i;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return this.f5670f == ((C1649e) aVar).f5670f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1649e) {
                if (this.f5670f == ((C1649e) obj).f5670f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo7251f() {
        return this.f5670f;
    }

    public int hashCode() {
        return Integer.valueOf(this.f5670f).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SectionViewModel(title=");
        sb.append(this.f5670f);
        sb.append(")");
        return sb.toString();
    }
}

package app.zenly.locator.p017a0.p024p.p029h;

import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.p.h.d */
public final class C1608d {

    /* renamed from: a */
    private final List<Integer> f5581a;

    /* renamed from: b */
    private final int f5582b;

    /* renamed from: app.zenly.locator.a0.p.h.d$a */
    public static final class C1609a {
        private C1609a() {
        }

        public /* synthetic */ C1609a(C12928f fVar) {
            this();
        }
    }

    static {
        new C1609a(null);
    }

    public C1608d(List<Integer> list, int i) {
        C12932j.m33818b(list, "segments");
        this.f5581a = list;
        this.f5582b = i;
    }

    /* renamed from: a */
    public final List<Integer> mo7176a() {
        return this.f5581a;
    }

    /* renamed from: b */
    public final int mo7177b() {
        return this.f5582b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1608d) {
                C1608d dVar = (C1608d) obj;
                if (C12932j.m33817a((Object) this.f5581a, (Object) dVar.f5581a)) {
                    if (this.f5582b == dVar.f5582b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<Integer> list = this.f5581a;
        return ((list != null ? list.hashCode() : 0) * 31) + Integer.valueOf(this.f5582b).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SegmentedBar(segments=");
        sb.append(this.f5581a);
        sb.append(", selectedIndex=");
        sb.append(this.f5582b);
        sb.append(")");
        return sb.toString();
    }
}

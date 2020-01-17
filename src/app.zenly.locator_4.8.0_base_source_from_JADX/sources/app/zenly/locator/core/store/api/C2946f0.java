package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.f0 */
public final class C2946f0 {

    /* renamed from: a */
    private final String f8329a;

    /* renamed from: b */
    private final int f8330b;

    /* renamed from: c */
    private final double f8331c;

    /* renamed from: d */
    private final double f8332d;

    public C2946f0(String str, int i, double d, double d2) {
        C12932j.m33818b(str, "userUuid");
        this.f8329a = str;
        this.f8330b = i;
        this.f8331c = d;
        this.f8332d = d2;
    }

    /* renamed from: a */
    public final int mo9094a() {
        return this.f8330b;
    }

    /* renamed from: b */
    public final double mo9095b() {
        return this.f8332d;
    }

    /* renamed from: c */
    public final String mo9096c() {
        return this.f8329a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2946f0) {
                C2946f0 f0Var = (C2946f0) obj;
                if (C12932j.m33817a((Object) this.f8329a, (Object) f0Var.f8329a)) {
                    if (!((this.f8330b == f0Var.f8330b) && Double.compare(this.f8331c, f0Var.f8331c) == 0 && Double.compare(this.f8332d, f0Var.f8332d) == 0)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f8329a;
        return ((((((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.f8330b).hashCode()) * 31) + Double.valueOf(this.f8331c).hashCode()) * 31) + Double.valueOf(this.f8332d).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendRankInfo(userUuid=");
        sb.append(this.f8329a);
        sb.append(", rank=");
        sb.append(this.f8330b);
        sb.append(", score=");
        sb.append(this.f8331c);
        sb.append(", stableScore=");
        sb.append(this.f8332d);
        sb.append(")");
        return sb.toString();
    }
}

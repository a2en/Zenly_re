package app.zenly.locator.dashboard;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.dashboard.o */
public final class C3318o {

    /* renamed from: a */
    private final boolean f9228a;

    /* renamed from: b */
    private final String f9229b;

    public C3318o(boolean z, String str) {
        C12932j.m33818b(str, "query");
        this.f9228a = z;
        this.f9229b = str;
    }

    /* renamed from: a */
    public final String mo9817a() {
        return this.f9229b;
    }

    /* renamed from: b */
    public final boolean mo9818b() {
        if (!this.f9228a) {
            if (this.f9229b.length() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo9819c() {
        if (this.f9228a) {
            if (this.f9229b.length() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo9820d() {
        return this.f9229b.length() > 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3318o) {
                C3318o oVar = (C3318o) obj;
                if (!(this.f9228a == oVar.f9228a) || !C12932j.m33817a((Object) this.f9229b, (Object) oVar.f9229b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f9228a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f9229b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DashboardQueryState(isActivated=");
        sb.append(this.f9228a);
        sb.append(", query=");
        sb.append(this.f9229b);
        sb.append(")");
        return sb.toString();
    }
}

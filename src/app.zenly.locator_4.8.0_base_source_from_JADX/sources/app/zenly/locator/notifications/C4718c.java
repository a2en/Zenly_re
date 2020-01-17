package app.zenly.locator.notifications;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.notifications.c */
public final class C4718c {

    /* renamed from: a */
    private final String f12482a;

    /* renamed from: b */
    private final int f12483b;

    /* renamed from: c */
    private final int f12484c;

    /* renamed from: d */
    private final Integer f12485d;

    /* renamed from: e */
    private final String f12486e;

    /* renamed from: f */
    private final boolean f12487f;

    /* renamed from: g */
    private final boolean f12488g;

    public C4718c(String str, int i, int i2, Integer num, String str2, boolean z, boolean z2) {
        C12932j.m33818b(str, "id");
        this.f12482a = str;
        this.f12483b = i;
        this.f12484c = i2;
        this.f12485d = num;
        this.f12486e = str2;
        this.f12487f = z;
        this.f12488g = z2;
    }

    /* renamed from: a */
    public final Integer mo11903a() {
        return this.f12485d;
    }

    /* renamed from: b */
    public final String mo11904b() {
        return this.f12486e;
    }

    /* renamed from: c */
    public final String mo11905c() {
        return this.f12482a;
    }

    /* renamed from: d */
    public final int mo11906d() {
        return this.f12484c;
    }

    /* renamed from: e */
    public final int mo11907e() {
        return this.f12483b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4718c) {
                C4718c cVar = (C4718c) obj;
                if (C12932j.m33817a((Object) this.f12482a, (Object) cVar.f12482a)) {
                    if (this.f12483b == cVar.f12483b) {
                        if ((this.f12484c == cVar.f12484c) && C12932j.m33817a((Object) this.f12485d, (Object) cVar.f12485d) && C12932j.m33817a((Object) this.f12486e, (Object) cVar.f12486e)) {
                            if (this.f12487f == cVar.f12487f) {
                                if (this.f12488g == cVar.f12488g) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo11909f() {
        return this.f12488g;
    }

    /* renamed from: g */
    public final boolean mo11910g() {
        return this.f12487f;
    }

    public int hashCode() {
        String str = this.f12482a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.f12483b).hashCode()) * 31) + Integer.valueOf(this.f12484c).hashCode()) * 31;
        Integer num = this.f12485d;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f12486e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f12487f;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f12488g;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationChannelDescriptor(id=");
        sb.append(this.f12482a);
        sb.append(", name=");
        sb.append(this.f12483b);
        sb.append(", importance=");
        sb.append(this.f12484c);
        sb.append(", description=");
        sb.append(this.f12485d);
        sb.append(", group=");
        sb.append(this.f12486e);
        sb.append(", showBadge=");
        sb.append(this.f12487f);
        sb.append(", needSound=");
        sb.append(this.f12488g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C4718c(String str, int i, int i2, Integer num, String str2, boolean z, boolean z2, int i3, C12928f fVar) {
        this(str, i, (i3 & 4) != 0 ? 3 : i2, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? true : z, (i3 & 64) != 0 ? false : z2);
    }
}

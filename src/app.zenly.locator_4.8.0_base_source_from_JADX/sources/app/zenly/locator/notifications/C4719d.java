package app.zenly.locator.notifications;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.notifications.d */
public final class C4719d {

    /* renamed from: a */
    private final String f12489a;

    /* renamed from: b */
    private final int f12490b;

    public C4719d(String str, int i) {
        C12932j.m33818b(str, "id");
        this.f12489a = str;
        this.f12490b = i;
    }

    /* renamed from: a */
    public final String mo11913a() {
        return this.f12489a;
    }

    /* renamed from: b */
    public final int mo11914b() {
        return this.f12490b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4719d) {
                C4719d dVar = (C4719d) obj;
                if (C12932j.m33817a((Object) this.f12489a, (Object) dVar.f12489a)) {
                    if (this.f12490b == dVar.f12490b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f12489a;
        return ((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.f12490b).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationChannelGroupDescriptor(id=");
        sb.append(this.f12489a);
        sb.append(", name=");
        sb.append(this.f12490b);
        sb.append(")");
        return sb.toString();
    }
}

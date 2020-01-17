package app.zenly.locator.chat.p049k5.p051l0;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.chat.k5.l0.a */
public final class C2064a {

    /* renamed from: a */
    private final String f6531a;

    /* renamed from: b */
    private final String f6532b;

    /* renamed from: c */
    private final boolean f6533c;

    /* renamed from: d */
    private final boolean f6534d;

    public C2064a(String str, String str2, boolean z, boolean z2) {
        C12932j.m33818b(str, "userUuid");
        C12932j.m33818b(str2, "nickname");
        this.f6531a = str;
        this.f6532b = str2;
        this.f6533c = z;
        this.f6534d = z2;
    }

    /* renamed from: a */
    public final String mo7874a() {
        return this.f6532b;
    }

    /* renamed from: b */
    public final String mo7875b() {
        return this.f6531a;
    }

    /* renamed from: c */
    public final boolean mo7876c() {
        return this.f6533c;
    }

    /* renamed from: d */
    public final boolean mo7877d() {
        return this.f6534d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2064a) {
                C2064a aVar = (C2064a) obj;
                if (C12932j.m33817a((Object) this.f6531a, (Object) aVar.f6531a) && C12932j.m33817a((Object) this.f6532b, (Object) aVar.f6532b)) {
                    if (this.f6533c == aVar.f6533c) {
                        if (this.f6534d == aVar.f6534d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6531a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6532b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f6533c;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f6534d;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupMemberViewModel(userUuid=");
        sb.append(this.f6531a);
        sb.append(", nickname=");
        sb.append(this.f6532b);
        sb.append(", isFriend=");
        sb.append(this.f6533c);
        sb.append(", isInvited=");
        sb.append(this.f6534d);
        sb.append(")");
        return sb.toString();
    }
}

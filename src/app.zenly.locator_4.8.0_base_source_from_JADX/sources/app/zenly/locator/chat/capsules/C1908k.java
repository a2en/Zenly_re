package app.zenly.locator.chat.capsules;

import app.zenly.locator.chat.panel.emojis.p057f0.C2242d;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;

/* renamed from: app.zenly.locator.chat.capsules.k */
public final class C1908k {

    /* renamed from: a */
    private final String f6223a;

    /* renamed from: b */
    private final String f6224b;

    /* renamed from: c */
    private final long f6225c;

    /* renamed from: d */
    private List<? extends C2242d> f6226d;

    public C1908k(String str, String str2, long j, List<? extends C2242d> list) {
        C12932j.m33818b(str, "userUuid");
        C12932j.m33818b(str2, "name");
        C12932j.m33818b(list, "receivedEmojis");
        this.f6223a = str;
        this.f6224b = str2;
        this.f6225c = j;
        this.f6226d = list;
    }

    /* renamed from: a */
    public final long mo7639a() {
        return this.f6225c;
    }

    /* renamed from: b */
    public final String mo7640b() {
        return this.f6224b;
    }

    /* renamed from: c */
    public final List<C2242d> mo7641c() {
        return this.f6226d;
    }

    /* renamed from: d */
    public final String mo7642d() {
        return this.f6223a;
    }

    /* renamed from: e */
    public final boolean mo7643e() {
        return C7710c.m18766a(this.f6225c, 41);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1908k) {
                C1908k kVar = (C1908k) obj;
                if (C12932j.m33817a((Object) this.f6223a, (Object) kVar.f6223a) && C12932j.m33817a((Object) this.f6224b, (Object) kVar.f6224b)) {
                    if (!(this.f6225c == kVar.f6225c) || !C12932j.m33817a((Object) this.f6226d, (Object) kVar.f6226d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f6223a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6224b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.valueOf(this.f6225c).hashCode()) * 31;
        List<? extends C2242d> list = this.f6226d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CapsuleViewModel(userUuid=");
        sb.append(this.f6223a);
        sb.append(", name=");
        sb.append(this.f6224b);
        sb.append(", activity=");
        sb.append(this.f6225c);
        sb.append(", receivedEmojis=");
        sb.append(this.f6226d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C1908k(String str, String str2, long j, List list, int i, C12928f fVar) {
        if ((i & 8) != 0) {
            list = C12848o.m33640a();
        }
        this(str, str2, j, list);
    }
}

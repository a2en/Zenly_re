package app.zenly.locator.p017a0.p018n.p022i;

import app.zenly.locator.p017a0.p018n.C1537d;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.a0.n.i.b */
public final class C1552b extends C11722a {

    /* renamed from: f */
    private final long f5468f;

    /* renamed from: g */
    private final UserProto$User f5469g;

    public C1552b(long j, UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        super(C1537d.BLOCKED, j);
        this.f5468f = j;
        this.f5469g = userProto$User;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C1552b bVar = (C1552b) aVar;
        return C12932j.m33817a((Object) this.f5469g.getName(), (Object) bVar.f5469g.getName()) && C12932j.m33817a((Object) this.f5469g.getAvatarUrlPrefix(), (Object) bVar.f5469g.getAvatarUrlPrefix()) && this.f5469g.getAvatarVersion() == bVar.f5469g.getAvatarVersion();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1552b) {
                C1552b bVar = (C1552b) obj;
                if (!(this.f5468f == bVar.f5468f) || !C12932j.m33817a((Object) this.f5469g, (Object) bVar.f5469g)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final UserProto$User mo7094f() {
        return this.f5469g;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f5468f).hashCode() * 31;
        UserProto$User userProto$User = this.f5469g;
        return a + (userProto$User != null ? userProto$User.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BlockedUserViewModel(stableId=");
        sb.append(this.f5468f);
        sb.append(", user=");
        sb.append(this.f5469g);
        sb.append(")");
        return sb.toString();
    }
}

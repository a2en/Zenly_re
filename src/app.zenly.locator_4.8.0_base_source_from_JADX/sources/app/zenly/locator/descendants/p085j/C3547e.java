package app.zenly.locator.descendants.p085j;

import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.descendants.model.RankedDescendant;
import app.zenly.locator.core.models.C2884f;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6926b;

/* renamed from: app.zenly.locator.descendants.j.e */
public final class C3547e implements RankedDescendant {

    /* renamed from: e */
    private final Avatar f9539e;

    /* renamed from: f */
    private final int f9540f;

    /* renamed from: g */
    private final UserProto$User f9541g;

    /* renamed from: h */
    private final boolean f9542h;

    public C3547e(int i, UserProto$User userProto$User, boolean z) {
        C12932j.m33818b(userProto$User, "user");
        this.f9540f = i;
        this.f9541g = userProto$User;
        this.f9542h = z;
        this.f9539e = C2884f.m9355a(this.f9541g);
    }

    /* renamed from: a */
    public int compareTo(RankedDescendant rankedDescendant) {
        C12932j.m33818b(rankedDescendant, "other");
        int a = C12932j.m33811a(getRank(), rankedDescendant.getRank());
        return a == 0 ? getDisplayName().compareTo(rankedDescendant.getDisplayName()) : a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3547e)) {
            return false;
        }
        C3547e eVar = (C3547e) obj;
        if (!C12932j.m33817a((Object) eVar.getId(), (Object) getId()) || !C12932j.m33817a((Object) eVar.getDisplayName(), (Object) getDisplayName())) {
            z = false;
        }
        return z;
    }

    public Avatar getAvatar() {
        return this.f9539e;
    }

    public int getDescendantCount() {
        C6926b events = this.f9541g.getEvents();
        C12932j.m33815a((Object) events, "user.events");
        return events.getInviterCount();
    }

    public String getDisplayName() {
        String name = this.f9541g.getName();
        C12932j.m33815a((Object) name, "user.name");
        return name;
    }

    public String getId() {
        String uuid = this.f9541g.getUuid();
        C12932j.m33815a((Object) uuid, "user.uuid");
        return uuid;
    }

    public boolean getNewPop() {
        return this.f9542h;
    }

    public int getRank() {
        return this.f9540f;
    }

    public int hashCode() {
        return (getId().hashCode() * 31) + getDisplayName().hashCode();
    }

    public /* synthetic */ C3547e(int i, UserProto$User userProto$User, boolean z, int i2, C12928f fVar) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        this(i, userProto$User, z);
    }
}

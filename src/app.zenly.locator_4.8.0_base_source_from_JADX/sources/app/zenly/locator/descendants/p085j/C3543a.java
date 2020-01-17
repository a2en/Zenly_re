package app.zenly.locator.descendants.p085j;

import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.descendants.model.Descendant;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.store.api.C2935a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.descendants.j.a */
public final class C3543a implements Descendant {

    /* renamed from: e */
    private final Avatar f9529e = C2884f.m9354a(this.f9530f);

    /* renamed from: f */
    private final C2935a f9530f;

    /* renamed from: g */
    private final boolean f9531g;

    public C3543a(C2935a aVar, boolean z) {
        C12932j.m33818b(aVar, "contactWithUser");
        this.f9530f = aVar;
        this.f9531g = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3543a)) {
            return false;
        }
        C3543a aVar = (C3543a) obj;
        if (!C12932j.m33817a((Object) aVar.getId(), (Object) getId()) || !C12932j.m33817a((Object) aVar.getDisplayName(), (Object) getDisplayName())) {
            z = false;
        }
        return z;
    }

    public Avatar getAvatar() {
        return this.f9529e;
    }

    public String getDisplayName() {
        String name = this.f9530f.mo9070b().getName();
        C12932j.m33815a((Object) name, "contactWithUser.user.name");
        return name;
    }

    public String getId() {
        String uuid = this.f9530f.mo9070b().getUuid();
        C12932j.m33815a((Object) uuid, "contactWithUser.user.uuid");
        return uuid;
    }

    public boolean getNewPop() {
        return this.f9531g;
    }

    public int hashCode() {
        return (getId().hashCode() * 31) + getDisplayName().hashCode();
    }
}

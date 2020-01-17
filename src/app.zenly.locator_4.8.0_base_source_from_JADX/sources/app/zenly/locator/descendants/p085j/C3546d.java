package app.zenly.locator.descendants.p085j;

import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.descendants.model.Descendant;
import app.zenly.locator.core.models.C2884f;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7226u0;

/* renamed from: app.zenly.locator.descendants.j.d */
public final class C3546d implements Descendant {

    /* renamed from: e */
    private final Avatar f9536e = C2884f.m9356a(this.f9537f);

    /* renamed from: f */
    private final C7226u0 f9537f;

    /* renamed from: g */
    private final boolean f9538g;

    public C3546d(C7226u0 u0Var, boolean z) {
        C12932j.m33818b(u0Var, "descendant");
        this.f9537f = u0Var;
        this.f9538g = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3546d)) {
            return false;
        }
        C3546d dVar = (C3546d) obj;
        if (!C12932j.m33817a((Object) dVar.getId(), (Object) getId()) || !C12932j.m33817a((Object) dVar.getDisplayName(), (Object) getDisplayName())) {
            z = false;
        }
        return z;
    }

    public Avatar getAvatar() {
        return this.f9536e;
    }

    public String getDisplayName() {
        String name = this.f9537f.getName();
        C12932j.m33815a((Object) name, "descendant.name");
        return name;
    }

    public String getId() {
        String uuid = this.f9537f.getUuid();
        C12932j.m33815a((Object) uuid, "descendant.uuid");
        return uuid;
    }

    public boolean getNewPop() {
        return this.f9538g;
    }

    public int hashCode() {
        return (getId().hashCode() * 31) + getDisplayName().hashCode();
    }
}

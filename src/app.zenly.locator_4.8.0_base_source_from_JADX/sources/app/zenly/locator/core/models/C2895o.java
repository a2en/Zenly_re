package app.zenly.locator.core.models;

import android.net.Uri;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.model.Avatar.C1327a;
import app.zenly.android.feature.base.model.Avatar.C1327a.C1329b;
import app.zenly.android.feature.base.model.Avatar.C1330b;
import app.zenly.locator.descendants.p085j.C3545c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7226u0;

/* renamed from: app.zenly.locator.core.models.o */
final class C2895o implements Avatar {

    /* renamed from: a */
    private final String f8188a;

    /* renamed from: b */
    private final String f8189b;

    /* renamed from: c */
    private final Avatar f8190c;

    /* renamed from: d */
    private final C7226u0 f8191d;

    public C2895o(C7226u0 u0Var) {
        C12932j.m33818b(u0Var, "descendant");
        this.f8191d = u0Var;
        String uuid = this.f8191d.getUuid();
        C12932j.m33815a((Object) uuid, "descendant.uuid");
        this.f8188a = uuid;
        String name = this.f8191d.getName();
        C12932j.m33815a((Object) name, "descendant.name");
        this.f8189b = name;
    }

    public boolean areAvatarTheSame(Avatar avatar) {
        C12932j.m33818b(avatar, "other");
        boolean z = false;
        if (!(avatar instanceof C2895o)) {
            return false;
        }
        if (C12932j.m33817a((Object) avatar, (Object) this)) {
            return true;
        }
        C2895o oVar = (C2895o) avatar;
        if (C12932j.m33817a((Object) oVar.f8191d.getUuid(), (Object) this.f8191d.getUuid()) && oVar.f8191d.getAvatarVersion() == this.f8191d.getAvatarVersion()) {
            z = true;
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C12932j.m33817a((Object) C2895o.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C2895o oVar = (C2895o) obj;
            return !(C12932j.m33817a((Object) this.f8191d.getAvatarUrlPrefix(), (Object) oVar.f8191d.getAvatarUrlPrefix()) ^ true) && this.f8191d.getAvatarVersion() == oVar.f8191d.getAvatarVersion() && !(C12932j.m33817a((Object) getId(), (Object) oVar.getId()) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.models.DescendantAvatar");
    }

    public C1327a forSize(int i) {
        C3545c cVar = C3545c.f9535a;
        String avatarUrlPrefix = this.f8191d.getAvatarUrlPrefix();
        C12932j.m33815a((Object) avatarUrlPrefix, "descendant.avatarUrlPrefix");
        Uri a = cVar.mo10003a(avatarUrlPrefix, this.f8191d.getAvatarVersion(), i);
        if (a != null) {
            return new C1327a(a, C1329b.REMOTE);
        }
        Avatar fallback = getFallback();
        if (fallback != null) {
            return fallback.forSize(i);
        }
        return null;
    }

    public Avatar getFallback() {
        return this.f8190c;
    }

    public String getId() {
        return this.f8188a;
    }

    public String getInitials() {
        return C1330b.m6341a(this);
    }

    public String getName() {
        return this.f8189b;
    }

    public int hashCode() {
        return (((this.f8191d.getAvatarUrlPrefix().hashCode() * 31) + Integer.valueOf(this.f8191d.getAvatarVersion()).hashCode()) * 31) + getId().hashCode();
    }
}

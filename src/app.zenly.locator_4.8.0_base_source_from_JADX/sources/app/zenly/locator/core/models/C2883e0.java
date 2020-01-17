package app.zenly.locator.core.models;

import android.net.Uri;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.model.Avatar.C1327a;
import app.zenly.android.feature.base.model.Avatar.C1327a.C1329b;
import app.zenly.android.feature.base.model.Avatar.C1330b;
import app.zenly.locator.descendants.p085j.C3545c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.models.e0 */
final class C2883e0 implements Avatar {

    /* renamed from: a */
    private final String f8163a;

    /* renamed from: b */
    private final String f8164b;

    /* renamed from: c */
    private final Avatar f8165c;

    /* renamed from: d */
    private final String f8166d;

    /* renamed from: e */
    private final int f8167e;

    public C2883e0(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        String uuid = userProto$User.getUuid();
        C12932j.m33815a((Object) uuid, "user.uuid");
        this.f8163a = uuid;
        String name = userProto$User.getName();
        C12932j.m33815a((Object) name, "user.name");
        this.f8164b = name;
        String avatarUrlPrefix = userProto$User.getAvatarUrlPrefix();
        C12932j.m33815a((Object) avatarUrlPrefix, "user.avatarUrlPrefix");
        this.f8166d = avatarUrlPrefix;
        this.f8167e = userProto$User.getAvatarVersion();
    }

    public boolean areAvatarTheSame(Avatar avatar) {
        C12932j.m33818b(avatar, "other");
        boolean z = false;
        if (!(avatar instanceof C2883e0)) {
            return false;
        }
        if (C12932j.m33817a((Object) avatar, (Object) this)) {
            return true;
        }
        if (C12932j.m33817a((Object) avatar.getId(), (Object) getId()) && ((C2883e0) avatar).f8167e == this.f8167e) {
            z = true;
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C12932j.m33817a((Object) C2883e0.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C2883e0 e0Var = (C2883e0) obj;
            return !(C12932j.m33817a((Object) this.f8166d, (Object) e0Var.f8166d) ^ true) && this.f8167e == e0Var.f8167e && !(C12932j.m33817a((Object) getId(), (Object) e0Var.getId()) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.models.UserAvatar");
    }

    public C1327a forSize(int i) {
        Uri a = C3545c.f9535a.mo10003a(this.f8166d, this.f8167e, i);
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
        return this.f8165c;
    }

    public String getId() {
        return this.f8163a;
    }

    public String getInitials() {
        return C1330b.m6341a(this);
    }

    public String getName() {
        return this.f8164b;
    }

    public int hashCode() {
        return (((this.f8166d.hashCode() * 31) + Integer.valueOf(this.f8167e).hashCode()) * 31) + getId().hashCode();
    }

    public C2883e0(C2879d0 d0Var) {
        C12932j.m33818b(d0Var, "user");
        this.f8163a = d0Var.mo8945g();
        this.f8164b = d0Var.mo8942e();
        this.f8166d = d0Var.mo8938a();
        this.f8167e = d0Var.mo8939b();
    }
}

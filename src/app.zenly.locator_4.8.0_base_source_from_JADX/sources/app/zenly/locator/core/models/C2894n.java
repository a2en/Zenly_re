package app.zenly.locator.core.models;

import android.net.Uri;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.model.Avatar.C1327a;
import app.zenly.android.feature.base.model.Avatar.C1327a.C1329b;
import app.zenly.android.feature.base.model.Avatar.C1330b;
import app.zenly.locator.descendants.p085j.C3545c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;

/* renamed from: app.zenly.locator.core.models.n */
final class C2894n implements Avatar {

    /* renamed from: a */
    private final String f8184a;

    /* renamed from: b */
    private final String f8185b;

    /* renamed from: c */
    private final Avatar f8186c;

    /* renamed from: d */
    private final C7339i f8187d;

    public C2894n(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        this.f8187d = iVar;
        String uuid = this.f8187d.getUuid();
        C12932j.m33815a((Object) uuid, "contact.uuid");
        this.f8184a = uuid;
        String full = this.f8187d.getFull();
        C12932j.m33815a((Object) full, "contact.full");
        this.f8185b = full;
    }

    public boolean areAvatarTheSame(Avatar avatar) {
        C12932j.m33818b(avatar, "other");
        if (!(avatar instanceof C2894n)) {
            return false;
        }
        if (C12932j.m33817a((Object) avatar, (Object) this)) {
            return true;
        }
        return C12932j.m33817a((Object) avatar.getId(), (Object) getId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C12932j.m33817a((Object) C2894n.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C2894n nVar = (C2894n) obj;
            return !(C12932j.m33817a((Object) this.f8187d.getDeviceContactId(), (Object) nVar.f8187d.getDeviceContactId()) ^ true) && !(C12932j.m33817a((Object) getId(), (Object) nVar.getId()) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.models.ContactAvatar");
    }

    public C1327a forSize(int i) {
        C3545c cVar = C3545c.f9535a;
        String deviceContactId = this.f8187d.getDeviceContactId();
        C12932j.m33815a((Object) deviceContactId, "contact.deviceContactId");
        Uri a = cVar.mo10002a(deviceContactId);
        if (a != null) {
            return new C1327a(a, C1329b.LOCAL);
        }
        Avatar fallback = getFallback();
        if (fallback != null) {
            return fallback.forSize(i);
        }
        return null;
    }

    public Avatar getFallback() {
        return this.f8186c;
    }

    public String getId() {
        return this.f8184a;
    }

    public String getInitials() {
        return C1330b.m6341a(this);
    }

    public String getName() {
        return this.f8185b;
    }

    public int hashCode() {
        return (this.f8187d.getDeviceContactId().hashCode() * 31) + getId().hashCode();
    }
}

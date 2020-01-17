package app.zenly.locator.core.models;

import android.net.Uri;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.model.Avatar.C1327a;
import app.zenly.android.feature.base.model.Avatar.C1327a.C1329b;
import app.zenly.android.feature.base.model.Avatar.C1330b;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.descendants.p085j.C3545c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.models.b */
final class C2871b implements Avatar {

    /* renamed from: a */
    private final String f8118a;

    /* renamed from: b */
    private final String f8119b;

    /* renamed from: c */
    private final Avatar f8120c = new C2883e0(this.f8121d.mo9070b());

    /* renamed from: d */
    private final C2935a f8121d;

    public C2871b(C2935a aVar) {
        C12932j.m33818b(aVar, "contact");
        this.f8121d = aVar;
        String uuid = this.f8121d.mo9070b().getUuid();
        C12932j.m33815a((Object) uuid, "contact.user.uuid");
        this.f8118a = uuid;
        String name = this.f8121d.mo9070b().getName();
        C12932j.m33815a((Object) name, "contact.user.name");
        this.f8119b = name;
    }

    public boolean areAvatarTheSame(Avatar avatar) {
        C12932j.m33818b(avatar, "other");
        boolean z = false;
        if (!(avatar instanceof C2871b)) {
            return false;
        }
        if (C12932j.m33817a((Object) avatar, (Object) this)) {
            return true;
        }
        C2871b bVar = (C2871b) avatar;
        if (C12932j.m33817a((Object) bVar.f8121d.mo9070b().getUuid(), (Object) this.f8121d.mo9070b().getUuid()) && bVar.f8121d.mo9070b().getAvatarVersion() == this.f8121d.mo9070b().getAvatarVersion()) {
            z = true;
        }
        return z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C12932j.m33817a((Object) C2871b.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C2871b bVar = (C2871b) obj;
            return !(C12932j.m33817a((Object) this.f8121d.mo9069a().getDeviceContactId(), (Object) bVar.f8121d.mo9069a().getDeviceContactId()) ^ true) && !(C12932j.m33817a((Object) getId(), (Object) bVar.getId()) ^ true);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.models.AozAvatar");
    }

    public C1327a forSize(int i) {
        C3545c cVar = C3545c.f9535a;
        String deviceContactId = this.f8121d.mo9069a().getDeviceContactId();
        C12932j.m33815a((Object) deviceContactId, "contact.contact.deviceContactId");
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
        return this.f8120c;
    }

    public String getId() {
        return this.f8118a;
    }

    public String getInitials() {
        return C1330b.m6341a(this);
    }

    public String getName() {
        return this.f8119b;
    }

    public int hashCode() {
        return (this.f8121d.mo9069a().getDeviceContactId().hashCode() * 31) + getId().hashCode();
    }
}

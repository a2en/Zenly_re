package app.zenly.locator.p017a0.p024p.p029h;

import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.locator.p017a0.p024p.C1561c;
import app.zenly.locator.p017a0.p024p.p026e.C1583q;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.p.h.a */
public final class C1605a extends C1611f {

    /* renamed from: g */
    private final Avatar f5576g;

    /* renamed from: h */
    private final AvatarLoader f5577h;

    /* renamed from: i */
    private final boolean f5578i;

    public C1605a(long j, Avatar avatar, AvatarLoader avatarLoader, boolean z, C1583q qVar) {
        C12932j.m33818b(avatar, "avatar");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        C12932j.m33818b(qVar, "action");
        super(C1561c.AVATAR, j, qVar);
        this.f5576g = avatar;
        this.f5577h = avatarLoader;
        this.f5578i = z;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C1605a aVar2 = (C1605a) aVar;
        return this.f5576g.areAvatarTheSame(aVar2.f5576g) && this.f5578i == aVar2.f5578i;
    }

    /* renamed from: g */
    public final Avatar mo7171g() {
        return this.f5576g;
    }

    /* renamed from: h */
    public final AvatarLoader mo7172h() {
        return this.f5577h;
    }

    /* renamed from: i */
    public final boolean mo7173i() {
        return this.f5578i;
    }
}

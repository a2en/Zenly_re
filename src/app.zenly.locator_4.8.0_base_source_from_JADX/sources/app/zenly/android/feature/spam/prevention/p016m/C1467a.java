package app.zenly.android.feature.spam.prevention.p016m;

import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.spam.prevention.C1463j;
import app.zenly.android.feature.spam.prevention.model.SpammedUser;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.spam.prevention.m.a */
public final class C1467a extends C11722a {

    /* renamed from: f */
    private final SpammedUser f5281f;

    /* renamed from: g */
    private final AvatarLoader f5282g;

    public C1467a(SpammedUser spammedUser, AvatarLoader avatarLoader) {
        C12932j.m33818b(spammedUser, "spammedUser");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        super(C1463j.SPAMMED_USER);
        this.f5281f = spammedUser;
        this.f5282g = avatarLoader;
    }

    /* renamed from: f */
    public final AvatarLoader mo6960f() {
        return this.f5282g;
    }

    /* renamed from: g */
    public final SpammedUser mo6961g() {
        return this.f5281f;
    }
}

package app.zenly.locator.p042b0;

import android.content.Context;
import app.zenly.android.feature.spam.prevention.SpamPreventionModule;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.FriendRequestStore;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.b0.c */
public final class C1691c implements SpamPreventionModule {

    /* renamed from: a */
    private final Context f5737a;

    /* renamed from: b */
    private final FriendRequestStore f5738b;

    /* renamed from: c */
    private final ContactAlreadyOnZenlyStore f5739c;

    /* renamed from: d */
    private final ZenlyCore f5740d;

    /* renamed from: e */
    private final MeUserManager f5741e;

    public C1691c(Context context, FriendRequestStore friendRequestStore, ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore, ZenlyCore zenlyCore, MeUserManager meUserManager) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        C12932j.m33818b(contactAlreadyOnZenlyStore, "contactAlreadyOnZenlyStore");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(meUserManager, "meUserManager");
        this.f5737a = context;
        this.f5738b = friendRequestStore;
        this.f5739c = contactAlreadyOnZenlyStore;
        this.f5740d = zenlyCore;
        this.f5741e = meUserManager;
    }

    public C2477e provideAvatarLoader() {
        return new C2477e(this.f5737a);
    }

    public C1692d provideSpamPreventionRepository() {
        return new C1692d(this.f5738b, this.f5739c, this.f5740d, this.f5741e);
    }
}

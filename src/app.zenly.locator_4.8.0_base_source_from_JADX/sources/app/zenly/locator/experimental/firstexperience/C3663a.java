package app.zenly.locator.experimental.firstexperience;

import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.p206w.C6177a;
import app.zenly.locator.p206w.C6177a.C6178a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.experimental.firstexperience.a */
public final class C3663a {

    /* renamed from: a */
    private final C6178a f9819a;

    /* renamed from: b */
    private final C3664b f9820b;

    public C3663a(C6178a aVar, C3664b bVar) {
        C12932j.m33818b(aVar, "broadcastInviteNotification");
        C12932j.m33818b(bVar, "noFriendDialog");
        this.f9819a = aVar;
        this.f9820b = bVar;
    }

    /* renamed from: a */
    public final boolean mo10174a() {
        return this.f9820b.mo10176a() || this.f9819a.mo14053c();
    }

    /* renamed from: a */
    public final void mo10173a(BaseActivity baseActivity) {
        C12932j.m33818b(baseActivity, "activity");
        if (this.f9820b.mo10176a()) {
            this.f9820b.mo10175a(baseActivity);
        } else if (this.f9819a.mo14053c()) {
            new C6177a(baseActivity, baseActivity.mo8414c()).mo14050a(this.f9819a);
        }
    }
}

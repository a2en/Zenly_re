package app.zenly.locator.core.invitations;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.invitations.z */
public final class C2627z {

    /* renamed from: a */
    private String f7743a;

    /* renamed from: b */
    private final C2625y f7744b;

    /* renamed from: c */
    private final InvitationCallback f7745c;

    public C2627z(C2625y yVar, InvitationCallback invitationCallback) {
        C12932j.m33818b(yVar, "config");
        C12932j.m33818b(invitationCallback, "callback");
        this.f7744b = yVar;
        this.f7745c = invitationCallback;
    }

    /* renamed from: a */
    public final InvitationCallback mo8736a() {
        return this.f7745c;
    }

    /* renamed from: b */
    public final C2625y mo8738b() {
        return this.f7744b;
    }

    /* renamed from: c */
    public final String mo8739c() {
        return this.f7743a;
    }

    /* renamed from: a */
    public final void mo8737a(String str) {
        this.f7743a = str;
    }
}

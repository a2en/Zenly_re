package app.zenly.locator.core.invitations;

import app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.Callback;

/* renamed from: app.zenly.locator.core.invitations.s */
/* compiled from: lambda */
public final /* synthetic */ class C2618s implements Callback {

    /* renamed from: a */
    private final /* synthetic */ C2538c0 f7720a;

    /* renamed from: b */
    private final /* synthetic */ C2627z f7721b;

    public /* synthetic */ C2618s(C2538c0 c0Var, C2627z zVar) {
        this.f7720a = c0Var;
        this.f7721b = zVar;
    }

    public final void onShareSheetClosed(ShareResult shareResult) {
        this.f7720a.mo8673a(this.f7721b, shareResult);
    }
}

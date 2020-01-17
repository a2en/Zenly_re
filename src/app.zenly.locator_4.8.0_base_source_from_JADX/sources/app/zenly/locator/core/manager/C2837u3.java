package app.zenly.locator.core.manager;

import app.zenly.locator.core.models.C2902s;
import app.zenly.locator.core.models.UserLocationWrapper;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.core.manager.u3 */
/* compiled from: lambda */
public final /* synthetic */ class C2837u3 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ MeUserManager f8080e;

    public /* synthetic */ C2837u3(MeUserManager meUserManager) {
        this.f8080e = meUserManager;
    }

    public final void accept(Object obj) {
        this.f8080e.m8985a((UserLocationWrapper) (C2902s) obj);
    }
}

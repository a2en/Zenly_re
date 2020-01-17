package app.zenly.locator.core.manager;

import p213co.znly.models.UserProto$User;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.core.manager.k4 */
/* compiled from: lambda */
public final /* synthetic */ class C2717k4 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ MeUserManager f7892e;

    public /* synthetic */ C2717k4(MeUserManager meUserManager) {
        this.f7892e = meUserManager;
    }

    public final void accept(Object obj) {
        this.f7892e.m8990a((UserProto$User) obj);
    }
}

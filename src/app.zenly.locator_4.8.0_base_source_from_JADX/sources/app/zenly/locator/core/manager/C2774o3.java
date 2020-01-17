package app.zenly.locator.core.manager;

import app.zenly.locator.core.models.C2903t;
import app.zenly.locator.core.models.VisitPointWrapper;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.core.manager.o3 */
/* compiled from: lambda */
public final /* synthetic */ class C2774o3 implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ MeUserManager f8002e;

    public /* synthetic */ C2774o3(MeUserManager meUserManager) {
        this.f8002e = meUserManager;
    }

    public final void accept(Object obj) {
        this.f8002e.m8986a((VisitPointWrapper) (C2903t) obj);
    }
}

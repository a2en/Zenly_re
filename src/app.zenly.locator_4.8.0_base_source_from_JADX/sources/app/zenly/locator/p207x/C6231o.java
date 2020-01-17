package app.zenly.locator.p207x;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.core.store.p071di.StoreModule;

/* renamed from: app.zenly.locator.x.o */
/* compiled from: lambda */
public final /* synthetic */ class C6231o implements Provider {

    /* renamed from: a */
    private final /* synthetic */ StoreModule f15612a;

    public /* synthetic */ C6231o(StoreModule storeModule) {
        this.f15612a = storeModule;
    }

    public final Object get() {
        return this.f15612a.provideFriendRequestStore();
    }
}

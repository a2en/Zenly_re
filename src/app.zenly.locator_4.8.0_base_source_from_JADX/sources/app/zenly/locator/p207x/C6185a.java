package app.zenly.locator.p207x;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.core.store.p071di.StoreModule;

/* renamed from: app.zenly.locator.x.a */
/* compiled from: lambda */
public final /* synthetic */ class C6185a implements Provider {

    /* renamed from: a */
    private final /* synthetic */ StoreModule f15557a;

    public /* synthetic */ C6185a(StoreModule storeModule) {
        this.f15557a = storeModule;
    }

    public final Object get() {
        return this.f15557a.provideFriendStore();
    }
}

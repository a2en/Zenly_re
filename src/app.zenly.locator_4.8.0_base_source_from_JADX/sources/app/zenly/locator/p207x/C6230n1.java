package app.zenly.locator.p207x;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.core.store.p071di.StoreModule;

/* renamed from: app.zenly.locator.x.n1 */
/* compiled from: lambda */
public final /* synthetic */ class C6230n1 implements Provider {

    /* renamed from: a */
    private final /* synthetic */ StoreModule f15611a;

    public /* synthetic */ C6230n1(StoreModule storeModule) {
        this.f15611a = storeModule;
    }

    public final Object get() {
        return this.f15611a.provideFriendshipStore();
    }
}

package app.zenly.locator.p207x;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.friendshipfacts.FriendshipFactsModule;

/* renamed from: app.zenly.locator.x.m1 */
/* compiled from: lambda */
public final /* synthetic */ class C6227m1 implements Provider {

    /* renamed from: a */
    private final /* synthetic */ FriendshipFactsModule f15607a;

    public /* synthetic */ C6227m1(FriendshipFactsModule friendshipFactsModule) {
        this.f15607a = friendshipFactsModule;
    }

    public final Object get() {
        return this.f15607a.provideFriendshipFactsPrefs();
    }
}

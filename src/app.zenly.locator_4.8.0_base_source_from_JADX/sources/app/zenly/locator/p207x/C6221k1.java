package app.zenly.locator.p207x;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.descendants.DescendantsModule;

/* renamed from: app.zenly.locator.x.k1 */
/* compiled from: lambda */
public final /* synthetic */ class C6221k1 implements Provider {

    /* renamed from: a */
    private final /* synthetic */ DescendantsModule f15601a;

    public /* synthetic */ C6221k1(DescendantsModule descendantsModule) {
        this.f15601a = descendantsModule;
    }

    public final Object get() {
        return this.f15601a.provideDescendantsPrefs();
    }
}

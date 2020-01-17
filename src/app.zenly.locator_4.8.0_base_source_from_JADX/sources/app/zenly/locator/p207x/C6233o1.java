package app.zenly.locator.p207x;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.descendants.DescendantsModule;

/* renamed from: app.zenly.locator.x.o1 */
/* compiled from: lambda */
public final /* synthetic */ class C6233o1 implements Provider {

    /* renamed from: a */
    private final /* synthetic */ DescendantsModule f15614a;

    public /* synthetic */ C6233o1(DescendantsModule descendantsModule) {
        this.f15614a = descendantsModule;
    }

    public final Object get() {
        return this.f15614a.provideDescendantsActionInterceptor();
    }
}

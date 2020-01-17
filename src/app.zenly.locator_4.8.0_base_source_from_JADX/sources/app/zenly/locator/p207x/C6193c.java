package app.zenly.locator.p207x;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.descendants.DescendantsModule;

/* renamed from: app.zenly.locator.x.c */
/* compiled from: lambda */
public final /* synthetic */ class C6193c implements Provider {

    /* renamed from: a */
    private final /* synthetic */ DescendantsModule f15568a;

    public /* synthetic */ C6193c(DescendantsModule descendantsModule) {
        this.f15568a = descendantsModule;
    }

    public final Object get() {
        return this.f15568a.provideDescendantsNewCountInterceptor();
    }
}

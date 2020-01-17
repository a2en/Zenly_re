package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_GetApplicationContextFactory implements Factory<Context> {
    private final CoreModule module;

    public CoreModule_GetApplicationContextFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<Context> create(CoreModule coreModule) {
        return new CoreModule_GetApplicationContextFactory(coreModule);
    }

    public Context get() {
        Context applicationContext = this.module.getApplicationContext();
        C12021c.m31671a(applicationContext, "Cannot return null from a non-@Nullable @Provides method");
        return applicationContext;
    }
}

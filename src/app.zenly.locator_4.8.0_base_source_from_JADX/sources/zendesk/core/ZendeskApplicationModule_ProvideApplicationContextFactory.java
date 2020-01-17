package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ZendeskApplicationModule_ProvideApplicationContextFactory implements Factory<Context> {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationContextFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static Factory<Context> create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationContextFactory(zendeskApplicationModule);
    }

    public Context get() {
        Context provideApplicationContext = this.module.provideApplicationContext();
        C12021c.m31671a(provideApplicationContext, "Cannot return null from a non-@Nullable @Provides method");
        return provideApplicationContext;
    }
}

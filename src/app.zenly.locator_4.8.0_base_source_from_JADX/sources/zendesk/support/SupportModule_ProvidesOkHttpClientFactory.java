package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import okhttp3.C13325v;

public final class SupportModule_ProvidesOkHttpClientFactory implements Factory<C13325v> {
    private final SupportModule module;

    public SupportModule_ProvidesOkHttpClientFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static Factory<C13325v> create(SupportModule supportModule) {
        return new SupportModule_ProvidesOkHttpClientFactory(supportModule);
    }

    public C13325v get() {
        C13325v providesOkHttpClient = this.module.providesOkHttpClient();
        C12021c.m31671a(providesOkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return providesOkHttpClient;
    }
}

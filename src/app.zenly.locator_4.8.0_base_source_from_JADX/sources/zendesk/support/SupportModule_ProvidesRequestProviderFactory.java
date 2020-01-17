package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class SupportModule_ProvidesRequestProviderFactory implements Factory<RequestProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesRequestProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static Factory<RequestProvider> create(SupportModule supportModule) {
        return new SupportModule_ProvidesRequestProviderFactory(supportModule);
    }

    public RequestProvider get() {
        RequestProvider providesRequestProvider = this.module.providesRequestProvider();
        C12021c.m31671a(providesRequestProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesRequestProvider;
    }
}

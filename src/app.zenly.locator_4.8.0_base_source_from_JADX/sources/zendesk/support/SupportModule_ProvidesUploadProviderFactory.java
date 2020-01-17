package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class SupportModule_ProvidesUploadProviderFactory implements Factory<UploadProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesUploadProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static Factory<UploadProvider> create(SupportModule supportModule) {
        return new SupportModule_ProvidesUploadProviderFactory(supportModule);
    }

    public UploadProvider get() {
        UploadProvider providesUploadProvider = this.module.providesUploadProvider();
        C12021c.m31671a(providesUploadProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesUploadProvider;
    }
}

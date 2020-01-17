package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ProviderModule_ProvideUploadProviderFactory implements Factory<UploadProvider> {
    private final ProviderModule module;
    private final Provider<ZendeskUploadService> uploadServiceProvider;

    public ProviderModule_ProvideUploadProviderFactory(ProviderModule providerModule, Provider<ZendeskUploadService> provider) {
        this.module = providerModule;
        this.uploadServiceProvider = provider;
    }

    public static Factory<UploadProvider> create(ProviderModule providerModule, Provider<ZendeskUploadService> provider) {
        return new ProviderModule_ProvideUploadProviderFactory(providerModule, provider);
    }

    public UploadProvider get() {
        UploadProvider provideUploadProvider = this.module.provideUploadProvider((ZendeskUploadService) this.uploadServiceProvider.get());
        C12021c.m31671a(provideUploadProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideUploadProvider;
    }
}

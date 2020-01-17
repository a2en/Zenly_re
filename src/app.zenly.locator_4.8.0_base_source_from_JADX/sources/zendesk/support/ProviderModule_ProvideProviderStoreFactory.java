package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ProviderModule_ProvideProviderStoreFactory implements Factory<ProviderStore> {
    private final Provider<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final Provider<RequestProvider> requestProvider;
    private final Provider<UploadProvider> uploadProvider;

    public ProviderModule_ProvideProviderStoreFactory(ProviderModule providerModule, Provider<HelpCenterProvider> provider, Provider<RequestProvider> provider2, Provider<UploadProvider> provider3) {
        this.module = providerModule;
        this.helpCenterProvider = provider;
        this.requestProvider = provider2;
        this.uploadProvider = provider3;
    }

    public static Factory<ProviderStore> create(ProviderModule providerModule, Provider<HelpCenterProvider> provider, Provider<RequestProvider> provider2, Provider<UploadProvider> provider3) {
        return new ProviderModule_ProvideProviderStoreFactory(providerModule, provider, provider2, provider3);
    }

    public ProviderStore get() {
        ProviderStore provideProviderStore = this.module.provideProviderStore((HelpCenterProvider) this.helpCenterProvider.get(), (RequestProvider) this.requestProvider.get(), (UploadProvider) this.uploadProvider.get());
        C12021c.m31671a(provideProviderStore, "Cannot return null from a non-@Nullable @Provides method");
        return provideProviderStore;
    }
}

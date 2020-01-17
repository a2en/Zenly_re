package zendesk.support.requestlist;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.MemoryCache;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.requestlist.RequestInfoDataSource.Repository;

public final class RequestListModule_ModelFactory implements Factory<RequestListModel> {
    private final Provider<SupportBlipsProvider> blipsProvider;
    private final Provider<MemoryCache> memoryCacheProvider;
    private final Provider<Repository> requestInfoDataSourceProvider;
    private final Provider<SupportSettingsProvider> settingsProvider;

    public RequestListModule_ModelFactory(Provider<Repository> provider, Provider<MemoryCache> provider2, Provider<SupportBlipsProvider> provider3, Provider<SupportSettingsProvider> provider4) {
        this.requestInfoDataSourceProvider = provider;
        this.memoryCacheProvider = provider2;
        this.blipsProvider = provider3;
        this.settingsProvider = provider4;
    }

    public static Factory<RequestListModel> create(Provider<Repository> provider, Provider<MemoryCache> provider2, Provider<SupportBlipsProvider> provider3, Provider<SupportSettingsProvider> provider4) {
        return new RequestListModule_ModelFactory(provider, provider2, provider3, provider4);
    }

    public RequestListModel get() {
        RequestListModel model = RequestListModule.model((Repository) this.requestInfoDataSourceProvider.get(), (MemoryCache) this.memoryCacheProvider.get(), (SupportBlipsProvider) this.blipsProvider.get(), (SupportSettingsProvider) this.settingsProvider.get());
        C12021c.m31671a(model, "Cannot return null from a non-@Nullable @Provides method");
        return model;
    }
}

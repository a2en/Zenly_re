package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import zendesk.belvedere.C13489a;
import zendesk.core.AuthenticationProvider;
import zendesk.support.RequestProvider;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSettingsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.UploadProvider;

public final class RequestModule_ProvidesActionFactoryFactory implements Factory<ActionFactory> {
    private final Provider<AuthenticationProvider> authProvider;
    private final Provider<C13489a> belvedereProvider;
    private final Provider<SupportBlipsProvider> blipsProvider;
    private final Provider<ExecutorService> executorProvider;
    private final Provider<Executor> mainThreadExecutorProvider;
    private final Provider<RequestProvider> requestProvider;
    private final Provider<SupportSettingsProvider> settingsProvider;
    private final Provider<SupportUiStorage> supportUiStorageProvider;
    private final Provider<UploadProvider> uploadProvider;

    public RequestModule_ProvidesActionFactoryFactory(Provider<RequestProvider> provider, Provider<SupportSettingsProvider> provider2, Provider<UploadProvider> provider3, Provider<C13489a> provider4, Provider<SupportUiStorage> provider5, Provider<ExecutorService> provider6, Provider<Executor> provider7, Provider<AuthenticationProvider> provider8, Provider<SupportBlipsProvider> provider9) {
        this.requestProvider = provider;
        this.settingsProvider = provider2;
        this.uploadProvider = provider3;
        this.belvedereProvider = provider4;
        this.supportUiStorageProvider = provider5;
        this.executorProvider = provider6;
        this.mainThreadExecutorProvider = provider7;
        this.authProvider = provider8;
        this.blipsProvider = provider9;
    }

    public static Factory<ActionFactory> create(Provider<RequestProvider> provider, Provider<SupportSettingsProvider> provider2, Provider<UploadProvider> provider3, Provider<C13489a> provider4, Provider<SupportUiStorage> provider5, Provider<ExecutorService> provider6, Provider<Executor> provider7, Provider<AuthenticationProvider> provider8, Provider<SupportBlipsProvider> provider9) {
        RequestModule_ProvidesActionFactoryFactory requestModule_ProvidesActionFactoryFactory = new RequestModule_ProvidesActionFactoryFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
        return requestModule_ProvidesActionFactoryFactory;
    }

    public ActionFactory get() {
        ActionFactory providesActionFactory = RequestModule.providesActionFactory((RequestProvider) this.requestProvider.get(), (SupportSettingsProvider) this.settingsProvider.get(), (UploadProvider) this.uploadProvider.get(), (C13489a) this.belvedereProvider.get(), (SupportUiStorage) this.supportUiStorageProvider.get(), (ExecutorService) this.executorProvider.get(), (Executor) this.mainThreadExecutorProvider.get(), (AuthenticationProvider) this.authProvider.get(), (SupportBlipsProvider) this.blipsProvider.get());
        C12021c.m31671a(providesActionFactory, "Cannot return null from a non-@Nullable @Provides method");
        return providesActionFactory;
    }
}

package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

public final class ZendeskProvidersModule_ProvideCoreSdkModuleFactory implements Factory<CoreModule> {
    private final Provider<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Provider<AuthenticationProvider> authenticationProvider;
    private final Provider<BlipsProvider> blipsProvider;
    private final Provider<Context> contextProvider;
    private final Provider<ExecutorService> executorProvider;
    private final Provider<MemoryCache> memoryCacheProvider;
    private final Provider<NetworkInfoProvider> networkInfoProvider;
    private final Provider<PushRegistrationProvider> pushRegistrationProvider;
    private final Provider<RestServiceProvider> restServiceProvider;
    private final Provider<SessionStorage> sessionStorageProvider;
    private final Provider<SettingsProvider> settingsProvider;
    private final Provider<ApplicationConfiguration> zendeskConfigurationProvider;

    public ZendeskProvidersModule_ProvideCoreSdkModuleFactory(Provider<SettingsProvider> provider, Provider<RestServiceProvider> provider2, Provider<BlipsProvider> provider3, Provider<SessionStorage> provider4, Provider<NetworkInfoProvider> provider5, Provider<MemoryCache> provider6, Provider<ActionHandlerRegistry> provider7, Provider<ExecutorService> provider8, Provider<Context> provider9, Provider<AuthenticationProvider> provider10, Provider<ApplicationConfiguration> provider11, Provider<PushRegistrationProvider> provider12) {
        this.settingsProvider = provider;
        this.restServiceProvider = provider2;
        this.blipsProvider = provider3;
        this.sessionStorageProvider = provider4;
        this.networkInfoProvider = provider5;
        this.memoryCacheProvider = provider6;
        this.actionHandlerRegistryProvider = provider7;
        this.executorProvider = provider8;
        this.contextProvider = provider9;
        this.authenticationProvider = provider10;
        this.zendeskConfigurationProvider = provider11;
        this.pushRegistrationProvider = provider12;
    }

    public static Factory<CoreModule> create(Provider<SettingsProvider> provider, Provider<RestServiceProvider> provider2, Provider<BlipsProvider> provider3, Provider<SessionStorage> provider4, Provider<NetworkInfoProvider> provider5, Provider<MemoryCache> provider6, Provider<ActionHandlerRegistry> provider7, Provider<ExecutorService> provider8, Provider<Context> provider9, Provider<AuthenticationProvider> provider10, Provider<ApplicationConfiguration> provider11, Provider<PushRegistrationProvider> provider12) {
        ZendeskProvidersModule_ProvideCoreSdkModuleFactory zendeskProvidersModule_ProvideCoreSdkModuleFactory = new ZendeskProvidersModule_ProvideCoreSdkModuleFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
        return zendeskProvidersModule_ProvideCoreSdkModuleFactory;
    }

    public CoreModule get() {
        CoreModule provideCoreSdkModule = ZendeskProvidersModule.provideCoreSdkModule((SettingsProvider) this.settingsProvider.get(), (RestServiceProvider) this.restServiceProvider.get(), (BlipsProvider) this.blipsProvider.get(), (SessionStorage) this.sessionStorageProvider.get(), (NetworkInfoProvider) this.networkInfoProvider.get(), (MemoryCache) this.memoryCacheProvider.get(), (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get(), (ExecutorService) this.executorProvider.get(), (Context) this.contextProvider.get(), (AuthenticationProvider) this.authenticationProvider.get(), (ApplicationConfiguration) this.zendeskConfigurationProvider.get(), (PushRegistrationProvider) this.pushRegistrationProvider.get());
        C12021c.m31671a(provideCoreSdkModule, "Cannot return null from a non-@Nullable @Provides method");
        return provideCoreSdkModule;
    }
}

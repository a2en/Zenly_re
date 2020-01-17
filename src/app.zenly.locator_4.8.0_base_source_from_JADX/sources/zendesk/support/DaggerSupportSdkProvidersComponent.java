package zendesk.support;

import android.content.Context;
import dagger.internal.C12020b;
import dagger.internal.C12021c;
import dagger.internal.C12022d;
import java.util.Locale;
import javax.inject.Provider;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;
import zendesk.core.BlipsProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;
import zendesk.core.MemoryCache;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;

public final class DaggerSupportSdkProvidersComponent implements SupportSdkProvidersComponent {
    private CoreModule coreModule;
    private Provider<Context> getApplicationContextProvider;
    private Provider<AuthenticationProvider> getAuthenticationProvider;
    private Provider<BlipsProvider> getBlipsProvider;
    private Provider<MemoryCache> getMemoryCacheProvider;
    private Provider<RestServiceProvider> getRestServiceProvider;
    private Provider<SessionStorage> getSessionStorageProvider;
    private Provider<SettingsProvider> getSettingsProvider;
    private Provider<ArticleVoteStorage> provideArticleVoteStorageProvider;
    private Provider<HelpCenterCachingNetworkConfig> provideCustomNetworkConfigProvider;
    private Provider<HelpCenterCachingInterceptor> provideHelpCenterCachingInterceptorProvider;
    private Provider<HelpCenterLocaleConverter> provideHelpCenterLocaleConverterProvider;
    private Provider<HelpCenterProvider> provideHelpCenterProvider;
    private Provider<HelpCenterSessionCache> provideHelpCenterSessionCacheProvider;
    private Provider<Locale> provideLocaleProvider;
    private Provider<SupportSdkMetadata> provideMetadataProvider;
    private Provider<ProviderStore> provideProviderStoreProvider;
    private Provider<RequestMigrator> provideRequestMigratorProvider;
    private Provider<RequestProvider> provideRequestProvider;
    private Provider<RequestSessionCache> provideRequestSessionCacheProvider;
    private Provider<RequestStorage> provideRequestStorageProvider;
    private Provider<SupportSettingsProvider> provideSdkSettingsProvider;
    private Provider<SupportBlipsProvider> provideSupportBlipsProvider;
    private Provider<SupportModule> provideSupportModuleProvider;
    private Provider<UploadProvider> provideUploadProvider;
    private Provider<ZendeskHelpCenterService> provideZendeskHelpCenterServiceProvider;
    private Provider<ZendeskRequestService> provideZendeskRequestServiceProvider;
    private Provider<ZendeskUploadService> provideZendeskUploadServiceProvider;
    private Provider<HelpCenterService> providesHelpCenterServiceProvider;
    private Provider<RequestService> providesRequestServiceProvider;
    private Provider<UploadService> providesUploadServiceProvider;
    private Provider<ZendeskTracker> providesZendeskTrackerProvider;

    public static final class Builder {
        /* access modifiers changed from: private */
        public CoreModule coreModule;
        /* access modifiers changed from: private */
        public ProviderModule providerModule;
        /* access modifiers changed from: private */
        public StorageModule storageModule;
        /* access modifiers changed from: private */
        public SupportApplicationModule supportApplicationModule;

        public SupportSdkProvidersComponent build() {
            String str = " must be set";
            if (this.coreModule == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(CoreModule.class.getCanonicalName());
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            } else if (this.supportApplicationModule != null) {
                if (this.providerModule == null) {
                    this.providerModule = new ProviderModule();
                }
                if (this.storageModule == null) {
                    this.storageModule = new StorageModule();
                }
                return new DaggerSupportSdkProvidersComponent(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(SupportApplicationModule.class.getCanonicalName());
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }

        public Builder coreModule(CoreModule coreModule2) {
            C12021c.m31670a(coreModule2);
            this.coreModule = coreModule2;
            return this;
        }

        public Builder providerModule(ProviderModule providerModule2) {
            C12021c.m31670a(providerModule2);
            this.providerModule = providerModule2;
            return this;
        }

        public Builder storageModule(StorageModule storageModule2) {
            C12021c.m31670a(storageModule2);
            this.storageModule = storageModule2;
            return this;
        }

        public Builder supportApplicationModule(SupportApplicationModule supportApplicationModule2) {
            C12021c.m31670a(supportApplicationModule2);
            this.supportApplicationModule = supportApplicationModule2;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(builder.coreModule);
        this.provideLocaleProvider = C12020b.m31669b(SupportApplicationModule_ProvideLocaleFactory.create(builder.supportApplicationModule));
        this.provideHelpCenterLocaleConverterProvider = C12020b.m31669b(ProviderModule_ProvideHelpCenterLocaleConverterFactory.create(builder.providerModule));
        this.provideSdkSettingsProvider = C12020b.m31669b(ProviderModule_ProvideSdkSettingsProviderFactory.create(builder.providerModule, this.getSettingsProvider, this.provideLocaleProvider, this.provideHelpCenterLocaleConverterProvider));
        this.getBlipsProvider = CoreModule_GetBlipsProviderFactory.create(builder.coreModule);
        this.provideSupportBlipsProvider = C12020b.m31669b(ProviderModule_ProvideSupportBlipsProviderFactory.create(builder.providerModule, this.getBlipsProvider, this.provideLocaleProvider));
        this.getRestServiceProvider = CoreModule_GetRestServiceProviderFactory.create(builder.coreModule);
        this.provideHelpCenterCachingInterceptorProvider = C12022d.m31673a(ServiceModule_ProvideHelpCenterCachingInterceptorFactory.create());
        this.provideCustomNetworkConfigProvider = C12022d.m31673a(ServiceModule_ProvideCustomNetworkConfigFactory.create(this.provideHelpCenterCachingInterceptorProvider));
        this.providesHelpCenterServiceProvider = C12020b.m31669b(ServiceModule_ProvidesHelpCenterServiceFactory.create(this.getRestServiceProvider, this.provideCustomNetworkConfigProvider));
        this.provideZendeskHelpCenterServiceProvider = C12020b.m31669b(ServiceModule_ProvideZendeskHelpCenterServiceFactory.create(this.providesHelpCenterServiceProvider, this.provideHelpCenterLocaleConverterProvider));
        this.provideHelpCenterSessionCacheProvider = C12020b.m31669b(StorageModule_ProvideHelpCenterSessionCacheFactory.create(builder.storageModule));
        this.providesZendeskTrackerProvider = C12020b.m31669b(SupportApplicationModule_ProvidesZendeskTrackerFactory.create(builder.supportApplicationModule));
        this.provideHelpCenterProvider = C12020b.m31669b(ProviderModule_ProvideHelpCenterProviderFactory.create(builder.providerModule, this.provideSdkSettingsProvider, this.provideSupportBlipsProvider, this.provideZendeskHelpCenterServiceProvider, this.provideHelpCenterSessionCacheProvider, this.providesZendeskTrackerProvider));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(builder.coreModule);
        this.providesRequestServiceProvider = C12020b.m31669b(ServiceModule_ProvidesRequestServiceFactory.create(this.getRestServiceProvider));
        this.provideZendeskRequestServiceProvider = C12020b.m31669b(ServiceModule_ProvideZendeskRequestServiceFactory.create(this.providesRequestServiceProvider));
        this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(builder.coreModule);
        this.getApplicationContextProvider = CoreModule_GetApplicationContextFactory.create(builder.coreModule);
        this.provideRequestMigratorProvider = C12020b.m31669b(StorageModule_ProvideRequestMigratorFactory.create(builder.storageModule, this.getApplicationContextProvider));
        this.getMemoryCacheProvider = CoreModule_GetMemoryCacheFactory.create(builder.coreModule);
        this.provideRequestStorageProvider = C12020b.m31669b(StorageModule_ProvideRequestStorageFactory.create(builder.storageModule, this.getSessionStorageProvider, this.provideRequestMigratorProvider, this.getMemoryCacheProvider));
        this.provideRequestSessionCacheProvider = C12020b.m31669b(StorageModule_ProvideRequestSessionCacheFactory.create(builder.storageModule));
        this.provideMetadataProvider = C12020b.m31669b(SupportApplicationModule_ProvideMetadataFactory.create(builder.supportApplicationModule, this.getApplicationContextProvider));
        this.provideRequestProvider = C12020b.m31669b(ProviderModule_ProvideRequestProviderFactory.create(builder.providerModule, this.provideSdkSettingsProvider, this.getAuthenticationProvider, this.provideZendeskRequestServiceProvider, this.provideRequestStorageProvider, this.provideRequestSessionCacheProvider, this.providesZendeskTrackerProvider, this.provideMetadataProvider, this.provideSupportBlipsProvider));
        this.providesUploadServiceProvider = C12020b.m31669b(ServiceModule_ProvidesUploadServiceFactory.create(this.getRestServiceProvider));
        this.provideZendeskUploadServiceProvider = C12020b.m31669b(ServiceModule_ProvideZendeskUploadServiceFactory.create(this.providesUploadServiceProvider));
        this.provideUploadProvider = C12020b.m31669b(ProviderModule_ProvideUploadProviderFactory.create(builder.providerModule, this.provideZendeskUploadServiceProvider));
        this.provideProviderStoreProvider = C12020b.m31669b(ProviderModule_ProvideProviderStoreFactory.create(builder.providerModule, this.provideHelpCenterProvider, this.provideRequestProvider, this.provideUploadProvider));
        this.provideArticleVoteStorageProvider = C12020b.m31669b(StorageModule_ProvideArticleVoteStorageFactory.create(builder.storageModule, this.getSessionStorageProvider));
        this.provideSupportModuleProvider = C12020b.m31669b(ProviderModule_ProvideSupportModuleFactory.create(builder.providerModule, this.provideRequestProvider, this.provideUploadProvider, this.provideHelpCenterProvider, this.provideSdkSettingsProvider, this.getRestServiceProvider, this.provideSupportBlipsProvider, this.providesZendeskTrackerProvider, this.provideArticleVoteStorageProvider));
        this.coreModule = builder.coreModule;
    }

    private Support injectSupport(Support support) {
        Support_MembersInjector.injectProviderStore(support, (ProviderStore) this.provideProviderStoreProvider.get());
        Support_MembersInjector.injectSupportModule(support, (SupportModule) this.provideSupportModuleProvider.get());
        Support_MembersInjector.injectRequestMigrator(support, this.provideRequestMigratorProvider.get());
        Support_MembersInjector.injectBlipsProvider(support, (SupportBlipsProvider) this.provideSupportBlipsProvider.get());
        ActionHandlerRegistry proxyActionHandlerRegistry = CoreModule_ActionHandlerRegistryFactory.proxyActionHandlerRegistry(this.coreModule);
        String str = "Cannot return null from a non-@Nullable @Provides method";
        C12021c.m31671a(proxyActionHandlerRegistry, str);
        Support_MembersInjector.injectActionHandlerRegistry(support, proxyActionHandlerRegistry);
        Support_MembersInjector.injectRequestProvider(support, (RequestProvider) this.provideRequestProvider.get());
        AuthenticationProvider proxyGetAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.proxyGetAuthenticationProvider(this.coreModule);
        C12021c.m31671a(proxyGetAuthenticationProvider, str);
        Support_MembersInjector.injectAuthenticationProvider(support, proxyGetAuthenticationProvider);
        return support;
    }

    public Support inject(Support support) {
        injectSupport(support);
        return support;
    }

    private DaggerSupportSdkProvidersComponent(Builder builder) {
        initialize(builder);
    }
}

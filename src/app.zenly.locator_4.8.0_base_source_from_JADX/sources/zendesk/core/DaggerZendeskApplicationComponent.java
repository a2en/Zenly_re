package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.gson.C11125d;
import dagger.internal.C12020b;
import dagger.internal.C12021c;
import dagger.internal.C12022d;
import java.io.File;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import okhttp3.C13204g;
import okhttp3.C13325v;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.C13430i;

public final class DaggerZendeskApplicationComponent implements ZendeskApplicationComponent {
    private Provider<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private Provider<AcceptLanguageHeaderInterceptor> provideAcceptLanguageHeaderInterceptorProvider;
    private Provider<ZendeskAccessInterceptor> provideAccessInterceptorProvider;
    private Provider<AccessProvider> provideAccessProvider;
    private Provider<AccessService> provideAccessServiceProvider;
    private Provider<BaseStorage> provideAdditionalSdkBaseStorageProvider;
    private Provider<ApplicationConfiguration> provideApplicationConfigurationProvider;
    private Provider<Context> provideApplicationContextProvider;
    private Provider<ZendeskAuthHeaderInterceptor> provideAuthHeaderInterceptorProvider;
    private Provider<AuthenticationProvider> provideAuthProvider;
    private Provider<Serializer> provideBase64SerializerProvider;
    private Provider<C13325v> provideBaseOkHttpClientProvider;
    private Provider<BlipsService> provideBlipsServiceProvider;
    private Provider<C13204g> provideCacheProvider;
    private Provider<CachingInterceptor> provideCachingInterceptorProvider;
    private Provider<C13325v> provideCoreOkHttpClientProvider;
    private Provider<C13430i> provideCoreRetrofitProvider;
    private Provider<CoreModule> provideCoreSdkModuleProvider;
    private Provider<CoreSettingsStorage> provideCoreSettingsStorageProvider;
    private Provider<DeviceInfo> provideDeviceInfoProvider;
    private Provider<ExecutorService> provideExecutorProvider;
    private Provider<C11125d> provideGsonProvider;
    private Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;
    private Provider<BaseStorage> provideIdentityBaseStorageProvider;
    private Provider<IdentityManager> provideIdentityManagerProvider;
    private Provider<IdentityStorage> provideIdentityStorageProvider;
    private Provider<SharedPreferencesStorage> provideLegacyIdentityBaseStorageProvider;
    private Provider<LegacyIdentityMigrator> provideLegacyIdentityStorageProvider;
    private Provider<SharedPreferencesStorage> provideLegacyPushBaseStorageProvider;
    private Provider<C13325v> provideMediaOkHttpClientProvider;
    private Provider<MemoryCache> provideMemoryCacheProvider;
    private Provider<C13325v> provideOkHttpClientProvider;
    private Provider<ProviderStore> provideProviderStoreProvider;
    private Provider<PushDeviceIdStorage> providePushDeviceIdStorageProvider;
    private Provider<PushRegistrationProvider> providePushRegistrationProvider;
    private Provider<PushRegistrationService> providePushRegistrationServiceProvider;
    private Provider<RestServiceProvider> provideRestServiceProvider;
    private Provider<C13430i> provideRetrofitProvider;
    private Provider<BaseStorage> provideSdkBaseStorageProvider;
    private Provider<SettingsProvider> provideSdkSettingsProvider;
    private Provider<SdkSettingsProviderInternal> provideSdkSettingsProviderInternalProvider;
    private Provider<SdkSettingsService> provideSdkSettingsServiceProvider;
    private Provider<Storage> provideSdkStorageProvider;
    private Provider<Serializer> provideSerializerProvider;
    private Provider<SessionStorage> provideSessionStorageProvider;
    private Provider<BaseStorage> provideSettingsBaseStorageProvider;
    private Provider<ZendeskSettingsInterceptor> provideSettingsInterceptorProvider;
    private Provider<SettingsStorage> provideSettingsStorageProvider;
    private Provider<UserProvider> provideUserProvider;
    private Provider<UserService> provideUserServiceProvider;
    private Provider<ZendeskOauthIdHeaderInterceptor> provideZendeskBasicHeadersInterceptorProvider;
    private Provider<ZendeskShadow> provideZendeskProvider;
    private Provider<ZendeskSettingsProvider> provideZendeskSdkSettingsProvider;
    private Provider<ZendeskUnauthorizedInterceptor> provideZendeskUnauthorizedInterceptorProvider;
    private Provider<BlipsCoreProvider> providerBlipsCoreProvider;
    private Provider<BlipsProvider> providerBlipsProvider;
    private Provider<ConnectivityManager> providerConnectivityManagerProvider;
    private Provider<NetworkInfoProvider> providerNetworkInfoProvider;
    private Provider<ZendeskBlipsProvider> providerZendeskBlipsProvider;
    private Provider<AcceptHeaderInterceptor> providesAcceptHeaderInterceptorProvider;
    private Provider<File> providesBelvedereDirProvider;
    private Provider<File> providesCacheDirProvider;
    private Provider<File> providesDataDirProvider;
    private Provider<BaseStorage> providesDiskLruStorageProvider;
    private Provider<UserAgentAndClientHeadersInterceptor> providesUserAgentHeaderInterceptorProvider;

    public static final class Builder {
        /* access modifiers changed from: private */
        public ZendeskApplicationModule zendeskApplicationModule;
        /* access modifiers changed from: private */
        public ZendeskNetworkModule zendeskNetworkModule;

        public ZendeskApplicationComponent build() {
            if (this.zendeskApplicationModule != null) {
                if (this.zendeskNetworkModule == null) {
                    this.zendeskNetworkModule = new ZendeskNetworkModule();
                }
                return new DaggerZendeskApplicationComponent(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(ZendeskApplicationModule.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        public Builder zendeskApplicationModule(ZendeskApplicationModule zendeskApplicationModule2) {
            C12021c.m31670a(zendeskApplicationModule2);
            this.zendeskApplicationModule = zendeskApplicationModule2;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.provideApplicationContextProvider = C12020b.m31669b(ZendeskApplicationModule_ProvideApplicationContextFactory.create(builder.zendeskApplicationModule));
        this.provideGsonProvider = C12022d.m31673a(ZendeskApplicationModule_ProvideGsonFactory.create());
        this.provideSerializerProvider = C12020b.m31669b(ZendeskStorageModule_ProvideSerializerFactory.create(this.provideGsonProvider));
        this.provideSettingsBaseStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideSettingsBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideSettingsStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideSettingsStorageFactory.create(this.provideSettingsBaseStorageProvider));
        this.provideIdentityBaseStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideIdentityStorageFactory.create(this.provideIdentityBaseStorageProvider));
        this.provideAdditionalSdkBaseStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.providesCacheDirProvider = C12020b.m31669b(ZendeskStorageModule_ProvidesCacheDirFactory.create(this.provideApplicationContextProvider));
        this.providesDiskLruStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvidesDiskLruStorageFactory.create(this.providesCacheDirProvider, this.provideSerializerProvider));
        this.provideCacheProvider = C12020b.m31669b(ZendeskStorageModule_ProvideCacheFactory.create(this.providesCacheDirProvider));
        this.providesDataDirProvider = C12020b.m31669b(ZendeskStorageModule_ProvidesDataDirFactory.create(this.provideApplicationContextProvider));
        this.providesBelvedereDirProvider = C12020b.m31669b(ZendeskStorageModule_ProvidesBelvedereDirFactory.create(this.provideApplicationContextProvider));
        this.provideSessionStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideSessionStorageFactory.create(this.provideIdentityStorageProvider, this.provideAdditionalSdkBaseStorageProvider, this.providesDiskLruStorageProvider, this.provideCacheProvider, this.providesCacheDirProvider, this.providesDataDirProvider, this.providesBelvedereDirProvider));
        this.provideSdkBaseStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideMemoryCacheProvider = C12020b.m31669b(ZendeskStorageModule_ProvideMemoryCacheFactory.create());
        this.provideSdkStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideSdkStorageFactory.create(this.provideSettingsStorageProvider, this.provideSessionStorageProvider, this.provideSdkBaseStorageProvider, this.provideMemoryCacheProvider));
        this.provideLegacyIdentityBaseStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideLegacyPushBaseStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityManagerProvider = C12020b.m31669b(ZendeskStorageModule_ProvideIdentityManagerFactory.create(this.provideIdentityStorageProvider));
        this.providePushDeviceIdStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvidePushDeviceIdStorageFactory.create(this.provideAdditionalSdkBaseStorageProvider));
        this.provideLegacyIdentityStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideLegacyIdentityStorageFactory.create(this.provideLegacyIdentityBaseStorageProvider, this.provideLegacyPushBaseStorageProvider, this.provideIdentityStorageProvider, this.provideIdentityManagerProvider, this.providePushDeviceIdStorageProvider));
        this.provideApplicationConfigurationProvider = C12020b.m31669b(ZendeskApplicationModule_ProvideApplicationConfigurationFactory.create(builder.zendeskApplicationModule));
        this.provideHttpLoggingInterceptorProvider = C12022d.m31673a(ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory.create());
        this.provideZendeskBasicHeadersInterceptorProvider = C12022d.m31673a(C13582x2dd20439.create(builder.zendeskNetworkModule, this.provideApplicationConfigurationProvider));
        this.providesUserAgentHeaderInterceptorProvider = C12022d.m31673a(ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory.create(builder.zendeskNetworkModule));
        this.provideExecutorProvider = C12020b.m31669b(ZendeskApplicationModule_ProvideExecutorFactory.create());
        this.provideBaseOkHttpClientProvider = C12020b.m31669b(ZendeskNetworkModule_ProvideBaseOkHttpClientFactory.create(builder.zendeskNetworkModule, this.provideHttpLoggingInterceptorProvider, this.provideZendeskBasicHeadersInterceptorProvider, this.providesUserAgentHeaderInterceptorProvider, this.provideExecutorProvider));
        this.provideAcceptLanguageHeaderInterceptorProvider = C12022d.m31673a(C13581x23150492.create(this.provideApplicationContextProvider));
        this.providesAcceptHeaderInterceptorProvider = C12022d.m31673a(ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory.create());
        this.provideCoreOkHttpClientProvider = C12020b.m31669b(ZendeskNetworkModule_ProvideCoreOkHttpClientFactory.create(this.provideBaseOkHttpClientProvider, this.provideAcceptLanguageHeaderInterceptorProvider, this.providesAcceptHeaderInterceptorProvider));
        this.provideCoreRetrofitProvider = C12020b.m31669b(ZendeskNetworkModule_ProvideCoreRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideCoreOkHttpClientProvider));
        this.provideBlipsServiceProvider = C12020b.m31669b(ZendeskProvidersModule_ProvideBlipsServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideDeviceInfoProvider = C12020b.m31669b(ZendeskApplicationModule_ProvideDeviceInfoFactory.create(this.provideApplicationContextProvider));
        this.provideBase64SerializerProvider = C12022d.m31673a(ZendeskApplicationModule_ProvideBase64SerializerFactory.create(builder.zendeskApplicationModule, this.provideSerializerProvider));
        this.provideCoreSettingsStorageProvider = C12020b.m31669b(ZendeskStorageModule_ProvideCoreSettingsStorageFactory.create(this.provideSettingsStorageProvider));
        this.providerZendeskBlipsProvider = C12020b.m31669b(ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory.create(this.provideBlipsServiceProvider, this.provideDeviceInfoProvider, this.provideBase64SerializerProvider, this.provideIdentityManagerProvider, this.provideApplicationConfigurationProvider, this.provideCoreSettingsStorageProvider, this.provideExecutorProvider));
        this.providerBlipsCoreProvider = C12020b.m31669b(ZendeskProvidersModule_ProviderBlipsCoreProviderFactory.create(this.providerZendeskBlipsProvider));
        this.provideAccessServiceProvider = C12022d.m31673a(ZendeskProvidersModule_ProvideAccessServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideAccessProvider = C12020b.m31669b(ZendeskProvidersModule_ProvideAccessProviderFactory.create(this.provideIdentityManagerProvider, this.provideAccessServiceProvider));
        this.provideAccessInterceptorProvider = C12022d.m31673a(ZendeskNetworkModule_ProvideAccessInterceptorFactory.create(this.provideIdentityManagerProvider, this.provideAccessProvider, this.provideSdkStorageProvider, this.provideCoreSettingsStorageProvider));
        this.provideZendeskUnauthorizedInterceptorProvider = C12022d.m31673a(C13583x5893b2b5.create(this.provideSessionStorageProvider));
        this.provideAuthHeaderInterceptorProvider = C12022d.m31673a(ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory.create(this.provideIdentityManagerProvider));
        this.provideSdkSettingsServiceProvider = C12022d.m31673a(ZendeskProvidersModule_ProvideSdkSettingsServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideZendeskSdkSettingsProvider = C12020b.m31669b(ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory.create(this.provideSdkSettingsServiceProvider, this.provideSettingsStorageProvider, this.provideCoreSettingsStorageProvider, this.provideSerializerProvider, this.provideApplicationConfigurationProvider, this.provideApplicationContextProvider));
        this.provideSdkSettingsProviderInternalProvider = C12020b.m31669b(ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory.create(this.provideZendeskSdkSettingsProvider));
        this.provideSettingsInterceptorProvider = C12022d.m31673a(ZendeskNetworkModule_ProvideSettingsInterceptorFactory.create(this.provideSdkSettingsProviderInternalProvider, this.provideSettingsStorageProvider));
        this.provideOkHttpClientProvider = C12020b.m31669b(ZendeskNetworkModule_ProvideOkHttpClientFactory.create(this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.providesAcceptHeaderInterceptorProvider, this.provideCacheProvider));
        this.provideRetrofitProvider = C12020b.m31669b(ZendeskNetworkModule_ProvideRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideOkHttpClientProvider));
        this.providePushRegistrationServiceProvider = C12022d.m31673a(ZendeskProvidersModule_ProvidePushRegistrationServiceFactory.create(this.provideRetrofitProvider));
        this.provideSdkSettingsProvider = C12020b.m31669b(ZendeskProvidersModule_ProvideSdkSettingsProviderFactory.create(this.provideZendeskSdkSettingsProvider));
        this.providePushRegistrationProvider = C12020b.m31669b(ZendeskProvidersModule_ProvidePushRegistrationProviderFactory.create(this.providePushRegistrationServiceProvider, this.provideIdentityManagerProvider, this.provideSdkSettingsProvider, this.providerBlipsCoreProvider, this.providePushDeviceIdStorageProvider, this.provideApplicationContextProvider));
        this.provideCachingInterceptorProvider = C12022d.m31673a(ZendeskNetworkModule_ProvideCachingInterceptorFactory.create(this.providesDiskLruStorageProvider));
        this.provideMediaOkHttpClientProvider = C12020b.m31669b(ZendeskNetworkModule_ProvideMediaOkHttpClientFactory.create(this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.provideCachingInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider));
        this.provideRestServiceProvider = C12020b.m31669b(ZendeskNetworkModule_ProvideRestServiceProviderFactory.create(this.provideRetrofitProvider, this.provideMediaOkHttpClientProvider, this.provideOkHttpClientProvider));
        this.providerBlipsProvider = C12020b.m31669b(ZendeskProvidersModule_ProviderBlipsProviderFactory.create(this.providerZendeskBlipsProvider));
        this.providerConnectivityManagerProvider = C12020b.m31669b(ZendeskProvidersModule_ProviderConnectivityManagerFactory.create(this.provideApplicationContextProvider));
        this.providerNetworkInfoProvider = C12020b.m31669b(ZendeskProvidersModule_ProviderNetworkInfoProviderFactory.create(this.provideApplicationContextProvider, this.providerConnectivityManagerProvider));
        this.actionHandlerRegistryProvider = C12020b.m31669b(ZendeskProvidersModule_ActionHandlerRegistryFactory.create());
        this.provideAuthProvider = C12020b.m31669b(ZendeskStorageModule_ProvideAuthProviderFactory.create(this.provideIdentityManagerProvider));
        this.provideCoreSdkModuleProvider = C12022d.m31673a(ZendeskProvidersModule_ProvideCoreSdkModuleFactory.create(this.provideSdkSettingsProvider, this.provideRestServiceProvider, this.providerBlipsProvider, this.provideSessionStorageProvider, this.providerNetworkInfoProvider, this.provideMemoryCacheProvider, this.actionHandlerRegistryProvider, this.provideExecutorProvider, this.provideApplicationContextProvider, this.provideAuthProvider, this.provideApplicationConfigurationProvider, this.providePushRegistrationProvider));
        this.provideUserServiceProvider = C12022d.m31673a(ZendeskProvidersModule_ProvideUserServiceFactory.create(this.provideRetrofitProvider));
        this.provideUserProvider = C12020b.m31669b(ZendeskProvidersModule_ProvideUserProviderFactory.create(this.provideUserServiceProvider));
        this.provideProviderStoreProvider = C12020b.m31669b(ZendeskProvidersModule_ProvideProviderStoreFactory.create(this.provideUserProvider, this.providePushRegistrationProvider));
        this.provideZendeskProvider = C12020b.m31669b(ZendeskApplicationModule_ProvideZendeskFactory.create(this.provideSdkStorageProvider, this.provideLegacyIdentityStorageProvider, this.provideIdentityManagerProvider, this.providerBlipsCoreProvider, this.providePushRegistrationProvider, this.provideCoreSdkModuleProvider, this.provideProviderStoreProvider));
    }

    public ZendeskShadow zendeskShadow() {
        return (ZendeskShadow) this.provideZendeskProvider.get();
    }

    private DaggerZendeskApplicationComponent(Builder builder) {
        initialize(builder);
    }
}

package zendesk.support;

import android.content.Context;
import com.google.gson.C11125d;
import com.squareup.picasso.Picasso;
import dagger.internal.C12020b;
import dagger.internal.C12021c;
import dagger.internal.C12022d;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import okhttp3.C13325v;
import p333g.p369e.p370a.C12095a;
import zendesk.belvedere.C13489a;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.AuthenticationProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationConfigurationFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetExecutorServiceFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetNetworkInfoProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.MemoryCache;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.SessionStorage;
import zendesk.suas.C13621h;
import zendesk.suas.Dispatcher;
import zendesk.suas.Store;
import zendesk.support.ZendeskDeepLinkParser.Module;
import zendesk.support.guide.HelpCenterActivity;
import zendesk.support.guide.HelpCenterActivity_MembersInjector;
import zendesk.support.guide.HelpCenterFragment;
import zendesk.support.guide.HelpCenterFragment_MembersInjector;
import zendesk.support.guide.ViewArticleActivity;
import zendesk.support.guide.ViewArticleActivity_MembersInjector;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestActivity_MembersInjector;
import zendesk.support.request.RequestComponent;
import zendesk.support.request.RequestModule;
import zendesk.support.request.RequestModule_ProvidesActionFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesAsyncMiddlewareFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderComponentFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentDownloaderFactory;
import zendesk.support.request.RequestModule_ProvidesAttachmentToDiskServiceFactory;
import zendesk.support.request.RequestModule_ProvidesBelvedereFactory;
import zendesk.support.request.RequestModule_ProvidesConversationsUpdatesComponentFactory;
import zendesk.support.request.RequestModule_ProvidesDiskQueueFactory;
import zendesk.support.request.RequestModule_ProvidesDispatcherFactory;
import zendesk.support.request.RequestModule_ProvidesHeadlessComponentListenerFactory;
import zendesk.support.request.RequestModule_ProvidesMessageFactoryFactory;
import zendesk.support.request.RequestModule_ProvidesPersistenceComponentFactory;
import zendesk.support.request.RequestModule_ProvidesReducerFactory;
import zendesk.support.request.RequestModule_ProvidesStoreFactory;
import zendesk.support.request.RequestViewConversationsDisabled;
import zendesk.support.request.RequestViewConversationsDisabled_MembersInjector;
import zendesk.support.request.RequestViewConversationsEnabled;
import zendesk.support.request.RequestViewConversationsEnabled_MembersInjector;
import zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource;
import zendesk.support.requestlist.RequestInfoDataSource.Repository;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListActivity_MembersInjector;
import zendesk.support.requestlist.RequestListComponent;
import zendesk.support.requestlist.RequestListModule;
import zendesk.support.requestlist.RequestListModule_ModelFactory;
import zendesk.support.requestlist.RequestListModule_PresenterFactory;
import zendesk.support.requestlist.RequestListModule_RefreshHandlerFactory;
import zendesk.support.requestlist.RequestListModule_RepositoryFactory;
import zendesk.support.requestlist.RequestListModule_ViewFactory;

public final class DaggerSupportSdkComponent implements SupportSdkComponent {
    /* access modifiers changed from: private */
    public Provider<ActionHandlerRegistry> actionHandlerRegistryProvider;
    /* access modifiers changed from: private */
    public CoreModule coreModule;
    private Provider<ApplicationConfiguration> getApplicationConfigurationProvider;
    /* access modifiers changed from: private */
    public Provider<Context> getApplicationContextProvider;
    /* access modifiers changed from: private */
    public Provider<AuthenticationProvider> getAuthenticationProvider;
    /* access modifiers changed from: private */
    public Provider<ExecutorService> getExecutorServiceProvider;
    /* access modifiers changed from: private */
    public Provider<MemoryCache> getMemoryCacheProvider;
    private Provider<SessionStorage> getSessionStorageProvider;
    /* access modifiers changed from: private */
    public Provider<Executor> mainThreadExecutorProvider;
    private Provider<List<ActionHandler>> providesActionHandlersProvider;
    /* access modifiers changed from: private */
    public Provider<SupportBlipsProvider> providesBlipsProvider;
    /* access modifiers changed from: private */
    public Provider<ZendeskDeepLinkHelper> providesDeepLinkHelperProvider;
    private Provider<ZendeskDeepLinkParser> providesDeepLinkParserProvider;
    /* access modifiers changed from: private */
    public Provider<C13325v> providesOkHttpClientProvider;
    private Provider<List<Module>> providesParserModuleProvider;
    /* access modifiers changed from: private */
    public Provider<Picasso> providesPicassoProvider;
    private Provider<C11125d> providesProvider;
    private Provider<C12095a> providesRequestDiskLruCacheProvider;
    /* access modifiers changed from: private */
    public Provider<RequestProvider> providesRequestProvider;
    /* access modifiers changed from: private */
    public Provider<SupportSettingsProvider> providesSettingsProvider;
    /* access modifiers changed from: private */
    public Provider<UploadProvider> providesUploadProvider;
    private Provider<String> providesZendeskUrlProvider;
    /* access modifiers changed from: private */
    public Provider<LocalDataSource> requestInfoDataSourceProvider;
    private SupportModule supportModule;
    /* access modifiers changed from: private */
    public Provider<SupportUiStorage> supportUIStorageProvider;

    public static final class Builder {
        /* access modifiers changed from: private */
        public CoreModule coreModule;
        /* access modifiers changed from: private */
        public SupportModule supportModule;
        /* access modifiers changed from: private */
        public SupportSdkModule supportSdkModule;

        public SupportSdkComponent build() {
            String str = " must be set";
            if (this.supportModule == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(SupportModule.class.getCanonicalName());
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            } else if (this.coreModule != null) {
                if (this.supportSdkModule == null) {
                    this.supportSdkModule = new SupportSdkModule();
                }
                return new DaggerSupportSdkComponent(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(CoreModule.class.getCanonicalName());
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }

        public Builder coreModule(CoreModule coreModule2) {
            C12021c.m31670a(coreModule2);
            this.coreModule = coreModule2;
            return this;
        }

        public Builder supportModule(SupportModule supportModule2) {
            C12021c.m31670a(supportModule2);
            this.supportModule = supportModule2;
            return this;
        }

        public Builder supportSdkModule(SupportSdkModule supportSdkModule2) {
            C12021c.m31670a(supportSdkModule2);
            this.supportSdkModule = supportSdkModule2;
            return this;
        }

        private Builder() {
        }
    }

    private final class RequestComponentImpl implements RequestComponent {
        private Provider providesActionFactoryProvider;
        private Provider providesAsyncMiddlewareProvider;
        private Provider providesAttachmentDownloaderComponentProvider;
        private Provider providesAttachmentDownloaderProvider;
        private Provider providesAttachmentToDiskServiceProvider;
        private Provider<C13489a> providesBelvedereProvider;
        private Provider providesConversationsUpdatesComponentProvider;
        private Provider providesDiskQueueProvider;
        private Provider<Dispatcher> providesDispatcherProvider;
        private Provider providesHeadlessComponentListenerProvider;
        private Provider providesMessageFactoryProvider;
        private Provider providesPersistenceComponentProvider;
        private Provider<List<C13621h>> providesReducerProvider;
        private Provider<Store> providesStoreProvider;
        private final RequestModule requestModule;

        private void initialize() {
            this.providesReducerProvider = C12020b.m31669b(RequestModule_ProvidesReducerFactory.create());
            this.providesAsyncMiddlewareProvider = C12020b.m31669b(RequestModule_ProvidesAsyncMiddlewareFactory.create());
            this.providesStoreProvider = C12020b.m31669b(RequestModule_ProvidesStoreFactory.create(this.providesReducerProvider, this.providesAsyncMiddlewareProvider));
            this.providesBelvedereProvider = C12020b.m31669b(RequestModule_ProvidesBelvedereFactory.create(DaggerSupportSdkComponent.this.getApplicationContextProvider));
            this.providesActionFactoryProvider = C12020b.m31669b(RequestModule_ProvidesActionFactoryFactory.create(DaggerSupportSdkComponent.this.providesRequestProvider, DaggerSupportSdkComponent.this.providesSettingsProvider, DaggerSupportSdkComponent.this.providesUploadProvider, this.providesBelvedereProvider, DaggerSupportSdkComponent.this.supportUIStorageProvider, DaggerSupportSdkComponent.this.getExecutorServiceProvider, DaggerSupportSdkComponent.this.mainThreadExecutorProvider, DaggerSupportSdkComponent.this.getAuthenticationProvider, DaggerSupportSdkComponent.this.providesBlipsProvider));
            this.providesDiskQueueProvider = C12020b.m31669b(RequestModule_ProvidesDiskQueueFactory.create(DaggerSupportSdkComponent.this.getExecutorServiceProvider));
            this.providesPersistenceComponentProvider = C12020b.m31669b(RequestModule_ProvidesPersistenceComponentFactory.create(DaggerSupportSdkComponent.this.supportUIStorageProvider, this.providesDiskQueueProvider, DaggerSupportSdkComponent.this.getExecutorServiceProvider));
            this.providesDispatcherProvider = C12020b.m31669b(RequestModule_ProvidesDispatcherFactory.create(this.providesStoreProvider));
            this.providesAttachmentToDiskServiceProvider = C12020b.m31669b(RequestModule_ProvidesAttachmentToDiskServiceFactory.create(DaggerSupportSdkComponent.this.providesOkHttpClientProvider, DaggerSupportSdkComponent.this.getExecutorServiceProvider));
            this.providesAttachmentDownloaderProvider = C12020b.m31669b(RequestModule_ProvidesAttachmentDownloaderFactory.create(this.providesBelvedereProvider, this.providesAttachmentToDiskServiceProvider));
            this.providesAttachmentDownloaderComponentProvider = C12020b.m31669b(RequestModule_ProvidesAttachmentDownloaderComponentFactory.create(this.providesDispatcherProvider, this.providesActionFactoryProvider, this.providesAttachmentDownloaderProvider));
            this.providesConversationsUpdatesComponentProvider = C12022d.m31673a(RequestModule_ProvidesConversationsUpdatesComponentFactory.create(DaggerSupportSdkComponent.this.getApplicationContextProvider, DaggerSupportSdkComponent.this.actionHandlerRegistryProvider, DaggerSupportSdkComponent.this.requestInfoDataSourceProvider));
            this.providesHeadlessComponentListenerProvider = C12020b.m31669b(RequestModule_ProvidesHeadlessComponentListenerFactory.create(this.providesPersistenceComponentProvider, this.providesAttachmentDownloaderComponentProvider, this.providesConversationsUpdatesComponentProvider));
            this.providesMessageFactoryProvider = C12020b.m31669b(RequestModule_ProvidesMessageFactoryFactory.create(this.requestModule, DaggerSupportSdkComponent.this.getApplicationContextProvider, DaggerSupportSdkComponent.this.providesPicassoProvider, this.providesActionFactoryProvider, this.providesDispatcherProvider, DaggerSupportSdkComponent.this.providesDeepLinkHelperProvider));
        }

        private RequestActivity injectRequestActivity(RequestActivity requestActivity) {
            RequestActivity_MembersInjector.injectStore(requestActivity, (Store) this.providesStoreProvider.get());
            RequestActivity_MembersInjector.injectAf(requestActivity, this.providesActionFactoryProvider.get());
            RequestActivity_MembersInjector.injectHeadlessComponentListener(requestActivity, this.providesHeadlessComponentListenerProvider.get());
            RequestActivity_MembersInjector.injectPicasso(requestActivity, (Picasso) DaggerSupportSdkComponent.this.providesPicassoProvider.get());
            ActionHandlerRegistry proxyActionHandlerRegistry = CoreModule_ActionHandlerRegistryFactory.proxyActionHandlerRegistry(DaggerSupportSdkComponent.this.coreModule);
            C12021c.m31671a(proxyActionHandlerRegistry, "Cannot return null from a non-@Nullable @Provides method");
            RequestActivity_MembersInjector.injectActionHandlerRegistry(requestActivity, proxyActionHandlerRegistry);
            return requestActivity;
        }

        private RequestViewConversationsDisabled injectRequestViewConversationsDisabled(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            RequestViewConversationsDisabled_MembersInjector.injectStore(requestViewConversationsDisabled, (Store) this.providesStoreProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectAf(requestViewConversationsDisabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsDisabled_MembersInjector.injectPicasso(requestViewConversationsDisabled, (Picasso) DaggerSupportSdkComponent.this.providesPicassoProvider.get());
            return requestViewConversationsDisabled;
        }

        private RequestViewConversationsEnabled injectRequestViewConversationsEnabled(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            RequestViewConversationsEnabled_MembersInjector.injectStore(requestViewConversationsEnabled, (Store) this.providesStoreProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectAf(requestViewConversationsEnabled, this.providesActionFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectCellFactory(requestViewConversationsEnabled, this.providesMessageFactoryProvider.get());
            RequestViewConversationsEnabled_MembersInjector.injectPicasso(requestViewConversationsEnabled, (Picasso) DaggerSupportSdkComponent.this.providesPicassoProvider.get());
            return requestViewConversationsEnabled;
        }

        public void inject(RequestActivity requestActivity) {
            injectRequestActivity(requestActivity);
        }

        private RequestComponentImpl(RequestModule requestModule2) {
            C12021c.m31670a(requestModule2);
            this.requestModule = requestModule2;
            initialize();
        }

        public void inject(RequestViewConversationsEnabled requestViewConversationsEnabled) {
            injectRequestViewConversationsEnabled(requestViewConversationsEnabled);
        }

        public void inject(RequestViewConversationsDisabled requestViewConversationsDisabled) {
            injectRequestViewConversationsDisabled(requestViewConversationsDisabled);
        }
    }

    private final class RequestListComponentImpl implements RequestListComponent {
        private Provider modelProvider;
        private Provider presenterProvider;
        private Provider refreshHandlerProvider;
        private Provider<Repository> repositoryProvider;
        private final RequestListModule requestListModule;
        private Provider viewProvider;

        private void initialize() {
            this.viewProvider = C12020b.m31669b(RequestListModule_ViewFactory.create(this.requestListModule, DaggerSupportSdkComponent.this.providesPicassoProvider));
            this.repositoryProvider = C12020b.m31669b(RequestListModule_RepositoryFactory.create(DaggerSupportSdkComponent.this.requestInfoDataSourceProvider, DaggerSupportSdkComponent.this.supportUIStorageProvider, DaggerSupportSdkComponent.this.providesRequestProvider, DaggerSupportSdkComponent.this.mainThreadExecutorProvider, DaggerSupportSdkComponent.this.getExecutorServiceProvider));
            this.modelProvider = C12020b.m31669b(RequestListModule_ModelFactory.create(this.repositoryProvider, DaggerSupportSdkComponent.this.getMemoryCacheProvider, DaggerSupportSdkComponent.this.providesBlipsProvider, DaggerSupportSdkComponent.this.providesSettingsProvider));
            this.presenterProvider = C12020b.m31669b(RequestListModule_PresenterFactory.create(this.viewProvider, this.modelProvider));
            this.refreshHandlerProvider = C12020b.m31669b(RequestListModule_RefreshHandlerFactory.create(this.presenterProvider));
        }

        private RequestListActivity injectRequestListActivity(RequestListActivity requestListActivity) {
            RequestListActivity_MembersInjector.injectPresenter(requestListActivity, this.presenterProvider.get());
            RequestListActivity_MembersInjector.injectView(requestListActivity, this.viewProvider.get());
            RequestListActivity_MembersInjector.injectModel(requestListActivity, this.modelProvider.get());
            ActionHandlerRegistry proxyActionHandlerRegistry = CoreModule_ActionHandlerRegistryFactory.proxyActionHandlerRegistry(DaggerSupportSdkComponent.this.coreModule);
            C12021c.m31671a(proxyActionHandlerRegistry, "Cannot return null from a non-@Nullable @Provides method");
            RequestListActivity_MembersInjector.injectActionHandlerRegistry(requestListActivity, proxyActionHandlerRegistry);
            RequestListActivity_MembersInjector.injectSyncHandler(requestListActivity, this.refreshHandlerProvider.get());
            return requestListActivity;
        }

        public void inject(RequestListActivity requestListActivity) {
            injectRequestListActivity(requestListActivity);
        }

        private RequestListComponentImpl(RequestListModule requestListModule2) {
            C12021c.m31670a(requestListModule2);
            this.requestListModule = requestListModule2;
            initialize();
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(Builder builder) {
        this.supportModule = builder.supportModule;
        this.coreModule = builder.coreModule;
        this.actionHandlerRegistryProvider = CoreModule_ActionHandlerRegistryFactory.create(builder.coreModule);
        this.getApplicationConfigurationProvider = CoreModule_GetApplicationConfigurationFactory.create(builder.coreModule);
        this.providesZendeskUrlProvider = C12020b.m31669b(SupportSdkModule_ProvidesZendeskUrlFactory.create(builder.supportSdkModule, this.getApplicationConfigurationProvider));
        this.providesParserModuleProvider = C12020b.m31669b(SupportSdkModule_ProvidesParserModuleFactory.create(builder.supportSdkModule));
        this.providesDeepLinkParserProvider = C12020b.m31669b(SupportSdkModule_ProvidesDeepLinkParserFactory.create(builder.supportSdkModule, this.providesZendeskUrlProvider, this.providesParserModuleProvider));
        this.providesDeepLinkHelperProvider = C12020b.m31669b(SupportSdkModule_ProvidesDeepLinkHelperFactory.create(builder.supportSdkModule, this.actionHandlerRegistryProvider, this.providesDeepLinkParserProvider));
        this.providesActionHandlersProvider = C12020b.m31669b(SupportSdkModule_ProvidesActionHandlersFactory.create(builder.supportSdkModule));
        this.providesRequestProvider = SupportModule_ProvidesRequestProviderFactory.create(builder.supportModule);
        this.providesSettingsProvider = SupportModule_ProvidesSettingsProviderFactory.create(builder.supportModule);
        this.providesUploadProvider = SupportModule_ProvidesUploadProviderFactory.create(builder.supportModule);
        this.getApplicationContextProvider = CoreModule_GetApplicationContextFactory.create(builder.coreModule);
        this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(builder.coreModule);
        this.providesRequestDiskLruCacheProvider = C12020b.m31669b(SupportSdkModule_ProvidesRequestDiskLruCacheFactory.create(builder.supportSdkModule, this.getSessionStorageProvider));
        this.providesProvider = C12020b.m31669b(SupportSdkModule_ProvidesFactory.create(builder.supportSdkModule));
        this.supportUIStorageProvider = C12020b.m31669b(SupportSdkModule_SupportUIStorageFactory.create(builder.supportSdkModule, this.providesRequestDiskLruCacheProvider, this.providesProvider));
        this.getExecutorServiceProvider = CoreModule_GetExecutorServiceFactory.create(builder.coreModule);
        this.mainThreadExecutorProvider = C12020b.m31669b(SupportSdkModule_MainThreadExecutorFactory.create(builder.supportSdkModule));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(builder.coreModule);
        this.providesBlipsProvider = SupportModule_ProvidesBlipsProviderFactory.create(builder.supportModule);
        this.providesOkHttpClientProvider = SupportModule_ProvidesOkHttpClientFactory.create(builder.supportModule);
        this.requestInfoDataSourceProvider = SupportSdkModule_RequestInfoDataSourceFactory.create(builder.supportSdkModule, this.supportUIStorageProvider, this.mainThreadExecutorProvider, this.getExecutorServiceProvider);
        this.providesPicassoProvider = C12020b.m31669b(SupportSdkModule_ProvidesPicassoFactory.create(builder.supportSdkModule, this.getApplicationContextProvider, this.providesOkHttpClientProvider, this.getExecutorServiceProvider));
        this.getMemoryCacheProvider = CoreModule_GetMemoryCacheFactory.create(builder.coreModule);
    }

    private DeepLinkingBroadcastReceiver injectDeepLinkingBroadcastReceiver(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        DeepLinkingBroadcastReceiver_MembersInjector.injectDeepLinkHelper(deepLinkingBroadcastReceiver, (ZendeskDeepLinkHelper) this.providesDeepLinkHelperProvider.get());
        return deepLinkingBroadcastReceiver;
    }

    private HelpCenterActivity injectHelpCenterActivity(HelpCenterActivity helpCenterActivity) {
        HelpCenterProvider providesHelpCenterProvider = this.supportModule.providesHelpCenterProvider();
        String str = "Cannot return null from a non-@Nullable @Provides method";
        C12021c.m31671a(providesHelpCenterProvider, str);
        HelpCenterActivity_MembersInjector.injectHelpCenterProvider(helpCenterActivity, providesHelpCenterProvider);
        SupportSettingsProvider providesSettingsProvider2 = this.supportModule.providesSettingsProvider();
        C12021c.m31671a(providesSettingsProvider2, str);
        HelpCenterActivity_MembersInjector.injectSettingsProvider(helpCenterActivity, providesSettingsProvider2);
        NetworkInfoProvider proxyGetNetworkInfoProvider = CoreModule_GetNetworkInfoProviderFactory.proxyGetNetworkInfoProvider(this.coreModule);
        C12021c.m31671a(proxyGetNetworkInfoProvider, str);
        HelpCenterActivity_MembersInjector.injectNetworkInfoProvider(helpCenterActivity, proxyGetNetworkInfoProvider);
        return helpCenterActivity;
    }

    private HelpCenterFragment injectHelpCenterFragment(HelpCenterFragment helpCenterFragment) {
        HelpCenterProvider providesHelpCenterProvider = this.supportModule.providesHelpCenterProvider();
        String str = "Cannot return null from a non-@Nullable @Provides method";
        C12021c.m31671a(providesHelpCenterProvider, str);
        HelpCenterFragment_MembersInjector.injectHelpCenterProvider(helpCenterFragment, providesHelpCenterProvider);
        NetworkInfoProvider proxyGetNetworkInfoProvider = CoreModule_GetNetworkInfoProviderFactory.proxyGetNetworkInfoProvider(this.coreModule);
        C12021c.m31671a(proxyGetNetworkInfoProvider, str);
        HelpCenterFragment_MembersInjector.injectNetworkInfoProvider(helpCenterFragment, proxyGetNetworkInfoProvider);
        return helpCenterFragment;
    }

    private SdkDependencyProvider injectSdkDependencyProvider(SdkDependencyProvider sdkDependencyProvider) {
        ActionHandlerRegistry proxyActionHandlerRegistry = CoreModule_ActionHandlerRegistryFactory.proxyActionHandlerRegistry(this.coreModule);
        C12021c.m31671a(proxyActionHandlerRegistry, "Cannot return null from a non-@Nullable @Provides method");
        SdkDependencyProvider_MembersInjector.injectRegistry(sdkDependencyProvider, proxyActionHandlerRegistry);
        SdkDependencyProvider_MembersInjector.injectActionHandlers(sdkDependencyProvider, (List) this.providesActionHandlersProvider.get());
        return sdkDependencyProvider;
    }

    private ViewArticleActivity injectViewArticleActivity(ViewArticleActivity viewArticleActivity) {
        C13325v providesOkHttpClient = this.supportModule.providesOkHttpClient();
        String str = "Cannot return null from a non-@Nullable @Provides method";
        C12021c.m31671a(providesOkHttpClient, str);
        ViewArticleActivity_MembersInjector.injectOkHttpClient(viewArticleActivity, providesOkHttpClient);
        ApplicationConfiguration proxyGetApplicationConfiguration = CoreModule_GetApplicationConfigurationFactory.proxyGetApplicationConfiguration(this.coreModule);
        C12021c.m31671a(proxyGetApplicationConfiguration, str);
        ViewArticleActivity_MembersInjector.injectApplicationConfiguration(viewArticleActivity, proxyGetApplicationConfiguration);
        HelpCenterProvider providesHelpCenterProvider = this.supportModule.providesHelpCenterProvider();
        C12021c.m31671a(providesHelpCenterProvider, str);
        ViewArticleActivity_MembersInjector.injectHelpCenterProvider(viewArticleActivity, providesHelpCenterProvider);
        ArticleVoteStorage providesArticleVoteStorage = this.supportModule.providesArticleVoteStorage();
        C12021c.m31671a(providesArticleVoteStorage, str);
        ViewArticleActivity_MembersInjector.injectArticleVoteStorage(viewArticleActivity, providesArticleVoteStorage);
        ViewArticleActivity_MembersInjector.injectDeepLinkHelper(viewArticleActivity, (ZendeskDeepLinkHelper) this.providesDeepLinkHelperProvider.get());
        NetworkInfoProvider proxyGetNetworkInfoProvider = CoreModule_GetNetworkInfoProviderFactory.proxyGetNetworkInfoProvider(this.coreModule);
        C12021c.m31671a(proxyGetNetworkInfoProvider, str);
        ViewArticleActivity_MembersInjector.injectNetworkInfoProvider(viewArticleActivity, proxyGetNetworkInfoProvider);
        SupportSettingsProvider providesSettingsProvider2 = this.supportModule.providesSettingsProvider();
        C12021c.m31671a(providesSettingsProvider2, str);
        ViewArticleActivity_MembersInjector.injectSupportSettingsProvider(viewArticleActivity, providesSettingsProvider2);
        return viewArticleActivity;
    }

    public HelpCenterProvider helpCenterProvider() {
        HelpCenterProvider providesHelpCenterProvider = this.supportModule.providesHelpCenterProvider();
        C12021c.m31671a(providesHelpCenterProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesHelpCenterProvider;
    }

    public void inject(ViewArticleActivity viewArticleActivity) {
        injectViewArticleActivity(viewArticleActivity);
    }

    public RequestComponent plus(RequestModule requestModule) {
        return new RequestComponentImpl(requestModule);
    }

    private DaggerSupportSdkComponent(Builder builder) {
        initialize(builder);
    }

    public void inject(HelpCenterActivity helpCenterActivity) {
        injectHelpCenterActivity(helpCenterActivity);
    }

    public RequestListComponent plus(RequestListModule requestListModule) {
        return new RequestListComponentImpl(requestListModule);
    }

    public void inject(HelpCenterFragment helpCenterFragment) {
        injectHelpCenterFragment(helpCenterFragment);
    }

    public void inject(SdkDependencyProvider sdkDependencyProvider) {
        injectSdkDependencyProvider(sdkDependencyProvider);
    }

    public void inject(DeepLinkingBroadcastReceiver deepLinkingBroadcastReceiver) {
        injectDeepLinkingBroadcastReceiver(deepLinkingBroadcastReceiver);
    }
}

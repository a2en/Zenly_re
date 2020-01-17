package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.ExecutorService;
import retrofit2.C13430i;

class ZendeskProvidersModule {
    static ActionHandlerRegistry actionHandlerRegistry() {
        return Zendesk.INSTANCE.actionHandlerRegistry();
    }

    static AccessProvider provideAccessProvider(IdentityManager identityManager, AccessService accessService) {
        return new ZendeskAccessProvider(identityManager, accessService);
    }

    static AccessService provideAccessService(C13430i iVar) {
        return (AccessService) iVar.mo38670a(AccessService.class);
    }

    static BlipsService provideBlipsService(C13430i iVar) {
        return (BlipsService) iVar.mo38670a(BlipsService.class);
    }

    static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ExecutorService executorService, Context context, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider) {
        CoreModule coreModule = new CoreModule(settingsProvider, restServiceProvider, blipsProvider, sessionStorage, networkInfoProvider, context, actionHandlerRegistry, memoryCache, executorService, authenticationProvider, applicationConfiguration, pushRegistrationProvider);
        return coreModule;
    }

    static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        return new ZendeskProviderStore(userProvider, pushRegistrationProvider);
    }

    static PushRegistrationProvider providePushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Context context) {
        ZendeskPushRegistrationProvider zendeskPushRegistrationProvider = new ZendeskPushRegistrationProvider(pushRegistrationService, identityManager, settingsProvider, blipsCoreProvider, pushDeviceIdStorage, DeviceInfo.getCurrentLocale(context));
        return zendeskPushRegistrationProvider;
    }

    static PushRegistrationService providePushRegistrationService(C13430i iVar) {
        return (PushRegistrationService) iVar.mo38670a(PushRegistrationService.class);
    }

    static SettingsProvider provideSdkSettingsProvider(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    static SdkSettingsService provideSdkSettingsService(C13430i iVar) {
        return (SdkSettingsService) iVar.mo38670a(SdkSettingsService.class);
    }

    static UserProvider provideUserProvider(UserService userService) {
        return new ZendeskUserProvider(userService);
    }

    static UserService provideUserService(C13430i iVar) {
        return (UserService) iVar.mo38670a(UserService.class);
    }

    static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, Serializer serializer, ApplicationConfiguration applicationConfiguration, Context context) {
        ZendeskSettingsProvider zendeskSettingsProvider = new ZendeskSettingsProvider(sdkSettingsService, settingsStorage, coreSettingsStorage, serializer, applicationConfiguration.getApplicationId(), context);
        return zendeskSettingsProvider;
    }

    static BlipsCoreProvider providerBlipsCoreProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    static BlipsProvider providerBlipsProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    static ConnectivityManager providerConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    static NetworkInfoProvider providerNetworkInfoProvider(Context context, ConnectivityManager connectivityManager) {
        return new ZendeskNetworkInfoProvider(context, connectivityManager);
    }

    static ZendeskBlipsProvider providerZendeskBlipsProvider(BlipsService blipsService, DeviceInfo deviceInfo, Serializer serializer, IdentityManager identityManager, ApplicationConfiguration applicationConfiguration, CoreSettingsStorage coreSettingsStorage, ExecutorService executorService) {
        ZendeskBlipsProvider zendeskBlipsProvider = new ZendeskBlipsProvider(blipsService, deviceInfo, serializer, identityManager, applicationConfiguration.getApplicationId(), coreSettingsStorage, executorService);
        return zendeskBlipsProvider;
    }
}

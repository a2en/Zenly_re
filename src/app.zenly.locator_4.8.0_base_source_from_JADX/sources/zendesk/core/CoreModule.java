package zendesk.core;

import android.content.Context;
import java.util.concurrent.ExecutorService;

public class CoreModule {
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final ApplicationConfiguration applicationConfiguration;
    private final Context applicationContext;
    private final AuthenticationProvider authenticationProvider;
    private final BlipsProvider blipsProvider;
    private final ExecutorService executor;
    private final MemoryCache memoryCache;
    private final NetworkInfoProvider networkInfoProvider;
    private final RestServiceProvider restServiceProvider;
    private final SessionStorage sessionStorage;
    private final SettingsProvider settingsProvider;

    CoreModule(SettingsProvider settingsProvider2, RestServiceProvider restServiceProvider2, BlipsProvider blipsProvider2, SessionStorage sessionStorage2, NetworkInfoProvider networkInfoProvider2, Context context, ActionHandlerRegistry actionHandlerRegistry2, MemoryCache memoryCache2, ExecutorService executorService, AuthenticationProvider authenticationProvider2, ApplicationConfiguration applicationConfiguration2, PushRegistrationProvider pushRegistrationProvider) {
        this.settingsProvider = settingsProvider2;
        this.restServiceProvider = restServiceProvider2;
        this.blipsProvider = blipsProvider2;
        this.sessionStorage = sessionStorage2;
        this.networkInfoProvider = networkInfoProvider2;
        this.applicationContext = context;
        this.actionHandlerRegistry = actionHandlerRegistry2;
        this.memoryCache = memoryCache2;
        this.executor = executorService;
        this.authenticationProvider = authenticationProvider2;
        this.applicationConfiguration = applicationConfiguration2;
    }

    /* access modifiers changed from: 0000 */
    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    /* access modifiers changed from: 0000 */
    public ApplicationConfiguration getApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    /* access modifiers changed from: 0000 */
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    /* access modifiers changed from: 0000 */
    public AuthenticationProvider getAuthenticationProvider() {
        return this.authenticationProvider;
    }

    /* access modifiers changed from: 0000 */
    public BlipsProvider getBlipsProvider() {
        return this.blipsProvider;
    }

    /* access modifiers changed from: 0000 */
    public ExecutorService getExecutorService() {
        return this.executor;
    }

    /* access modifiers changed from: 0000 */
    public MemoryCache getMemoryCache() {
        return this.memoryCache;
    }

    /* access modifiers changed from: 0000 */
    public NetworkInfoProvider getNetworkInfoProvider() {
        return this.networkInfoProvider;
    }

    /* access modifiers changed from: 0000 */
    public RestServiceProvider getRestServiceProvider() {
        return this.restServiceProvider;
    }

    /* access modifiers changed from: 0000 */
    public SessionStorage getSessionStorage() {
        return this.sessionStorage;
    }

    /* access modifiers changed from: 0000 */
    public SettingsProvider getSettingsProvider() {
        return this.settingsProvider;
    }
}

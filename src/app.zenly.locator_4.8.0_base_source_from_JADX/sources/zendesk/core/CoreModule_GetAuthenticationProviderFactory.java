package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_GetAuthenticationProviderFactory implements Factory<AuthenticationProvider> {
    private final CoreModule module;

    public CoreModule_GetAuthenticationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<AuthenticationProvider> create(CoreModule coreModule) {
        return new CoreModule_GetAuthenticationProviderFactory(coreModule);
    }

    public static AuthenticationProvider proxyGetAuthenticationProvider(CoreModule coreModule) {
        return coreModule.getAuthenticationProvider();
    }

    public AuthenticationProvider get() {
        AuthenticationProvider authenticationProvider = this.module.getAuthenticationProvider();
        C12021c.m31671a(authenticationProvider, "Cannot return null from a non-@Nullable @Provides method");
        return authenticationProvider;
    }
}

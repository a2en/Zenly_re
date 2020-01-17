package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory */
public final class C13583x5893b2b5 implements Factory<ZendeskUnauthorizedInterceptor> {
    private final Provider<SessionStorage> sessionStorageProvider;

    public C13583x5893b2b5(Provider<SessionStorage> provider) {
        this.sessionStorageProvider = provider;
    }

    public static Factory<ZendeskUnauthorizedInterceptor> create(Provider<SessionStorage> provider) {
        return new C13583x5893b2b5(provider);
    }

    public ZendeskUnauthorizedInterceptor get() {
        ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor = ZendeskNetworkModule.provideZendeskUnauthorizedInterceptor((SessionStorage) this.sessionStorageProvider.get());
        C12021c.m31671a(provideZendeskUnauthorizedInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideZendeskUnauthorizedInterceptor;
    }
}

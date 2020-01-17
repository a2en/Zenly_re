package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideAcceptLanguageHeaderInterceptorFactory */
public final class C13581x23150492 implements Factory<AcceptLanguageHeaderInterceptor> {
    private final Provider<Context> contextProvider;

    public C13581x23150492(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<AcceptLanguageHeaderInterceptor> create(Provider<Context> provider) {
        return new C13581x23150492(provider);
    }

    public AcceptLanguageHeaderInterceptor get() {
        AcceptLanguageHeaderInterceptor provideAcceptLanguageHeaderInterceptor = ZendeskNetworkModule.provideAcceptLanguageHeaderInterceptor((Context) this.contextProvider.get());
        C12021c.m31671a(provideAcceptLanguageHeaderInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideAcceptLanguageHeaderInterceptor;
    }
}

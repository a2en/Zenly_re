package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ServiceModule_ProvideHelpCenterCachingInterceptorFactory implements Factory<HelpCenterCachingInterceptor> {
    private static final ServiceModule_ProvideHelpCenterCachingInterceptorFactory INSTANCE = new ServiceModule_ProvideHelpCenterCachingInterceptorFactory();

    public static Factory<HelpCenterCachingInterceptor> create() {
        return INSTANCE;
    }

    public HelpCenterCachingInterceptor get() {
        HelpCenterCachingInterceptor provideHelpCenterCachingInterceptor = ServiceModule.provideHelpCenterCachingInterceptor();
        C12021c.m31671a(provideHelpCenterCachingInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideHelpCenterCachingInterceptor;
    }
}

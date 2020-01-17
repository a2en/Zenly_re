package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import okhttp3.logging.HttpLoggingInterceptor;

public final class ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
    private static final ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory();

    public static Factory<HttpLoggingInterceptor> create() {
        return INSTANCE;
    }

    public HttpLoggingInterceptor get() {
        HttpLoggingInterceptor provideHttpLoggingInterceptor = ZendeskApplicationModule.provideHttpLoggingInterceptor();
        C12021c.m31671a(provideHttpLoggingInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideHttpLoggingInterceptor;
    }
}

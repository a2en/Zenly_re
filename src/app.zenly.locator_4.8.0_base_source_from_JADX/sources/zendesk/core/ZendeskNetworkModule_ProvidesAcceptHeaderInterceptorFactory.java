package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory implements Factory<AcceptHeaderInterceptor> {
    private static final ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory INSTANCE = new ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory();

    public static Factory<AcceptHeaderInterceptor> create() {
        return INSTANCE;
    }

    public AcceptHeaderInterceptor get() {
        AcceptHeaderInterceptor providesAcceptHeaderInterceptor = ZendeskNetworkModule.providesAcceptHeaderInterceptor();
        C12021c.m31671a(providesAcceptHeaderInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return providesAcceptHeaderInterceptor;
    }
}

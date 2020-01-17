package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory implements Factory<UserAgentAndClientHeadersInterceptor> {
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule) {
        this.module = zendeskNetworkModule;
    }

    public static Factory<UserAgentAndClientHeadersInterceptor> create(ZendeskNetworkModule zendeskNetworkModule) {
        return new ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(zendeskNetworkModule);
    }

    public UserAgentAndClientHeadersInterceptor get() {
        UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor = this.module.providesUserAgentHeaderInterceptor();
        C12021c.m31671a(providesUserAgentHeaderInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return providesUserAgentHeaderInterceptor;
    }
}

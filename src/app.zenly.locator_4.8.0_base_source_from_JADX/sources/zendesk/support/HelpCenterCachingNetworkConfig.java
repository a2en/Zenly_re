package zendesk.support;

import okhttp3.C13325v.C13327b;
import okhttp3.Interceptor;
import zendesk.core.CustomNetworkConfig;

class HelpCenterCachingNetworkConfig extends CustomNetworkConfig {
    private HelpCenterCachingInterceptor interceptor;

    HelpCenterCachingNetworkConfig(HelpCenterCachingInterceptor helpCenterCachingInterceptor) {
        this.interceptor = helpCenterCachingInterceptor;
    }

    public void configureOkHttpClient(C13327b bVar) {
        bVar.mo38370b((Interceptor) this.interceptor);
    }
}

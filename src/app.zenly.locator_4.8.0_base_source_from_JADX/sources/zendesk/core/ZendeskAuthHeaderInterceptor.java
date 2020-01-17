package zendesk.core;

import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13331y.C13332a;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class ZendeskAuthHeaderInterceptor implements Interceptor {
    private IdentityManager identityManager;

    ZendeskAuthHeaderInterceptor(IdentityManager identityManager2) {
        this.identityManager = identityManager2;
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13332a f = chain.request().mo38388f();
        String storedAccessTokenAsBearerToken = this.identityManager.getStoredAccessTokenAsBearerToken();
        if (storedAccessTokenAsBearerToken != null) {
            f.mo38394a("Authorization", storedAccessTokenAsBearerToken);
        }
        return chain.proceed(f.mo38400a());
    }
}

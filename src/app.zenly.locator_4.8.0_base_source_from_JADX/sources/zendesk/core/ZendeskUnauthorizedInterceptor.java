package zendesk.core;

import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class ZendeskUnauthorizedInterceptor implements Interceptor {
    private final SessionStorage sessionStorage;

    ZendeskUnauthorizedInterceptor(SessionStorage sessionStorage2) {
        this.sessionStorage = sessionStorage2;
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13167a0 proceed = chain.proceed(chain.request());
        if (!proceed.mo37796g() && 401 == proceed.mo37793d()) {
            onHttpUnauthorized();
        }
        return proceed;
    }

    /* access modifiers changed from: 0000 */
    public void onHttpUnauthorized() {
        this.sessionStorage.clear();
    }
}

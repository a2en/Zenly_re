package zendesk.core;

import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13331y.C13332a;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class AcceptHeaderInterceptor implements Interceptor {
    AcceptHeaderInterceptor() {
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13332a f = chain.request().mo38388f();
        f.mo38394a("Accept", "application/json");
        return chain.proceed(f.mo38400a());
    }
}

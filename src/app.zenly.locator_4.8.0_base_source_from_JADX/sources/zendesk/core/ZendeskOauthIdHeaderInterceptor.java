package zendesk.core;

import com.zendesk.util.C12017g;
import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13331y.C13332a;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class ZendeskOauthIdHeaderInterceptor implements Interceptor {
    private final String oauthId;

    public ZendeskOauthIdHeaderInterceptor(String str) {
        this.oauthId = str;
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13332a f = chain.request().mo38388f();
        if (C12017g.m31658b(this.oauthId)) {
            f.mo38394a("Client-Identifier", this.oauthId);
        }
        return chain.proceed(f.mo38400a());
    }
}

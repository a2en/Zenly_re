package zendesk.support;

import com.zendesk.util.C12017g;
import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class HelpCenterCachingInterceptor implements Interceptor {
    HelpCenterCachingInterceptor() {
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13167a0 proceed = chain.proceed(chain.request());
        String str = "X-ZD-Cache-Control";
        if (!C12017g.m31658b(proceed.mo37795f().mo38261a(str))) {
            return proceed;
        }
        C13168a j = proceed.mo37799j();
        j.mo37819b("Cache-Control", proceed.mo37787a(str));
        return j.mo37816a();
    }
}

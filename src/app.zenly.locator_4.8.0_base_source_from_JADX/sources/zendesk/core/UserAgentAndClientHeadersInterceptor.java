package zendesk.core;

import android.os.Build.VERSION;
import java.io.IOException;
import java.util.Locale;
import okhttp3.C13167a0;
import okhttp3.C13331y.C13332a;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

class UserAgentAndClientHeadersInterceptor implements Interceptor {
    private final String userAgent;
    private final String version;
    private final String xZendeskClient;

    public UserAgentAndClientHeadersInterceptor(String str, String str2) {
        this.userAgent = String.format(Locale.US, "Zendesk-SDK/%s Android/%d Variant/%s", new Object[]{str, Integer.valueOf(VERSION.SDK_INT), str2});
        this.xZendeskClient = String.format(Locale.US, "mobile/android/sdk/%s", new Object[]{str2.toLowerCase()});
        this.version = str;
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13332a f = chain.request().mo38388f();
        String str = "User-Agent";
        f.mo38393a(str);
        f.mo38394a(str, this.userAgent);
        String str2 = "X-Zendesk-Client";
        f.mo38393a(str2);
        f.mo38394a(str2, this.xZendeskClient);
        String str3 = "X-Zendesk-Client-Version";
        f.mo38393a(str3);
        f.mo38394a(str3, this.version);
        return chain.proceed(f.mo38400a());
    }
}

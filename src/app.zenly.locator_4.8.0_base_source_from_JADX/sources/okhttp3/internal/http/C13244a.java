package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13170b0;
import okhttp3.C13311m;
import okhttp3.C13317r.C13318a;
import okhttp3.C13321t;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.C13333z;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.p418f0.C13184e;
import okhttp3.p418f0.C13185f;
import okio.C13352j;
import okio.C13354l;
import okio.Source;

/* renamed from: okhttp3.internal.http.a */
public final class C13244a implements Interceptor {

    /* renamed from: a */
    private final CookieJar f34121a;

    public C13244a(CookieJar cookieJar) {
        this.f34121a = cookieJar;
    }

    /* renamed from: a */
    private String m34780a(List<C13311m> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C13311m mVar = (C13311m) list.get(i);
            sb.append(mVar.mo38237a());
            sb.append('=');
            sb.append(mVar.mo38239b());
        }
        return sb.toString();
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13331y request = chain.request();
        C13332a f = request.mo38388f();
        C13333z a = request.mo38382a();
        String str = "Content-Type";
        String str2 = "Content-Length";
        if (a != null) {
            C13321t b = a.mo32978b();
            if (b != null) {
                f.mo38403b(str, b.toString());
            }
            long a2 = a.mo32976a();
            String str3 = "Transfer-Encoding";
            if (a2 != -1) {
                f.mo38403b(str2, Long.toString(a2));
                f.mo38393a(str3);
            } else {
                f.mo38403b(str3, "chunked");
                f.mo38393a(str2);
            }
        }
        String str4 = "Host";
        boolean z = false;
        if (request.mo38381a(str4) == null) {
            f.mo38403b(str4, C13184e.m34491a(request.mo38389g(), false));
        }
        String str5 = "Connection";
        if (request.mo38381a(str5) == null) {
            f.mo38403b(str5, "Keep-Alive");
        }
        String str6 = "Accept-Encoding";
        String str7 = "gzip";
        if (request.mo38381a(str6) == null && request.mo38381a("Range") == null) {
            z = true;
            f.mo38403b(str6, str7);
        }
        List loadForRequest = this.f34121a.loadForRequest(request.mo38389g());
        if (!loadForRequest.isEmpty()) {
            f.mo38403b("Cookie", m34780a(loadForRequest));
        }
        String str8 = "User-Agent";
        if (request.mo38381a(str8) == null) {
            f.mo38403b(str8, C13185f.m34521a());
        }
        C13167a0 proceed = chain.proceed(f.mo38400a());
        C13248d.m34789a(this.f34121a, request.mo38389g(), proceed.mo37795f());
        C13168a j = proceed.mo37799j();
        j.mo37815a(request);
        if (z) {
            String str9 = "Content-Encoding";
            if (str7.equalsIgnoreCase(proceed.mo37787a(str9)) && C13248d.m34792b(proceed)) {
                C13352j jVar = new C13352j(proceed.mo37789a().mo37829f());
                C13318a b2 = proceed.mo37795f().mo38265b();
                b2.mo38275c(str9);
                b2.mo38275c(str2);
                j.mo37813a(b2.mo38272a());
                j.mo37811a((C13170b0) new C13251g(proceed.mo37787a(str), -1, C13354l.m35375a((Source) jVar)));
            }
        }
        return j.mo37816a();
    }
}

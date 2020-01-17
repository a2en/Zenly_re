package p389io.fabric.sdk.android.services.common;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.services.network.C12241c;
import p389io.fabric.sdk.android.services.network.HttpRequest;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;

/* renamed from: io.fabric.sdk.android.services.common.a */
public abstract class C12169a {

    /* renamed from: f */
    private static final Pattern f31643f = Pattern.compile("http(s?)://[^\\/]+", 2);

    /* renamed from: a */
    private final String f31644a;

    /* renamed from: b */
    private final HttpRequestFactory f31645b;

    /* renamed from: c */
    private final C12241c f31646c;

    /* renamed from: d */
    private final String f31647d;

    /* renamed from: e */
    protected final C12161g f31648e;

    public C12169a(C12161g gVar, String str, String str2, HttpRequestFactory httpRequestFactory, C12241c cVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (httpRequestFactory != null) {
            this.f31648e = gVar;
            this.f31647d = str;
            this.f31644a = m32208a(str2);
            this.f31645b = httpRequestFactory;
            this.f31646c = cVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpRequest mo36044a() {
        return mo36045a(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo36046b() {
        return this.f31644a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpRequest mo36045a(Map<String, String> map) {
        HttpRequest buildHttpRequest = this.f31645b.buildHttpRequest(this.f31646c, mo36046b(), map);
        buildHttpRequest.mo36196a(false);
        buildHttpRequest.mo36185a(10000);
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Android SDK/");
        sb.append(this.f31648e.mo24945h());
        buildHttpRequest.mo36203c("User-Agent", sb.toString());
        buildHttpRequest.mo36203c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
        return buildHttpRequest;
    }

    /* renamed from: a */
    private String m32208a(String str) {
        return !C12180h.m32264b(this.f31647d) ? f31643f.matcher(str).replaceFirst(this.f31647d) : str;
    }
}

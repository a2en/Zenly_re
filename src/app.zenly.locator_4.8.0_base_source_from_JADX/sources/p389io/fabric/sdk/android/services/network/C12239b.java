package p389io.fabric.sdk.android.services.network;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p389io.fabric.sdk.android.C12153b;
import p389io.fabric.sdk.android.Logger;

/* renamed from: io.fabric.sdk.android.services.network.b */
public class C12239b implements HttpRequestFactory {

    /* renamed from: a */
    private final Logger f31817a;

    /* renamed from: b */
    private PinningInfoProvider f31818b;

    /* renamed from: c */
    private SSLSocketFactory f31819c;

    /* renamed from: d */
    private boolean f31820d;

    /* renamed from: io.fabric.sdk.android.services.network.b$a */
    static /* synthetic */ class C12240a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31821a = new int[C12241c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.fabric.sdk.android.services.network.c[] r0 = p389io.fabric.sdk.android.services.network.C12241c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31821a = r0
                int[] r0 = f31821a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.fabric.sdk.android.services.network.c r1 = p389io.fabric.sdk.android.services.network.C12241c.GET     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f31821a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.fabric.sdk.android.services.network.c r1 = p389io.fabric.sdk.android.services.network.C12241c.POST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f31821a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.fabric.sdk.android.services.network.c r1 = p389io.fabric.sdk.android.services.network.C12241c.PUT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f31821a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.fabric.sdk.android.services.network.c r1 = p389io.fabric.sdk.android.services.network.C12241c.DELETE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.fabric.sdk.android.services.network.C12239b.C12240a.<clinit>():void");
        }
    }

    public C12239b() {
        this(new C12153b());
    }

    /* renamed from: a */
    private boolean m32447a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }

    /* renamed from: b */
    private synchronized SSLSocketFactory m32448b() {
        SSLSocketFactory a;
        this.f31820d = true;
        try {
            a = C12242d.m32450a(this.f31818b);
            this.f31817a.mo35954d("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.f31817a.mo35957e("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a;
    }

    /* renamed from: c */
    private synchronized void m32449c() {
        this.f31820d = false;
        this.f31819c = null;
    }

    public HttpRequest buildHttpRequest(C12241c cVar, String str) {
        return buildHttpRequest(cVar, str, Collections.emptyMap());
    }

    public PinningInfoProvider getPinningInfoProvider() {
        return this.f31818b;
    }

    public void setPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        if (this.f31818b != pinningInfoProvider) {
            this.f31818b = pinningInfoProvider;
            m32449c();
        }
    }

    public C12239b(Logger logger) {
        this.f31817a = logger;
    }

    /* renamed from: a */
    private synchronized SSLSocketFactory m32446a() {
        if (this.f31819c == null && !this.f31820d) {
            this.f31819c = m32448b();
        }
        return this.f31819c;
    }

    public HttpRequest buildHttpRequest(C12241c cVar, String str, Map<String, String> map) {
        HttpRequest httpRequest;
        int i = C12240a.f31821a[cVar.ordinal()];
        if (i == 1) {
            httpRequest = HttpRequest.m32386a((CharSequence) str, map, true);
        } else if (i == 2) {
            httpRequest = HttpRequest.m32390b((CharSequence) str, map, true);
        } else if (i == 3) {
            httpRequest = HttpRequest.m32396f((CharSequence) str);
        } else if (i == 4) {
            httpRequest = HttpRequest.m32389b((CharSequence) str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (m32447a(str) && this.f31818b != null) {
            SSLSocketFactory a = m32446a();
            if (a != null) {
                ((HttpsURLConnection) httpRequest.mo36216j()).setSSLSocketFactory(a);
            }
        }
        return httpRequest;
    }
}

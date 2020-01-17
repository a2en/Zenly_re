package com.mapbox.android.telemetry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C13307l;
import okhttp3.C13319s;
import okhttp3.C13319s.C13320a;
import okhttp3.C13325v;
import okhttp3.C13325v.C13327b;
import okhttp3.Interceptor;

/* renamed from: com.mapbox.android.telemetry.z0 */
class C11413z0 {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Map<C11388r, String> f29518h = new C11414a();

    /* renamed from: a */
    private C11388r f29519a;

    /* renamed from: b */
    private final C13325v f29520b;

    /* renamed from: c */
    private final C13319s f29521c;

    /* renamed from: d */
    private final SSLSocketFactory f29522d;

    /* renamed from: e */
    private final X509TrustManager f29523e;

    /* renamed from: f */
    private final HostnameVerifier f29524f;

    /* renamed from: g */
    private boolean f29525g;

    /* renamed from: com.mapbox.android.telemetry.z0$a */
    static class C11414a extends HashMap<C11388r, String> {
        C11414a() {
            put(C11388r.STAGING, "api-events-staging.tilestream.net");
            put(C11388r.COM, "events.mapbox.com");
            put(C11388r.CHINA, "events.mapbox.cn");
        }
    }

    /* renamed from: com.mapbox.android.telemetry.z0$b */
    static final class C11415b {

        /* renamed from: a */
        C11388r f29526a = C11388r.COM;

        /* renamed from: b */
        C13325v f29527b = new C13325v();

        /* renamed from: c */
        C13319s f29528c = null;

        /* renamed from: d */
        SSLSocketFactory f29529d = null;

        /* renamed from: e */
        X509TrustManager f29530e = null;

        /* renamed from: f */
        HostnameVerifier f29531f = null;

        /* renamed from: g */
        boolean f29532g = false;

        C11415b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11415b mo33067a(C11388r rVar) {
            this.f29526a = rVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11415b mo33072a(C13325v vVar) {
            if (vVar != null) {
                this.f29527b = vVar;
            }
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11415b mo33071a(C13319s sVar) {
            if (sVar != null) {
                this.f29528c = sVar;
            }
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11415b mo33069a(SSLSocketFactory sSLSocketFactory) {
            this.f29529d = sSLSocketFactory;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11415b mo33070a(X509TrustManager x509TrustManager) {
            this.f29530e = x509TrustManager;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11415b mo33068a(HostnameVerifier hostnameVerifier) {
            this.f29531f = hostnameVerifier;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11415b mo33073a(boolean z) {
            this.f29532g = z;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11413z0 mo33074a() {
            if (this.f29528c == null) {
                this.f29528c = C11413z0.m29373a((String) C11413z0.f29518h.get(this.f29526a));
            }
            return new C11413z0(this);
        }
    }

    C11413z0(C11415b bVar) {
        this.f29519a = bVar.f29526a;
        this.f29520b = bVar.f29527b;
        this.f29521c = bVar.f29528c;
        this.f29522d = bVar.f29529d;
        this.f29523e = bVar.f29530e;
        this.f29524f = bVar.f29531f;
        this.f29525g = bVar.f29532g;
    }

    /* renamed from: a */
    private boolean m29375a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        return (sSLSocketFactory == null || x509TrustManager == null) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13325v mo33062a(C11341g gVar) {
        return m29374a(gVar, (Interceptor) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11388r mo33063b() {
        return this.f29519a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo33065c() {
        return this.f29525g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C11415b mo33066d() {
        C11415b bVar = new C11415b();
        bVar.mo33067a(this.f29519a);
        bVar.mo33072a(this.f29520b);
        bVar.mo33071a(this.f29521c);
        bVar.mo33069a(this.f29522d);
        bVar.mo33070a(this.f29523e);
        bVar.mo33068a(this.f29524f);
        bVar.mo33073a(this.f29525g);
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13319s mo33061a() {
        return this.f29521c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C13325v mo33064b(C11341g gVar) {
        return m29374a(gVar, (Interceptor) new C11333c0());
    }

    /* renamed from: a */
    static C13319s m29373a(String str) {
        C13320a aVar = new C13320a();
        aVar.mo38311e("https");
        aVar.mo38309c(str);
        return aVar.mo38304a();
    }

    /* renamed from: a */
    private C13325v m29374a(C11341g gVar, Interceptor interceptor) {
        C11348h hVar = new C11348h();
        C13327b r = this.f29520b.mo38347r();
        r.mo38366a(true);
        r.mo38364a(hVar.mo32990a(this.f29519a, gVar));
        r.mo38357a(Arrays.asList(new C13307l[]{C13307l.f34410g, C13307l.f34411h}));
        if (interceptor != null) {
            r.mo38362a(interceptor);
        }
        if (m29375a(this.f29522d, this.f29523e)) {
            r.mo38360a(this.f29522d, this.f29523e);
            r.mo38358a(this.f29524f);
        }
        return r.mo38367a();
    }
}

package com.mapbox.android.telemetry;

import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13321t;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.C13333z;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okio.BufferedSink;
import okio.C13351i;
import okio.C13354l;
import okio.Sink;

/* renamed from: com.mapbox.android.telemetry.c0 */
final class C11333c0 implements Interceptor {

    /* renamed from: com.mapbox.android.telemetry.c0$a */
    class C11334a extends C13333z {

        /* renamed from: a */
        final /* synthetic */ C13333z f29419a;

        C11334a(C11333c0 c0Var, C13333z zVar) {
            this.f29419a = zVar;
        }

        /* renamed from: a */
        public long mo32976a() {
            return -1;
        }

        /* renamed from: a */
        public void mo32977a(BufferedSink bufferedSink) throws IOException {
            BufferedSink a = C13354l.m35374a((Sink) new C13351i(bufferedSink));
            this.f29419a.mo32977a(a);
            a.close();
        }

        /* renamed from: b */
        public C13321t mo32978b() {
            return this.f29419a.mo32978b();
        }
    }

    C11333c0() {
    }

    /* renamed from: a */
    private C13333z m29183a(C13333z zVar) {
        return new C11334a(this, zVar);
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        C13331y request = chain.request();
        if (request.mo38382a() != null) {
            String str = "Content-Encoding";
            if (request.mo38381a(str) == null) {
                C13332a f = request.mo38388f();
                f.mo38403b(str, "gzip");
                f.mo38395a(request.mo38387e(), m29183a(request.mo38382a()));
                return chain.proceed(f.mo38400a());
            }
        }
        return chain.proceed(request);
    }
}

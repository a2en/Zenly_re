package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13170b0;
import okhttp3.C13317r;
import okhttp3.C13317r.C13318a;
import okhttp3.C13328w;
import okhttp3.C13331y;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.cache.C13218b.C13219a;
import okhttp3.internal.http.C13248d;
import okhttp3.internal.http.C13249e;
import okhttp3.internal.http.C13251g;
import okhttp3.p418f0.C13182c;
import okhttp3.p418f0.C13184e;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13354l;
import okio.C13368t;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.cache.a */
public final class C13216a implements Interceptor {

    /* renamed from: a */
    final InternalCache f33977a;

    /* renamed from: okhttp3.internal.cache.a$a */
    class C13217a implements Source {

        /* renamed from: e */
        boolean f33978e;

        /* renamed from: f */
        final /* synthetic */ BufferedSource f33979f;

        /* renamed from: g */
        final /* synthetic */ CacheRequest f33980g;

        /* renamed from: h */
        final /* synthetic */ BufferedSink f33981h;

        C13217a(C13216a aVar, BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
            this.f33979f = bufferedSource;
            this.f33980g = cacheRequest;
            this.f33981h = bufferedSink;
        }

        public void close() throws IOException {
            if (!this.f33978e && !C13184e.m34509a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                this.f33978e = true;
                this.f33980g.abort();
            }
            this.f33979f.close();
        }

        public long read(C13342c cVar, long j) throws IOException {
            try {
                long read = this.f33979f.read(cVar, j);
                if (read == -1) {
                    if (!this.f33978e) {
                        this.f33978e = true;
                        this.f33981h.close();
                    }
                    return -1;
                }
                cVar.mo38486a(this.f33981h.buffer(), cVar.mo38488b() - read, read);
                this.f33981h.emitCompleteSegments();
                return read;
            } catch (IOException e) {
                if (!this.f33978e) {
                    this.f33978e = true;
                    this.f33980g.abort();
                }
                throw e;
            }
        }

        public C13368t timeout() {
            return this.f33979f.timeout();
        }
    }

    public C13216a(InternalCache internalCache) {
        this.f33977a = internalCache;
    }

    /* renamed from: a */
    private static C13167a0 m34642a(C13167a0 a0Var) {
        if (a0Var == null || a0Var.mo37789a() == null) {
            return a0Var;
        }
        C13168a j = a0Var.mo37799j();
        j.mo37811a((C13170b0) null);
        return j.mo37816a();
    }

    /* renamed from: b */
    static boolean m34646b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        InternalCache internalCache = this.f33977a;
        C13167a0 a0Var = internalCache != null ? internalCache.get(chain.request()) : null;
        C13218b a = new C13219a(System.currentTimeMillis(), chain.request(), a0Var).mo37968a();
        C13331y yVar = a.f33982a;
        C13167a0 a0Var2 = a.f33983b;
        InternalCache internalCache2 = this.f33977a;
        if (internalCache2 != null) {
            internalCache2.trackResponse(a);
        }
        if (a0Var != null && a0Var2 == null) {
            C13184e.m34503a((Closeable) a0Var.mo37789a());
        }
        if (yVar == null && a0Var2 == null) {
            C13168a aVar = new C13168a();
            aVar.mo37815a(chain.request());
            aVar.mo37814a(C13328w.HTTP_1_1);
            aVar.mo37806a(504);
            aVar.mo37808a("Unsatisfiable Request (only-if-cached)");
            aVar.mo37811a(C13184e.f33858d);
            aVar.mo37818b(-1);
            aVar.mo37807a(System.currentTimeMillis());
            return aVar.mo37816a();
        } else if (yVar == null) {
            C13168a j = a0Var2.mo37799j();
            j.mo37810a(m34642a(a0Var2));
            return j.mo37816a();
        } else {
            try {
                C13167a0 proceed = chain.proceed(yVar);
                if (proceed == null && a0Var != null) {
                }
                if (a0Var2 != null) {
                    if (proceed.mo37793d() == 304) {
                        C13168a j2 = a0Var2.mo37799j();
                        j2.mo37813a(m34644a(a0Var2.mo37795f(), proceed.mo37795f()));
                        j2.mo37818b(proceed.mo37804o());
                        j2.mo37807a(proceed.mo37802m());
                        j2.mo37810a(m34642a(a0Var2));
                        j2.mo37820b(m34642a(proceed));
                        C13167a0 a2 = j2.mo37816a();
                        proceed.mo37789a().close();
                        this.f33977a.trackConditionalCacheHit();
                        this.f33977a.update(a0Var2, a2);
                        return a2;
                    }
                    C13184e.m34503a((Closeable) a0Var2.mo37789a());
                }
                C13168a j3 = proceed.mo37799j();
                j3.mo37810a(m34642a(a0Var2));
                j3.mo37820b(m34642a(proceed));
                C13167a0 a3 = j3.mo37816a();
                if (this.f33977a != null) {
                    if (C13248d.m34792b(a3) && C13218b.m34647a(a3, yVar)) {
                        return m34643a(this.f33977a.put(a3), a3);
                    }
                    if (C13249e.m34798a(yVar.mo38387e())) {
                        try {
                            this.f33977a.remove(yVar);
                        } catch (IOException unused) {
                        }
                    }
                }
                return a3;
            } finally {
                if (a0Var != null) {
                    C13184e.m34503a((Closeable) a0Var.mo37789a());
                }
            }
        }
    }

    /* renamed from: a */
    private C13167a0 m34643a(CacheRequest cacheRequest, C13167a0 a0Var) throws IOException {
        if (cacheRequest == null) {
            return a0Var;
        }
        Sink body = cacheRequest.body();
        if (body == null) {
            return a0Var;
        }
        C13217a aVar = new C13217a(this, a0Var.mo37789a().mo37829f(), cacheRequest, C13354l.m35374a(body));
        String a = a0Var.mo37787a("Content-Type");
        long d = a0Var.mo37789a().mo37827d();
        C13168a j = a0Var.mo37799j();
        j.mo37811a((C13170b0) new C13251g(a, d, C13354l.m35375a((Source) aVar)));
        return j.mo37816a();
    }

    /* renamed from: a */
    private static C13317r m34644a(C13317r rVar, C13317r rVar2) {
        C13318a aVar = new C13318a();
        int c = rVar.mo38266c();
        for (int i = 0; i < c; i++) {
            String a = rVar.mo38260a(i);
            String b = rVar.mo38263b(i);
            if ((!"Warning".equalsIgnoreCase(a) || !b.startsWith("1")) && (m34645a(a) || !m34646b(a) || rVar2.mo38261a(a) == null)) {
                C13182c.f33853a.mo37871a(aVar, a, b);
            }
        }
        int c2 = rVar2.mo38266c();
        for (int i2 = 0; i2 < c2; i2++) {
            String a2 = rVar2.mo38260a(i2);
            if (!m34645a(a2) && m34646b(a2)) {
                C13182c.f33853a.mo37871a(aVar, a2, rVar2.mo38263b(i2));
            }
        }
        return aVar.mo38272a();
    }

    /* renamed from: a */
    static boolean m34645a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}

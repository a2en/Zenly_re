package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.C13167a0;
import okhttp3.C13331y;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.connection.C13231d;
import okhttp3.internal.connection.C13241j;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.internal.http.f */
public final class C13250f implements Chain {

    /* renamed from: a */
    private final List<Interceptor> f34126a;

    /* renamed from: b */
    private final C13241j f34127b;

    /* renamed from: c */
    private final C13231d f34128c;

    /* renamed from: d */
    private final int f34129d;

    /* renamed from: e */
    private final C13331y f34130e;

    /* renamed from: f */
    private final Call f34131f;

    /* renamed from: g */
    private final int f34132g;

    /* renamed from: h */
    private final int f34133h;

    /* renamed from: i */
    private final int f34134i;

    /* renamed from: j */
    private int f34135j;

    public C13250f(List<Interceptor> list, C13241j jVar, C13231d dVar, int i, C13331y yVar, Call call, int i2, int i3, int i4) {
        this.f34126a = list;
        this.f34127b = jVar;
        this.f34128c = dVar;
        this.f34129d = i;
        this.f34130e = yVar;
        this.f34131f = call;
        this.f34132g = i2;
        this.f34133h = i3;
        this.f34134i = i4;
    }

    /* renamed from: a */
    public C13231d mo38072a() {
        C13231d dVar = this.f34128c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public C13241j mo38073b() {
        return this.f34127b;
    }

    public Call call() {
        return this.f34131f;
    }

    public int connectTimeoutMillis() {
        return this.f34132g;
    }

    public Connection connection() {
        C13231d dVar = this.f34128c;
        if (dVar != null) {
            return dVar.mo38009b();
        }
        return null;
    }

    public C13167a0 proceed(C13331y yVar) throws IOException {
        return mo38071a(yVar, this.f34127b, this.f34128c);
    }

    public int readTimeoutMillis() {
        return this.f34133h;
    }

    public C13331y request() {
        return this.f34130e;
    }

    public Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        C13250f fVar = new C13250f(this.f34126a, this.f34127b, this.f34128c, this.f34129d, this.f34130e, this.f34131f, C13184e.m34486a("timeout", (long) i, timeUnit), this.f34133h, this.f34134i);
        return fVar;
    }

    public Chain withReadTimeout(int i, TimeUnit timeUnit) {
        C13250f fVar = new C13250f(this.f34126a, this.f34127b, this.f34128c, this.f34129d, this.f34130e, this.f34131f, this.f34132g, C13184e.m34486a("timeout", (long) i, timeUnit), this.f34134i);
        return fVar;
    }

    public Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        C13250f fVar = new C13250f(this.f34126a, this.f34127b, this.f34128c, this.f34129d, this.f34130e, this.f34131f, this.f34132g, this.f34133h, C13184e.m34486a("timeout", (long) i, timeUnit));
        return fVar;
    }

    public int writeTimeoutMillis() {
        return this.f34134i;
    }

    /* renamed from: a */
    public C13167a0 mo38071a(C13331y yVar, C13241j jVar, C13231d dVar) throws IOException {
        if (this.f34129d < this.f34126a.size()) {
            this.f34135j++;
            C13231d dVar2 = this.f34128c;
            String str = "network interceptor ";
            if (dVar2 == null || dVar2.mo38009b().mo38034a(yVar.mo38389g())) {
                String str2 = " must call proceed() exactly once";
                if (this.f34128c == null || this.f34135j <= 1) {
                    C13250f fVar = new C13250f(this.f34126a, jVar, dVar, this.f34129d + 1, yVar, this.f34131f, this.f34132g, this.f34133h, this.f34134i);
                    Interceptor interceptor = (Interceptor) this.f34126a.get(this.f34129d);
                    C13167a0 intercept = interceptor.intercept(fVar);
                    if (dVar == null || this.f34129d + 1 >= this.f34126a.size() || fVar.f34135j == 1) {
                        String str3 = "interceptor ";
                        if (intercept == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append(interceptor);
                            sb.append(" returned null");
                            throw new NullPointerException(sb.toString());
                        } else if (intercept.mo37789a() != null) {
                            return intercept;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            sb2.append(interceptor);
                            sb2.append(" returned a response with no body");
                            throw new IllegalStateException(sb2.toString());
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(interceptor);
                        sb3.append(str2);
                        throw new IllegalStateException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(this.f34126a.get(this.f34129d - 1));
                    sb4.append(str2);
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.f34126a.get(this.f34129d - 1));
                sb5.append(" must retain the same host and port");
                throw new IllegalStateException(sb5.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}

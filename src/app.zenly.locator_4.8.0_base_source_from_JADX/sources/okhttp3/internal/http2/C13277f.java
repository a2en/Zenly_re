package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13317r;
import okhttp3.C13317r.C13318a;
import okhttp3.C13325v;
import okhttp3.C13328w;
import okhttp3.C13331y;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.connection.C13235f;
import okhttp3.internal.http.C13248d;
import okhttp3.internal.http.C13252h;
import okhttp3.internal.http.C13254j;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.p418f0.C13182c;
import okhttp3.p418f0.C13184e;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.http2.f */
public final class C13277f implements ExchangeCodec {

    /* renamed from: g */
    private static final List<String> f34252g = C13184e.m34498a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: h */
    private static final List<String> f34253h = C13184e.m34498a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a */
    private final Chain f34254a;

    /* renamed from: b */
    private final C13235f f34255b;

    /* renamed from: c */
    private final C13262e f34256c;

    /* renamed from: d */
    private volatile C13281h f34257d;

    /* renamed from: e */
    private final C13328w f34258e;

    /* renamed from: f */
    private volatile boolean f34259f;

    public C13277f(C13325v vVar, C13235f fVar, Chain chain, C13262e eVar) {
        C13328w wVar;
        this.f34255b = fVar;
        this.f34254a = chain;
        this.f34256c = eVar;
        if (vVar.mo38349t().contains(C13328w.H2_PRIOR_KNOWLEDGE)) {
            wVar = C13328w.H2_PRIOR_KNOWLEDGE;
        } else {
            wVar = C13328w.HTTP_2;
        }
        this.f34258e = wVar;
    }

    /* renamed from: a */
    public static List<C13257b> m34907a(C13331y yVar) {
        C13317r c = yVar.mo38385c();
        ArrayList arrayList = new ArrayList(c.mo38266c() + 4);
        arrayList.add(new C13257b(C13257b.f34160f, yVar.mo38387e()));
        arrayList.add(new C13257b(C13257b.f34161g, C13252h.m34809a(yVar.mo38389g())));
        String a = yVar.mo38381a("Host");
        if (a != null) {
            arrayList.add(new C13257b(C13257b.f34163i, a));
        }
        arrayList.add(new C13257b(C13257b.f34162h, yVar.mo38389g().mo38297o()));
        int c2 = c.mo38266c();
        for (int i = 0; i < c2; i++) {
            String lowerCase = c.mo38260a(i).toLowerCase(Locale.US);
            if (!f34252g.contains(lowerCase) || (lowerCase.equals("te") && c.mo38263b(i).equals("trailers"))) {
                arrayList.add(new C13257b(lowerCase, c.mo38263b(i)));
            }
        }
        return arrayList;
    }

    public void cancel() {
        this.f34259f = true;
        if (this.f34257d != null) {
            this.f34257d.mo38132a(C13256a.CANCEL);
        }
    }

    public C13235f connection() {
        return this.f34255b;
    }

    public Sink createRequestBody(C13331y yVar, long j) {
        return this.f34257d.mo38139d();
    }

    public void finishRequest() throws IOException {
        this.f34257d.mo38139d().close();
    }

    public void flushRequest() throws IOException {
        this.f34256c.flush();
    }

    public Source openResponseBodySource(C13167a0 a0Var) {
        return this.f34257d.mo38140e();
    }

    public C13168a readResponseHeaders(boolean z) throws IOException {
        C13168a a = m34908a(this.f34257d.mo38144i(), this.f34258e);
        if (!z || C13182c.f33853a.mo37864a(a) != 100) {
            return a;
        }
        return null;
    }

    public long reportedContentLength(C13167a0 a0Var) {
        return C13248d.m34786a(a0Var);
    }

    public C13317r trailers() throws IOException {
        return this.f34257d.mo38145j();
    }

    public void writeRequestHeaders(C13331y yVar) throws IOException {
        if (this.f34257d == null) {
            this.f34257d = this.f34256c.mo38091a(m34907a(yVar), yVar.mo38382a() != null);
            if (!this.f34259f) {
                this.f34257d.mo38143h().mo38542a((long) this.f34254a.readTimeoutMillis(), TimeUnit.MILLISECONDS);
                this.f34257d.mo38147l().mo38542a((long) this.f34254a.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
                return;
            }
            this.f34257d.mo38132a(C13256a.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* renamed from: a */
    public static C13168a m34908a(C13317r rVar, C13328w wVar) throws IOException {
        C13318a aVar = new C13318a();
        int c = rVar.mo38266c();
        C13254j jVar = null;
        for (int i = 0; i < c; i++) {
            String a = rVar.mo38260a(i);
            String b = rVar.mo38263b(i);
            if (a.equals(":status")) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP/1.1 ");
                sb.append(b);
                jVar = C13254j.m34817a(sb.toString());
            } else if (!f34253h.contains(a)) {
                C13182c.f33853a.mo37871a(aVar, a, b);
            }
        }
        if (jVar != null) {
            C13168a aVar2 = new C13168a();
            aVar2.mo37814a(wVar);
            aVar2.mo37806a(jVar.f34141b);
            aVar2.mo37808a(jVar.f34142c);
            aVar2.mo37813a(aVar.mo38272a());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }
}

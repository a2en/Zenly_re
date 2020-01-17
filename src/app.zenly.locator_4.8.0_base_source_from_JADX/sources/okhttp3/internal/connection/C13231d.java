package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13170b0;
import okhttp3.C13331y;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.http.C13251g;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.p423ws.C13295b.C13301f;
import okhttp3.p418f0.C13182c;
import okio.C13342c;
import okio.C13348f;
import okio.C13349g;
import okio.C13354l;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.connection.d */
public final class C13231d {

    /* renamed from: a */
    final C13241j f34044a;

    /* renamed from: b */
    final Call f34045b;

    /* renamed from: c */
    final EventListener f34046c;

    /* renamed from: d */
    final C13234e f34047d;

    /* renamed from: e */
    final ExchangeCodec f34048e;

    /* renamed from: f */
    private boolean f34049f;

    /* renamed from: okhttp3.internal.connection.d$a */
    private final class C13232a extends C13348f {

        /* renamed from: f */
        private boolean f34050f;

        /* renamed from: g */
        private long f34051g;

        /* renamed from: h */
        private long f34052h;

        /* renamed from: i */
        private boolean f34053i;

        C13232a(Sink sink, long j) {
            super(sink);
            this.f34051g = j;
        }

        /* renamed from: a */
        private IOException m34711a(IOException iOException) {
            if (this.f34050f) {
                return iOException;
            }
            this.f34050f = true;
            return C13231d.this.mo38002a(this.f34052h, false, true, iOException);
        }

        public void close() throws IOException {
            if (!this.f34053i) {
                this.f34053i = true;
                long j = this.f34051g;
                if (j == -1 || this.f34052h == j) {
                    try {
                        super.close();
                        m34711a(null);
                    } catch (IOException e) {
                        throw m34711a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m34711a(e);
            }
        }

        public void write(C13342c cVar, long j) throws IOException {
            if (!this.f34053i) {
                long j2 = this.f34051g;
                if (j2 == -1 || this.f34052h + j <= j2) {
                    try {
                        super.write(cVar, j);
                        this.f34052h += j;
                    } catch (IOException e) {
                        throw m34711a(e);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected ");
                    sb.append(this.f34051g);
                    sb.append(" bytes but received ");
                    sb.append(this.f34052h + j);
                    throw new ProtocolException(sb.toString());
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: okhttp3.internal.connection.d$b */
    final class C13233b extends C13349g {

        /* renamed from: f */
        private final long f34055f;

        /* renamed from: g */
        private long f34056g;

        /* renamed from: h */
        private boolean f34057h;

        /* renamed from: i */
        private boolean f34058i;

        C13233b(Source source, long j) {
            super(source);
            this.f34055f = j;
            if (j == 0) {
                mo38020a(null);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public IOException mo38020a(IOException iOException) {
            if (this.f34057h) {
                return iOException;
            }
            this.f34057h = true;
            return C13231d.this.mo38002a(this.f34056g, true, false, iOException);
        }

        public void close() throws IOException {
            if (!this.f34058i) {
                this.f34058i = true;
                try {
                    super.close();
                    mo38020a(null);
                } catch (IOException e) {
                    throw mo38020a(e);
                }
            }
        }

        public long read(C13342c cVar, long j) throws IOException {
            if (!this.f34058i) {
                try {
                    long read = mo38537a().read(cVar, j);
                    if (read == -1) {
                        mo38020a(null);
                        return -1;
                    }
                    long j2 = this.f34056g + read;
                    if (this.f34055f != -1) {
                        if (j2 > this.f34055f) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected ");
                            sb.append(this.f34055f);
                            sb.append(" bytes but received ");
                            sb.append(j2);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    this.f34056g = j2;
                    if (j2 == this.f34055f) {
                        mo38020a(null);
                    }
                    return read;
                } catch (IOException e) {
                    throw mo38020a(e);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public C13231d(C13241j jVar, Call call, EventListener eventListener, C13234e eVar, ExchangeCodec exchangeCodec) {
        this.f34044a = jVar;
        this.f34045b = call;
        this.f34046c = eventListener;
        this.f34047d = eVar;
        this.f34048e = exchangeCodec;
    }

    /* renamed from: a */
    public void mo38008a(C13331y yVar) throws IOException {
        try {
            this.f34046c.mo37765d(this.f34045b);
            this.f34048e.writeRequestHeaders(yVar);
            this.f34046c.mo37758a(this.f34045b, yVar);
        } catch (IOException e) {
            this.f34046c.mo37761b(this.f34045b, e);
            mo38007a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public C13235f mo38009b() {
        return this.f34048e.connection();
    }

    /* renamed from: c */
    public void mo38011c() {
        this.f34048e.cancel();
        this.f34044a.mo38055a(this, true, true, null);
    }

    /* renamed from: d */
    public void mo38012d() throws IOException {
        try {
            this.f34048e.finishRequest();
        } catch (IOException e) {
            this.f34046c.mo37761b(this.f34045b, e);
            mo38007a(e);
            throw e;
        }
    }

    /* renamed from: e */
    public void mo38013e() throws IOException {
        try {
            this.f34048e.flushRequest();
        } catch (IOException e) {
            this.f34046c.mo37761b(this.f34045b, e);
            mo38007a(e);
            throw e;
        }
    }

    /* renamed from: f */
    public boolean mo38014f() {
        return this.f34049f;
    }

    /* renamed from: g */
    public C13301f mo38015g() throws SocketException {
        this.f34044a.mo38067i();
        return this.f34048e.connection().mo38027a(this);
    }

    /* renamed from: h */
    public void mo38016h() {
        this.f34048e.connection().mo38037c();
    }

    /* renamed from: i */
    public void mo38017i() {
        this.f34044a.mo38055a(this, true, false, null);
    }

    /* renamed from: j */
    public void mo38018j() {
        this.f34046c.mo37767f(this.f34045b);
    }

    /* renamed from: k */
    public void mo38019k() {
        mo38002a(-1, true, true, null);
    }

    /* renamed from: b */
    public void mo38010b(C13167a0 a0Var) {
        this.f34046c.mo37756a(this.f34045b, a0Var);
    }

    /* renamed from: a */
    public Sink mo38005a(C13331y yVar, boolean z) throws IOException {
        this.f34049f = z;
        long a = yVar.mo38382a().mo32976a();
        this.f34046c.mo37763c(this.f34045b);
        return new C13232a(this.f34048e.createRequestBody(yVar, a), a);
    }

    /* renamed from: a */
    public C13168a mo38003a(boolean z) throws IOException {
        try {
            C13168a readResponseHeaders = this.f34048e.readResponseHeaders(z);
            if (readResponseHeaders != null) {
                C13182c.f33853a.mo37868a(readResponseHeaders, this);
            }
            return readResponseHeaders;
        } catch (IOException e) {
            this.f34046c.mo37764c(this.f34045b, e);
            mo38007a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public C13170b0 mo38004a(C13167a0 a0Var) throws IOException {
        try {
            this.f34046c.mo37766e(this.f34045b);
            String a = a0Var.mo37787a("Content-Type");
            long reportedContentLength = this.f34048e.reportedContentLength(a0Var);
            return new C13251g(a, reportedContentLength, C13354l.m35375a((Source) new C13233b(this.f34048e.openResponseBodySource(a0Var), reportedContentLength)));
        } catch (IOException e) {
            this.f34046c.mo37764c(this.f34045b, e);
            mo38007a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public void mo38006a() {
        this.f34048e.cancel();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38007a(IOException iOException) {
        this.f34047d.mo38025d();
        this.f34048e.connection().mo38030a(iOException);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public IOException mo38002a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            mo38007a(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f34046c.mo37761b(this.f34045b, iOException);
            } else {
                this.f34046c.mo37748a(this.f34045b, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f34046c.mo37764c(this.f34045b, iOException);
            } else {
                this.f34046c.mo37760b(this.f34045b, j);
            }
        }
        return this.f34044a.mo38055a(this, z2, z, iOException);
    }
}

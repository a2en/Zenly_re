package okhttp3.p418f0.p419g;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13317r;
import okhttp3.C13317r.C13318a;
import okhttp3.C13319s;
import okhttp3.C13325v;
import okhttp3.C13331y;
import okhttp3.internal.connection.C13235f;
import okhttp3.internal.http.C13248d;
import okhttp3.internal.http.C13252h;
import okhttp3.internal.http.C13254j;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.p418f0.C13182c;
import okhttp3.p418f0.C13184e;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13350h;
import okio.C13368t;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.f0.g.a */
public final class C13186a implements ExchangeCodec {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13325v f33866a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13235f f33867b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BufferedSource f33868c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BufferedSink f33869d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f33870e = 0;

    /* renamed from: f */
    private long f33871f = 262144;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C13317r f33872g;

    /* renamed from: okhttp3.f0.g.a$b */
    private abstract class C13188b implements Source {

        /* renamed from: e */
        protected final C13350h f33873e;

        /* renamed from: f */
        protected boolean f33874f;

        private C13188b() {
            this.f33873e = new C13350h(C13186a.this.f33868c.timeout());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo37887a() {
            if (C13186a.this.f33870e != 6) {
                if (C13186a.this.f33870e == 5) {
                    C13186a.this.m34529a(this.f33873e);
                    C13186a.this.f33870e = 6;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(C13186a.this.f33870e);
                throw new IllegalStateException(sb.toString());
            }
        }

        public long read(C13342c cVar, long j) throws IOException {
            try {
                return C13186a.this.f33868c.read(cVar, j);
            } catch (IOException e) {
                C13186a.this.f33867b.mo38037c();
                mo37887a();
                throw e;
            }
        }

        public C13368t timeout() {
            return this.f33873e;
        }
    }

    /* renamed from: okhttp3.f0.g.a$c */
    private final class C13189c implements Sink {

        /* renamed from: e */
        private final C13350h f33876e = new C13350h(C13186a.this.f33869d.timeout());

        /* renamed from: f */
        private boolean f33877f;

        C13189c() {
        }

        public synchronized void close() throws IOException {
            if (!this.f33877f) {
                this.f33877f = true;
                C13186a.this.f33869d.writeUtf8("0\r\n\r\n");
                C13186a.this.m34529a(this.f33876e);
                C13186a.this.f33870e = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f33877f) {
                C13186a.this.f33869d.flush();
            }
        }

        public C13368t timeout() {
            return this.f33876e;
        }

        public void write(C13342c cVar, long j) throws IOException {
            if (this.f33877f) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C13186a.this.f33869d.writeHexadecimalUnsignedLong(j);
                String str = "\r\n";
                C13186a.this.f33869d.writeUtf8(str);
                C13186a.this.f33869d.write(cVar, j);
                C13186a.this.f33869d.writeUtf8(str);
            }
        }
    }

    /* renamed from: okhttp3.f0.g.a$d */
    private class C13190d extends C13188b {

        /* renamed from: h */
        private final C13319s f33879h;

        /* renamed from: i */
        private long f33880i = -1;

        /* renamed from: j */
        private boolean f33881j = true;

        C13190d(C13319s sVar) {
            super();
            this.f33879h = sVar;
        }

        /* renamed from: b */
        private void m34543b() throws IOException {
            if (this.f33880i != -1) {
                C13186a.this.f33868c.readUtf8LineStrict();
            }
            try {
                this.f33880i = C13186a.this.f33868c.readHexadecimalUnsignedLong();
                String trim = C13186a.this.f33868c.readUtf8LineStrict().trim();
                if (this.f33880i < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions but was \"");
                    sb.append(this.f33880i);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.f33880i == 0) {
                    this.f33881j = false;
                    C13186a aVar = C13186a.this;
                    aVar.f33872g = aVar.m34537e();
                    C13248d.m34789a(C13186a.this.f33866a.mo38337h(), this.f33879h, C13186a.this.f33872g);
                    mo37887a();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.f33874f) {
                if (this.f33881j && !C13184e.m34509a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                    C13186a.this.f33867b.mo38037c();
                    mo37887a();
                }
                this.f33874f = true;
            }
        }

        public long read(C13342c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f33874f) {
                throw new IllegalStateException("closed");
            } else if (!this.f33881j) {
                return -1;
            } else {
                long j2 = this.f33880i;
                if (j2 == 0 || j2 == -1) {
                    m34543b();
                    if (!this.f33881j) {
                        return -1;
                    }
                }
                long read = super.read(cVar, Math.min(j, this.f33880i));
                if (read != -1) {
                    this.f33880i -= read;
                    return read;
                }
                C13186a.this.f33867b.mo38037c();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo37887a();
                throw protocolException;
            }
        }
    }

    /* renamed from: okhttp3.f0.g.a$e */
    private class C13191e extends C13188b {

        /* renamed from: h */
        private long f33883h;

        C13191e(long j) {
            super();
            this.f33883h = j;
            if (this.f33883h == 0) {
                mo37887a();
            }
        }

        public void close() throws IOException {
            if (!this.f33874f) {
                if (this.f33883h != 0 && !C13184e.m34509a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                    C13186a.this.f33867b.mo38037c();
                    mo37887a();
                }
                this.f33874f = true;
            }
        }

        public long read(C13342c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.f33874f) {
                long j2 = this.f33883h;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(cVar, Math.min(j2, j));
                if (read != -1) {
                    this.f33883h -= read;
                    if (this.f33883h == 0) {
                        mo37887a();
                    }
                    return read;
                }
                C13186a.this.f33867b.mo38037c();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo37887a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: okhttp3.f0.g.a$f */
    private final class C13192f implements Sink {

        /* renamed from: e */
        private final C13350h f33885e;

        /* renamed from: f */
        private boolean f33886f;

        private C13192f() {
            this.f33885e = new C13350h(C13186a.this.f33869d.timeout());
        }

        public void close() throws IOException {
            if (!this.f33886f) {
                this.f33886f = true;
                C13186a.this.m34529a(this.f33885e);
                C13186a.this.f33870e = 3;
            }
        }

        public void flush() throws IOException {
            if (!this.f33886f) {
                C13186a.this.f33869d.flush();
            }
        }

        public C13368t timeout() {
            return this.f33885e;
        }

        public void write(C13342c cVar, long j) throws IOException {
            if (!this.f33886f) {
                C13184e.m34502a(cVar.mo38488b(), 0, j);
                C13186a.this.f33869d.write(cVar, j);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: okhttp3.f0.g.a$g */
    private class C13193g extends C13188b {

        /* renamed from: h */
        private boolean f33888h;

        private C13193g(C13186a aVar) {
            super();
        }

        public void close() throws IOException {
            if (!this.f33874f) {
                if (!this.f33888h) {
                    mo37887a();
                }
                this.f33874f = true;
            }
        }

        public long read(C13342c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f33874f) {
                throw new IllegalStateException("closed");
            } else if (this.f33888h) {
                return -1;
            } else {
                long read = super.read(cVar, j);
                if (read != -1) {
                    return read;
                }
                this.f33888h = true;
                mo37887a();
                return -1;
            }
        }
    }

    public C13186a(C13325v vVar, C13235f fVar, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.f33866a = vVar;
        this.f33867b = fVar;
        this.f33868c = bufferedSource;
        this.f33869d = bufferedSink;
    }

    public void cancel() {
        C13235f fVar = this.f33867b;
        if (fVar != null) {
            fVar.mo38028a();
        }
    }

    public C13235f connection() {
        return this.f33867b;
    }

    public Sink createRequestBody(C13331y yVar, long j) throws IOException {
        if (yVar.mo38382a() == null || !yVar.mo38382a().mo38404c()) {
            if ("chunked".equalsIgnoreCase(yVar.mo38381a("Transfer-Encoding"))) {
                return m34525a();
            }
            if (j != -1) {
                return m34531b();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    public void finishRequest() throws IOException {
        this.f33869d.flush();
    }

    public void flushRequest() throws IOException {
        this.f33869d.flush();
    }

    public Source openResponseBodySource(C13167a0 a0Var) {
        if (!C13248d.m34792b(a0Var)) {
            return m34526a(0);
        }
        if ("chunked".equalsIgnoreCase(a0Var.mo37787a("Transfer-Encoding"))) {
            return m34527a(a0Var.mo37803n().mo38389g());
        }
        long a = C13248d.m34786a(a0Var);
        if (a != -1) {
            return m34526a(a);
        }
        return m34533c();
    }

    public C13168a readResponseHeaders(boolean z) throws IOException {
        int i = this.f33870e;
        if (i == 1 || i == 3) {
            try {
                C13254j a = C13254j.m34817a(m34534d());
                C13168a aVar = new C13168a();
                aVar.mo37814a(a.f34140a);
                aVar.mo37806a(a.f34141b);
                aVar.mo37808a(a.f34142c);
                aVar.mo37813a(m34537e());
                if (z && a.f34141b == 100) {
                    return null;
                }
                if (a.f34141b == 100) {
                    this.f33870e = 3;
                    return aVar;
                }
                this.f33870e = 4;
                return aVar;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(this.f33867b.route().mo37833a().mo37854k().mo38296n());
                throw new IOException(sb.toString(), e);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("state: ");
            sb2.append(this.f33870e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public long reportedContentLength(C13167a0 a0Var) {
        if (!C13248d.m34792b(a0Var)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(a0Var.mo37787a("Transfer-Encoding"))) {
            return -1;
        }
        return C13248d.m34786a(a0Var);
    }

    public C13317r trailers() {
        if (this.f33870e == 6) {
            C13317r rVar = this.f33872g;
            return rVar != null ? rVar : C13184e.f33857c;
        }
        throw new IllegalStateException("too early; can't read the trailers yet");
    }

    public void writeRequestHeaders(C13331y yVar) throws IOException {
        mo37876a(yVar.mo38385c(), C13252h.m34810a(yVar, this.f33867b.route().mo37834b().type()));
    }

    /* renamed from: b */
    private Sink m34531b() {
        if (this.f33870e == 1) {
            this.f33870e = 2;
            return new C13192f();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f33870e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    private Source m34533c() {
        if (this.f33870e == 4) {
            this.f33870e = 5;
            this.f33867b.mo38037c();
            return new C13193g();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f33870e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    private String m34534d() throws IOException {
        String readUtf8LineStrict = this.f33868c.readUtf8LineStrict(this.f33871f);
        this.f33871f -= (long) readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C13317r m34537e() throws IOException {
        C13318a aVar = new C13318a();
        while (true) {
            String d = m34534d();
            if (d.length() == 0) {
                return aVar.mo38272a();
            }
            C13182c.f33853a.mo37870a(aVar, d);
        }
    }

    /* renamed from: a */
    public void mo37876a(C13317r rVar, String str) throws IOException {
        if (this.f33870e == 0) {
            String str2 = "\r\n";
            this.f33869d.writeUtf8(str).writeUtf8(str2);
            int c = rVar.mo38266c();
            for (int i = 0; i < c; i++) {
                this.f33869d.writeUtf8(rVar.mo38260a(i)).writeUtf8(": ").writeUtf8(rVar.mo38263b(i)).writeUtf8(str2);
            }
            this.f33869d.writeUtf8(str2);
            this.f33870e = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f33870e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private Sink m34525a() {
        if (this.f33870e == 1) {
            this.f33870e = 2;
            return new C13189c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f33870e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private Source m34526a(long j) {
        if (this.f33870e == 4) {
            this.f33870e = 5;
            return new C13191e(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f33870e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private Source m34527a(C13319s sVar) {
        if (this.f33870e == 4) {
            this.f33870e = 5;
            return new C13190d(sVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f33870e);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34529a(C13350h hVar) {
        C13368t g = hVar.mo38548g();
        hVar.mo38539a(C13368t.f34674d);
        g.mo38540a();
        g.mo38543b();
    }

    /* renamed from: a */
    public void mo37875a(C13167a0 a0Var) throws IOException {
        long a = C13248d.m34786a(a0Var);
        if (a != -1) {
            Source a2 = m34526a(a);
            C13184e.m34516b(a2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            a2.close();
        }
    }
}

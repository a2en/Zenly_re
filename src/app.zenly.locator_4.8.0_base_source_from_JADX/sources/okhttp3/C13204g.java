package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13317r.C13318a;
import okhttp3.C13331y.C13332a;
import okhttp3.internal.cache.C13218b;
import okhttp3.internal.cache.C13220c;
import okhttp3.internal.cache.C13220c.C13223c;
import okhttp3.internal.cache.C13220c.C13226e;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.C13248d;
import okhttp3.internal.http.C13249e;
import okhttp3.internal.http.C13254j;
import okhttp3.internal.p422io.FileSystem;
import okhttp3.p418f0.C13184e;
import okhttp3.p418f0.p420h.C13202e;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13346d;
import okio.C13348f;
import okio.C13349g;
import okio.C13354l;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.g */
public final class C13204g implements Closeable, Flushable {

    /* renamed from: e */
    final InternalCache f33915e;

    /* renamed from: f */
    final C13220c f33916f;

    /* renamed from: g */
    int f33917g;

    /* renamed from: h */
    int f33918h;

    /* renamed from: i */
    private int f33919i;

    /* renamed from: j */
    private int f33920j;

    /* renamed from: k */
    private int f33921k;

    /* renamed from: okhttp3.g$a */
    class C13205a implements InternalCache {
        C13205a() {
        }

        public C13167a0 get(C13331y yVar) throws IOException {
            return C13204g.this.mo37922a(yVar);
        }

        public CacheRequest put(C13167a0 a0Var) throws IOException {
            return C13204g.this.mo37923a(a0Var);
        }

        public void remove(C13331y yVar) throws IOException {
            C13204g.this.mo37928b(yVar);
        }

        public void trackConditionalCacheHit() {
            C13204g.this.mo37927b();
        }

        public void trackResponse(C13218b bVar) {
            C13204g.this.mo37926a(bVar);
        }

        public void update(C13167a0 a0Var, C13167a0 a0Var2) {
            C13204g.this.mo37925a(a0Var, a0Var2);
        }
    }

    /* renamed from: okhttp3.g$b */
    private final class C13206b implements CacheRequest {

        /* renamed from: a */
        private final C13223c f33923a;

        /* renamed from: b */
        private Sink f33924b;

        /* renamed from: c */
        private Sink f33925c;

        /* renamed from: d */
        boolean f33926d;

        /* renamed from: okhttp3.g$b$a */
        class C13207a extends C13348f {

            /* renamed from: f */
            final /* synthetic */ C13223c f33928f;

            C13207a(Sink sink, C13204g gVar, C13223c cVar) {
                this.f33928f = cVar;
                super(sink);
            }

            public void close() throws IOException {
                synchronized (C13204g.this) {
                    if (!C13206b.this.f33926d) {
                        C13206b.this.f33926d = true;
                        C13204g.this.f33917g++;
                        super.close();
                        this.f33928f.mo37988b();
                    }
                }
            }
        }

        C13206b(C13223c cVar) {
            this.f33923a = cVar;
            this.f33924b = cVar.mo37986a(1);
            this.f33925c = new C13207a(this.f33924b, C13204g.this, cVar);
        }

        /* JADX INFO: used method not loaded: okhttp3.f0.e.a(java.io.Closeable):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r4.f33923a.mo37987a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            okhttp3.p418f0.C13184e.m34503a((java.io.Closeable) r4.f33924b);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void abort() {
            /*
                r4 = this;
                okhttp3.g r0 = okhttp3.C13204g.this
                monitor-enter(r0)
                boolean r1 = r4.f33926d     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                return
            L_0x0009:
                r1 = 1
                r4.f33926d = r1     // Catch:{ all -> 0x001f }
                okhttp3.g r2 = okhttp3.C13204g.this     // Catch:{ all -> 0x001f }
                int r3 = r2.f33918h     // Catch:{ all -> 0x001f }
                int r3 = r3 + r1
                r2.f33918h = r3     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                okio.Sink r0 = r4.f33924b
                okhttp3.p418f0.C13184e.m34503a(r0)
                okhttp3.internal.cache.c$c r0 = r4.f33923a     // Catch:{ IOException -> 0x001e }
                r0.mo37987a()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13204g.C13206b.abort():void");
        }

        public Sink body() {
            return this.f33925c;
        }
    }

    /* renamed from: okhttp3.g$c */
    private static class C13208c extends C13170b0 {

        /* renamed from: f */
        final C13226e f33930f;

        /* renamed from: g */
        private final BufferedSource f33931g;

        /* renamed from: h */
        private final String f33932h;

        /* renamed from: i */
        private final String f33933i;

        /* renamed from: okhttp3.g$c$a */
        class C13209a extends C13349g {

            /* renamed from: f */
            final /* synthetic */ C13226e f33934f;

            C13209a(C13208c cVar, Source source, C13226e eVar) {
                this.f33934f = eVar;
                super(source);
            }

            public void close() throws IOException {
                this.f33934f.close();
                super.close();
            }
        }

        C13208c(C13226e eVar, String str, String str2) {
            this.f33930f = eVar;
            this.f33932h = str;
            this.f33933i = str2;
            this.f33931g = C13354l.m35375a((Source) new C13209a(this, eVar.mo37994a(1), eVar));
        }

        /* renamed from: d */
        public long mo37827d() {
            try {
                if (this.f33933i != null) {
                    return Long.parseLong(this.f33933i);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: e */
        public C13321t mo37828e() {
            String str = this.f33932h;
            if (str != null) {
                return C13321t.m35172b(str);
            }
            return null;
        }

        /* renamed from: f */
        public BufferedSource mo37829f() {
            return this.f33931g;
        }
    }

    /* renamed from: okhttp3.g$d */
    private static final class C13210d {

        /* renamed from: k */
        private static final String f33935k;

        /* renamed from: l */
        private static final String f33936l;

        /* renamed from: a */
        private final String f33937a;

        /* renamed from: b */
        private final C13317r f33938b;

        /* renamed from: c */
        private final String f33939c;

        /* renamed from: d */
        private final C13328w f33940d;

        /* renamed from: e */
        private final int f33941e;

        /* renamed from: f */
        private final String f33942f;

        /* renamed from: g */
        private final C13317r f33943g;

        /* renamed from: h */
        private final C13316q f33944h;

        /* renamed from: i */
        private final long f33945i;

        /* renamed from: j */
        private final long f33946j;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(C13202e.m34581d().mo37917a());
            sb.append("-Sent-Millis");
            f33935k = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C13202e.m34581d().mo37917a());
            sb2.append("-Received-Millis");
            f33936l = sb2.toString();
        }

        C13210d(Source source) throws IOException {
            C13176d0 d0Var;
            try {
                BufferedSource a = C13354l.m35375a(source);
                this.f33937a = a.readUtf8LineStrict();
                this.f33939c = a.readUtf8LineStrict();
                C13318a aVar = new C13318a();
                int a2 = C13204g.m34598a(a);
                for (int i = 0; i < a2; i++) {
                    aVar.mo38270a(a.readUtf8LineStrict());
                }
                this.f33938b = aVar.mo38272a();
                C13254j a3 = C13254j.m34817a(a.readUtf8LineStrict());
                this.f33940d = a3.f34140a;
                this.f33941e = a3.f34141b;
                this.f33942f = a3.f34142c;
                C13318a aVar2 = new C13318a();
                int a4 = C13204g.m34598a(a);
                for (int i2 = 0; i2 < a4; i2++) {
                    aVar2.mo38270a(a.readUtf8LineStrict());
                }
                String b = aVar2.mo38273b(f33935k);
                String b2 = aVar2.mo38273b(f33936l);
                aVar2.mo38275c(f33935k);
                aVar2.mo38275c(f33936l);
                long j = 0;
                this.f33945i = b != null ? Long.parseLong(b) : 0;
                if (b2 != null) {
                    j = Long.parseLong(b2);
                }
                this.f33946j = j;
                this.f33943g = aVar2.mo38272a();
                if (m34613a()) {
                    String readUtf8LineStrict = a.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() <= 0) {
                        C13305j a5 = C13305j.m35039a(a.readUtf8LineStrict());
                        List a6 = m34611a(a);
                        List a7 = m34611a(a);
                        if (!a.exhausted()) {
                            d0Var = C13176d0.m34452a(a.readUtf8LineStrict());
                        } else {
                            d0Var = C13176d0.SSL_3_0;
                        }
                        this.f33944h = C13316q.m35090a(d0Var, a5, a6, a7);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected \"\" but was \"");
                        sb.append(readUtf8LineStrict);
                        sb.append("\"");
                        throw new IOException(sb.toString());
                    }
                } else {
                    this.f33944h = null;
                }
            } finally {
                source.close();
            }
        }

        /* renamed from: a */
        public void mo37940a(C13223c cVar) throws IOException {
            String str;
            BufferedSink a = C13354l.m35374a(cVar.mo37986a(0));
            a.writeUtf8(this.f33937a).writeByte(10);
            a.writeUtf8(this.f33939c).writeByte(10);
            a.writeDecimalLong((long) this.f33938b.mo38266c()).writeByte(10);
            int c = this.f33938b.mo38266c();
            int i = 0;
            while (true) {
                str = ": ";
                if (i >= c) {
                    break;
                }
                a.writeUtf8(this.f33938b.mo38260a(i)).writeUtf8(str).writeUtf8(this.f33938b.mo38263b(i)).writeByte(10);
                i++;
            }
            a.writeUtf8(new C13254j(this.f33940d, this.f33941e, this.f33942f).toString()).writeByte(10);
            a.writeDecimalLong((long) (this.f33943g.mo38266c() + 2)).writeByte(10);
            int c2 = this.f33943g.mo38266c();
            for (int i2 = 0; i2 < c2; i2++) {
                a.writeUtf8(this.f33943g.mo38260a(i2)).writeUtf8(str).writeUtf8(this.f33943g.mo38263b(i2)).writeByte(10);
            }
            a.writeUtf8(f33935k).writeUtf8(str).writeDecimalLong(this.f33945i).writeByte(10);
            a.writeUtf8(f33936l).writeUtf8(str).writeDecimalLong(this.f33946j).writeByte(10);
            if (m34613a()) {
                a.writeByte(10);
                a.writeUtf8(this.f33944h.mo38253a().mo38218a()).writeByte(10);
                m34612a(a, this.f33944h.mo38255c());
                m34612a(a, this.f33944h.mo38254b());
                a.writeUtf8(this.f33944h.mo38256d().mo37840a()).writeByte(10);
            }
            a.close();
        }

        /* renamed from: a */
        private boolean m34613a() {
            return this.f33937a.startsWith("https://");
        }

        C13210d(C13167a0 a0Var) {
            this.f33937a = a0Var.mo37803n().mo38389g().toString();
            this.f33938b = C13248d.m34797e(a0Var);
            this.f33939c = a0Var.mo37803n().mo38387e();
            this.f33940d = a0Var.mo37801l();
            this.f33941e = a0Var.mo37793d();
            this.f33942f = a0Var.mo37797h();
            this.f33943g = a0Var.mo37795f();
            this.f33944h = a0Var.mo37794e();
            this.f33945i = a0Var.mo37804o();
            this.f33946j = a0Var.mo37802m();
        }

        /* renamed from: a */
        private List<Certificate> m34611a(BufferedSource bufferedSource) throws IOException {
            int a = C13204g.m34598a(bufferedSource);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                    C13342c cVar = new C13342c();
                    cVar.write(C13346d.m35330a(readUtf8LineStrict));
                    arrayList.add(instance.generateCertificate(cVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        private void m34612a(BufferedSink bufferedSink, List<Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(C13346d.m35331a(((Certificate) list.get(i)).getEncoded()).mo38515a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        public boolean mo37941a(C13331y yVar, C13167a0 a0Var) {
            return this.f33937a.equals(yVar.mo38389g().toString()) && this.f33939c.equals(yVar.mo38387e()) && C13248d.m34790a(a0Var, this.f33938b, yVar);
        }

        /* renamed from: a */
        public C13167a0 mo37939a(C13226e eVar) {
            String a = this.f33943g.mo38261a("Content-Type");
            String a2 = this.f33943g.mo38261a("Content-Length");
            C13332a aVar = new C13332a();
            aVar.mo38402b(this.f33937a);
            aVar.mo38395a(this.f33939c, (C13333z) null);
            aVar.mo38397a(this.f33938b);
            C13331y a3 = aVar.mo38400a();
            C13168a aVar2 = new C13168a();
            aVar2.mo37815a(a3);
            aVar2.mo37814a(this.f33940d);
            aVar2.mo37806a(this.f33941e);
            aVar2.mo37808a(this.f33942f);
            aVar2.mo37813a(this.f33943g);
            aVar2.mo37811a((C13170b0) new C13208c(eVar, a, a2));
            aVar2.mo37812a(this.f33944h);
            aVar2.mo37818b(this.f33945i);
            aVar2.mo37807a(this.f33946j);
            return aVar2.mo37816a();
        }
    }

    public C13204g(File file, long j) {
        this(file, j, FileSystem.f34312a);
    }

    /* renamed from: a */
    public static String m34599a(C13319s sVar) {
        return C13346d.m35334d(sVar.toString()).mo38524d().mo38520b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo37928b(C13331y yVar) throws IOException {
        this.f33916f.mo37977c(m34599a(yVar.mo38389g()));
    }

    public void close() throws IOException {
        this.f33916f.close();
    }

    public void flush() throws IOException {
        this.f33916f.flush();
    }

    C13204g(File file, long j, FileSystem fileSystem) {
        this.f33915e = new C13205a();
        this.f33916f = C13220c.m34654a(fileSystem, file, 201105, 2, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13167a0 mo37922a(C13331y yVar) {
        try {
            C13226e b = this.f33916f.mo37974b(m34599a(yVar.mo38389g()));
            if (b == null) {
                return null;
            }
            try {
                C13210d dVar = new C13210d(b.mo37994a(0));
                C13167a0 a = dVar.mo37939a(b);
                if (dVar.mo37941a(yVar, a)) {
                    return a;
                }
                C13184e.m34503a((Closeable) a.mo37789a());
                return null;
            } catch (IOException unused) {
                C13184e.m34503a((Closeable) b);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo37927b() {
        this.f33920j++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CacheRequest mo37923a(C13167a0 a0Var) {
        C13223c cVar;
        String e = a0Var.mo37803n().mo38387e();
        if (C13249e.m34798a(a0Var.mo37803n().mo38387e())) {
            try {
                mo37928b(a0Var.mo37803n());
            } catch (IOException unused) {
            }
            return null;
        } else if (!e.equals("GET") || C13248d.m34795c(a0Var)) {
            return null;
        } else {
            C13210d dVar = new C13210d(a0Var);
            try {
                cVar = this.f33916f.mo37969a(m34599a(a0Var.mo37803n().mo38389g()));
                if (cVar == null) {
                    return null;
                }
                try {
                    dVar.mo37940a(cVar);
                    return new C13206b(cVar);
                } catch (IOException unused2) {
                    m34600a(cVar);
                    return null;
                }
            } catch (IOException unused3) {
                cVar = null;
                m34600a(cVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo37925a(C13167a0 a0Var, C13167a0 a0Var2) {
        C13223c cVar;
        C13210d dVar = new C13210d(a0Var2);
        try {
            cVar = ((C13208c) a0Var.mo37789a()).f33930f.mo37993a();
            if (cVar != null) {
                try {
                    dVar.mo37940a(cVar);
                    cVar.mo37988b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            cVar = null;
            m34600a(cVar);
        }
    }

    /* renamed from: a */
    private void m34600a(C13223c cVar) {
        if (cVar != null) {
            try {
                cVar.mo37987a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo37924a() throws IOException {
        this.f33916f.mo37975b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo37926a(C13218b bVar) {
        this.f33921k++;
        if (bVar.f33982a != null) {
            this.f33919i++;
        } else if (bVar.f33983b != null) {
            this.f33920j++;
        }
    }

    /* renamed from: a */
    static int m34598a(BufferedSource bufferedSource) throws IOException {
        try {
            long readDecimalLong = bufferedSource.readDecimalLong();
            String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.isEmpty()) {
                return (int) readDecimalLong;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected an int but was \"");
            sb.append(readDecimalLong);
            sb.append(readUtf8LineStrict);
            sb.append("\"");
            throw new IOException(sb.toString());
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}

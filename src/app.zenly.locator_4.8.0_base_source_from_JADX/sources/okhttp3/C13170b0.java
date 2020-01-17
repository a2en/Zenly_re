package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.p418f0.C13184e;
import okio.BufferedSource;
import okio.C13342c;

/* renamed from: okhttp3.b0 */
public abstract class C13170b0 implements Closeable {

    /* renamed from: e */
    private Reader f33819e;

    /* renamed from: okhttp3.b0$a */
    class C13171a extends C13170b0 {

        /* renamed from: f */
        final /* synthetic */ C13321t f33820f;

        /* renamed from: g */
        final /* synthetic */ long f33821g;

        /* renamed from: h */
        final /* synthetic */ BufferedSource f33822h;

        C13171a(C13321t tVar, long j, BufferedSource bufferedSource) {
            this.f33820f = tVar;
            this.f33821g = j;
            this.f33822h = bufferedSource;
        }

        /* renamed from: d */
        public long mo37827d() {
            return this.f33821g;
        }

        /* renamed from: e */
        public C13321t mo37828e() {
            return this.f33820f;
        }

        /* renamed from: f */
        public BufferedSource mo37829f() {
            return this.f33822h;
        }
    }

    /* renamed from: okhttp3.b0$b */
    static final class C13172b extends Reader {

        /* renamed from: e */
        private final BufferedSource f33823e;

        /* renamed from: f */
        private final Charset f33824f;

        /* renamed from: g */
        private boolean f33825g;

        /* renamed from: h */
        private Reader f33826h;

        C13172b(BufferedSource bufferedSource, Charset charset) {
            this.f33823e = bufferedSource;
            this.f33824f = charset;
        }

        public void close() throws IOException {
            this.f33825g = true;
            Reader reader = this.f33826h;
            if (reader != null) {
                reader.close();
            } else {
                this.f33823e.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.f33825g) {
                Reader reader = this.f33826h;
                if (reader == null) {
                    Reader inputStreamReader = new InputStreamReader(this.f33823e.inputStream(), C13184e.m34495a(this.f33823e, this.f33824f));
                    this.f33826h = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: h */
    private Charset mo38640h() {
        C13321t e = mo37828e();
        return e != null ? e.mo38315a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    /* renamed from: a */
    public final InputStream mo37823a() {
        return mo37829f().inputStream();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r2 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        m34435a(r0, (java.lang.AutoCloseable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo37824b() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.mo37827d()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0055
            okio.BufferedSource r2 = r6.mo37829f()
            r3 = 0
            byte[] r4 = r2.readByteArray()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0019
            m34435a(r3, r2)
        L_0x0019:
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x004b
            int r2 = r4.length
            long r2 = (long) r2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0026
            goto L_0x004b
        L_0x0026:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Content-Length ("
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            int r0 = r4.length
            r3.append(r0)
            java.lang.String r0 = ") disagree"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x004b:
            return r4
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0054
            m34435a(r0, r2)
        L_0x0054:
            throw r1
        L_0x0055:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13170b0.mo37824b():byte[]");
    }

    /* renamed from: c */
    public final Reader mo37825c() {
        Reader reader = this.f33819e;
        if (reader != null) {
            return reader;
        }
        C13172b bVar = new C13172b(mo37829f(), mo38640h());
        this.f33819e = bVar;
        return bVar;
    }

    public void close() {
        C13184e.m34503a((Closeable) mo37829f());
    }

    /* renamed from: d */
    public abstract long mo37827d();

    /* renamed from: e */
    public abstract C13321t mo37828e();

    /* renamed from: f */
    public abstract BufferedSource mo37829f();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        m34435a(r1, (java.lang.AutoCloseable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r2 = move-exception;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo37830g() throws java.io.IOException {
        /*
            r3 = this;
            okio.BufferedSource r0 = r3.mo37829f()
            java.nio.charset.Charset r1 = r3.mo38640h()     // Catch:{ all -> 0x0017 }
            java.nio.charset.Charset r1 = okhttp3.p418f0.C13184e.m34495a(r0, r1)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r0.readString(r1)     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0016
            r2 = 0
            m34435a(r2, r0)
        L_0x0016:
            return r1
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            if (r0 == 0) goto L_0x001f
            m34435a(r1, r0)
        L_0x001f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13170b0.mo37830g():java.lang.String");
    }

    /* renamed from: a */
    private static /* synthetic */ void m34435a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    /* renamed from: a */
    public static C13170b0 m34433a(C13321t tVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (tVar != null) {
            charset = tVar.mo38314a();
            if (charset == null) {
                charset = StandardCharsets.UTF_8;
                StringBuilder sb = new StringBuilder();
                sb.append(tVar);
                sb.append("; charset=utf-8");
                tVar = C13321t.m35172b(sb.toString());
            }
        }
        C13342c cVar = new C13342c();
        cVar.writeString(str, charset);
        return m34432a(tVar, cVar.mo38488b(), cVar);
    }

    /* renamed from: a */
    public static C13170b0 m34434a(C13321t tVar, byte[] bArr) {
        C13342c cVar = new C13342c();
        cVar.write(bArr);
        return m34432a(tVar, (long) bArr.length, cVar);
    }

    /* renamed from: a */
    public static C13170b0 m34432a(C13321t tVar, long j, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new C13171a(tVar, j, bufferedSource);
        }
        throw new NullPointerException("source == null");
    }
}

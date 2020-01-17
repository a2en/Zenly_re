package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okhttp3.p418f0.C13184e;
import okio.BufferedSink;
import okio.C13346d;

/* renamed from: okhttp3.z */
public abstract class C13333z {

    /* renamed from: okhttp3.z$a */
    class C13334a extends C13333z {

        /* renamed from: a */
        final /* synthetic */ C13321t f34585a;

        /* renamed from: b */
        final /* synthetic */ C13346d f34586b;

        C13334a(C13321t tVar, C13346d dVar) {
            this.f34585a = tVar;
            this.f34586b = dVar;
        }

        /* renamed from: a */
        public long mo32976a() throws IOException {
            return (long) this.f34586b.mo38528g();
        }

        /* renamed from: b */
        public C13321t mo32978b() {
            return this.f34585a;
        }

        /* renamed from: a */
        public void mo32977a(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f34586b);
        }
    }

    /* renamed from: okhttp3.z$b */
    class C13335b extends C13333z {

        /* renamed from: a */
        final /* synthetic */ C13321t f34587a;

        /* renamed from: b */
        final /* synthetic */ int f34588b;

        /* renamed from: c */
        final /* synthetic */ byte[] f34589c;

        /* renamed from: d */
        final /* synthetic */ int f34590d;

        C13335b(C13321t tVar, int i, byte[] bArr, int i2) {
            this.f34587a = tVar;
            this.f34588b = i;
            this.f34589c = bArr;
            this.f34590d = i2;
        }

        /* renamed from: a */
        public long mo32976a() {
            return (long) this.f34588b;
        }

        /* renamed from: b */
        public C13321t mo32978b() {
            return this.f34587a;
        }

        /* renamed from: a */
        public void mo32977a(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f34589c, this.f34590d, this.f34588b);
        }
    }

    /* renamed from: okhttp3.z$c */
    class C13336c extends C13333z {

        /* renamed from: a */
        final /* synthetic */ C13321t f34591a;

        /* renamed from: b */
        final /* synthetic */ File f34592b;

        C13336c(C13321t tVar, File file) {
            this.f34591a = tVar;
            this.f34592b = file;
        }

        /* renamed from: a */
        public long mo32976a() {
            return this.f34592b.length();
        }

        /* renamed from: b */
        public C13321t mo32978b() {
            return this.f34591a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
            r3.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r0 != null) goto L_0x0014;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo32977a(okio.BufferedSink r3) throws java.io.IOException {
            /*
                r2 = this;
                java.io.File r0 = r2.f34592b
                okio.Source r0 = okio.C13354l.m35386c(r0)
                r3.writeAll(r0)     // Catch:{ all -> 0x000f }
                if (r0 == 0) goto L_0x000e
                r0.close()
            L_0x000e:
                return
            L_0x000f:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0011 }
            L_0x0011:
                r1 = move-exception
                if (r0 == 0) goto L_0x001c
                r0.close()     // Catch:{ all -> 0x0018 }
                goto L_0x001c
            L_0x0018:
                r0 = move-exception
                r3.addSuppressed(r0)
            L_0x001c:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13333z.C13336c.mo32977a(okio.BufferedSink):void");
        }
    }

    /* renamed from: a */
    public static C13333z m35281a(C13321t tVar, String str) {
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
        return m35283a(tVar, str.getBytes(charset));
    }

    /* renamed from: a */
    public long mo32976a() throws IOException {
        return -1;
    }

    /* renamed from: a */
    public abstract void mo32977a(BufferedSink bufferedSink) throws IOException;

    /* renamed from: b */
    public abstract C13321t mo32978b();

    /* renamed from: c */
    public boolean mo38404c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo38405d() {
        return false;
    }

    /* renamed from: a */
    public static C13333z m35282a(C13321t tVar, C13346d dVar) {
        return new C13334a(tVar, dVar);
    }

    /* renamed from: a */
    public static C13333z m35283a(C13321t tVar, byte[] bArr) {
        return m35284a(tVar, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C13333z m35284a(C13321t tVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C13184e.m34502a((long) bArr.length, (long) i, (long) i2);
            return new C13335b(tVar, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    /* renamed from: a */
    public static C13333z m35280a(C13321t tVar, File file) {
        if (file != null) {
            return new C13336c(tVar, file);
        }
        throw new NullPointerException("file == null");
    }
}

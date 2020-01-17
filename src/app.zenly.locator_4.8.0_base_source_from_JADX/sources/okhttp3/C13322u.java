package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.C13317r.C13318a;
import okhttp3.p418f0.C13184e;
import okio.BufferedSink;
import okio.C13346d;

/* renamed from: okhttp3.u */
public final class C13322u extends C13333z {

    /* renamed from: e */
    public static final C13321t f34486e = C13321t.m35171a("multipart/mixed");

    /* renamed from: f */
    public static final C13321t f34487f = C13321t.m35171a("multipart/form-data");

    /* renamed from: g */
    private static final byte[] f34488g = {58, 32};

    /* renamed from: h */
    private static final byte[] f34489h = {13, 10};

    /* renamed from: i */
    private static final byte[] f34490i = {45, 45};

    /* renamed from: a */
    private final C13346d f34491a;

    /* renamed from: b */
    private final C13321t f34492b;

    /* renamed from: c */
    private final List<C13324b> f34493c;

    /* renamed from: d */
    private long f34494d = -1;

    /* renamed from: okhttp3.u$a */
    public static final class C13323a {

        /* renamed from: a */
        private final C13346d f34495a;

        /* renamed from: b */
        private C13321t f34496b;

        /* renamed from: c */
        private final List<C13324b> f34497c;

        public C13323a() {
            this(UUID.randomUUID().toString());
        }

        /* renamed from: a */
        public C13323a mo38325a(C13321t tVar) {
            if (tVar == null) {
                throw new NullPointerException("type == null");
            } else if (tVar.mo38317c().equals("multipart")) {
                this.f34496b = tVar;
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("multipart != ");
                sb.append(tVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public C13323a(String str) {
            this.f34496b = C13322u.f34486e;
            this.f34497c = new ArrayList();
            this.f34495a = C13346d.m35334d(str);
        }

        /* renamed from: a */
        public C13323a mo38324a(C13317r rVar, C13333z zVar) {
            mo38326a(C13324b.m35191a(rVar, zVar));
            return this;
        }

        /* renamed from: a */
        public C13323a mo38323a(String str, String str2) {
            mo38326a(C13324b.m35189a(str, str2));
            return this;
        }

        /* renamed from: a */
        public C13323a mo38326a(C13324b bVar) {
            if (bVar != null) {
                this.f34497c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        /* renamed from: a */
        public C13322u mo38327a() {
            if (!this.f34497c.isEmpty()) {
                return new C13322u(this.f34495a, this.f34496b, this.f34497c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: okhttp3.u$b */
    public static final class C13324b {

        /* renamed from: a */
        final C13317r f34498a;

        /* renamed from: b */
        final C13333z f34499b;

        private C13324b(C13317r rVar, C13333z zVar) {
            this.f34498a = rVar;
            this.f34499b = zVar;
        }

        /* renamed from: a */
        public static C13324b m35191a(C13317r rVar, C13333z zVar) {
            if (zVar == null) {
                throw new NullPointerException("body == null");
            } else if (rVar != null && rVar.mo38261a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (rVar == null || rVar.mo38261a("Content-Length") == null) {
                return new C13324b(rVar, zVar);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        /* renamed from: a */
        public static C13324b m35189a(String str, String str2) {
            return m35190a(str, null, C13333z.m35281a((C13321t) null, str2));
        }

        /* renamed from: a */
        public static C13324b m35190a(String str, String str2, C13333z zVar) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                C13322u.m35178a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    C13322u.m35178a(sb, str2);
                }
                C13318a aVar = new C13318a();
                aVar.mo38276c("Content-Disposition", sb.toString());
                return m35191a(aVar.mo38272a(), zVar);
            }
            throw new NullPointerException("name == null");
        }
    }

    static {
        C13321t.m35171a("multipart/alternative");
        C13321t.m35171a("multipart/digest");
        C13321t.m35171a("multipart/parallel");
    }

    C13322u(C13346d dVar, C13321t tVar, List<C13324b> list) {
        this.f34491a = dVar;
        StringBuilder sb = new StringBuilder();
        sb.append(tVar);
        sb.append("; boundary=");
        sb.append(dVar.mo38532j());
        this.f34492b = C13321t.m35171a(sb.toString());
        this.f34493c = C13184e.m34496a(list);
    }

    /* renamed from: a */
    public C13324b mo38321a(int i) {
        return (C13324b) this.f34493c.get(i);
    }

    /* renamed from: b */
    public C13321t mo32978b() {
        return this.f34492b;
    }

    /* renamed from: e */
    public int mo38322e() {
        return this.f34493c.size();
    }

    /* renamed from: a */
    public long mo32976a() throws IOException {
        long j = this.f34494d;
        if (j != -1) {
            return j;
        }
        long a = m35177a((BufferedSink) null, true);
        this.f34494d = a;
        return a;
    }

    /* renamed from: a */
    public void mo32977a(BufferedSink bufferedSink) throws IOException {
        m35177a(bufferedSink, false);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [okio.BufferedSink] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r13v3, types: [okio.c] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m35177a(okio.BufferedSink r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            okio.c r13 = new okio.c
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.u$b> r1 = r12.f34493c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = 0
        L_0x0015:
            if (r3 >= r1) goto L_0x00a7
            java.util.List<okhttp3.u$b> r6 = r12.f34493c
            java.lang.Object r6 = r6.get(r3)
            okhttp3.u$b r6 = (okhttp3.C13322u.C13324b) r6
            okhttp3.r r7 = r6.f34498a
            okhttp3.z r6 = r6.f34499b
            byte[] r8 = f34490i
            r13.write(r8)
            okio.d r8 = r12.f34491a
            r13.write(r8)
            byte[] r8 = f34489h
            r13.write(r8)
            if (r7 == 0) goto L_0x0059
            int r8 = r7.mo38266c()
            r9 = 0
        L_0x0039:
            if (r9 >= r8) goto L_0x0059
            java.lang.String r10 = r7.mo38260a(r9)
            okio.BufferedSink r10 = r13.writeUtf8(r10)
            byte[] r11 = f34488g
            okio.BufferedSink r10 = r10.write(r11)
            java.lang.String r11 = r7.mo38263b(r9)
            okio.BufferedSink r10 = r10.writeUtf8(r11)
            byte[] r11 = f34489h
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x0039
        L_0x0059:
            okhttp3.t r7 = r6.mo32978b()
            if (r7 == 0) goto L_0x0072
            java.lang.String r8 = "Content-Type: "
            okio.BufferedSink r8 = r13.writeUtf8(r8)
            java.lang.String r7 = r7.toString()
            okio.BufferedSink r7 = r8.writeUtf8(r7)
            byte[] r8 = f34489h
            r7.write(r8)
        L_0x0072:
            long r7 = r6.mo32976a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008c
            java.lang.String r9 = "Content-Length: "
            okio.BufferedSink r9 = r13.writeUtf8(r9)
            okio.BufferedSink r9 = r9.writeDecimalLong(r7)
            byte[] r10 = f34489h
            r9.write(r10)
            goto L_0x0092
        L_0x008c:
            if (r14 == 0) goto L_0x0092
            r0.clear()
            return r9
        L_0x0092:
            byte[] r9 = f34489h
            r13.write(r9)
            if (r14 == 0) goto L_0x009b
            long r4 = r4 + r7
            goto L_0x009e
        L_0x009b:
            r6.mo32977a(r13)
        L_0x009e:
            byte[] r6 = f34489h
            r13.write(r6)
            int r3 = r3 + 1
            goto L_0x0015
        L_0x00a7:
            byte[] r1 = f34490i
            r13.write(r1)
            okio.d r1 = r12.f34491a
            r13.write(r1)
            byte[] r1 = f34490i
            r13.write(r1)
            byte[] r1 = f34489h
            r13.write(r1)
            if (r14 == 0) goto L_0x00c5
            long r13 = r0.mo38488b()
            long r4 = r4 + r13
            r0.clear()
        L_0x00c5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13322u.m35177a(okio.BufferedSink, boolean):long");
    }

    /* renamed from: a */
    static void m35178a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }
}

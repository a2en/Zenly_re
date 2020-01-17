package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.tls.C13292c;
import okio.C13346d;

/* renamed from: okhttp3.i */
public final class C13213i {

    /* renamed from: c */
    public static final C13213i f33969c = new C13214a().mo37963a();

    /* renamed from: a */
    private final Set<C13215b> f33970a;

    /* renamed from: b */
    private final C13292c f33971b;

    /* renamed from: okhttp3.i$a */
    public static final class C13214a {

        /* renamed from: a */
        private final List<C13215b> f33972a = new ArrayList();

        /* renamed from: a */
        public C13214a mo37962a(String str, String... strArr) {
            if (str != null) {
                for (String bVar : strArr) {
                    this.f33972a.add(new C13215b(str, bVar));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        /* renamed from: a */
        public C13213i mo37963a() {
            return new C13213i(new LinkedHashSet(this.f33972a), null);
        }
    }

    /* renamed from: okhttp3.i$b */
    static final class C13215b {

        /* renamed from: a */
        final String f33973a;

        /* renamed from: b */
        final String f33974b;

        /* renamed from: c */
        final String f33975c;

        /* renamed from: d */
        final C13346d f33976d;

        C13215b(String str, String str2) {
            String str3;
            this.f33973a = str;
            String str4 = "http://";
            if (str.startsWith("*.")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(str.substring(2));
                str3 = C13319s.m35126e(sb.toString()).mo38288g();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str);
                str3 = C13319s.m35126e(sb2.toString()).mo38288g();
            }
            this.f33974b = str3;
            String str5 = "sha1/";
            if (str2.startsWith(str5)) {
                this.f33975c = str5;
                this.f33976d = C13346d.m35330a(str2.substring(5));
            } else {
                String str6 = "sha256/";
                if (str2.startsWith(str6)) {
                    this.f33975c = str6;
                    this.f33976d = C13346d.m35330a(str2.substring(7));
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("pins must start with 'sha256/' or 'sha1/': ");
                    sb3.append(str2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (this.f33976d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("pins must be base64: ");
                sb4.append(str2);
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
            if (r11.regionMatches(false, r6, r7, 0, r7.length()) != false) goto L_0x0032;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo37964a(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = r10.f33973a
                java.lang.String r1 = "*."
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L_0x0033
                r0 = 46
                int r0 = r11.indexOf(r0)
                int r1 = r11.length()
                int r1 = r1 - r0
                r2 = 1
                int r1 = r1 - r2
                java.lang.String r3 = r10.f33974b
                int r3 = r3.length()
                if (r1 != r3) goto L_0x0031
                r5 = 0
                int r6 = r0 + 1
                java.lang.String r7 = r10.f33974b
                r8 = 0
                int r9 = r7.length()
                r4 = r11
                boolean r11 = r4.regionMatches(r5, r6, r7, r8, r9)
                if (r11 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r2 = 0
            L_0x0032:
                return r2
            L_0x0033:
                java.lang.String r0 = r10.f33974b
                boolean r11 = r11.equals(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13213i.C13215b.mo37964a(java.lang.String):boolean");
        }

        public boolean equals(Object obj) {
            if (obj instanceof C13215b) {
                C13215b bVar = (C13215b) obj;
                if (this.f33973a.equals(bVar.f33973a) && this.f33975c.equals(bVar.f33975c) && this.f33976d.equals(bVar.f33976d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f33973a.hashCode()) * 31) + this.f33975c.hashCode()) * 31) + this.f33976d.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33975c);
            sb.append(this.f33976d.mo38515a());
            return sb.toString();
        }
    }

    C13213i(Set<C13215b> set, C13292c cVar) {
        this.f33970a = set;
        this.f33971b = cVar;
    }

    /* renamed from: b */
    static C13346d m34635b(X509Certificate x509Certificate) {
        return C13346d.m35331a(x509Certificate.getPublicKey().getEncoded()).mo38527f();
    }

    /* renamed from: a */
    public void mo37959a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        String str2;
        List a = mo37957a(str);
        if (!a.isEmpty()) {
            C13292c cVar = this.f33971b;
            if (cVar != null) {
                list = cVar.mo37906a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = a.size();
                C13346d dVar = null;
                C13346d dVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C13215b bVar = (C13215b) a.get(i2);
                    if (bVar.f33975c.equals("sha256/")) {
                        if (dVar == null) {
                            dVar = m34635b(x509Certificate);
                        }
                        if (bVar.f33976d.equals(dVar)) {
                            return;
                        }
                    } else if (bVar.f33975c.equals("sha1/")) {
                        if (dVar2 == null) {
                            dVar2 = m34634a(x509Certificate);
                        }
                        if (bVar.f33976d.equals(dVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported hashAlgorithm: ");
                        sb.append(bVar.f33975c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                str2 = "\n    ";
                if (i3 >= size3) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append(str2);
                sb2.append(m34633a((Certificate) x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
                i3++;
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = a.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C13215b bVar2 = (C13215b) a.get(i4);
                sb2.append(str2);
                sb2.append(bVar2);
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3.f33970a.equals(r4.f33970a) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof okhttp3.C13213i
            if (r1 == 0) goto L_0x001f
            okhttp3.internal.tls.c r1 = r3.f33971b
            okhttp3.i r4 = (okhttp3.C13213i) r4
            okhttp3.internal.tls.c r2 = r4.f33971b
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L_0x001f
            java.util.Set<okhttp3.i$b> r1 = r3.f33970a
            java.util.Set<okhttp3.i$b> r4 = r4.f33970a
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13213i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (Objects.hashCode(this.f33971b) * 31) + this.f33970a.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C13215b> mo37957a(String str) {
        List<C13215b> emptyList = Collections.emptyList();
        for (C13215b bVar : this.f33970a) {
            if (bVar.mo37964a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13213i mo37958a(C13292c cVar) {
        if (Objects.equals(this.f33971b, cVar)) {
            return this;
        }
        return new C13213i(this.f33970a, cVar);
    }

    /* renamed from: a */
    public static String m34633a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder();
            sb.append("sha256/");
            sb.append(m34635b((X509Certificate) certificate).mo38515a());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    static C13346d m34634a(X509Certificate x509Certificate) {
        return C13346d.m35331a(x509Certificate.getPublicKey().getEncoded()).mo38525e();
    }
}

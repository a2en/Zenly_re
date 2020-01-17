package okhttp3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.l */
public final class C13307l {

    /* renamed from: e */
    private static final C13305j[] f34408e = {C13305j.f34403q, C13305j.f34404r, C13305j.f34405s, C13305j.f34397k, C13305j.f34399m, C13305j.f34398l, C13305j.f34400n, C13305j.f34402p, C13305j.f34401o};

    /* renamed from: f */
    private static final C13305j[] f34409f = {C13305j.f34403q, C13305j.f34404r, C13305j.f34405s, C13305j.f34397k, C13305j.f34399m, C13305j.f34398l, C13305j.f34400n, C13305j.f34402p, C13305j.f34401o, C13305j.f34395i, C13305j.f34396j, C13305j.f34393g, C13305j.f34394h, C13305j.f34391e, C13305j.f34392f, C13305j.f34390d};

    /* renamed from: g */
    public static final C13307l f34410g;

    /* renamed from: h */
    public static final C13307l f34411h;

    /* renamed from: i */
    public static final C13307l f34412i = new C13308a(false).mo38233a();

    /* renamed from: a */
    final boolean f34413a;

    /* renamed from: b */
    final boolean f34414b;

    /* renamed from: c */
    final String[] f34415c;

    /* renamed from: d */
    final String[] f34416d;

    /* renamed from: okhttp3.l$a */
    public static final class C13308a {

        /* renamed from: a */
        boolean f34417a;

        /* renamed from: b */
        String[] f34418b;

        /* renamed from: c */
        String[] f34419c;

        /* renamed from: d */
        boolean f34420d;

        C13308a(boolean z) {
            this.f34417a = z;
        }

        /* renamed from: a */
        public C13308a mo38232a(C13305j... jVarArr) {
            if (this.f34417a) {
                String[] strArr = new String[jVarArr.length];
                for (int i = 0; i < jVarArr.length; i++) {
                    strArr[i] = jVarArr[i].f34406a;
                }
                mo38230a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: b */
        public C13308a mo38234b(String... strArr) {
            if (!this.f34417a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f34419c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public C13308a(C13307l lVar) {
            this.f34417a = lVar.f34413a;
            this.f34418b = lVar.f34415c;
            this.f34419c = lVar.f34416d;
            this.f34420d = lVar.f34414b;
        }

        /* renamed from: a */
        public C13308a mo38230a(String... strArr) {
            if (!this.f34417a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f34418b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: a */
        public C13308a mo38231a(C13176d0... d0VarArr) {
            if (this.f34417a) {
                String[] strArr = new String[d0VarArr.length];
                for (int i = 0; i < d0VarArr.length; i++) {
                    strArr[i] = d0VarArr[i].f33838e;
                }
                mo38234b(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: a */
        public C13308a mo38229a(boolean z) {
            if (this.f34417a) {
                this.f34420d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        /* renamed from: a */
        public C13307l mo38233a() {
            return new C13307l(this);
        }
    }

    static {
        C13308a aVar = new C13308a(true);
        aVar.mo38232a(f34408e);
        aVar.mo38231a(C13176d0.TLS_1_3, C13176d0.TLS_1_2);
        aVar.mo38229a(true);
        aVar.mo38233a();
        C13308a aVar2 = new C13308a(true);
        aVar2.mo38232a(f34409f);
        aVar2.mo38231a(C13176d0.TLS_1_3, C13176d0.TLS_1_2);
        aVar2.mo38229a(true);
        f34410g = aVar2.mo38233a();
        C13308a aVar3 = new C13308a(true);
        aVar3.mo38232a(f34409f);
        aVar3.mo38231a(C13176d0.TLS_1_3, C13176d0.TLS_1_2, C13176d0.TLS_1_1, C13176d0.TLS_1_0);
        aVar3.mo38229a(true);
        f34411h = aVar3.mo38233a();
    }

    C13307l(C13308a aVar) {
        this.f34413a = aVar.f34417a;
        this.f34415c = aVar.f34418b;
        this.f34416d = aVar.f34419c;
        this.f34414b = aVar.f34420d;
    }

    /* renamed from: a */
    public List<C13305j> mo38220a() {
        String[] strArr = this.f34415c;
        if (strArr != null) {
            return C13305j.m35038a(strArr);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo38223b() {
        return this.f34413a;
    }

    /* renamed from: c */
    public boolean mo38224c() {
        return this.f34414b;
    }

    /* renamed from: d */
    public List<C13176d0> mo38225d() {
        String[] strArr = this.f34416d;
        if (strArr != null) {
            return C13176d0.m34451a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13307l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13307l lVar = (C13307l) obj;
        boolean z = this.f34413a;
        if (z != lVar.f34413a) {
            return false;
        }
        return !z || (Arrays.equals(this.f34415c, lVar.f34415c) && Arrays.equals(this.f34416d, lVar.f34416d) && this.f34414b == lVar.f34414b);
    }

    public int hashCode() {
        if (this.f34413a) {
            return ((((527 + Arrays.hashCode(this.f34415c)) * 31) + Arrays.hashCode(this.f34416d)) * 31) + (this.f34414b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f34413a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(cipherSuites=");
        String str = "[all enabled]";
        sb.append(Objects.toString(mo38220a(), str));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(mo38225d(), str));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f34414b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    private C13307l m35043b(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f34415c != null) {
            strArr = C13184e.m34510a(C13305j.f34388b, sSLSocket.getEnabledCipherSuites(), this.f34415c);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f34416d != null) {
            strArr2 = C13184e.m34510a(C13184e.f33863i, sSLSocket.getEnabledProtocols(), this.f34416d);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a = C13184e.m34487a(C13305j.f34388b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a != -1) {
            strArr = C13184e.m34511a(strArr, supportedCipherSuites[a]);
        }
        C13308a aVar = new C13308a(this);
        aVar.mo38230a(strArr);
        aVar.mo38234b(strArr2);
        return aVar.mo38233a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38221a(SSLSocket sSLSocket, boolean z) {
        C13307l b = m35043b(sSLSocket, z);
        String[] strArr = b.f34416d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b.f34415c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: a */
    public boolean mo38222a(SSLSocket sSLSocket) {
        if (!this.f34413a) {
            return false;
        }
        String[] strArr = this.f34416d;
        if (strArr != null && !C13184e.m34515b(C13184e.f33863i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f34415c;
        if (strArr2 == null || C13184e.m34515b(C13305j.f34388b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}

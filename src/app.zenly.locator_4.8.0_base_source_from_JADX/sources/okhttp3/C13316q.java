package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.q */
public final class C13316q {

    /* renamed from: a */
    private final C13176d0 f34456a;

    /* renamed from: b */
    private final C13305j f34457b;

    /* renamed from: c */
    private final List<Certificate> f34458c;

    /* renamed from: d */
    private final List<Certificate> f34459d;

    private C13316q(C13176d0 d0Var, C13305j jVar, List<Certificate> list, List<Certificate> list2) {
        this.f34456a = d0Var;
        this.f34457b = jVar;
        this.f34458c = list;
        this.f34459d = list2;
    }

    /* renamed from: a */
    public static C13316q m35089a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C13305j a = C13305j.m35039a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C13176d0 a2 = C13176d0.m34452a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C13184e.m34498a((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C13184e.m34498a((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C13316q(a2, a, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: b */
    public List<Certificate> mo38254b() {
        return this.f34459d;
    }

    /* renamed from: c */
    public List<Certificate> mo38255c() {
        return this.f34458c;
    }

    /* renamed from: d */
    public C13176d0 mo38256d() {
        return this.f34456a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C13316q)) {
            return false;
        }
        C13316q qVar = (C13316q) obj;
        if (this.f34456a.equals(qVar.f34456a) && this.f34457b.equals(qVar.f34457b) && this.f34458c.equals(qVar.f34458c) && this.f34459d.equals(qVar.f34459d)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.f34456a.hashCode()) * 31) + this.f34457b.hashCode()) * 31) + this.f34458c.hashCode()) * 31) + this.f34459d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f34456a);
        sb.append(" cipherSuite=");
        sb.append(this.f34457b);
        sb.append(" peerCertificates=");
        sb.append(m35088a(this.f34458c));
        sb.append(" localCertificates=");
        sb.append(m35088a(this.f34459d));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C13316q m35090a(C13176d0 d0Var, C13305j jVar, List<Certificate> list, List<Certificate> list2) {
        if (d0Var == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (jVar != null) {
            return new C13316q(d0Var, jVar, C13184e.m34496a(list), C13184e.m34496a(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    /* renamed from: a */
    public C13305j mo38253a() {
        return this.f34457b;
    }

    /* renamed from: a */
    private List<String> m35088a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }
}

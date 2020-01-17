package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.internal.tls.b */
public final class C13291b implements TrustRootIndex {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f34322a = new LinkedHashMap();

    public C13291b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f34322a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f34322a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13291b) || !((C13291b) obj).f34322a.equals(this.f34322a)) {
            z = false;
        }
        return z;
    }

    public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f34322a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public int hashCode() {
        return this.f34322a.hashCode();
    }
}

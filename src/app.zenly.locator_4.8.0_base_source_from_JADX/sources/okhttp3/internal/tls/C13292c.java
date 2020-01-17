package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.p418f0.p420h.C13202e;

/* renamed from: okhttp3.internal.tls.c */
public abstract class C13292c {
    /* renamed from: a */
    public static C13292c m35003a(X509TrustManager x509TrustManager) {
        return C13202e.m34581d().mo37896a(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo37906a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}

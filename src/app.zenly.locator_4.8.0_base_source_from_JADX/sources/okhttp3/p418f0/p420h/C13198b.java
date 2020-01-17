package okhttp3.p418f0.p420h;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C13328w;
import org.conscrypt.Conscrypt;

/* renamed from: okhttp3.f0.h.b */
public class C13198b extends C13202e {
    private C13198b() {
    }

    /* renamed from: f */
    private Provider m34563f() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: a */
    public void mo37900a(SSLSocket sSLSocket, String str, List<C13328w> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C13202e.m34578a(list).toArray(new String[0]));
            return;
        }
        super.mo37900a(sSLSocket, str, list);
    }

    /* renamed from: b */
    public String mo37901b(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo37901b(sSLSocket);
    }

    /* renamed from: c */
    public X509TrustManager mo37905c(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.mo37905c(sSLSocketFactory);
        }
        try {
            Object a = C13202e.m34577a((Object) sSLSocketFactory, Object.class, "sslParameters");
            if (a != null) {
                return (X509TrustManager) C13202e.m34577a(a, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    /* renamed from: b */
    public SSLContext mo37902b() {
        try {
            return SSLContext.getInstance("TLSv1.3", m34563f());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m34563f());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* renamed from: c */
    public static C13198b m34562c() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C13198b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo37914b(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}

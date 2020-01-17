package p389io.fabric.sdk.android.services.network;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: io.fabric.sdk.android.services.network.e */
class C12243e implements X509TrustManager {

    /* renamed from: f */
    private static final X509Certificate[] f31827f = new X509Certificate[0];

    /* renamed from: a */
    private final TrustManager[] f31828a;

    /* renamed from: b */
    private final C12244f f31829b;

    /* renamed from: c */
    private final long f31830c;

    /* renamed from: d */
    private final List<byte[]> f31831d = new LinkedList();

    /* renamed from: e */
    private final Set<X509Certificate> f31832e = Collections.synchronizedSet(new HashSet());

    public C12243e(C12244f fVar, PinningInfoProvider pinningInfoProvider) {
        this.f31828a = m32455a(fVar);
        this.f31829b = fVar;
        this.f31830c = pinningInfoProvider.getPinCreationTimeInMillis();
        for (String a : pinningInfoProvider.getPins()) {
            this.f31831d.add(m32454a(a));
        }
    }

    /* renamed from: a */
    private TrustManager[] m32455a(C12244f fVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(fVar.f31833a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f31832e.contains(x509CertificateArr[0])) {
            m32452a(x509CertificateArr, str);
            m32451a(x509CertificateArr);
            this.f31832e.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f31827f;
    }

    /* renamed from: a */
    private boolean m32453a(X509Certificate x509Certificate) throws CertificateException {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f31831d) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new CertificateException(e);
        }
    }

    /* renamed from: a */
    private void m32452a(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (TrustManager trustManager : this.f31828a) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private void m32451a(X509Certificate[] x509CertificateArr) throws CertificateException {
        if (this.f31830c == -1 || System.currentTimeMillis() - this.f31830c <= 15552000000L) {
            X509Certificate[] a = C12238a.m32445a(x509CertificateArr, this.f31829b);
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m32453a(a[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pins are stale, (");
        sb.append(System.currentTimeMillis() - this.f31830c);
        sb.append(" millis vs ");
        sb.append(15552000000L);
        sb.append(" millis) falling back to system trust.");
        f.mo35967w("Fabric", sb.toString());
    }

    /* renamed from: a */
    private byte[] m32454a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}

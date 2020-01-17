package p389io.fabric.sdk.android.services.network;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: io.fabric.sdk.android.services.network.d */
public final class C12242d {
    /* renamed from: a */
    public static final SSLSocketFactory m32450a(PinningInfoProvider pinningInfoProvider) throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, new TrustManager[]{new C12243e(new C12244f(pinningInfoProvider.getKeyStoreStream(), pinningInfoProvider.getKeyStorePassword()), pinningInfoProvider)}, null);
        return instance.getSocketFactory();
    }
}

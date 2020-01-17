package okhttp3.p418f0.p420h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C13328w;

/* renamed from: okhttp3.f0.h.d */
final class C13201d extends C13202e {

    /* renamed from: c */
    final Method f33911c;

    /* renamed from: d */
    final Method f33912d;

    C13201d(Method method, Method method2) {
        this.f33911c = method;
        this.f33912d = method2;
    }

    /* renamed from: a */
    public void mo37900a(SSLSocket sSLSocket, String str, List<C13328w> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List a = C13202e.m34578a(list);
            this.f33911c.invoke(sSLParameters, new Object[]{a.toArray(new String[a.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    /* renamed from: b */
    public String mo37901b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f33912d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    /* renamed from: c */
    public X509TrustManager mo37905c(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    /* renamed from: c */
    public static C13201d m34573c() {
        try {
            return new C13201d(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}

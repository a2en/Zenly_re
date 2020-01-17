package okhttp3.p418f0.p420h;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C13325v;
import okhttp3.C13328w;
import okhttp3.internal.tls.C13290a;
import okhttp3.internal.tls.C13291b;
import okhttp3.internal.tls.C13292c;
import okhttp3.internal.tls.TrustRootIndex;
import okhttp3.p418f0.C13184e;
import okio.C13342c;

/* renamed from: okhttp3.f0.h.e */
public class C13202e {

    /* renamed from: a */
    private static final C13202e f33913a = m34580c();

    /* renamed from: b */
    private static final Logger f33914b = Logger.getLogger(C13325v.class.getName());

    /* renamed from: b */
    static byte[] m34579b(List<C13328w> list) {
        C13342c cVar = new C13342c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C13328w wVar = (C13328w) list.get(i);
            if (wVar != C13328w.HTTP_1_0) {
                cVar.writeByte(wVar.toString().length());
                cVar.writeUtf8(wVar.toString());
            }
        }
        return cVar.readByteArray();
    }

    /* renamed from: d */
    public static C13202e m34581d() {
        return f33913a;
    }

    /* renamed from: e */
    public static boolean m34582e() {
        if ("conscrypt".equals(C13184e.m34489a("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public String mo37917a() {
        return "OkHttp";
    }

    /* renamed from: a */
    public void mo37899a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo37915a(SSLSocket sSLSocket) {
    }

    /* renamed from: a */
    public void mo37900a(SSLSocket sSLSocket, String str, List<C13328w> list) {
    }

    /* renamed from: b */
    public String mo37901b(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: b */
    public void mo37914b(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: b */
    public boolean mo37904b(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public X509TrustManager mo37905c(SSLSocketFactory sSLSocketFactory) {
        try {
            Object a = m34577a((Object) sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (a == null) {
                return null;
            }
            return (X509TrustManager) m34577a(a, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void mo37897a(int i, String str, Throwable th) {
        f33914b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: c */
    private static C13202e m34580c() {
        C13202e c = C13194a.m34546c();
        if (c != null) {
            return c;
        }
        if (m34582e()) {
            C13198b c2 = C13198b.m34562c();
            if (c2 != null) {
                return c2;
            }
        }
        C13201d c3 = C13201d.m34573c();
        if (c3 != null) {
            return c3;
        }
        C13202e c4 = C13199c.m34569c();
        if (c4 != null) {
            return c4;
        }
        return new C13202e();
    }

    /* renamed from: a */
    public Object mo37895a(String str) {
        if (f33914b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo37898a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        mo37897a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public static List<String> m34578a(List<C13328w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C13328w wVar = (C13328w) list.get(i);
            if (wVar != C13328w.HTTP_1_0) {
                arrayList.add(wVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public SSLContext mo37902b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: b */
    public TrustRootIndex mo37903b(X509TrustManager x509TrustManager) {
        return new C13291b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: a */
    public C13292c mo37896a(X509TrustManager x509TrustManager) {
        return new C13290a(mo37903b(x509TrustManager));
    }

    /* renamed from: a */
    public C13292c mo37918a(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager c = mo37905c(sSLSocketFactory);
        if (c != null) {
            return mo37896a(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to extract the trust manager on ");
        sb.append(m34581d());
        sb.append(", sslSocketFactory is ");
        sb.append(sSLSocketFactory.getClass());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static <T> T m34577a(Object obj, Class<T> cls, String str) {
        Class<Object> cls2 = Object.class;
        Class<Object> cls3 = obj.getClass();
        while (cls3 != cls2) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        String str2 = "delegate";
        if (!str.equals(str2)) {
            Object a = m34577a(obj, cls2, str2);
            if (a != null) {
                return m34577a(a, cls, str);
            }
        }
        return null;
    }
}

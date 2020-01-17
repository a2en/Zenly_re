package okhttp3.p418f0.p420h;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C13328w;
import okhttp3.internal.tls.C13292c;
import okhttp3.internal.tls.TrustRootIndex;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.f0.h.a */
class C13194a extends C13202e {

    /* renamed from: c */
    private final Class<?> f33889c;

    /* renamed from: d */
    private final Class<?> f33890d;

    /* renamed from: e */
    private final Method f33891e;

    /* renamed from: f */
    private final Method f33892f;

    /* renamed from: g */
    private final Method f33893g;

    /* renamed from: h */
    private final Method f33894h;

    /* renamed from: i */
    private final C13196b f33895i = C13196b.m34559a();

    /* renamed from: okhttp3.f0.h.a$a */
    static final class C13195a extends C13292c {

        /* renamed from: a */
        private final Object f33896a;

        /* renamed from: b */
        private final Method f33897b;

        C13195a(Object obj, Method method) {
            this.f33896a = obj;
            this.f33897b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo37906a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f33897b.invoke(this.f33896a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C13195a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: okhttp3.f0.h.a$b */
    static final class C13196b {

        /* renamed from: a */
        private final Method f33898a;

        /* renamed from: b */
        private final Method f33899b;

        /* renamed from: c */
        private final Method f33900c;

        C13196b(Method method, Method method2, Method method3) {
            this.f33898a = method;
            this.f33899b = method2;
            this.f33900c = method3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo37909a(String str) {
            Method method = this.f33898a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f33899b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo37910a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f33900c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: a */
        static C13196b m34559a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C13196b(method3, method, method2);
        }
    }

    /* renamed from: okhttp3.f0.h.a$c */
    static final class C13197c implements TrustRootIndex {

        /* renamed from: a */
        private final X509TrustManager f33901a;

        /* renamed from: b */
        private final Method f33902b;

        C13197c(X509TrustManager x509TrustManager, Method method) {
            this.f33902b = method;
            this.f33901a = x509TrustManager;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C13197c)) {
                return false;
            }
            C13197c cVar = (C13197c) obj;
            if (!this.f33901a.equals(cVar.f33901a) || !this.f33902b.equals(cVar.f33902b)) {
                z = false;
            }
            return z;
        }

        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f33902b.invoke(this.f33901a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return this.f33901a.hashCode() + (this.f33902b.hashCode() * 31);
        }
    }

    C13194a(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f33889c = cls;
        this.f33890d = cls2;
        this.f33891e = method;
        this.f33892f = method2;
        this.f33893g = method3;
        this.f33894h = method4;
    }

    /* renamed from: a */
    public void mo37899a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C13184e.m34506a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (ClassCastException e2) {
            if (VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    /* renamed from: b */
    public String mo37901b(SSLSocket sSLSocket) {
        String str = null;
        if (!this.f33890d.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f33893g.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                str = new String(bArr, StandardCharsets.UTF_8);
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public X509TrustManager mo37905c(SSLSocketFactory sSLSocketFactory) {
        String str = "sslParameters";
        Object a = C13202e.m34577a((Object) sSLSocketFactory, this.f33889c, str);
        if (a == null) {
            try {
                a = C13202e.m34577a((Object) sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), str);
            } catch (ClassNotFoundException unused) {
                return super.mo37905c(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) C13202e.m34577a(a, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) C13202e.m34577a(a, X509TrustManager.class, "trustManager");
    }

    /* renamed from: b */
    public boolean mo37904b(String str) {
        try {
            Class cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m34545b(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo37904b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    /* renamed from: a */
    public void mo37900a(SSLSocket sSLSocket, String str, List<C13328w> list) {
        if (this.f33890d.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f33891e.invoke(sSLSocket, new Object[]{Boolean.valueOf(true)});
                    this.f33892f.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }
            this.f33894h.invoke(sSLSocket, new Object[]{C13202e.m34579b(list)});
        }
    }

    /* renamed from: c */
    public static C13202e m34546c() {
        try {
            Class cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (VERSION.SDK_INT >= 21) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
                    Method method = cls2.getMethod("setHostname", new Class[]{String.class});
                    Method method2 = cls2.getMethod("getAlpnSelectedProtocol", new Class[0]);
                    C13194a aVar = new C13194a(cls, cls2, declaredMethod, method, method2, cls2.getMethod("setAlpnProtocols", new Class[]{byte[].class}));
                    return aVar;
                } catch (NoSuchMethodException unused) {
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected Android API level 21+ but was ");
            sb.append(VERSION.SDK_INT);
            throw new IllegalStateException(sb.toString());
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    private boolean m34545b(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m34544a(str, cls, obj);
        }
    }

    /* renamed from: a */
    public void mo37897a(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(10);
            sb.append(Log.getStackTraceString(th));
            str = sb.toString();
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    /* renamed from: b */
    public TrustRootIndex mo37903b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new C13197c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo37903b(x509TrustManager);
        }
    }

    /* renamed from: a */
    public Object mo37895a(String str) {
        return this.f33895i.mo37909a(str);
    }

    /* renamed from: a */
    public void mo37898a(String str, Object obj) {
        if (!this.f33895i.mo37910a(obj)) {
            mo37897a(5, str, (Throwable) null);
        }
    }

    /* renamed from: b */
    public SSLContext mo37902b() {
        boolean z = true;
        try {
            if (VERSION.SDK_INT < 16 || VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: a */
    private boolean m34544a(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo37904b(str);
        }
    }

    /* renamed from: a */
    public C13292c mo37896a(X509TrustManager x509TrustManager) {
        try {
            Class cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C13195a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.mo37896a(x509TrustManager);
        }
    }
}

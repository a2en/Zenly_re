package okhttp3.p418f0.p420h;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.C13328w;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.f0.h.c */
class C13199c extends C13202e {

    /* renamed from: c */
    private final Method f33903c;

    /* renamed from: d */
    private final Method f33904d;

    /* renamed from: e */
    private final Method f33905e;

    /* renamed from: f */
    private final Class<?> f33906f;

    /* renamed from: g */
    private final Class<?> f33907g;

    /* renamed from: okhttp3.f0.h.c$a */
    private static class C13200a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f33908a;

        /* renamed from: b */
        boolean f33909b;

        /* renamed from: c */
        String f33910c;

        C13200a(List<String> list) {
            this.f33908a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<String> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C13184e.f33856b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.valueOf(true);
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f33909b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f33908a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) list.get(i);
                        if (this.f33908a.contains(str)) {
                            this.f33910c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f33908a.get(0);
                    this.f33910c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f33910c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C13199c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f33903c = method;
        this.f33904d = method2;
        this.f33905e = method3;
        this.f33906f = cls;
        this.f33907g = cls2;
    }

    /* renamed from: c */
    public static C13202e m34569c() {
        String str = "org.eclipse.jetty.alpn.ALPN";
        try {
            Class cls = Class.forName(str, true, null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("$Provider");
            Class cls2 = Class.forName(sb.toString(), true, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$ClientProvider");
            Class cls3 = Class.forName(sb2.toString(), true, null);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$ServerProvider");
            Class cls4 = Class.forName(sb3.toString(), true, null);
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            Method method2 = method;
            C13199c cVar = new C13199c(method2, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
            return cVar;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo37900a(SSLSocket sSLSocket, String str, List<C13328w> list) {
        List a = C13202e.m34578a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C13202e.class.getClassLoader(), new Class[]{this.f33906f, this.f33907g}, new C13200a(a));
            this.f33903c.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    /* renamed from: b */
    public String mo37901b(SSLSocket sSLSocket) {
        try {
            Object[] objArr = {sSLSocket};
            String str = null;
            C13200a aVar = (C13200a) Proxy.getInvocationHandler(this.f33904d.invoke(null, objArr));
            if (aVar.f33909b || aVar.f33910c != null) {
                if (!aVar.f33909b) {
                    str = aVar.f33910c;
                }
                return str;
            }
            C13202e.m34581d().mo37897a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    /* renamed from: a */
    public void mo37915a(SSLSocket sSLSocket) {
        try {
            this.f33905e.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }
}

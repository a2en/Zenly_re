package okhttp3.internal.http;

import com.appsflyer.share.Constants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.C13167a0;
import okhttp3.C13174c0;
import okhttp3.C13319s;
import okhttp3.C13325v;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.C13333z;
import okhttp3.Interceptor;
import okhttp3.internal.connection.C13241j;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.internal.http.i */
public final class C13253i implements Interceptor {

    /* renamed from: a */
    private final C13325v f34139a;

    public C13253i(C13325v vVar) {
        this.f34139a = vVar;
    }

    /* renamed from: a */
    private boolean m34814a(IOException iOException, C13241j jVar, boolean z, C13331y yVar) {
        if (!this.f34139a.mo38354y()) {
            return false;
        }
        if ((!z || !m34815a(iOException, yVar)) && m34816a(iOException, z) && jVar.mo38060b()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        r1.mo38062d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.C13167a0 intercept(okhttp3.Interceptor.Chain r9) throws java.io.IOException {
        /*
            r8 = this;
            okhttp3.y r0 = r9.request()
            okhttp3.internal.http.f r9 = (okhttp3.internal.http.C13250f) r9
            okhttp3.internal.connection.j r1 = r9.mo38073b()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = 0
        L_0x000e:
            r1.mo38059a(r0)
            boolean r6 = r1.mo38064f()
            if (r6 != 0) goto L_0x00bf
            okhttp3.a0 r0 = r9.mo38071a(r0, r1, r3)     // Catch:{ RouteException -> 0x00a6, IOException -> 0x0096 }
            if (r4 == 0) goto L_0x0033
            okhttp3.a0$a r0 = r0.mo37799j()
            okhttp3.a0$a r4 = r4.mo37799j()
            r4.mo37811a(r3)
            okhttp3.a0 r4 = r4.mo37816a()
            r0.mo37821c(r4)
            okhttp3.a0 r0 = r0.mo37816a()
        L_0x0033:
            r4 = r0
            okhttp3.f0.c r0 = okhttp3.p418f0.C13182c.f33853a
            okhttp3.internal.connection.d r0 = r0.mo37866a(r4)
            if (r0 == 0) goto L_0x0045
            okhttp3.internal.connection.f r6 = r0.mo38009b()
            okhttp3.c0 r6 = r6.route()
            goto L_0x0046
        L_0x0045:
            r6 = r3
        L_0x0046:
            okhttp3.y r6 = r8.m34813a(r4, r6)
            if (r6 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
            boolean r9 = r0.mo38014f()
            if (r9 == 0) goto L_0x0057
            r1.mo38067i()
        L_0x0057:
            return r4
        L_0x0058:
            okhttp3.z r7 = r6.mo38382a()
            if (r7 == 0) goto L_0x0065
            boolean r7 = r7.mo38405d()
            if (r7 == 0) goto L_0x0065
            return r4
        L_0x0065:
            okhttp3.b0 r7 = r4.mo37789a()
            okhttp3.p418f0.C13184e.m34503a(r7)
            boolean r7 = r1.mo38063e()
            if (r7 == 0) goto L_0x0075
            r0.mo38011c()
        L_0x0075:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L_0x007d
            r0 = r6
            goto L_0x000e
        L_0x007d:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many follow-up requests: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0094:
            r9 = move-exception
            goto L_0x00bb
        L_0x0096:
            r6 = move-exception
            boolean r7 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0094 }
            if (r7 != 0) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            boolean r7 = r8.m34814a(r6, r1, r7, r0)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x00a5
            goto L_0x00b1
        L_0x00a5:
            throw r6     // Catch:{ all -> 0x0094 }
        L_0x00a6:
            r6 = move-exception
            java.io.IOException r7 = r6.mo37998b()     // Catch:{ all -> 0x0094 }
            boolean r7 = r8.m34814a(r7, r1, r2, r0)     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x00b6
        L_0x00b1:
            r1.mo38062d()
            goto L_0x000e
        L_0x00b6:
            java.io.IOException r9 = r6.mo37996a()     // Catch:{ all -> 0x0094 }
            throw r9     // Catch:{ all -> 0x0094 }
        L_0x00bb:
            r1.mo38062d()
            throw r9
        L_0x00bf:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.C13253i.intercept(okhttp3.Interceptor$Chain):okhttp3.a0");
    }

    /* renamed from: a */
    private boolean m34815a(IOException iOException, C13331y yVar) {
        C13333z a = yVar.mo38382a();
        return (a != null && a.mo38405d()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: a */
    private boolean m34816a(IOException iOException, boolean z) {
        boolean z2 = false;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                z2 = true;
            }
            return z2;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private C13331y m34813a(C13167a0 a0Var, C13174c0 c0Var) throws IOException {
        Proxy proxy;
        if (a0Var != null) {
            int d = a0Var.mo37793d();
            String e = a0Var.mo37803n().mo38387e();
            String str = "GET";
            C13333z zVar = null;
            if (d == 307 || d == 308) {
                if (!e.equals(str) && !e.equals("HEAD")) {
                    return null;
                }
            } else if (d == 401) {
                return this.f34139a.mo38330a().authenticate(c0Var, a0Var);
            } else {
                if (d != 503) {
                    if (d == 407) {
                        if (c0Var != null) {
                            proxy = c0Var.mo37834b();
                        } else {
                            proxy = this.f34139a.mo38350u();
                        }
                        if (proxy.type() == Type.HTTP) {
                            return this.f34139a.mo38351v().authenticate(c0Var, a0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (d != 408) {
                        switch (d) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f34139a.mo38354y()) {
                        return null;
                    } else {
                        C13333z a = a0Var.mo37803n().mo38382a();
                        if (a != null && a.mo38405d()) {
                            return null;
                        }
                        if ((a0Var.mo37800k() == null || a0Var.mo37800k().mo37793d() != 408) && m34812a(a0Var, 0) <= 0) {
                            return a0Var.mo37803n();
                        }
                        return null;
                    }
                } else if ((a0Var.mo37800k() == null || a0Var.mo37800k().mo37793d() != 503) && m34812a(a0Var, Integer.MAX_VALUE) == 0) {
                    return a0Var.mo37803n();
                } else {
                    return null;
                }
            }
            if (!this.f34139a.mo38341l()) {
                return null;
            }
            String a2 = a0Var.mo37787a(Constants.HTTP_REDIRECT_URL_HEADER_FIELD);
            if (a2 == null) {
                return null;
            }
            C13319s c = a0Var.mo37803n().mo38389g().mo38283c(a2);
            if (c == null) {
                return null;
            }
            if (!c.mo38297o().equals(a0Var.mo37803n().mo38389g().mo38297o()) && !this.f34139a.mo38342m()) {
                return null;
            }
            C13332a f = a0Var.mo37803n().mo38388f();
            if (C13249e.m34799b(e)) {
                boolean d2 = C13249e.m34801d(e);
                if (C13249e.m34800c(e)) {
                    f.mo38395a(str, (C13333z) null);
                } else {
                    if (d2) {
                        zVar = a0Var.mo37803n().mo38382a();
                    }
                    f.mo38395a(e, zVar);
                }
                if (!d2) {
                    f.mo38393a("Transfer-Encoding");
                    f.mo38393a("Content-Length");
                    f.mo38393a("Content-Type");
                }
            }
            if (!C13184e.m34508a(a0Var.mo37803n().mo38389g(), c)) {
                f.mo38393a("Authorization");
            }
            f.mo38398a(c);
            return f.mo38400a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private int m34812a(C13167a0 a0Var, int i) {
        String a = a0Var.mo37787a("Retry-After");
        if (a == null) {
            return i;
        }
        if (a.matches("\\d+")) {
            return Integer.valueOf(a).intValue();
        }
        return Integer.MAX_VALUE;
    }
}

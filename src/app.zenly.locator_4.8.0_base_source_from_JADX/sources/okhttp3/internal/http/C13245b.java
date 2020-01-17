package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13331y;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.connection.C13231d;
import okhttp3.p418f0.C13184e;
import okio.BufferedSink;
import okio.C13354l;

/* renamed from: okhttp3.internal.http.b */
public final class C13245b implements Interceptor {

    /* renamed from: a */
    private final boolean f34122a;

    public C13245b(boolean z) {
        this.f34122a = z;
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        boolean z;
        C13167a0 a0Var;
        C13250f fVar = (C13250f) chain;
        C13231d a = fVar.mo38072a();
        C13331y request = fVar.request();
        long currentTimeMillis = System.currentTimeMillis();
        a.mo38008a(request);
        C13168a aVar = null;
        if (!C13249e.m34799b(request.mo38387e()) || request.mo38382a() == null) {
            a.mo38017i();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(request.mo38381a("Expect"))) {
                a.mo38013e();
                a.mo38018j();
                aVar = a.mo38003a(true);
                z = true;
            } else {
                z = false;
            }
            if (aVar != null) {
                a.mo38017i();
                if (!a.mo38009b().mo38036b()) {
                    a.mo38016h();
                }
            } else if (request.mo38382a().mo38404c()) {
                a.mo38013e();
                request.mo38382a().mo32977a(C13354l.m35374a(a.mo38005a(request, true)));
            } else {
                BufferedSink a2 = C13354l.m35374a(a.mo38005a(request, false));
                request.mo38382a().mo32977a(a2);
                a2.close();
            }
        }
        if (request.mo38382a() == null || !request.mo38382a().mo38404c()) {
            a.mo38012d();
        }
        if (!z) {
            a.mo38018j();
        }
        if (aVar == null) {
            aVar = a.mo38003a(false);
        }
        aVar.mo37815a(request);
        aVar.mo37812a(a.mo38009b().handshake());
        aVar.mo37818b(currentTimeMillis);
        aVar.mo37807a(System.currentTimeMillis());
        C13167a0 a3 = aVar.mo37816a();
        int d = a3.mo37793d();
        if (d == 100) {
            C13168a a4 = a.mo38003a(false);
            a4.mo37815a(request);
            a4.mo37812a(a.mo38009b().handshake());
            a4.mo37818b(currentTimeMillis);
            a4.mo37807a(System.currentTimeMillis());
            a3 = a4.mo37816a();
            d = a3.mo37793d();
        }
        a.mo38010b(a3);
        if (!this.f34122a || d != 101) {
            C13168a j = a3.mo37799j();
            j.mo37811a(a.mo38004a(a3));
            a0Var = j.mo37816a();
        } else {
            C13168a j2 = a3.mo37799j();
            j2.mo37811a(C13184e.f33858d);
            a0Var = j2.mo37816a();
        }
        String str = "Connection";
        String str2 = "close";
        if (str2.equalsIgnoreCase(a0Var.mo37803n().mo38381a(str)) || str2.equalsIgnoreCase(a0Var.mo37787a(str))) {
            a.mo38016h();
        }
        if ((d != 204 && d != 205) || a0Var.mo37789a().mo37827d() <= 0) {
            return a0Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(d);
        sb.append(" had non-zero Content-Length: ");
        sb.append(a0Var.mo37789a().mo37827d());
        throw new ProtocolException(sb.toString());
    }
}

package okhttp3.internal.http;

import java.net.Proxy.Type;
import okhttp3.C13319s;
import okhttp3.C13331y;

/* renamed from: okhttp3.internal.http.h */
public final class C13252h {
    /* renamed from: a */
    public static String m34810a(C13331y yVar, Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.mo38387e());
        sb.append(' ');
        if (m34811b(yVar, type)) {
            sb.append(yVar.mo38389g());
        } else {
            sb.append(m34809a(yVar.mo38389g()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m34811b(C13331y yVar, Type type) {
        return !yVar.mo38386d() && type == Type.HTTP;
    }

    /* renamed from: a */
    public static String m34809a(C13319s sVar) {
        String c = sVar.mo38282c();
        String e = sVar.mo38285e();
        if (e == null) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append('?');
        sb.append(e);
        return sb.toString();
    }
}

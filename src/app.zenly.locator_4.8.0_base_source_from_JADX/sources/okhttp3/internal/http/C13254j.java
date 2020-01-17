package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.C13328w;

/* renamed from: okhttp3.internal.http.j */
public final class C13254j {

    /* renamed from: a */
    public final C13328w f34140a;

    /* renamed from: b */
    public final int f34141b;

    /* renamed from: c */
    public final String f34142c;

    public C13254j(C13328w wVar, int i, String str) {
        this.f34140a = wVar;
        this.f34141b = i;
        this.f34142c = str;
    }

    /* renamed from: a */
    public static C13254j m34817a(String str) throws IOException {
        C13328w wVar;
        String str2;
        int i = 9;
        String str3 = "Unexpected status line: ";
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new ProtocolException(sb.toString());
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                wVar = C13328w.HTTP_1_0;
            } else if (charAt == 1) {
                wVar = C13328w.HTTP_1_1;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str);
                throw new ProtocolException(sb2.toString());
            }
        } else if (str.startsWith("ICY ")) {
            wVar = C13328w.HTTP_1_0;
            i = 4;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            throw new ProtocolException(sb3.toString());
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    sb4.append(str);
                    throw new ProtocolException(sb4.toString());
                }
                return new C13254j(wVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(str);
                throw new ProtocolException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str3);
            sb6.append(str);
            throw new ProtocolException(sb6.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34140a == C13328w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f34141b);
        if (this.f34142c != null) {
            sb.append(' ');
            sb.append(this.f34142c);
        }
        return sb.toString();
    }
}

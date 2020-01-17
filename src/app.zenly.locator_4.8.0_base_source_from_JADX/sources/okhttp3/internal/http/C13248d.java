package okhttp3.internal.http;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.C13167a0;
import okhttp3.C13311m;
import okhttp3.C13317r;
import okhttp3.C13317r.C13318a;
import okhttp3.C13319s;
import okhttp3.C13331y;
import okhttp3.CookieJar;
import okhttp3.p418f0.C13184e;
import okio.C13346d;

/* renamed from: okhttp3.internal.http.d */
public final class C13248d {
    static {
        C13346d.m35334d("\"\\");
        C13346d.m35334d("\t ,=");
    }

    /* renamed from: a */
    public static long m34786a(C13167a0 a0Var) {
        return m34787a(a0Var.mo37795f());
    }

    /* renamed from: b */
    public static boolean m34793b(C13317r rVar) {
        return m34794c(rVar).contains("*");
    }

    /* renamed from: c */
    public static boolean m34795c(C13167a0 a0Var) {
        return m34793b(a0Var.mo37795f());
    }

    /* renamed from: d */
    private static Set<String> m34796d(C13167a0 a0Var) {
        return m34794c(a0Var.mo37795f());
    }

    /* renamed from: e */
    public static C13317r m34797e(C13167a0 a0Var) {
        return m34788a(a0Var.mo37798i().mo37803n().mo38385c(), a0Var.mo37795f());
    }

    /* renamed from: a */
    public static long m34787a(C13317r rVar) {
        return m34785a(rVar.mo38261a("Content-Length"));
    }

    /* renamed from: b */
    public static boolean m34792b(C13167a0 a0Var) {
        if (a0Var.mo37803n().mo38387e().equals("HEAD")) {
            return false;
        }
        int d = a0Var.mo37793d();
        if (((d >= 100 && d < 200) || d == 204 || d == 304) && m34786a(a0Var) == -1) {
            if ("chunked".equalsIgnoreCase(a0Var.mo37787a("Transfer-Encoding"))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Set<String> m34794c(C13317r rVar) {
        Set emptySet = Collections.emptySet();
        int c = rVar.mo38266c();
        Set set = emptySet;
        for (int i = 0; i < c; i++) {
            if ("Vary".equalsIgnoreCase(rVar.mo38260a(i))) {
                String b = rVar.mo38263b(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    private static long m34785a(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static boolean m34790a(C13167a0 a0Var, C13317r rVar, C13331y yVar) {
        for (String str : m34796d(a0Var)) {
            if (!Objects.equals(rVar.mo38264b(str), yVar.mo38383b(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C13317r m34788a(C13317r rVar, C13317r rVar2) {
        Set c = m34794c(rVar2);
        if (c.isEmpty()) {
            return C13184e.f33857c;
        }
        C13318a aVar = new C13318a();
        int c2 = rVar.mo38266c();
        for (int i = 0; i < c2; i++) {
            String a = rVar.mo38260a(i);
            if (c.contains(a)) {
                aVar.mo38271a(a, rVar.mo38263b(i));
            }
        }
        return aVar.mo38272a();
    }

    /* renamed from: b */
    public static int m34791b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static void m34789a(CookieJar cookieJar, C13319s sVar, C13317r rVar) {
        if (cookieJar != CookieJar.f33787a) {
            List a = C13311m.m35062a(sVar, rVar);
            if (!a.isEmpty()) {
                cookieJar.saveFromResponse(sVar, a);
            }
        }
    }

    /* renamed from: a */
    public static int m34784a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m34783a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            i = (int) parseLong;
            return i;
        } catch (NumberFormatException unused) {
        }
    }
}

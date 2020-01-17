package okhttp3.internal.http;

/* renamed from: okhttp3.internal.http.e */
public final class C13249e {
    /* renamed from: a */
    public static boolean m34798a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m34799b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: c */
    public static boolean m34800c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m34801d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m34802e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}

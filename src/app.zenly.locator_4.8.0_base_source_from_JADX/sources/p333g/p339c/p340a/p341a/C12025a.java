package p333g.p339c.p340a.p341a;

import com.facebook.common.internal.C9530g;
import java.util.Locale;
import java.util.Map;

/* renamed from: g.c.a.a.a */
public class C12025a {

    /* renamed from: a */
    public static final Map<String, String> f31320a = C9530g.m23259a("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    private static String m31678a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: b */
    public static String m31679b(String str) {
        String a = m31678a(str);
        if (a == null) {
            return null;
        }
        String lowerCase = a.toLowerCase(Locale.US);
        String a2 = C12026b.m31681a(lowerCase);
        if (a2 == null) {
            a2 = (String) f31320a.get(lowerCase);
        }
        return a2;
    }

    /* renamed from: c */
    public static boolean m31680c(String str) {
        return str != null && str.startsWith("video/");
    }
}

package p333g.p339c.p340a.p341a;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.C9530g;
import java.util.Map;

/* renamed from: g.c.a.a.b */
public class C12026b {

    /* renamed from: a */
    private static final MimeTypeMap f31321a = MimeTypeMap.getSingleton();

    /* renamed from: b */
    private static final Map<String, String> f31322b;

    static {
        String str = "heic";
        String str2 = "image/heic";
        String str3 = "heif";
        String str4 = "image/heif";
        C9530g.m23259a(str4, str3, str2, str);
        f31322b = C9530g.m23259a(str3, str4, str, str2);
    }

    /* renamed from: a */
    public static String m31681a(String str) {
        String str2 = (String) f31322b.get(str);
        if (str2 != null) {
            return str2;
        }
        return f31321a.getMimeTypeFromExtension(str);
    }
}

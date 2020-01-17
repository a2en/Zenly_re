package com.zendesk.util;

import com.android.volley.toolbox.C8733j;
import java.util.Locale;

/* renamed from: com.zendesk.util.c */
public class C12013c {
    /* renamed from: a */
    public static String m31645a(Long l) {
        return m31646a(l, true);
    }

    /* renamed from: a */
    public static String m31646a(Long l, boolean z) {
        String str = "";
        if (l == null || l.longValue() < 0) {
            return str;
        }
        int i = z ? C8733j.DEFAULT_IMAGE_TIMEOUT_MS : 1024;
        if (l.longValue() < ((long) i)) {
            StringBuilder sb = new StringBuilder();
            sb.append(l);
            sb.append(" B");
            return sb.toString();
        }
        double d = (double) i;
        int log = (int) (Math.log((double) l.longValue()) / Math.log(d));
        StringBuilder sb2 = new StringBuilder();
        sb2.append((z ? "kMGTPE" : "KMGTPE").charAt(log - 1));
        if (!z) {
            str = "i";
        }
        sb2.append(str);
        return String.format(Locale.US, "%.1f %sB", new Object[]{Double.valueOf(((double) l.longValue()) / Math.pow(d, (double) log)), sb2.toString()});
    }
}

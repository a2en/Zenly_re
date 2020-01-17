package com.mapbox.mapboxsdk.http;

/* renamed from: com.mapbox.mapboxsdk.http.c */
public class C11466c {
    /* renamed from: a */
    public static String m29604a(String str, String str2, int i) {
        String str3;
        if (!m29605a(str)) {
            return str2;
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("?");
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("&");
            str3 = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append("events=true");
        return sb3.toString();
    }

    /* renamed from: a */
    private static boolean m29605a(String str) {
        return str.equals("mapbox.com") || str.endsWith(".mapbox.com") || str.equals("mapbox.cn") || str.endsWith(".mapbox.cn");
    }
}

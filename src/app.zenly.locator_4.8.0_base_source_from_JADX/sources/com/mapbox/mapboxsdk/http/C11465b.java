package com.mapbox.mapboxsdk.http;

import com.mapbox.mapboxsdk.log.Logger;

/* renamed from: com.mapbox.mapboxsdk.http.b */
public class C11465b {

    /* renamed from: a */
    public static boolean f29648a = false;

    /* renamed from: b */
    public static boolean f29649b = true;

    /* renamed from: a */
    public static void m29603a(int i, String str, String str2) {
        int i2 = i == 1 ? 3 : i == 0 ? 4 : 5;
        Object[] objArr = new Object[3];
        String str3 = i == 1 ? "temporary" : i == 0 ? "connection" : "permanent";
        objArr[0] = str3;
        objArr[1] = str;
        if (!f29648a) {
            str2 = "";
        }
        objArr[2] = str2;
        m29602a(i2, String.format("Request failed due to a %s error: %s %s", objArr));
    }

    /* renamed from: a */
    public static void m29602a(int i, String str) {
        if (f29649b) {
            Logger.log(i, "Mbgl-HttpRequest", str);
        }
    }
}

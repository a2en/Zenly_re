package com.mapbox.mapboxsdk.p320n.p321a;

import okio.C13342c;

/* renamed from: com.mapbox.mapboxsdk.n.a.b */
public class C11579b {
    /* renamed from: a */
    static String m30309a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                C13342c cVar = new C13342c();
                cVar.writeUtf8(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    cVar.writeUtf8CodePoint((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i += Character.charCount(codePointAt2);
                }
                return cVar.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }
}

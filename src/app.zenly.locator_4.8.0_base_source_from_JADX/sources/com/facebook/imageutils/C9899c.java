package com.facebook.imageutils;

import com.facebook.common.internal.C9536j;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.c */
public class C9899c {
    /* renamed from: a */
    public static int m24738a(int i) {
        return C9901e.m24744a(i);
    }

    /* renamed from: b */
    private static int m24741b(InputStream inputStream) throws IOException {
        if (m24740a(inputStream, 225)) {
            int a = C9900d.m24743a(inputStream, 2, false) - 2;
            if (a > 6) {
                int a2 = C9900d.m24743a(inputStream, 4, false);
                int i = a - 4;
                int a3 = C9900d.m24743a(inputStream, 2, false);
                int i2 = i - 2;
                if (a2 == 1165519206 && a3 == 0) {
                    return i2;
                }
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m24742b(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static int m24739a(InputStream inputStream) {
        try {
            int b = m24741b(inputStream);
            if (b == 0) {
                return 0;
            }
            return C9901e.m24745a(inputStream, b);
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m24740a(InputStream inputStream, int i) throws IOException {
        C9536j.m23271a(inputStream);
        while (C9900d.m24743a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = C9900d.m24743a(inputStream, 1, false);
            }
            if ((i != 192 || !m24742b(i2)) && i2 != i) {
                if (!(i2 == 216 || i2 == 1)) {
                    if (i2 == 217 || i2 == 218) {
                        break;
                    }
                    inputStream.skip((long) (C9900d.m24743a(inputStream, 2, false) - 2));
                }
            } else {
                return true;
            }
        }
        return false;
    }
}

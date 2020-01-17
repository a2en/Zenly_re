package com.facebook.imageutils;

import com.facebook.common.logging.C9543a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.e */
class C9901e {

    /* renamed from: a */
    private static final Class<?> f26008a = C9901e.class;

    /* renamed from: com.facebook.imageutils.e$b */
    private static class C9903b {

        /* renamed from: a */
        boolean f26009a;

        /* renamed from: b */
        int f26010b;

        /* renamed from: c */
        int f26011c;

        private C9903b() {
        }
    }

    C9901e() {
    }

    /* renamed from: a */
    public static int m24744a(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: a */
    public static int m24745a(InputStream inputStream, int i) throws IOException {
        C9903b bVar = new C9903b();
        int a = m24746a(inputStream, i, bVar);
        int i2 = bVar.f26011c - 8;
        if (a == 0 || i2 > a) {
            return 0;
        }
        inputStream.skip((long) i2);
        return m24747a(inputStream, m24748a(inputStream, a - i2, bVar.f26009a, 274), bVar.f26009a);
    }

    /* renamed from: a */
    private static int m24746a(InputStream inputStream, int i, C9903b bVar) throws IOException {
        if (i <= 8) {
            return 0;
        }
        bVar.f26010b = C9900d.m24743a(inputStream, 4, false);
        int i2 = i - 4;
        int i3 = bVar.f26010b;
        if (i3 == 1229531648 || i3 == 1296891946) {
            bVar.f26009a = bVar.f26010b == 1229531648;
            bVar.f26011c = C9900d.m24743a(inputStream, 4, bVar.f26009a);
            int i4 = i2 - 4;
            int i5 = bVar.f26011c;
            if (i5 >= 8 && i5 - 8 <= i4) {
                return i4;
            }
            C9543a.m23300a(f26008a, "Invalid offset");
            return 0;
        }
        C9543a.m23300a(f26008a, "Invalid TIFF header");
        return 0;
    }

    /* renamed from: a */
    private static int m24748a(InputStream inputStream, int i, boolean z, int i2) throws IOException {
        if (i < 14) {
            return 0;
        }
        int a = C9900d.m24743a(inputStream, 2, z);
        int i3 = i - 2;
        while (true) {
            int i4 = a - 1;
            if (a <= 0 || i3 < 12) {
                return 0;
            }
            int i5 = i3 - 2;
            if (C9900d.m24743a(inputStream, 2, z) == i2) {
                return i5;
            }
            inputStream.skip(10);
            i3 = i5 - 10;
            a = i4;
        }
        return 0;
    }

    /* renamed from: a */
    private static int m24747a(InputStream inputStream, int i, boolean z) throws IOException {
        if (i < 10 || C9900d.m24743a(inputStream, 2, z) != 3 || C9900d.m24743a(inputStream, 4, z) != 1) {
            return 0;
        }
        int a = C9900d.m24743a(inputStream, 2, z);
        C9900d.m24743a(inputStream, 2, z);
        return a;
    }
}

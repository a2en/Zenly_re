package com.facebook.imageformat;

import com.facebook.common.internal.C9531h;
import com.facebook.common.internal.C9536j;
import com.facebook.common.webp.C9560a;
import com.facebook.imageformat.ImageFormat.FormatChecker;

/* renamed from: com.facebook.imageformat.a */
public class C9649a implements FormatChecker {

    /* renamed from: b */
    private static final byte[] f25184b = {-1, -40, -1};

    /* renamed from: c */
    private static final int f25185c = f25184b.length;

    /* renamed from: d */
    private static final byte[] f25186d = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: e */
    private static final int f25187e = f25186d.length;

    /* renamed from: f */
    private static final byte[] f25188f = C9652d.m23729a("GIF87a");

    /* renamed from: g */
    private static final byte[] f25189g = C9652d.m23729a("GIF89a");

    /* renamed from: h */
    private static final byte[] f25190h = C9652d.m23729a("BM");

    /* renamed from: i */
    private static final int f25191i = f25190h.length;

    /* renamed from: j */
    private static final byte[] f25192j = {0, 0, 1, 0};

    /* renamed from: k */
    private static final int f25193k = f25192j.length;

    /* renamed from: l */
    private static final String[] f25194l = {"heic", "heix", "hevc", "hevx", "mif1", "msf1"};

    /* renamed from: m */
    private static final int f25195m;

    /* renamed from: a */
    final int f25196a = C9531h.m23260a(21, 20, f25185c, f25187e, 6, f25191i, f25193k, f25195m);

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("ftyp");
        sb.append(f25194l[0]);
        f25195m = C9652d.m23729a(sb.toString()).length;
    }

    /* renamed from: a */
    private static ImageFormat m23712a(byte[] bArr, int i) {
        C9536j.m23275a(C9560a.m23403b(bArr, 0, i));
        if (C9560a.m23405d(bArr, 0)) {
            return C9650b.f25202f;
        }
        if (C9560a.m23404c(bArr, 0)) {
            return C9650b.f25203g;
        }
        if (!C9560a.m23398a(bArr, 0, i)) {
            return ImageFormat.f25182b;
        }
        if (C9560a.m23397a(bArr, 0)) {
            return C9650b.f25206j;
        }
        if (C9560a.m23402b(bArr, 0)) {
            return C9650b.f25205i;
        }
        return C9650b.f25204h;
    }

    /* renamed from: b */
    private static boolean m23713b(byte[] bArr, int i) {
        byte[] bArr2 = f25190h;
        if (i < bArr2.length) {
            return false;
        }
        return C9652d.m23728a(bArr, bArr2);
    }

    /* renamed from: c */
    private static boolean m23714c(byte[] bArr, int i) {
        boolean z = false;
        if (i < 6) {
            return false;
        }
        if (C9652d.m23728a(bArr, f25188f) || C9652d.m23728a(bArr, f25189g)) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    private static boolean m23715d(byte[] bArr, int i) {
        String[] strArr;
        if (i < f25195m || bArr[3] < 8) {
            return false;
        }
        for (String str : f25194l) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder();
            sb.append("ftyp");
            sb.append(str);
            if (C9652d.m23727a(bArr, length, C9652d.m23729a(sb.toString()), f25195m) > -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m23716e(byte[] bArr, int i) {
        byte[] bArr2 = f25192j;
        if (i < bArr2.length) {
            return false;
        }
        return C9652d.m23728a(bArr, bArr2);
    }

    /* renamed from: f */
    private static boolean m23717f(byte[] bArr, int i) {
        byte[] bArr2 = f25184b;
        return i >= bArr2.length && C9652d.m23728a(bArr, bArr2);
    }

    /* renamed from: g */
    private static boolean m23718g(byte[] bArr, int i) {
        byte[] bArr2 = f25186d;
        return i >= bArr2.length && C9652d.m23728a(bArr, bArr2);
    }

    public final ImageFormat determineFormat(byte[] bArr, int i) {
        C9536j.m23271a(bArr);
        if (C9560a.m23403b(bArr, 0, i)) {
            return m23712a(bArr, i);
        }
        if (m23717f(bArr, i)) {
            return C9650b.f25197a;
        }
        if (m23718g(bArr, i)) {
            return C9650b.f25198b;
        }
        if (m23714c(bArr, i)) {
            return C9650b.f25199c;
        }
        if (m23713b(bArr, i)) {
            return C9650b.f25200d;
        }
        if (m23716e(bArr, i)) {
            return C9650b.f25201e;
        }
        if (m23715d(bArr, i)) {
            return C9650b.f25207k;
        }
        return ImageFormat.f25182b;
    }

    public int getHeaderSize() {
        return this.f25196a;
    }
}

package com.facebook.common.webp;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: com.facebook.common.webp.a */
public class C9560a {

    /* renamed from: a */
    public static final boolean f24760a = (VERSION.SDK_INT <= 17);

    /* renamed from: b */
    public static final boolean f24761b = m23396a();

    /* renamed from: c */
    public static WebpBitmapFactory f24762c = null;

    /* renamed from: d */
    private static boolean f24763d = false;

    /* renamed from: e */
    private static final byte[] f24764e = m23400a("RIFF");

    /* renamed from: f */
    private static final byte[] f24765f = m23400a("WEBP");

    /* renamed from: g */
    private static final byte[] f24766g = m23400a("VP8 ");

    /* renamed from: h */
    private static final byte[] f24767h = m23400a("VP8L");

    /* renamed from: i */
    private static final byte[] f24768i = m23400a("VP8X");

    static {
        int i = VERSION.SDK_INT;
    }

    /* renamed from: a */
    private static byte[] m23400a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static WebpBitmapFactory m23401b() {
        if (f24763d) {
            return f24762c;
        }
        WebpBitmapFactory webpBitmapFactory = null;
        try {
            webpBitmapFactory = (WebpBitmapFactory) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f24763d = true;
        return webpBitmapFactory;
    }

    /* renamed from: c */
    public static boolean m23404c(byte[] bArr, int i) {
        return m23399a(bArr, i + 12, f24767h);
    }

    /* renamed from: d */
    public static boolean m23405d(byte[] bArr, int i) {
        return m23399a(bArr, i + 12, f24766g);
    }

    /* renamed from: a */
    private static boolean m23396a() {
        int i = VERSION.SDK_INT;
        if (i < 17) {
            return false;
        }
        if (i == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (!(options.outHeight == 1 && options.outWidth == 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m23402b(byte[] bArr, int i) {
        return m23399a(bArr, i + 12, f24768i) && ((bArr[i + 20] & 16) == 16);
    }

    /* renamed from: b */
    public static boolean m23403b(byte[] bArr, int i, int i2) {
        return i2 >= 20 && m23399a(bArr, i, f24764e) && m23399a(bArr, i + 8, f24765f);
    }

    /* renamed from: a */
    public static boolean m23397a(byte[] bArr, int i) {
        return m23399a(bArr, i + 12, f24768i) && ((bArr[i + 20] & 2) == 2);
    }

    /* renamed from: a */
    public static boolean m23398a(byte[] bArr, int i, int i2) {
        return i2 >= 21 && m23399a(bArr, i + 12, f24768i);
    }

    /* renamed from: a */
    private static boolean m23399a(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}

package com.bumptech.glide.p301o;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import com.bumptech.glide.load.model.Model;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.o.k */
public final class C9217k {

    /* renamed from: a */
    private static final char[] f23887a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f23888b = new char[64];

    /* renamed from: com.bumptech.glide.o.k$a */
    static /* synthetic */ class C9218a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23889a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23889a = r0
                int[] r0 = f23889a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f23889a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23889a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f23889a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f23889a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p301o.C9217k.C9218a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m22090a(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: a */
    public static String m22096a(byte[] bArr) {
        String a;
        synchronized (f23888b) {
            a = m22097a(bArr, f23888b);
        }
        return a;
    }

    /* renamed from: b */
    public static boolean m22104b(int i, int i2) {
        return m22107c(i) && m22107c(i2);
    }

    /* renamed from: c */
    public static boolean m22106c() {
        return !m22108d();
    }

    /* renamed from: c */
    private static boolean m22107c(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: d */
    public static boolean m22108d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static void m22103b() {
        if (!m22108d()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    private static String m22097a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f23887a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static boolean m22105b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m22102b(int i) {
        return m22090a(i, 17);
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m22093a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        sb.append("[");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append("] ");
        sb.append(bitmap.getConfig());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static int m22091a(int i, int i2, Config config) {
        return i * i2 * m22092a(config);
    }

    /* renamed from: a */
    private static int m22092a(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        int i = C9218a.f23889a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: a */
    public static void m22100a() {
        if (!m22106c()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: a */
    public static <T> Queue<T> m22099a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static <T> List<T> m22098a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m22101a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof Model) {
            return ((Model) obj).isEquivalentTo(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: a */
    public static int m22088a(float f) {
        return m22089a(f, 17);
    }

    /* renamed from: a */
    public static int m22089a(float f, int i) {
        return m22090a(Float.floatToIntBits(f), i);
    }

    /* renamed from: a */
    public static int m22094a(Object obj, int i) {
        return m22090a(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: a */
    public static int m22095a(boolean z, int i) {
        return m22090a(z ? 1 : 0, i);
    }
}

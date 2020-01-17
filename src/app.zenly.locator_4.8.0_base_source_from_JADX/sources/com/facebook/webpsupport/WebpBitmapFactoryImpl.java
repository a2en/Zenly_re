package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.TypedValue;
import com.facebook.common.internal.C9527d;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.common.webp.C9560a;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpBitmapFactory.WebpErrorLogger;
import com.facebook.imagepipeline.nativecode.C9777e;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;

@C9527d
public class WebpBitmapFactoryImpl implements WebpBitmapFactory {

    /* renamed from: a */
    public static final boolean f26068a = (VERSION.SDK_INT >= 11);

    /* renamed from: b */
    private static WebpErrorLogger f26069b;

    /* renamed from: c */
    private static BitmapCreator f26070c;

    /* renamed from: a */
    private static InputStream m24844a(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, 20) : inputStream;
    }

    /* renamed from: b */
    private static void m24848b(Bitmap bitmap, Options options) {
        m24845a(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    @C9527d
    private static Bitmap createBitmap(int i, int i2, Options options) {
        if (f26068a && options != null) {
            Bitmap bitmap = options.inBitmap;
            if (bitmap != null && bitmap.isMutable()) {
                return options.inBitmap;
            }
        }
        return f26070c.createNakedBitmap(i, i2, Config.ARGB_8888);
    }

    @C9527d
    private static byte[] getInTempStorageFromOptions(Options options) {
        if (options != null) {
            byte[] bArr = options.inTempStorage;
            if (bArr != null) {
                return bArr;
            }
        }
        return new byte[8192];
    }

    @C9527d
    private static float getScaleFromOptions(Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f : ((float) i3) / ((float) i2);
    }

    @C9527d
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, Options options) {
        Bitmap bitmap;
        C9777e.m24274a();
        if (!C9560a.f24760a || !C9560a.m23403b(bArr, i, i2)) {
            bitmap = originalDecodeByteArray(bArr, i, i2, options);
            if (bitmap == null) {
                m24846a("webp_direct_decode_array_failed_on_no_webp");
            }
        } else {
            bitmap = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmap == null) {
                m24846a("webp_direct_decode_array");
            }
            m24848b(bitmap, options);
        }
        return bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        throw r3;
     */
    @com.facebook.common.internal.C9527d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeFile(java.lang.String r2, android.graphics.BitmapFactory.Options r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001a }
            android.graphics.Bitmap r0 = hookDecodeStream(r1, r0, r3)     // Catch:{ all -> 0x000e }
            r1.close()     // Catch:{ Exception -> 0x001a }
            goto L_0x001a
        L_0x000e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0015 }
            goto L_0x0019
        L_0x0015:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ Exception -> 0x001a }
        L_0x0019:
            throw r3     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @C9527d
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options) {
        Bitmap bitmap;
        C9777e.m24274a();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream a = m24844a((InputStream) new FileInputStream(fileDescriptor));
            try {
                byte[] a2 = m24847a(a, options);
                if (!C9560a.f24760a || !C9560a.m23403b(a2, 0, 20)) {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    bitmap = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                    if (bitmap == null) {
                        m24846a("webp_direct_decode_fd_failed_on_no_webp");
                    }
                } else {
                    bitmap = nativeDecodeStream(a, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    if (bitmap == null) {
                        m24846a("webp_direct_decode_fd");
                    }
                    setPaddingDefaultValues(rect);
                    m24848b(bitmap, options);
                }
                try {
                    a.close();
                    return bitmap;
                } catch (Throwable unused) {
                    return bitmap;
                }
            } catch (Throwable unused2) {
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r3 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        throw r0;
     */
    @com.facebook.common.internal.C9527d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeResource(android.content.res.Resources r2, int r3, android.graphics.BitmapFactory.Options r4) {
        /*
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1 = 0
            java.io.InputStream r3 = r2.openRawResource(r3, r0)     // Catch:{ Exception -> 0x0022 }
            android.graphics.Bitmap r1 = hookDecodeResourceStream(r2, r0, r3, r1, r4)     // Catch:{ all -> 0x0014 }
            if (r3 == 0) goto L_0x0023
            r3.close()     // Catch:{ Exception -> 0x0022 }
            goto L_0x0023
        L_0x0014:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            if (r3 == 0) goto L_0x0021
            r3.close()     // Catch:{ all -> 0x001d }
            goto L_0x0021
        L_0x001d:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ Exception -> 0x0022 }
        L_0x0021:
            throw r0     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
        L_0x0023:
            boolean r2 = f26068a
            if (r2 == 0) goto L_0x0038
            if (r1 != 0) goto L_0x0038
            if (r4 == 0) goto L_0x0038
            android.graphics.Bitmap r2 = r4.inBitmap
            if (r2 != 0) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Problem decoding into existing bitmap"
            r2.<init>(r3)
            throw r2
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @C9527d
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, Options options) {
        if (options == null) {
            options = new Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @C9527d
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, Options options) {
        Bitmap bitmap;
        C9777e.m24274a();
        InputStream a = m24844a(inputStream);
        byte[] a2 = m24847a(a, options);
        if (!C9560a.f24760a || !C9560a.m23403b(a2, 0, 20)) {
            bitmap = originalDecodeStream(a, rect, options);
            if (bitmap == null) {
                m24846a("webp_direct_decode_stream_failed_on_no_webp");
            }
        } else {
            bitmap = nativeDecodeStream(a, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmap == null) {
                m24846a("webp_direct_decode_stream");
            }
            m24848b(bitmap, options);
            setPaddingDefaultValues(rect);
        }
        return bitmap;
    }

    @C9527d
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, Options options, float f, byte[] bArr2);

    @C9527d
    private static native Bitmap nativeDecodeStream(InputStream inputStream, Options options, float f, byte[] bArr);

    @C9527d
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @C9527d
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @C9527d
    private static Bitmap originalDecodeFile(String str, Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @C9527d
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @C9527d
    private static Bitmap originalDecodeResource(Resources resources, int i, Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @C9527d
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @C9527d
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @C9527d
    private static void setBitmapSize(Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @C9527d
    private static boolean setOutDimensions(Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @C9527d
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @C9527d
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(Options options) {
        if (VERSION.SDK_INT < 19 || options == null) {
            return true;
        }
        return options.inPremultiplied;
    }

    public Bitmap decodeByteArray(byte[] bArr, int i, int i2, Options options) {
        return hookDecodeByteArray(bArr, i, i2, options);
    }

    public Bitmap decodeFile(String str, Options options) {
        return hookDecodeFile(str, options);
    }

    public Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    public Bitmap decodeStream(InputStream inputStream, Rect rect, Options options) {
        return hookDecodeStream(inputStream, rect, options);
    }

    public void setBitmapCreator(BitmapCreator bitmapCreator) {
        f26070c = bitmapCreator;
    }

    public void setWebpErrorLogger(WebpErrorLogger webpErrorLogger) {
        f26069b = webpErrorLogger;
    }

    @C9527d
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @C9527d
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @C9527d
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @C9527d
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @C9527d
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r3.length >= 20) goto L_0x0011;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m24847a(java.io.InputStream r2, android.graphics.BitmapFactory.Options r3) {
        /*
            r0 = 20
            r2.mark(r0)
            if (r3 == 0) goto L_0x000f
            byte[] r3 = r3.inTempStorage
            if (r3 == 0) goto L_0x000f
            int r1 = r3.length
            if (r1 < r0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            byte[] r3 = new byte[r0]
        L_0x0011:
            r1 = 0
            r2.read(r3, r1, r0)     // Catch:{ IOException -> 0x0019 }
            r2.reset()     // Catch:{ IOException -> 0x0019 }
            return r3
        L_0x0019:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.m24847a(java.io.InputStream, android.graphics.BitmapFactory$Options):byte[]");
    }

    @C9527d
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    /* renamed from: a */
    private static void m24845a(Bitmap bitmap, Options options) {
        if (!(bitmap == null || options == null)) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (!(i2 == 0 || i == i2 || i == options.inScreenDensity || !options.inScaled)) {
                    bitmap.setDensity(i2);
                }
            } else if (f26068a && options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    @C9527d
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @C9527d
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @C9527d
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    /* renamed from: a */
    private static void m24846a(String str) {
        WebpErrorLogger webpErrorLogger = f26069b;
        if (webpErrorLogger != null) {
            webpErrorLogger.onWebpErrorLog(str, "decoding_failure");
        }
    }

    @C9527d
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }
}

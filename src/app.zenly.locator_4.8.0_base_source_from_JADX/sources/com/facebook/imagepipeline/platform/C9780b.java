package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.core.util.C0606h;
import com.facebook.common.internal.C9536j;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.memory.BitmapPool;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p333g.p339c.p340a.p343c.C12029a;
import p333g.p339c.p340a.p343c.C12030b;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.platform.b */
public abstract class C9780b implements PlatformDecoder {

    /* renamed from: d */
    private static final Class<?> f25687d = C9780b.class;

    /* renamed from: e */
    private static final byte[] f25688e = {-1, -39};

    /* renamed from: a */
    private final BitmapPool f25689a;

    /* renamed from: b */
    private final PreverificationHelper f25690b;

    /* renamed from: c */
    final C0606h<ByteBuffer> f25691c;

    public C9780b(BitmapPool bitmapPool, int i, C0606h hVar) {
        this.f25690b = VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f25689a = bitmapPool;
        this.f25691c = hVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f25691c.release(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        com.facebook.common.logging.C9543a.m23306a(f25687d, "Could not decode region %s, decoding full bitmap instead.", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        if (r0 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        r10 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x00f7 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0086 A[SYNTHETIC, Splitter:B:37:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2 A[Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce, all -> 0x00cc, IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce, all -> 0x00cc, IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fe  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.common.references.CloseableReference<android.graphics.Bitmap> m24278a(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, android.graphics.Rect r11, android.graphics.ColorSpace r12) {
        /*
            r8 = this;
            com.facebook.common.internal.C9536j.m23271a(r9)
            int r0 = r10.outWidth
            int r1 = r10.outHeight
            if (r11 == 0) goto L_0x0017
            int r0 = r11.width()
            int r1 = r10.inSampleSize
            int r0 = r0 / r1
            int r1 = r11.height()
            int r2 = r10.inSampleSize
            int r1 = r1 / r2
        L_0x0017:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L_0x002d
            com.facebook.imagepipeline.platform.PreverificationHelper r2 = r8.f25690b
            if (r2 == 0) goto L_0x002d
            android.graphics.Bitmap$Config r6 = r10.inPreferredConfig
            boolean r2 = r2.shouldUseHardwareBitmapConfig(r6)
            if (r2 == 0) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            r6 = 0
            if (r11 != 0) goto L_0x0037
            if (r2 == 0) goto L_0x0037
            r10.inMutable = r5
            r2 = r6
            goto L_0x004d
        L_0x0037:
            if (r11 == 0) goto L_0x003f
            if (r2 == 0) goto L_0x003f
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r10.inPreferredConfig = r2
        L_0x003f:
            int r2 = r8.mo26573a(r0, r1, r10)
            com.facebook.imagepipeline.memory.BitmapPool r7 = r8.f25689a
            java.lang.Object r2 = r7.get(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x00fe
        L_0x004d:
            r10.inBitmap = r2
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L_0x005d
            if (r12 != 0) goto L_0x005b
            android.graphics.ColorSpace$Named r12 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r12 = android.graphics.ColorSpace.get(r12)
        L_0x005b:
            r10.inPreferredColorSpace = r12
        L_0x005d:
            androidx.core.util.h<java.nio.ByteBuffer> r12 = r8.f25691c
            java.lang.Object r12 = r12.acquire()
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12
            if (r12 != 0) goto L_0x006d
            r12 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)
        L_0x006d:
            byte[] r3 = r12.array()     // Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce }
            r10.inTempStorage = r3     // Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce }
            if (r11 == 0) goto L_0x00a6
            if (r2 == 0) goto L_0x00a6
            android.graphics.Bitmap$Config r3 = r10.inPreferredConfig     // Catch:{ IOException -> 0x008d, all -> 0x008a }
            r2.reconfigure(r0, r1, r3)     // Catch:{ IOException -> 0x008d, all -> 0x008a }
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r9, r4)     // Catch:{ IOException -> 0x008d, all -> 0x008a }
            android.graphics.Bitmap r11 = r0.decodeRegion(r11, r10)     // Catch:{ IOException -> 0x008e }
            if (r0 == 0) goto L_0x00a7
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce }
            goto L_0x00a7
        L_0x008a:
            r10 = move-exception
            r0 = r6
            goto L_0x00a0
        L_0x008d:
            r0 = r6
        L_0x008e:
            java.lang.Class<?> r1 = f25687d     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x009f }
            r4[r5] = r11     // Catch:{ all -> 0x009f }
            com.facebook.common.logging.C9543a.m23306a(r1, r3, r4)     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x00a6
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce }
            goto L_0x00a6
        L_0x009f:
            r10 = move-exception
        L_0x00a0:
            if (r0 == 0) goto L_0x00a5
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce }
        L_0x00a5:
            throw r10     // Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce }
        L_0x00a6:
            r11 = r6
        L_0x00a7:
            if (r11 != 0) goto L_0x00ad
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r9, r6, r10)     // Catch:{ IllegalArgumentException -> 0x00d7, RuntimeException -> 0x00ce }
        L_0x00ad:
            androidx.core.util.h<java.nio.ByteBuffer> r9 = r8.f25691c
            r9.release(r12)
            if (r2 == 0) goto L_0x00c5
            if (r2 != r11) goto L_0x00b7
            goto L_0x00c5
        L_0x00b7:
            com.facebook.imagepipeline.memory.BitmapPool r9 = r8.f25689a
            r9.release(r2)
            r11.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x00c5:
            com.facebook.imagepipeline.memory.BitmapPool r9 = r8.f25689a
            com.facebook.common.references.CloseableReference r9 = com.facebook.common.references.CloseableReference.m23351a(r11, r9)
            return r9
        L_0x00cc:
            r9 = move-exception
            goto L_0x00f8
        L_0x00ce:
            r9 = move-exception
            if (r2 == 0) goto L_0x00d6
            com.facebook.imagepipeline.memory.BitmapPool r10 = r8.f25689a     // Catch:{ all -> 0x00cc }
            r10.release(r2)     // Catch:{ all -> 0x00cc }
        L_0x00d6:
            throw r9     // Catch:{ all -> 0x00cc }
        L_0x00d7:
            r10 = move-exception
            if (r2 == 0) goto L_0x00df
            com.facebook.imagepipeline.memory.BitmapPool r11 = r8.f25689a     // Catch:{ all -> 0x00cc }
            r11.release(r2)     // Catch:{ all -> 0x00cc }
        L_0x00df:
            r9.reset()     // Catch:{ IOException -> 0x00f7 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch:{ IOException -> 0x00f7 }
            if (r9 == 0) goto L_0x00f6
            g.c.d.b.h r11 = p333g.p339c.p352d.p355b.C12060h.m31854a()     // Catch:{ IOException -> 0x00f7 }
            com.facebook.common.references.CloseableReference r9 = com.facebook.common.references.CloseableReference.m23351a(r9, r11)     // Catch:{ IOException -> 0x00f7 }
            androidx.core.util.h<java.nio.ByteBuffer> r10 = r8.f25691c
            r10.release(r12)
            return r9
        L_0x00f6:
            throw r10     // Catch:{ IOException -> 0x00f7 }
        L_0x00f7:
            throw r10     // Catch:{ all -> 0x00cc }
        L_0x00f8:
            androidx.core.util.h<java.nio.ByteBuffer> r10 = r8.f25691c
            r10.release(r12)
            throw r9
        L_0x00fe:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "BitmapPool.get returned null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.C9780b.m24278a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):com.facebook.common.references.CloseableReference");
    }

    /* renamed from: a */
    public abstract int mo26573a(int i, int i2, Options options);

    public CloseableReference<Bitmap> decodeFromEncodedImage(C9732e eVar, Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(eVar, config, rect, null);
    }

    public CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(C9732e eVar, Config config, Rect rect, ColorSpace colorSpace) {
        Options a = m24277a(eVar, config);
        boolean z = a.inPreferredConfig != Config.ARGB_8888;
        try {
            return m24278a(eVar.mo26434h(), a, rect, colorSpace);
        } catch (RuntimeException e) {
            if (z) {
                return decodeFromEncodedImageWithColorSpace(eVar, Config.ARGB_8888, rect, colorSpace);
            }
            throw e;
        }
    }

    public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(C9732e eVar, Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i, null);
    }

    public CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C9732e eVar, Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean b = eVar.mo26422b(i);
        Options a = m24277a(eVar, config);
        InputStream h = eVar.mo26434h();
        C9536j.m23271a(h);
        if (eVar.mo26437k() > i) {
            h = new C12029a(h, i);
        }
        InputStream bVar = !b ? new C12030b(h, f25688e) : h;
        boolean z = a.inPreferredConfig != Config.ARGB_8888;
        try {
            return m24278a(bVar, a, rect, colorSpace);
        } catch (RuntimeException e) {
            if (z) {
                return decodeJPEGFromEncodedImageWithColorSpace(eVar, Config.ARGB_8888, rect, i, colorSpace);
            }
            throw e;
        }
    }

    /* renamed from: a */
    private static Options m24277a(C9732e eVar, Config config) {
        Options options = new Options();
        options.inSampleSize = eVar.mo26436j();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVar.mo26434h(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }
}

package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.graphics.Rect;
import android.os.Build.VERSION;
import com.facebook.common.internal.C9527d;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.C9542m;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.memory.C9737a;
import com.facebook.imagepipeline.memory.C9742b;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imageutils.C9896a;
import com.facebook.soloader.C9911d;
import java.util.Locale;

@C9527d
public abstract class DalvikPurgeableDecoder implements PlatformDecoder {

    /* renamed from: b */
    protected static final byte[] f25677b = {-1, -39};

    /* renamed from: a */
    private final C9737a f25678a = C9742b.m24167a();

    @C9911d
    private static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        /* renamed from: a */
        static void m24267a(Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        C9773a.m24270a();
    }

    protected DalvikPurgeableDecoder() {
    }

    /* renamed from: a */
    public static Options m24262a(int i, Config config) {
        Options options = new Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @C9527d
    private static native void nativePinBitmap(Bitmap bitmap);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo26557a(CloseableReference<PooledByteBuffer> closeableReference, int i, Options options);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo26558a(CloseableReference<PooledByteBuffer> closeableReference, Options options);

    public CloseableReference<Bitmap> decodeFromEncodedImage(C9732e eVar, Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(eVar, config, rect, null);
    }

    public CloseableReference<Bitmap> decodeFromEncodedImageWithColorSpace(C9732e eVar, Config config, Rect rect, ColorSpace colorSpace) {
        Options a = m24262a(eVar.mo26436j(), config);
        if (VERSION.SDK_INT >= 26) {
            OreoUtils.m24267a(a, colorSpace);
        }
        CloseableReference b = eVar.mo26421b();
        C9536j.m23271a(b);
        try {
            return mo26559a(mo26558a(b, a));
        } finally {
            CloseableReference.m23355b(b);
        }
    }

    public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(C9732e eVar, Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(eVar, config, rect, i, null);
    }

    public CloseableReference<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C9732e eVar, Config config, Rect rect, int i, ColorSpace colorSpace) {
        Options a = m24262a(eVar.mo26436j(), config);
        if (VERSION.SDK_INT >= 26) {
            OreoUtils.m24267a(a, colorSpace);
        }
        CloseableReference b = eVar.mo26421b();
        C9536j.m23271a(b);
        try {
            return mo26559a(mo26557a(b, i, a));
        } finally {
            CloseableReference.m23355b(b);
        }
    }

    /* renamed from: a */
    public static boolean m24263a(CloseableReference<PooledByteBuffer> closeableReference, int i) {
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) closeableReference.mo25724b();
        if (i >= 2 && pooledByteBuffer.read(i - 2) == -1 && pooledByteBuffer.read(i - 1) == -39) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public CloseableReference<Bitmap> mo26559a(Bitmap bitmap) {
        C9536j.m23271a(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f25678a.mo26493b(bitmap)) {
                return CloseableReference.m23351a(bitmap, this.f25678a.mo26495d());
            }
            int a = C9896a.m24733a(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(a), Integer.valueOf(this.f25678a.mo26490a()), Long.valueOf(this.f25678a.mo26496e()), Integer.valueOf(this.f25678a.mo26492b()), Integer.valueOf(this.f25678a.mo26494c())}));
        } catch (Exception e) {
            bitmap.recycle();
            C9542m.m23285a(e);
            throw null;
        }
    }
}

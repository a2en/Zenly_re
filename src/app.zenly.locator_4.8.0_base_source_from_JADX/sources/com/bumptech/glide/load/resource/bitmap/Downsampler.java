package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C8883b;
import com.bumptech.glide.load.C8885d;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.C9012g;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C9121m.C9128g;
import com.bumptech.glide.p301o.C9212f;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class Downsampler {

    /* renamed from: f */
    public static final Option<C8883b> f23655f = Option.m21321a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C8883b.f23177g);

    /* renamed from: g */
    public static final Option<C9012g> f23656g = Option.m21321a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", C9012g.SRGB);

    /* renamed from: h */
    public static final Option<Boolean> f23657h;

    /* renamed from: i */
    public static final Option<Boolean> f23658i;

    /* renamed from: j */
    private static final Set<String> f23659j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k */
    private static final DecodeCallbacks f23660k = new C9097a();

    /* renamed from: l */
    private static final Set<ImageType> f23661l = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));

    /* renamed from: m */
    private static final Queue<Options> f23662m = C9217k.m22099a(0);

    /* renamed from: a */
    private final BitmapPool f23663a;

    /* renamed from: b */
    private final DisplayMetrics f23664b;

    /* renamed from: c */
    private final ArrayPool f23665c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f23666d;

    /* renamed from: e */
    private final C9134r f23667e = C9134r.m21867a();

    public interface DecodeCallbacks {
        void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException;

        void onObtainBounds();
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.Downsampler$a */
    class C9097a implements DecodeCallbacks {
        C9097a() {
        }

        public void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) {
        }

        public void onObtainBounds() {
        }
    }

    static {
        Option<C9121m> option = C9121m.f23701f;
        Boolean valueOf = Boolean.valueOf(false);
        f23657h = Option.m21321a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", valueOf);
        f23658i = Option.m21321a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", valueOf);
    }

    public Downsampler(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, BitmapPool bitmapPool, ArrayPool arrayPool) {
        this.f23666d = list;
        C9216j.m22083a(displayMetrics);
        this.f23664b = displayMetrics;
        C9216j.m22083a(bitmapPool);
        this.f23663a = bitmapPool;
        C9216j.m22083a(arrayPool);
        this.f23665c = arrayPool;
    }

    /* renamed from: a */
    private static boolean m21785a(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: b */
    private static int m21787b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: c */
    private static int m21790c(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: c */
    private static void m21791c(Options options) {
        m21792d(options);
        synchronized (f23662m) {
            f23662m.offer(options);
        }
    }

    /* renamed from: d */
    private static void m21792d(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: a */
    public Resource<Bitmap> mo24611a(InputStream inputStream, int i, int i2, C9011f fVar) throws IOException {
        return mo24612a(inputStream, i, i2, fVar, f23660k);
    }

    /* renamed from: a */
    public boolean mo24613a(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public boolean mo24614a(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: b */
    private static int[] m21789b(InputStream inputStream, Options options, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool) throws IOException {
        options.inJustDecodeBounds = true;
        m21775a(inputStream, options, decodeCallbacks, bitmapPool);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    public Resource<Bitmap> mo24612a(InputStream inputStream, int i, int i2, C9011f fVar, DecodeCallbacks decodeCallbacks) throws IOException {
        C9011f fVar2 = fVar;
        C9216j.m22087a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f23665c.get(65536, byte[].class);
        Options a = m21777a();
        a.inTempStorage = bArr;
        try {
            return C9109e.m21814a(m21776a(inputStream, a, (C9121m) fVar2.mo24517a(C9121m.f23701f), (C8883b) fVar2.mo24517a(f23655f), (C9012g) fVar2.mo24517a(f23656g), fVar2.mo24517a(f23658i) != null && ((Boolean) fVar2.mo24517a(f23658i)).booleanValue(), i, i2, ((Boolean) fVar2.mo24517a(f23657h)).booleanValue(), decodeCallbacks), this.f23663a);
        } finally {
            m21791c(a);
            this.f23665c.put(bArr);
        }
    }

    /* renamed from: b */
    private static boolean m21788b(Options options) {
        int i = options.inTargetDensity;
        if (i > 0) {
            int i2 = options.inDensity;
            if (i2 > 0 && i != i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private Bitmap m21776a(InputStream inputStream, Options options, C9121m mVar, C8883b bVar, C9012g gVar, boolean z, int i, int i2, boolean z2, DecodeCallbacks decodeCallbacks) throws IOException {
        int i3;
        int i4;
        Downsampler downsampler;
        int i5;
        int i6;
        int i7;
        InputStream inputStream2 = inputStream;
        Options options2 = options;
        DecodeCallbacks decodeCallbacks2 = decodeCallbacks;
        long a = C9212f.m22072a();
        int[] b = m21789b(inputStream2, options2, decodeCallbacks2, this.f23663a);
        boolean z3 = false;
        int i8 = b[0];
        int i9 = b[1];
        String str = options2.outMimeType;
        boolean z4 = (i8 == -1 || i9 == -1) ? false : z;
        int a2 = C8885d.m21327a(this.f23666d, inputStream2, this.f23665c);
        int a3 = C9143y.m21883a(a2);
        boolean b2 = C9143y.m21897b(a2);
        int i10 = i;
        if (i10 == Integer.MIN_VALUE) {
            i4 = i2;
            i3 = m21785a(a3) ? i9 : i8;
        } else {
            i4 = i2;
            i3 = i10;
        }
        int i11 = i4 == Integer.MIN_VALUE ? m21785a(a3) ? i8 : i9 : i4;
        ImageType b3 = C8885d.m21329b(this.f23666d, inputStream2, this.f23665c);
        BitmapPool bitmapPool = this.f23663a;
        ImageType imageType = b3;
        m21783a(b3, inputStream, decodeCallbacks, bitmapPool, mVar, a3, i8, i9, i3, i11, options);
        int i12 = a2;
        String str2 = str;
        int i13 = i9;
        int i14 = i8;
        DecodeCallbacks decodeCallbacks3 = decodeCallbacks2;
        Options options3 = options2;
        m21784a(inputStream, bVar, z4, b2, options, i3, i11);
        boolean z5 = VERSION.SDK_INT >= 19;
        String str3 = "Downsampler";
        if (options3.inSampleSize == 1 || z5) {
            downsampler = this;
            if (downsampler.m21786a(imageType)) {
                if (i14 < 0 || i13 < 0 || !z2 || !z5) {
                    float f = m21788b(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                    int i15 = options3.inSampleSize;
                    float f2 = (float) i15;
                    int ceil = (int) Math.ceil((double) (((float) i14) / f2));
                    int ceil2 = (int) Math.ceil((double) (((float) i13) / f2));
                    i7 = Math.round(((float) ceil) * f);
                    i6 = Math.round(((float) ceil2) * f);
                    if (Log.isLoggable(str3, 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calculated target [");
                        sb.append(i7);
                        String str4 = "x";
                        sb.append(str4);
                        sb.append(i6);
                        sb.append("] for source [");
                        sb.append(i14);
                        sb.append(str4);
                        sb.append(i13);
                        sb.append("], sampleSize: ");
                        sb.append(i15);
                        sb.append(", targetDensity: ");
                        sb.append(options3.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(options3.inDensity);
                        sb.append(", density multiplier: ");
                        sb.append(f);
                        Log.v(str3, sb.toString());
                    }
                } else {
                    i7 = i3;
                    i6 = i11;
                }
                if (i7 > 0 && i6 > 0) {
                    m21782a(options3, downsampler.f23663a, i7, i6);
                }
            }
        } else {
            downsampler = this;
        }
        int i16 = VERSION.SDK_INT;
        if (i16 >= 28) {
            if (gVar == C9012g.DISPLAY_P3) {
                ColorSpace colorSpace = options3.outColorSpace;
                if (colorSpace != null && colorSpace.isWideGamut()) {
                    z3 = true;
                }
            }
            options3.inPreferredColorSpace = ColorSpace.get(z3 ? Named.DISPLAY_P3 : Named.SRGB);
        } else if (i16 >= 26) {
            options3.inPreferredColorSpace = ColorSpace.get(Named.SRGB);
        }
        Bitmap a4 = m21775a(inputStream, options3, decodeCallbacks3, downsampler.f23663a);
        decodeCallbacks3.onDecodeComplete(downsampler.f23663a, a4);
        if (Log.isLoggable(str3, 2)) {
            i5 = i12;
            m21781a(i14, i13, str2, options, a4, i, i2, a);
        } else {
            i5 = i12;
        }
        Bitmap bitmap = null;
        if (a4 != null) {
            a4.setDensity(downsampler.f23664b.densityDpi);
            bitmap = C9143y.m21886a(downsampler.f23663a, a4, i5);
            if (!a4.equals(bitmap)) {
                downsampler.f23663a.put(a4);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static void m21783a(ImageType imageType, InputStream inputStream, DecodeCallbacks decodeCallbacks, BitmapPool bitmapPool, C9121m mVar, int i, int i2, int i3, int i4, int i5, Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double d;
        ImageType imageType2 = imageType;
        C9121m mVar2 = mVar;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        Options options2 = options;
        String str = "]";
        String str2 = "Downsampler";
        String str3 = "x";
        if (i12 <= 0 || i13 <= 0) {
            String str4 = str3;
            if (Log.isLoggable(str2, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType2);
                sb.append(" with target [");
                sb.append(i14);
                sb.append(str4);
                sb.append(i15);
                sb.append(str);
                Log.d(str2, sb.toString());
            }
            return;
        }
        if (m21785a(i)) {
            i6 = i12;
            i7 = i13;
        } else {
            i7 = i12;
            i6 = i13;
        }
        float b = mVar2.mo24639b(i7, i6, i14, i15);
        if (b > 0.0f) {
            C9128g a = mVar2.mo24638a(i7, i6, i14, i15);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int c = i7 / m21790c((double) (b * f));
                int c2 = i6 / m21790c((double) (b * f2));
                if (a == C9128g.MEMORY) {
                    i8 = Math.max(c, c2);
                } else {
                    i8 = Math.min(c, c2);
                }
                String str5 = str3;
                if (VERSION.SDK_INT > 23 || !f23659j.contains(options2.outMimeType)) {
                    i9 = Math.max(1, Integer.highestOneBit(i8));
                    if (a == C9128g.MEMORY && ((float) i9) < 1.0f / b) {
                        i9 <<= 1;
                    }
                } else {
                    i9 = 1;
                }
                options2.inSampleSize = i9;
                if (imageType2 == ImageType.JPEG) {
                    float min = (float) Math.min(i9, 8);
                    i10 = (int) Math.ceil((double) (f / min));
                    i11 = (int) Math.ceil((double) (f2 / min));
                    int i16 = i9 / 8;
                    if (i16 > 0) {
                        i10 /= i16;
                        i11 /= i16;
                    }
                } else {
                    if (imageType2 == ImageType.PNG || imageType2 == ImageType.PNG_A) {
                        float f3 = (float) i9;
                        i10 = (int) Math.floor((double) (f / f3));
                        d = Math.floor((double) (f2 / f3));
                    } else if (imageType2 == ImageType.WEBP || imageType2 == ImageType.WEBP_A) {
                        if (VERSION.SDK_INT >= 24) {
                            float f4 = (float) i9;
                            i10 = Math.round(f / f4);
                            i11 = Math.round(f2 / f4);
                        } else {
                            float f5 = (float) i9;
                            i10 = (int) Math.floor((double) (f / f5));
                            d = Math.floor((double) (f2 / f5));
                        }
                    } else if (i7 % i9 == 0 && i6 % i9 == 0) {
                        i10 = i7 / i9;
                        i11 = i6 / i9;
                    } else {
                        int[] b2 = m21789b(inputStream, options2, decodeCallbacks, bitmapPool);
                        i10 = b2[0];
                        i11 = b2[1];
                    }
                    i11 = (int) d;
                }
                double b3 = (double) mVar2.mo24639b(i10, i11, i14, i15);
                if (VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = m21774a(b3);
                    options2.inDensity = m21787b(b3);
                }
                if (m21788b(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable(str2, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i2);
                    String str6 = str5;
                    sb2.append(str6);
                    sb2.append(i3);
                    sb2.append("], degreesToRotate: ");
                    sb2.append(i);
                    sb2.append(", target: [");
                    sb2.append(i14);
                    sb2.append(str6);
                    sb2.append(i15);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i10);
                    sb2.append(str6);
                    sb2.append(i11);
                    sb2.append("], exact scale factor: ");
                    sb2.append(b);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i9);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(b3);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    Log.v(str2, sb2.toString());
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i17 = i13;
        String str7 = str3;
        int i18 = i12;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Cannot scale with factor: ");
        sb3.append(b);
        sb3.append(" from: ");
        sb3.append(mVar2);
        sb3.append(", source: [");
        sb3.append(i18);
        sb3.append(str7);
        sb3.append(i17);
        sb3.append("], target: [");
        sb3.append(i14);
        sb3.append(str7);
        sb3.append(i15);
        sb3.append(str);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: a */
    private static int m21774a(double d) {
        int b = m21787b(d);
        int c = m21790c(((double) b) * d);
        return m21790c((d / ((double) (((float) c) / ((float) b)))) * ((double) c));
    }

    /* renamed from: a */
    private boolean m21786a(ImageType imageType) {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return f23661l.contains(imageType);
    }

    /* renamed from: a */
    private void m21784a(InputStream inputStream, C8883b bVar, boolean z, boolean z2, Options options, int i, int i2) {
        if (!this.f23667e.mo24641a(i, i2, options, z, z2)) {
            if (bVar == C8883b.PREFER_ARGB_8888 || VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = C8885d.m21329b(this.f23666d, inputStream, this.f23665c).hasAlpha();
            } catch (IOException e) {
                String str = "Downsampler";
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb.append(bVar);
                    Log.d(str, sb.toString(), e);
                }
            }
            options.inPreferredConfig = z3 ? Config.ARGB_8888 : Config.RGB_565;
            if (options.inPreferredConfig == Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m21775a(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks r8, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto L_0x000c
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto L_0x000f
        L_0x000c:
            r8.onObtainBounds()
        L_0x000f:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.C9143y.m21889a()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r4, r7)     // Catch:{ IllegalArgumentException -> 0x0032 }
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.resource.bitmap.C9143y.m21889a()
            r9.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L_0x002f
            r6.reset()
        L_0x002f:
            return r8
        L_0x0030:
            r6 = move-exception
            goto L_0x005f
        L_0x0032:
            r5 = move-exception
            java.io.IOException r1 = m21778a(r5, r1, r2, r3, r7)     // Catch:{ all -> 0x0030 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x0043:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x005e
            r6.reset()     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ IOException -> 0x005d }
            r9.put(r0)     // Catch:{ IOException -> 0x005d }
            r7.inBitmap = r4     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r6 = m21775a(r6, r7, r8, r9)     // Catch:{ IOException -> 0x005d }
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.resource.bitmap.C9143y.m21889a()
            r7.unlock()
            return r6
        L_0x005d:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005e:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005f:
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.resource.bitmap.C9143y.m21889a()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.Downsampler.m21775a(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.Downsampler$DecodeCallbacks, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static void m21781a(int i, int i2, String str, Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m21779a(bitmap));
        sb.append(" from [");
        sb.append(i);
        String str2 = "x";
        sb.append(str2);
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m21780a(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append(str2);
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(C9212f.m22071a(j));
        Log.v("Downsampler", sb.toString());
    }

    /* renamed from: a */
    private static String m21780a(Options options) {
        return m21779a(options.inBitmap);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static String m21779a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 19) {
            StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(bitmap.getAllocationByteCount());
            sb.append(")");
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    private static IOException m21778a(IllegalArgumentException illegalArgumentException, int i, int i2, String str, Options options) {
        StringBuilder sb = new StringBuilder();
        sb.append("Exception decoding bitmap, outWidth: ");
        sb.append(i);
        sb.append(", outHeight: ");
        sb.append(i2);
        sb.append(", outMimeType: ");
        sb.append(str);
        sb.append(", inBitmap: ");
        sb.append(m21780a(options));
        return new IOException(sb.toString(), illegalArgumentException);
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m21782a(Options options, BitmapPool bitmapPool, int i, int i2) {
        Config config;
        if (VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = bitmapPool.getDirty(i, i2, config);
    }

    /* renamed from: a */
    private static synchronized Options m21777a() {
        Options options;
        synchronized (Downsampler.class) {
            synchronized (f23662m) {
                options = (Options) f23662m.poll();
            }
            if (options == null) {
                options = new Options();
                m21792d(options);
            }
        }
        return options;
    }
}

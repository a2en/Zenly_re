package com.theartofdev.edmodo.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import com.theartofdev.edmodo.cropper.CropImageView.C11926e;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import p214e.p241j.p242a.C7634a;

/* renamed from: com.theartofdev.edmodo.cropper.c */
final class C11934c {

    /* renamed from: a */
    static final Rect f31072a = new Rect();

    /* renamed from: b */
    static final RectF f31073b = new RectF();

    /* renamed from: c */
    static final RectF f31074c = new RectF();

    /* renamed from: d */
    static final float[] f31075d = new float[6];

    /* renamed from: e */
    static final float[] f31076e = new float[6];

    /* renamed from: f */
    private static int f31077f;

    /* renamed from: g */
    static Pair<String, WeakReference<Bitmap>> f31078g;

    /* renamed from: com.theartofdev.edmodo.cropper.c$a */
    static final class C11935a {

        /* renamed from: a */
        public final Bitmap f31079a;

        /* renamed from: b */
        final int f31080b;

        C11935a(Bitmap bitmap, int i) {
            this.f31079a = bitmap;
            this.f31080b = i;
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.c$b */
    static final class C11936b {

        /* renamed from: a */
        public final Bitmap f31081a;

        /* renamed from: b */
        final int f31082b;

        C11936b(Bitmap bitmap, int i) {
            this.f31081a = bitmap;
            this.f31082b = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.theartofdev.edmodo.cropper.C11934c.C11936b m31376a(android.graphics.Bitmap r1, android.content.Context r2, android.net.Uri r3) {
        /*
            r0 = 0
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x0016 }
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch:{ Exception -> 0x0016 }
            if (r2 == 0) goto L_0x0016
            e.j.a.a r3 = new e.j.a.a     // Catch:{ Exception -> 0x0016 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0016 }
            r2.close()     // Catch:{ Exception -> 0x0014 }
            goto L_0x0017
        L_0x0014:
            goto L_0x0017
        L_0x0016:
            r3 = r0
        L_0x0017:
            if (r3 == 0) goto L_0x001e
            com.theartofdev.edmodo.cropper.c$b r1 = m31377a(r1, r3)
            goto L_0x0025
        L_0x001e:
            com.theartofdev.edmodo.cropper.c$b r2 = new com.theartofdev.edmodo.cropper.c$b
            r3 = 0
            r2.<init>(r1, r3)
            r1 = r2
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11934c.m31376a(android.graphics.Bitmap, android.content.Context, android.net.Uri):com.theartofdev.edmodo.cropper.c$b");
    }

    /* renamed from: b */
    static float m31381b(float[] fArr) {
        return (m31385f(fArr) + m31384e(fArr)) / 2.0f;
    }

    /* renamed from: c */
    static float m31382c(float[] fArr) {
        return (m31358a(fArr) + m31386g(fArr)) / 2.0f;
    }

    /* renamed from: d */
    static float m31383d(float[] fArr) {
        return m31358a(fArr) - m31386g(fArr);
    }

    /* renamed from: e */
    static float m31384e(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: f */
    static float m31385f(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: g */
    static float m31386g(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: h */
    static float m31387h(float[] fArr) {
        return m31385f(fArr) - m31384e(fArr);
    }

    /* renamed from: a */
    static C11936b m31377a(Bitmap bitmap, C7634a aVar) {
        int a = aVar.mo19750a("Orientation", 1);
        int i = a != 3 ? a != 6 ? a != 8 ? 0 : 270 : 90 : 180;
        return new C11936b(bitmap, i);
    }

    /* renamed from: a */
    static C11935a m31370a(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Options a = m31367a(contentResolver, uri);
            if (a.outWidth == -1) {
                if (a.outHeight == -1) {
                    throw new RuntimeException("File is not a picture");
                }
            }
            a.inSampleSize = Math.max(m31361a(a.outWidth, a.outHeight, i, i2), m31360a(a.outWidth, a.outHeight));
            return new C11935a(m31362a(contentResolver, uri, a), a.inSampleSize);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to load sampled bitmap: ");
            sb.append(uri);
            sb.append("\r\n");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    static C11935a m31375a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new C11935a(m31365a(bitmap, fArr, i, z, i2, i3, 1.0f / ((float) i4), z2, z3), i4);
            } catch (OutOfMemoryError e) {
                i4 *= 2;
                if (i4 > 8) {
                    throw e;
                }
            }
        } while (i4 > 8);
        throw e;
    }

    /* renamed from: a */
    private static Bitmap m31365a(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f, boolean z2, boolean z3) {
        Bitmap bitmap2 = bitmap;
        int i4 = i;
        float f2 = f;
        Rect a = m31368a(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i4, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        float f3 = z2 ? -f2 : f2;
        if (z3) {
            f2 = -f2;
        }
        matrix.postScale(f3, f2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, a.left, a.top, a.width(), a.height(), matrix, true);
        if (createBitmap == bitmap2) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i4 % 90 != 0 ? m31366a(createBitmap, fArr, a, i, z, i2, i3) : createBitmap;
    }

    /* renamed from: a */
    static C11935a m31372a(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        OutOfMemoryError outOfMemoryError;
        int i8 = 1;
        do {
            try {
                return m31373a(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e) {
                outOfMemoryError = e;
                i8 *= 2;
                if (i8 > 16) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to handle OOM by sampling (");
                    sb.append(i8);
                    sb.append("): ");
                    sb.append(uri);
                    sb.append("\r\n");
                    sb.append(outOfMemoryError.getMessage());
                    throw new RuntimeException(sb.toString(), outOfMemoryError);
                }
            }
        } while (i8 > 16);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to handle OOM by sampling (");
        sb2.append(i8);
        sb2.append("): ");
        sb2.append(uri);
        sb2.append("\r\n");
        sb2.append(outOfMemoryError.getMessage());
        throw new RuntimeException(sb2.toString(), outOfMemoryError);
    }

    /* renamed from: a */
    static float m31358a(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: a */
    static Rect m31368a(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, m31384e(fArr))), Math.round(Math.max(0.0f, m31386g(fArr))), Math.round(Math.min((float) i, m31385f(fArr))), Math.round(Math.min((float) i2, m31358a(fArr))));
        if (z) {
            m31379a(rect, i3, i4);
        }
        return rect;
    }

    /* renamed from: a */
    private static void m31379a(Rect rect, int i, int i2) {
        if (i == i2 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    /* renamed from: a */
    static Uri m31369a(Context context, Bitmap bitmap, Uri uri) {
        boolean z = true;
        if (uri == null) {
            try {
                uri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
            } catch (Exception e) {
                Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
                return null;
            }
        } else if (new File(uri.getPath()).exists()) {
            z = false;
        }
        if (z) {
            m31378a(context, bitmap, uri, CompressFormat.JPEG, 95);
        }
        return uri;
    }

    /* renamed from: a */
    static void m31378a(Context context, Bitmap bitmap, Uri uri, CompressFormat compressFormat, int i) throws FileNotFoundException {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i, outputStream);
        } finally {
            m31380a((Closeable) outputStream);
        }
    }

    /* renamed from: a */
    static Bitmap m31363a(Bitmap bitmap, int i, int i2, C11926e eVar) {
        if (i > 0 && i2 > 0) {
            try {
                if (eVar == C11926e.RESIZE_FIT || eVar == C11926e.RESIZE_INSIDE || eVar == C11926e.RESIZE_EXACT) {
                    Bitmap bitmap2 = null;
                    if (eVar == C11926e.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = (float) bitmap.getWidth();
                        float height = (float) bitmap.getHeight();
                        float max = Math.max(width / ((float) i), height / ((float) i2));
                        if (max > 1.0f || eVar == C11926e.RESIZE_FIT) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception e) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.theartofdev.edmodo.cropper.C11934c.C11935a m31373a(android.content.Context r14, android.net.Uri r15, float[] r16, int r17, int r18, int r19, boolean r20, int r21, int r22, int r23, int r24, boolean r25, boolean r26, int r27) {
        /*
            r0 = r17
            r1 = r16
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            android.graphics.Rect r9 = m31368a(r1, r2, r3, r4, r5, r6)
            if (r23 <= 0) goto L_0x0017
            r10 = r23
            goto L_0x001c
        L_0x0017:
            int r1 = r9.width()
            r10 = r1
        L_0x001c:
            if (r24 <= 0) goto L_0x0021
            r11 = r24
            goto L_0x0026
        L_0x0021:
            int r1 = r9.height()
            r11 = r1
        L_0x0026:
            r1 = 0
            r8 = 1
            r2 = r14
            r3 = r15
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r27
            com.theartofdev.edmodo.cropper.c$a r2 = m31371a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0038 }
            android.graphics.Bitmap r1 = r2.f31079a     // Catch:{ Exception -> 0x0038 }
            int r8 = r2.f31080b     // Catch:{ Exception -> 0x0038 }
            goto L_0x0039
        L_0x0038:
        L_0x0039:
            if (r1 == 0) goto L_0x0067
            r12 = r25
            r13 = r26
            android.graphics.Bitmap r10 = m31364a(r1, r0, r12, r13)     // Catch:{ OutOfMemoryError -> 0x005f }
            int r1 = r0 % 90
            if (r1 == 0) goto L_0x0057
            r1 = r10
            r2 = r16
            r3 = r9
            r4 = r17
            r5 = r20
            r6 = r21
            r7 = r22
            android.graphics.Bitmap r10 = m31366a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x005d }
        L_0x0057:
            com.theartofdev.edmodo.cropper.c$a r0 = new com.theartofdev.edmodo.cropper.c$a
            r0.<init>(r10, r8)
            return r0
        L_0x005d:
            r0 = move-exception
            goto L_0x0061
        L_0x005f:
            r0 = move-exception
            r10 = r1
        L_0x0061:
            if (r10 == 0) goto L_0x0066
            r10.recycle()
        L_0x0066:
            throw r0
        L_0x0067:
            r12 = r25
            r13 = r26
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r27
            com.theartofdev.edmodo.cropper.c$a r0 = m31374a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11934c.m31373a(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* renamed from: a */
    private static C11935a m31374a(Context context, Uri uri, float[] fArr, int i, boolean z, int i2, int i3, int i4, Rect rect, int i5, int i6, boolean z2, boolean z3) {
        Bitmap a;
        Uri uri2 = uri;
        float[] fArr2 = fArr;
        Bitmap bitmap = null;
        try {
            Options options = new Options();
            int a2 = m31361a(rect.width(), rect.height(), i5, i6) * i4;
            options.inSampleSize = a2;
            a = m31362a(context.getContentResolver(), uri2, options);
            if (a != null) {
                float[] fArr3 = new float[fArr2.length];
                System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
                for (int i7 = 0; i7 < fArr3.length; i7++) {
                    fArr3[i7] = fArr3[i7] / ((float) options.inSampleSize);
                }
                bitmap = m31365a(a, fArr3, i, z, i2, i3, 1.0f, z2, z3);
                if (bitmap != a) {
                    a.recycle();
                }
            }
            return new C11935a(bitmap, a2);
        } catch (OutOfMemoryError e) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw e;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to load sampled bitmap: ");
            sb.append(uri2);
            sb.append("\r\n");
            sb.append(e2.getMessage());
            throw new RuntimeException(sb.toString(), e2);
        } catch (Throwable th) {
            if (a != null) {
                a.recycle();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static Options m31367a(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, f31072a, options);
                options.inJustDecodeBounds = false;
                m31380a((Closeable) inputStream);
                return options;
            } catch (Throwable th) {
                th = th;
                m31380a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m31380a((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        m31380a((java.io.Closeable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r4.inSampleSize *= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        m31380a((java.io.Closeable) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m31362a(android.content.ContentResolver r2, android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /*
        L_0x0000:
            r0 = 0
            java.io.InputStream r0 = r2.openInputStream(r3)     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Rect r1 = f31072a     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0, r1, r4)     // Catch:{ OutOfMemoryError -> 0x0011 }
            m31380a(r0)
            return r2
        L_0x000f:
            r2 = move-exception
            goto L_0x0038
        L_0x0011:
            int r1 = r4.inSampleSize     // Catch:{ all -> 0x000f }
            int r1 = r1 * 2
            r4.inSampleSize = r1     // Catch:{ all -> 0x000f }
            m31380a(r0)
            int r0 = r4.inSampleSize
            r1 = 512(0x200, float:7.175E-43)
            if (r0 > r1) goto L_0x0021
            goto L_0x0000
        L_0x0021:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Failed to decode image: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L_0x0038:
            m31380a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11934c.m31362a(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        m31380a((java.io.Closeable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r7 == null) goto L_0x0036;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.theartofdev.edmodo.cropper.C11934c.C11935a m31371a(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8, int r9) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            r1.<init>()     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            int r2 = r6.width()     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            int r3 = r6.height()     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            int r7 = m31361a(r2, r3, r7, r8)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            int r9 = r9 * r7
            r1.inSampleSize = r9     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            r7 = 0
            android.graphics.BitmapRegionDecoder r7 = android.graphics.BitmapRegionDecoder.newInstance(r4, r7)     // Catch:{ Exception -> 0x005a, all -> 0x0056 }
        L_0x0023:
            com.theartofdev.edmodo.cropper.c$a r8 = new com.theartofdev.edmodo.cropper.c$a     // Catch:{ OutOfMemoryError -> 0x003b }
            android.graphics.Bitmap r9 = r7.decodeRegion(r6, r1)     // Catch:{ OutOfMemoryError -> 0x003b }
            int r2 = r1.inSampleSize     // Catch:{ OutOfMemoryError -> 0x003b }
            r8.<init>(r9, r2)     // Catch:{ OutOfMemoryError -> 0x003b }
            m31380a(r4)
            if (r7 == 0) goto L_0x0036
            r7.recycle()
        L_0x0036:
            return r8
        L_0x0037:
            r5 = move-exception
            goto L_0x0058
        L_0x0039:
            r6 = move-exception
            goto L_0x005c
        L_0x003b:
            int r8 = r1.inSampleSize     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            int r8 = r8 * 2
            r1.inSampleSize = r8     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            int r8 = r1.inSampleSize     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            r9 = 512(0x200, float:7.175E-43)
            if (r8 <= r9) goto L_0x0023
            m31380a(r4)
            if (r7 == 0) goto L_0x004f
            r7.recycle()
        L_0x004f:
            com.theartofdev.edmodo.cropper.c$a r4 = new com.theartofdev.edmodo.cropper.c$a
            r5 = 1
            r4.<init>(r0, r5)
            return r4
        L_0x0056:
            r5 = move-exception
            r7 = r0
        L_0x0058:
            r0 = r4
            goto L_0x0087
        L_0x005a:
            r6 = move-exception
            r7 = r0
        L_0x005c:
            r0 = r4
            goto L_0x0063
        L_0x005e:
            r5 = move-exception
            r7 = r0
            goto L_0x0087
        L_0x0061:
            r6 = move-exception
            r7 = r0
        L_0x0063:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r8.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r9 = "Failed to load sampled bitmap: "
            r8.append(r9)     // Catch:{ all -> 0x0086 }
            r8.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "\r\n"
            r8.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = r6.getMessage()     // Catch:{ all -> 0x0086 }
            r8.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0086 }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0086 }
            throw r4     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r5 = move-exception
        L_0x0087:
            m31380a(r0)
            if (r7 == 0) goto L_0x008f
            r7.recycle()
        L_0x008f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11934c.m31371a(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.theartofdev.edmodo.cropper.c$a");
    }

    /* renamed from: a */
    private static Bitmap m31366a(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians((double) i);
        int i7 = (i < 90 || (i > 180 && i < 270)) ? rect.left : rect.right;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < fArr.length) {
                if (fArr[i9] >= ((float) (i7 - 1)) && fArr[i9] <= ((float) (i7 + 1))) {
                    int i10 = i9 + 1;
                    i8 = (int) Math.abs(Math.sin(radians) * ((double) (((float) rect.bottom) - fArr[i10])));
                    i5 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i10] - ((float) rect.top))));
                    i6 = (int) Math.abs(((double) (fArr[i10] - ((float) rect.top))) / Math.sin(radians));
                    i4 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i10])) / Math.cos(radians));
                    break;
                }
                i9 += 2;
            } else {
                i4 = 0;
                i5 = 0;
                i6 = 0;
                break;
            }
        }
        rect.set(i8, i5, i6 + i8, i4 + i5);
        if (z) {
            m31379a(rect, i2, i3);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a */
    private static int m31361a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    private static int m31360a(int i, int i2) {
        if (f31077f == 0) {
            f31077f = m31359a();
        }
        int i3 = 1;
        if (f31077f > 0) {
            while (true) {
                int i4 = i2 / i3;
                int i5 = f31077f;
                if (i4 <= i5 && i / i3 <= i5) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static Bitmap m31364a(Bitmap bitmap, int i, boolean z, boolean z2) {
        if (i <= 0 && !z && !z2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        float f = -1.0f;
        float f2 = z ? -1.0f : 1.0f;
        if (!z2) {
            f = 1.0f;
        }
        matrix.postScale(f2, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a */
    private static int m31359a() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
            int[] iArr2 = new int[1];
            int i = 0;
            for (int i2 = 0; i2 < iArr[0]; i2++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12332, iArr2);
                if (i < iArr2[0]) {
                    i = iArr2[0];
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return Math.max(i, ItemAnimator.FLAG_MOVED);
        } catch (Exception unused) {
            return ItemAnimator.FLAG_MOVED;
        }
    }

    /* renamed from: a */
    private static void m31380a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}

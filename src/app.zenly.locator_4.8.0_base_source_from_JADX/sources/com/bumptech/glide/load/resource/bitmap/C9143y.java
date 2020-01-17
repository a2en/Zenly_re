package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.p301o.C9216j;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.y */
public final class C9143y {

    /* renamed from: a */
    private static final Paint f23734a = new Paint(6);

    /* renamed from: b */
    private static final Paint f23735b = new Paint(7);

    /* renamed from: c */
    private static final Paint f23736c = new Paint(7);

    /* renamed from: d */
    private static final Set<String> f23737d = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));

    /* renamed from: e */
    private static final Lock f23738e = (f23737d.contains(Build.MODEL) ? new ReentrantLock() : new C9146c());

    /* renamed from: com.bumptech.glide.load.resource.bitmap.y$a */
    class C9144a implements C9145b {

        /* renamed from: a */
        final /* synthetic */ int f23739a;

        C9144a(int i) {
            this.f23739a = i;
        }

        /* renamed from: a */
        public void mo24659a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f23739a;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.y$b */
    private interface C9145b {
        /* renamed from: a */
        void mo24659a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.y$c */
    private static final class C9146c implements Lock {
        C9146c() {
        }

        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        f23736c.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    /* renamed from: a */
    public static int m21883a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static Lock m21889a() {
        return f23738e;
    }

    /* renamed from: b */
    public static Bitmap m21896b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size too big for input, fit centering instead");
            }
            return m21899d(bitmapPool, bitmap, i, i2);
        }
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: b */
    public static boolean m21897b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static Bitmap m21898c(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap a = m21885a(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(min, min, m21884a(bitmap));
        bitmap2.setHasAlpha(true);
        f23738e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawCircle(f2, f2, f2, f23735b);
            canvas.drawBitmap(a, null, rectF, f23736c);
            m21893a(canvas);
            f23738e.unlock();
            if (!a.equals(bitmap)) {
                bitmapPool.put(a);
            }
            return bitmap2;
        } catch (Throwable th) {
            f23738e.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static Bitmap m21899d(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        String str = "TransformationUtils";
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable(str, 2)) {
                Log.v(str, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m21894b(bitmap));
        m21891a(bitmap, bitmap2);
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            String str2 = "x";
            sb.append(str2);
            sb.append(i2);
            Log.v(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append(str2);
            sb2.append(bitmap.getHeight());
            Log.v(str, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(bitmap2.getWidth());
            sb3.append(str2);
            sb3.append(bitmap2.getHeight());
            Log.v(str, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            Log.v(str, sb4.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m21892a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    /* renamed from: a */
    public static Bitmap m21887a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f3 = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
            f = 0.0f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f3 + 0.5f)));
        Bitmap bitmap2 = bitmapPool.get(i, i2, m21894b(bitmap));
        m21891a(bitmap, bitmap2);
        m21892a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    /* renamed from: b */
    public static Bitmap m21895b(BitmapPool bitmapPool, Bitmap bitmap, int i) {
        C9216j.m22087a(i > 0, "roundingRadius must be greater than 0.");
        return m21888a(bitmapPool, bitmap, (C9145b) new C9144a(i));
    }

    /* renamed from: b */
    private static Config m21894b(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    /* renamed from: a */
    public static void m21891a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: a */
    public static Bitmap m21886a(BitmapPool bitmapPool, Bitmap bitmap, int i) {
        if (!m21897b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m21890a(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmap2 = bitmapPool.get(Math.round(rectF.width()), Math.round(rectF.height()), m21894b(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        m21892a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    /* renamed from: a */
    private static Bitmap m21885a(BitmapPool bitmapPool, Bitmap bitmap) {
        Config a = m21884a(bitmap);
        if (a.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), a);
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, null);
        return bitmap2;
    }

    /* renamed from: a */
    private static Config m21884a(Bitmap bitmap) {
        if (VERSION.SDK_INT < 26 || !Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Config.ARGB_8888;
        }
        return Config.RGBA_F16;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static Bitmap m21888a(BitmapPool bitmapPool, Bitmap bitmap, C9145b bVar) {
        Config a = m21884a(bitmap);
        Bitmap a2 = m21885a(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(a2.getWidth(), a2.getHeight(), a);
        bitmap2.setHasAlpha(true);
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(a2, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight());
        f23738e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawColor(0, Mode.CLEAR);
            bVar.mo24659a(canvas, paint, rectF);
            m21893a(canvas);
            f23738e.unlock();
            if (!a2.equals(bitmap)) {
                bitmapPool.put(a2);
            }
            return bitmap2;
        } catch (Throwable th) {
            f23738e.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m21893a(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: a */
    private static void m21892a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f23738e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f23734a);
            m21893a(canvas);
        } finally {
            f23738e.unlock();
        }
    }

    /* renamed from: a */
    static void m21890a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }
}

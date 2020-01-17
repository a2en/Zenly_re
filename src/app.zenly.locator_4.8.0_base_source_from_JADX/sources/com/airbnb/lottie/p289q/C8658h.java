package com.airbnb.lottie.p289q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.animation.content.C8489p;
import com.airbnb.lottie.animation.keyframe.C8491b;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: com.airbnb.lottie.q.h */
public final class C8658h {

    /* renamed from: a */
    private static final PathMeasure f22229a = new PathMeasure();

    /* renamed from: b */
    private static final Path f22230b = new Path();

    /* renamed from: c */
    private static final Path f22231c = new Path();

    /* renamed from: d */
    private static final float[] f22232d = new float[4];

    /* renamed from: e */
    private static final float f22233e = ((float) Math.sqrt(2.0d));

    /* renamed from: f */
    private static float f22234f = -1.0f;

    /* renamed from: a */
    public static int m20195a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: a */
    public static Path m20197a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        return path;
    }

    /* renamed from: a */
    public static boolean m20203a(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        if (i3 >= i6) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m20205b(Matrix matrix) {
        float[] fArr = f22232d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f22232d;
        return fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3];
    }

    /* renamed from: a */
    public static void m20202a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m20194a(Matrix matrix) {
        float[] fArr = f22232d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f22233e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f22232d;
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m20201a(Path path, C8489p pVar) {
        if (pVar != null && !pVar.mo22893f()) {
            m20200a(path, ((C8491b) pVar.mo22891d()).mo22907i() / 100.0f, ((C8491b) pVar.mo22889b()).mo22907i() / 100.0f, ((C8491b) pVar.mo22890c()).mo22907i() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m20200a(Path path, float f, float f2, float f3) {
        String str = "applyTrimPathIfNeeded";
        C8505b.m19651a(str);
        f22229a.setPath(path, false);
        float length = f22229a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C8505b.m19652b(str);
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C8505b.m19652b(str);
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C8657g.m20182a(min, length);
                max = (float) C8657g.m20182a(max, length);
            }
            if (min < 0.0f) {
                min = (float) C8657g.m20182a(min, length);
            }
            if (max < 0.0f) {
                max = (float) C8657g.m20182a(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C8505b.m19652b(str);
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            f22230b.reset();
            f22229a.getSegment(min, max, f22230b, true);
            if (max > length) {
                f22231c.reset();
                f22229a.getSegment(0.0f, max % length, f22231c, true);
                f22230b.addPath(f22231c);
            } else if (min < 0.0f) {
                f22231c.reset();
                f22229a.getSegment(min + length, length, f22231c, true);
                f22230b.addPath(f22231c);
            }
            path.set(f22230b);
            C8505b.m19652b(str);
        }
    }

    /* renamed from: a */
    public static float m20192a() {
        if (f22234f == -1.0f) {
            f22234f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f22234f;
    }

    /* renamed from: a */
    public static float m20193a(Context context) {
        String str = "animator_duration_scale";
        if (VERSION.SDK_INT >= 17) {
            return Global.getFloat(context.getContentResolver(), str, 1.0f);
        }
        return System.getFloat(context.getContentResolver(), str, 1.0f);
    }

    /* renamed from: a */
    public static Bitmap m20196a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: a */
    public static boolean m20204a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: a */
    public static void m20198a(Canvas canvas, RectF rectF, Paint paint) {
        m20199a(canvas, rectF, paint, 31);
    }

    /* renamed from: a */
    public static void m20199a(Canvas canvas, RectF rectF, Paint paint, int i) {
        String str = "Utils#saveLayer";
        C8505b.m19651a(str);
        if (VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C8505b.m19652b(str);
    }
}

package app.zenly.locator.core.glide.p067j;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import app.zenly.android.feature.base.model.C1334a;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.android.feature.base.model.C1334a.C1336b;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p279d.p282i.C7780a;

/* renamed from: app.zenly.locator.core.glide.j.e */
public final class C2494e {

    /* renamed from: a */
    private static final Paint f7490a = new Paint(7);

    /* renamed from: b */
    private static final Paint f7491b;

    /* renamed from: c */
    public static final C2494e f7492c = new C2494e();

    static {
        Paint paint = new Paint(7);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        f7491b = paint;
    }

    private C2494e() {
    }

    /* renamed from: a */
    public final Bitmap mo8558a(BitmapPool bitmapPool, Bitmap bitmap, C1334a aVar, int i, int i2) {
        float f;
        C12932j.m33818b(bitmapPool, "pool");
        C12932j.m33818b(bitmap, "inBitmap");
        C12932j.m33818b(aVar, "cornerStrategy");
        int min = Math.min(i, i2);
        if (aVar instanceof C1336b) {
            f = ((float) min) * ((C1336b) aVar).mo6551b();
        } else if (aVar instanceof C1335a) {
            f = ((C1335a) aVar).mo6547b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        float f2 = (float) i;
        float width = (float) bitmap.getWidth();
        float f3 = (float) i2;
        float height = (float) bitmap.getHeight();
        float max = Math.max(f2 / width, f3 / height);
        float f4 = width * max;
        float f5 = max * height;
        float f6 = (f2 - f4) / 2.0f;
        float f7 = (f3 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap a = m8728a(bitmapPool, bitmap);
        Bitmap bitmap2 = bitmapPool.get(i, i2, m8727a(bitmap));
        C12932j.m33815a((Object) bitmap2, "pool.get(destWidth, destHeight, outConfig)");
        bitmap2.setHasAlpha(true);
        Canvas canvas = new Canvas(bitmap2);
        C7780a aVar2 = new C7780a();
        aVar2.mo19991c(0.0f);
        aVar2.mo19994e(0.0f);
        aVar2.mo19993d(f2);
        aVar2.mo19985a(f3);
        aVar2.mo19989b(f);
        canvas.drawPath(C7780a.m18885a(aVar2, null, 1, null), f7490a);
        canvas.drawBitmap(a, null, rectF, f7491b);
        f7492c.m8729a(canvas);
        if (!C12932j.m33817a((Object) a, (Object) bitmap)) {
            bitmapPool.put(a);
        }
        return bitmap2;
    }

    /* renamed from: a */
    private final void m8729a(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: a */
    private final Config m8727a(Bitmap bitmap) {
        if (VERSION.SDK_INT < 26 || Config.RGBA_F16 != bitmap.getConfig()) {
            return Config.ARGB_8888;
        }
        return Config.RGBA_F16;
    }

    /* renamed from: a */
    private final Bitmap m8728a(BitmapPool bitmapPool, Bitmap bitmap) {
        Config a = m8727a(bitmap);
        if (a == bitmap.getConfig()) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), a);
        C12932j.m33815a((Object) bitmap2, "pool.get(maybeAlphaSafe.…aSafe.height, safeConfig)");
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, null);
        return bitmap2;
    }
}

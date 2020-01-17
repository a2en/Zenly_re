package app.zenly.locator.core.glide.p067j;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C9110f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.glide.j.a */
public final class C2486a extends C9110f {

    /* renamed from: d */
    private static final byte[] f7468d;

    /* renamed from: b */
    private final Paint f7469b = new Paint(1);

    /* renamed from: c */
    private final int f7470c;

    /* renamed from: app.zenly.locator.core.glide.j.a$a */
    public static final class C2487a {
        private C2487a() {
        }

        public /* synthetic */ C2487a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2487a(null);
        Charset charset = Key.f23163a;
        C12932j.m33815a((Object) charset, "CHARSET");
        byte[] bytes = "app.zenly.locator.core.glide.transformation.BackgroundColor".getBytes(charset);
        C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        f7468d = bytes;
    }

    public C2486a(int i) {
        this.f7470c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8554a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        C12932j.m33818b(bitmapPool, "pool");
        C12932j.m33818b(bitmap, "srcBmp");
        Bitmap bitmap2 = bitmapPool.get(i, i2, bitmap.getConfig());
        C12932j.m33815a((Object) bitmap2, "pool.get(outWidth, outHeight, srcBmp.config)");
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawColor(this.f7470c);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f7469b);
        return bitmap2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2486a) || ((C2486a) obj).f7470c != this.f7470c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ("app.zenly.locator.core.glide.transformation.BackgroundColor".hashCode() * 31) + Integer.valueOf(this.f7470c).hashCode();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        C12932j.m33818b(messageDigest, "messageDigest");
        messageDigest.update(f7468d);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7470c).array());
    }
}

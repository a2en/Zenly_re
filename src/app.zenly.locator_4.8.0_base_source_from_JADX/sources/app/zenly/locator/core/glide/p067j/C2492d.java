package app.zenly.locator.core.glide.p067j;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import app.zenly.android.feature.base.model.C1334a;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.android.feature.base.model.C1334a.C1336b;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C9110f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlin.text.C13005c;
import p250f.p251a.p252a.p263b.p279d.p282i.C7780a;

/* renamed from: app.zenly.locator.core.glide.j.d */
public final class C2492d extends C9110f {

    /* renamed from: g */
    private static final String f7483g = f7483g;

    /* renamed from: h */
    private static final byte[] f7484h;

    /* renamed from: b */
    private final Paint f7485b;

    /* renamed from: c */
    private final Paint f7486c = new Paint(7);

    /* renamed from: d */
    private final C1334a f7487d;

    /* renamed from: e */
    private final int f7488e;

    /* renamed from: f */
    private final int f7489f;

    /* renamed from: app.zenly.locator.core.glide.j.d$a */
    public static final class C2493a {
        private C2493a() {
        }

        public /* synthetic */ C2493a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2493a(null);
        String str = f7483g;
        Charset charset = C13005c.f33594a;
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            f7484h = bytes;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public C2492d(C1334a aVar, int i, int i2) {
        C12932j.m33818b(aVar, "cornerStrategy");
        this.f7487d = aVar;
        this.f7488e = i;
        this.f7489f = i2;
        Paint paint = new Paint(7);
        paint.setColor(this.f7489f);
        paint.setStyle(Style.FILL);
        this.f7485b = paint;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8554a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        float f;
        C12932j.m33818b(bitmapPool, "pool");
        C12932j.m33818b(bitmap, "srcBmp");
        Bitmap bitmap2 = bitmapPool.get(i, i2, bitmap.getConfig());
        C12932j.m33815a((Object) bitmap2, "pool.get(outWidth, outHeight, srcBmp.config)");
        Matrix matrix = new Matrix();
        int i3 = this.f7488e;
        float f2 = (float) i;
        float f3 = (float) i2;
        matrix.setScale(1.0f - ((((float) i3) * 2.0f) / f2), 1.0f - ((((float) i3) * 2.0f) / f3), f2 / 2.0f, f3 / 2.0f);
        C1334a aVar = this.f7487d;
        if (aVar instanceof C1336b) {
            f = ((C1336b) aVar).mo6551b() * ((float) Math.min(i, i2));
        } else if (aVar instanceof C1335a) {
            f = ((C1335a) aVar).mo6547b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C7780a aVar2 = new C7780a();
        aVar2.mo19991c(0.0f);
        aVar2.mo19994e(0.0f);
        aVar2.mo19993d(f2);
        aVar2.mo19985a(f3);
        aVar2.mo19989b(f);
        Path a = C7780a.m18885a(aVar2, null, 1, null);
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawPath(a, this.f7485b);
        canvas.drawBitmap(bitmap, matrix, this.f7486c);
        return bitmap2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2492d)) {
            return false;
        }
        C2492d dVar = (C2492d) obj;
        if (C12932j.m33817a((Object) dVar.f7487d, (Object) this.f7487d) && dVar.f7488e == this.f7488e && dVar.f7489f == this.f7489f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((f7483g.hashCode() * 31) + this.f7487d.hashCode()) * 31) + Integer.valueOf(this.f7488e).hashCode()) * 31) + Integer.valueOf(this.f7489f).hashCode();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        C12932j.m33818b(messageDigest, "messageDigest");
        messageDigest.update(f7484h);
        String a = this.f7487d.mo6546a();
        Charset charset = Key.f23163a;
        C12932j.m33815a((Object) charset, "CHARSET");
        if (a != null) {
            byte[] bytes = a.getBytes(charset);
            C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            messageDigest.update(ByteBuffer.allocate(8).putInt(this.f7488e).putInt(this.f7489f).array());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}

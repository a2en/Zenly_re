package app.zenly.locator.core.glide.p067j;

import android.graphics.Bitmap;
import app.zenly.android.feature.base.model.C1334a;
import app.zenly.android.feature.base.model.C1334a.C1336b;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C9110f;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.glide.j.c */
public final class C2490c extends C9110f {

    /* renamed from: c */
    private static final String f7480c = f7480c;

    /* renamed from: d */
    private static final byte[] f7481d;

    /* renamed from: b */
    private final C1334a f7482b;

    /* renamed from: app.zenly.locator.core.glide.j.c$a */
    public static final class C2491a {
        private C2491a() {
        }

        public /* synthetic */ C2491a(C12928f fVar) {
            this();
        }
    }

    static {
        new C2491a(null);
        String str = f7480c;
        Charset charset = Key.f23163a;
        C12932j.m33815a((Object) charset, "CHARSET");
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            f7481d = bytes;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public C2490c() {
        this(null, 1, null);
    }

    public /* synthetic */ C2490c(C1334a aVar, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            aVar = new C1336b(0.4f);
        }
        this(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8554a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        C12932j.m33818b(bitmapPool, "pool");
        C12932j.m33818b(bitmap, "inBitmap");
        return C2494e.f7492c.mo8558a(bitmapPool, bitmap, this.f7482b, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2490c) {
            return C12932j.m33817a((Object) ((C2490c) obj).f7482b, (Object) this.f7482b);
        }
        return false;
    }

    public int hashCode() {
        return (f7480c.hashCode() * 31) + this.f7482b.hashCode();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        C12932j.m33818b(messageDigest, "messageDigest");
        messageDigest.update(f7481d);
        String a = this.f7482b.mo6546a();
        Charset charset = Key.f23163a;
        C12932j.m33815a((Object) charset, "CHARSET");
        if (a != null) {
            byte[] bytes = a.getBytes(charset);
            C12932j.m33815a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public C2490c(C1334a aVar) {
        C12932j.m33818b(aVar, "cornerStrategy");
        this.f7482b = aVar;
    }
}

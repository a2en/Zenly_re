package p333g.p339c.p352d.p355b;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.C9536j;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.core.C9706a;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imageutils.C9896a;

@TargetApi(21)
/* renamed from: g.c.d.b.a */
public class C12053a extends C12058f {

    /* renamed from: a */
    private final BitmapPool f31441a;

    /* renamed from: b */
    private final C9706a f31442b;

    public C12053a(BitmapPool bitmapPool, C9706a aVar) {
        this.f31441a = bitmapPool;
        this.f31442b = aVar;
    }

    /* renamed from: b */
    public CloseableReference<Bitmap> mo35770b(int i, int i2, Config config) {
        Bitmap bitmap = (Bitmap) this.f31441a.get(C9896a.m24731a(i, i2, config));
        C9536j.m23275a(bitmap.getAllocationByteCount() >= (i * i2) * C9896a.m24732a(config));
        bitmap.reconfigure(i, i2, config);
        return this.f31442b.mo26304a(bitmap, this.f31441a);
    }
}

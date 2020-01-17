package p333g.p339c.p352d.p355b;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.logging.C9543a;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.C9650b;
import com.facebook.imagepipeline.core.C9706a;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.platform.PlatformDecoder;

@TargetApi(11)
/* renamed from: g.c.d.b.e */
public class C12057e extends C12058f {

    /* renamed from: e */
    private static final String f31448e = "e";

    /* renamed from: a */
    private final C12054b f31449a;

    /* renamed from: b */
    private final PlatformDecoder f31450b;

    /* renamed from: c */
    private final C9706a f31451c;

    /* renamed from: d */
    private boolean f31452d;

    public C12057e(C12054b bVar, PlatformDecoder platformDecoder, C9706a aVar) {
        this.f31449a = bVar;
        this.f31450b = platformDecoder;
        this.f31451c = aVar;
    }

    /* renamed from: c */
    private CloseableReference<Bitmap> m31848c(int i, int i2, Config config) {
        return this.f31451c.mo26304a(Bitmap.createBitmap(i, i2, config), C12060h.m31854a());
    }

    @TargetApi(12)
    /* renamed from: b */
    public CloseableReference<Bitmap> mo35770b(int i, int i2, Config config) {
        C9732e eVar;
        if (this.f31452d) {
            return m31848c(i, i2, config);
        }
        CloseableReference a = this.f31449a.mo35771a((short) i, (short) i2);
        try {
            eVar = new C9732e(a);
            eVar.mo26418a(C9650b.f25197a);
            CloseableReference<Bitmap> decodeJPEGFromEncodedImage = this.f31450b.decodeJPEGFromEncodedImage(eVar, config, null, ((PooledByteBuffer) a.mo25724b()).size());
            if (!((Bitmap) decodeJPEGFromEncodedImage.mo25724b()).isMutable()) {
                CloseableReference.m23355b(decodeJPEGFromEncodedImage);
                this.f31452d = true;
                C9543a.m23323c(f31448e, "Immutable bitmap returned by decoder");
                CloseableReference<Bitmap> c = m31848c(i, i2, config);
                C9732e.m24069c(eVar);
                a.close();
                return c;
            }
            ((Bitmap) decodeJPEGFromEncodedImage.mo25724b()).setHasAlpha(true);
            ((Bitmap) decodeJPEGFromEncodedImage.mo25724b()).eraseColor(0);
            C9732e.m24069c(eVar);
            a.close();
            return decodeJPEGFromEncodedImage;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}

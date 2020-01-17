package p333g.p339c.p352d.p355b;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.imageformat.C9650b;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.memory.C9743b0;
import com.facebook.imagepipeline.memory.C9759o;

/* renamed from: g.c.d.b.d */
public class C12056d implements BitmapCreator {

    /* renamed from: a */
    private final C12054b f31446a;

    /* renamed from: b */
    private final C9759o f31447b;

    public C12056d(C9743b0 b0Var) {
        this.f31447b = b0Var.mo26514c();
        this.f31446a = new C12054b(b0Var.mo26517f());
    }

    /* renamed from: a */
    private static Options m31847a(int i, Config config) {
        Options options = new Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    @TargetApi(12)
    public Bitmap createNakedBitmap(int i, int i2, Config config) {
        C9732e eVar;
        CloseableReference a = this.f31446a.mo35771a((short) i, (short) i2);
        CloseableReference closeableReference = null;
        try {
            eVar = new C9732e(a);
            try {
                eVar.mo26418a(C9650b.f25197a);
                Options a2 = m31847a(eVar.mo26436j(), config);
                int size = ((PooledByteBuffer) a.mo25724b()).size();
                PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) a.mo25724b();
                closeableReference = this.f31447b.mo26544a(size + 2);
                byte[] bArr = (byte[]) closeableReference.mo25724b();
                pooledByteBuffer.read(0, bArr, 0, size);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, a2);
                decodeByteArray.setHasAlpha(true);
                decodeByteArray.eraseColor(0);
                CloseableReference.m23355b(closeableReference);
                C9732e.m24069c(eVar);
                CloseableReference.m23355b(a);
                return decodeByteArray;
            } catch (Throwable th) {
                th = th;
                CloseableReference.m23355b(closeableReference);
                C9732e.m24069c(eVar);
                CloseableReference.m23355b(a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar = null;
            CloseableReference.m23355b(closeableReference);
            C9732e.m24069c(eVar);
            CloseableReference.m23355b(a);
            throw th;
        }
    }
}

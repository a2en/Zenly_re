package com.facebook.imagepipeline.transcoder;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import com.facebook.common.logging.C9543a;
import com.facebook.imageformat.C9650b;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.image.C9732e;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.transcoder.e */
public class C9894e implements ImageTranscoder {

    /* renamed from: a */
    private final boolean f26001a;

    /* renamed from: b */
    private final int f26002b;

    public C9894e(boolean z, int i) {
        this.f26001a = z;
        this.f26002b = i;
    }

    /* renamed from: a */
    private int m24727a(C9732e eVar, C9702f fVar, C9701e eVar2) {
        if (!this.f26001a) {
            return 1;
        }
        return C9890a.m24708a(fVar, eVar2, eVar, this.f26002b);
    }

    public boolean canResize(C9732e eVar, C9702f fVar, C9701e eVar2) {
        if (fVar == null) {
            fVar = C9702f.m23854e();
        }
        if (!this.f26001a || C9890a.m24708a(fVar, eVar2, eVar, this.f26002b) <= 1) {
            return false;
        }
        return true;
    }

    public boolean canTranscode(ImageFormat imageFormat) {
        return imageFormat == C9650b.f25207k || imageFormat == C9650b.f25197a;
    }

    public String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    public C9891b transcode(C9732e eVar, OutputStream outputStream, C9702f fVar, C9701e eVar2, ImageFormat imageFormat, Integer num) {
        C9702f fVar2;
        C9701e eVar3;
        C9894e eVar4;
        Bitmap bitmap;
        C9732e eVar5 = eVar;
        String str = "Out-Of-Memory during transcode";
        String str2 = "SimpleImageTranscoder";
        Integer valueOf = num == null ? Integer.valueOf(85) : num;
        if (fVar == null) {
            eVar3 = eVar2;
            fVar2 = C9702f.m23854e();
            eVar4 = this;
        } else {
            eVar4 = this;
            fVar2 = fVar;
            eVar3 = eVar2;
        }
        int a = eVar4.m24727a(eVar5, fVar2, eVar3);
        Options options = new Options();
        options.inSampleSize = a;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(eVar.mo26434h(), null, options);
            if (decodeStream == null) {
                C9543a.m23317b(str2, "Couldn't decode the EncodedImage InputStream ! ");
                return new C9891b(2);
            }
            Matrix a2 = C9892c.m24718a(eVar5, fVar2);
            if (a2 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), a2, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap = decodeStream;
                    try {
                        C9543a.m23318b(str2, str, (Throwable) e);
                        C9891b bVar = new C9891b(2);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return bVar;
                    } catch (Throwable th) {
                        th = th;
                        bitmap.recycle();
                        decodeStream.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(m24728a(imageFormat), valueOf.intValue(), outputStream);
                int i = 1;
                if (a > 1) {
                    i = 0;
                }
                C9891b bVar2 = new C9891b(i);
                bitmap.recycle();
                decodeStream.recycle();
                return bVar2;
            } catch (OutOfMemoryError e2) {
                e = e2;
                C9543a.m23318b(str2, str, (Throwable) e);
                C9891b bVar3 = new C9891b(2);
                bitmap.recycle();
                decodeStream.recycle();
                return bVar3;
            }
        } catch (OutOfMemoryError e3) {
            C9543a.m23318b(str2, str, (Throwable) e3);
            return new C9891b(2);
        }
    }

    /* renamed from: a */
    private static CompressFormat m24728a(ImageFormat imageFormat) {
        if (imageFormat == null) {
            return CompressFormat.JPEG;
        }
        if (imageFormat == C9650b.f25197a) {
            return CompressFormat.JPEG;
        }
        if (imageFormat == C9650b.f25198b) {
            return CompressFormat.PNG;
        }
        if (VERSION.SDK_INT < 14 || !C9650b.m23719a(imageFormat)) {
            return CompressFormat.JPEG;
        }
        return CompressFormat.WEBP;
    }
}

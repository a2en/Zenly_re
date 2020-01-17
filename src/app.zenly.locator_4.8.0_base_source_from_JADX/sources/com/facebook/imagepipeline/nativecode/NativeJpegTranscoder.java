package com.facebook.imagepipeline.nativecode;

import com.facebook.common.internal.C9525b;
import com.facebook.common.internal.C9527d;
import com.facebook.common.internal.C9536j;
import com.facebook.imageformat.C9650b;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.transcoder.C9890a;
import com.facebook.imagepipeline.transcoder.C9891b;
import com.facebook.imagepipeline.transcoder.C9892c;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@C9527d
public class NativeJpegTranscoder implements ImageTranscoder {

    /* renamed from: a */
    private boolean f25679a;

    /* renamed from: b */
    private int f25680b;

    /* renamed from: c */
    private boolean f25681c;

    static {
        C9776d.m24273a();
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.f25679a = z;
        this.f25680b = i;
        this.f25681c = z2;
    }

    /* renamed from: a */
    public static void m24268a(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        C9776d.m24273a();
        boolean z = false;
        C9536j.m23275a(i2 >= 1);
        C9536j.m23275a(i2 <= 16);
        C9536j.m23275a(i3 >= 0);
        C9536j.m23275a(i3 <= 100);
        C9536j.m23275a(C9892c.m24722d(i));
        if (!(i2 == 8 && i == 0)) {
            z = true;
        }
        C9536j.m23276a(z, (Object) "no transformation requested");
        C9536j.m23271a(inputStream);
        InputStream inputStream2 = inputStream;
        C9536j.m23271a(outputStream);
        nativeTranscodeJpeg(inputStream2, outputStream, i, i2, i3);
    }

    /* renamed from: b */
    public static void m24269b(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        C9776d.m24273a();
        boolean z = false;
        C9536j.m23275a(i2 >= 1);
        C9536j.m23275a(i2 <= 16);
        C9536j.m23275a(i3 >= 0);
        C9536j.m23275a(i3 <= 100);
        C9536j.m23275a(C9892c.m24721c(i));
        if (!(i2 == 8 && i == 1)) {
            z = true;
        }
        C9536j.m23276a(z, (Object) "no transformation requested");
        C9536j.m23271a(inputStream);
        InputStream inputStream2 = inputStream;
        C9536j.m23271a(outputStream);
        nativeTranscodeJpegWithExifOrientation(inputStream2, outputStream, i, i2, i3);
    }

    @C9527d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @C9527d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    public boolean canResize(C9732e eVar, C9702f fVar, C9701e eVar2) {
        if (fVar == null) {
            fVar = C9702f.m23854e();
        }
        return C9892c.m24715a(fVar, eVar2, eVar, this.f25679a) < 8;
    }

    public boolean canTranscode(ImageFormat imageFormat) {
        return imageFormat == C9650b.f25197a;
    }

    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    /* JADX INFO: finally extract failed */
    public C9891b transcode(C9732e eVar, OutputStream outputStream, C9702f fVar, C9701e eVar2, ImageFormat imageFormat, Integer num) throws IOException {
        if (num == null) {
            num = Integer.valueOf(85);
        }
        if (fVar == null) {
            fVar = C9702f.m23854e();
        }
        int a = C9890a.m24708a(fVar, eVar2, eVar, this.f25680b);
        try {
            int a2 = C9892c.m24715a(fVar, eVar2, eVar, this.f25679a);
            int a3 = C9892c.m24714a(a);
            if (this.f25681c) {
                a2 = a3;
            }
            InputStream h = eVar.mo26434h();
            if (C9892c.f25996a.contains(Integer.valueOf(eVar.mo26428e()))) {
                m24269b(h, outputStream, C9892c.m24716a(fVar, eVar), a2, num.intValue());
            } else {
                m24268a(h, outputStream, C9892c.m24719b(fVar, eVar), a2, num.intValue());
            }
            C9525b.m23253a(h);
            int i = 1;
            if (a != 1) {
                i = 0;
            }
            return new C9891b(i);
        } catch (Throwable th) {
            C9525b.m23253a(null);
            throw th;
        }
    }
}

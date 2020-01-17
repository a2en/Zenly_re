package com.facebook.imagepipeline.decoder;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.C9650b;
import com.facebook.imageformat.C9651c;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9731d;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.image.C9733f;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.transformation.BitmapTransformation;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.decoder.a */
public class C9724a implements ImageDecoder {

    /* renamed from: a */
    private final ImageDecoder f25542a;

    /* renamed from: b */
    private final ImageDecoder f25543b;

    /* renamed from: c */
    private final PlatformDecoder f25544c;

    /* renamed from: d */
    private final ImageDecoder f25545d;

    /* renamed from: e */
    private final Map<ImageFormat, ImageDecoder> f25546e;

    /* renamed from: com.facebook.imagepipeline.decoder.a$a */
    class C9725a implements ImageDecoder {
        C9725a() {
        }

        public C9730c decode(C9732e eVar, int i, QualityInfo qualityInfo, C9698b bVar) {
            ImageFormat g = eVar.mo26432g();
            if (g == C9650b.f25197a) {
                return C9724a.this.mo26394c(eVar, i, qualityInfo, bVar);
            }
            if (g == C9650b.f25199c) {
                return C9724a.this.mo26393b(eVar, i, qualityInfo, bVar);
            }
            if (g == C9650b.f25206j) {
                return C9724a.this.mo26391a(eVar, i, qualityInfo, bVar);
            }
            if (g != ImageFormat.f25182b) {
                return C9724a.this.mo26392a(eVar, bVar);
            }
            throw new DecodeException("unknown image format", eVar);
        }
    }

    public C9724a(ImageDecoder imageDecoder, ImageDecoder imageDecoder2, PlatformDecoder platformDecoder) {
        this(imageDecoder, imageDecoder2, platformDecoder, null);
    }

    /* renamed from: a */
    public C9731d mo26392a(C9732e eVar, C9698b bVar) {
        CloseableReference decodeFromEncodedImageWithColorSpace = this.f25544c.decodeFromEncodedImageWithColorSpace(eVar, bVar.f25338f, null, bVar.f25341i);
        try {
            m24041a(bVar.f25340h, decodeFromEncodedImageWithColorSpace);
            return new C9731d(decodeFromEncodedImageWithColorSpace, C9733f.f25573d, eVar.mo26435i(), eVar.mo26428e());
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }

    /* renamed from: b */
    public C9730c mo26393b(C9732e eVar, int i, QualityInfo qualityInfo, C9698b bVar) {
        if (eVar.mo26438l() == -1 || eVar.mo26430f() == -1) {
            throw new DecodeException("image width or height is incorrect", eVar);
        }
        if (!bVar.f25337e) {
            ImageDecoder imageDecoder = this.f25542a;
            if (imageDecoder != null) {
                return imageDecoder.decode(eVar, i, qualityInfo, bVar);
            }
        }
        return mo26392a(eVar, bVar);
    }

    /* renamed from: c */
    public C9731d mo26394c(C9732e eVar, int i, QualityInfo qualityInfo, C9698b bVar) {
        CloseableReference decodeJPEGFromEncodedImageWithColorSpace = this.f25544c.decodeJPEGFromEncodedImageWithColorSpace(eVar, bVar.f25338f, null, i, bVar.f25341i);
        try {
            m24041a(bVar.f25340h, decodeJPEGFromEncodedImageWithColorSpace);
            return new C9731d(decodeJPEGFromEncodedImageWithColorSpace, qualityInfo, eVar.mo26435i(), eVar.mo26428e());
        } finally {
            decodeJPEGFromEncodedImageWithColorSpace.close();
        }
    }

    public C9730c decode(C9732e eVar, int i, QualityInfo qualityInfo, C9698b bVar) {
        ImageDecoder imageDecoder = bVar.f25339g;
        if (imageDecoder != null) {
            return imageDecoder.decode(eVar, i, qualityInfo, bVar);
        }
        ImageFormat g = eVar.mo26432g();
        if (g == null || g == ImageFormat.f25182b) {
            g = C9651c.m23725c(eVar.mo26434h());
            eVar.mo26418a(g);
        }
        Map<ImageFormat, ImageDecoder> map = this.f25546e;
        if (map != null) {
            ImageDecoder imageDecoder2 = (ImageDecoder) map.get(g);
            if (imageDecoder2 != null) {
                return imageDecoder2.decode(eVar, i, qualityInfo, bVar);
            }
        }
        return this.f25545d.decode(eVar, i, qualityInfo, bVar);
    }

    public C9724a(ImageDecoder imageDecoder, ImageDecoder imageDecoder2, PlatformDecoder platformDecoder, Map<ImageFormat, ImageDecoder> map) {
        this.f25545d = new C9725a();
        this.f25542a = imageDecoder;
        this.f25543b = imageDecoder2;
        this.f25544c = platformDecoder;
        this.f25546e = map;
    }

    /* renamed from: a */
    public C9730c mo26391a(C9732e eVar, int i, QualityInfo qualityInfo, C9698b bVar) {
        return this.f25543b.decode(eVar, i, qualityInfo, bVar);
    }

    /* renamed from: a */
    private void m24041a(BitmapTransformation bitmapTransformation, CloseableReference<Bitmap> closeableReference) {
        if (bitmapTransformation != null) {
            Bitmap bitmap = (Bitmap) closeableReference.mo25724b();
            if (VERSION.SDK_INT >= 12 && bitmapTransformation.modifiesTransparency()) {
                bitmap.setHasAlpha(true);
            }
            bitmapTransformation.transform(bitmap);
        }
    }
}

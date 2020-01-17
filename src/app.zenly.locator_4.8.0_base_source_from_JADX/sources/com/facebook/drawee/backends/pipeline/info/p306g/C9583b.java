package com.facebook.drawee.backends.pipeline.info.p306g;

import com.facebook.drawee.backends.pipeline.info.C9580e;
import com.facebook.drawee.backends.pipeline.info.C9581f;
import com.facebook.drawee.backends.pipeline.info.ImageOriginListener;

/* renamed from: com.facebook.drawee.backends.pipeline.info.g.b */
public class C9583b implements ImageOriginListener {

    /* renamed from: a */
    private final C9581f f24840a;

    /* renamed from: b */
    private final C9580e f24841b;

    public C9583b(C9581f fVar, C9580e eVar) {
        this.f24840a = fVar;
        this.f24841b = eVar;
    }

    public void onImageLoaded(String str, int i, boolean z, String str2) {
        this.f24840a.mo25804b(i);
        this.f24840a.mo25811c(str2);
        this.f24841b.mo25793b(this.f24840a, 1);
    }
}

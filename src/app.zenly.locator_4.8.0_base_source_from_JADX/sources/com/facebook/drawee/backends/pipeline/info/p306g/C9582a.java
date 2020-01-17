package com.facebook.drawee.backends.pipeline.info.p306g;

import android.graphics.drawable.Animatable;
import com.facebook.common.time.MonotonicClock;
import com.facebook.drawee.backends.pipeline.info.C9580e;
import com.facebook.drawee.backends.pipeline.info.C9581f;
import com.facebook.drawee.controller.C9596c;
import com.facebook.imagepipeline.image.ImageInfo;

/* renamed from: com.facebook.drawee.backends.pipeline.info.g.a */
public class C9582a extends C9596c<ImageInfo> {

    /* renamed from: b */
    private final MonotonicClock f24837b;

    /* renamed from: c */
    private final C9581f f24838c;

    /* renamed from: d */
    private final C9580e f24839d;

    public C9582a(MonotonicClock monotonicClock, C9581f fVar, C9580e eVar) {
        this.f24837b = monotonicClock;
        this.f24838c = fVar;
        this.f24839d = eVar;
    }

    /* renamed from: b */
    private void m23488b(long j) {
        this.f24838c.mo25807b(false);
        this.f24838c.mo25817h(j);
        this.f24839d.mo25790a(this.f24838c, 2);
    }

    /* renamed from: a */
    public void onIntermediateImageSet(String str, ImageInfo imageInfo) {
        this.f24838c.mo25813d(this.f24837b.now());
        this.f24838c.mo25801a(str);
        this.f24838c.mo25798a(imageInfo);
        this.f24839d.mo25793b(this.f24838c, 2);
    }

    public void onFailure(String str, Throwable th) {
        long now = this.f24837b.now();
        this.f24838c.mo25805b(now);
        this.f24838c.mo25801a(str);
        this.f24839d.mo25793b(this.f24838c, 5);
        m23488b(now);
    }

    public void onRelease(String str) {
        super.onRelease(str);
        long now = this.f24837b.now();
        int a = this.f24838c.mo25795a();
        if (!(a == 3 || a == 5)) {
            this.f24838c.mo25797a(now);
            this.f24838c.mo25801a(str);
            this.f24839d.mo25793b(this.f24838c, 4);
        }
        m23488b(now);
    }

    public void onSubmit(String str, Object obj) {
        long now = this.f24837b.now();
        this.f24838c.mo25814e(now);
        this.f24838c.mo25801a(str);
        this.f24838c.mo25800a(obj);
        this.f24839d.mo25793b(this.f24838c, 0);
        mo25819a(now);
    }

    /* renamed from: a */
    public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
        long now = this.f24837b.now();
        this.f24838c.mo25810c(now);
        this.f24838c.mo25815f(now);
        this.f24838c.mo25801a(str);
        this.f24838c.mo25798a(imageInfo);
        this.f24839d.mo25793b(this.f24838c, 3);
    }

    /* renamed from: a */
    public void mo25819a(long j) {
        this.f24838c.mo25807b(true);
        this.f24838c.mo25818i(j);
        this.f24839d.mo25790a(this.f24838c, 1);
    }
}

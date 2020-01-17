package com.facebook.drawee.backends.pipeline.info.p306g;

import com.facebook.common.time.MonotonicClock;
import com.facebook.drawee.backends.pipeline.info.C9581f;
import com.facebook.imagepipeline.listener.C9734a;
import com.facebook.imagepipeline.request.C9884a;

/* renamed from: com.facebook.drawee.backends.pipeline.info.g.c */
public class C9584c extends C9734a {

    /* renamed from: a */
    private final MonotonicClock f24842a;

    /* renamed from: b */
    private final C9581f f24843b;

    public C9584c(MonotonicClock monotonicClock, C9581f fVar) {
        this.f24842a = monotonicClock;
        this.f24843b = fVar;
    }

    public void onRequestCancellation(String str) {
        this.f24843b.mo25815f(this.f24842a.now());
        this.f24843b.mo25806b(str);
    }

    public void onRequestFailure(C9884a aVar, String str, Throwable th, boolean z) {
        this.f24843b.mo25815f(this.f24842a.now());
        this.f24843b.mo25799a(aVar);
        this.f24843b.mo25806b(str);
        this.f24843b.mo25802a(z);
    }

    public void onRequestStart(C9884a aVar, Object obj, String str, boolean z) {
        this.f24843b.mo25816g(this.f24842a.now());
        this.f24843b.mo25799a(aVar);
        this.f24843b.mo25800a(obj);
        this.f24843b.mo25806b(str);
        this.f24843b.mo25802a(z);
    }

    public void onRequestSuccess(C9884a aVar, String str, boolean z) {
        this.f24843b.mo25815f(this.f24842a.now());
        this.f24843b.mo25799a(aVar);
        this.f24843b.mo25806b(str);
        this.f24843b.mo25802a(z);
    }
}

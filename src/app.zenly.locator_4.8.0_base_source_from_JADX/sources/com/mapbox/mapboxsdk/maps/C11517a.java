package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.annotations.C11423a;
import p214e.p228e.C7576d;

/* renamed from: com.mapbox.mapboxsdk.maps.a */
class C11517a implements C11523c {

    /* renamed from: a */
    private final C11550m f29825a;

    /* renamed from: b */
    private final C7576d<C11423a> f29826b;

    C11517a(C11550m mVar, C7576d<C11423a> dVar) {
        this.f29825a = mVar;
        this.f29826b = dVar;
    }

    /* renamed from: a */
    public C11423a mo33780a(long j) {
        return (C11423a) this.f29826b.mo19513c(j);
    }

    /* renamed from: b */
    public void mo33782b(long j) {
        C11550m mVar = this.f29825a;
        if (mVar != null) {
            mVar.mo33688a(j);
        }
        this.f29826b.mo19518e(j);
    }

    /* renamed from: a */
    public void mo33781a(C11423a aVar) {
        mo33782b(aVar.mo33252a());
    }
}

package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.annotations.C11423a;
import com.mapbox.mapboxsdk.annotations.Polygon;
import p214e.p228e.C7576d;

/* renamed from: com.mapbox.mapboxsdk.maps.n */
class C11551n implements C11552o {

    /* renamed from: a */
    private final C11550m f29940a;

    /* renamed from: b */
    private final C7576d<C11423a> f29941b;

    C11551n(C11550m mVar, C7576d<C11423a> dVar) {
        this.f29940a = mVar;
        this.f29941b = dVar;
    }

    /* renamed from: a */
    public void mo33883a(Polygon polygon) {
        this.f29940a.mo33689a(polygon);
        C7576d<C11423a> dVar = this.f29941b;
        dVar.mo19506a(dVar.mo19517d(polygon.mo33252a()), polygon);
    }
}

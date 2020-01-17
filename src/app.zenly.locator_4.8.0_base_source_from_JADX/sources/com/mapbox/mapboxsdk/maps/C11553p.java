package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.annotations.C11423a;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import p214e.p228e.C7576d;

/* renamed from: com.mapbox.mapboxsdk.maps.p */
class C11553p implements C11554q {

    /* renamed from: a */
    private final C11550m f29942a;

    /* renamed from: b */
    private final C7576d<C11423a> f29943b;

    C11553p(C11550m mVar, C7576d<C11423a> dVar) {
        this.f29942a = mVar;
        this.f29943b = dVar;
    }

    /* renamed from: a */
    public Polyline mo33884a(PolylineOptions polylineOptions, MapboxMap mapboxMap) {
        Polyline d = polylineOptions.mo33243d();
        if (!d.mo33175e().isEmpty()) {
            C11550m mVar = this.f29942a;
            long b = mVar != null ? mVar.mo33703b(d) : 0;
            d.mo33255a(mapboxMap);
            d.mo33253a(b);
            this.f29943b.mo19514c(b, d);
        }
        return d;
    }

    /* renamed from: a */
    public void mo33885a(Polyline polyline) {
        this.f29942a.mo33690a(polyline);
        C7576d<C11423a> dVar = this.f29943b;
        dVar.mo19506a(dVar.mo19517d(polyline.mo33252a()), polyline);
    }
}

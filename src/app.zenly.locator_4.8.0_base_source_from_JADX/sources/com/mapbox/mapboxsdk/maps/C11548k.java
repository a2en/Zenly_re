package com.mapbox.mapboxsdk.maps;

import android.graphics.RectF;
import com.mapbox.mapboxsdk.annotations.C11423a;
import com.mapbox.mapboxsdk.annotations.Marker;
import java.util.ArrayList;
import java.util.List;
import p214e.p228e.C7576d;

/* renamed from: com.mapbox.mapboxsdk.maps.k */
class C11548k implements C11549l {

    /* renamed from: a */
    private final NativeMapView f29937a;

    /* renamed from: b */
    private final C7576d<C11423a> f29938b;

    /* renamed from: c */
    private final C11531f f29939c;

    C11548k(NativeMapView nativeMapView, C7576d<C11423a> dVar, C11531f fVar) {
        this.f29937a = nativeMapView;
        this.f29938b = dVar;
        this.f29939c = fVar;
    }

    /* renamed from: b */
    private List<C11423a> m30102b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f29938b.mo19504a(); i++) {
            C7576d<C11423a> dVar = this.f29938b;
            arrayList.add(dVar.mo19513c(dVar.mo19505a(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<Marker> mo33881a(RectF rectF) {
        long[] b = this.f29937a.mo33711b(this.f29937a.mo33679a(rectF));
        ArrayList arrayList = new ArrayList(b.length);
        for (long valueOf : b) {
            arrayList.add(Long.valueOf(valueOf));
        }
        ArrayList arrayList2 = new ArrayList(b.length);
        List b2 = m30102b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            C11423a aVar = (C11423a) b2.get(i);
            if ((aVar instanceof Marker) && arrayList.contains(Long.valueOf(aVar.mo33252a()))) {
                arrayList2.add((Marker) aVar);
            }
        }
        return new ArrayList(arrayList2);
    }

    /* renamed from: a */
    public void mo33882a() {
        this.f29939c.mo33817c();
        int a = this.f29938b.mo19504a();
        for (int i = 0; i < a; i++) {
            C11423a aVar = (C11423a) this.f29938b.mo19513c((long) i);
            if (aVar instanceof Marker) {
                Marker marker = (Marker) aVar;
                this.f29937a.mo33688a(aVar.mo33252a());
                marker.mo33253a(this.f29937a.mo33677a(marker));
            }
        }
    }
}

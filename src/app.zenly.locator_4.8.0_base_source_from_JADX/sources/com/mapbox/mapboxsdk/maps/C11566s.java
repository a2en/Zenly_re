package com.mapbox.mapboxsdk.maps;

import android.graphics.RectF;
import com.mapbox.mapboxsdk.annotations.C11423a;
import java.util.ArrayList;
import java.util.List;
import p214e.p228e.C7576d;

/* renamed from: com.mapbox.mapboxsdk.maps.s */
class C11566s implements C11567t {

    /* renamed from: a */
    private final NativeMapView f29988a;

    /* renamed from: b */
    private final C7576d<C11423a> f29989b;

    C11566s(NativeMapView nativeMapView, C7576d<C11423a> dVar) {
        this.f29988a = nativeMapView;
        this.f29989b = dVar;
    }

    /* renamed from: a */
    public List<C11423a> mo33931a(RectF rectF) {
        return m30184a(this.f29988a.mo33716c(this.f29988a.mo33679a(rectF)));
    }

    /* renamed from: a */
    private List<C11423a> m30184a(long[] jArr) {
        ArrayList arrayList = new ArrayList();
        for (long c : jArr) {
            C11423a aVar = (C11423a) this.f29989b.mo19513c(c);
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}

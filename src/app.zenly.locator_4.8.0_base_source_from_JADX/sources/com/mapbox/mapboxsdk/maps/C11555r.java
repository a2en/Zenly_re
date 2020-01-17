package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import com.mapbox.mapboxsdk.geometry.LatLng;

/* renamed from: com.mapbox.mapboxsdk.maps.r */
public class C11555r {

    /* renamed from: a */
    private final NativeMapView f29944a;

    C11555r(NativeMapView nativeMapView) {
        this.f29944a = nativeMapView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33890a(int[] iArr) {
        float[] fArr = new float[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            fArr[i] = (float) iArr[i];
        }
        this.f29944a.mo33700a(fArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo33891b() {
        return (float) this.f29944a.mo33724g();
    }

    /* renamed from: a */
    public double mo33886a(double d) {
        return this.f29944a.mo33713c(d);
    }

    /* renamed from: a */
    public LatLng mo33889a(PointF pointF) {
        return this.f29944a.mo33680a(pointF);
    }

    /* renamed from: a */
    public PointF mo33888a(LatLng latLng) {
        return this.f29944a.mo33678a(latLng);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo33887a() {
        return (float) this.f29944a.mo33722f();
    }
}

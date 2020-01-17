package com.mapbox.mapboxsdk.annotations;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class BasePointCollection extends C11423a {
    @Keep
    private float alpha = 1.0f;
    @Keep
    private List<LatLng> points = new ArrayList();

    protected BasePointCollection() {
    }

    /* renamed from: a */
    public void mo33173a(List<LatLng> list) {
        this.points = new ArrayList(list);
        mo33176f();
    }

    /* renamed from: d */
    public float mo33174d() {
        return this.alpha;
    }

    /* renamed from: e */
    public List<LatLng> mo33175e() {
        return new ArrayList(this.points);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract void mo33176f();

    /* renamed from: a */
    public void mo33172a(LatLng latLng) {
        this.points.add(latLng);
        mo33176f();
    }

    /* renamed from: a */
    public void mo33171a(float f) {
        this.alpha = f;
        mo33176f();
    }
}

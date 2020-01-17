package com.mapbox.mapboxsdk.annotations;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class Polygon extends BasePointCollection {
    @Keep
    private int fillColor = -16777216;
    @Keep
    private List<List<LatLng>> holes = new ArrayList();
    @Keep
    private int strokeColor = -16777216;

    Polygon() {
    }

    /* renamed from: a */
    public void mo33207a(int i) {
        this.fillColor = i;
        mo33176f();
    }

    /* renamed from: b */
    public void mo33208b(int i) {
        this.strokeColor = i;
        mo33176f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo33176f() {
        MapboxMap b = mo33256b();
        if (b != null) {
            b.mo33548a(this);
        }
    }

    /* renamed from: g */
    public int mo33210g() {
        return this.fillColor;
    }

    /* renamed from: h */
    public List<List<LatLng>> mo33211h() {
        return new ArrayList(this.holes);
    }

    /* renamed from: i */
    public int mo33212i() {
        return this.strokeColor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33209b(List<LatLng> list) {
        this.holes.add(list);
        mo33176f();
    }
}

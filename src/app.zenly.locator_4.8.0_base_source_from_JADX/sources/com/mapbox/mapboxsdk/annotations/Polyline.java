package com.mapbox.mapboxsdk.annotations;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.maps.MapboxMap;

@Deprecated
public final class Polyline extends BasePointCollection {
    @Keep
    private int color = -16777216;
    @Keep
    private float width = 10.0f;

    Polyline() {
    }

    /* renamed from: a */
    public void mo33231a(int i) {
        this.color = i;
        mo33176f();
    }

    /* renamed from: b */
    public void mo33232b(float f) {
        this.width = f;
        mo33176f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo33176f() {
        MapboxMap b = mo33256b();
        if (b != null) {
            b.mo33549a(this);
        }
    }

    /* renamed from: g */
    public int mo33233g() {
        return this.color;
    }

    /* renamed from: h */
    public float mo33234h() {
        return this.width;
    }
}

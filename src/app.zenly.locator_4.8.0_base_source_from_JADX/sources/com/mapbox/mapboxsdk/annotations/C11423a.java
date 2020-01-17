package com.mapbox.mapboxsdk.annotations;

import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;

@Deprecated
/* renamed from: com.mapbox.mapboxsdk.annotations.a */
public abstract class C11423a implements Comparable<C11423a> {

    /* renamed from: e */
    private long f29559e = -1;

    /* renamed from: f */
    protected MapboxMap f29560f;

    protected C11423a() {
    }

    /* renamed from: a */
    public long mo33252a() {
        return this.f29559e;
    }

    /* renamed from: a */
    public void mo33254a(MapView mapView) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public MapboxMap mo33256b() {
        return this.f29560f;
    }

    /* renamed from: c */
    public void mo33257c() {
        MapboxMap mapboxMap = this.f29560f;
        if (mapboxMap != null) {
            mapboxMap.mo33550a(this);
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11423a)) {
            return false;
        }
        if (this.f29559e != ((C11423a) obj).mo33252a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (mo33252a() ^ (mo33252a() >>> 32));
    }

    /* renamed from: a */
    public void mo33253a(long j) {
        this.f29559e = j;
    }

    /* renamed from: a */
    public void mo33255a(MapboxMap mapboxMap) {
        this.f29560f = mapboxMap;
    }

    /* renamed from: a */
    public int compareTo(C11423a aVar) {
        if (this.f29559e < aVar.mo33252a()) {
            return 1;
        }
        return this.f29559e > aVar.mo33252a() ? -1 : 0;
    }
}

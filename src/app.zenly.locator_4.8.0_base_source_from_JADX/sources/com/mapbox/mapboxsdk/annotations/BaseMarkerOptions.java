package com.mapbox.mapboxsdk.annotations;

import android.os.Parcelable;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.geometry.LatLng;

@Deprecated
public abstract class BaseMarkerOptions<U extends Marker, T extends BaseMarkerOptions<U, T>> implements Parcelable {

    /* renamed from: e */
    protected LatLng f29537e;

    /* renamed from: f */
    protected String f29538f;

    /* renamed from: g */
    protected String f29539g;

    /* renamed from: h */
    protected C11426d f29540h;

    /* renamed from: a */
    public abstract T mo33166a();

    /* renamed from: a */
    public T mo33168a(LatLng latLng) {
        this.f29537e = latLng;
        return mo33166a();
    }

    /* renamed from: b */
    public T mo33170b(String str) {
        this.f29539g = str;
        return mo33166a();
    }

    /* renamed from: a */
    public T mo33169a(String str) {
        this.f29538f = str;
        return mo33166a();
    }

    /* renamed from: a */
    public T mo33167a(C11426d dVar) {
        this.f29540h = dVar;
        return mo33166a();
    }
}

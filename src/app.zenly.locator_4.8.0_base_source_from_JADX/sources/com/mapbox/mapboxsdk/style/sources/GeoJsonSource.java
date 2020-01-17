package com.mapbox.mapboxsdk.style.sources;

import androidx.annotation.Keep;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;

public class GeoJsonSource extends Source {
    @Keep
    GeoJsonSource(long j) {
        super(j);
    }

    @Keep
    private native Feature[] nativeGetClusterChildren(Feature feature);

    @Keep
    private native int nativeGetClusterExpansionZoom(Feature feature);

    @Keep
    private native Feature[] nativeGetClusterLeaves(Feature feature, long j, long j2);

    @Keep
    private native void nativeSetFeature(Feature feature);

    @Keep
    private native void nativeSetFeatureCollection(FeatureCollection featureCollection);

    @Keep
    private native void nativeSetGeoJsonString(String str);

    @Keep
    private native void nativeSetGeometry(Geometry geometry);

    @Keep
    private native Feature[] querySourceFeatures(Object[] objArr);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetUrl();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetUrl(String str);
}

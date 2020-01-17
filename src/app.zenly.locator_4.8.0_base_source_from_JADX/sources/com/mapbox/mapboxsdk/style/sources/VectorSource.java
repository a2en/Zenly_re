package com.mapbox.mapboxsdk.style.sources;

import androidx.annotation.Keep;
import com.mapbox.geojson.Feature;

public class VectorSource extends Source {
    @Keep
    VectorSource(long j) {
        super(j);
    }

    @Keep
    private native Feature[] querySourceFeatures(String[] strArr, Object[] objArr);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetUrl();
}

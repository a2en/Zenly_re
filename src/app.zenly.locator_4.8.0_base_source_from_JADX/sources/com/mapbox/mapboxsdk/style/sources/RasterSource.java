package com.mapbox.mapboxsdk.style.sources;

import androidx.annotation.Keep;

public class RasterSource extends Source {
    @Keep
    RasterSource(long j) {
        super(j);
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, Object obj, int i);

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetUrl();

    public RasterSource(String str, C11593a aVar, int i) {
        initialize(str, aVar.mo34191a(), i);
    }
}

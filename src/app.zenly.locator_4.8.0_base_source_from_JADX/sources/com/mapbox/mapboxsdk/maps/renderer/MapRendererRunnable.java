package com.mapbox.mapboxsdk.maps.renderer;

import androidx.annotation.Keep;

@Keep
class MapRendererRunnable implements Runnable {
    private final long nativePtr;

    MapRendererRunnable(long j) {
        this.nativePtr = j;
    }

    private native void nativeInitialize();

    /* access modifiers changed from: protected */
    public native void finalize() throws Throwable;

    public native void run();
}

package com.mapbox.mapboxsdk.net;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.C11419a;

class NativeConnectivityListener implements ConnectivityListener {
    @Keep
    private boolean invalidated;
    @Keep
    private long nativePtr;

    static {
        C11419a.m29393a();
    }

    @Keep
    NativeConnectivityListener(long j) {
        this.nativePtr = j;
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeOnConnectivityStateChanged(boolean z);

    public void onNetworkStateChanged(boolean z) {
        nativeOnConnectivityStateChanged(z);
    }

    NativeConnectivityListener() {
        initialize();
    }
}

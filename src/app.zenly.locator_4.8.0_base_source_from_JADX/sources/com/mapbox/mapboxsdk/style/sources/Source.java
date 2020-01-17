package com.mapbox.mapboxsdk.style.sources;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.C11419a;
import com.mapbox.mapboxsdk.utils.C11598e;

public abstract class Source {
    protected boolean detached;
    @Keep
    private long nativePtr;

    static {
        C11419a.m29393a();
    }

    @Keep
    protected Source(long j) {
        checkThread();
        this.nativePtr = j;
    }

    /* access modifiers changed from: protected */
    public void checkThread() {
        C11598e.m30384a("Source");
    }

    public String getAttribution() {
        checkThread();
        return nativeGetAttribution();
    }

    public String getId() {
        checkThread();
        return nativeGetId();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetAttribution();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetId();

    public void setDetached() {
        this.detached = true;
    }

    public Source() {
        checkThread();
    }
}

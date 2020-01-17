package com.mapbox.mapboxsdk.style.layers;

import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import com.mapbox.mapboxsdk.C11419a;
import com.mapbox.mapboxsdk.utils.C11598e;

public abstract class Layer {
    @Keep
    private boolean invalidated;
    @Keep
    private long nativePtr;

    static {
        C11419a.m29393a();
    }

    @Keep
    protected Layer(long j) {
        mo34129a();
        this.nativePtr = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34129a() {
        C11598e.m30384a("Layer");
    }

    /* renamed from: b */
    public String mo34130b() {
        mo34129a();
        return nativeGetId();
    }

    /* renamed from: c */
    public long mo34131c() {
        return this.nativePtr;
    }

    /* renamed from: d */
    public void mo34132d() {
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native JsonElement nativeGetFilter();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetId();

    /* access modifiers changed from: protected */
    @Keep
    public native float nativeGetMaxZoom();

    /* access modifiers changed from: protected */
    @Keep
    public native float nativeGetMinZoom();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetSourceId();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetSourceLayer();

    /* access modifiers changed from: protected */
    @Keep
    public native Object nativeGetVisibility();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetFilter(Object[] objArr);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetLayoutProperty(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetMaxZoom(float f);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetMinZoom(float f);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetPaintProperty(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetSourceLayer(String str);

    public Layer() {
        mo34129a();
    }
}

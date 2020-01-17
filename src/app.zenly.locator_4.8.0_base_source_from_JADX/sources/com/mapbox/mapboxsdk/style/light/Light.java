package com.mapbox.mapboxsdk.style.light;

import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.utils.C11598e;

public class Light {
    @Keep
    private long nativePtr;

    @Keep
    Light(long j) {
        m30358a();
        this.nativePtr = j;
    }

    /* renamed from: a */
    private void m30358a() {
        C11598e.m30384a("Light");
    }

    @Keep
    private native String nativeGetAnchor();

    @Keep
    private native String nativeGetColor();

    @Keep
    private native TransitionOptions nativeGetColorTransition();

    @Keep
    private native float nativeGetIntensity();

    @Keep
    private native TransitionOptions nativeGetIntensityTransition();

    @Keep
    private native Position nativeGetPosition();

    @Keep
    private native TransitionOptions nativeGetPositionTransition();

    @Keep
    private native void nativeSetAnchor(String str);

    @Keep
    private native void nativeSetColor(String str);

    @Keep
    private native void nativeSetColorTransition(long j, long j2);

    @Keep
    private native void nativeSetIntensity(float f);

    @Keep
    private native void nativeSetIntensityTransition(long j, long j2);

    @Keep
    private native void nativeSetPosition(Position position);

    @Keep
    private native void nativeSetPositionTransition(long j, long j2);
}

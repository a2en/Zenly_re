package com.mapbox.mapboxsdk.style.layers;

import androidx.annotation.Keep;

public class FillLayer extends Layer {
    @Keep
    FillLayer(long j) {
        super(j);
    }

    @Keep
    private native Object nativeGetFillAntialias();

    @Keep
    private native Object nativeGetFillColor();

    @Keep
    private native TransitionOptions nativeGetFillColorTransition();

    @Keep
    private native Object nativeGetFillOpacity();

    @Keep
    private native TransitionOptions nativeGetFillOpacityTransition();

    @Keep
    private native Object nativeGetFillOutlineColor();

    @Keep
    private native TransitionOptions nativeGetFillOutlineColorTransition();

    @Keep
    private native Object nativeGetFillPattern();

    @Keep
    private native TransitionOptions nativeGetFillPatternTransition();

    @Keep
    private native Object nativeGetFillTranslate();

    @Keep
    private native Object nativeGetFillTranslateAnchor();

    @Keep
    private native TransitionOptions nativeGetFillTranslateTransition();

    @Keep
    private native void nativeSetFillColorTransition(long j, long j2);

    @Keep
    private native void nativeSetFillOpacityTransition(long j, long j2);

    @Keep
    private native void nativeSetFillOutlineColorTransition(long j, long j2);

    @Keep
    private native void nativeSetFillPatternTransition(long j, long j2);

    @Keep
    private native void nativeSetFillTranslateTransition(long j, long j2);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, String str2);
}

package com.mapbox.mapboxsdk.style.layers;

import androidx.annotation.Keep;

public class CircleLayer extends Layer {
    @Keep
    CircleLayer(long j) {
        super(j);
    }

    @Keep
    private native Object nativeGetCircleBlur();

    @Keep
    private native TransitionOptions nativeGetCircleBlurTransition();

    @Keep
    private native Object nativeGetCircleColor();

    @Keep
    private native TransitionOptions nativeGetCircleColorTransition();

    @Keep
    private native Object nativeGetCircleOpacity();

    @Keep
    private native TransitionOptions nativeGetCircleOpacityTransition();

    @Keep
    private native Object nativeGetCirclePitchAlignment();

    @Keep
    private native Object nativeGetCirclePitchScale();

    @Keep
    private native Object nativeGetCircleRadius();

    @Keep
    private native TransitionOptions nativeGetCircleRadiusTransition();

    @Keep
    private native Object nativeGetCircleStrokeColor();

    @Keep
    private native TransitionOptions nativeGetCircleStrokeColorTransition();

    @Keep
    private native Object nativeGetCircleStrokeOpacity();

    @Keep
    private native TransitionOptions nativeGetCircleStrokeOpacityTransition();

    @Keep
    private native Object nativeGetCircleStrokeWidth();

    @Keep
    private native TransitionOptions nativeGetCircleStrokeWidthTransition();

    @Keep
    private native Object nativeGetCircleTranslate();

    @Keep
    private native Object nativeGetCircleTranslateAnchor();

    @Keep
    private native TransitionOptions nativeGetCircleTranslateTransition();

    @Keep
    private native void nativeSetCircleBlurTransition(long j, long j2);

    @Keep
    private native void nativeSetCircleColorTransition(long j, long j2);

    @Keep
    private native void nativeSetCircleOpacityTransition(long j, long j2);

    @Keep
    private native void nativeSetCircleRadiusTransition(long j, long j2);

    @Keep
    private native void nativeSetCircleStrokeColorTransition(long j, long j2);

    @Keep
    private native void nativeSetCircleStrokeOpacityTransition(long j, long j2);

    @Keep
    private native void nativeSetCircleStrokeWidthTransition(long j, long j2);

    @Keep
    private native void nativeSetCircleTranslateTransition(long j, long j2);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, String str2);
}

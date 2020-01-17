package com.mapbox.mapboxsdk.style.layers;

import androidx.annotation.Keep;

public class BackgroundLayer extends Layer {
    @Keep
    BackgroundLayer(long j) {
        super(j);
    }

    @Keep
    private native Object nativeGetBackgroundColor();

    @Keep
    private native TransitionOptions nativeGetBackgroundColorTransition();

    @Keep
    private native Object nativeGetBackgroundOpacity();

    @Keep
    private native TransitionOptions nativeGetBackgroundOpacityTransition();

    @Keep
    private native Object nativeGetBackgroundPattern();

    @Keep
    private native TransitionOptions nativeGetBackgroundPatternTransition();

    @Keep
    private native void nativeSetBackgroundColorTransition(long j, long j2);

    @Keep
    private native void nativeSetBackgroundOpacityTransition(long j, long j2);

    @Keep
    private native void nativeSetBackgroundPatternTransition(long j, long j2);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str);
}

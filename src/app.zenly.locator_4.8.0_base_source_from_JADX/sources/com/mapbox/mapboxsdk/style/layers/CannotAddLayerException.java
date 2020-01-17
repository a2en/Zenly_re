package com.mapbox.mapboxsdk.style.layers;

import androidx.annotation.Keep;

@Keep
public class CannotAddLayerException extends RuntimeException {
    public CannotAddLayerException(String str) {
        super(str);
    }
}

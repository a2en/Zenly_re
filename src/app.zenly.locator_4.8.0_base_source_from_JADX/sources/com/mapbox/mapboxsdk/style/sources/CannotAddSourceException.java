package com.mapbox.mapboxsdk.style.sources;

import androidx.annotation.Keep;

@Keep
public class CannotAddSourceException extends RuntimeException {
    public CannotAddSourceException(String str) {
        super(str);
    }
}

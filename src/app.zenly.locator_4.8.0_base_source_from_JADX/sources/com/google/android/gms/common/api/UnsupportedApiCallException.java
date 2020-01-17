package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: e */
    private final Feature f26281e;

    public UnsupportedApiCallException(Feature feature) {
        this.f26281e = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f26281e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}

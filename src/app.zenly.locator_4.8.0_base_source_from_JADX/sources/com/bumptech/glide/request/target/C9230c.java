package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.Request;

/* renamed from: com.bumptech.glide.request.target.c */
public abstract class C9230c<T> implements Target<T> {

    /* renamed from: e */
    private final int f23987e;

    /* renamed from: f */
    private final int f23988f;

    /* renamed from: g */
    private Request f23989g;

    public C9230c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final Request getRequest() {
        return this.f23989g;
    }

    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.f23987e, this.f23988f);
    }

    public void onDestroy() {
    }

    public void onLoadFailed(Drawable drawable) {
    }

    public void onLoadStarted(Drawable drawable) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public final void removeCallback(SizeReadyCallback sizeReadyCallback) {
    }

    public final void setRequest(Request request) {
        this.f23989g = request;
    }

    public C9230c(int i, int i2) {
        if (C9217k.m22104b(i, i2)) {
            this.f23987e = i;
            this.f23988f = i2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(i);
        sb.append(" and height: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}

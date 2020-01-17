package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;

@Deprecated
/* renamed from: com.bumptech.glide.request.target.a */
public abstract class C9228a<Z> implements Target<Z> {

    /* renamed from: e */
    private Request f23986e;

    public Request getRequest() {
        return this.f23986e;
    }

    public void onDestroy() {
    }

    public void onLoadCleared(Drawable drawable) {
    }

    public void onLoadFailed(Drawable drawable) {
    }

    public void onLoadStarted(Drawable drawable) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void setRequest(Request request) {
        this.f23986e = request;
    }
}

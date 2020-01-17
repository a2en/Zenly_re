package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.request.transition.Transition.ViewAdapter;

/* renamed from: com.bumptech.glide.request.target.f */
public abstract class C9235f<Z> extends C9238i<ImageView, Z> implements ViewAdapter {

    /* renamed from: l */
    private Animatable f24002l;

    public C9235f(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    private void m22234b(Z z) {
        if (z instanceof Animatable) {
            this.f24002l = (Animatable) z;
            this.f24002l.start();
            return;
        }
        this.f24002l = null;
    }

    /* renamed from: c */
    private void m22235c(Z z) {
        mo24906a(z);
        m22234b(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24906a(Z z);

    public Drawable getCurrentDrawable() {
        return ((ImageView) this.f24006f).getDrawable();
    }

    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f24002l;
        if (animatable != null) {
            animatable.stop();
        }
        m22235c(null);
        setDrawable(drawable);
    }

    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m22235c(null);
        setDrawable(drawable);
    }

    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m22235c(null);
        setDrawable(drawable);
    }

    public void onResourceReady(Z z, Transition<? super Z> transition) {
        if (transition == null || !transition.transition(z, this)) {
            m22235c(z);
        } else {
            m22234b(z);
        }
    }

    public void onStart() {
        Animatable animatable = this.f24002l;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void onStop() {
        Animatable animatable = this.f24002l;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void setDrawable(Drawable drawable) {
        ((ImageView) this.f24006f).setImageDrawable(drawable);
    }
}

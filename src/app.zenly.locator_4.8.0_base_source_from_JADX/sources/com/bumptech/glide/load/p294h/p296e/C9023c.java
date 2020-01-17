package com.bumptech.glide.load.p294h.p296e;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

/* renamed from: com.bumptech.glide.load.h.e.c */
final class C9023c extends C9022b<Drawable> {
    private C9023c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    static Resource<Drawable> m21686a(Drawable drawable) {
        if (drawable != null) {
            return new C9023c(drawable);
        }
        return null;
    }

    public Class<Drawable> getResourceClass() {
        return this.f23557e.getClass();
    }

    public int getSize() {
        return Math.max(1, this.f23557e.getIntrinsicWidth() * this.f23557e.getIntrinsicHeight() * 4);
    }

    public void recycle() {
    }
}

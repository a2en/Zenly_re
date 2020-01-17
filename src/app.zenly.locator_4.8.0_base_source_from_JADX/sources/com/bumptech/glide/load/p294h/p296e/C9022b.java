package com.bumptech.glide.load.p294h.p296e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.C9156c;
import com.bumptech.glide.p301o.C9216j;

/* renamed from: com.bumptech.glide.load.h.e.b */
public abstract class C9022b<T extends Drawable> implements Resource<T>, Initializable {

    /* renamed from: e */
    protected final T f23557e;

    public C9022b(T t) {
        C9216j.m22083a(t);
        this.f23557e = (Drawable) t;
    }

    public void initialize() {
        T t = this.f23557e;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C9156c) {
            ((C9156c) t).mo24694b().prepareToDraw();
        }
    }

    public final T get() {
        ConstantState constantState = this.f23557e.getConstantState();
        if (constantState == null) {
            return this.f23557e;
        }
        return constantState.newDrawable();
    }
}

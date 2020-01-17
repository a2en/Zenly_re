package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p301o.C9216j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.t */
public final class C9136t implements Resource<BitmapDrawable>, Initializable {

    /* renamed from: e */
    private final Resources f23718e;

    /* renamed from: f */
    private final Resource<Bitmap> f23719f;

    private C9136t(Resources resources, Resource<Bitmap> resource) {
        C9216j.m22083a(resources);
        this.f23718e = resources;
        C9216j.m22083a(resource);
        this.f23719f = resource;
    }

    /* renamed from: a */
    public static Resource<BitmapDrawable> m21874a(Resources resources, Resource<Bitmap> resource) {
        if (resource == null) {
            return null;
        }
        return new C9136t(resources, resource);
    }

    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    public int getSize() {
        return this.f23719f.getSize();
    }

    public void initialize() {
        Resource<Bitmap> resource = this.f23719f;
        if (resource instanceof Initializable) {
            ((Initializable) resource).initialize();
        }
    }

    public void recycle() {
        this.f23719f.recycle();
    }

    public BitmapDrawable get() {
        return new BitmapDrawable(this.f23718e, (Bitmap) this.f23719f.get());
    }
}

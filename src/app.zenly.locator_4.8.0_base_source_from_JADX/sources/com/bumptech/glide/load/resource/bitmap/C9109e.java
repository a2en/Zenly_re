package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
public class C9109e implements Resource<Bitmap>, Initializable {

    /* renamed from: e */
    private final Bitmap f23684e;

    /* renamed from: f */
    private final BitmapPool f23685f;

    public C9109e(Bitmap bitmap, BitmapPool bitmapPool) {
        C9216j.m22084a(bitmap, "Bitmap must not be null");
        this.f23684e = bitmap;
        C9216j.m22084a(bitmapPool, "BitmapPool must not be null");
        this.f23685f = bitmapPool;
    }

    /* renamed from: a */
    public static C9109e m21814a(Bitmap bitmap, BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new C9109e(bitmap, bitmapPool);
    }

    public Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }

    public int getSize() {
        return C9217k.m22093a(this.f23684e);
    }

    public void initialize() {
        this.f23684e.prepareToDraw();
    }

    public void recycle() {
        this.f23685f.put(this.f23684e);
    }

    public Bitmap get() {
        return this.f23684e;
    }
}

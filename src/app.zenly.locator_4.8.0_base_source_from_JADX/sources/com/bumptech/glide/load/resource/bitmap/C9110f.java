package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.p301o.C9217k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f */
public abstract class C9110f implements Transformation<Bitmap> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo8554a(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2);

    public final Resource<Bitmap> transform(Context context, Resource<Bitmap> resource, int i, int i2) {
        if (C9217k.m22104b(i, i2)) {
            BitmapPool c = Glide.m21128a(context).mo24091c();
            Bitmap bitmap = (Bitmap) resource.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo8554a(c, bitmap, i, i2);
            return bitmap.equals(a) ? resource : C9109e.m21814a(a, c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
}

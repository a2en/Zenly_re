package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.o */
public class C9131o implements Transformation<Drawable> {

    /* renamed from: b */
    private final Transformation<Bitmap> f23707b;

    /* renamed from: c */
    private final boolean f23708c;

    public C9131o(Transformation<Bitmap> transformation, boolean z) {
        this.f23707b = transformation;
        this.f23708c = z;
    }

    /* renamed from: a */
    private Resource<Drawable> m21864a(Context context, Resource<Bitmap> resource) {
        return C9136t.m21874a(context.getResources(), resource);
    }

    /* renamed from: a */
    public Transformation<BitmapDrawable> mo24640a() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9131o)) {
            return false;
        }
        return this.f23707b.equals(((C9131o) obj).f23707b);
    }

    public int hashCode() {
        return this.f23707b.hashCode();
    }

    public Resource<Drawable> transform(Context context, Resource<Drawable> resource, int i, int i2) {
        Drawable drawable = (Drawable) resource.get();
        Resource a = C9129n.m21862a(Glide.m21128a(context).mo24091c(), drawable, i, i2);
        if (a != null) {
            Resource transform = this.f23707b.transform(context, a, i, i2);
            if (!transform.equals(a)) {
                return m21864a(context, transform);
            }
            transform.recycle();
            return resource;
        } else if (!this.f23708c) {
            return resource;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(drawable);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f23707b.updateDiskCacheKey(messageDigest);
    }
}

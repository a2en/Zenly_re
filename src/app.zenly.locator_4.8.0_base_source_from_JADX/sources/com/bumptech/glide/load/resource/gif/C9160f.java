package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.C9109e;
import com.bumptech.glide.p301o.C9216j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.gif.f */
public class C9160f implements Transformation<C9156c> {

    /* renamed from: b */
    private final Transformation<Bitmap> f23786b;

    public C9160f(Transformation<Bitmap> transformation) {
        C9216j.m22083a(transformation);
        this.f23786b = transformation;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9160f)) {
            return false;
        }
        return this.f23786b.equals(((C9160f) obj).f23786b);
    }

    public int hashCode() {
        return this.f23786b.hashCode();
    }

    public Resource<C9156c> transform(Context context, Resource<C9156c> resource, int i, int i2) {
        C9156c cVar = (C9156c) resource.get();
        C9109e eVar = new C9109e(cVar.mo24694b(), Glide.m21128a(context).mo24091c());
        Resource transform = this.f23786b.transform(context, eVar, i, i2);
        if (!eVar.equals(transform)) {
            eVar.recycle();
        }
        cVar.mo24693a(this.f23786b, (Bitmap) transform.get());
        return resource;
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f23786b.updateDiskCacheKey(messageDigest);
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.p294h.p296e.C9024d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.v */
public class C9139v implements ResourceDecoder<Uri, Bitmap> {

    /* renamed from: a */
    private final C9024d f23726a;

    /* renamed from: b */
    private final BitmapPool f23727b;

    public C9139v(C9024d dVar, BitmapPool bitmapPool) {
        this.f23726a = dVar;
        this.f23727b = bitmapPool;
    }

    /* renamed from: a */
    public boolean handles(Uri uri, C9011f fVar) {
        return "android.resource".equals(uri.getScheme());
    }

    /* renamed from: a */
    public Resource<Bitmap> decode(Uri uri, int i, int i2, C9011f fVar) {
        Resource a = this.f23726a.decode(uri, i, i2, fVar);
        if (a == null) {
            return null;
        }
        return C9129n.m21862a(this.f23727b, (Drawable) a.get(), i, i2);
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C8884c;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
public class C9106b implements ResourceEncoder<BitmapDrawable> {

    /* renamed from: a */
    private final BitmapPool f23678a;

    /* renamed from: b */
    private final ResourceEncoder<Bitmap> f23679b;

    public C9106b(BitmapPool bitmapPool, ResourceEncoder<Bitmap> resourceEncoder) {
        this.f23678a = bitmapPool;
        this.f23679b = resourceEncoder;
    }

    /* renamed from: a */
    public boolean encode(Resource<BitmapDrawable> resource, File file, C9011f fVar) {
        return this.f23679b.encode(new C9109e(((BitmapDrawable) resource.get()).getBitmap(), this.f23678a), file, fVar);
    }

    public C8884c getEncodeStrategy(C9011f fVar) {
        return this.f23679b.getEncodeStrategy(fVar);
    }
}

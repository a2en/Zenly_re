package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p301o.C9216j;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public class C9098a<DataType> implements ResourceDecoder<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final ResourceDecoder<DataType, Bitmap> f23668a;

    /* renamed from: b */
    private final Resources f23669b;

    public C9098a(Resources resources, ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        C9216j.m22083a(resources);
        this.f23669b = resources;
        C9216j.m22083a(resourceDecoder);
        this.f23668a = resourceDecoder;
    }

    public Resource<BitmapDrawable> decode(DataType datatype, int i, int i2, C9011f fVar) throws IOException {
        return C9136t.m21874a(this.f23669b, this.f23668a.decode(datatype, i, i2, fVar));
    }

    public boolean handles(DataType datatype, C9011f fVar) throws IOException {
        return this.f23668a.handles(datatype, fVar);
    }
}

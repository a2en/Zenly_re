package com.bumptech.glide.load.resource.transcode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.C9136t;
import com.bumptech.glide.p301o.C9216j;

/* renamed from: com.bumptech.glide.load.resource.transcode.b */
public class C9165b implements ResourceTranscoder<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f23795a;

    public C9165b(Resources resources) {
        C9216j.m22083a(resources);
        this.f23795a = resources;
    }

    public Resource<BitmapDrawable> transcode(Resource<Bitmap> resource, C9011f fVar) {
        return C9136t.m21874a(this.f23795a, resource);
    }
}

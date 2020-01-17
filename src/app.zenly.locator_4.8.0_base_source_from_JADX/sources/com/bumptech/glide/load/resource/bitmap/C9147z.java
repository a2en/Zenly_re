package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p301o.C9217k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.z */
public final class C9147z implements ResourceDecoder<Bitmap, Bitmap> {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.z$a */
    private static final class C9148a implements Resource<Bitmap> {

        /* renamed from: e */
        private final Bitmap f23740e;

        C9148a(Bitmap bitmap) {
            this.f23740e = bitmap;
        }

        public Class<Bitmap> getResourceClass() {
            return Bitmap.class;
        }

        public int getSize() {
            return C9217k.m22093a(this.f23740e);
        }

        public void recycle() {
        }

        public Bitmap get() {
            return this.f23740e;
        }
    }

    /* renamed from: a */
    public Resource<Bitmap> decode(Bitmap bitmap, int i, int i2, C9011f fVar) {
        return new C9148a(bitmap);
    }

    /* renamed from: a */
    public boolean handles(Bitmap bitmap, C9011f fVar) {
        return true;
    }
}

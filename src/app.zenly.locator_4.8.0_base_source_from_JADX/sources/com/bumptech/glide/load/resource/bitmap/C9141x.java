package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks;
import com.bumptech.glide.p301o.C9208d;
import com.bumptech.glide.p301o.C9214h;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.x */
public class C9141x implements ResourceDecoder<InputStream, Bitmap> {

    /* renamed from: a */
    private final Downsampler f23730a;

    /* renamed from: b */
    private final ArrayPool f23731b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.x$a */
    static class C9142a implements DecodeCallbacks {

        /* renamed from: a */
        private final C9137u f23732a;

        /* renamed from: b */
        private final C9208d f23733b;

        C9142a(C9137u uVar, C9208d dVar) {
            this.f23732a = uVar;
            this.f23733b = dVar;
        }

        public void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException {
            IOException a = this.f23733b.mo24808a();
            if (a != null) {
                if (bitmap != null) {
                    bitmapPool.put(bitmap);
                }
                throw a;
            }
        }

        public void onObtainBounds() {
            this.f23732a.mo24645a();
        }
    }

    public C9141x(Downsampler downsampler, ArrayPool arrayPool) {
        this.f23730a = downsampler;
        this.f23731b = arrayPool;
    }

    /* renamed from: a */
    public boolean handles(InputStream inputStream, C9011f fVar) {
        return this.f23730a.mo24613a(inputStream);
    }

    /* renamed from: a */
    public Resource<Bitmap> decode(InputStream inputStream, int i, int i2, C9011f fVar) throws IOException {
        C9137u uVar;
        boolean z;
        if (inputStream instanceof C9137u) {
            uVar = (C9137u) inputStream;
            z = false;
        } else {
            uVar = new C9137u(inputStream, this.f23731b);
            z = true;
        }
        C9208d b = C9208d.m22066b(uVar);
        try {
            return this.f23730a.mo24612a((InputStream) new C9214h(b), i, i2, fVar, (DecodeCallbacks) new C9142a(uVar, b));
        } finally {
            b.release();
            if (z) {
                uVar.release();
            }
        }
    }
}

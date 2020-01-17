package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.p294h.p295d.C9020b;
import java.io.ByteArrayOutputStream;

/* renamed from: com.bumptech.glide.load.resource.transcode.a */
public class C9164a implements ResourceTranscoder<Bitmap, byte[]> {

    /* renamed from: a */
    private final CompressFormat f23793a;

    /* renamed from: b */
    private final int f23794b;

    public C9164a() {
        this(CompressFormat.JPEG, 100);
    }

    public Resource<byte[]> transcode(Resource<Bitmap> resource, C9011f fVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) resource.get()).compress(this.f23793a, this.f23794b, byteArrayOutputStream);
        resource.recycle();
        return new C9020b(byteArrayOutputStream.toByteArray());
    }

    public C9164a(CompressFormat compressFormat, int i) {
        this.f23793a = compressFormat;
        this.f23794b = i;
    }
}

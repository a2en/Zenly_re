package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import android.util.Log;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.C8924d;
import com.bumptech.glide.load.p294h.C9013a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
public final class C9108d extends C9013a<Bitmap> {

    /* renamed from: b */
    private final BitmapPool f23683b = new C8924d();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Resource<Bitmap> mo24520a(Source source, int i, int i2, OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        String str = "BitmapImageDecoder";
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(decodeBitmap.getWidth());
            String str2 = "x";
            sb.append(str2);
            sb.append(decodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append(str2);
            sb.append(i2);
            sb.append("]");
            Log.v(str, sb.toString());
        }
        return new C9109e(decodeBitmap, this.f23683b);
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.p301o.C9203a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
public final class C9132p implements ImageHeaderParser {
    public int getOrientation(InputStream inputStream, ArrayPool arrayPool) throws IOException {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    public ImageType getType(InputStream inputStream) throws IOException {
        return ImageType.UNKNOWN;
    }

    public ImageType getType(ByteBuffer byteBuffer) throws IOException {
        return ImageType.UNKNOWN;
    }

    public int getOrientation(ByteBuffer byteBuffer, ArrayPool arrayPool) throws IOException {
        return getOrientation(C9203a.m22060c(byteBuffer), arrayPool);
    }
}

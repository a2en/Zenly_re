package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.request.target.g */
public class C9236g {
    /* renamed from: a */
    public <Z> C9238i<ImageView, Z> mo24918a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C9229b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C9234e(imageView);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unhandled class: ");
        sb.append(cls);
        sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(sb.toString());
    }
}

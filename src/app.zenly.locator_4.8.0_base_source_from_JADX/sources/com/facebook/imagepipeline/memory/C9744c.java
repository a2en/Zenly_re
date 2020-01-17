package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.logging.C9543a;
import com.facebook.imageutils.C9896a;

/* renamed from: com.facebook.imagepipeline.memory.c */
public class C9744c extends C9764r<Bitmap> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo26522b(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        String str = "BitmapPoolBackend";
        if (bitmap.isRecycled()) {
            C9543a.m23325d(str, "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            C9543a.m23325d(str, "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    /* renamed from: c */
    public void put(Bitmap bitmap) {
        if (mo26522b(bitmap)) {
            super.put(bitmap);
        }
    }

    /* renamed from: a */
    public int mo26521a(Bitmap bitmap) {
        return C9896a.m24733a(bitmap);
    }

    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap == null || !mo26522b(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }
}

package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.C9537k;
import com.facebook.common.memory.C9545a;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.n */
public class C9758n implements BitmapPool {

    /* renamed from: a */
    private final Set<Bitmap> f25658a = C9537k.m23283b();

    /* renamed from: a */
    public void release(Bitmap bitmap) {
        C9536j.m23271a(bitmap);
        this.f25658a.remove(bitmap);
        bitmap.recycle();
    }

    public void trim(C9545a aVar) {
    }

    public Bitmap get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Config.RGB_565);
        this.f25658a.add(createBitmap);
        return createBitmap;
    }
}

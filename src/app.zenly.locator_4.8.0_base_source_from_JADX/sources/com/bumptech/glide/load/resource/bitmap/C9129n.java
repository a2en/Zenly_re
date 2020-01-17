package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.C8924d;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
final class C9129n {

    /* renamed from: a */
    private static final BitmapPool f23706a = new C9130a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.n$a */
    class C9130a extends C8924d {
        C9130a() {
        }

        public void put(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static Resource<Bitmap> m21862a(BitmapPool bitmapPool, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m21863b(bitmapPool, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            bitmapPool = f23706a;
        }
        return C9109e.m21814a(bitmap, bitmapPool);
    }

    /* renamed from: b */
    private static Bitmap m21863b(BitmapPool bitmapPool, Drawable drawable, int i, int i2) {
        String str = "Unable to draw ";
        String str2 = "DrawableToBitmap";
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                Log.w(str2, sb.toString());
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock a = C9143y.m21889a();
            a.lock();
            Bitmap bitmap = bitmapPool.get(i, i2, Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmap);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return bitmap;
            } finally {
                a.unlock();
            }
        } else {
            if (Log.isLoggable(str2, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w(str2, sb2.toString());
            }
            return null;
        }
    }
}

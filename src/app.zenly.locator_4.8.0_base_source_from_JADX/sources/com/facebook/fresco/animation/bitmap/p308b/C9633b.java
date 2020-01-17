package com.facebook.fresco.animation.bitmap.p308b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.common.logging.C9543a;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.Callback;

/* renamed from: com.facebook.fresco.animation.bitmap.b.b */
public class C9633b implements BitmapFrameRenderer {

    /* renamed from: e */
    private static final Class<?> f25121e = C9633b.class;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final BitmapFrameCache f25122a;

    /* renamed from: b */
    private AnimatedDrawableBackend f25123b;

    /* renamed from: c */
    private AnimatedImageCompositor f25124c;

    /* renamed from: d */
    private final Callback f25125d = new C9634a();

    /* renamed from: com.facebook.fresco.animation.bitmap.b.b$a */
    class C9634a implements Callback {
        C9634a() {
        }

        public CloseableReference<Bitmap> getCachedBitmap(int i) {
            return C9633b.this.f25122a.getCachedFrame(i);
        }

        public void onIntermediateResult(int i, Bitmap bitmap) {
        }
    }

    public C9633b(BitmapFrameCache bitmapFrameCache, AnimatedDrawableBackend animatedDrawableBackend) {
        this.f25122a = bitmapFrameCache;
        this.f25123b = animatedDrawableBackend;
        this.f25124c = new AnimatedImageCompositor(this.f25123b, this.f25125d);
    }

    public int getIntrinsicHeight() {
        return this.f25123b.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f25123b.getWidth();
    }

    public boolean renderFrame(int i, Bitmap bitmap) {
        try {
            this.f25124c.mo26189a(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            C9543a.m23307a(f25121e, (Throwable) e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i));
            return false;
        }
    }

    public void setBounds(Rect rect) {
        AnimatedDrawableBackend forNewBounds = this.f25123b.forNewBounds(rect);
        if (forNewBounds != this.f25123b) {
            this.f25123b = forNewBounds;
            this.f25124c = new AnimatedImageCompositor(this.f25123b, this.f25125d);
        }
    }
}

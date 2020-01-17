package com.facebook.fresco.animation.bitmap.preparation;

import com.facebook.common.logging.C9543a;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;

/* renamed from: com.facebook.fresco.animation.bitmap.preparation.b */
public class C9637b implements BitmapFramePreparationStrategy {

    /* renamed from: b */
    private static final Class<?> f25138b = C9637b.class;

    /* renamed from: a */
    private final int f25139a;

    public C9637b() {
        this(3);
    }

    public void prepareFrames(BitmapFramePreparer bitmapFramePreparer, BitmapFrameCache bitmapFrameCache, AnimationBackend animationBackend, int i) {
        int i2 = 1;
        while (i2 <= this.f25139a) {
            int frameCount = (i + i2) % animationBackend.getFrameCount();
            if (C9543a.m23311a(2)) {
                C9543a.m23302a(f25138b, "Preparing frame %d, last drawn: %d", (Object) Integer.valueOf(frameCount), (Object) Integer.valueOf(i));
            }
            if (bitmapFramePreparer.prepareFrame(bitmapFrameCache, animationBackend, frameCount)) {
                i2++;
            } else {
                return;
            }
        }
    }

    public C9637b(int i) {
        this.f25139a = i;
    }
}

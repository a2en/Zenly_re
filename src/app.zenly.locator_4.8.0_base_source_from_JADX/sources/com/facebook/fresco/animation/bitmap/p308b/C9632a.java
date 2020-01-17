package com.facebook.fresco.animation.bitmap.p308b;

import com.facebook.fresco.animation.backend.AnimationInformation;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;

/* renamed from: com.facebook.fresco.animation.bitmap.b.a */
public class C9632a implements AnimationInformation {

    /* renamed from: a */
    private final AnimatedDrawableBackend f25120a;

    public C9632a(AnimatedDrawableBackend animatedDrawableBackend) {
        this.f25120a = animatedDrawableBackend;
    }

    public int getFrameCount() {
        return this.f25120a.getFrameCount();
    }

    public int getFrameDurationMs(int i) {
        return this.f25120a.getDurationMsForFrame(i);
    }

    public int getLoopCount() {
        return this.f25120a.getLoopCount();
    }
}

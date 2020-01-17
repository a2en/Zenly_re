package com.facebook.imagepipeline.animated.impl;

import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.C9656b;

public interface AnimatedDrawableBackendProvider {
    AnimatedDrawableBackend get(C9656b bVar, Rect rect);
}

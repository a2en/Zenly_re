package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.C9701e;

public interface ThumbnailProducer<T> extends Producer<T> {
    boolean canProvideImageForSize(C9701e eVar);
}

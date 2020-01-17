package com.bumptech.glide.request;

import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.Target;

public interface RequestListener<R> {
    boolean onLoadFailed(GlideException glideException, Object obj, Target<R> target, boolean z);

    boolean onResourceReady(R r, Object obj, Target<R> target, C8882a aVar, boolean z);
}

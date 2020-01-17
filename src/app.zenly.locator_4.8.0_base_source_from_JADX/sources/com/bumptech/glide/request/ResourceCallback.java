package com.bumptech.glide.request;

import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;

public interface ResourceCallback {
    Object getLock();

    void onLoadFailed(GlideException glideException);

    void onResourceReady(Resource<?> resource, C8882a aVar);
}

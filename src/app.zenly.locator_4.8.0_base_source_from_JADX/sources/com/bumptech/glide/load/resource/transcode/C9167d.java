package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.p294h.p295d.C9020b;
import com.bumptech.glide.load.resource.gif.C9156c;
import com.bumptech.glide.p301o.C9203a;

/* renamed from: com.bumptech.glide.load.resource.transcode.d */
public class C9167d implements ResourceTranscoder<C9156c, byte[]> {
    public Resource<byte[]> transcode(Resource<C9156c> resource, C9011f fVar) {
        return new C9020b(C9203a.m22059b(((C9156c) resource.get()).mo24692a()));
    }
}

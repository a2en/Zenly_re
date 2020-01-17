package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.engine.Resource;

/* renamed from: com.bumptech.glide.load.resource.transcode.f */
public class C9170f<Z> implements ResourceTranscoder<Z, Z> {

    /* renamed from: a */
    private static final C9170f<?> f23803a = new C9170f<>();

    /* renamed from: a */
    public static <Z> ResourceTranscoder<Z, Z> m21957a() {
        return f23803a;
    }

    public Resource<Z> transcode(Resource<Z> resource, C9011f fVar) {
        return resource;
    }
}

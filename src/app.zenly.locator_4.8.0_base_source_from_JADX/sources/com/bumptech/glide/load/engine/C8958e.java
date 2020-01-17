package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.e */
class C8958e<DataType> implements Writer {

    /* renamed from: a */
    private final Encoder<DataType> f23333a;

    /* renamed from: b */
    private final DataType f23334b;

    /* renamed from: c */
    private final C9011f f23335c;

    C8958e(Encoder<DataType> encoder, DataType datatype, C9011f fVar) {
        this.f23333a = encoder;
        this.f23334b = datatype;
        this.f23335c = fVar;
    }

    public boolean write(File file) {
        return this.f23333a.encode(this.f23334b, file, this.f23335c);
    }
}

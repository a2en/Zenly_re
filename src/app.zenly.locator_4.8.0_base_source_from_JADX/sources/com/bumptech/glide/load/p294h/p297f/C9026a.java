package com.bumptech.glide.load.p294h.p297f;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;

/* renamed from: com.bumptech.glide.load.h.f.a */
public class C9026a implements ResourceDecoder<File, File> {
    /* renamed from: a */
    public Resource<File> decode(File file, int i, int i2, C9011f fVar) {
        return new C9027b(file);
    }

    /* renamed from: a */
    public boolean handles(File file, C9011f fVar) {
        return true;
    }
}

package com.bumptech.glide.load.p294h.p295d;

import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.h.d.a */
public class C9018a implements DataRewinder<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f23554a;

    /* renamed from: com.bumptech.glide.load.h.d.a$a */
    public static class C9019a implements Factory<ByteBuffer> {
        /* renamed from: a */
        public DataRewinder<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new C9018a(byteBuffer);
        }

        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }
    }

    public C9018a(ByteBuffer byteBuffer) {
        this.f23554a = byteBuffer;
    }

    public void cleanup() {
    }

    public ByteBuffer rewindAndGet() {
        this.f23554a.position(0);
        return this.f23554a;
    }
}

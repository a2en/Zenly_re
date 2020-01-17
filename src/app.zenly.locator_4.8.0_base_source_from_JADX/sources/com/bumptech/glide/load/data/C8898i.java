package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.DataRewinder.Factory;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.C9137u;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.i */
public final class C8898i implements DataRewinder<InputStream> {

    /* renamed from: a */
    private final C9137u f23205a;

    /* renamed from: com.bumptech.glide.load.data.i$a */
    public static final class C8899a implements Factory<InputStream> {

        /* renamed from: a */
        private final ArrayPool f23206a;

        public C8899a(ArrayPool arrayPool) {
            this.f23206a = arrayPool;
        }

        /* renamed from: a */
        public DataRewinder<InputStream> build(InputStream inputStream) {
            return new C8898i(inputStream, this.f23206a);
        }

        public Class<InputStream> getDataClass() {
            return InputStream.class;
        }
    }

    C8898i(InputStream inputStream, ArrayPool arrayPool) {
        this.f23205a = new C9137u(inputStream, arrayPool);
        this.f23205a.mark(5242880);
    }

    public void cleanup() {
        this.f23205a.release();
    }

    public InputStream rewindAndGet() throws IOException {
        this.f23205a.reset();
        return this.f23205a;
    }
}

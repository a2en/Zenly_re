package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.y */
public class C9882y extends C9879x {
    public C9882y(Executor executor, PooledByteBufferFactory pooledByteBufferFactory) {
        super(executor, pooledByteBufferFactory);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9732e mo26645a(C9884a aVar) throws IOException {
        return mo26688b(new FileInputStream(aVar.mo26742o().toString()), (int) aVar.mo26742o().length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26646a() {
        return "LocalFileFetchProducer";
    }
}

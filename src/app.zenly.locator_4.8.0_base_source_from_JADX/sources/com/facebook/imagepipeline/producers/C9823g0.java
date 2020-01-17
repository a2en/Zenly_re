package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.g0 */
public class C9823g0 extends C9879x {

    /* renamed from: c */
    private final ContentResolver f25793c;

    public C9823g0(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        this.f25793c = contentResolver;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9732e mo26645a(C9884a aVar) throws IOException {
        return mo26688b(this.f25793c.openInputStream(aVar.mo26743p()), -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26646a() {
        return "QualifiedResourceFetchProducer";
    }
}

package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.C9525b;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.x */
public abstract class C9879x implements Producer<C9732e> {

    /* renamed from: a */
    private final Executor f25942a;

    /* renamed from: b */
    private final PooledByteBufferFactory f25943b;

    /* renamed from: com.facebook.imagepipeline.producers.x$a */
    class C9880a extends C9836j0<C9732e> {

        /* renamed from: j */
        final /* synthetic */ C9884a f25944j;

        /* renamed from: k */
        final /* synthetic */ ProducerListener f25945k;

        /* renamed from: l */
        final /* synthetic */ String f25946l;

        C9880a(Consumer consumer, ProducerListener producerListener, String str, String str2, C9884a aVar, ProducerListener producerListener2, String str3) {
            this.f25944j = aVar;
            this.f25945k = producerListener2;
            this.f25946l = str3;
            super(consumer, producerListener, str, str2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo25653a(C9732e eVar) {
            C9732e.m24069c(eVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C9732e m24637b() throws Exception {
            C9732e a = C9879x.this.mo26645a(this.f25944j);
            if (a == null) {
                this.f25945k.onUltimateProducerReached(this.f25946l, C9879x.this.mo26646a(), false);
                return null;
            }
            a.mo26440n();
            this.f25945k.onUltimateProducerReached(this.f25946l, C9879x.this.mo26646a(), true);
            return a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.x$b */
    class C9881b extends C9810e {

        /* renamed from: a */
        final /* synthetic */ C9836j0 f25948a;

        C9881b(C9879x xVar, C9836j0 j0Var) {
            this.f25948a = j0Var;
        }

        public void onCancellationRequested() {
            this.f25948a.mo25651a();
        }
    }

    protected C9879x(Executor executor, PooledByteBufferFactory pooledByteBufferFactory) {
        this.f25942a = executor;
        this.f25943b = pooledByteBufferFactory;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C9732e mo26645a(C9884a aVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9732e mo26687a(InputStream inputStream, int i) throws IOException {
        CloseableReference closeableReference;
        if (i <= 0) {
            try {
                closeableReference = CloseableReference.m23349a(this.f25943b.newByteBuffer(inputStream));
            } catch (Throwable th) {
                C9525b.m23253a(inputStream);
                CloseableReference.m23355b(null);
                throw th;
            }
        } else {
            closeableReference = CloseableReference.m23349a(this.f25943b.newByteBuffer(inputStream, i));
        }
        CloseableReference closeableReference2 = closeableReference;
        C9732e eVar = new C9732e(closeableReference2);
        C9525b.m23253a(inputStream);
        CloseableReference.m23355b(closeableReference2);
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo26646a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9732e mo26688b(InputStream inputStream, int i) throws IOException {
        return mo26687a(inputStream, i);
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        ProducerListener listener = producerContext.getListener();
        String id = producerContext.getId();
        Consumer<C9732e> consumer2 = consumer;
        ProducerListener producerListener = listener;
        C9880a aVar = new C9880a(consumer2, producerListener, mo26646a(), id, producerContext.getImageRequest(), listener, id);
        producerContext.addCallbacks(new C9881b(this, aVar));
        this.f25942a.execute(aVar);
    }
}

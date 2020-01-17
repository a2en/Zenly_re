package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.C9549e;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.C9697a;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.producers.NetworkFetcher.Callback;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.c0 */
public class C9803c0 implements Producer<C9732e> {

    /* renamed from: a */
    private final PooledByteBufferFactory f25736a;

    /* renamed from: b */
    private final ByteArrayPool f25737b;

    /* renamed from: c */
    private final NetworkFetcher f25738c;

    /* renamed from: com.facebook.imagepipeline.producers.c0$a */
    class C9804a implements Callback {

        /* renamed from: a */
        final /* synthetic */ C9868r f25739a;

        C9804a(C9868r rVar) {
            this.f25739a = rVar;
        }

        public void onCancellation() {
            C9803c0.this.m24371a(this.f25739a);
        }

        public void onFailure(Throwable th) {
            C9803c0.this.m24372a(this.f25739a, th);
        }

        public void onResponse(InputStream inputStream, int i) throws IOException {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("NetworkFetcher->onResponse");
            }
            C9803c0.this.mo26627a(this.f25739a, inputStream, i);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    public C9803c0(PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, NetworkFetcher networkFetcher) {
        this.f25736a = pooledByteBufferFactory;
        this.f25737b = byteArrayPool;
        this.f25738c = networkFetcher;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26628b(C9549e eVar, C9868r rVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (m24373b(rVar) && uptimeMillis - rVar.mo26673d() >= 100) {
            rVar.mo26670a(uptimeMillis);
            rVar.mo26674e().onProducerEvent(rVar.mo26672c(), "NetworkFetchProducer", "intermediate_result");
            m24368a(eVar, rVar.mo26675f(), rVar.mo26676g(), rVar.mo26669a());
        }
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        producerContext.getListener().onProducerStart(producerContext.getId(), "NetworkFetchProducer");
        C9868r createFetchState = this.f25738c.createFetchState(consumer, producerContext);
        this.f25738c.fetch(createFetchState, new C9804a(createFetchState));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26627a(C9868r rVar, InputStream inputStream, int i) throws IOException {
        C9549e eVar;
        if (i > 0) {
            eVar = this.f25736a.newOutputStream(i);
        } else {
            eVar = this.f25736a.newOutputStream();
        }
        byte[] bArr = (byte[]) this.f25737b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f25738c.onFetchCompletion(rVar, eVar.size());
                    mo26626a(eVar, rVar);
                    return;
                } else if (read > 0) {
                    eVar.write(bArr, 0, read);
                    mo26628b(eVar, rVar);
                    rVar.mo26669a().onProgressUpdate(m24366a(eVar.size(), i));
                }
            } finally {
                this.f25737b.release(bArr);
                eVar.close();
            }
        }
    }

    /* renamed from: b */
    private boolean m24373b(C9868r rVar) {
        if (!rVar.mo26671b().isIntermediateResultExpected()) {
            return false;
        }
        return this.f25738c.shouldPropagate(rVar);
    }

    /* renamed from: a */
    protected static float m24366a(int i, int i2) {
        return i2 > 0 ? ((float) i) / ((float) i2) : 1.0f - ((float) Math.exp(((double) (-i)) / 50000.0d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26626a(C9549e eVar, C9868r rVar) {
        Map a = m24367a(rVar, eVar.size());
        ProducerListener e = rVar.mo26674e();
        String str = "NetworkFetchProducer";
        e.onProducerFinishWithSuccess(rVar.mo26672c(), str, a);
        e.onUltimateProducerReached(rVar.mo26672c(), str, true);
        m24368a(eVar, rVar.mo26675f() | 1, rVar.mo26676g(), rVar.mo26669a());
    }

    /* renamed from: a */
    protected static void m24368a(C9549e eVar, int i, C9697a aVar, Consumer<C9732e> consumer) {
        C9732e eVar2;
        CloseableReference a = CloseableReference.m23349a(eVar.mo25719a());
        try {
            eVar2 = new C9732e(a);
            try {
                eVar2.mo26419a(aVar);
                eVar2.mo26440n();
                consumer.onNewResult(eVar2, i);
                C9732e.m24069c(eVar2);
                CloseableReference.m23355b(a);
            } catch (Throwable th) {
                th = th;
                C9732e.m24069c(eVar2);
                CloseableReference.m23355b(a);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            eVar2 = null;
            C9732e.m24069c(eVar2);
            CloseableReference.m23355b(a);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24372a(C9868r rVar, Throwable th) {
        String str = "NetworkFetchProducer";
        rVar.mo26674e().onProducerFinishWithFailure(rVar.mo26672c(), str, th, null);
        rVar.mo26674e().onUltimateProducerReached(rVar.mo26672c(), str, false);
        rVar.mo26669a().onFailure(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24371a(C9868r rVar) {
        rVar.mo26674e().onProducerFinishWithCancellation(rVar.mo26672c(), "NetworkFetchProducer", null);
        rVar.mo26669a().onCancellation();
    }

    /* renamed from: a */
    private Map<String, String> m24367a(C9868r rVar, int i) {
        if (!rVar.mo26674e().requiresExtraMap(rVar.mo26672c())) {
            return null;
        }
        return this.f25738c.getExtraMap(rVar, i);
    }
}

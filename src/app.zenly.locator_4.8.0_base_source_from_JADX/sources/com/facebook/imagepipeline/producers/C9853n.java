package com.facebook.imagepipeline.producers;

import bolts.Continuation;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9530g;
import com.facebook.imagepipeline.cache.C9678e;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.C9884a.C9885a;
import com.facebook.imagepipeline.request.C9884a.C9886b;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.producers.n */
public class C9853n implements Producer<C9732e> {

    /* renamed from: a */
    private final C9678e f25873a;

    /* renamed from: b */
    private final C9678e f25874b;

    /* renamed from: c */
    private final CacheKeyFactory f25875c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Producer<C9732e> f25876d;

    /* renamed from: com.facebook.imagepipeline.producers.n$a */
    class C9854a implements Continuation<C9732e, Void> {

        /* renamed from: a */
        final /* synthetic */ ProducerListener f25877a;

        /* renamed from: b */
        final /* synthetic */ String f25878b;

        /* renamed from: c */
        final /* synthetic */ Consumer f25879c;

        /* renamed from: d */
        final /* synthetic */ ProducerContext f25880d;

        C9854a(ProducerListener producerListener, String str, Consumer consumer, ProducerContext producerContext) {
            this.f25877a = producerListener;
            this.f25878b = str;
            this.f25879c = consumer;
            this.f25880d = producerContext;
        }

        public Void then(Task<C9732e> task) throws Exception {
            String str = "DiskCacheProducer";
            if (C9853n.m24543b(task)) {
                this.f25877a.onProducerFinishWithCancellation(this.f25878b, str, null);
                this.f25879c.onCancellation();
            } else if (task.mo14186e()) {
                this.f25877a.onProducerFinishWithFailure(this.f25878b, str, task.mo14180a(), null);
                C9853n.this.f25876d.produceResults(this.f25879c, this.f25880d);
            } else {
                C9732e eVar = (C9732e) task.mo14183b();
                if (eVar != null) {
                    ProducerListener producerListener = this.f25877a;
                    String str2 = this.f25878b;
                    producerListener.onProducerFinishWithSuccess(str2, str, C9853n.m24538a(producerListener, str2, true, eVar.mo26437k()));
                    this.f25877a.onUltimateProducerReached(this.f25878b, str, true);
                    this.f25879c.onProgressUpdate(1.0f);
                    this.f25879c.onNewResult(eVar, 1);
                    eVar.close();
                } else {
                    ProducerListener producerListener2 = this.f25877a;
                    String str3 = this.f25878b;
                    producerListener2.onProducerFinishWithSuccess(str3, str, C9853n.m24538a(producerListener2, str3, false, 0));
                    C9853n.this.f25876d.produceResults(this.f25879c, this.f25880d);
                }
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.n$b */
    class C9855b extends C9810e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f25882a;

        C9855b(C9853n nVar, AtomicBoolean atomicBoolean) {
            this.f25882a = atomicBoolean;
        }

        public void onCancellationRequested() {
            this.f25882a.set(true);
        }
    }

    public C9853n(C9678e eVar, C9678e eVar2, CacheKeyFactory cacheKeyFactory, Producer<C9732e> producer) {
        this.f25873a = eVar;
        this.f25874b = eVar2;
        this.f25875c = cacheKeyFactory;
        this.f25876d = producer;
    }

    /* renamed from: b */
    private Continuation<C9732e, Void> m24542b(Consumer<C9732e> consumer, ProducerContext producerContext) {
        C9854a aVar = new C9854a(producerContext.getListener(), producerContext.getId(), consumer, producerContext);
        return aVar;
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        C9884a imageRequest = producerContext.getImageRequest();
        if (!imageRequest.mo26745r()) {
            m24539a(consumer, producerContext);
            return;
        }
        producerContext.getListener().onProducerStart(producerContext.getId(), "DiskCacheProducer");
        CacheKey encodedCacheKey = this.f25875c.getEncodedCacheKey(imageRequest, producerContext.getCallerContext());
        C9678e eVar = imageRequest.mo26727b() == C9885a.SMALL ? this.f25874b : this.f25873a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eVar.mo26232a(encodedCacheKey, atomicBoolean).mo14178a(m24542b(consumer, producerContext));
        m24540a(atomicBoolean, producerContext);
    }

    /* renamed from: a */
    private void m24539a(Consumer<C9732e> consumer, ProducerContext producerContext) {
        if (producerContext.getLowestPermittedRequestLevel().mo26749a() >= C9886b.DISK_CACHE.mo26749a()) {
            consumer.onNewResult(null, 1);
        } else {
            this.f25876d.produceResults(consumer, producerContext);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m24543b(Task<?> task) {
        return task.mo14184c() || (task.mo14186e() && (task.mo14180a() instanceof CancellationException));
    }

    /* renamed from: a */
    static Map<String, String> m24538a(ProducerListener producerListener, String str, boolean z, int i) {
        if (!producerListener.requiresExtraMap(str)) {
            return null;
        }
        String str2 = "cached_value_found";
        if (!z) {
            return C9530g.m23258a(str2, String.valueOf(z));
        }
        return C9530g.m23259a(str2, String.valueOf(z), "encodedImageSize", String.valueOf(i));
    }

    /* renamed from: a */
    private void m24540a(AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.addCallbacks(new C9855b(this, atomicBoolean));
    }
}

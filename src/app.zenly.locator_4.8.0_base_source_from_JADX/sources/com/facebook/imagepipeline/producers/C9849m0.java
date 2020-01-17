package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.C9536j;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.m0 */
public class C9849m0<T> implements Producer<T> {

    /* renamed from: a */
    private final Producer<T> f25865a;

    /* renamed from: b */
    private final int f25866b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f25867c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ConcurrentLinkedQueue<Pair<Consumer<T>, ProducerContext>> f25868d = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Executor f25869e;

    /* renamed from: com.facebook.imagepipeline.producers.m0$b */
    private class C9851b extends C9848m<T, T> {

        /* renamed from: com.facebook.imagepipeline.producers.m0$b$a */
        class C9852a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Pair f25871e;

            C9852a(Pair pair) {
                this.f25871e = pair;
            }

            public void run() {
                C9849m0 m0Var = C9849m0.this;
                Pair pair = this.f25871e;
                m0Var.mo26660a((Consumer) pair.first, (ProducerContext) pair.second);
            }
        }

        /* renamed from: c */
        private void m24533c() {
            Pair pair;
            synchronized (C9849m0.this) {
                pair = (Pair) C9849m0.this.f25868d.poll();
                if (pair == null) {
                    C9849m0.this.f25867c = C9849m0.this.f25867c - 1;
                }
            }
            if (pair != null) {
                C9849m0.this.f25869e.execute(new C9852a(pair));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(T t, int i) {
            mo26659b().onNewResult(t, i);
            if (C9796b.m24323a(i)) {
                m24533c();
            }
        }

        private C9851b(Consumer<T> consumer) {
            super(consumer);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26617a(Throwable th) {
            mo26659b().onFailure(th);
            m24533c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26614a() {
            mo26659b().onCancellation();
            m24533c();
        }
    }

    public C9849m0(int i, Executor executor, Producer<T> producer) {
        this.f25866b = i;
        C9536j.m23271a(executor);
        this.f25869e = executor;
        C9536j.m23271a(producer);
        this.f25865a = producer;
    }

    public void produceResults(Consumer<T> consumer, ProducerContext producerContext) {
        boolean z;
        producerContext.getListener().onProducerStart(producerContext.getId(), "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.f25867c >= this.f25866b) {
                this.f25868d.add(Pair.create(consumer, producerContext));
            } else {
                this.f25867c++;
                z = false;
            }
        }
        if (!z) {
            mo26660a(consumer, producerContext);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26660a(Consumer<T> consumer, ProducerContext producerContext) {
        producerContext.getListener().onProducerFinishWithSuccess(producerContext.getId(), "ThrottlingProducer", null);
        this.f25865a.produceResults(new C9851b(consumer), producerContext);
    }
}

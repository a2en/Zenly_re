package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.C9549e;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.C9558d;
import com.facebook.imageformat.C9650b;
import com.facebook.imageformat.C9651c;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.nativecode.C9778f;
import com.facebook.imagepipeline.nativecode.WebpTranscoder;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.p0 */
public class C9863p0 implements Producer<C9732e> {

    /* renamed from: a */
    private final Executor f25897a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final PooledByteBufferFactory f25898b;

    /* renamed from: c */
    private final Producer<C9732e> f25899c;

    /* renamed from: com.facebook.imagepipeline.producers.p0$a */
    class C9864a extends C9836j0<C9732e> {

        /* renamed from: j */
        final /* synthetic */ C9732e f25900j;

        C9864a(Consumer consumer, ProducerListener producerListener, String str, String str2, C9732e eVar) {
            this.f25900j = eVar;
            super(consumer, producerListener, str, str2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo25656c() {
            C9732e.m24069c(this.f25900j);
            super.mo25656c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo25653a(C9732e eVar) {
            C9732e.m24069c(eVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo25652a(Exception exc) {
            C9732e.m24069c(this.f25900j);
            super.mo25652a(exc);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C9732e m24571b() throws Exception {
            CloseableReference a;
            C9549e newOutputStream = C9863p0.this.f25898b.newOutputStream();
            try {
                C9863p0.m24566b(this.f25900j, newOutputStream);
                a = CloseableReference.m23349a(newOutputStream.mo25719a());
                C9732e eVar = new C9732e(a);
                eVar.mo26420a(this.f25900j);
                CloseableReference.m23355b(a);
                newOutputStream.close();
                return eVar;
            } catch (Throwable th) {
                newOutputStream.close();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo25655b(C9732e eVar) {
            C9732e.m24069c(this.f25900j);
            super.mo25655b(eVar);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.p0$b */
    private class C9865b extends C9848m<C9732e, C9732e> {

        /* renamed from: c */
        private final ProducerContext f25902c;

        /* renamed from: d */
        private C9558d f25903d = C9558d.UNSET;

        public C9865b(Consumer<C9732e> consumer, ProducerContext producerContext) {
            super(consumer);
            this.f25902c = producerContext;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            if (this.f25903d == C9558d.UNSET && eVar != null) {
                this.f25903d = C9863p0.m24565b(eVar);
            }
            if (this.f25903d == C9558d.NO) {
                mo26659b().onNewResult(eVar, i);
                return;
            }
            if (C9796b.m24323a(i)) {
                if (this.f25903d != C9558d.YES || eVar == null) {
                    mo26659b().onNewResult(eVar, i);
                } else {
                    C9863p0.this.m24563a(eVar, mo26659b(), this.f25902c);
                }
            }
        }
    }

    public C9863p0(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, Producer<C9732e> producer) {
        C9536j.m23271a(executor);
        this.f25897a = executor;
        C9536j.m23271a(pooledByteBufferFactory);
        this.f25898b = pooledByteBufferFactory;
        C9536j.m23271a(producer);
        this.f25899c = producer;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C9558d m24565b(C9732e eVar) {
        C9536j.m23271a(eVar);
        ImageFormat c = C9651c.m23725c(eVar.mo26434h());
        if (C9650b.m23719a(c)) {
            WebpTranscoder a = C9778f.m24275a();
            if (a == null) {
                return C9558d.NO;
            }
            return C9558d.m23382a(!a.isWebpNativelySupported(c));
        } else if (c == ImageFormat.f25182b) {
            return C9558d.UNSET;
        } else {
            return C9558d.NO;
        }
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        this.f25899c.produceResults(new C9865b(consumer, producerContext), producerContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24563a(C9732e eVar, Consumer<C9732e> consumer, ProducerContext producerContext) {
        C9536j.m23271a(eVar);
        String str = "WebpTranscodeProducer";
        Consumer<C9732e> consumer2 = consumer;
        C9864a aVar = new C9864a(consumer2, producerContext.getListener(), str, producerContext.getId(), C9732e.m24068b(eVar));
        this.f25897a.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m24566b(C9732e eVar, C9549e eVar2) throws Exception {
        InputStream h = eVar.mo26434h();
        ImageFormat c = C9651c.m23725c(h);
        if (c == C9650b.f25202f || c == C9650b.f25204h) {
            C9778f.m24275a().transcodeWebpToJpeg(h, eVar2, 80);
            eVar.mo26418a(C9650b.f25197a);
        } else if (c == C9650b.f25203g || c == C9650b.f25205i) {
            C9778f.m24275a().transcodeWebpToPng(h, eVar2);
            eVar.mo26418a(C9650b.f25198b);
        } else {
            throw new IllegalArgumentException("Wrong image format");
        }
    }
}

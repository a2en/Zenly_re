package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.C9530g;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.C9549e;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.C9558d;
import com.facebook.imageformat.C9650b;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.producers.JobScheduler.JobRunnable;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.transcoder.C9891b;
import com.facebook.imagepipeline.transcoder.C9892c;
import com.facebook.imagepipeline.transcoder.ImageTranscoder;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.h0 */
public class C9826h0 implements Producer<C9732e> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Executor f25800a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final PooledByteBufferFactory f25801b;

    /* renamed from: c */
    private final Producer<C9732e> f25802c;

    /* renamed from: d */
    private final boolean f25803d;

    /* renamed from: e */
    private final ImageTranscoderFactory f25804e;

    /* renamed from: com.facebook.imagepipeline.producers.h0$a */
    private class C9827a extends C9848m<C9732e, C9732e> {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean f25805c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ImageTranscoderFactory f25806d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final ProducerContext f25807e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f25808f = false;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final JobScheduler f25809g;

        /* renamed from: com.facebook.imagepipeline.producers.h0$a$a */
        class C9828a implements JobRunnable {
            C9828a(C9826h0 h0Var) {
            }

            public void run(C9732e eVar, int i) {
                C9827a aVar = C9827a.this;
                ImageTranscoder createImageTranscoder = aVar.f25806d.createImageTranscoder(eVar.mo26432g(), C9827a.this.f25805c);
                C9536j.m23271a(createImageTranscoder);
                aVar.m24460a(eVar, i, createImageTranscoder);
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.h0$a$b */
        class C9829b extends C9810e {

            /* renamed from: a */
            final /* synthetic */ Consumer f25812a;

            C9829b(C9826h0 h0Var, Consumer consumer) {
                this.f25812a = consumer;
            }

            public void onCancellationRequested() {
                C9827a.this.f25809g.mo26578a();
                C9827a.this.f25808f = true;
                this.f25812a.onCancellation();
            }

            public void onIsIntermediateResultExpectedChanged() {
                if (C9827a.this.f25807e.isIntermediateResultExpected()) {
                    C9827a.this.f25809g.mo26581c();
                }
            }
        }

        C9827a(Consumer<C9732e> consumer, ProducerContext producerContext, boolean z, ImageTranscoderFactory imageTranscoderFactory) {
            super(consumer);
            this.f25807e = producerContext;
            Boolean m = this.f25807e.getImageRequest().mo26740m();
            if (m != null) {
                z = m.booleanValue();
            }
            this.f25805c = z;
            this.f25806d = imageTranscoderFactory;
            this.f25809g = new JobScheduler(C9826h0.this.f25800a, new C9828a(C9826h0.this), 100);
            this.f25807e.addCallbacks(new C9829b(C9826h0.this, consumer));
        }

        /* renamed from: b */
        private C9732e m24464b(C9732e eVar) {
            return (this.f25807e.getImageRequest().mo26741n().mo26271a() || eVar.mo26435i() == 0 || eVar.mo26435i() == -1) ? eVar : m24465b(eVar, 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            if (!this.f25808f) {
                boolean a = C9796b.m24323a(i);
                if (eVar == null) {
                    if (a) {
                        mo26659b().onNewResult(null, 1);
                    }
                    return;
                }
                ImageFormat g = eVar.mo26432g();
                C9884a imageRequest = this.f25807e.getImageRequest();
                ImageTranscoder createImageTranscoder = this.f25806d.createImageTranscoder(g, this.f25805c);
                C9536j.m23271a(createImageTranscoder);
                C9558d a2 = C9826h0.m24455b(imageRequest, eVar, createImageTranscoder);
                if (!a && a2 == C9558d.UNSET) {
                    return;
                }
                if (a2 != C9558d.YES) {
                    m24459a(eVar, i, g);
                } else if (this.f25809g.mo26579a(eVar, i)) {
                    if (a || this.f25807e.isIntermediateResultExpected()) {
                        this.f25809g.mo26581c();
                    }
                }
            }
        }

        /* renamed from: b */
        private C9732e m24465b(C9732e eVar, int i) {
            C9732e b = C9732e.m24068b(eVar);
            eVar.close();
            if (b != null) {
                b.mo26429e(i);
            }
            return b;
        }

        /* renamed from: a */
        private void m24459a(C9732e eVar, int i, ImageFormat imageFormat) {
            C9732e eVar2;
            if (imageFormat == C9650b.f25197a || imageFormat == C9650b.f25207k) {
                eVar2 = m24464b(eVar);
            } else {
                eVar2 = m24457a(eVar);
            }
            mo26659b().onNewResult(eVar2, i);
        }

        /* renamed from: a */
        private C9732e m24457a(C9732e eVar) {
            C9702f n = this.f25807e.getImageRequest().mo26741n();
            return (n.mo26274d() || !n.mo26273c()) ? eVar : m24465b(eVar, n.mo26272b());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m24460a(C9732e eVar, int i, ImageTranscoder imageTranscoder) {
            C9732e eVar2;
            String str = "ResizeAndRotateProducer";
            this.f25807e.getListener().onProducerStart(this.f25807e.getId(), str);
            C9884a imageRequest = this.f25807e.getImageRequest();
            C9549e newOutputStream = C9826h0.this.f25801b.newOutputStream();
            Map map = null;
            try {
                C9891b transcode = imageTranscoder.transcode(eVar, newOutputStream, imageRequest.mo26741n(), imageRequest.mo26739l(), null, Integer.valueOf(85));
                if (transcode.mo26759a() != 2) {
                    map = m24458a(eVar, imageRequest.mo26739l(), transcode, imageTranscoder.getIdentifier());
                    CloseableReference a = CloseableReference.m23349a(newOutputStream.mo25719a());
                    try {
                        eVar2 = new C9732e(a);
                        eVar2.mo26418a(C9650b.f25197a);
                        eVar2.mo26440n();
                        this.f25807e.getListener().onProducerFinishWithSuccess(this.f25807e.getId(), str, map);
                        if (transcode.mo26759a() != 1) {
                            i |= 16;
                        }
                        mo26659b().onNewResult(eVar2, i);
                        C9732e.m24069c(eVar2);
                        CloseableReference.m23355b(a);
                        newOutputStream.close();
                    } catch (Throwable th) {
                        CloseableReference.m23355b(a);
                        throw th;
                    }
                } else {
                    throw new RuntimeException("Error while transcoding the image");
                }
            } catch (Exception e) {
                try {
                    this.f25807e.getListener().onProducerFinishWithFailure(this.f25807e.getId(), str, e, map);
                    if (C9796b.m24323a(i)) {
                        mo26659b().onFailure(e);
                    }
                } finally {
                    newOutputStream.close();
                }
            }
        }

        /* renamed from: a */
        private Map<String, String> m24458a(C9732e eVar, C9701e eVar2, C9891b bVar, String str) {
            String str2;
            if (!this.f25807e.getListener().requiresExtraMap(this.f25807e.getId())) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.mo26438l());
            String str3 = "x";
            sb.append(str3);
            sb.append(eVar.mo26430f());
            String sb2 = sb.toString();
            if (eVar2 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(eVar2.f25355a);
                sb3.append(str3);
                sb3.append(eVar2.f25356b);
                str2 = sb3.toString();
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(eVar.mo26432g()));
            hashMap.put("Original size", sb2);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f25809g.mo26580b()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(bVar));
            return C9530g.m23257a(hashMap);
        }
    }

    public C9826h0(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, Producer<C9732e> producer, boolean z, ImageTranscoderFactory imageTranscoderFactory) {
        C9536j.m23271a(executor);
        this.f25800a = executor;
        C9536j.m23271a(pooledByteBufferFactory);
        this.f25801b = pooledByteBufferFactory;
        C9536j.m23271a(producer);
        this.f25802c = producer;
        C9536j.m23271a(imageTranscoderFactory);
        this.f25804e = imageTranscoderFactory;
        this.f25803d = z;
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        Producer<C9732e> producer = this.f25802c;
        C9827a aVar = new C9827a(consumer, producerContext, this.f25803d, this.f25804e);
        producer.produceResults(aVar, producerContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C9558d m24455b(C9884a aVar, C9732e eVar, ImageTranscoder imageTranscoder) {
        if (eVar == null || eVar.mo26432g() == ImageFormat.f25182b) {
            return C9558d.UNSET;
        }
        if (!imageTranscoder.canTranscode(eVar.mo26432g())) {
            return C9558d.NO;
        }
        return C9558d.m23382a(m24453a(aVar.mo26741n(), eVar) || imageTranscoder.canResize(eVar, aVar.mo26741n(), aVar.mo26739l()));
    }

    /* renamed from: a */
    private static boolean m24453a(C9702f fVar, C9732e eVar) {
        return !fVar.mo26271a() && (C9892c.m24719b(fVar, eVar) != 0 || m24456b(fVar, eVar));
    }

    /* renamed from: b */
    private static boolean m24456b(C9702f fVar, C9732e eVar) {
        if (fVar.mo26273c() && !fVar.mo26271a()) {
            return C9892c.f25996a.contains(Integer.valueOf(eVar.mo26428e()));
        }
        eVar.mo26424c(0);
        return false;
    }
}

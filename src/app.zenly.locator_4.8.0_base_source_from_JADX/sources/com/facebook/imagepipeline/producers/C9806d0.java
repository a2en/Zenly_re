package com.facebook.imagepipeline.producers;

import android.net.Uri;
import bolts.Continuation;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9530g;
import com.facebook.common.logging.C9543a;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.C9549e;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.cache.C9678e;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.common.C9697a;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.producers.d0 */
public class C9806d0 implements Producer<C9732e> {

    /* renamed from: a */
    private final C9678e f25751a;

    /* renamed from: b */
    private final CacheKeyFactory f25752b;

    /* renamed from: c */
    private final PooledByteBufferFactory f25753c;

    /* renamed from: d */
    private final ByteArrayPool f25754d;

    /* renamed from: e */
    private final Producer<C9732e> f25755e;

    /* renamed from: com.facebook.imagepipeline.producers.d0$a */
    class C9807a implements Continuation<C9732e, Void> {

        /* renamed from: a */
        final /* synthetic */ ProducerListener f25756a;

        /* renamed from: b */
        final /* synthetic */ String f25757b;

        /* renamed from: c */
        final /* synthetic */ Consumer f25758c;

        /* renamed from: d */
        final /* synthetic */ ProducerContext f25759d;

        /* renamed from: e */
        final /* synthetic */ CacheKey f25760e;

        C9807a(ProducerListener producerListener, String str, Consumer consumer, ProducerContext producerContext, CacheKey cacheKey) {
            this.f25756a = producerListener;
            this.f25757b = str;
            this.f25758c = consumer;
            this.f25759d = producerContext;
            this.f25760e = cacheKey;
        }

        public Void then(Task<C9732e> task) throws Exception {
            String str = "PartialDiskCacheProducer";
            if (C9806d0.m24393b(task)) {
                this.f25756a.onProducerFinishWithCancellation(this.f25757b, str, null);
                this.f25758c.onCancellation();
            } else if (task.mo14186e()) {
                this.f25756a.onProducerFinishWithFailure(this.f25757b, str, task.mo14180a(), null);
                C9806d0.this.m24389a(this.f25758c, this.f25759d, this.f25760e, (C9732e) null);
            } else {
                C9732e eVar = (C9732e) task.mo14183b();
                if (eVar != null) {
                    ProducerListener producerListener = this.f25756a;
                    String str2 = this.f25757b;
                    producerListener.onProducerFinishWithSuccess(str2, str, C9806d0.m24388a(producerListener, str2, true, eVar.mo26437k()));
                    C9697a b = C9697a.m23838b(eVar.mo26437k() - 1);
                    eVar.mo26419a(b);
                    int k = eVar.mo26437k();
                    C9884a imageRequest = this.f25759d.getImageRequest();
                    if (b.mo26253a(imageRequest.mo26726a())) {
                        this.f25756a.onUltimateProducerReached(this.f25757b, str, true);
                        this.f25758c.onNewResult(eVar, 9);
                    } else {
                        this.f25758c.onNewResult(eVar, 8);
                        ImageRequestBuilder a = ImageRequestBuilder.m24644a(imageRequest);
                        a.mo26692a(C9697a.m23837a(k - 1));
                        C9806d0.this.m24389a(this.f25758c, (ProducerContext) new C9832i0(a.mo26703a(), this.f25759d), this.f25760e, eVar);
                    }
                } else {
                    ProducerListener producerListener2 = this.f25756a;
                    String str3 = this.f25757b;
                    producerListener2.onProducerFinishWithSuccess(str3, str, C9806d0.m24388a(producerListener2, str3, false, 0));
                    C9806d0.this.m24389a(this.f25758c, this.f25759d, this.f25760e, eVar);
                }
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.d0$b */
    class C9808b extends C9810e {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f25762a;

        C9808b(C9806d0 d0Var, AtomicBoolean atomicBoolean) {
            this.f25762a = atomicBoolean;
        }

        public void onCancellationRequested() {
            this.f25762a.set(true);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.d0$c */
    private static class C9809c extends C9848m<C9732e, C9732e> {

        /* renamed from: c */
        private final C9678e f25763c;

        /* renamed from: d */
        private final CacheKey f25764d;

        /* renamed from: e */
        private final PooledByteBufferFactory f25765e;

        /* renamed from: f */
        private final ByteArrayPool f25766f;

        /* renamed from: g */
        private final C9732e f25767g;

        /* synthetic */ C9809c(Consumer consumer, C9678e eVar, CacheKey cacheKey, PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, C9732e eVar2, C9807a aVar) {
            this(consumer, eVar, cacheKey, pooledByteBufferFactory, byteArrayPool, eVar2);
        }

        private C9809c(Consumer<C9732e> consumer, C9678e eVar, CacheKey cacheKey, PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, C9732e eVar2) {
            super(consumer);
            this.f25763c = eVar;
            this.f25764d = cacheKey;
            this.f25765e = pooledByteBufferFactory;
            this.f25766f = byteArrayPool;
            this.f25767g = eVar2;
        }

        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            if (!C9796b.m24325b(i)) {
                if (this.f25767g != null && eVar.mo26423c() != null) {
                    try {
                        m24395a(m24394a(this.f25767g, eVar));
                    } catch (IOException e) {
                        C9543a.m23318b("PartialDiskCacheProducer", "Error while merging image data", (Throwable) e);
                        mo26659b().onFailure(e);
                    } catch (Throwable th) {
                        eVar.close();
                        this.f25767g.close();
                        throw th;
                    }
                    eVar.close();
                    this.f25767g.close();
                    this.f25763c.mo26231a(this.f25764d);
                } else if (!C9796b.m24326b(i, 8) || !C9796b.m24323a(i) || eVar.mo26432g() == ImageFormat.f25182b) {
                    mo26659b().onNewResult(eVar, i);
                } else {
                    this.f25763c.mo26233a(this.f25764d, eVar);
                    mo26659b().onNewResult(eVar, i);
                }
            }
        }

        /* renamed from: a */
        private C9549e m24394a(C9732e eVar, C9732e eVar2) throws IOException {
            C9549e newOutputStream = this.f25765e.newOutputStream(eVar2.mo26437k() + eVar2.mo26423c().f25330a);
            m24396a(eVar.mo26434h(), newOutputStream, eVar2.mo26423c().f25330a);
            m24396a(eVar2.mo26434h(), newOutputStream, eVar2.mo26437k());
            return newOutputStream;
        }

        /* renamed from: a */
        private void m24396a(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = (byte[]) this.f25766f.get(16384);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f25766f.release(bArr);
                    throw th;
                }
            }
            this.f25766f.release(bArr);
            if (i2 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
        }

        /* renamed from: a */
        private void m24395a(C9549e eVar) {
            C9732e eVar2;
            Throwable th;
            CloseableReference a = CloseableReference.m23349a(eVar.mo25719a());
            try {
                eVar2 = new C9732e(a);
                try {
                    eVar2.mo26440n();
                    mo26659b().onNewResult(eVar2, 1);
                    C9732e.m24069c(eVar2);
                    CloseableReference.m23355b(a);
                } catch (Throwable th2) {
                    th = th2;
                    C9732e.m24069c(eVar2);
                    CloseableReference.m23355b(a);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                eVar2 = null;
                th = th4;
                C9732e.m24069c(eVar2);
                CloseableReference.m23355b(a);
                throw th;
            }
        }
    }

    public C9806d0(C9678e eVar, CacheKeyFactory cacheKeyFactory, PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, Producer<C9732e> producer) {
        this.f25751a = eVar;
        this.f25752b = cacheKeyFactory;
        this.f25753c = pooledByteBufferFactory;
        this.f25754d = byteArrayPool;
        this.f25755e = producer;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m24393b(Task<?> task) {
        return task.mo14184c() || (task.mo14186e() && (task.mo14180a() instanceof CancellationException));
    }

    public void produceResults(Consumer<C9732e> consumer, ProducerContext producerContext) {
        C9884a imageRequest = producerContext.getImageRequest();
        if (!imageRequest.mo26745r()) {
            this.f25755e.produceResults(consumer, producerContext);
            return;
        }
        producerContext.getListener().onProducerStart(producerContext.getId(), "PartialDiskCacheProducer");
        CacheKey encodedCacheKey = this.f25752b.getEncodedCacheKey(imageRequest, m24386a(imageRequest), producerContext.getCallerContext());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f25751a.mo26232a(encodedCacheKey, atomicBoolean).mo14178a(m24387a(consumer, producerContext, encodedCacheKey));
        m24391a(atomicBoolean, producerContext);
    }

    /* renamed from: a */
    private Continuation<C9732e, Void> m24387a(Consumer<C9732e> consumer, ProducerContext producerContext, CacheKey cacheKey) {
        C9807a aVar = new C9807a(producerContext.getListener(), producerContext.getId(), consumer, producerContext, cacheKey);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24389a(Consumer<C9732e> consumer, ProducerContext producerContext, CacheKey cacheKey, C9732e eVar) {
        C9809c cVar = new C9809c(consumer, this.f25751a, cacheKey, this.f25753c, this.f25754d, eVar, null);
        this.f25755e.produceResults(cVar, producerContext);
    }

    /* renamed from: a */
    static Map<String, String> m24388a(ProducerListener producerListener, String str, boolean z, int i) {
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
    private void m24391a(AtomicBoolean atomicBoolean, ProducerContext producerContext) {
        producerContext.addCallbacks(new C9808b(this, atomicBoolean));
    }

    /* renamed from: a */
    private static Uri m24386a(C9884a aVar) {
        return aVar.mo26743p().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }
}

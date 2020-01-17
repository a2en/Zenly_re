package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.C9530g;
import com.facebook.common.internal.C9536j;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9731d;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessorRunner;
import java.util.Map;
import java.util.concurrent.Executor;
import p333g.p339c.p352d.p355b.C12058f;

/* renamed from: com.facebook.imagepipeline.producers.f0 */
public class C9814f0 implements Producer<CloseableReference<C9730c>> {

    /* renamed from: a */
    private final Producer<CloseableReference<C9730c>> f25775a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12058f f25776b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f25777c;

    /* renamed from: com.facebook.imagepipeline.producers.f0$b */
    private class C9816b extends C9848m<CloseableReference<C9730c>, CloseableReference<C9730c>> {

        /* renamed from: c */
        private final ProducerListener f25778c;

        /* renamed from: d */
        private final String f25779d;

        /* renamed from: e */
        private final Postprocessor f25780e;

        /* renamed from: f */
        private boolean f25781f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public CloseableReference<C9730c> f25782g = null;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f25783h = 0;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f25784i = false;

        /* renamed from: j */
        private boolean f25785j = false;

        /* renamed from: com.facebook.imagepipeline.producers.f0$b$a */
        class C9817a extends C9810e {
            C9817a(C9814f0 f0Var) {
            }

            public void onCancellationRequested() {
                C9816b.this.m24423f();
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.f0$b$b */
        class C9818b implements Runnable {
            C9818b() {
            }

            public void run() {
                CloseableReference b;
                int c;
                synchronized (C9816b.this) {
                    b = C9816b.this.f25782g;
                    c = C9816b.this.f25783h;
                    C9816b.this.f25782g = null;
                    C9816b.this.f25784i = false;
                }
                if (CloseableReference.m23356c(b)) {
                    try {
                        C9816b.this.m24413b(b, c);
                    } finally {
                        CloseableReference.m23355b(b);
                    }
                }
                C9816b.this.m24417c();
            }
        }

        public C9816b(Consumer<CloseableReference<C9730c>> consumer, ProducerListener producerListener, String str, Postprocessor postprocessor, ProducerContext producerContext) {
            super(consumer);
            this.f25778c = producerListener;
            this.f25779d = str;
            this.f25780e = postprocessor;
            producerContext.addCallbacks(new C9817a(C9814f0.this));
        }

        /* renamed from: e */
        private synchronized boolean m24422e() {
            return this.f25781f;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m24423f() {
            if (m24421d()) {
                mo26659b().onCancellation();
            }
        }

        /* renamed from: g */
        private synchronized boolean m24424g() {
            if (this.f25781f || !this.f25784i || this.f25785j || !CloseableReference.m23356c(this.f25782g)) {
                return false;
            }
            this.f25785j = true;
            return true;
        }

        /* renamed from: h */
        private void m24425h() {
            C9814f0.this.f25777c.execute(new C9818b());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m24413b(CloseableReference<C9730c> closeableReference, int i) {
            C9536j.m23275a(CloseableReference.m23356c(closeableReference));
            if (!m24415b((C9730c) closeableReference.mo25724b())) {
                m24418c(closeableReference, i);
                return;
            }
            String str = "PostprocessorProducer";
            this.f25778c.onProducerStart(this.f25779d, str);
            CloseableReference closeableReference2 = null;
            try {
                closeableReference2 = m24406a((C9730c) closeableReference.mo25724b());
                this.f25778c.onProducerFinishWithSuccess(this.f25779d, str, m24408a(this.f25778c, this.f25779d, this.f25780e));
                m24418c(closeableReference2, i);
            } catch (Exception e) {
                this.f25778c.onProducerFinishWithFailure(this.f25779d, str, e, m24408a(this.f25778c, this.f25779d, this.f25780e));
                m24414b((Throwable) e);
            } finally {
                CloseableReference.m23355b(closeableReference2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m24417c() {
            boolean g;
            synchronized (this) {
                this.f25785j = false;
                g = m24424g();
            }
            if (g) {
                m24425h();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
            m24425h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            com.facebook.common.references.CloseableReference.m23355b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r2 == false) goto L_0x0021;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m24419d(com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.C9730c> r2, int r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f25781f     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.c> r0 = r1.f25782g     // Catch:{ all -> 0x0022 }
                com.facebook.common.references.CloseableReference r2 = com.facebook.common.references.CloseableReference.m23348a(r2)     // Catch:{ all -> 0x0022 }
                r1.f25782g = r2     // Catch:{ all -> 0x0022 }
                r1.f25783h = r3     // Catch:{ all -> 0x0022 }
                r2 = 1
                r1.f25784i = r2     // Catch:{ all -> 0x0022 }
                boolean r2 = r1.m24424g()     // Catch:{ all -> 0x0022 }
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                com.facebook.common.references.CloseableReference.m23355b(r0)
                if (r2 == 0) goto L_0x0021
                r1.m24425h()
            L_0x0021:
                return
            L_0x0022:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9814f0.C9816b.m24419d(com.facebook.common.references.CloseableReference, int):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(CloseableReference<C9730c> closeableReference, int i) {
            if (!CloseableReference.m23356c(closeableReference)) {
                if (C9796b.m24323a(i)) {
                    m24418c(null, i);
                }
                return;
            }
            m24419d(closeableReference, i);
        }

        /* renamed from: c */
        private void m24418c(CloseableReference<C9730c> closeableReference, int i) {
            boolean a = C9796b.m24323a(i);
            if ((!a && !m24422e()) || (a && m24421d())) {
                mo26659b().onNewResult(closeableReference, i);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26617a(Throwable th) {
            m24414b(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26614a() {
            m24423f();
        }

        /* renamed from: a */
        private Map<String, String> m24408a(ProducerListener producerListener, String str, Postprocessor postprocessor) {
            if (!producerListener.requiresExtraMap(str)) {
                return null;
            }
            return C9530g.m23258a("Postprocessor", postprocessor.getName());
        }

        /* renamed from: a */
        private CloseableReference<C9730c> m24406a(C9730c cVar) {
            C9731d dVar = (C9731d) cVar;
            CloseableReference process = this.f25780e.process(dVar.mo26411c(), C9814f0.this.f25776b);
            try {
                return CloseableReference.m23349a(new C9731d(process, cVar.getQualityInfo(), dVar.mo26415f(), dVar.mo26414e()));
            } finally {
                CloseableReference.m23355b(process);
            }
        }

        /* renamed from: d */
        private boolean m24421d() {
            synchronized (this) {
                if (this.f25781f) {
                    return false;
                }
                CloseableReference<C9730c> closeableReference = this.f25782g;
                this.f25782g = null;
                this.f25781f = true;
                CloseableReference.m23355b(closeableReference);
                return true;
            }
        }

        /* renamed from: b */
        private boolean m24415b(C9730c cVar) {
            return cVar instanceof C9731d;
        }

        /* renamed from: b */
        private void m24414b(Throwable th) {
            if (m24421d()) {
                mo26659b().onFailure(th);
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.f0$c */
    class C9819c extends C9848m<CloseableReference<C9730c>, CloseableReference<C9730c>> implements RepeatedPostprocessorRunner {

        /* renamed from: c */
        private boolean f25789c;

        /* renamed from: d */
        private CloseableReference<C9730c> f25790d;

        /* renamed from: com.facebook.imagepipeline.producers.f0$c$a */
        class C9820a extends C9810e {
            C9820a(C9814f0 f0Var) {
            }

            public void onCancellationRequested() {
                if (C9819c.this.m24432c()) {
                    C9819c.this.mo26659b().onCancellation();
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public boolean m24432c() {
            synchronized (this) {
                if (this.f25789c) {
                    return false;
                }
                CloseableReference<C9730c> closeableReference = this.f25790d;
                this.f25790d = null;
                this.f25789c = true;
                CloseableReference.m23355b(closeableReference);
                return true;
            }
        }

        /* renamed from: d */
        private void m24433d() {
            synchronized (this) {
                if (!this.f25789c) {
                    CloseableReference a = CloseableReference.m23348a(this.f25790d);
                    try {
                        mo26659b().onNewResult(a, 0);
                    } finally {
                        CloseableReference.m23355b(a);
                    }
                }
            }
        }

        public synchronized void update() {
            m24433d();
        }

        private C9819c(C9814f0 f0Var, C9816b bVar, RepeatedPostprocessor repeatedPostprocessor, ProducerContext producerContext) {
            super(bVar);
            this.f25789c = false;
            this.f25790d = null;
            repeatedPostprocessor.setCallback(this);
            producerContext.addCallbacks(new C9820a(f0Var));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(CloseableReference<C9730c> closeableReference, int i) {
            if (!C9796b.m24325b(i)) {
                m24430a(closeableReference);
                m24433d();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26617a(Throwable th) {
            if (m24432c()) {
                mo26659b().onFailure(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26614a() {
            if (m24432c()) {
                mo26659b().onCancellation();
            }
        }

        /* renamed from: a */
        private void m24430a(CloseableReference<C9730c> closeableReference) {
            synchronized (this) {
                if (!this.f25789c) {
                    CloseableReference<C9730c> closeableReference2 = this.f25790d;
                    this.f25790d = CloseableReference.m23348a(closeableReference);
                    CloseableReference.m23355b(closeableReference2);
                }
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.f0$d */
    class C9821d extends C9848m<CloseableReference<C9730c>, CloseableReference<C9730c>> {
        private C9821d(C9814f0 f0Var, C9816b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(CloseableReference<C9730c> closeableReference, int i) {
            if (!C9796b.m24325b(i)) {
                mo26659b().onNewResult(closeableReference, i);
            }
        }
    }

    public C9814f0(Producer<CloseableReference<C9730c>> producer, C12058f fVar, Executor executor) {
        C9536j.m23271a(producer);
        this.f25775a = producer;
        this.f25776b = fVar;
        C9536j.m23271a(executor);
        this.f25777c = executor;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.facebook.imagepipeline.producers.Consumer] */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.facebook.imagepipeline.producers.f0$d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void produceResults(com.facebook.imagepipeline.producers.Consumer<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.C9730c>> r10, com.facebook.imagepipeline.producers.ProducerContext r11) {
        /*
            r9 = this;
            com.facebook.imagepipeline.producers.ProducerListener r3 = r11.getListener()
            com.facebook.imagepipeline.request.a r0 = r11.getImageRequest()
            com.facebook.imagepipeline.request.Postprocessor r7 = r0.mo26732f()
            com.facebook.imagepipeline.producers.f0$b r8 = new com.facebook.imagepipeline.producers.f0$b
            java.lang.String r4 = r11.getId()
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r7
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof com.facebook.imagepipeline.request.RepeatedPostprocessor
            if (r0 == 0) goto L_0x002c
            com.facebook.imagepipeline.producers.f0$c r6 = new com.facebook.imagepipeline.producers.f0$c
            r3 = r7
            com.facebook.imagepipeline.request.RepeatedPostprocessor r3 = (com.facebook.imagepipeline.request.RepeatedPostprocessor) r3
            r5 = 0
            r0 = r6
            r1 = r9
            r2 = r8
            r4 = r11
            r0.<init>(r2, r3, r4)
            goto L_0x0032
        L_0x002c:
            com.facebook.imagepipeline.producers.f0$d r6 = new com.facebook.imagepipeline.producers.f0$d
            r0 = 0
            r6.<init>(r8)
        L_0x0032:
            com.facebook.imagepipeline.producers.Producer<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.c>> r0 = r9.f25775a
            r0.produceResults(r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9814f0.produceResults(com.facebook.imagepipeline.producers.Consumer, com.facebook.imagepipeline.producers.ProducerContext):void");
    }
}

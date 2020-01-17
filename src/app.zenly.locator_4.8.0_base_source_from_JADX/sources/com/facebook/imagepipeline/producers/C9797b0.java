package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.C9537k;
import com.facebook.imagepipeline.common.C9700d;
import com.facebook.imagepipeline.producers.b0$b.b;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.imagepipeline.producers.b0 */
public abstract class C9797b0<K, T extends Closeable> implements Producer<T> {

    /* renamed from: a */
    final Map<K, C9799b> f25723a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Producer<T> f25724b;

    /* renamed from: com.facebook.imagepipeline.producers.b0$b */
    class C9799b {

        /* renamed from: a */
        private final K f25725a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final CopyOnWriteArraySet<Pair<Consumer<T>, ProducerContext>> f25726b = C9537k.m23282a();

        /* renamed from: c */
        private T f25727c;

        /* renamed from: d */
        private float f25728d;

        /* renamed from: e */
        private int f25729e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C9805d f25730f;

        /* renamed from: g */
        private b f25731g;

        /* renamed from: com.facebook.imagepipeline.producers.b0$b$a */
        class C9800a extends C9810e {

            /* renamed from: a */
            final /* synthetic */ Pair f25733a;

            C9800a(Pair pair) {
                this.f25733a = pair;
            }

            public void onCancellationRequested() {
                boolean remove;
                List list;
                List list2;
                List list3;
                C9805d dVar;
                synchronized (C9799b.this) {
                    remove = C9799b.this.f25726b.remove(this.f25733a);
                    list = null;
                    if (!remove) {
                        dVar = null;
                        list3 = null;
                    } else if (C9799b.this.f25726b.isEmpty()) {
                        dVar = C9799b.this.f25730f;
                        list3 = null;
                    } else {
                        List d = C9799b.this.m24353f();
                        list3 = C9799b.this.m24355g();
                        list2 = C9799b.this.m24351e();
                        List list4 = d;
                        dVar = null;
                        list = list4;
                    }
                    list2 = list3;
                }
                C9805d.m24379c(list);
                C9805d.m24380d(list3);
                C9805d.m24378b(list2);
                if (dVar != null) {
                    dVar.mo26631a();
                }
                if (remove) {
                    ((Consumer) this.f25733a.first).onCancellation();
                }
            }

            public void onIsIntermediateResultExpectedChanged() {
                C9805d.m24378b(C9799b.this.m24351e());
            }

            public void onIsPrefetchChanged() {
                C9805d.m24379c(C9799b.this.m24353f());
            }

            public void onPriorityChanged() {
                C9805d.m24380d(C9799b.this.m24355g());
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.b0$b$b */
        private class C9801b extends C9796b<T> {
            private C9801b() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo26609a(T t, int i) {
                try {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24703a("MultiplexProducer#onNewResult");
                    }
                    C9799b.this.mo26622a(this, t, i);
                } finally {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo26617a(Throwable th) {
                try {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24703a("MultiplexProducer#onFailure");
                    }
                    C9799b.this.mo26623a((b) this, th);
                } finally {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo26614a() {
                try {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24703a("MultiplexProducer#onCancellation");
                    }
                    C9799b.this.mo26620a((b) this);
                } finally {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo26615a(float f) {
                try {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24703a("MultiplexProducer#onProgressUpdate");
                    }
                    C9799b.this.mo26621a((b) this, f);
                } finally {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                }
            }
        }

        public C9799b(K k) {
            this.f25725a = k;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public synchronized List<ProducerContextCallbacks> m24355g() {
            if (this.f25730f == null) {
                return null;
            }
            return this.f25730f.mo26629a(m24347c());
        }

        /* renamed from: b */
        private synchronized boolean m24346b() {
            Iterator it = this.f25726b.iterator();
            while (it.hasNext()) {
                if (!((ProducerContext) ((Pair) it.next()).second).isPrefetch()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        private synchronized C9700d m24347c() {
            C9700d dVar;
            dVar = C9700d.LOW;
            Iterator it = this.f25726b.iterator();
            while (it.hasNext()) {
                dVar = C9700d.m23853a(dVar, ((ProducerContext) ((Pair) it.next()).second).getPriority());
            }
            return dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m24350d() {
            synchronized (this) {
                boolean z = true;
                C9536j.m23275a(this.f25730f == null);
                if (this.f25731g != null) {
                    z = false;
                }
                C9536j.m23275a(z);
                if (this.f25726b.isEmpty()) {
                    C9797b0.this.m24337a(this.f25725a, this);
                    return;
                }
                ProducerContext producerContext = (ProducerContext) ((Pair) this.f25726b.iterator().next()).second;
                C9805d dVar = new C9805d(producerContext.getImageRequest(), producerContext.getId(), producerContext.getListener(), producerContext.getCallerContext(), producerContext.getLowestPermittedRequestLevel(), m24346b(), m24344a(), m24347c());
                this.f25730f = dVar;
                this.f25731g = new C9801b();
                C9805d dVar2 = this.f25730f;
                b bVar = this.f25731g;
                C9797b0.this.f25724b.produceResults(bVar, dVar2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public synchronized List<ProducerContextCallbacks> m24351e() {
            if (this.f25730f == null) {
                return null;
            }
            return this.f25730f.mo26630a(m24344a());
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public synchronized List<ProducerContextCallbacks> m24353f() {
            if (this.f25730f == null) {
                return null;
            }
            return this.f25730f.mo26633b(m24346b());
        }

        /* JADX INFO: used method not loaded: com.facebook.imagepipeline.producers.d.b(java.util.List):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            com.facebook.imagepipeline.producers.C9805d.m24379c(r1);
            com.facebook.imagepipeline.producers.C9805d.m24380d(r2);
            com.facebook.imagepipeline.producers.C9805d.m24378b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r4 == r7.f25727c) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r4 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r4 = r7.f25732h.mo26618a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r4 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r5 <= 0.0f) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.onProgressUpdate(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r8.onNewResult(r4, r6);
            m24343a((java.io.Closeable) r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
            m24341a(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26624a(com.facebook.imagepipeline.producers.Consumer<T> r8, com.facebook.imagepipeline.producers.ProducerContext r9) {
            /*
                r7 = this;
                android.util.Pair r0 = android.util.Pair.create(r8, r9)
                monitor-enter(r7)
                com.facebook.imagepipeline.producers.b0 r1 = com.facebook.imagepipeline.producers.C9797b0.this     // Catch:{ all -> 0x0060 }
                K r2 = r7.f25725a     // Catch:{ all -> 0x0060 }
                com.facebook.imagepipeline.producers.b0$b r1 = r1.m24338b(r2)     // Catch:{ all -> 0x0060 }
                if (r1 == r7) goto L_0x0012
                r8 = 0
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                return r8
            L_0x0012:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.ProducerContext>> r1 = r7.f25726b     // Catch:{ all -> 0x0060 }
                r1.add(r0)     // Catch:{ all -> 0x0060 }
                java.util.List r1 = r7.m24353f()     // Catch:{ all -> 0x0060 }
                java.util.List r2 = r7.m24355g()     // Catch:{ all -> 0x0060 }
                java.util.List r3 = r7.m24351e()     // Catch:{ all -> 0x0060 }
                T r4 = r7.f25727c     // Catch:{ all -> 0x0060 }
                float r5 = r7.f25728d     // Catch:{ all -> 0x0060 }
                int r6 = r7.f25729e     // Catch:{ all -> 0x0060 }
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                com.facebook.imagepipeline.producers.C9805d.m24379c(r1)
                com.facebook.imagepipeline.producers.C9805d.m24380d(r2)
                com.facebook.imagepipeline.producers.C9805d.m24378b(r3)
                monitor-enter(r0)
                monitor-enter(r7)     // Catch:{ all -> 0x005d }
                T r1 = r7.f25727c     // Catch:{ all -> 0x005a }
                if (r4 == r1) goto L_0x003b
                r4 = 0
                goto L_0x0043
            L_0x003b:
                if (r4 == 0) goto L_0x0043
                com.facebook.imagepipeline.producers.b0 r1 = com.facebook.imagepipeline.producers.C9797b0.this     // Catch:{ all -> 0x005a }
                java.io.Closeable r4 = r1.mo26618a(r4)     // Catch:{ all -> 0x005a }
            L_0x0043:
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                if (r4 == 0) goto L_0x0054
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x004e
                r8.onProgressUpdate(r5)     // Catch:{ all -> 0x005d }
            L_0x004e:
                r8.onNewResult(r4, r6)     // Catch:{ all -> 0x005d }
                r7.m24343a(r4)     // Catch:{ all -> 0x005d }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                r7.m24341a(r0, r9)
                r8 = 1
                return r8
            L_0x005a:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                throw r8     // Catch:{ all -> 0x005d }
            L_0x005d:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                throw r8
            L_0x0060:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9797b0.C9799b.mo26624a(com.facebook.imagepipeline.producers.Consumer, com.facebook.imagepipeline.producers.ProducerContext):boolean");
        }

        /* renamed from: a */
        private void m24341a(Pair<Consumer<T>, ProducerContext> pair, ProducerContext producerContext) {
            producerContext.addCallbacks(new C9800a(pair));
        }

        /* renamed from: a */
        private synchronized boolean m24344a() {
            Iterator it = this.f25726b.iterator();
            while (it.hasNext()) {
                if (((ProducerContext) ((Pair) it.next()).second).isIntermediateResultExpected()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((com.facebook.imagepipeline.producers.Consumer) r0.first).onFailure(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r3.hasNext() == false) goto L_0x003b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26623a(com.facebook.imagepipeline.producers.b0$b.b r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.producers.b0$b.b<> r0 = r2.f25731g     // Catch:{ all -> 0x003c }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
                return
            L_0x0007:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.ProducerContext>> r3 = r2.f25726b     // Catch:{ all -> 0x003c }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x003c }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.ProducerContext>> r0 = r2.f25726b     // Catch:{ all -> 0x003c }
                r0.clear()     // Catch:{ all -> 0x003c }
                com.facebook.imagepipeline.producers.b0 r0 = com.facebook.imagepipeline.producers.C9797b0.this     // Catch:{ all -> 0x003c }
                K r1 = r2.f25725a     // Catch:{ all -> 0x003c }
                r0.m24337a(r1, r2)     // Catch:{ all -> 0x003c }
                T r0 = r2.f25727c     // Catch:{ all -> 0x003c }
                r2.m24343a(r0)     // Catch:{ all -> 0x003c }
                r0 = 0
                r2.f25727c = r0     // Catch:{ all -> 0x003c }
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
            L_0x0022:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0038 }
                com.facebook.imagepipeline.producers.Consumer r1 = (com.facebook.imagepipeline.producers.Consumer) r1     // Catch:{ all -> 0x0038 }
                r1.onFailure(r4)     // Catch:{ all -> 0x0038 }
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                goto L_0x0022
            L_0x0038:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                throw r3
            L_0x003b:
                return
            L_0x003c:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9797b0.C9799b.mo26623a(com.facebook.imagepipeline.producers.b0$b$b, java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r3.hasNext() == false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            ((com.facebook.imagepipeline.producers.Consumer) r0.first).onNewResult(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26622a(com.facebook.imagepipeline.producers.b0$b.b r3, T r4, int r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.producers.b0$b.b<> r0 = r2.f25731g     // Catch:{ all -> 0x004d }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                return
            L_0x0007:
                T r3 = r2.f25727c     // Catch:{ all -> 0x004d }
                r2.m24343a(r3)     // Catch:{ all -> 0x004d }
                r3 = 0
                r2.f25727c = r3     // Catch:{ all -> 0x004d }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.ProducerContext>> r3 = r2.f25726b     // Catch:{ all -> 0x004d }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x004d }
                boolean r0 = com.facebook.imagepipeline.producers.C9796b.m24325b(r5)     // Catch:{ all -> 0x004d }
                if (r0 == 0) goto L_0x0026
                com.facebook.imagepipeline.producers.b0 r0 = com.facebook.imagepipeline.producers.C9797b0.this     // Catch:{ all -> 0x004d }
                java.io.Closeable r0 = r0.mo26618a(r4)     // Catch:{ all -> 0x004d }
                r2.f25727c = r0     // Catch:{ all -> 0x004d }
                r2.f25729e = r5     // Catch:{ all -> 0x004d }
                goto L_0x0032
            L_0x0026:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.ProducerContext>> r0 = r2.f25726b     // Catch:{ all -> 0x004d }
                r0.clear()     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.producers.b0 r0 = com.facebook.imagepipeline.producers.C9797b0.this     // Catch:{ all -> 0x004d }
                K r1 = r2.f25725a     // Catch:{ all -> 0x004d }
                r0.m24337a(r1, r2)     // Catch:{ all -> 0x004d }
            L_0x0032:
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
            L_0x0033:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x004c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0049 }
                com.facebook.imagepipeline.producers.Consumer r1 = (com.facebook.imagepipeline.producers.Consumer) r1     // Catch:{ all -> 0x0049 }
                r1.onNewResult(r4, r5)     // Catch:{ all -> 0x0049 }
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                goto L_0x0033
            L_0x0049:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                throw r3
            L_0x004c:
                return
            L_0x004d:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9797b0.C9799b.mo26622a(com.facebook.imagepipeline.producers.b0$b$b, java.io.Closeable, int):void");
        }

        /* renamed from: a */
        public void mo26620a(b bVar) {
            synchronized (this) {
                if (this.f25731g == bVar) {
                    this.f25731g = null;
                    this.f25730f = null;
                    m24343a((Closeable) this.f25727c);
                    this.f25727c = null;
                    m24350d();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((com.facebook.imagepipeline.producers.Consumer) r0.first).onProgressUpdate(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            if (r3.hasNext() == false) goto L_0x0029;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26621a(com.facebook.imagepipeline.producers.b0$b.b r3, float r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.producers.b0$b.b<> r0 = r2.f25731g     // Catch:{ all -> 0x002a }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0007:
                r2.f25728d = r4     // Catch:{ all -> 0x002a }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.producers.Consumer<T>, com.facebook.imagepipeline.producers.ProducerContext>> r3 = r2.f25726b     // Catch:{ all -> 0x002a }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
            L_0x0010:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0029
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0026 }
                com.facebook.imagepipeline.producers.Consumer r1 = (com.facebook.imagepipeline.producers.Consumer) r1     // Catch:{ all -> 0x0026 }
                r1.onProgressUpdate(r4)     // Catch:{ all -> 0x0026 }
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0010
            L_0x0026:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                throw r3
            L_0x0029:
                return
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9797b0.C9799b.mo26621a(com.facebook.imagepipeline.producers.b0$b$b, float):void");
        }

        /* renamed from: a */
        private void m24343a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    protected C9797b0(Producer<T> producer) {
        this.f25724b = producer;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized C9799b m24338b(K k) {
        return (C9799b) this.f25723a.get(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo26618a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract K mo26619a(ProducerContext producerContext);

    public void produceResults(Consumer<T> consumer, ProducerContext producerContext) {
        boolean z;
        C9799b b;
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("MultiplexProducer#produceResults");
            }
            Object a = mo26619a(producerContext);
            do {
                z = false;
                synchronized (this) {
                    b = m24338b(a);
                    if (b == null) {
                        b = m24335a((K) a);
                        z = true;
                    }
                }
            } while (!b.mo26624a(consumer, producerContext));
            if (z) {
                b.m24350d();
            }
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        } catch (Throwable th) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private synchronized C9799b m24335a(K k) {
        C9799b bVar;
        bVar = new C9799b<>(k);
        this.f25723a.put(k, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m24337a(K k, C9799b bVar) {
        if (this.f25723a.get(k) == bVar) {
            this.f25723a.remove(k);
        }
    }
}

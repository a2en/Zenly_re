package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.C9530g;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.C9559e;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.core.C9706a;
import com.facebook.imagepipeline.decoder.C9727c;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9731d;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.image.C9733f;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.producers.JobScheduler.JobRunnable;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.C9890a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.l */
public class C9841l implements Producer<CloseableReference<C9730c>> {

    /* renamed from: a */
    private final ByteArrayPool f25837a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f25838b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ImageDecoder f25839c;

    /* renamed from: d */
    private final ProgressiveJpegConfig f25840d;

    /* renamed from: e */
    private final Producer<C9732e> f25841e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f25842f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f25843g;

    /* renamed from: h */
    private final boolean f25844h;

    /* renamed from: i */
    private final int f25845i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C9706a f25846j;

    /* renamed from: com.facebook.imagepipeline.producers.l$a */
    private class C9842a extends C9844c {
        public C9842a(C9841l lVar, Consumer<CloseableReference<C9730c>> consumer, ProducerContext producerContext, boolean z, int i) {
            super(consumer, producerContext, z, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo26653a(C9732e eVar) {
            return eVar.mo26437k();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public synchronized boolean mo26654b(C9732e eVar, int i) {
            if (C9796b.m24325b(i)) {
                return false;
            }
            return super.mo26654b(eVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public QualityInfo mo26655c() {
            return C9733f.m24099a(0, false, false);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.l$b */
    private class C9843b extends C9844c {

        /* renamed from: i */
        private final C9727c f25847i;

        /* renamed from: j */
        private final ProgressiveJpegConfig f25848j;

        /* renamed from: k */
        private int f25849k = 0;

        public C9843b(C9841l lVar, Consumer<CloseableReference<C9730c>> consumer, ProducerContext producerContext, C9727c cVar, ProgressiveJpegConfig progressiveJpegConfig, boolean z, int i) {
            super(consumer, producerContext, z, i);
            C9536j.m23271a(cVar);
            this.f25847i = cVar;
            C9536j.m23271a(progressiveJpegConfig);
            this.f25848j = progressiveJpegConfig;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo26653a(C9732e eVar) {
            return this.f25847i.mo26396a();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
            return r0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo26654b(com.facebook.imagepipeline.image.C9732e r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = super.mo26654b(r4, r5)     // Catch:{ all -> 0x0057 }
                boolean r1 = com.facebook.imagepipeline.producers.C9796b.m24325b(r5)     // Catch:{ all -> 0x0057 }
                if (r1 != 0) goto L_0x0013
                r1 = 8
                boolean r1 = com.facebook.imagepipeline.producers.C9796b.m24326b(r5, r1)     // Catch:{ all -> 0x0057 }
                if (r1 == 0) goto L_0x0055
            L_0x0013:
                r1 = 4
                boolean r5 = com.facebook.imagepipeline.producers.C9796b.m24326b(r5, r1)     // Catch:{ all -> 0x0057 }
                if (r5 != 0) goto L_0x0055
                boolean r5 = com.facebook.imagepipeline.image.C9732e.m24071e(r4)     // Catch:{ all -> 0x0057 }
                if (r5 == 0) goto L_0x0055
                com.facebook.imageformat.ImageFormat r5 = r4.mo26432g()     // Catch:{ all -> 0x0057 }
                com.facebook.imageformat.ImageFormat r1 = com.facebook.imageformat.C9650b.f25197a     // Catch:{ all -> 0x0057 }
                if (r5 != r1) goto L_0x0055
                com.facebook.imagepipeline.decoder.c r5 = r3.f25847i     // Catch:{ all -> 0x0057 }
                boolean r4 = r5.mo26397a(r4)     // Catch:{ all -> 0x0057 }
                r5 = 0
                if (r4 != 0) goto L_0x0033
                monitor-exit(r3)
                return r5
            L_0x0033:
                com.facebook.imagepipeline.decoder.c r4 = r3.f25847i     // Catch:{ all -> 0x0057 }
                int r4 = r4.mo26398b()     // Catch:{ all -> 0x0057 }
                int r1 = r3.f25849k     // Catch:{ all -> 0x0057 }
                if (r4 > r1) goto L_0x003f
                monitor-exit(r3)
                return r5
            L_0x003f:
                com.facebook.imagepipeline.decoder.ProgressiveJpegConfig r1 = r3.f25848j     // Catch:{ all -> 0x0057 }
                int r2 = r3.f25849k     // Catch:{ all -> 0x0057 }
                int r1 = r1.getNextScanNumberToDecode(r2)     // Catch:{ all -> 0x0057 }
                if (r4 >= r1) goto L_0x0053
                com.facebook.imagepipeline.decoder.c r1 = r3.f25847i     // Catch:{ all -> 0x0057 }
                boolean r1 = r1.mo26399c()     // Catch:{ all -> 0x0057 }
                if (r1 != 0) goto L_0x0053
                monitor-exit(r3)
                return r5
            L_0x0053:
                r3.f25849k = r4     // Catch:{ all -> 0x0057 }
            L_0x0055:
                monitor-exit(r3)
                return r0
            L_0x0057:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9841l.C9843b.mo26654b(com.facebook.imagepipeline.image.e, int):boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public QualityInfo mo26655c() {
            return this.f25848j.getQualityInfo(this.f25847i.mo26398b());
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.l$c */
    private abstract class C9844c extends C9848m<C9732e, CloseableReference<C9730c>> {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final ProducerContext f25850c;

        /* renamed from: d */
        private final ProducerListener f25851d;

        /* renamed from: e */
        private final C9698b f25852e;

        /* renamed from: f */
        private boolean f25853f = false;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final JobScheduler f25854g;

        /* renamed from: com.facebook.imagepipeline.producers.l$c$a */
        class C9845a implements JobRunnable {

            /* renamed from: a */
            final /* synthetic */ ProducerContext f25856a;

            /* renamed from: b */
            final /* synthetic */ int f25857b;

            C9845a(C9841l lVar, ProducerContext producerContext, int i) {
                this.f25856a = producerContext;
                this.f25857b = i;
            }

            public void run(C9732e eVar, int i) {
                if (eVar != null) {
                    if (C9841l.this.f25842f || !C9796b.m24326b(i, 16)) {
                        C9884a imageRequest = this.f25856a.getImageRequest();
                        if (C9841l.this.f25843g || !C9559e.m23393i(imageRequest.mo26743p())) {
                            eVar.mo26431f(C9890a.m24708a(imageRequest.mo26741n(), imageRequest.mo26739l(), eVar, this.f25857b));
                        }
                    }
                    C9844c.this.m24511c(eVar, i);
                }
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.l$c$b */
        class C9846b extends C9810e {

            /* renamed from: a */
            final /* synthetic */ boolean f25859a;

            C9846b(C9841l lVar, boolean z) {
                this.f25859a = z;
            }

            public void onCancellationRequested() {
                if (this.f25859a) {
                    C9844c.this.m24513d();
                }
            }

            public void onIsIntermediateResultExpectedChanged() {
                if (C9844c.this.f25850c.isIntermediateResultExpected()) {
                    C9844c.this.f25854g.mo26581c();
                }
            }
        }

        public C9844c(Consumer<CloseableReference<C9730c>> consumer, ProducerContext producerContext, boolean z, int i) {
            super(consumer);
            this.f25850c = producerContext;
            this.f25851d = producerContext.getListener();
            this.f25852e = producerContext.getImageRequest().mo26728c();
            this.f25854g = new JobScheduler(C9841l.this.f25838b, new C9845a(C9841l.this, producerContext, i), this.f25852e.f25333a);
            this.f25850c.addCallbacks(new C9846b(C9841l.this, z));
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m24513d() {
            m24510b(true);
            mo26659b().onCancellation();
        }

        /* renamed from: e */
        private synchronized boolean m24514e() {
            return this.f25853f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo26653a(C9732e eVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract QualityInfo mo26655c();

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3 A[Catch:{ all -> 0x0148 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m24511c(com.facebook.imagepipeline.image.C9732e r19, int r20) {
            /*
                r18 = this;
                r11 = r18
                r0 = r20
                java.lang.String r12 = "DecodeProducer"
                com.facebook.imageformat.ImageFormat r1 = r19.mo26432g()
                com.facebook.imageformat.ImageFormat r2 = com.facebook.imageformat.C9650b.f25197a
                if (r1 == r2) goto L_0x0015
                boolean r1 = com.facebook.imagepipeline.producers.C9796b.m24325b(r20)
                if (r1 == 0) goto L_0x0015
                return
            L_0x0015:
                boolean r1 = r18.m24514e()
                if (r1 != 0) goto L_0x014d
                boolean r1 = com.facebook.imagepipeline.image.C9732e.m24071e(r19)
                if (r1 != 0) goto L_0x0023
                goto L_0x014d
            L_0x0023:
                com.facebook.imageformat.ImageFormat r1 = r19.mo26432g()
                java.lang.String r2 = "unknown"
                if (r1 == 0) goto L_0x0031
                java.lang.String r1 = r1.mo26150a()
                r7 = r1
                goto L_0x0032
            L_0x0031:
                r7 = r2
            L_0x0032:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r3 = r19.mo26438l()
                r1.append(r3)
                java.lang.String r3 = "x"
                r1.append(r3)
                int r4 = r19.mo26430f()
                r1.append(r4)
                java.lang.String r8 = r1.toString()
                int r1 = r19.mo26436j()
                java.lang.String r10 = java.lang.String.valueOf(r1)
                boolean r6 = com.facebook.imagepipeline.producers.C9796b.m24323a(r20)
                if (r6 == 0) goto L_0x0066
                r5 = 8
                boolean r5 = com.facebook.imagepipeline.producers.C9796b.m24326b(r0, r5)
                if (r5 != 0) goto L_0x0066
                r5 = 1
                goto L_0x0067
            L_0x0066:
                r5 = 0
            L_0x0067:
                r9 = 4
                boolean r13 = com.facebook.imagepipeline.producers.C9796b.m24326b(r0, r9)
                com.facebook.imagepipeline.producers.ProducerContext r14 = r11.f25850c
                com.facebook.imagepipeline.request.a r14 = r14.getImageRequest()
                com.facebook.imagepipeline.common.e r14 = r14.mo26739l()
                if (r14 == 0) goto L_0x008e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r15 = r14.f25355a
                r2.append(r15)
                r2.append(r3)
                int r3 = r14.f25356b
                r2.append(r3)
                java.lang.String r2 = r2.toString()
            L_0x008e:
                r14 = r2
                com.facebook.imagepipeline.producers.JobScheduler r2 = r11.f25854g     // Catch:{ all -> 0x0148 }
                long r15 = r2.mo26580b()     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.producers.ProducerContext r2 = r11.f25850c     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.request.a r2 = r2.getImageRequest()     // Catch:{ all -> 0x0148 }
                android.net.Uri r2 = r2.mo26743p()     // Catch:{ all -> 0x0148 }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0148 }
                if (r5 != 0) goto L_0x00ad
                if (r13 == 0) goto L_0x00a8
                goto L_0x00ad
            L_0x00a8:
                int r3 = r18.mo26653a(r19)     // Catch:{ all -> 0x0148 }
                goto L_0x00b1
            L_0x00ad:
                int r3 = r19.mo26437k()     // Catch:{ all -> 0x0148 }
            L_0x00b1:
                if (r5 != 0) goto L_0x00bb
                if (r13 == 0) goto L_0x00b6
                goto L_0x00bb
            L_0x00b6:
                com.facebook.imagepipeline.image.QualityInfo r5 = r18.mo26655c()     // Catch:{ all -> 0x0148 }
                goto L_0x00bd
            L_0x00bb:
                com.facebook.imagepipeline.image.QualityInfo r5 = com.facebook.imagepipeline.image.C9733f.f25573d     // Catch:{ all -> 0x0148 }
            L_0x00bd:
                com.facebook.imagepipeline.producers.ProducerListener r13 = r11.f25851d     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.producers.ProducerContext r1 = r11.f25850c     // Catch:{ all -> 0x0148 }
                java.lang.String r1 = r1.getId()     // Catch:{ all -> 0x0148 }
                r13.onProducerStart(r1, r12)     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.producers.l r13 = com.facebook.imagepipeline.producers.C9841l.this     // Catch:{ DecodeException -> 0x0100 }
                com.facebook.imagepipeline.decoder.ImageDecoder r13 = r13.f25839c     // Catch:{ DecodeException -> 0x0100 }
                com.facebook.imagepipeline.common.b r1 = r11.f25852e     // Catch:{ DecodeException -> 0x0100 }
                r4 = r19
                com.facebook.imagepipeline.image.c r13 = r13.decode(r4, r3, r5, r1)     // Catch:{ DecodeException -> 0x0100 }
                int r1 = r19.mo26436j()     // Catch:{ Exception -> 0x00fa }
                r2 = 1
                if (r1 == r2) goto L_0x00df
                r0 = r0 | 16
            L_0x00df:
                r1 = r18
                r2 = r13
                r3 = r15
                r9 = r14
                java.util.Map r1 = r1.m24505a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.producers.ProducerListener r2 = r11.f25851d     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.producers.ProducerContext r3 = r11.f25850c     // Catch:{ all -> 0x0148 }
                java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0148 }
                r2.onProducerFinishWithSuccess(r3, r12, r1)     // Catch:{ all -> 0x0148 }
                r11.m24506a(r13, r0)     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.image.C9732e.m24069c(r19)
                return
            L_0x00fa:
                r0 = move-exception
                r2 = r13
                goto L_0x012e
            L_0x00fd:
                r0 = move-exception
                r2 = 0
                goto L_0x012e
            L_0x0100:
                r0 = move-exception
                com.facebook.imagepipeline.image.e r1 = r0.mo26386a()     // Catch:{ Exception -> 0x00fd }
                java.lang.String r3 = "ProgressiveDecoder"
                java.lang.String r4 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00fd }
                java.lang.String r13 = r0.getMessage()     // Catch:{ Exception -> 0x00fd }
                r17 = 0
                r9[r17] = r13     // Catch:{ Exception -> 0x00fd }
                r13 = 1
                r9[r13] = r2     // Catch:{ Exception -> 0x00fd }
                r2 = 2
                r13 = 10
                java.lang.String r13 = r1.mo26417a(r13)     // Catch:{ Exception -> 0x00fd }
                r9[r2] = r13     // Catch:{ Exception -> 0x00fd }
                r2 = 3
                int r1 = r1.mo26437k()     // Catch:{ Exception -> 0x00fd }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00fd }
                r9[r2] = r1     // Catch:{ Exception -> 0x00fd }
                com.facebook.common.logging.C9543a.m23324c(r3, r4, r9)     // Catch:{ Exception -> 0x00fd }
                throw r0     // Catch:{ Exception -> 0x00fd }
            L_0x012e:
                r1 = r18
                r3 = r15
                r9 = r14
                java.util.Map r1 = r1.m24505a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.producers.ProducerListener r2 = r11.f25851d     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.producers.ProducerContext r3 = r11.f25850c     // Catch:{ all -> 0x0148 }
                java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0148 }
                r2.onProducerFinishWithFailure(r3, r12, r0, r1)     // Catch:{ all -> 0x0148 }
                r11.m24509b(r0)     // Catch:{ all -> 0x0148 }
                com.facebook.imagepipeline.image.C9732e.m24069c(r19)
                return
            L_0x0148:
                r0 = move-exception
                com.facebook.imagepipeline.image.C9732e.m24069c(r19)
                throw r0
            L_0x014d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C9841l.C9844c.m24511c(com.facebook.imagepipeline.image.e, int):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo26654b(C9732e eVar, int i) {
            return this.f25854g.mo26579a(eVar, i);
        }

        /* renamed from: b */
        private void m24510b(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f25853f) {
                        mo26659b().onProgressUpdate(1.0f);
                        this.f25853f = true;
                        this.f25854g.mo26578a();
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo26609a(C9732e eVar, int i) {
            try {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24703a("DecodeProducer#onNewResultImpl");
                }
                boolean a = C9796b.m24323a(i);
                if (a && !C9732e.m24071e(eVar)) {
                    m24509b((Throwable) new ExceptionWithNoStacktrace("Encoded image is not valid."));
                } else if (!mo26654b(eVar, i)) {
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                } else {
                    boolean b = C9796b.m24326b(i, 4);
                    if (a || b || this.f25850c.isIntermediateResultExpected()) {
                        this.f25854g.mo26581c();
                    }
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                }
            } finally {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
            }
        }

        /* renamed from: b */
        private void m24509b(Throwable th) {
            m24510b(true);
            mo26659b().onFailure(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26615a(float f) {
            super.mo26615a(f * 0.99f);
        }

        /* renamed from: a */
        public void mo26617a(Throwable th) {
            m24509b(th);
        }

        /* renamed from: a */
        public void mo26614a() {
            m24513d();
        }

        /* renamed from: a */
        private Map<String, String> m24505a(C9730c cVar, long j, QualityInfo qualityInfo, boolean z, String str, String str2, String str3, String str4) {
            C9730c cVar2 = cVar;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            if (!this.f25851d.requiresExtraMap(this.f25850c.getId())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(qualityInfo.isOfGoodEnoughQuality());
            String valueOf3 = String.valueOf(z);
            String str9 = "sampleSize";
            String str10 = "requestedImageSize";
            String str11 = "imageFormat";
            String str12 = "encodedImageSize";
            String str13 = "isFinal";
            String str14 = "hasGoodQuality";
            String str15 = "queueTime";
            if (cVar2 instanceof C9731d) {
                Bitmap c = ((C9731d) cVar2).mo26411c();
                StringBuilder sb = new StringBuilder();
                sb.append(c.getWidth());
                sb.append("x");
                sb.append(c.getHeight());
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", sb2);
                hashMap.put(str15, valueOf);
                hashMap.put(str14, valueOf2);
                hashMap.put(str13, valueOf3);
                hashMap.put(str12, str6);
                hashMap.put(str11, str5);
                hashMap.put(str10, str7);
                hashMap.put(str9, str4);
                return C9530g.m23257a(hashMap);
            }
            String str16 = str8;
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put(str15, valueOf);
            hashMap2.put(str14, valueOf2);
            hashMap2.put(str13, valueOf3);
            hashMap2.put(str12, str6);
            hashMap2.put(str11, str5);
            hashMap2.put(str10, str7);
            hashMap2.put(str9, str16);
            return C9530g.m23257a(hashMap2);
        }

        /* renamed from: a */
        private void m24506a(C9730c cVar, int i) {
            CloseableReference a = C9841l.this.f25846j.mo26303a(cVar);
            try {
                m24510b(C9796b.m24323a(i));
                mo26659b().onNewResult(a, i);
            } finally {
                CloseableReference.m23355b(a);
            }
        }
    }

    public C9841l(ByteArrayPool byteArrayPool, Executor executor, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, boolean z2, boolean z3, Producer<C9732e> producer, int i, C9706a aVar) {
        C9536j.m23271a(byteArrayPool);
        this.f25837a = byteArrayPool;
        C9536j.m23271a(executor);
        this.f25838b = executor;
        C9536j.m23271a(imageDecoder);
        this.f25839c = imageDecoder;
        C9536j.m23271a(progressiveJpegConfig);
        this.f25840d = progressiveJpegConfig;
        this.f25842f = z;
        this.f25843g = z2;
        C9536j.m23271a(producer);
        this.f25841e = producer;
        this.f25844h = z3;
        this.f25845i = i;
        this.f25846j = aVar;
    }

    public void produceResults(Consumer<CloseableReference<C9730c>> consumer, ProducerContext producerContext) {
        C9842a aVar;
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("DecodeProducer#produceResults");
            }
            if (!C9559e.m23393i(producerContext.getImageRequest().mo26743p())) {
                C9842a aVar2 = new C9842a(this, consumer, producerContext, this.f25844h, this.f25845i);
                aVar = aVar2;
            } else {
                C9843b bVar = new C9843b(this, consumer, producerContext, new C9727c(this.f25837a), this.f25840d, this.f25844h, this.f25845i);
                aVar = bVar;
            }
            this.f25841e.produceResults(aVar, producerContext);
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }
}

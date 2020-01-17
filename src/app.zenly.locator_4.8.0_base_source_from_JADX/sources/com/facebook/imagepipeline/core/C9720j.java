package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.C9560a;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.producers.C9847l0;
import com.facebook.imagepipeline.producers.C9853n;
import com.facebook.imagepipeline.producers.C9858o;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.core.j */
public class C9720j {

    /* renamed from: a */
    private final ContentResolver f25518a;

    /* renamed from: b */
    private final C9719i f25519b;

    /* renamed from: c */
    private final NetworkFetcher f25520c;

    /* renamed from: d */
    private final boolean f25521d;

    /* renamed from: e */
    private final boolean f25522e;

    /* renamed from: f */
    private final boolean f25523f;

    /* renamed from: g */
    private final C9847l0 f25524g;

    /* renamed from: h */
    private final boolean f25525h;

    /* renamed from: i */
    private final boolean f25526i;

    /* renamed from: j */
    private final boolean f25527j;

    /* renamed from: k */
    private final ImageTranscoderFactory f25528k;

    /* renamed from: l */
    Producer<CloseableReference<C9730c>> f25529l;

    /* renamed from: m */
    private Producer<C9732e> f25530m;

    /* renamed from: n */
    Producer<CloseableReference<C9730c>> f25531n;

    /* renamed from: o */
    Producer<CloseableReference<C9730c>> f25532o;

    /* renamed from: p */
    Producer<CloseableReference<C9730c>> f25533p;

    /* renamed from: q */
    Producer<CloseableReference<C9730c>> f25534q;

    /* renamed from: r */
    Producer<CloseableReference<C9730c>> f25535r;

    /* renamed from: s */
    Producer<CloseableReference<C9730c>> f25536s;

    /* renamed from: t */
    Producer<CloseableReference<C9730c>> f25537t;

    /* renamed from: u */
    Map<Producer<CloseableReference<C9730c>>, Producer<CloseableReference<C9730c>>> f25538u = new HashMap();

    /* renamed from: v */
    Map<Producer<CloseableReference<C9730c>>, Producer<CloseableReference<C9730c>>> f25539v;

    public C9720j(ContentResolver contentResolver, C9719i iVar, NetworkFetcher networkFetcher, boolean z, boolean z2, C9847l0 l0Var, boolean z3, boolean z4, boolean z5, boolean z6, ImageTranscoderFactory imageTranscoderFactory) {
        this.f25518a = contentResolver;
        this.f25519b = iVar;
        this.f25520c = networkFetcher;
        this.f25521d = z;
        this.f25522e = z2;
        new HashMap();
        this.f25539v = new HashMap();
        this.f25524g = l0Var;
        this.f25525h = z3;
        this.f25526i = z4;
        this.f25523f = z5;
        this.f25527j = z6;
        this.f25528k = imageTranscoderFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc A[FINALLY_INSNS] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.producers.Producer<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.C9730c>> m24026b(com.facebook.imagepipeline.request.C9884a r4) {
        /*
            r3 = this;
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ProducerSequenceFactory#getBasicDecodedImageSequence"
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24703a(r0)     // Catch:{ all -> 0x00c5 }
        L_0x000b:
            com.facebook.common.internal.C9536j.m23271a(r4)     // Catch:{ all -> 0x00c5 }
            android.net.Uri r0 = r4.mo26743p()     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "Uri is null."
            com.facebook.common.internal.C9536j.m23272a(r0, r1)     // Catch:{ all -> 0x00c5 }
            int r4 = r4.mo26744q()     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x00b7
            switch(r4) {
                case 2: goto L_0x00a9;
                case 3: goto L_0x009b;
                case 4: goto L_0x0073;
                case 5: goto L_0x0065;
                case 6: goto L_0x0057;
                case 7: goto L_0x0049;
                case 8: goto L_0x003b;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x00c5 }
        L_0x0020:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            r1.<init>()     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "Unsupported uri scheme! Uri is: "
            r1.append(r2)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = m24022a(r0)     // Catch:{ all -> 0x00c5 }
            r1.append(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c5 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c5 }
            throw r4     // Catch:{ all -> 0x00c5 }
        L_0x003b:
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24038i()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x0048
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x0048:
            return r4
        L_0x0049:
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24023b()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x0056
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x0056:
            return r4
        L_0x0057:
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24033f()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x0064
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x0064:
            return r4
        L_0x0065:
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24027c()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x0072
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x0072:
            return r4
        L_0x0073:
            android.content.ContentResolver r4 = r3.f25518a     // Catch:{ all -> 0x00c5 }
            java.lang.String r4 = r4.getType(r0)     // Catch:{ all -> 0x00c5 }
            boolean r4 = p333g.p339c.p340a.p341a.C12025a.m31680c(r4)     // Catch:{ all -> 0x00c5 }
            if (r4 == 0) goto L_0x008d
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24035g()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x008c
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x008c:
            return r4
        L_0x008d:
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24029d()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x009a
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x009a:
            return r4
        L_0x009b:
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24031e()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x00a8
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x00a8:
            return r4
        L_0x00a9:
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24035g()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x00b6
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x00b6:
            return r4
        L_0x00b7:
            com.facebook.imagepipeline.producers.Producer r4 = r3.m24037h()     // Catch:{ all -> 0x00c5 }
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x00c4
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x00c4:
            return r4
        L_0x00c5:
            r4 = move-exception
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x00cf
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x00cf:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.C9720j.m24026b(com.facebook.imagepipeline.request.a):com.facebook.imagepipeline.producers.Producer");
    }

    /* renamed from: c */
    private synchronized Producer<CloseableReference<C9730c>> m24027c() {
        if (this.f25535r == null) {
            this.f25535r = m24032e(this.f25519b.mo26361b());
        }
        return this.f25535r;
    }

    /* renamed from: d */
    private synchronized Producer<CloseableReference<C9730c>> m24029d() {
        if (this.f25533p == null) {
            this.f25533p = m24020a(this.f25519b.mo26363c(), new ThumbnailProducer[]{this.f25519b.mo26365d(), this.f25519b.mo26367e()});
        }
        return this.f25533p;
    }

    /* renamed from: e */
    private synchronized Producer<CloseableReference<C9730c>> m24031e() {
        if (this.f25531n == null) {
            this.f25531n = m24032e(this.f25519b.mo26369f());
        }
        return this.f25531n;
    }

    /* renamed from: f */
    private synchronized Producer<CloseableReference<C9730c>> m24033f() {
        if (this.f25534q == null) {
            this.f25534q = m24032e(this.f25519b.mo26371g());
        }
        return this.f25534q;
    }

    /* renamed from: g */
    private synchronized Producer<CloseableReference<C9730c>> m24035g() {
        if (this.f25532o == null) {
            this.f25532o = m24028c(this.f25519b.mo26372h());
        }
        return this.f25532o;
    }

    /* renamed from: h */
    private synchronized Producer<CloseableReference<C9730c>> m24037h() {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f25529l == null) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f25529l = m24030d(m24018a());
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return this.f25529l;
    }

    /* renamed from: i */
    private synchronized Producer<CloseableReference<C9730c>> m24038i() {
        if (this.f25537t == null) {
            this.f25537t = m24032e(this.f25519b.mo26374i());
        }
        return this.f25537t;
    }

    /* renamed from: a */
    public Producer<CloseableReference<C9730c>> mo26381a(C9884a aVar) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        Producer<CloseableReference<C9730c>> b = m24026b(aVar);
        if (aVar.mo26732f() != null) {
            b = m24024b(b);
        }
        if (this.f25526i) {
            b = m24019a(b);
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return b;
    }

    /* renamed from: c */
    private Producer<CloseableReference<C9730c>> m24028c(Producer<CloseableReference<C9730c>> producer) {
        return this.f25519b.mo26355a((Producer<CloseableReference<C9730c>>) this.f25519b.mo26357a((Producer<T>) this.f25519b.mo26360b(this.f25519b.mo26362c(producer)), this.f25524g));
    }

    /* renamed from: e */
    private Producer<CloseableReference<C9730c>> m24032e(Producer<C9732e> producer) {
        return m24020a(producer, new ThumbnailProducer[]{this.f25519b.mo26367e()});
    }

    /* renamed from: f */
    private Producer<C9732e> m24034f(Producer<C9732e> producer) {
        C9858o oVar;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f25523f) {
            oVar = this.f25519b.mo26370g(this.f25519b.mo26376j(producer));
        } else {
            oVar = this.f25519b.mo26370g(producer);
        }
        C9853n f = this.f25519b.mo26368f(oVar);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return f;
    }

    /* renamed from: g */
    private Producer<C9732e> m24036g(Producer<C9732e> producer) {
        if (C9560a.f24760a && (!this.f25522e || C9560a.f24762c == null)) {
            producer = this.f25519b.mo26380n(producer);
        }
        if (this.f25527j) {
            producer = m24034f(producer);
        }
        return this.f25519b.mo26373h(this.f25519b.mo26375i(producer));
    }

    /* renamed from: d */
    private Producer<CloseableReference<C9730c>> m24030d(Producer<C9732e> producer) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        Producer<CloseableReference<C9730c>> c = m24028c(this.f25519b.mo26366e(producer));
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return c;
    }

    /* renamed from: a */
    private synchronized Producer<C9732e> m24018a() {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f25530m == null) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            this.f25530m = C9719i.m23990o(m24036g(this.f25519b.mo26354a(this.f25520c)));
            this.f25530m = this.f25519b.mo26356a(this.f25530m, this.f25521d && !this.f25525h, this.f25528k);
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return this.f25530m;
    }

    /* renamed from: a */
    private Producer<CloseableReference<C9730c>> m24020a(Producer<C9732e> producer, ThumbnailProducer<C9732e>[] thumbnailProducerArr) {
        return m24030d(m24025b(m24036g(producer), thumbnailProducerArr));
    }

    /* renamed from: a */
    private Producer<C9732e> m24021a(ThumbnailProducer<C9732e>[] thumbnailProducerArr) {
        return this.f25519b.mo26356a(this.f25519b.mo26359a(thumbnailProducerArr), true, this.f25528k);
    }

    /* renamed from: a */
    private synchronized Producer<CloseableReference<C9730c>> m24019a(Producer<CloseableReference<C9730c>> producer) {
        Producer<CloseableReference<C9730c>> producer2;
        producer2 = (Producer) this.f25539v.get(producer);
        if (producer2 == null) {
            producer2 = this.f25519b.mo26364d(producer);
            this.f25539v.put(producer, producer2);
        }
        return producer2;
    }

    /* renamed from: a */
    private static String m24022a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf.substring(0, 30));
        sb.append("...");
        return sb.toString();
    }

    /* renamed from: b */
    private synchronized Producer<CloseableReference<C9730c>> m24023b() {
        if (this.f25536s == null) {
            Producer a = this.f25519b.mo26358a();
            if (C9560a.f24760a && (!this.f25522e || C9560a.f24762c == null)) {
                a = this.f25519b.mo26380n(a);
            }
            this.f25536s = m24030d(this.f25519b.mo26356a(C9719i.m23990o(a), true, this.f25528k));
        }
        return this.f25536s;
    }

    /* renamed from: b */
    private Producer<C9732e> m24025b(Producer<C9732e> producer, ThumbnailProducer<C9732e>[] thumbnailProducerArr) {
        return C9719i.m23989a(m24021a(thumbnailProducerArr), (Producer<C9732e>) this.f25519b.mo26379m(this.f25519b.mo26356a(C9719i.m23990o(producer), true, this.f25528k)));
    }

    /* renamed from: b */
    private synchronized Producer<CloseableReference<C9730c>> m24024b(Producer<CloseableReference<C9730c>> producer) {
        if (!this.f25538u.containsKey(producer)) {
            this.f25538u.put(producer, this.f25519b.mo26377k(this.f25519b.mo26378l(producer)));
        }
        return (Producer) this.f25538u.get(producer);
    }
}

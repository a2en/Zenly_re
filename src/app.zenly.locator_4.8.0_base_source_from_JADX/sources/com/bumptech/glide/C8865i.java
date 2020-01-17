package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.p300n.C9199a;
import com.bumptech.glide.p301o.C9209e;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.C9220a;
import com.bumptech.glide.request.C9222c;
import com.bumptech.glide.request.C9224d;
import com.bumptech.glide.request.C9225e;
import com.bumptech.glide.request.C9227f;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.C9238i;
import com.bumptech.glide.request.target.Target;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.i */
public class C8865i<TranscodeType> extends C9220a<C8865i<TranscodeType>> implements Cloneable, C8858f<C8865i<TranscodeType>> {

    /* renamed from: E */
    private final Context f23095E;

    /* renamed from: F */
    private final C8867j f23096F;

    /* renamed from: G */
    private final Class<TranscodeType> f23097G;

    /* renamed from: H */
    private final C8856d f23098H;

    /* renamed from: I */
    private C8871k<?, ? super TranscodeType> f23099I;

    /* renamed from: J */
    private Object f23100J;

    /* renamed from: K */
    private List<RequestListener<TranscodeType>> f23101K;

    /* renamed from: L */
    private C8865i<TranscodeType> f23102L;

    /* renamed from: M */
    private C8865i<TranscodeType> f23103M;

    /* renamed from: N */
    private Float f23104N;

    /* renamed from: O */
    private boolean f23105O = true;

    /* renamed from: P */
    private boolean f23106P;

    /* renamed from: Q */
    private boolean f23107Q;

    /* renamed from: com.bumptech.glide.i$a */
    static /* synthetic */ class C8866a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23108a = new int[ScaleType.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f23109b = new int[C8859g.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0087 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.C8859g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23109b = r0
                r0 = 1
                int[] r1 = f23109b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bumptech.glide.g r2 = com.bumptech.glide.C8859g.LOW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f23109b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bumptech.glide.g r3 = com.bumptech.glide.C8859g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f23109b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bumptech.glide.g r4 = com.bumptech.glide.C8859g.HIGH     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f23109b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bumptech.glide.g r5 = com.bumptech.glide.C8859g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f23108a = r4
                int[] r4 = f23108a     // Catch:{ NoSuchFieldError -> 0x0048 }
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = f23108a     // Catch:{ NoSuchFieldError -> 0x0052 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f23108a     // Catch:{ NoSuchFieldError -> 0x005c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f23108a     // Catch:{ NoSuchFieldError -> 0x0066 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = f23108a     // Catch:{ NoSuchFieldError -> 0x0071 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f23108a     // Catch:{ NoSuchFieldError -> 0x007c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r0 = f23108a     // Catch:{ NoSuchFieldError -> 0x0087 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f23108a     // Catch:{ NoSuchFieldError -> 0x0093 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C8865i.C8866a.<clinit>():void");
        }
    }

    static {
        C9224d dVar = (C9224d) ((C9224d) ((C9224d) new C9224d().mo8517a(C8978i.f23425c)).mo8513a(C8859g.LOW)).mo8521a(true);
    }

    @SuppressLint({"CheckResult"})
    protected C8865i(Glide glide, C8867j jVar, Class<TranscodeType> cls, Context context) {
        this.f23096F = jVar;
        this.f23097G = cls;
        this.f23095E = context;
        this.f23099I = jVar.mo24179b(cls);
        this.f23098H = glide.mo24094f();
        m21217a(jVar.mo24181d());
        m21234a((C9220a<?>) jVar.mo24182e());
    }

    /* renamed from: M */
    public FutureTarget<TranscodeType> mo24170M() {
        return mo24175c(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public C8865i<TranscodeType> mo8539b(RequestListener<TranscodeType> requestListener) {
        this.f23101K = null;
        return mo8530a(requestListener);
    }

    /* renamed from: c */
    public FutureTarget<TranscodeType> mo24175c(int i, int i2) {
        C9222c cVar = new C9222c(i, i2);
        mo24172a(cVar, cVar, C9209e.m22069a());
        return cVar;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    private void m21217a(List<RequestListener<Object>> list) {
        for (RequestListener a : list) {
            mo8530a(a);
        }
    }

    /* renamed from: b */
    public C8865i<TranscodeType> mo8538b(C8865i<TranscodeType> iVar) {
        this.f23102L = iVar;
        return this;
    }

    public C8865i<TranscodeType> clone() {
        C8865i<TranscodeType> iVar = (C8865i) super.clone();
        iVar.f23099I = iVar.f23099I.clone();
        return iVar;
    }

    /* renamed from: b */
    private C8865i<TranscodeType> m21220b(Object obj) {
        this.f23100J = obj;
        this.f23106P = true;
        return this;
    }

    /* renamed from: a */
    public C8865i<TranscodeType> m21234a(C9220a<?> aVar) {
        C9216j.m22083a(aVar);
        return (C8865i) super.mo8519a(aVar);
    }

    /* renamed from: b */
    private <Y extends Target<TranscodeType>> Y m21222b(Y y, RequestListener<TranscodeType> requestListener, C9220a<?> aVar, Executor executor) {
        C9216j.m22083a(y);
        if (this.f23106P) {
            Request a = m21214a(y, requestListener, aVar, executor);
            Request request = y.getRequest();
            if (!a.isEquivalentTo(request) || m21218a(aVar, request)) {
                this.f23096F.mo24177a((Target<?>) y);
                y.setRequest(a);
                this.f23096F.mo24178a(y, a);
                return y;
            }
            C9216j.m22083a(request);
            if (!request.isRunning()) {
                request.begin();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8530a(RequestListener<TranscodeType> requestListener) {
        if (requestListener != null) {
            if (this.f23101K == null) {
                this.f23101K = new ArrayList();
            }
            this.f23101K.add(requestListener);
        }
        return this;
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8529a(C8865i<TranscodeType> iVar) {
        this.f23103M = iVar;
        return this;
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8533a(Object obj) {
        m21220b(obj);
        return this;
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8527a(Drawable drawable) {
        m21220b((Object) drawable);
        return m21234a((C9220a<?>) C9224d.m22185b(C8978i.f23424b));
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8534a(String str) {
        m21220b((Object) str);
        return this;
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8528a(Uri uri) {
        m21220b((Object) uri);
        return this;
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8531a(File file) {
        m21220b((Object) file);
        return this;
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8532a(Integer num) {
        m21220b((Object) num);
        return m21234a((C9220a<?>) C9224d.m22183b(C9199a.m22049a(this.f23095E)));
    }

    /* renamed from: a */
    public C8865i<TranscodeType> mo8535a(byte[] bArr) {
        m21220b((Object) bArr);
        C8865i a = !mo24890z() ? m21234a((C9220a<?>) C9224d.m22185b(C8978i.f23424b)) : this;
        return !a.mo24860D() ? a.m21234a((C9220a<?>) C9224d.m22187c(true)) : a;
    }

    @Deprecated
    /* renamed from: b */
    public FutureTarget<TranscodeType> mo24174b(int i, int i2) {
        return mo24175c(i, i2);
    }

    /* renamed from: b */
    private C8859g m21219b(C8859g gVar) {
        int i = C8866a.f23109b[gVar.ordinal()];
        if (i == 1) {
            return C8859g.NORMAL;
        }
        if (i == 2) {
            return C8859g.HIGH;
        }
        if (i == 3 || i == 4) {
            return C8859g.IMMEDIATE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown priority: ");
        sb.append(mo24882r());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <Y extends Target<TranscodeType>> Y mo24171a(Y y) {
        mo24172a(y, null, C9209e.m22070b());
        return y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Y extends Target<TranscodeType>> Y mo24172a(Y y, RequestListener<TranscodeType> requestListener, Executor executor) {
        m21222b(y, requestListener, this, executor);
        return y;
    }

    /* renamed from: a */
    private boolean m21218a(C9220a<?> aVar, Request request) {
        return !aVar.mo24857A() && request.isComplete();
    }

    /* renamed from: b */
    private Request m21221b(Object obj, Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, RequestCoordinator requestCoordinator, C8871k<?, ? super TranscodeType> kVar, C8859g gVar, int i, int i2, C9220a<?> aVar, Executor executor) {
        C8859g gVar2;
        Object obj2 = obj;
        RequestCoordinator requestCoordinator2 = requestCoordinator;
        C8859g gVar3 = gVar;
        C8865i<TranscodeType> iVar = this.f23102L;
        if (iVar != null) {
            if (!this.f23107Q) {
                C8871k<?, ? super TranscodeType> kVar2 = iVar.f23105O ? kVar : iVar.f23099I;
                if (this.f23102L.mo24858B()) {
                    gVar2 = this.f23102L.mo24882r();
                } else {
                    gVar2 = m21219b(gVar3);
                }
                C8859g gVar4 = gVar2;
                int o = this.f23102L.mo24879o();
                int n = this.f23102L.mo24878n();
                if (C9217k.m22104b(i, i2) && !this.f23102L.mo24864H()) {
                    o = aVar.mo24879o();
                    n = aVar.mo24878n();
                }
                int i3 = o;
                int i4 = n;
                C9227f fVar = new C9227f(obj2, requestCoordinator2);
                Object obj3 = obj;
                Target<TranscodeType> target2 = target;
                RequestListener<TranscodeType> requestListener2 = requestListener;
                C9227f fVar2 = fVar;
                Request a = m21216a(obj3, target2, requestListener2, aVar, (RequestCoordinator) fVar, kVar, gVar, i, i2, executor);
                this.f23107Q = true;
                C8865i<TranscodeType> iVar2 = this.f23102L;
                Request request = a;
                Request a2 = iVar2.m21215a(obj3, target2, requestListener2, (RequestCoordinator) fVar2, kVar2, gVar4, i3, i4, (C9220a<?>) iVar2, executor);
                this.f23107Q = false;
                fVar2.mo24904a(request, a2);
                return fVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f23104N == null) {
            return m21216a(obj, target, requestListener, aVar, requestCoordinator, kVar, gVar, i, i2, executor);
        } else {
            C9227f fVar3 = new C9227f(obj2, requestCoordinator2);
            Target<TranscodeType> target3 = target;
            RequestListener<TranscodeType> requestListener3 = requestListener;
            C9227f fVar4 = fVar3;
            C8871k<?, ? super TranscodeType> kVar3 = kVar;
            int i5 = i;
            int i6 = i2;
            Executor executor2 = executor;
            fVar3.mo24904a(m21216a(obj, target3, requestListener3, aVar, (RequestCoordinator) fVar4, kVar3, gVar, i5, i6, executor2), m21216a(obj, target3, requestListener3, aVar.clone().mo8511a(this.f23104N.floatValue()), (RequestCoordinator) fVar4, kVar3, m21219b(gVar3), i5, i6, executor2));
            return fVar3;
        }
    }

    /* renamed from: a */
    public C9238i<ImageView, TranscodeType> mo24173a(ImageView imageView) {
        C9220a aVar;
        C9217k.m22103b();
        C9216j.m22083a(imageView);
        if (!mo24863G() && mo24861E() && imageView.getScaleType() != null) {
            switch (C8866a.f23108a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo8507J();
                    break;
                case 2:
                    aVar = clone().mo8508K();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo8509L();
                    break;
                case 6:
                    aVar = clone().mo8508K();
                    break;
            }
        }
        aVar = this;
        C9238i<ImageView, TranscodeType> a = this.f23098H.mo24127a(imageView, this.f23097G);
        m21222b(a, null, aVar, C9209e.m22070b());
        return a;
    }

    /* renamed from: a */
    private Request m21214a(Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, C9220a<?> aVar, Executor executor) {
        return m21215a(new Object(), target, requestListener, (RequestCoordinator) null, this.f23099I, aVar.mo24882r(), aVar.mo24879o(), aVar.mo24878n(), aVar, executor);
    }

    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.bumptech.glide.request.RequestCoordinator] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.bumptech.glide.request.b] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.request.Request m21215a(java.lang.Object r24, com.bumptech.glide.request.target.Target<TranscodeType> r25, com.bumptech.glide.request.RequestListener<TranscodeType> r26, com.bumptech.glide.request.RequestCoordinator r27, com.bumptech.glide.C8871k<?, ? super TranscodeType> r28, com.bumptech.glide.C8859g r29, int r30, int r31, com.bumptech.glide.request.C9220a<?> r32, java.util.concurrent.Executor r33) {
        /*
            r23 = this;
            r11 = r23
            com.bumptech.glide.i<TranscodeType> r0 = r11.f23103M
            if (r0 == 0) goto L_0x0012
            com.bumptech.glide.request.b r0 = new com.bumptech.glide.request.b
            r13 = r24
            r1 = r27
            r0.<init>(r13, r1)
            r4 = r0
            r15 = r4
            goto L_0x0019
        L_0x0012:
            r13 = r24
            r1 = r27
            r0 = 0
            r15 = r0
            r4 = r1
        L_0x0019:
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            com.bumptech.glide.request.Request r0 = r0.m21221b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r15 != 0) goto L_0x0034
            return r0
        L_0x0034:
            com.bumptech.glide.i<TranscodeType> r1 = r11.f23103M
            int r1 = r1.mo24879o()
            com.bumptech.glide.i<TranscodeType> r2 = r11.f23103M
            int r2 = r2.mo24878n()
            boolean r3 = com.bumptech.glide.p301o.C9217k.m22104b(r30, r31)
            if (r3 == 0) goto L_0x0056
            com.bumptech.glide.i<TranscodeType> r3 = r11.f23103M
            boolean r3 = r3.mo24864H()
            if (r3 != 0) goto L_0x0056
            int r1 = r32.mo24879o()
            int r2 = r32.mo24878n()
        L_0x0056:
            r19 = r1
            r20 = r2
            com.bumptech.glide.i<TranscodeType> r12 = r11.f23103M
            com.bumptech.glide.k<?, ? super TranscodeType> r1 = r12.f23099I
            com.bumptech.glide.g r18 = r12.mo24882r()
            com.bumptech.glide.i<TranscodeType> r2 = r11.f23103M
            r13 = r24
            r14 = r25
            r3 = r15
            r15 = r26
            r16 = r3
            r17 = r1
            r21 = r2
            r22 = r33
            com.bumptech.glide.request.Request r1 = r12.m21215a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.mo24891a(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C8865i.m21215a(java.lang.Object, com.bumptech.glide.request.target.Target, com.bumptech.glide.request.RequestListener, com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.k, com.bumptech.glide.g, int, int, com.bumptech.glide.request.a, java.util.concurrent.Executor):com.bumptech.glide.request.Request");
    }

    /* renamed from: a */
    private Request m21216a(Object obj, Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, C9220a<?> aVar, RequestCoordinator requestCoordinator, C8871k<?, ? super TranscodeType> kVar, C8859g gVar, int i, int i2, Executor executor) {
        Context context = this.f23095E;
        C8856d dVar = this.f23098H;
        return C9225e.m22190a(context, dVar, obj, this.f23100J, this.f23097G, aVar, i, i2, gVar, target, requestListener, this.f23101K, requestCoordinator, dVar.mo24130d(), kVar.mo24196a(), executor);
    }
}

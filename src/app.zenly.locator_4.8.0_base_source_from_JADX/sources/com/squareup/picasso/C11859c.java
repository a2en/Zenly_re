package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.squareup.picasso.C11893u.C11894a;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.Picasso.C11847d;
import com.squareup.picasso.Picasso.C11848e;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.c */
class C11859c implements Runnable {

    /* renamed from: A */
    private static final C11893u f30712A = new C11861b();

    /* renamed from: x */
    private static final Object f30713x = new Object();

    /* renamed from: y */
    private static final ThreadLocal<StringBuilder> f30714y = new C11860a();

    /* renamed from: z */
    private static final AtomicInteger f30715z = new AtomicInteger();

    /* renamed from: e */
    final int f30716e = f30715z.incrementAndGet();

    /* renamed from: f */
    final Picasso f30717f;

    /* renamed from: g */
    final C11870g f30718g;

    /* renamed from: h */
    final Cache f30719h;

    /* renamed from: i */
    final C11896w f30720i;

    /* renamed from: j */
    final String f30721j;

    /* renamed from: k */
    final C11889s f30722k;

    /* renamed from: l */
    final int f30723l;

    /* renamed from: m */
    int f30724m;

    /* renamed from: n */
    final C11893u f30725n;

    /* renamed from: o */
    C11849a f30726o;

    /* renamed from: p */
    List<C11849a> f30727p;

    /* renamed from: q */
    Bitmap f30728q;

    /* renamed from: r */
    Future<?> f30729r;

    /* renamed from: s */
    C11847d f30730s;

    /* renamed from: t */
    Exception f30731t;

    /* renamed from: u */
    int f30732u;

    /* renamed from: v */
    int f30733v;

    /* renamed from: w */
    C11848e f30734w;

    /* renamed from: com.squareup.picasso.c$a */
    static class C11860a extends ThreadLocal<StringBuilder> {
        C11860a() {
        }

        /* access modifiers changed from: protected */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    static class C11861b extends C11893u {
        C11861b() {
        }

        /* renamed from: a */
        public C11894a mo35068a(C11889s sVar, int i) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized type of request: ");
            sb.append(sVar);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public boolean mo35069a(C11889s sVar) {
            return true;
        }
    }

    /* renamed from: com.squareup.picasso.c$c */
    static class C11862c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Transformation f30735e;

        /* renamed from: f */
        final /* synthetic */ RuntimeException f30736f;

        C11862c(Transformation transformation, RuntimeException runtimeException) {
            this.f30735e = transformation;
            this.f30736f = runtimeException;
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Transformation ");
            sb.append(this.f30735e.key());
            sb.append(" crashed with exception.");
            throw new RuntimeException(sb.toString(), this.f30736f);
        }
    }

    /* renamed from: com.squareup.picasso.c$d */
    static class C11863d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ StringBuilder f30737e;

        C11863d(StringBuilder sb) {
            this.f30737e = sb;
        }

        public void run() {
            throw new NullPointerException(this.f30737e.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$e */
    static class C11864e implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Transformation f30738e;

        C11864e(Transformation transformation) {
            this.f30738e = transformation;
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Transformation ");
            sb.append(this.f30738e.key());
            sb.append(" returned input Bitmap but recycled it.");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$f */
    static class C11865f implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Transformation f30739e;

        C11865f(Transformation transformation) {
            this.f30739e = transformation;
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Transformation ");
            sb.append(this.f30739e.key());
            sb.append(" mutated input Bitmap but failed to recycle the original.");
            throw new IllegalStateException(sb.toString());
        }
    }

    C11859c(Picasso picasso, C11870g gVar, Cache cache, C11896w wVar, C11849a aVar, C11893u uVar) {
        this.f30717f = picasso;
        this.f30718g = gVar;
        this.f30719h = cache;
        this.f30720i = wVar;
        this.f30726o = aVar;
        this.f30721j = aVar.mo35055c();
        this.f30722k = aVar.mo35060h();
        this.f30734w = aVar.mo35059g();
        this.f30723l = aVar.mo35056d();
        this.f30724m = aVar.mo35057e();
        this.f30725n = uVar;
        this.f30733v = uVar.mo35130a();
    }

    /* renamed from: a */
    static Bitmap m31129a(InputStream inputStream, C11889s sVar) throws IOException {
        C11878k kVar = new C11878k(inputStream);
        long a = kVar.mo35119a(65536);
        Options b = C11893u.m31248b(sVar);
        boolean a2 = C11893u.m31247a(b);
        boolean b2 = C11851a0.m31118b((InputStream) kVar);
        kVar.mo35120a(a);
        if (b2) {
            byte[] c = C11851a0.m31120c((InputStream) kVar);
            if (a2) {
                BitmapFactory.decodeByteArray(c, 0, c.length, b);
                C11893u.m31246a(sVar.f30815h, sVar.f30816i, b, sVar);
            }
            return BitmapFactory.decodeByteArray(c, 0, c.length, b);
        }
        if (a2) {
            BitmapFactory.decodeStream(kVar, null, b);
            C11893u.m31246a(sVar.f30815h, sVar.f30816i, b, sVar);
            kVar.mo35120a(a);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(kVar, null, b);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: a */
    private static boolean m31133a(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    /* renamed from: o */
    private C11848e m31134o() {
        C11848e eVar = C11848e.LOW;
        List<C11849a> list = this.f30727p;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (this.f30726o == null && !z2) {
            z = false;
        }
        if (!z) {
            return eVar;
        }
        C11849a aVar = this.f30726o;
        if (aVar != null) {
            eVar = aVar.mo35059g();
        }
        if (z2) {
            int size = this.f30727p.size();
            for (int i = 0; i < size; i++) {
                C11848e g = ((C11849a) this.f30727p.get(i)).mo35059g();
                if (g.ordinal() > eVar.ordinal()) {
                    eVar = g;
                }
            }
        }
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35074b(C11849a aVar) {
        boolean z;
        if (this.f30726o == aVar) {
            this.f30726o = null;
            z = true;
        } else {
            List<C11849a> list = this.f30727p;
            z = list != null ? list.remove(aVar) : false;
        }
        if (z && aVar.mo35059g() == this.f30734w) {
            this.f30734w = m31134o();
        }
        if (this.f30717f.f30671n) {
            C11851a0.m31113a("Hunter", "removed", aVar.f30697b.mo35144d(), C11851a0.m31106a(this, "from "));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public List<C11849a> mo35075c() {
        return this.f30727p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C11889s mo35076d() {
        return this.f30722k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Exception mo35077e() {
        return this.f30731t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public String mo35078f() {
        return this.f30721j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C11847d mo35079g() {
        return this.f30730s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo35080h() {
        return this.f30723l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Picasso mo35081i() {
        return this.f30717f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C11848e mo35082j() {
        return this.f30734w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Bitmap mo35083k() {
        return this.f30728q;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Bitmap mo35084l() throws IOException {
        Bitmap bitmap;
        if (C11881m.m31202a(this.f30723l)) {
            bitmap = this.f30719h.get(this.f30721j);
            if (bitmap != null) {
                this.f30720i.mo35173b();
                this.f30730s = C11847d.MEMORY;
                if (this.f30717f.f30671n) {
                    C11851a0.m31113a("Hunter", "decoded", this.f30722k.mo35144d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        this.f30722k.f30810c = this.f30733v == 0 ? C11882n.OFFLINE.f30794e : this.f30724m;
        C11894a a = this.f30725n.mo35068a(this.f30722k, this.f30724m);
        if (a != null) {
            this.f30730s = a.mo35167c();
            this.f30732u = a.mo35166b();
            bitmap = a.mo35165a();
            if (bitmap == null) {
                InputStream d = a.mo35168d();
                try {
                    Bitmap a2 = m31129a(d, this.f30722k);
                    C11851a0.m31111a(d);
                    bitmap = a2;
                } catch (Throwable th) {
                    C11851a0.m31111a(d);
                    throw th;
                }
            }
        }
        if (bitmap != null) {
            if (this.f30717f.f30671n) {
                C11851a0.m31112a("Hunter", "decoded", this.f30722k.mo35144d());
            }
            this.f30720i.mo35171a(bitmap);
            if (this.f30722k.mo35146f() || this.f30732u != 0) {
                synchronized (f30713x) {
                    if (this.f30722k.mo35145e() || this.f30732u != 0) {
                        bitmap = m31128a(this.f30722k, bitmap, this.f30732u);
                        if (this.f30717f.f30671n) {
                            C11851a0.m31112a("Hunter", "transformed", this.f30722k.mo35144d());
                        }
                    }
                    if (this.f30722k.mo35142b()) {
                        bitmap = m31130a(this.f30722k.f30814g, bitmap);
                        if (this.f30717f.f30671n) {
                            C11851a0.m31113a("Hunter", "transformed", this.f30722k.mo35144d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f30720i.mo35175b(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo35085m() {
        Future<?> future = this.f30729r;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo35086n() {
        return this.f30725n.mo35132b();
    }

    public void run() {
        String str = "Picasso-Idle";
        try {
            m31132a(this.f30722k);
            if (this.f30717f.f30671n) {
                C11851a0.m31112a("Hunter", "executing", C11851a0.m31105a(this));
            }
            this.f30728q = mo35084l();
            if (this.f30728q == null) {
                this.f30718g.mo35106b(this);
            } else {
                this.f30718g.mo35100a(this);
            }
        } catch (ResponseException e) {
            if (!e.f30650e || e.f30651f != 504) {
                this.f30731t = e;
            }
            this.f30718g.mo35106b(this);
        } catch (C11884a e2) {
            this.f30731t = e2;
            this.f30718g.mo35110c(this);
        } catch (IOException e3) {
            this.f30731t = e3;
            this.f30718g.mo35110c(this);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f30720i.mo35169a().mo35182a(new PrintWriter(stringWriter));
            this.f30731t = new RuntimeException(stringWriter.toString(), e4);
            this.f30718g.mo35106b(this);
        } catch (Exception e5) {
            this.f30731t = e5;
            this.f30718g.mo35106b(this);
        } catch (Throwable th) {
            Thread.currentThread().setName(str);
            throw th;
        }
        Thread.currentThread().setName(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11849a mo35073b() {
        return this.f30726o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35070a(C11849a aVar) {
        boolean z = this.f30717f.f30671n;
        C11889s sVar = aVar.f30697b;
        String str = "to ";
        String str2 = "joined";
        String str3 = "Hunter";
        if (this.f30726o == null) {
            this.f30726o = aVar;
            if (z) {
                List<C11849a> list = this.f30727p;
                if (list == null || list.isEmpty()) {
                    C11851a0.m31113a(str3, str2, sVar.mo35144d(), "to empty hunter");
                } else {
                    C11851a0.m31113a(str3, str2, sVar.mo35144d(), C11851a0.m31106a(this, str));
                }
            }
            return;
        }
        if (this.f30727p == null) {
            this.f30727p = new ArrayList(3);
        }
        this.f30727p.add(aVar);
        if (z) {
            C11851a0.m31113a(str3, str2, sVar.mo35144d(), C11851a0.m31106a(this, str));
        }
        C11848e g = aVar.mo35059g();
        if (g.ordinal() > this.f30734w.ordinal()) {
            this.f30734w = g;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35071a() {
        if (this.f30726o != null) {
            return false;
        }
        List<C11849a> list = this.f30727p;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        Future<?> future = this.f30729r;
        if (future == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35072a(boolean z, NetworkInfo networkInfo) {
        if (!(this.f30733v > 0)) {
            return false;
        }
        this.f30733v--;
        return this.f30725n.mo35131a(z, networkInfo);
    }

    /* renamed from: a */
    static void m31132a(C11889s sVar) {
        String a = sVar.mo35141a();
        StringBuilder sb = (StringBuilder) f30714y.get();
        sb.ensureCapacity(a.length() + 8);
        sb.replace(8, sb.length(), a);
        Thread.currentThread().setName(sb.toString());
    }

    /* renamed from: a */
    static C11859c m31131a(Picasso picasso, C11870g gVar, Cache cache, C11896w wVar, C11849a aVar) {
        C11889s h = aVar.mo35060h();
        List a = picasso.mo35029a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C11893u uVar = (C11893u) a.get(i);
            if (uVar.mo35069a(h)) {
                C11859c cVar = new C11859c(picasso, gVar, cache, wVar, aVar, uVar);
                return cVar;
            }
        }
        C11859c cVar2 = new C11859c(picasso, gVar, cache, wVar, aVar, f30712A);
        return cVar2;
    }

    /* renamed from: a */
    static Bitmap m31130a(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            Transformation transformation = (Transformation) list.get(i);
            try {
                Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(transformation.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (Transformation key : list) {
                        sb.append(key.key());
                        sb.append(10);
                    }
                    Picasso.f30656p.post(new C11863d(sb));
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.f30656p.post(new C11864e(transformation));
                    return null;
                } else if (transform == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = transform;
                } else {
                    Picasso.f30656p.post(new C11865f(transformation));
                    return null;
                }
            } catch (RuntimeException e) {
                Picasso.f30656p.post(new C11862c(transformation, e));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m31128a(com.squareup.picasso.C11889s r13, android.graphics.Bitmap r14, int r15) {
        /*
            int r0 = r14.getWidth()
            int r1 = r14.getHeight()
            boolean r2 = r13.f30819l
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            boolean r3 = r13.mo35145e()
            r4 = 0
            if (r3 == 0) goto L_0x00af
            int r3 = r13.f30815h
            int r5 = r13.f30816i
            float r6 = r13.f30820m
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0030
            boolean r7 = r13.f30823p
            if (r7 == 0) goto L_0x002d
            float r7 = r13.f30821n
            float r9 = r13.f30822o
            r8.setRotate(r6, r7, r9)
            goto L_0x0030
        L_0x002d:
            r8.setRotate(r6)
        L_0x0030:
            boolean r6 = r13.f30817j
            if (r6 == 0) goto L_0x0074
            float r13 = (float) r3
            float r6 = (float) r0
            float r7 = r13 / r6
            float r9 = (float) r5
            float r10 = (float) r1
            float r11 = r9 / r10
            int r12 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x0054
            float r11 = r11 / r7
            float r10 = r10 * r11
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r13 = (int) r10
            int r6 = r1 - r13
            int r6 = r6 / 2
            float r10 = (float) r13
            float r11 = r9 / r10
            r9 = r13
            r13 = r7
            r7 = r0
            goto L_0x0067
        L_0x0054:
            float r7 = r7 / r11
            float r6 = r6 * r7
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r7 = r0 - r6
            int r7 = r7 / 2
            float r9 = (float) r6
            float r13 = r13 / r9
            r9 = r1
            r4 = r7
            r7 = r6
            r6 = 0
        L_0x0067:
            boolean r0 = m31133a(r2, r0, r1, r3, r5)
            if (r0 == 0) goto L_0x0070
            r8.preScale(r13, r11)
        L_0x0070:
            r5 = r6
            r6 = r7
            r7 = r9
            goto L_0x00b2
        L_0x0074:
            boolean r13 = r13.f30818k
            if (r13 == 0) goto L_0x008e
            float r13 = (float) r3
            float r6 = (float) r0
            float r13 = r13 / r6
            float r6 = (float) r5
            float r7 = (float) r1
            float r6 = r6 / r7
            int r7 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r13 = r6
        L_0x0084:
            boolean r2 = m31133a(r2, r0, r1, r3, r5)
            if (r2 == 0) goto L_0x00af
            r8.preScale(r13, r13)
            goto L_0x00af
        L_0x008e:
            if (r3 != 0) goto L_0x0092
            if (r5 == 0) goto L_0x00af
        L_0x0092:
            if (r3 != r0) goto L_0x0096
            if (r5 == r1) goto L_0x00af
        L_0x0096:
            if (r3 == 0) goto L_0x009b
            float r13 = (float) r3
            float r6 = (float) r0
            goto L_0x009d
        L_0x009b:
            float r13 = (float) r5
            float r6 = (float) r1
        L_0x009d:
            float r13 = r13 / r6
            if (r5 == 0) goto L_0x00a3
            float r6 = (float) r5
            float r7 = (float) r1
            goto L_0x00a5
        L_0x00a3:
            float r6 = (float) r3
            float r7 = (float) r0
        L_0x00a5:
            float r6 = r6 / r7
            boolean r2 = m31133a(r2, r0, r1, r3, r5)
            if (r2 == 0) goto L_0x00af
            r8.preScale(r13, r6)
        L_0x00af:
            r6 = r0
            r7 = r1
            r5 = 0
        L_0x00b2:
            if (r15 == 0) goto L_0x00b8
            float r13 = (float) r15
            r8.preRotate(r13)
        L_0x00b8:
            r9 = 1
            r3 = r14
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            if (r13 == r14) goto L_0x00c4
            r14.recycle()
            goto L_0x00c5
        L_0x00c4:
            r13 = r14
        L_0x00c5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C11859c.m31128a(com.squareup.picasso.s, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}

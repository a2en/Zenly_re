package com.facebook.imagepipeline.image;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.C9548d;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.C9650b;
import com.facebook.imageformat.C9651c;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.C9697a;
import com.facebook.imageutils.C9899c;
import com.facebook.imageutils.C9904f;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.image.e */
public class C9732e implements Closeable {

    /* renamed from: e */
    private final CloseableReference<PooledByteBuffer> f25562e;

    /* renamed from: f */
    private final Supplier<FileInputStream> f25563f;

    /* renamed from: g */
    private ImageFormat f25564g;

    /* renamed from: h */
    private int f25565h;

    /* renamed from: i */
    private int f25566i;

    /* renamed from: j */
    private int f25567j;

    /* renamed from: k */
    private int f25568k;

    /* renamed from: l */
    private int f25569l;

    /* renamed from: m */
    private int f25570m;

    /* renamed from: n */
    private C9697a f25571n;

    /* renamed from: o */
    private ColorSpace f25572o;

    public C9732e(CloseableReference<PooledByteBuffer> closeableReference) {
        this.f25564g = ImageFormat.f25182b;
        this.f25565h = -1;
        this.f25566i = 0;
        this.f25567j = -1;
        this.f25568k = -1;
        this.f25569l = 1;
        this.f25570m = -1;
        C9536j.m23275a(CloseableReference.m23356c(closeableReference));
        this.f25562e = closeableReference.clone();
        this.f25563f = null;
    }

    /* renamed from: b */
    public static C9732e m24068b(C9732e eVar) {
        if (eVar != null) {
            return eVar.mo26416a();
        }
        return null;
    }

    /* renamed from: o */
    private void m24072o() {
        if (this.f25567j < 0 || this.f25568k < 0) {
            mo26440n();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[SYNTHETIC, Splitter:B:15:0x0034] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imageutils.C9898b m24073p() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.mo26434h()     // Catch:{ all -> 0x0030 }
            com.facebook.imageutils.b r1 = com.facebook.imageutils.C9896a.m24735b(r0)     // Catch:{ all -> 0x002e }
            android.graphics.ColorSpace r2 = r1.mo26763a()     // Catch:{ all -> 0x002e }
            r4.f25572o = r2     // Catch:{ all -> 0x002e }
            android.util.Pair r2 = r1.mo26764b()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0028
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x002e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x002e }
            int r3 = r3.intValue()     // Catch:{ all -> 0x002e }
            r4.f25567j = r3     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x002e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x002e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x002e }
            r4.f25568k = r2     // Catch:{ all -> 0x002e }
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r1
        L_0x002e:
            r1 = move-exception
            goto L_0x0032
        L_0x0030:
            r1 = move-exception
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.image.C9732e.m24073p():com.facebook.imageutils.b");
    }

    /* renamed from: q */
    private Pair<Integer, Integer> m24074q() {
        Pair<Integer, Integer> e = C9904f.m24755e(mo26434h());
        if (e != null) {
            this.f25567j = ((Integer) e.first).intValue();
            this.f25568k = ((Integer) e.second).intValue();
        }
        return e;
    }

    /* renamed from: a */
    public C9732e mo26416a() {
        C9732e eVar;
        Supplier<FileInputStream> supplier = this.f25563f;
        if (supplier != null) {
            eVar = new C9732e(supplier, this.f25570m);
        } else {
            CloseableReference a = CloseableReference.m23348a(this.f25562e);
            if (a == null) {
                eVar = null;
            } else {
                try {
                    eVar = new C9732e(a);
                } catch (Throwable th) {
                    CloseableReference.m23355b(a);
                    throw th;
                }
            }
            CloseableReference.m23355b(a);
        }
        if (eVar != null) {
            eVar.mo26420a(this);
        }
        return eVar;
    }

    /* renamed from: c */
    public void mo26424c(int i) {
        this.f25566i = i;
    }

    public void close() {
        CloseableReference.m23355b(this.f25562e);
    }

    /* renamed from: d */
    public void mo26427d(int i) {
        this.f25568k = i;
    }

    /* renamed from: e */
    public void mo26429e(int i) {
        this.f25565h = i;
    }

    /* renamed from: f */
    public void mo26431f(int i) {
        this.f25569l = i;
    }

    /* renamed from: g */
    public void mo26433g(int i) {
        this.f25567j = i;
    }

    /* renamed from: h */
    public InputStream mo26434h() {
        Supplier<FileInputStream> supplier = this.f25563f;
        if (supplier != null) {
            return (InputStream) supplier.get();
        }
        CloseableReference a = CloseableReference.m23348a(this.f25562e);
        if (a == null) {
            return null;
        }
        try {
            return new C9548d((PooledByteBuffer) a.mo25724b());
        } finally {
            CloseableReference.m23355b(a);
        }
    }

    /* renamed from: i */
    public int mo26435i() {
        m24072o();
        return this.f25565h;
    }

    /* renamed from: j */
    public int mo26436j() {
        return this.f25569l;
    }

    /* renamed from: k */
    public int mo26437k() {
        CloseableReference<PooledByteBuffer> closeableReference = this.f25562e;
        if (closeableReference == null || closeableReference.mo25724b() == null) {
            return this.f25570m;
        }
        return ((PooledByteBuffer) this.f25562e.mo25724b()).size();
    }

    /* renamed from: l */
    public int mo26438l() {
        m24072o();
        return this.f25567j;
    }

    /* renamed from: m */
    public synchronized boolean mo26439m() {
        return CloseableReference.m23356c(this.f25562e) || this.f25563f != null;
    }

    /* renamed from: n */
    public void mo26440n() {
        Pair pair;
        ImageFormat c = C9651c.m23725c(mo26434h());
        this.f25564g = c;
        if (C9650b.m23720b(c)) {
            pair = m24074q();
        } else {
            pair = m24073p().mo26764b();
        }
        if (c == C9650b.f25197a && this.f25565h == -1) {
            if (pair != null) {
                this.f25566i = C9899c.m24739a(mo26434h());
                this.f25565h = C9899c.m24738a(this.f25566i);
            }
        } else if (c == C9650b.f25207k && this.f25565h == -1) {
            this.f25566i = HeifExifUtil.m24729a(mo26434h());
            this.f25565h = C9899c.m24738a(this.f25566i);
        } else {
            this.f25565h = 0;
        }
    }

    /* renamed from: b */
    public CloseableReference<PooledByteBuffer> mo26421b() {
        return CloseableReference.m23348a(this.f25562e);
    }

    /* renamed from: c */
    public C9697a mo26423c() {
        return this.f25571n;
    }

    /* renamed from: d */
    public ColorSpace mo26426d() {
        m24072o();
        return this.f25572o;
    }

    /* renamed from: e */
    public int mo26428e() {
        m24072o();
        return this.f25566i;
    }

    /* renamed from: f */
    public int mo26430f() {
        m24072o();
        return this.f25568k;
    }

    /* renamed from: g */
    public ImageFormat mo26432g() {
        m24072o();
        return this.f25564g;
    }

    /* renamed from: c */
    public static void m24069c(C9732e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    /* renamed from: b */
    public boolean mo26422b(int i) {
        boolean z = true;
        if (this.f25564g != C9650b.f25197a || this.f25563f != null) {
            return true;
        }
        C9536j.m23271a(this.f25562e);
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) this.f25562e.mo25724b();
        if (!(pooledByteBuffer.read(i - 2) == -1 && pooledByteBuffer.read(i - 1) == -39)) {
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m24070d(C9732e eVar) {
        return eVar.f25565h >= 0 && eVar.f25567j >= 0 && eVar.f25568k >= 0;
    }

    /* renamed from: e */
    public static boolean m24071e(C9732e eVar) {
        return eVar != null && eVar.mo26439m();
    }

    /* renamed from: a */
    public void mo26418a(ImageFormat imageFormat) {
        this.f25564g = imageFormat;
    }

    /* renamed from: a */
    public void mo26419a(C9697a aVar) {
        this.f25571n = aVar;
    }

    /* renamed from: a */
    public String mo26417a(int i) {
        CloseableReference b = mo26421b();
        String str = "";
        if (b == null) {
            return str;
        }
        int min = Math.min(mo26437k(), i);
        byte[] bArr = new byte[min];
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) b.mo25724b();
            if (pooledByteBuffer == null) {
                return str;
            }
            pooledByteBuffer.read(0, bArr, 0, min);
            b.close();
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte valueOf : bArr) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString();
        } finally {
            b.close();
        }
    }

    public C9732e(Supplier<FileInputStream> supplier) {
        this.f25564g = ImageFormat.f25182b;
        this.f25565h = -1;
        this.f25566i = 0;
        this.f25567j = -1;
        this.f25568k = -1;
        this.f25569l = 1;
        this.f25570m = -1;
        C9536j.m23271a(supplier);
        this.f25562e = null;
        this.f25563f = supplier;
    }

    public C9732e(Supplier<FileInputStream> supplier, int i) {
        this(supplier);
        this.f25570m = i;
    }

    /* renamed from: a */
    public void mo26420a(C9732e eVar) {
        this.f25564g = eVar.mo26432g();
        this.f25567j = eVar.mo26438l();
        this.f25568k = eVar.mo26430f();
        this.f25565h = eVar.mo26435i();
        this.f25566i = eVar.mo26428e();
        this.f25569l = eVar.mo26436j();
        this.f25570m = eVar.mo26437k();
        this.f25571n = eVar.mo26423c();
        this.f25572o = eVar.mo26426d();
    }
}

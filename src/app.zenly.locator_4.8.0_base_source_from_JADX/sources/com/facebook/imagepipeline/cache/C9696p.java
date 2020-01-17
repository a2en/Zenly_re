package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.C9732e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.cache.p */
public class C9696p {

    /* renamed from: b */
    private static final Class<?> f25328b = C9696p.class;

    /* renamed from: a */
    private Map<CacheKey, C9732e> f25329a = new HashMap();

    private C9696p() {
    }

    /* renamed from: a */
    public static C9696p m23831a() {
        return new C9696p();
    }

    /* renamed from: b */
    public boolean mo26251b(CacheKey cacheKey) {
        C9732e eVar;
        C9536j.m23271a(cacheKey);
        synchronized (this) {
            eVar = (C9732e) this.f25329a.remove(cacheKey);
        }
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.mo26439m();
        } finally {
            eVar.close();
        }
    }

    /* renamed from: a */
    public synchronized void mo26250a(CacheKey cacheKey, C9732e eVar) {
        C9536j.m23271a(cacheKey);
        C9536j.m23275a(C9732e.m24071e(eVar));
        C9732e.m24069c((C9732e) this.f25329a.put(cacheKey, C9732e.m24068b(eVar)));
        m23832b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.imagepipeline.image.C9732e mo26249a(com.facebook.cache.common.CacheKey r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.facebook.common.internal.C9536j.m23271a(r7)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.facebook.cache.common.CacheKey, com.facebook.imagepipeline.image.e> r0 = r6.f25329a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0051 }
            com.facebook.imagepipeline.image.e r0 = (com.facebook.imagepipeline.image.C9732e) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004e
            monitor-enter(r0)     // Catch:{ all -> 0x0051 }
            boolean r1 = com.facebook.imagepipeline.image.C9732e.m24071e(r0)     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0045
            java.util.Map<com.facebook.cache.common.CacheKey, com.facebook.imagepipeline.image.e> r1 = r6.f25329a     // Catch:{ all -> 0x004b }
            r1.remove(r7)     // Catch:{ all -> 0x004b }
            java.lang.Class<?> r1 = f25328b     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004b }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x004b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 1
            java.lang.String r5 = r7.getUriString()     // Catch:{ all -> 0x004b }
            r3[r4] = r5     // Catch:{ all -> 0x004b }
            r4 = 2
            int r7 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x004b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004b }
            r3[r4] = r7     // Catch:{ all -> 0x004b }
            com.facebook.common.logging.C9543a.m23322c(r1, r2, r3)     // Catch:{ all -> 0x004b }
            r7 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r6)
            return r7
        L_0x0045:
            com.facebook.imagepipeline.image.e r7 = com.facebook.imagepipeline.image.C9732e.m24068b(r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x004e:
            r7 = r0
        L_0x004f:
            monitor-exit(r6)
            return r7
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.C9696p.mo26249a(com.facebook.cache.common.CacheKey):com.facebook.imagepipeline.image.e");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public synchronized boolean mo26252b(CacheKey cacheKey, C9732e eVar) {
        C9536j.m23271a(cacheKey);
        C9536j.m23271a(eVar);
        C9536j.m23275a(C9732e.m24071e(eVar));
        C9732e eVar2 = (C9732e) this.f25329a.get(cacheKey);
        if (eVar2 == null) {
            return false;
        }
        CloseableReference b = eVar2.mo26421b();
        CloseableReference b2 = eVar.mo26421b();
        if (!(b == null || b2 == null)) {
            try {
                if (b.mo25724b() == b2.mo25724b()) {
                    this.f25329a.remove(cacheKey);
                    CloseableReference.m23355b(b2);
                    CloseableReference.m23355b(b);
                    C9732e.m24069c(eVar2);
                    m23832b();
                    return true;
                }
            } catch (Throwable th) {
                CloseableReference.m23355b(b2);
                CloseableReference.m23355b(b);
                C9732e.m24069c(eVar2);
                throw th;
            }
        }
        CloseableReference.m23355b(b2);
        CloseableReference.m23355b(b);
        C9732e.m24069c(eVar2);
        return false;
    }

    /* renamed from: b */
    private synchronized void m23832b() {
        C9543a.m23313b(f25328b, "Count = %d", (Object) Integer.valueOf(this.f25329a.size()));
    }
}

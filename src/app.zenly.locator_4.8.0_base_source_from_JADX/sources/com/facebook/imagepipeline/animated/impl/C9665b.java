package com.facebook.imagepipeline.animated.impl;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.CountingMemoryCache.EntryStateObserver;
import com.facebook.imagepipeline.image.C9730c;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.facebook.imagepipeline.animated.impl.b */
public class C9665b {

    /* renamed from: a */
    private final CacheKey f25261a;

    /* renamed from: b */
    private final CountingMemoryCache<CacheKey, C9730c> f25262b;

    /* renamed from: c */
    private final EntryStateObserver<CacheKey> f25263c = new C9666a();

    /* renamed from: d */
    private final LinkedHashSet<CacheKey> f25264d = new LinkedHashSet<>();

    /* renamed from: com.facebook.imagepipeline.animated.impl.b$a */
    class C9666a implements EntryStateObserver<CacheKey> {
        C9666a() {
        }

        /* renamed from: a */
        public void onExclusivityChanged(CacheKey cacheKey, boolean z) {
            C9665b.this.mo26192a(cacheKey, z);
        }
    }

    /* renamed from: com.facebook.imagepipeline.animated.impl.b$b */
    static class C9667b implements CacheKey {

        /* renamed from: a */
        private final CacheKey f25266a;

        /* renamed from: b */
        private final int f25267b;

        public C9667b(CacheKey cacheKey, int i) {
            this.f25266a = cacheKey;
            this.f25267b = i;
        }

        public boolean containsUri(Uri uri) {
            return this.f25266a.containsUri(uri);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9667b)) {
                return false;
            }
            C9667b bVar = (C9667b) obj;
            if (this.f25267b != bVar.f25267b || !this.f25266a.equals(bVar.f25266a)) {
                z = false;
            }
            return z;
        }

        public String getUriString() {
            return null;
        }

        public int hashCode() {
            return (this.f25266a.hashCode() * 1013) + this.f25267b;
        }

        public String toString() {
            C9534b a = C9532i.m23262a((Object) this);
            a.mo25665a("imageCacheKey", (Object) this.f25266a);
            a.mo25664a("frameIndex", this.f25267b);
            return a.toString();
        }
    }

    public C9665b(CacheKey cacheKey, CountingMemoryCache<CacheKey, C9730c> countingMemoryCache) {
        this.f25261a = cacheKey;
        this.f25262b = countingMemoryCache;
    }

    /* renamed from: c */
    private C9667b m23763c(int i) {
        return new C9667b(this.f25261a, i);
    }

    /* renamed from: a */
    public synchronized void mo26192a(CacheKey cacheKey, boolean z) {
        if (z) {
            this.f25264d.add(cacheKey);
        } else {
            this.f25264d.remove(cacheKey);
        }
    }

    /* renamed from: b */
    public CloseableReference<C9730c> mo26194b(int i) {
        return this.f25262b.get(m23763c(i));
    }

    /* renamed from: b */
    private synchronized CacheKey m23762b() {
        CacheKey cacheKey;
        cacheKey = null;
        Iterator it = this.f25264d.iterator();
        if (it.hasNext()) {
            cacheKey = (CacheKey) it.next();
            it.remove();
        }
        return cacheKey;
    }

    /* renamed from: a */
    public CloseableReference<C9730c> mo26191a(int i, CloseableReference<C9730c> closeableReference) {
        return this.f25262b.mo26203a(m23763c(i), closeableReference, this.f25263c);
    }

    /* renamed from: a */
    public boolean mo26193a(int i) {
        return this.f25262b.contains(m23763c(i));
    }

    /* renamed from: a */
    public CloseableReference<C9730c> mo26190a() {
        CloseableReference<C9730c> a;
        do {
            CacheKey b = m23762b();
            if (b == null) {
                return null;
            }
            a = this.f25262b.mo26202a(b);
        } while (a == null);
        return a;
    }
}

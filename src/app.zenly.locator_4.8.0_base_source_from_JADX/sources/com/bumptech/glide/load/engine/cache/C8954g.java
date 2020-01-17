package com.bumptech.glide.load.engine.cache;

import androidx.core.util.Pools$Pool;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.p301o.C9213g;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.util.pool.C9248b;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.FactoryPools.Factory;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bumptech.glide.load.engine.cache.g */
public class C8954g {

    /* renamed from: a */
    private final C9213g<Key, String> f23327a = new C9213g<>(1000);

    /* renamed from: b */
    private final Pools$Pool<C8956b> f23328b = FactoryPools.m22255a(10, (Factory<T>) new C8955a<T>(this));

    /* renamed from: com.bumptech.glide.load.engine.cache.g$a */
    class C8955a implements Factory<C8956b> {
        C8955a(C8954g gVar) {
        }

        public C8956b create() {
            try {
                return new C8956b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.g$b */
    private static final class C8956b implements Poolable {

        /* renamed from: e */
        final MessageDigest f23329e;

        /* renamed from: f */
        private final C9248b f23330f = C9248b.m22265b();

        C8956b(MessageDigest messageDigest) {
            this.f23329e = messageDigest;
        }

        public C9248b getVerifier() {
            return this.f23330f;
        }
    }

    /* renamed from: b */
    private String m21510b(Key key) {
        Object acquire = this.f23328b.acquire();
        C9216j.m22083a(acquire);
        C8956b bVar = (C8956b) acquire;
        try {
            key.updateDiskCacheKey(bVar.f23329e);
            return C9217k.m22096a(bVar.f23329e.digest());
        } finally {
            this.f23328b.release(bVar);
        }
    }

    /* renamed from: a */
    public String mo24394a(Key key) {
        String str;
        synchronized (this.f23327a) {
            str = (String) this.f23327a.mo24822a(key);
        }
        if (str == null) {
            str = m21510b(key);
        }
        synchronized (this.f23327a) {
            this.f23327a.mo24824b(key, str);
        }
        return str;
    }
}

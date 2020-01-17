package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.core.util.C0606h;
import androidx.core.util.Pools$Pool;
import java.util.ArrayList;
import java.util.List;

public final class FactoryPools {

    /* renamed from: a */
    private static final Resetter<Object> f24019a = new C9243a();

    public interface Factory<T> {
        T create();
    }

    public interface Poolable {
        C9248b getVerifier();
    }

    public interface Resetter<T> {
        void reset(T t);
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$a */
    class C9243a implements Resetter<Object> {
        C9243a() {
        }

        public void reset(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$b */
    class C9244b implements Factory<List<T>> {
        C9244b() {
        }

        public List<T> create() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$c */
    class C9245c implements Resetter<List<T>> {
        C9245c() {
        }

        /* renamed from: a */
        public void reset(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.FactoryPools$d */
    private static final class C9246d<T> implements Pools$Pool<T> {

        /* renamed from: a */
        private final Factory<T> f24020a;

        /* renamed from: b */
        private final Resetter<T> f24021b;

        /* renamed from: c */
        private final Pools$Pool<T> f24022c;

        C9246d(Pools$Pool<T> pools$Pool, Factory<T> factory, Resetter<T> resetter) {
            this.f24022c = pools$Pool;
            this.f24020a = factory;
            this.f24021b = resetter;
        }

        public T acquire() {
            T acquire = this.f24022c.acquire();
            if (acquire == null) {
                acquire = this.f24020a.create();
                String str = "FactoryPools";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(acquire.getClass());
                    Log.v(str, sb.toString());
                }
            }
            if (acquire instanceof Poolable) {
                ((Poolable) acquire).getVerifier().mo24933a(false);
            }
            return acquire;
        }

        public boolean release(T t) {
            if (t instanceof Poolable) {
                ((Poolable) t).getVerifier().mo24933a(true);
            }
            this.f24021b.reset(t);
            return this.f24022c.release(t);
        }
    }

    /* renamed from: a */
    public static <T extends Poolable> Pools$Pool<T> m22255a(int i, Factory<T> factory) {
        return m22256a((Pools$Pool<T>) new C0606h<T>(i), factory);
    }

    /* renamed from: b */
    public static <T> Pools$Pool<List<T>> m22259b() {
        return m22254a(20);
    }

    /* renamed from: a */
    public static <T> Pools$Pool<List<T>> m22254a(int i) {
        return m22257a(new C0606h(i), new C9244b(), new C9245c());
    }

    /* renamed from: a */
    private static <T extends Poolable> Pools$Pool<T> m22256a(Pools$Pool<T> pools$Pool, Factory<T> factory) {
        return m22257a(pools$Pool, factory, m22258a());
    }

    /* renamed from: a */
    private static <T> Pools$Pool<T> m22257a(Pools$Pool<T> pools$Pool, Factory<T> factory, Resetter<T> resetter) {
        return new C9246d(pools$Pool, factory, resetter);
    }

    /* renamed from: a */
    private static <T> Resetter<T> m22258a() {
        return f24019a;
    }
}

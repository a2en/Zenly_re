package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.DataRewinder.Factory;
import com.bumptech.glide.p301o.C9216j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.d */
public class C8889d {

    /* renamed from: b */
    private static final Factory<?> f23190b = new C8890a();

    /* renamed from: a */
    private final Map<Class<?>, Factory<?>> f23191a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.d$a */
    class C8890a implements Factory<Object> {
        C8890a() {
        }

        public DataRewinder<Object> build(Object obj) {
            return new C8891b(obj);
        }

        public Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: com.bumptech.glide.load.data.d$b */
    private static final class C8891b implements DataRewinder<Object> {

        /* renamed from: a */
        private final Object f23192a;

        C8891b(Object obj) {
            this.f23192a = obj;
        }

        public void cleanup() {
        }

        public Object rewindAndGet() {
            return this.f23192a;
        }
    }

    /* renamed from: a */
    public synchronized void mo24255a(Factory<?> factory) {
        this.f23191a.put(factory.getDataClass(), factory);
    }

    /* renamed from: a */
    public synchronized <T> DataRewinder<T> mo24254a(T t) {
        Factory factory;
        C9216j.m22083a(t);
        factory = (Factory) this.f23191a.get(t.getClass());
        if (factory == null) {
            Iterator it = this.f23191a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Factory factory2 = (Factory) it.next();
                if (factory2.getDataClass().isAssignableFrom(t.getClass())) {
                    factory = factory2;
                    break;
                }
            }
        }
        if (factory == null) {
            factory = f23190b;
        }
        return factory.build(t);
    }
}

package com.bumptech.glide.p299m;

import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.m.f */
public class C9178f {

    /* renamed from: a */
    private final List<C9179a<?>> f23818a = new ArrayList();

    /* renamed from: com.bumptech.glide.m.f$a */
    private static final class C9179a<T> {

        /* renamed from: a */
        private final Class<T> f23819a;

        /* renamed from: b */
        final ResourceEncoder<T> f23820b;

        C9179a(Class<T> cls, ResourceEncoder<T> resourceEncoder) {
            this.f23819a = cls;
            this.f23820b = resourceEncoder;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo24741a(Class<?> cls) {
            return this.f23819a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo24740a(Class<Z> cls, ResourceEncoder<Z> resourceEncoder) {
        this.f23818a.add(new C9179a(cls, resourceEncoder));
    }

    /* renamed from: a */
    public synchronized <Z> ResourceEncoder<Z> mo24739a(Class<Z> cls) {
        int size = this.f23818a.size();
        for (int i = 0; i < size; i++) {
            C9179a aVar = (C9179a) this.f23818a.get(i);
            if (aVar.mo24741a(cls)) {
                return aVar.f23820b;
            }
        }
        return null;
    }
}

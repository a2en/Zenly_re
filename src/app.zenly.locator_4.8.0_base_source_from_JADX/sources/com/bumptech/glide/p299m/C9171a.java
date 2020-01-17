package com.bumptech.glide.p299m;

import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.m.a */
public class C9171a {

    /* renamed from: a */
    private final List<C9172a<?>> f23804a = new ArrayList();

    /* renamed from: com.bumptech.glide.m.a$a */
    private static final class C9172a<T> {

        /* renamed from: a */
        private final Class<T> f23805a;

        /* renamed from: b */
        final Encoder<T> f23806b;

        C9172a(Class<T> cls, Encoder<T> encoder) {
            this.f23805a = cls;
            this.f23806b = encoder;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo24726a(Class<?> cls) {
            return this.f23805a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> Encoder<T> mo24724a(Class<T> cls) {
        for (C9172a aVar : this.f23804a) {
            if (aVar.mo24726a(cls)) {
                return aVar.f23806b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <T> void mo24725a(Class<T> cls, Encoder<T> encoder) {
        this.f23804a.add(new C9172a(cls, encoder));
    }
}

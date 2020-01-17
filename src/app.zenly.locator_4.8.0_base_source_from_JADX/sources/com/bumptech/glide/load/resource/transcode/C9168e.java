package com.bumptech.glide.load.resource.transcode;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.transcode.e */
public class C9168e {

    /* renamed from: a */
    private final List<C9169a<?, ?>> f23799a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.resource.transcode.e$a */
    private static final class C9169a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f23800a;

        /* renamed from: b */
        private final Class<R> f23801b;

        /* renamed from: c */
        final ResourceTranscoder<Z, R> f23802c;

        C9169a(Class<Z> cls, Class<R> cls2, ResourceTranscoder<Z, R> resourceTranscoder) {
            this.f23800a = cls;
            this.f23801b = cls2;
            this.f23802c = resourceTranscoder;
        }

        /* renamed from: a */
        public boolean mo24723a(Class<?> cls, Class<?> cls2) {
            return this.f23800a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f23801b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> void mo24721a(Class<Z> cls, Class<R> cls2, ResourceTranscoder<Z, R> resourceTranscoder) {
        this.f23799a.add(new C9169a(cls, cls2, resourceTranscoder));
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo24722b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C9169a a : this.f23799a) {
            if (a.mo24723a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Z, R> ResourceTranscoder<Z, R> mo24720a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C9170f.m21957a();
        }
        for (C9169a aVar : this.f23799a) {
            if (aVar.mo24723a(cls, cls2)) {
                return aVar.f23802c;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No transcoder registered to transcode from ");
        sb.append(cls);
        sb.append(" to ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString());
    }
}

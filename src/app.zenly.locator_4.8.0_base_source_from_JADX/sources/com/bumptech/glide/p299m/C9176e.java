package com.bumptech.glide.p299m;

import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.m.e */
public class C9176e {

    /* renamed from: a */
    private final List<String> f23813a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C9177a<?, ?>>> f23814b = new HashMap();

    /* renamed from: com.bumptech.glide.m.e$a */
    private static class C9177a<T, R> {

        /* renamed from: a */
        private final Class<T> f23815a;

        /* renamed from: b */
        final Class<R> f23816b;

        /* renamed from: c */
        final ResourceDecoder<T, R> f23817c;

        public C9177a(Class<T> cls, Class<R> cls2, ResourceDecoder<T, R> resourceDecoder) {
            this.f23815a = cls;
            this.f23816b = cls2;
            this.f23817c = resourceDecoder;
        }

        /* renamed from: a */
        public boolean mo24738a(Class<?> cls, Class<?> cls2) {
            return this.f23815a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f23816b);
        }
    }

    /* renamed from: a */
    public synchronized void mo24736a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f23813a);
        this.f23813a.clear();
        this.f23813a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f23813a.add(str);
            }
        }
    }

    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> mo24737b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f23813a) {
            List<C9177a> list = (List) this.f23814b.get(str);
            if (list != null) {
                for (C9177a aVar : list) {
                    if (aVar.mo24738a(cls, cls2) && !arrayList.contains(aVar.f23816b)) {
                        arrayList.add(aVar.f23816b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> List<ResourceDecoder<T, R>> mo24734a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f23813a) {
            List<C9177a> list = (List) this.f23814b.get(str);
            if (list != null) {
                for (C9177a aVar : list) {
                    if (aVar.mo24738a(cls, cls2)) {
                        arrayList.add(aVar.f23817c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo24735a(String str, ResourceDecoder<T, R> resourceDecoder, Class<T> cls, Class<R> cls2) {
        m21969a(str).add(new C9177a(cls, cls2, resourceDecoder));
    }

    /* renamed from: a */
    private synchronized List<C9177a<?, ?>> m21969a(String str) {
        List<C9177a<?, ?>> list;
        if (!this.f23813a.contains(str)) {
            this.f23813a.add(str);
        }
        list = (List) this.f23814b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f23814b.put(str, list);
        }
        return list;
    }
}

package com.bumptech.glide.load.model;

import androidx.core.util.Pools$Pool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.model.g */
public class C9063g {

    /* renamed from: a */
    private final C9068i f23610a;

    /* renamed from: b */
    private final C9064a f23611b;

    /* renamed from: com.bumptech.glide.load.model.g$a */
    private static class C9064a {

        /* renamed from: a */
        private final Map<Class<?>, C9065a<?>> f23612a = new HashMap();

        /* renamed from: com.bumptech.glide.load.model.g$a$a */
        private static class C9065a<Model> {

            /* renamed from: a */
            final List<ModelLoader<Model, ?>> f23613a;

            public C9065a(List<ModelLoader<Model, ?>> list) {
                this.f23613a = list;
            }
        }

        C9064a() {
        }

        /* renamed from: a */
        public void mo24583a() {
            this.f23612a.clear();
        }

        /* renamed from: a */
        public <Model> void mo24584a(Class<Model> cls, List<ModelLoader<Model, ?>> list) {
            if (((C9065a) this.f23612a.put(cls, new C9065a(list))) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Already cached loaders for model: ");
                sb.append(cls);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: a */
        public <Model> List<ModelLoader<Model, ?>> mo24582a(Class<Model> cls) {
            C9065a aVar = (C9065a) this.f23612a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f23613a;
        }
    }

    public C9063g(Pools$Pool<List<Throwable>> pools$Pool) {
        this(new C9068i(pools$Pool));
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo24580a(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f23610a.mo24588a(cls, cls2, modelLoaderFactory);
        this.f23611b.mo24583a();
    }

    /* renamed from: b */
    public synchronized <Model, Data> void mo24581b(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f23610a.mo24590b(cls, cls2, modelLoaderFactory);
        this.f23611b.mo24583a();
    }

    private C9063g(C9068i iVar) {
        this.f23611b = new C9064a();
        this.f23610a = iVar;
    }

    /* renamed from: b */
    private synchronized <A> List<ModelLoader<A, ?>> m21731b(Class<A> cls) {
        List<ModelLoader<A, ?>> a;
        a = this.f23611b.mo24582a(cls);
        if (a == null) {
            a = Collections.unmodifiableList(this.f23610a.mo24587a(cls));
            this.f23611b.mo24584a(cls, a);
        }
        return a;
    }

    /* renamed from: a */
    public <A> List<ModelLoader<A, ?>> mo24579a(A a) {
        List b = m21731b(m21730b(a));
        int size = b.size();
        List emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ModelLoader modelLoader = (ModelLoader) b.get(i);
            if (modelLoader.handles(a)) {
                if (z) {
                    emptyList = new ArrayList(size - i);
                    z = false;
                }
                emptyList.add(modelLoader);
            }
        }
        return emptyList;
    }

    /* renamed from: b */
    private static <A> Class<A> m21730b(A a) {
        return a.getClass();
    }

    /* renamed from: a */
    public synchronized List<Class<?>> mo24578a(Class<?> cls) {
        return this.f23610a.mo24589b(cls);
    }
}

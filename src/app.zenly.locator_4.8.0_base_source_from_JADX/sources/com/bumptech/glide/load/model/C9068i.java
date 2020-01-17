package com.bumptech.glide.load.model;

import androidx.core.util.Pools$Pool;
import com.bumptech.glide.Registry.NoModelLoaderAvailableException;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.model.ModelLoader.C9045a;
import com.bumptech.glide.p301o.C9216j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.model.i */
public class C9068i {

    /* renamed from: e */
    private static final C9071c f23623e = new C9071c();

    /* renamed from: f */
    private static final ModelLoader<Object, Object> f23624f = new C9069a();

    /* renamed from: a */
    private final List<C9070b<?, ?>> f23625a;

    /* renamed from: b */
    private final C9071c f23626b;

    /* renamed from: c */
    private final Set<C9070b<?, ?>> f23627c;

    /* renamed from: d */
    private final Pools$Pool<List<Throwable>> f23628d;

    /* renamed from: com.bumptech.glide.load.model.i$a */
    private static class C9069a implements ModelLoader<Object, Object> {
        C9069a() {
        }

        public C9045a<Object> buildLoadData(Object obj, int i, int i2, C9011f fVar) {
            return null;
        }

        public boolean handles(Object obj) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.model.i$b */
    private static class C9070b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f23629a;

        /* renamed from: b */
        final Class<Data> f23630b;

        /* renamed from: c */
        final ModelLoaderFactory<? extends Model, ? extends Data> f23631c;

        public C9070b(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
            this.f23629a = cls;
            this.f23630b = cls2;
            this.f23631c = modelLoaderFactory;
        }

        /* renamed from: a */
        public boolean mo24592a(Class<?> cls, Class<?> cls2) {
            return mo24591a(cls) && this.f23630b.isAssignableFrom(cls2);
        }

        /* renamed from: a */
        public boolean mo24591a(Class<?> cls) {
            return this.f23629a.isAssignableFrom(cls);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.i$c */
    static class C9071c {
        C9071c() {
        }

        /* renamed from: a */
        public <Model, Data> C9066h<Model, Data> mo24593a(List<ModelLoader<Model, Data>> list, Pools$Pool<List<Throwable>> pools$Pool) {
            return new C9066h<>(list, pools$Pool);
        }
    }

    public C9068i(Pools$Pool<List<Throwable>> pools$Pool) {
        this(pools$Pool, f23623e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized <Model, Data> void mo24588a(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        m21742a(cls, cls2, modelLoaderFactory, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized <Model, Data> void mo24590b(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        m21742a(cls, cls2, modelLoaderFactory, false);
    }

    C9068i(Pools$Pool<List<Throwable>> pools$Pool, C9071c cVar) {
        this.f23625a = new ArrayList();
        this.f23627c = new HashSet();
        this.f23628d = pools$Pool;
        this.f23626b = cVar;
    }

    /* renamed from: a */
    private <Model, Data> void m21742a(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory, boolean z) {
        C9070b bVar = new C9070b(cls, cls2, modelLoaderFactory);
        List<C9070b<?, ?>> list = this.f23625a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized List<Class<?>> mo24589b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C9070b bVar : this.f23625a) {
            if (!arrayList.contains(bVar.f23630b) && bVar.mo24591a(cls)) {
                arrayList.add(bVar.f23630b);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized <Model> List<ModelLoader<Model, ?>> mo24587a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C9070b bVar : this.f23625a) {
                if (!this.f23627c.contains(bVar)) {
                    if (bVar.mo24591a(cls)) {
                        this.f23627c.add(bVar);
                        arrayList.add(m21741a(bVar));
                        this.f23627c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f23627c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Model, Data> ModelLoader<Model, Data> mo24586a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C9070b bVar : this.f23625a) {
                if (this.f23627c.contains(bVar)) {
                    z = true;
                } else if (bVar.mo24592a(cls, cls2)) {
                    this.f23627c.add(bVar);
                    arrayList.add(m21741a(bVar));
                    this.f23627c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f23626b.mo24593a(arrayList, this.f23628d);
            } else if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            } else if (z) {
                return m21740a();
            } else {
                throw new NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f23627c.clear();
            throw th;
        }
    }

    /* renamed from: a */
    private <Model, Data> ModelLoader<Model, Data> m21741a(C9070b<?, ?> bVar) {
        ModelLoader<Model, Data> build = bVar.f23631c.build(this);
        C9216j.m22083a(build);
        return build;
    }

    /* renamed from: a */
    private static <Model, Data> ModelLoader<Model, Data> m21740a() {
        return f23624f;
    }
}

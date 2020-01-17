package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.r */
public abstract class C9764r<T> implements C9772z<T> {

    /* renamed from: a */
    private final Set<T> f25668a = new HashSet();

    /* renamed from: b */
    private final C9747e<T> f25669b = new C9747e<>();

    /* renamed from: b */
    private T m24239b(T t) {
        if (t != null) {
            synchronized (this) {
                this.f25668a.remove(t);
            }
        }
        return t;
    }

    public T get(int i) {
        T a = this.f25669b.mo26536a(i);
        m24239b(a);
        return a;
    }

    public T pop() {
        T a = this.f25669b.mo26535a();
        m24239b(a);
        return a;
    }

    public void put(T t) {
        boolean add;
        synchronized (this) {
            add = this.f25668a.add(t);
        }
        if (add) {
            this.f25669b.mo26537a(mo26521a(t), t);
        }
    }
}

package com.bumptech.glide.p299m;

import com.bumptech.glide.p301o.C9215i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p214e.p228e.C7571a;

/* renamed from: com.bumptech.glide.m.d */
public class C9175d {

    /* renamed from: a */
    private final AtomicReference<C9215i> f23811a = new AtomicReference<>();

    /* renamed from: b */
    private final C7571a<C9215i, List<Class<?>>> f23812b = new C7571a<>();

    /* renamed from: a */
    public List<Class<?>> mo24732a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C9215i iVar = (C9215i) this.f23811a.getAndSet(null);
        if (iVar == null) {
            iVar = new C9215i(cls, cls2, cls3);
        } else {
            iVar.mo24836a(cls, cls2, cls3);
        }
        synchronized (this.f23812b) {
            list = (List) this.f23812b.get(iVar);
        }
        this.f23811a.set(iVar);
        return list;
    }

    /* renamed from: a */
    public void mo24733a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f23812b) {
            this.f23812b.put(new C9215i(cls, cls2, cls3), list);
        }
    }
}

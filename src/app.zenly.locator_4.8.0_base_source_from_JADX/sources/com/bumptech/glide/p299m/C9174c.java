package com.bumptech.glide.p299m;

import com.bumptech.glide.load.engine.C8976h;
import com.bumptech.glide.load.engine.C9003q;
import com.bumptech.glide.load.resource.transcode.C9170f;
import com.bumptech.glide.p301o.C9215i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p214e.p228e.C7571a;

/* renamed from: com.bumptech.glide.m.c */
public class C9174c {

    /* renamed from: c */
    private static final C9003q<?, ?, ?> f23808c;

    /* renamed from: a */
    private final C7571a<C9215i, C9003q<?, ?, ?>> f23809a = new C7571a<>();

    /* renamed from: b */
    private final AtomicReference<C9215i> f23810b = new AtomicReference<>();

    static {
        C8976h hVar = new C8976h(Object.class, Object.class, Object.class, Collections.emptyList(), new C9170f(), null);
        C9003q qVar = new C9003q(Object.class, Object.class, Object.class, Collections.singletonList(hVar), null);
        f23808c = qVar;
    }

    /* renamed from: b */
    private C9215i m21963b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C9215i iVar = (C9215i) this.f23810b.getAndSet(null);
        if (iVar == null) {
            iVar = new C9215i();
        }
        iVar.mo24836a(cls, cls2, cls3);
        return iVar;
    }

    /* renamed from: a */
    public boolean mo24731a(C9003q<?, ?, ?> qVar) {
        return f23808c.equals(qVar);
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C9003q<Data, TResource, Transcode> mo24729a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C9003q<Data, TResource, Transcode> qVar;
        C9215i b = m21963b(cls, cls2, cls3);
        synchronized (this.f23809a) {
            qVar = (C9003q) this.f23809a.get(b);
        }
        this.f23810b.set(b);
        return qVar;
    }

    /* renamed from: a */
    public void mo24730a(Class<?> cls, Class<?> cls2, Class<?> cls3, C9003q<?, ?, ?> qVar) {
        synchronized (this.f23809a) {
            C7571a<C9215i, C9003q<?, ?, ?>> aVar = this.f23809a;
            C9215i iVar = new C9215i(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f23808c;
            }
            aVar.put(iVar, qVar);
        }
    }
}

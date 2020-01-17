package com.google.firebase.components;

import com.google.android.gms.common.internal.C10123l;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.i */
public class C11035i extends C11022a {

    /* renamed from: e */
    private static final Provider<Set<Object>> f28632e = C11034h.m28423a();

    /* renamed from: a */
    private final Map<C11025d<?>, C11043n<?>> f28633a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C11043n<?>> f28634b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C11043n<Set<?>>> f28635c = new HashMap();

    /* renamed from: d */
    private final C11042m f28636d;

    public C11035i(Executor executor, Iterable<ComponentRegistrar> iterable, C11025d<?>... dVarArr) {
        this.f28636d = new C11042m(executor);
        ArrayList<C11025d> arrayList = new ArrayList<>();
        arrayList.add(C11025d.m28395a(this.f28636d, C11042m.class, Subscriber.class, Publisher.class));
        for (ComponentRegistrar components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, dVarArr);
        C11036j.m28431a((List<C11025d<?>>) arrayList);
        for (C11025d dVar : arrayList) {
            this.f28633a.put(dVar, new C11043n(C11032f.m28421a(this, dVar)));
        }
        m28426a();
        m28427b();
    }

    /* renamed from: b */
    private void m28427b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f28633a.entrySet()) {
            C11025d dVar = (C11025d) entry.getKey();
            if (!dVar.mo32181g()) {
                C11043n nVar = (C11043n) entry.getValue();
                for (Class cls : dVar.mo32177c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(nVar);
                }
            }
        }
        for (Entry entry2 : hashMap.entrySet()) {
            this.f28635c.put((Class) entry2.getKey(), new C11043n(C11033g.m28422a((Set) entry2.getValue())));
        }
    }

    /* renamed from: c */
    private void m28428c() {
        for (C11025d dVar : this.f28633a.keySet()) {
            Iterator it = dVar.mo32175a().iterator();
            while (true) {
                if (it.hasNext()) {
                    C11040k kVar = (C11040k) it.next();
                    if (kVar.mo32203c() && !this.f28634b.containsKey(kVar.mo32201a())) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{dVar, kVar.mo32201a()}));
                    }
                }
            }
        }
    }

    public <T> Provider<T> getProvider(Class<T> cls) {
        C10123l.m25506a(cls, (Object) "Null interface requested.");
        return (Provider) this.f28634b.get(cls);
    }

    public <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        C11043n nVar = (C11043n) this.f28635c.get(cls);
        if (nVar != null) {
            return nVar;
        }
        return f28632e;
    }

    /* renamed from: a */
    private void m28426a() {
        for (Entry entry : this.f28633a.entrySet()) {
            C11025d dVar = (C11025d) entry.getKey();
            if (dVar.mo32181g()) {
                C11043n nVar = (C11043n) entry.getValue();
                for (Class put : dVar.mo32177c()) {
                    this.f28634b.put(put, nVar);
                }
            }
        }
        m28428c();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<com.google.firebase.components.n>, for r2v0, types: [java.util.Set<com.google.firebase.components.n>, java.util.Set] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.util.Set m28425a(java.util.Set<com.google.firebase.components.C11043n> r2) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r2.next()
            com.google.firebase.components.n r1 = (com.google.firebase.components.C11043n) r1
            java.lang.Object r1 = r1.get()
            r0.add(r1)
            goto L_0x0009
        L_0x001d:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C11035i.m28425a(java.util.Set):java.util.Set");
    }

    /* renamed from: a */
    public void mo32191a(boolean z) {
        for (Entry entry : this.f28633a.entrySet()) {
            C11025d dVar = (C11025d) entry.getKey();
            C11043n nVar = (C11043n) entry.getValue();
            if (dVar.mo32179e() || (dVar.mo32180f() && z)) {
                nVar.get();
            }
        }
        this.f28636d.mo32209a();
    }
}

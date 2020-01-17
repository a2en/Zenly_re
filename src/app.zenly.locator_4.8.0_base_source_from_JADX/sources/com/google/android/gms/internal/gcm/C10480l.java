package com.google.android.gms.internal.gcm;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.gcm.l */
final class C10480l {

    /* renamed from: a */
    private final ConcurrentHashMap<C10481m, List<Throwable>> f27392a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f27393b = new ReferenceQueue<>();

    C10480l() {
    }

    /* renamed from: a */
    public final List<Throwable> mo28306a(Throwable th, boolean z) {
        Reference poll = this.f27393b.poll();
        while (poll != null) {
            this.f27392a.remove(poll);
            poll = this.f27393b.poll();
        }
        List<Throwable> list = (List) this.f27392a.get(new C10481m(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f27392a.putIfAbsent(new C10481m(th, this.f27393b), vector);
        return list2 == null ? vector : list2;
    }
}

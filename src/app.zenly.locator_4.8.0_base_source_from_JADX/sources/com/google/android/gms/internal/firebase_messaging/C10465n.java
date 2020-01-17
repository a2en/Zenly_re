package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase_messaging.n */
final class C10465n {

    /* renamed from: a */
    private final ConcurrentHashMap<C10464m, List<Throwable>> f27381a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f27382b = new ReferenceQueue<>();

    C10465n() {
    }

    /* renamed from: a */
    public final List<Throwable> mo28294a(Throwable th, boolean z) {
        Reference poll = this.f27382b.poll();
        while (poll != null) {
            this.f27381a.remove(poll);
            poll = this.f27382b.poll();
        }
        List<Throwable> list = (List) this.f27381a.get(new C10464m(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f27381a.putIfAbsent(new C10464m(th, this.f27382b), vector);
        return list2 == null ? vector : list2;
    }
}

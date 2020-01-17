package com.google.android.gms.dynamic;

import java.util.Iterator;

/* renamed from: com.google.android.gms.dynamic.c */
final class C10187c implements OnDelegateCreatedListener<T> {

    /* renamed from: a */
    private final /* synthetic */ C10184a f26744a;

    C10187c(C10184a aVar) {
        this.f26744a = aVar;
    }

    public final void onDelegateCreated(T t) {
        this.f26744a.f26739a = t;
        Iterator it = this.f26744a.f26741c.iterator();
        while (it.hasNext()) {
            ((C10185a) it.next()).mo27649a(this.f26744a.f26739a);
        }
        this.f26744a.f26741c.clear();
        this.f26744a.f26740b = null;
    }
}

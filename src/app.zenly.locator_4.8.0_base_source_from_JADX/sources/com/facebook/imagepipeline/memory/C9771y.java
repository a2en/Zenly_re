package com.facebook.imagepipeline.memory;

import com.facebook.common.references.C9553a;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.y */
class C9771y<V> extends C9746d<V> {

    /* renamed from: f */
    private LinkedList<C9553a<V>> f25676f = new LinkedList<>();

    public C9771y(int i, int i2, int i3) {
        super(i, i2, i3, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo26527a(V v) {
        C9553a aVar = (C9553a) this.f25676f.poll();
        if (aVar == null) {
            aVar = new C9553a();
        }
        aVar.mo25738a(v);
        this.f25643c.add(aVar);
    }

    /* renamed from: g */
    public V mo26534g() {
        C9553a aVar = (C9553a) this.f25643c.poll();
        V b = aVar.mo25739b();
        aVar.mo25737a();
        this.f25676f.add(aVar);
        return b;
    }
}

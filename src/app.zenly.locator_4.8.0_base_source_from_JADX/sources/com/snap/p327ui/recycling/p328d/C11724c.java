package com.snap.p327ui.recycling.p328d;

import com.google.common.base.C10848g;
import com.snap.p327ui.recycling.AdapterViewType;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;

/* renamed from: com.snap.ui.recycling.d.c */
public class C11724c<D extends C11722a> extends C11722a {

    /* renamed from: f */
    private final List<D> f30390f;

    public C11724c(List<D> list, AdapterViewType adapterViewType, long j) {
        super(adapterViewType, j);
        this.f30390f = list;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (!super.mo7088a(aVar) || !(aVar instanceof C11724c)) {
            return false;
        }
        return this.f30390f.equals(((C11724c) aVar).f30390f);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11724c)) {
            return false;
        }
        C11724c cVar = (C11724c) obj;
        if (this.f30382b != cVar.f30382b || !this.f30390f.equals(cVar.f30390f)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public List<D> mo34507f() {
        return this.f30390f;
    }

    public int hashCode() {
        return C10848g.m27999a(this.f30390f, this.f30382b);
    }

    public String toString() {
        return String.format("ListViewModel{id=%s viewType=%s models=%s}", new Object[]{Long.valueOf(this.f30381a), this.f30382b, this.f30390f});
    }
}

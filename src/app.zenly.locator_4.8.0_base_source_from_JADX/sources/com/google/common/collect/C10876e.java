package com.google.common.collect;

import com.google.common.base.C10848g;
import com.google.common.base.C10850i;
import com.google.common.base.Function;
import java.io.Serializable;

/* renamed from: com.google.common.collect.e */
final class C10876e<F, T> extends C10963z<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    final Function<F, ? extends T> f28423e;

    /* renamed from: f */
    final C10963z<T> f28424f;

    C10876e(Function<F, ? extends T> function, C10963z<T> zVar) {
        C10850i.m28004a(function);
        this.f28423e = function;
        C10850i.m28004a(zVar);
        this.f28424f = zVar;
    }

    public int compare(F f, F f2) {
        return this.f28424f.compare(this.f28423e.apply(f), this.f28423e.apply(f2));
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10876e)) {
            return false;
        }
        C10876e eVar = (C10876e) obj;
        if (!this.f28423e.equals(eVar.f28423e) || !this.f28424f.equals(eVar.f28424f)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C10848g.m27999a(this.f28423e, this.f28424f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28424f);
        sb.append(".onResultOf(");
        sb.append(this.f28423e);
        sb.append(")");
        return sb.toString();
    }
}

package com.google.common.collect;

import com.google.common.base.C10850i;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.common.collect.h */
final class C10886h<T> extends C10963z<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    final Comparator<T> f28445e;

    C10886h(Comparator<T> comparator) {
        C10850i.m28004a(comparator);
        this.f28445e = comparator;
    }

    public int compare(T t, T t2) {
        return this.f28445e.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10886h)) {
            return false;
        }
        return this.f28445e.equals(((C10886h) obj).f28445e);
    }

    public int hashCode() {
        return this.f28445e.hashCode();
    }

    public String toString() {
        return this.f28445e.toString();
    }
}

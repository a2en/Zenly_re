package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Comparator;

/* renamed from: com.google.common.collect.z */
public abstract class C10963z<T> implements Comparator<T> {
    protected C10963z() {
    }

    /* renamed from: a */
    public static <T> C10963z<T> m28306a(Comparator<T> comparator) {
        return comparator instanceof C10963z ? (C10963z) comparator : new C10886h(comparator);
    }

    public abstract int compare(T t, T t2);

    /* renamed from: a */
    public <F> C10963z<F> mo31930a(Function<F, ? extends T> function) {
        return new C10876e(function, this);
    }
}

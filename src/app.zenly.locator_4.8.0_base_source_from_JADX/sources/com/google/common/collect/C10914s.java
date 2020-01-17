package com.google.common.collect;

import com.google.common.base.C10850i;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.util.Iterator;

/* renamed from: com.google.common.collect.s */
public final class C10914s {

    /* renamed from: com.google.common.collect.s$a */
    static class C10915a extends C10892j<T> {

        /* renamed from: f */
        final /* synthetic */ Iterable f28474f;

        /* renamed from: g */
        final /* synthetic */ Predicate f28475g;

        C10915a(Iterable iterable, Predicate predicate) {
            this.f28474f = iterable;
            this.f28475g = predicate;
        }

        public Iterator<T> iterator() {
            return C10917t.m28131a(this.f28474f.iterator(), this.f28475g);
        }
    }

    /* renamed from: com.google.common.collect.s$b */
    static class C10916b extends C10892j<T> {

        /* renamed from: f */
        final /* synthetic */ Iterable f28476f;

        /* renamed from: g */
        final /* synthetic */ Function f28477g;

        C10916b(Iterable iterable, Function function) {
            this.f28476f = iterable;
            this.f28477g = function;
        }

        public Iterator<T> iterator() {
            return C10917t.m28133a(this.f28476f.iterator(), this.f28477g);
        }
    }

    /* renamed from: a */
    public static String m28129a(Iterable<?> iterable) {
        return C10917t.m28132a(iterable.iterator());
    }

    /* renamed from: a */
    public static <T> Iterable<T> m28128a(Iterable<T> iterable, Predicate<? super T> predicate) {
        C10850i.m28004a(iterable);
        C10850i.m28004a(predicate);
        return new C10915a(iterable, predicate);
    }

    /* renamed from: a */
    public static <F, T> Iterable<T> m28127a(Iterable<F> iterable, Function<? super F, ? extends T> function) {
        C10850i.m28004a(iterable);
        C10850i.m28004a(function);
        return new C10916b(iterable, function);
    }
}

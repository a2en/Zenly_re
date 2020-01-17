package com.google.common.collect;

import com.google.common.base.C10848g;
import com.google.common.base.C10850i;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.t */
public final class C10917t {

    /* renamed from: com.google.common.collect.t$a */
    static class C10918a extends C10868b<T> {

        /* renamed from: g */
        final /* synthetic */ Iterator f28478g;

        /* renamed from: h */
        final /* synthetic */ Predicate f28479h;

        C10918a(Iterator it, Predicate predicate) {
            this.f28478g = it;
            this.f28479h = predicate;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo31656a() {
            while (this.f28478g.hasNext()) {
                T next = this.f28478g.next();
                if (this.f28479h.apply(next)) {
                    return next;
                }
            }
            return mo31657b();
        }
    }

    /* renamed from: com.google.common.collect.t$b */
    static class C10919b extends C10895k0<F, T> {

        /* renamed from: f */
        final /* synthetic */ Function f28480f;

        C10919b(Iterator it, Function function) {
            this.f28480f = function;
            super(it);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public T mo31713a(F f) {
            return this.f28480f.apply(f);
        }
    }

    /* renamed from: com.google.common.collect.t$c */
    static class C10920c extends C10897l0<T> {

        /* renamed from: e */
        boolean f28481e;

        /* renamed from: f */
        final /* synthetic */ Object f28482f;

        C10920c(Object obj) {
            this.f28482f = obj;
        }

        public boolean hasNext() {
            return !this.f28481e;
        }

        public T next() {
            if (!this.f28481e) {
                this.f28481e = true;
                return this.f28482f;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: a */
    public static boolean m28135a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!C10848g.m28000a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: a */
    public static String m28132a(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> boolean m28134a(Collection<T> collection, Iterator<? extends T> it) {
        C10850i.m28004a(collection);
        C10850i.m28004a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public static <T> C10897l0<T> m28131a(Iterator<T> it, Predicate<? super T> predicate) {
        C10850i.m28004a(it);
        C10850i.m28004a(predicate);
        return new C10918a(it, predicate);
    }

    /* renamed from: a */
    public static <F, T> Iterator<T> m28133a(Iterator<F> it, Function<? super F, ? extends T> function) {
        C10850i.m28004a(function);
        return new C10919b(it, function);
    }

    /* renamed from: a */
    public static <T> C10897l0<T> m28130a(T t) {
        return new C10920c(t);
    }
}

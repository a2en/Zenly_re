package com.google.common.collect;

import com.google.common.base.C10850i;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.common.collect.o */
public abstract class C10901o<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: e */
    private static final Object[] f28453e = new Object[0];

    /* renamed from: com.google.common.collect.o$a */
    static abstract class C10902a<E> extends C10903b<E> {

        /* renamed from: a */
        Object[] f28454a;

        /* renamed from: b */
        int f28455b = 0;

        /* renamed from: c */
        boolean f28456c;

        C10902a(int i) {
            C10882f.m28056a(i, "initialCapacity");
            this.f28454a = new Object[i];
        }

        /* renamed from: a */
        private void m28092a(int i) {
            Object[] objArr = this.f28454a;
            if (objArr.length < i) {
                this.f28454a = Arrays.copyOf(objArr, C10903b.m28094a(objArr.length, i));
                this.f28456c = false;
            } else if (this.f28456c) {
                this.f28454a = (Object[]) objArr.clone();
                this.f28456c = false;
            }
        }

        /* renamed from: a */
        public C10902a<E> mo31744a(E e) {
            C10850i.m28004a(e);
            m28092a(this.f28455b + 1);
            Object[] objArr = this.f28454a;
            int i = this.f28455b;
            this.f28455b = i + 1;
            objArr[i] = e;
            return this;
        }
    }

    /* renamed from: com.google.common.collect.o$b */
    public static abstract class C10903b<E> {
        C10903b() {
        }

        /* renamed from: a */
        static int m28094a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    C10901o() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo31668a(Object[] objArr, int i) {
        C10897l0 it = iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            objArr[i] = it.next();
            i = i2;
        }
        return i;
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public abstract C10897l0<E> iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f28453e;
        }
        Object[] objArr = new Object[size];
        mo31668a(objArr, 0);
        return objArr;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C10907c(toArray());
    }

    public final <T> T[] toArray(T[] tArr) {
        C10850i.m28004a(tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = C10962y.m28305b(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo31668a(tArr, 0);
        return tArr;
    }
}

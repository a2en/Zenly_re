package com.google.common.collect;

import com.google.common.base.C10850i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.p */
public abstract class C10904p<E> extends C10901o<E> implements List<E>, RandomAccess {

    /* renamed from: f */
    private static final C10899m0<Object> f28457f = new C10906b(C10875d0.f28420i, 0);

    /* renamed from: com.google.common.collect.p$a */
    public static final class C10905a<E> extends C10902a<E> {
        public C10905a() {
            this(4);
        }

        /* renamed from: a */
        public C10905a<E> mo31744a(E e) {
            super.mo31744a(e);
            return this;
        }

        C10905a(int i) {
            super(i);
        }

        /* renamed from: a */
        public C10904p<E> mo31757a() {
            this.f28456c = true;
            return C10904p.m28100b(this.f28454a, this.f28455b);
        }
    }

    /* renamed from: com.google.common.collect.p$b */
    static class C10906b<E> extends C10866a<E> {

        /* renamed from: g */
        private final C10904p<E> f28458g;

        C10906b(C10904p<E> pVar, int i) {
            super(pVar.size(), i);
            this.f28458g = pVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo31649a(int i) {
            return this.f28458g.get(i);
        }
    }

    /* renamed from: com.google.common.collect.p$c */
    static class C10907c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        final Object[] f28459e;

        C10907c(Object[] objArr) {
            this.f28459e = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return C10904p.m28101c(this.f28459e);
        }
    }

    /* renamed from: com.google.common.collect.p$d */
    class C10908d extends C10904p<E> {

        /* renamed from: g */
        final transient int f28460g;

        /* renamed from: h */
        final transient int f28461h;

        C10908d(int i, int i2) {
            this.f28460g = i;
            this.f28461h = i2;
        }

        public E get(int i) {
            C10850i.m28003a(i, this.f28461h);
            return C10904p.this.get(i + this.f28460g);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C10904p.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C10904p.super.listIterator();
        }

        public int size() {
            return this.f28461h;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C10904p.super.listIterator(i);
        }

        public C10904p<E> subList(int i, int i2) {
            C10850i.m28015b(i, i2, this.f28461h);
            C10904p pVar = C10904p.this;
            int i3 = this.f28460g;
            return pVar.subList(i + i3, i2 + i3);
        }
    }

    C10904p() {
    }

    /* renamed from: a */
    public static <E> C10904p<E> m28096a(E e) {
        return m28099b(e);
    }

    /* renamed from: b */
    public static <E> C10904p<E> m28098b() {
        return C10875d0.f28420i;
    }

    /* renamed from: c */
    public static <E> C10904p<E> m28101c(E[] eArr) {
        if (eArr.length == 0) {
            return m28098b();
        }
        return m28099b((Object[]) eArr.clone());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return C10921u.m28139a(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C10921u.m28140b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C10921u.m28142d(this, obj);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C10907c(toArray());
    }

    /* renamed from: a */
    static <E> C10904p<E> m28097a(Object[] objArr) {
        return m28100b(objArr, objArr.length);
    }

    /* renamed from: b */
    private static <E> C10904p<E> m28099b(Object... objArr) {
        C10962y.m28303a(objArr);
        return m28097a(objArr);
    }

    public C10897l0<E> iterator() {
        return listIterator();
    }

    public C10904p<E> subList(int i, int i2) {
        C10850i.m28015b(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m28098b();
        }
        return mo31745a(i, i2);
    }

    /* renamed from: b */
    static <E> C10904p<E> m28100b(Object[] objArr, int i) {
        if (i == 0) {
            return m28098b();
        }
        return new C10875d0(objArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10904p<E> mo31745a(int i, int i2) {
        return new C10908d(i, i2 - i);
    }

    public C10899m0<E> listIterator() {
        return listIterator(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo31668a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public C10899m0<E> listIterator(int i) {
        C10850i.m28013b(i, size());
        if (isEmpty()) {
            return f28457f;
        }
        return new C10906b(this, i);
    }

    /* renamed from: a */
    public static <E> C10905a<E> m28095a() {
        return new C10905a<>();
    }
}

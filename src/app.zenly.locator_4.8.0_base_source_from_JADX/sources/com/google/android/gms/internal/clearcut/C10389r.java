package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.r */
abstract class C10389r<E> extends AbstractList<E> implements zzcn<E> {

    /* renamed from: e */
    private boolean f27171e = true;

    C10389r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28114a() {
        if (!this.f27171e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo28114a();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo28114a();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo28114a();
        return super.addAll(collection);
    }

    public void clear() {
        mo28114a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo28114a();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo28114a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo28114a();
        return super.retainAll(collection);
    }

    public boolean zzu() {
        return this.f27171e;
    }

    public final void zzv() {
        this.f27171e = false;
    }
}

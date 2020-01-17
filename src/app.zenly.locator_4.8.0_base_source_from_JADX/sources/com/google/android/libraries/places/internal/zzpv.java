package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzpv<E> extends AbstractList<E> implements zzrm<E> {
    private boolean zza = true;

    zzpv() {
    }

    public boolean add(E e) {
        zzc();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzc();
        return super.addAll(collection);
    }

    public void clear() {
        zzc();
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

    public E remove(int i) {
        zzc();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        zzc();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zzc();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzc();
        return super.set(i, e);
    }

    public boolean zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza = false;
    }

    /* access modifiers changed from: protected */
    public final void zzc() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public void add(int i, E e) {
        zzc();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzc();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        zzc();
        return super.remove(obj);
    }
}

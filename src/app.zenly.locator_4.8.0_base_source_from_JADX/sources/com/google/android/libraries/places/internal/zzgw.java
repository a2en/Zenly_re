package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

public abstract class zzgw<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = new Object[0];

    zzgw() {
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
        return toArray(zza);
    }

    /* access modifiers changed from: 0000 */
    public int zza(Object[] objArr, int i) {
        zzhm zzhm = (zzhm) iterator();
        while (zzhm.hasNext()) {
            int i2 = i + 1;
            objArr[i] = zzhm.next();
            i = i2;
        }
        return i;
    }

    /* renamed from: zzb */
    public abstract zzhm<E> iterator();

    public zzgv<E> zzc() {
        return isEmpty() ? zzgv.zza() : zzgv.zzb(toArray());
    }

    /* access modifiers changed from: 0000 */
    public Object[] zzd() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public int zze() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public int zzf() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean zzg();

    public final <T> T[] toArray(T[] tArr) {
        zzgg.zza(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzd = zzd();
            if (zzd != null) {
                return Arrays.copyOfRange(zzd, zze(), zzf(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }
}

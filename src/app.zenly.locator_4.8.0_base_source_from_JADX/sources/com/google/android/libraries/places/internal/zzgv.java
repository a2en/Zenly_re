package com.google.android.libraries.places.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzgv<E> extends zzgw<E> implements List<E>, RandomAccess {
    private static final zzhl<Object> zza = new zzgy(zzhd.zza, 0);

    zzgv() {
    }

    public static <E> zzgv<E> zza() {
        return zzhd.zza;
    }

    static <E> zzgv<E> zzb(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return zzhd.zza;
        }
        return new zzhd(objArr, length);
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
        if (obj == zzgg.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (zzgd.zza(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i2);
                        i2++;
                        if (!zzgd.zza(obj2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
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
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        zzgg.zzb(i, size());
        if (isEmpty()) {
            return zza;
        }
        return new zzgy(this, i);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public final zzgv<E> zzc() {
        return this;
    }

    public static <E> zzgv<E> zza(Collection<? extends E> collection) {
        if (collection instanceof zzgw) {
            zzgv<E> zzc = ((zzgw) collection).zzc();
            if (!zzc.zzg()) {
                return zzc;
            }
            Object[] array = zzc.toArray();
            int length = array.length;
            if (length == 0) {
                return zzhd.zza;
            }
            return new zzhd(array, length);
        }
        Object[] array2 = collection.toArray();
        int length2 = array2.length;
        int i = 0;
        while (i < length2) {
            if (array2[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        int length3 = array2.length;
        if (length3 == 0) {
            return zzhd.zza;
        }
        return new zzhd(array2, length3);
    }

    /* renamed from: zzb */
    public final zzhm<E> iterator() {
        return (zzhl) listIterator();
    }

    public /* synthetic */ ListIterator listIterator() {
        return (zzhl) listIterator(0);
    }

    public static <E> zzgv<E> zza(E[] eArr) {
        if (eArr.length == 0) {
            return zzhd.zza;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        int length2 = objArr.length;
        if (length2 == 0) {
            return zzhd.zza;
        }
        return new zzhd(objArr, length2);
    }

    /* renamed from: zza */
    public zzgv<E> subList(int i, int i2) {
        zzgg.zza(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzhd.zza;
        }
        return new zzgx(this, i, i3);
    }

    /* access modifiers changed from: 0000 */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }
}

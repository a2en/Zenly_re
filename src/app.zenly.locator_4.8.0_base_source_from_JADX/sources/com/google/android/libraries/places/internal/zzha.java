package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class zzha<K, V> implements Serializable, Map<K, V> {
    private static final Entry<?, ?>[] zza = new Entry[0];
    private transient zzhc<Entry<K, V>> zzb;
    private transient zzhc<K> zzc;
    private transient zzgw<V> zzd;

    zzha() {
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return ((zzgw) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        zzhc<Entry<K, V>> zzhc = this.zzb;
        if (zzhc != null) {
            return zzhc;
        }
        zzhc<Entry<K, V>> zza2 = zza();
        this.zzb = zza2;
        return zza2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return zzhj.zza((zzhc) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        zzhc<K> zzhc = this.zzc;
        if (zzhc != null) {
            return zzhc;
        }
        zzhc<K> zzb2 = zzb();
        this.zzc = zzb2;
        return zzb2;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                z = false;
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        String str = "size";
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public /* synthetic */ Collection values() {
        zzgw<V> zzgw = this.zzd;
        if (zzgw != null) {
            return zzgw;
        }
        zzgw<V> zzc2 = zzc();
        this.zzd = zzc2;
        return zzc2;
    }

    /* access modifiers changed from: 0000 */
    public abstract zzhc<Entry<K, V>> zza();

    /* access modifiers changed from: 0000 */
    public abstract zzhc<K> zzb();

    /* access modifiers changed from: 0000 */
    public abstract zzgw<V> zzc();
}

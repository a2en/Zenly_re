package com.google.android.libraries.places.internal;

import java.util.Map.Entry;

final class zzhf<K, V> extends zzhc<Entry<K, V>> {
    private final transient zzha<K, V> zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    private final transient int zzc = 0;
    /* access modifiers changed from: private */
    public final transient int zzd;

    zzhf(zzha<K, V> zzha, Object[] objArr, int i, int i2) {
        this.zza = zzha;
        this.zzb = objArr;
        this.zzd = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    public final int size() {
        return this.zzd;
    }

    /* access modifiers changed from: 0000 */
    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }

    /* renamed from: zzb */
    public final zzhm<Entry<K, V>> iterator() {
        return (zzhm) zzc().iterator();
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzg() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final zzgv<Entry<K, V>> zza() {
        return new zzhi(this);
    }
}

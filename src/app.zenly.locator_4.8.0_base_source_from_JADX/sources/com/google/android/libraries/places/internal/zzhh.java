package com.google.android.libraries.places.internal;

final class zzhh<K> extends zzhc<K> {
    private final transient zzha<K, ?> zza;
    private final transient zzgv<K> zzb;

    zzhh(zzha<K, ?> zzha, zzgv<K> zzgv) {
        this.zza = zzha;
        this.zzb = zzgv;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: 0000 */
    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }

    /* renamed from: zzb */
    public final zzhm<K> iterator() {
        return (zzhm) zzc().iterator();
    }

    public final zzgv<K> zzc() {
        return this.zzb;
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzg() {
        return true;
    }
}

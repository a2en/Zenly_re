package com.google.android.libraries.places.internal;

final class zzhk extends zzgv<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzhk(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final Object get(int i) {
        zzgg.zza(i, this.zzc);
        return this.zza[(i * 2) + this.zzb];
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzg() {
        return true;
    }
}

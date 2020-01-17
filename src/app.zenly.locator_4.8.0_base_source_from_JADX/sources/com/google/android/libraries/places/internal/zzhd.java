package com.google.android.libraries.places.internal;

final class zzhd<E> extends zzgv<E> {
    static final zzgv<Object> zza = new zzhd(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    zzhd(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public final E get(int i) {
        zzgg.zza(i, this.zzc);
        return this.zzb[i];
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: 0000 */
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    /* access modifiers changed from: 0000 */
    public final Object[] zzd() {
        return this.zzb;
    }

    /* access modifiers changed from: 0000 */
    public final int zze() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final int zzf() {
        return this.zzc;
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzg() {
        return false;
    }
}

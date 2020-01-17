package com.google.android.libraries.places.internal;

final class zzgx extends zzgv<E> {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzgv zzc;

    zzgx(zzgv zzgv, int i, int i2) {
        this.zzc = zzgv;
        this.zza = i;
        this.zzb = i2;
    }

    public final E get(int i) {
        zzgg.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    /* renamed from: zza */
    public final zzgv<E> subList(int i, int i2) {
        zzgg.zza(i, i2, this.zzb);
        zzgv zzgv = this.zzc;
        int i3 = this.zza;
        return (zzgv) zzgv.subList(i + i3, i2 + i3);
    }

    /* access modifiers changed from: 0000 */
    public final Object[] zzd() {
        return this.zzc.zzd();
    }

    /* access modifiers changed from: 0000 */
    public final int zze() {
        return this.zzc.zze() + this.zza;
    }

    /* access modifiers changed from: 0000 */
    public final int zzf() {
        return this.zzc.zze() + this.zza + this.zzb;
    }

    /* access modifiers changed from: 0000 */
    public final boolean zzg() {
        return true;
    }
}

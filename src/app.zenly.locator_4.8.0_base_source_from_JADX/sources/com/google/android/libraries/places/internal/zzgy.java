package com.google.android.libraries.places.internal;

final class zzgy<E> extends zzgo<E> {
    private final zzgv<E> zza;

    zzgy(zzgv<E> zzgv, int i) {
        super(zzgv.size(), i);
        this.zza = zzgv;
    }

    /* access modifiers changed from: protected */
    public final E zza(int i) {
        return this.zza.get(i);
    }
}

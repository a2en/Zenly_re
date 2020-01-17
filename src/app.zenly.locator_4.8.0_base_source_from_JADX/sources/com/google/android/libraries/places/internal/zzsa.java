package com.google.android.libraries.places.internal;

final class zzsa extends zzrv {
    private zzsa() {
        super();
    }

    private static <E> zzrm<E> zzb(Object obj, long j) {
        return (zzrm) zztx.zzf(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final void zza(Object obj, long j) {
        zzb(obj, j).zzb();
    }

    /* access modifiers changed from: 0000 */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzrm zzb = zzb(obj, j);
        zzrm zzb2 = zzb(obj2, j);
        int size = zzb.size();
        int size2 = zzb2.size();
        if (size > 0 && size2 > 0) {
            if (!zzb.zza()) {
                zzb = zzb.zzb(size2 + size);
            }
            zzb.addAll(zzb2);
        }
        if (size > 0) {
            zzb2 = zzb;
        }
        zztx.zza(obj, j, (Object) zzb2);
    }
}

package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzrb.zzd;
import java.io.IOException;
import java.util.Map.Entry;

final class zzqu extends zzqr<Object> {
    zzqu() {
    }

    /* access modifiers changed from: 0000 */
    public final boolean zza(zzsm zzsm) {
        return zzsm instanceof zzd;
    }

    /* access modifiers changed from: 0000 */
    public final zzqw<Object> zzb(Object obj) {
        zzd zzd = (zzd) obj;
        if (zzd.zzc.zzc()) {
            zzd.zzc = (zzqw) zzd.zzc.clone();
        }
        return zzd.zzc;
    }

    /* access modifiers changed from: 0000 */
    public final void zzc(Object obj) {
        zza(obj).zzb();
    }

    /* access modifiers changed from: 0000 */
    public final zzqw<Object> zza(Object obj) {
        return ((zzd) obj).zzc;
    }

    /* access modifiers changed from: 0000 */
    public final int zza(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void zza(zzul zzul, Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }
}

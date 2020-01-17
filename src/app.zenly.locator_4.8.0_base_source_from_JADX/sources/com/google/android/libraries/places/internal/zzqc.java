package com.google.android.libraries.places.internal;

import java.util.Comparator;

final class zzqc implements Comparator<zzqa> {
    zzqc() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzqa zzqa = (zzqa) obj;
        zzqa zzqa2 = (zzqa) obj2;
        zzqf zzqf = (zzqf) zzqa.iterator();
        zzqf zzqf2 = (zzqf) zzqa2.iterator();
        while (zzqf.hasNext() && zzqf2.hasNext()) {
            int compare = Integer.compare(zzqa.zzb(zzqf.zza()), zzqa.zzb(zzqf2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzqa.zza(), zzqa2.zza());
    }
}

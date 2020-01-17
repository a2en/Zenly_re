package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzgi {
    /* access modifiers changed from: private */
    public final zzft zza;
    private final boolean zzb;
    private final zzgm zzc;
    /* access modifiers changed from: private */
    public final int zzd;

    private zzgi(zzgm zzgm) {
        this(zzgm, false, zzfx.zza, Integer.MAX_VALUE);
    }

    public static zzgi zza(zzft zzft) {
        zzgg.zza(zzft);
        return new zzgi(new zzgh(zzft));
    }

    private zzgi(zzgm zzgm, boolean z, zzft zzft, int i) {
        this.zzc = zzgm;
        this.zzb = false;
        this.zza = zzft;
        this.zzd = Integer.MAX_VALUE;
    }

    public final List<String> zza(CharSequence charSequence) {
        zzgg.zza(charSequence);
        Iterator zza2 = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza2.hasNext()) {
            arrayList.add((String) zza2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

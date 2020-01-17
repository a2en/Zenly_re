package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;

final class zzgb extends zzfz {
    private final /* synthetic */ zzfz zza;

    zzgb(zzfz zzfz, zzfz zzfz2) {
        this.zza = zzfz;
        super(zzfz2, null);
    }

    public final <A extends Appendable> A zza(A a, Iterator<?> it) throws IOException {
        zzgg.zza(a, (Object) "appendable");
        zzgg.zza(it, (Object) "parts");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                a.append(this.zza.zza(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                a.append(this.zza.zza);
                a.append(this.zza.zza(next2));
            }
        }
        return a;
    }

    public final zzga zzb(String str) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}

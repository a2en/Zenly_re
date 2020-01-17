package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;

public class zzfz {
    /* access modifiers changed from: private */
    public final String zza;

    private zzfz(String str) {
        this.zza = (String) zzgg.zza(str);
    }

    public static zzfz zza(String str) {
        return new zzfz(str);
    }

    public zzga zzb(String str) {
        return new zzga(this, str, null);
    }

    public <A extends Appendable> A zza(A a, Iterator<?> it) throws IOException {
        zzgg.zza(a);
        if (it.hasNext()) {
            a.append(zza(it.next()));
            while (it.hasNext()) {
                a.append(this.zza);
                a.append(zza(it.next()));
            }
        }
        return a;
    }

    private zzfz(zzfz zzfz) {
        this.zza = zzfz.zza;
    }

    /* synthetic */ zzfz(zzfz zzfz, zzfy zzfy) {
        this(zzfz);
    }

    private final StringBuilder zza(StringBuilder sb, Iterator<?> it) {
        try {
            zza((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String zza(Iterable<?> iterable) {
        return zza(new StringBuilder(), iterable.iterator()).toString();
    }

    public zzfz zza() {
        return new zzgb(this, this);
    }

    /* access modifiers changed from: 0000 */
    public CharSequence zza(Object obj) {
        zzgg.zza(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}

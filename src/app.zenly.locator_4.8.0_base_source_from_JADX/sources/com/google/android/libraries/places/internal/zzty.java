package com.google.android.libraries.places.internal;

import java.util.Iterator;

final class zzty implements Iterator<String> {
    private Iterator<String> zza = this.zzb.zza.iterator();
    private final /* synthetic */ zztw zzb;

    zzty(zztw zztw) {
        this.zzb = zztw;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

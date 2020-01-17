package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class zztf extends zztl {
    private final /* synthetic */ zzte zza;

    private zztf(zzte zzte) {
        this.zza = zzte;
        super(zzte, null);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new zztg(this.zza, null);
    }

    /* synthetic */ zztf(zzte zzte, zztd zztd) {
        this(zzte);
    }
}

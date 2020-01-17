package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzrr<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> zza;

    public zzrr(Iterator<Entry<K, Object>> it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.zza.next();
        return entry.getValue() instanceof zzrq ? new zzrs(entry) : entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}

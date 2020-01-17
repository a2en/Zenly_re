package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class zztl extends AbstractSet<Entry<K, V>> {
    private final /* synthetic */ zzte zza;

    private zztl(zzte zzte) {
        this.zza = zzte;
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zza.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.zza.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.zza.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new zztm(this.zza, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zza.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.zza.size();
    }

    /* synthetic */ zztl(zzte zzte, zztd zztd) {
        this(zzte);
    }
}

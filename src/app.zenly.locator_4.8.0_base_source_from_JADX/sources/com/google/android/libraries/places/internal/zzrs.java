package com.google.android.libraries.places.internal;

import java.util.Map.Entry;

final class zzrs<K> implements Entry<K, Object> {
    private Entry<K, zzrq> zza;

    private zzrs(Entry<K, zzrq> entry) {
        this.zza = entry;
    }

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (((zzrq) this.zza.getValue()) == null) {
            return null;
        }
        return zzrq.zza();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzsm) {
            return ((zzrq) this.zza.getValue()).zza((zzsm) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzrq zza() {
        return (zzrq) this.zza.getValue();
    }
}

package com.google.android.libraries.places.internal;

import java.util.Map.Entry;

final class zztj implements Comparable<zztj>, Entry<K, V> {
    private final K zza;
    private V zzb;
    private final /* synthetic */ zzte zzc;

    zztj(zzte zzte, Entry<K, V> entry) {
        this(zzte, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean zza(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zztj) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return zza(this.zza, entry.getKey()) && zza(this.zzb, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.zza;
    }

    public final V getValue() {
        return this.zzb;
    }

    public final int hashCode() {
        K k = this.zza;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.zzb;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.zzc.zzf();
        V v2 = this.zzb;
        this.zzb = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    zztj(zzte zzte, K k, V v) {
        this.zzc = zzte;
        this.zza = k;
        this.zzb = v;
    }
}

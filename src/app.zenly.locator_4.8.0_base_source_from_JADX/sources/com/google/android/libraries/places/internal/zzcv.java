package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzdb.zzb;

final class zzcv extends zzdb {
    private final String zza;
    private final int zzb;
    private final zzb zzc;

    private zzcv(String str, int i, zzb zzb2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzb2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdb) {
            zzdb zzdb = (zzdb) obj;
            return this.zza.equals(zzdb.zza()) && this.zzb == zzdb.zzb() && this.zzc.equals(zzdb.zzc());
        }
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int i = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(valueOf).length());
        sb.append("ClientProfile{packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(i);
        sb.append(", requestSource=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzb zzc() {
        return this.zzc;
    }
}

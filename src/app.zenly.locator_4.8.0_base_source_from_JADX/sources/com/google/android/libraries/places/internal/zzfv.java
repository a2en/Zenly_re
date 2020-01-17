package com.google.android.libraries.places.internal;

final class zzfv extends zzfs {
    private final char zza;

    zzfv(char c) {
        this.zza = c;
    }

    public final String toString() {
        String zzc = zzft.zzd(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(zzc);
        sb.append("')");
        return sb.toString();
    }

    public final boolean zzb(char c) {
        return c == this.zza;
    }
}

package com.google.android.libraries.places.internal;

public class zzru {
    private static final zzqs zza = zzqs.zza();
    private zzqa zzb;
    private volatile zzsm zzc;
    private volatile zzqa zzd;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.libraries.places.internal.zzsm zzb(com.google.android.libraries.places.internal.zzsm r2) {
        /*
            r1 = this;
            com.google.android.libraries.places.internal.zzsm r0 = r1.zzc
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.libraries.places.internal.zzsm r0 = r1.zzc     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.zzc = r2     // Catch:{ zzrl -> 0x0012 }
            com.google.android.libraries.places.internal.zzqa r0 = com.google.android.libraries.places.internal.zzqa.zza     // Catch:{ zzrl -> 0x0012 }
            r1.zzd = r0     // Catch:{ zzrl -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.zzc = r2     // Catch:{ all -> 0x001a }
            com.google.android.libraries.places.internal.zzqa r2 = com.google.android.libraries.places.internal.zzqa.zza     // Catch:{ all -> 0x001a }
            r1.zzd = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.libraries.places.internal.zzsm r2 = r1.zzc
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzru.zzb(com.google.android.libraries.places.internal.zzsm):com.google.android.libraries.places.internal.zzsm");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzru)) {
            return false;
        }
        zzru zzru = (zzru) obj;
        zzsm zzsm = this.zzc;
        zzsm zzsm2 = zzru.zzc;
        if (zzsm == null && zzsm2 == null) {
            return zzc().equals(zzru.zzc());
        }
        if (zzsm != null && zzsm2 != null) {
            return zzsm.equals(zzsm2);
        }
        if (zzsm != null) {
            return zzsm.equals(zzru.zzb(zzsm.zzm()));
        }
        return zzb(zzsm2.zzm()).equals(zzsm2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzsm zza(zzsm zzsm) {
        zzsm zzsm2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzsm;
        return zzsm2;
    }

    public final zzqa zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                zzqa zzqa = this.zzd;
                return zzqa;
            }
            if (this.zzc == null) {
                this.zzd = zzqa.zza;
            } else {
                this.zzd = this.zzc.zzc();
            }
            zzqa zzqa2 = this.zzd;
            return zzqa2;
        }
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzh();
        }
        return 0;
    }
}

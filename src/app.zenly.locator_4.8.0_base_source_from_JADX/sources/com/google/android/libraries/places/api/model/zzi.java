package com.google.android.libraries.places.api.model;

final class zzi extends zza {
    private Integer zza;
    private Integer zzb;

    zzi() {
    }

    /* access modifiers changed from: 0000 */
    public final zza zza(int i) {
        this.zza = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final zza zzb(int i) {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final LocalTime zza() {
        String str = "";
        if (this.zza == null) {
            str = str.concat(" hours");
        }
        if (this.zzb == null) {
            str = String.valueOf(str).concat(" minutes");
        }
        if (str.isEmpty()) {
            return new zzah(this.zza.intValue(), this.zzb.intValue());
        }
        String str2 = "Missing required properties:";
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}

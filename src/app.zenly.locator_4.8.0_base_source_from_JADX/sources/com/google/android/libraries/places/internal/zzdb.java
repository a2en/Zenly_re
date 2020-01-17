package com.google.android.libraries.places.internal;

import android.content.Context;

public abstract class zzdb {

    public static abstract class zza {
        /* access modifiers changed from: 0000 */
        public abstract zza zza(int i);

        public abstract zza zza(zzb zzb);

        /* access modifiers changed from: 0000 */
        public abstract zza zza(String str);

        /* access modifiers changed from: 0000 */
        public abstract zzdb zza();

        public final zzdb zzb() {
            zzdb zza = zza();
            zzgg.zzb(!zza.zza().isEmpty(), (Object) "Package name must not be empty.");
            return zza;
        }
    }

    public enum zzb {
        PROGRAMMATIC_API,
        AUTOCOMPLETE_WIDGET
    }

    public static zza zza(Context context) {
        zzcu zzcu = new zzcu(context);
        return new zzcx().zza(zzcu.zzb()).zza(zzcu.zzc()).zza(zzb.PROGRAMMATIC_API);
    }

    public abstract String zza();

    public abstract int zzb();

    public abstract zzb zzc();
}

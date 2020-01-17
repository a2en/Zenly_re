package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public final class zzcu {
    private final String zza;
    private final String zzb;
    private final int zzc;

    public zzcu(Context context) {
        this.zza = context.getPackageName();
        this.zzb = zzcs.zza(context.getPackageManager(), this.zza);
        this.zzc = zza(context);
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc;
    }

    private final int zza(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(this.zza, 0).versionCode;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }
}

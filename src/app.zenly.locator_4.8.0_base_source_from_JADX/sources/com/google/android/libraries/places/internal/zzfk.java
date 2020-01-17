package com.google.android.libraries.places.internal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

final class zzfk implements zzff {
    private AppCompatActivity zza;
    private Bundle zzb;

    private zzfk() {
    }

    public final zzfg zza() {
        zzun.zza(this.zza, AppCompatActivity.class);
        return new zzfi(this.zza, this.zzb);
    }

    public final /* synthetic */ zzff zza(Bundle bundle) {
        this.zzb = bundle;
        return this;
    }

    public final /* synthetic */ zzff zza(AppCompatActivity appCompatActivity) {
        this.zza = (AppCompatActivity) zzun.zza(appCompatActivity);
        return this;
    }
}

package com.google.android.libraries.places.internal;

import android.text.Editable;
import android.text.TextWatcher;

final class zzdw implements TextWatcher {
    private final /* synthetic */ zzdn zza;

    zzdw(zzdn zzdn) {
        this.zza = zzdn;
    }

    public final void afterTextChanged(Editable editable) {
        try {
            String obj = editable.toString();
            this.zza.zzo.zza((CharSequence) obj);
            this.zza.zza.zza(obj);
            this.zza.zzj();
            this.zza.zzi();
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

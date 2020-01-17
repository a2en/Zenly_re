package com.google.android.libraries.places.widget;

import android.view.View;
import android.view.View.OnClickListener;

final /* synthetic */ class zzd implements OnClickListener {
    private final AutocompleteSupportFragment zza;

    zzd(AutocompleteSupportFragment autocompleteSupportFragment) {
        this.zza = autocompleteSupportFragment;
    }

    public final void onClick(View view) {
        this.zza.setText("");
    }
}

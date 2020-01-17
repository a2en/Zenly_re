package com.google.android.libraries.places.widget;

import android.view.View;
import android.view.View.OnClickListener;

final /* synthetic */ class zza implements OnClickListener {
    private final AutocompleteFragment zza;

    zza(AutocompleteFragment autocompleteFragment) {
        this.zza = autocompleteFragment;
    }

    public final void onClick(View view) {
        this.zza.setText("");
    }
}

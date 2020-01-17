package com.google.android.libraries.places.internal;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final /* synthetic */ class zzdt implements OnEditorActionListener {
    private final zzdn zza;

    zzdt(zzdn zzdn) {
        this.zza = zzdn;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.zza.zza(textView, i, keyEvent);
    }
}

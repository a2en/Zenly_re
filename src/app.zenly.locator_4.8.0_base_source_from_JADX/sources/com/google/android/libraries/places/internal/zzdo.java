package com.google.android.libraries.places.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final /* synthetic */ class zzdo implements OnTouchListener {
    private final zzdn zza;

    zzdo(zzdn zzdn) {
        this.zza = zzdn;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.zza.zza(view, motionEvent);
    }
}

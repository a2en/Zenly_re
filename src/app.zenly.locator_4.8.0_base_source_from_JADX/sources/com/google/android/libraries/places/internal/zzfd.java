package com.google.android.libraries.places.internal;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class zzfd {
    public static void zza(Context context, View view) {
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

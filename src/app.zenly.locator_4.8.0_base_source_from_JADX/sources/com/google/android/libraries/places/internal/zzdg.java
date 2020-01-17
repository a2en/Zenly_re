package com.google.android.libraries.places.internal;

import android.content.Intent;
import android.os.Parcelable;

public class zzdg {
    protected static void zza(Intent intent, String str, String str2) {
        if (str2 != null) {
            intent.putExtra(str, str2);
        } else {
            intent.removeExtra(str);
        }
    }

    protected static void zza(Intent intent, String str, Parcelable parcelable) {
        if (parcelable != null) {
            intent.putExtra(str, parcelable);
        } else {
            intent.removeExtra(str);
        }
    }
}

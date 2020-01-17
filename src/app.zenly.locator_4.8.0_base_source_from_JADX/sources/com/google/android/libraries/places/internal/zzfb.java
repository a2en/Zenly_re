package com.google.android.libraries.places.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import com.google.android.libraries.places.C10720R;

public final class zzfb {
    @TargetApi(21)
    public static void zza(Activity activity, int i, int i2, int i3) {
        Toolbar zza = zza(activity);
        if (zza != null) {
            zza.setBackgroundColor(i);
            zza.setTitleTextColor(i3);
            Drawable navigationIcon = zza.getNavigationIcon();
            if (navigationIcon != null) {
                zza(navigationIcon, i3);
                zza.setNavigationIcon(navigationIcon);
            }
            if (VERSION.SDK_INT >= 21) {
                activity.getWindow().setStatusBarColor(i2);
            }
        }
    }

    public static void zza(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(Color.rgb(Color.red(i), Color.green(i), Color.blue(i)), Mode.SRC_ATOP);
        drawable.setAlpha(Color.alpha(i));
    }

    private static Toolbar zza(Activity activity) {
        String str = "ColorUtil";
        try {
            Toolbar toolbar = (Toolbar) activity.findViewById(C10720R.C10722id.places_autocomplete_action_bar);
            if (toolbar != null) {
                return toolbar;
            }
            if (Log.isLoggable(str, 6)) {
                Log.e(str, "Failed to get action bar; couldn't get view.");
            }
            return null;
        } catch (ClassCastException e) {
            if (Log.isLoggable(str, 6)) {
                Log.e(str, "Failed to get action bar; View is wrong class.", e);
            }
            return null;
        }
    }
}

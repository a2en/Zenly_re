package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.C10109f;

public final class GooglePlayServicesUtil extends C10074e {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C10074e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C10074e.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return C10074e.getErrorString(i);
    }

    public static Context getRemoteContext(Context context) {
        return C10074e.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return C10074e.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return C10074e.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return C10074e.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        C10067c a = C10067c.m25293a();
        if (C10074e.isPlayServicesPossiblyUpdating(context, i) || C10074e.isPlayStorePossiblyUpdating(context, i)) {
            a.mo27294b(context);
        } else {
            a.mo27295b(context, i);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        if (C10074e.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return C10067c.m25293a().mo27286a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return C10074e.isGooglePlayServicesAvailable(context, i);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, OnCancelListener onCancelListener) {
        if (C10074e.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        C10067c a = C10067c.m25293a();
        if (fragment == null) {
            return a.mo27297b(activity, i, i2, onCancelListener);
        }
        Dialog a2 = C10067c.m25292a((Context) activity, i, C10109f.m25456a(fragment, C10067c.m25293a().mo27289a((Context) activity, i, "d"), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        C10067c.m25294a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }
}

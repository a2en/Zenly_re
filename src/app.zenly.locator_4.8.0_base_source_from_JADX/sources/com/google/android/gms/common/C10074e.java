package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.C10124l0;
import com.google.android.gms.common.p309i.C10079b;
import com.google.android.gms.common.util.C10166c;
import com.google.android.gms.common.util.C10170g;
import com.google.android.gms.common.util.C10174k;
import com.google.android.gms.common.util.C10177n;
import com.google.android.gms.common.util.C10180p;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.e */
public class C10074e {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static boolean zzav = false;
    private static boolean zzaw = false;
    private static boolean zzax = false;
    private static boolean zzay = false;
    private static final AtomicBoolean zzaz = new AtomicBoolean();

    C10074e() {
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzaz.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int a = C10069d.m25311a().mo27285a(context, i);
        if (a != 0) {
            Intent a2 = C10069d.m25311a().mo27289a(context, a, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(a);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a2 == null) {
                throw new GooglePlayServicesNotAvailableException(a);
            }
            throw new GooglePlayServicesRepairableException(a, "Google Play Services not available", a2);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        C10123l.m25516b(true);
        return C10166c.m25658a(context, context.getPackageName());
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C10069d.m25311a().mo27287a(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return ConnectionResult.zza(i);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return C10069d.m25311a().mo27289a((Context) null, i, (String) null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zzay) {
            try {
                PackageInfo b = C10079b.m25337a(context).mo27333b("com.google.android.gms", 64);
                C10075f.m25325a(context);
                if (b == null || C10075f.m25327a(b, false) || !C10075f.m25327a(b, true)) {
                    zzax = false;
                } else {
                    zzax = true;
                }
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                zzay = true;
            }
        }
        return zzax || !C10170g.m25665a();
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return C10177n.m25691a(context, i);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return isUninstalledAppPossiblyUpdating(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return isUninstalledAppPossiblyUpdating(context, "com.android.vending");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        if (C10174k.m25681d()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null) {
                if ("true".equals(applicationRestrictions.getString("restricted_profile"))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return C10170g.m25666a(context);
    }

    @TargetApi(21)
    static boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C10174k.m25684g()) {
            try {
                for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (NameNotFoundException unused2) {
        }
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return C10177n.m25692a(context, i, str);
    }

    private static int zza(Context context, boolean z, int i) {
        String str = "com.google.android.gms";
        C10123l.m25512a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        String str2 = "GooglePlayServicesUtil";
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException unused) {
                Log.w(str2, "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            C10075f.m25325a(context);
            if (!C10075f.m25327a(packageInfo2, true)) {
                Log.w(str2, "Google Play services signature invalid.");
                return 9;
            } else if (z && (!C10075f.m25327a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w(str2, "Google Play Store signature invalid.");
                return 9;
            } else if (C10180p.m25693a(packageInfo2.versionCode) < C10180p.m25693a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w(str2, sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo(str, 0);
                    } catch (NameNotFoundException e) {
                        Log.wtf(str2, "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                if (!applicationInfo.enabled) {
                    return 3;
                }
                return 0;
            }
        } catch (NameNotFoundException unused2) {
            Log.w(str2, "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        try {
            context.getResources().getString(C10076g.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzaz.get()) {
            int a = C10124l0.m25520a(context);
            if (a != 0) {
                int i2 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
                if (a != i2) {
                    StringBuilder sb = new StringBuilder(320);
                    sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                    sb.append(i2);
                    sb.append(" but found ");
                    sb.append(a);
                    sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        return zza(context, !C10170g.m25668c(context) && !C10170g.m25670e(context), i);
    }
}

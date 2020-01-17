package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C10112g0;
import com.google.android.gms.common.p309i.C10079b;
import com.google.android.gms.common.util.C10170g;

/* renamed from: com.google.android.gms.common.d */
public class C10069d {

    /* renamed from: a */
    public static final int f26459a = C10074e.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b */
    private static final C10069d f26460b = new C10069d();

    C10069d() {
    }

    /* renamed from: a */
    public static C10069d m25311a() {
        return f26460b;
    }

    /* renamed from: b */
    public boolean mo27296b(int i) {
        return C10074e.isUserRecoverableError(i);
    }

    /* renamed from: b */
    private static String m25312b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f26459a);
        String str2 = "-";
        sb.append(str2);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(str2);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(str2);
        if (context != null) {
            try {
                sb.append(C10079b.m25337a(context).mo27333b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo27284a(Context context) {
        return mo27285a(context, f26459a);
    }

    /* renamed from: a */
    public int mo27285a(Context context, int i) {
        int isGooglePlayServicesAvailable = C10074e.isGooglePlayServicesAvailable(context, i);
        if (C10074e.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    /* renamed from: a */
    public Intent mo27289a(Context context, int i, String str) {
        String str2 = "com.google.android.gms";
        if (i == 1 || i == 2) {
            if (context == null || !C10170g.m25668c(context)) {
                return C10112g0.m25474a(str2, m25312b(context, str));
            }
            return C10112g0.m25472a();
        } else if (i != 3) {
            return null;
        } else {
            return C10112g0.m25473a(str2);
        }
    }

    /* renamed from: a */
    public PendingIntent mo27287a(Context context, int i, int i2) {
        return mo27299a(context, i, i2, null);
    }

    /* renamed from: a */
    public PendingIntent mo27299a(Context context, int i, int i2, String str) {
        Intent a = mo27289a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    /* renamed from: a */
    public boolean mo27300a(Context context, String str) {
        return C10074e.isUninstalledAppPossiblyUpdating(context, str);
    }

    /* renamed from: a */
    public String mo27291a(int i) {
        return C10074e.getErrorString(i);
    }
}

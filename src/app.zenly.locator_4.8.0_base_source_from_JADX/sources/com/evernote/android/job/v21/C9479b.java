package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.v14.PlatformAlarmServiceExact;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
/* renamed from: com.evernote.android.job.v21.b */
final class C9479b {

    /* renamed from: a */
    private static final C9469c f24568a = new C9469c("TransientBundleCompat");

    /* renamed from: a */
    public static void m23123a(Context context, C9450h hVar) {
        PendingIntent service = PendingIntent.getService(context, hVar.mo25348k(), PlatformAlarmServiceExact.m23096a(context, hVar.mo25348k(), hVar.mo25352o()), 134217728);
        ((AlarmManager) context.getSystemService("alarm")).setExact(1, System.currentTimeMillis() + TimeUnit.DAYS.toMillis(1000), service);
    }

    /* renamed from: b */
    public static boolean m23125b(Context context, C9450h hVar) {
        PendingIntent service = PendingIntent.getService(context, hVar.mo25348k(), PlatformAlarmServiceExact.m23096a(context, hVar.mo25348k(), null), 536870912);
        if (service == null) {
            return false;
        }
        try {
            f24568a.mo25416c("Delegating transient job %s to API 14", hVar);
            service.send();
            if (!hVar.mo25355r()) {
                m23122a(context, hVar.mo25348k(), service);
            }
            return true;
        } catch (CanceledException e) {
            f24568a.mo25410a((Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m23124a(Context context, int i) {
        return PendingIntent.getService(context, i, PlatformAlarmServiceExact.m23096a(context, i, null), 536870912) != null;
    }

    /* renamed from: a */
    public static void m23122a(Context context, int i, PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            try {
                pendingIntent = PendingIntent.getService(context, i, PlatformAlarmServiceExact.m23096a(context, i, null), 536870912);
                if (pendingIntent == null) {
                    return;
                }
            } catch (Exception e) {
                f24568a.mo25410a((Throwable) e);
            }
        }
        ((AlarmManager) context.getSystemService("alarm")).cancel(pendingIntent);
        pendingIntent.cancel();
    }
}

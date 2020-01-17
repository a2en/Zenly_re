package androidx.core.content.p003c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.core.content.C0540a;

/* renamed from: androidx.core.content.c.b */
public class C0544b {

    /* renamed from: androidx.core.content.c.b$a */
    static class C0545a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ IntentSender f2584a;

        C0545a(IntentSender intentSender) {
            this.f2584a = intentSender;
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.f2584a.sendIntent(context, 0, null, null, null);
            } catch (SendIntentException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m2559a(Context context) {
        if (VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        String str = "com.android.launcher.permission.INSTALL_SHORTCUT";
        if (C0540a.m2537a(context, str) != 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0)) {
            String str2 = resolveInfo.activityInfo.permission;
            if (!TextUtils.isEmpty(str2)) {
                if (str.equals(str2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2560a(Context context, C0542a aVar, IntentSender intentSender) {
        if (VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(aVar.mo3075a(), intentSender);
        }
        if (!m2559a(context)) {
            return false;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        aVar.mo3074a(intent);
        if (intentSender == null) {
            context.sendBroadcast(intent);
            return true;
        }
        context.sendOrderedBroadcast(intent, null, new C0545a(intentSender), null, -1, null, null);
        return true;
    }
}

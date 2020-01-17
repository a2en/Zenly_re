package app.zenly.locator.core.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p250f.p251a.p252a.p253a.p255e.C7660b;

/* renamed from: app.zenly.locator.core.util.s */
public class C3236s {
    /* renamed from: a */
    private static ApplicationInfo m10257a(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m10264b(Context context, String str) {
        if (str != null) {
            ApplicationInfo a = m10257a(context, str);
            if (a != null) {
                return a.enabled;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m10265c(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append(str);
        String sb2 = sb.toString();
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(sb2));
        C7660b.m18653a(context, intent);
    }

    /* renamed from: a */
    public static ActivityInfo m10256a(Context context, Intent intent) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        return ((ResolveInfo) queryIntentActivities.get(0)).activityInfo;
    }

    /* renamed from: b */
    public static Intent m10262b(String str) {
        return new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str);
    }

    /* renamed from: a */
    public static String m10258a(Context context) {
        ActivityInfo a = m10256a(context, m10252a(""));
        if (a != null) {
            return a.packageName;
        }
        return null;
    }

    /* renamed from: b */
    public static void m10263b(Context context) {
        String str = "android.settings.APPLICATION_DETAILS_SETTINGS";
        C7660b.m18653a(context, new Intent(str, Uri.fromParts("package", context.getPackageName(), null)));
    }

    /* renamed from: a */
    public static Intent m10252a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.TEXT", str);
        return intent;
    }

    /* renamed from: a */
    public static Intent m10253a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str3 = "smsto:";
        String str4 = "+";
        if (!str.contains(str4)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str4);
            str3 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb2.toString()));
        intent.putExtra("sms_body", str2);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.putExtra("compose_mode", true);
        return intent;
    }

    /* renamed from: a */
    public static boolean m10261a(Context context, String str, Intent... intentArr) {
        Intent createChooser = Intent.createChooser(intentArr[0], str);
        if (intentArr.length > 1) {
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) Arrays.copyOfRange(intentArr, 1, intentArr.length));
        }
        return C7660b.m18653a(context, createChooser);
    }

    /* renamed from: a */
    public static Intent m10254a(String str, String str2, String str3) {
        Intent createChooser = Intent.createChooser(m10262b(str3), str2);
        if (str != null) {
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{m10253a(str, str3)});
        }
        return createChooser;
    }

    @TargetApi(22)
    /* renamed from: a */
    public static Intent m10255a(String str, String str2, String str3, IntentSender intentSender) {
        Intent createChooser = Intent.createChooser(m10262b(str3), str2, intentSender);
        if (str != null) {
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{m10253a(str, str3)});
        }
        return createChooser;
    }

    /* renamed from: a */
    public static boolean m10260a(Context context, Uri uri, Intent... intentArr) {
        Intent[] intentArr2;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        int i = 0;
        if (context.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return false;
        }
        if (intentArr.length == 0) {
            intentArr2 = new Intent[]{intent};
        } else {
            intentArr2 = new Intent[(intentArr.length + 1)];
            intentArr2[0] = intent;
            while (i < intentArr.length) {
                int i2 = i + 1;
                intentArr2[i2] = intentArr[i];
                i = i2;
            }
        }
        return m10261a(context, "", intentArr2);
    }

    /* renamed from: a */
    public static boolean m10259a(Context context, Uri uri, List<Intent> list, List<String> list2) {
        String str = "android.intent.action.VIEW";
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent(str, uri), 0);
        if (!queryIntentActivities.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Intent());
            arrayList.addAll(list);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (!list2.contains(resolveInfo.activityInfo.packageName)) {
                    Intent intent = new Intent(str, uri);
                    intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                    arrayList.add(intent);
                }
            }
            if (!arrayList.isEmpty()) {
                return m10261a(context, "", (Intent[]) arrayList.toArray(new Intent[arrayList.size()]));
            }
        }
        return false;
    }
}

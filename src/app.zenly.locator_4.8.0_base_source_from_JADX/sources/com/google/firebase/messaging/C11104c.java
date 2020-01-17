package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat.C0509b;
import androidx.core.app.NotificationCompat.C0511d;
import androidx.core.app.NotificationCompat.C0512e;
import androidx.core.content.C0540a;
import com.google.android.gms.common.util.C10174k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.c */
public final class C11104c {

    /* renamed from: d */
    private static final AtomicInteger f28788d = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a */
    private final Context f28789a;

    /* renamed from: b */
    private final String f28790b;

    /* renamed from: c */
    private Bundle f28791c;

    public C11104c(Context context, String str) {
        this.f28789a = context;
        this.f28790b = str;
    }

    /* renamed from: b */
    private final CharSequence m28595b(Bundle bundle) {
        String c = m28598c(bundle, "gcm.n.title");
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        try {
            return m28594b(0).loadLabel(this.f28789a.getPackageManager());
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.e("FirebaseMessaging", sb.toString());
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m28600c(Bundle bundle) {
        return "1".equals(m28591a(bundle, "gcm.n.e")) || m28591a(bundle, "gcm.n.icon") != null;
    }

    /* renamed from: d */
    public static String m28602d(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_key";
        return m28591a(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
    }

    /* renamed from: e */
    private final String m28604e(Bundle bundle, String str) {
        String d = m28602d(bundle, str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        Resources resources = this.f28789a.getResources();
        int identifier = resources.getIdentifier(d, "string", this.f28790b);
        String str2 = " Default value will be used.";
        String str3 = "FirebaseMessaging";
        if (identifier == 0) {
            String valueOf = String.valueOf(str);
            String str4 = "_loc_key";
            String substring = (str4.length() != 0 ? valueOf.concat(str4) : new String(valueOf)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 49 + String.valueOf(str).length());
            sb.append(substring);
            sb.append(" resource not found: ");
            sb.append(str);
            sb.append(str2);
            Log.w(str3, sb.toString());
            return null;
        }
        Object[] b = m28597b(bundle, str);
        if (b == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, b);
        } catch (MissingFormatArgumentException e) {
            String arrays = Arrays.toString(b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(str2);
            Log.w(str3, sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m28605f(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.e"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C11106e mo32350a(Bundle bundle) {
        Uri uri;
        Intent intent;
        PendingIntent pendingIntent;
        C0511d dVar = new C0511d(this.f28789a, m28599c(m28591a(bundle, "gcm.n.android_channel_id")));
        dVar.mo2994a(true);
        dVar.mo2998b(m28595b(bundle));
        String c = m28598c(bundle, "gcm.n.body");
        if (!TextUtils.isEmpty(c)) {
            dVar.mo2992a((CharSequence) c);
            C0509b bVar = new C0509b();
            bVar.mo2982a((CharSequence) c);
            dVar.mo2991a((C0512e) bVar);
        }
        dVar.mo3000c(m28588a(m28591a(bundle, "gcm.n.icon")));
        String d = m28601d(bundle);
        PendingIntent pendingIntent2 = null;
        if (TextUtils.isEmpty(d)) {
            uri = null;
        } else {
            if (!"default".equals(d)) {
                if (this.f28789a.getResources().getIdentifier(d, "raw", this.f28790b) != 0) {
                    String str = this.f28790b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(d).length());
                    sb.append("android.resource://");
                    sb.append(str);
                    sb.append("/raw/");
                    sb.append(d);
                    uri = Uri.parse(sb.toString());
                }
            }
            uri = RingtoneManager.getDefaultUri(2);
        }
        if (uri != null) {
            dVar.mo2990a(uri);
        }
        String a = m28591a(bundle, "gcm.n.click_action");
        if (!TextUtils.isEmpty(a)) {
            intent = new Intent(a);
            intent.setPackage(this.f28790b);
            intent.setFlags(268435456);
        } else {
            Uri e = m28603e(bundle);
            if (e != null) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.f28790b);
                intent.setData(e);
            } else {
                intent = this.f28789a.getPackageManager().getLaunchIntentForPackage(this.f28790b);
                if (intent == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (intent == null) {
            pendingIntent = null;
        } else {
            intent.addFlags(67108864);
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 != null && str2.startsWith("google.c.")) {
                    it.remove();
                }
            }
            intent.putExtras(bundle2);
            for (String str3 : bundle2.keySet()) {
                if (str3.startsWith("gcm.n.") || str3.startsWith("gcm.notification.")) {
                    intent.removeExtra(str3);
                }
            }
            pendingIntent = PendingIntent.getActivity(this.f28789a, f28788d.incrementAndGet(), intent, 1073741824);
            if (m28605f(bundle)) {
                Intent intent2 = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
                m28592a(intent2, bundle);
                intent2.putExtra("pending_intent", pendingIntent);
                pendingIntent = m28589a(f28788d.incrementAndGet(), intent2);
            }
        }
        dVar.mo2988a(pendingIntent);
        if (m28605f(bundle)) {
            Intent intent3 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
            m28592a(intent3, bundle);
            pendingIntent2 = m28589a(f28788d.incrementAndGet(), intent3);
        }
        if (pendingIntent2 != null) {
            dVar.mo2997b(pendingIntent2);
        }
        Integer b = m28596b(m28591a(bundle, "gcm.n.color"));
        if (b != null) {
            dVar.mo2985a(b.intValue());
        }
        String a2 = m28591a(bundle, "gcm.n.tag");
        if (TextUtils.isEmpty(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("FCM-Notification:");
            sb2.append(uptimeMillis);
            a2 = sb2.toString();
        }
        return new C11106e(dVar, a2, 0);
    }

    /* renamed from: d */
    public static String m28601d(Bundle bundle) {
        String a = m28591a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(a) ? m28591a(bundle, "gcm.n.sound") : a;
    }

    /* renamed from: c */
    private final String m28598c(Bundle bundle, String str) {
        String a = m28591a(bundle, str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return m28604e(bundle, str);
    }

    /* renamed from: b */
    public static Object[] m28597b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_args";
        String a = m28591a(bundle, str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(a);
            Object[] objArr = new String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return objArr;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(str);
            String substring = (str2.length() != 0 ? valueOf2.concat(str2) : new String(valueOf2)).substring(6);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 41 + String.valueOf(a).length());
            sb.append("Malformed ");
            sb.append(substring);
            sb.append(": ");
            sb.append(a);
            sb.append("  Default value will be used.");
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    @TargetApi(26)
    /* renamed from: c */
    private final String m28599c(String str) {
        if (!C10174k.m25686i()) {
            return null;
        }
        int i = 0;
        try {
            i = m28594b(i).targetSdkVersion;
        } catch (NameNotFoundException unused) {
        }
        if (i < 26) {
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) this.f28789a.getSystemService(NotificationManager.class);
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            if (notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
            sb.append("Notification Channel requested (");
            sb.append(str);
            sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            Log.w(str2, sb.toString());
        }
        String string = m28590a().getString("com.google.firebase.messaging.default_notification_channel_id");
        if (TextUtils.isEmpty(string)) {
            Log.w(str2, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
        } else if (notificationManager.getNotificationChannel(string) != null) {
            return string;
        } else {
            Log.w(str2, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
        }
        String str3 = "fcm_fallback_notification_channel";
        if (notificationManager.getNotificationChannel(str3) == null) {
            notificationManager.createNotificationChannel(new NotificationChannel(str3, this.f28789a.getString(this.f28789a.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", this.f28790b)), 3));
        }
        return str3;
    }

    /* renamed from: e */
    static Uri m28603e(Bundle bundle) {
        String a = m28591a(bundle, "gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = m28591a(bundle, "gcm.n.link");
        }
        if (!TextUtils.isEmpty(a)) {
            return Uri.parse(a);
        }
        return null;
    }

    /* renamed from: b */
    private final Integer m28596b(String str) {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
                sb.append("Color ");
                sb.append(str);
                sb.append(" not valid. Notification will use default color.");
                Log.w(str2, sb.toString());
            }
        }
        int i = m28590a().getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0540a.m2536a(this.f28789a, i));
            } catch (NotFoundException unused2) {
                Log.w(str2, "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* renamed from: b */
    private final ApplicationInfo m28594b(int i) throws NameNotFoundException {
        return this.f28789a.getPackageManager().getApplicationInfo(this.f28790b, i);
    }

    /* renamed from: a */
    public static String m28591a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    @TargetApi(26)
    /* renamed from: a */
    private final boolean m28593a(int i) {
        String str = "FirebaseMessaging";
        if (VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.f28789a.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e(str, sb.toString());
            return false;
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e(str, sb2.toString());
            return false;
        }
    }

    /* renamed from: a */
    private final int m28588a(String str) {
        String str2 = "FirebaseMessaging";
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.f28789a.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.f28790b);
            if (identifier != 0 && m28593a(identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str, "mipmap", this.f28790b);
            if (identifier2 != 0 && m28593a(identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("Icon resource ");
            sb.append(str);
            sb.append(" not found. Notification will use default icon.");
            Log.w(str2, sb.toString());
        }
        int i = m28590a().getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m28593a(i)) {
            try {
                i = m28594b(0).icon;
            } catch (NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w(str2, sb2.toString());
            }
        }
        if (i == 0 || !m28593a(i)) {
            i = 17301651;
        }
        return i;
    }

    /* renamed from: a */
    private final synchronized Bundle m28590a() {
        if (this.f28791c != null) {
            return this.f28791c;
        }
        try {
            ApplicationInfo b = m28594b(128);
            if (!(b == null || b.metaData == null)) {
                this.f28791c = b.metaData;
                return this.f28791c;
            }
        } catch (NameNotFoundException e) {
            String str = "FirebaseMessaging";
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w(str, sb.toString());
        }
        return Bundle.EMPTY;
    }

    /* renamed from: a */
    private static void m28592a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    /* renamed from: a */
    private final PendingIntent m28589a(int i, Intent intent) {
        return PendingIntent.getBroadcast(this.f28789a, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(this.f28789a, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }
}

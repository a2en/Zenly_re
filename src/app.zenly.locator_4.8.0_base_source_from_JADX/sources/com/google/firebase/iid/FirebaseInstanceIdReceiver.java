package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.C10174k;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    /* renamed from: c */
    private static C11064h0 f28668c;

    /* renamed from: d */
    private static C11064h0 f28669d;

    /* renamed from: a */
    private final void m28458a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String str3 = "gcm.rawData64";
        String stringExtra = intent.getStringExtra(str3);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(str3);
        }
        String str4 = "com.google.firebase.MESSAGING_EVENT";
        String str5 = "com.google.firebase.INSTANCE_ID_EVENT";
        if ("google.com/iid".equals(intent.getStringExtra("from")) || str5.equals(str)) {
            str2 = str5;
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || str4.equals(str)) {
            str2 = str4;
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        int i = -1;
        if (str2 != null) {
            i = m28456a(this, context, str2, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    /* renamed from: b */
    private static int m28459b(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        String str2 = "FirebaseInstanceId";
        if (Log.isLoggable(str2, 3)) {
            String str3 = "Binding to service: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m28457a(context, str).mo32286a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m28458a(context, intent2, intent.getAction());
            } else {
                m28458a(context, intent, intent.getAction());
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m28456a(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = true;
        boolean z2 = C10174k.m25686i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return m28459b(broadcastReceiver, context, str, intent);
        }
        int a = C11089u.m28535b().mo32311a(context, str, intent);
        if (!C10174k.m25686i() || a != 402) {
            return a;
        }
        m28459b(broadcastReceiver, context, str, intent);
        return 403;
    }

    /* renamed from: a */
    private static synchronized C11064h0 m28457a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f28669d == null) {
                    f28669d = new C11064h0(context, str);
                }
                C11064h0 h0Var = f28669d;
                return h0Var;
            }
            if (f28668c == null) {
                f28668c = new C11064h0(context, str);
            }
            C11064h0 h0Var2 = f28668c;
            return h0Var2;
        }
    }
}

package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

@Deprecated
public class InstanceIDListenerService extends zze {
    /* renamed from: a */
    static void m25845a(Context context, C10231g gVar) {
        gVar.mo27740b();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public void mo27730a() {
    }

    public void handleIntent(Intent intent) {
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            Bundle bundle = null;
            String str = "subtype";
            String stringExtra = intent.getStringExtra(str);
            if (stringExtra != null) {
                bundle = new Bundle();
                bundle.putString(str, stringExtra);
            }
            C10225a a = C10225a.m25849a(this, bundle);
            String stringExtra2 = intent.getStringExtra("CMD");
            String str2 = "InstanceID";
            if (Log.isLoggable(str2, 3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 34 + String.valueOf(stringExtra2).length());
                sb.append("Service command. subtype:");
                sb.append(stringExtra);
                sb.append(" command:");
                sb.append(stringExtra2);
                Log.d(str2, sb.toString());
            }
            if ("RST".equals(stringExtra2)) {
                a.mo27735a();
                mo27730a();
                return;
            }
            if ("RST_FULL".equals(stringExtra2)) {
                if (!C10225a.m25850b().mo27739a()) {
                    C10225a.m25850b().mo27740b();
                    mo27730a();
                }
            } else if ("SYNC".equals(stringExtra2)) {
                C10231g b = C10225a.m25850b();
                String valueOf = String.valueOf(stringExtra);
                String str3 = "|T|";
                b.mo27738a(str3.length() != 0 ? valueOf.concat(str3) : new String(valueOf));
                String valueOf2 = String.valueOf(stringExtra);
                String str4 = "|T-timestamp|";
                b.mo27738a(str4.length() != 0 ? valueOf2.concat(str4) : new String(valueOf2));
                mo27730a();
            }
        }
    }
}

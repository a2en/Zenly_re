package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.iid.zze;
import com.google.android.gms.internal.gcm.C10474g;
import com.google.android.gms.internal.gcm.zzl;
import java.util.Iterator;
import java.util.List;

@Deprecated
public class GcmListenerService extends zze {

    /* renamed from: j */
    private zzl f26765j = C10474g.f27387a;

    /* renamed from: a */
    static void m25732a(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void mo27664a() {
    }

    /* renamed from: a */
    public void mo27665a(String str) {
    }

    /* renamed from: a */
    public void mo27666a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo27667a(String str, String str2) {
    }

    public void handleIntent(Intent intent) {
        String str = "GcmListenerService";
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            String str2 = "Unknown intent action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        String str3 = "message_type";
        String stringExtra = intent.getStringExtra(str3);
        String str4 = "gcm";
        if (stringExtra == null) {
            stringExtra = str4;
        }
        char c = 65535;
        boolean z = false;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 1;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(str4)) {
                    c = 0;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 3;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            Bundle extras = intent.getExtras();
            extras.remove(str3);
            extras.remove("androidx.contentpager.content.wakelockid");
            String str5 = "gcm.n.e";
            if ("1".equals(C10214e.m25831a(extras, str5)) || C10214e.m25831a(extras, "gcm.n.icon") != null) {
                if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                    int myPid = Process.myPid();
                    List runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator it = runningAppProcesses.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                RunningAppProcessInfo runningAppProcessInfo = (RunningAppProcessInfo) it.next();
                                if (runningAppProcessInfo.pid == myPid) {
                                    if (runningAppProcessInfo.importance == 100) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    C10214e.m25830a((Context) this).mo27711a(extras);
                    return;
                }
                Bundle bundle = new Bundle();
                Iterator it2 = extras.keySet().iterator();
                while (it2.hasNext()) {
                    String str6 = (String) it2.next();
                    String string = extras.getString(str6);
                    String str7 = "gcm.notification.";
                    String str8 = "gcm.n.";
                    if (str6.startsWith(str7)) {
                        str6 = str6.replace(str7, str8);
                    }
                    if (str6.startsWith(str8)) {
                        if (!str5.equals(str6)) {
                            bundle.putString(str6.substring(6), string);
                        }
                        it2.remove();
                    }
                }
                String str9 = "sound2";
                String string2 = bundle.getString(str9);
                if (string2 != null) {
                    bundle.remove(str9);
                    bundle.putString("sound", string2);
                }
                if (!bundle.isEmpty()) {
                    extras.putBundle("notification", bundle);
                }
            }
            String str10 = "from";
            String string3 = extras.getString(str10);
            extras.remove(str10);
            m25732a(extras);
            this.f26765j.zzl("onMessageReceived");
            mo27666a(string3, extras);
        } else if (c != 1) {
            String str11 = "google.message_id";
            if (c == 2) {
                mo27665a(intent.getStringExtra(str11));
            } else if (c != 3) {
                String str12 = "Received message with unknown type: ";
                String valueOf2 = String.valueOf(stringExtra);
                Log.w(str, valueOf2.length() != 0 ? str12.concat(valueOf2) : new String(str12));
            } else {
                String stringExtra2 = intent.getStringExtra(str11);
                if (stringExtra2 == null) {
                    stringExtra2 = intent.getStringExtra("message_id");
                }
                mo27667a(stringExtra2, intent.getStringExtra("error"));
            }
        } else {
            mo27664a();
        }
    }

    public void onCreate() {
        super.onCreate();
        C10474g.m26857a();
        Class<GcmListenerService> cls = GcmListenerService.class;
        this.f26765j = C10474g.f27387a;
    }
}

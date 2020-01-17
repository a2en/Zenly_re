package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import androidx.core.content.C0540a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p214e.p228e.C7571a;

/* renamed from: com.google.firebase.iid.x */
final class C11095x {

    /* renamed from: a */
    private final SharedPreferences f28774a;

    /* renamed from: b */
    private final Context f28775b;

    /* renamed from: c */
    private final C11092v0 f28776c;

    /* renamed from: d */
    private final Map<String, C11051b> f28777d;

    public C11095x(Context context) {
        this(context, new C11092v0());
    }

    /* renamed from: c */
    private final synchronized boolean m28565c() {
        return this.f28774a.getAll().isEmpty();
    }

    /* renamed from: a */
    public final synchronized String mo32321a() {
        return this.f28774a.getString("topic_operaion_queue", "");
    }

    /* renamed from: b */
    public final synchronized void mo32325b() {
        this.f28777d.clear();
        C11092v0.m28547a(this.f28775b);
        this.f28774a.edit().clear().commit();
    }

    private C11095x(Context context, C11092v0 v0Var) {
        String str = "FirebaseInstanceId";
        this.f28777d = new C7571a();
        this.f28775b = context;
        this.f28774a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f28776c = v0Var;
        File file = new File(C0540a.m2544b(this.f28775b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m28565c()) {
                    Log.i(str, "App restored, clearing state");
                    mo32325b();
                    FirebaseInstanceId.getInstance().zzn();
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    /* renamed from: c */
    private static String m28564c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized void mo32322a(String str) {
        this.f28774a.edit().putString("topic_operaion_queue", str).apply();
    }

    /* renamed from: c */
    public final synchronized void mo32327c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f28774a.edit();
        for (String str2 : this.f28774a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: a */
    static String m28563a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized C11093w mo32320a(String str, String str2, String str3) {
        return C11093w.m28561b(this.f28774a.getString(m28564c(str, str2, str3), null));
    }

    /* renamed from: b */
    public final synchronized void mo32326b(String str, String str2, String str3) {
        String c = m28564c(str, str2, str3);
        Editor edit = this.f28774a.edit();
        edit.remove(c);
        edit.commit();
    }

    /* renamed from: a */
    public final synchronized void mo32323a(String str, String str2, String str3, String str4, String str5) {
        String a = C11093w.m28560a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f28774a.edit();
            edit.putString(m28564c(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: b */
    public final synchronized C11051b mo32324b(String str) {
        C11051b bVar;
        C11051b bVar2 = (C11051b) this.f28777d.get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        try {
            bVar = this.f28776c.mo32317a(this.f28775b, str);
        } catch (C11096x0 unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.getInstance().zzn();
            bVar = this.f28776c.mo32318b(this.f28775b, str);
        }
        this.f28777d.put(str, bVar);
        return bVar;
    }
}

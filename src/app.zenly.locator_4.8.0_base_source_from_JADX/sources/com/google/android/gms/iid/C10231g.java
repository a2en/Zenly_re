package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import androidx.core.content.C0540a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p214e.p228e.C7571a;

/* renamed from: com.google.android.gms.iid.g */
public final class C10231g {

    /* renamed from: a */
    private SharedPreferences f26836a;

    /* renamed from: b */
    private Context f26837b;

    /* renamed from: c */
    private final Map<String, Object> f26838c;

    public C10231g(Context context) {
        this(context, new C10239o());
    }

    /* renamed from: a */
    public final boolean mo27739a() {
        return this.f26836a.getAll().isEmpty();
    }

    /* renamed from: b */
    public final synchronized void mo27740b() {
        this.f26838c.clear();
        C10239o.m25868a(this.f26837b);
        this.f26836a.edit().clear().commit();
    }

    private C10231g(Context context, C10239o oVar) {
        String str = "InstanceID/Store";
        this.f26838c = new C7571a();
        this.f26837b = context;
        this.f26836a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(C0540a.m2544b(this.f26837b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo27739a()) {
                    Log.i(str, "App restored, clearing state");
                    InstanceIDListenerService.m25845a(this.f26837b, this);
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

    /* renamed from: a */
    public final synchronized void mo27738a(String str) {
        Editor edit = this.f26836a.edit();
        for (String str2 : this.f26836a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27741b(String str) {
        synchronized (this) {
            this.f26838c.remove(str);
        }
        C10239o.m25869a(this.f26837b, str);
        mo27738a(String.valueOf(str).concat("|"));
    }
}

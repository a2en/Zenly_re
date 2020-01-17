package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p214e.p228e.C7571a;

@Deprecated
/* renamed from: com.google.android.gms.iid.a */
public class C10225a {

    /* renamed from: b */
    private static Map<String, C10225a> f26830b = new C7571a();

    /* renamed from: c */
    private static C10231g f26831c;

    /* renamed from: a */
    private String f26832a = "";

    static {
        C10230f.m25856a().mo27736a("gcm_check_for_different_iid_in_token", true);
        TimeUnit.DAYS.toMillis(7);
    }

    private C10225a(Context context, String str) {
        context.getApplicationContext();
        this.f26832a = str;
    }

    /* renamed from: a */
    static int m25848a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static C10231g m25850b() {
        return f26831c;
    }

    /* renamed from: a */
    public static synchronized C10225a m25849a(Context context, Bundle bundle) {
        C10225a aVar;
        synchronized (C10225a.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (f26831c == null) {
                String packageName = applicationContext.getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 73);
                sb.append("Instance ID SDK is deprecated, ");
                sb.append(packageName);
                sb.append(" should update to use Firebase Instance ID");
                Log.w("InstanceID", sb.toString());
                f26831c = new C10231g(applicationContext);
                new C10229e(applicationContext);
            }
            Integer.toString(m25848a(applicationContext));
            aVar = (C10225a) f26830b.get(string);
            if (aVar == null) {
                aVar = new C10225a(applicationContext, string);
                f26830b.put(string, aVar);
            }
        }
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27735a() {
        f26831c.mo27741b(this.f26832a);
    }
}

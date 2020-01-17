package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.util.C10167d;
import com.google.android.gms.internal.gcm.C10477j;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p214e.p228e.C7571a;

/* renamed from: com.google.android.gms.gcm.a */
public class C10210a {

    /* renamed from: c */
    private static C10210a f26810c;

    /* renamed from: a */
    private final Context f26811a;

    /* renamed from: b */
    private final Map<String, Map<String, Boolean>> f26812b = new C7571a();

    private C10210a(Context context) {
        this.f26811a = context;
    }

    /* renamed from: a */
    public static C10210a m25815a(Context context) {
        C10210a aVar;
        synchronized (C10210a.class) {
            if (f26810c == null) {
                f26810c = new C10210a(context.getApplicationContext());
            }
            aVar = f26810c;
        }
        return aVar;
    }

    /* renamed from: b */
    static void m25818b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (100 < str.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    /* renamed from: c */
    private final boolean m25819c(String str) {
        List<ResolveInfo> list;
        Intent intent;
        C10123l.m25506a(str, (Object) "GcmTaskService must not be null.");
        PackageManager packageManager = this.f26811a.getPackageManager();
        if (packageManager == null) {
            list = Collections.emptyList();
        } else {
            String str2 = "com.google.android.gms.gcm.ACTION_TASK_READY";
            if (str != null) {
                intent = new Intent(str2).setClassName(this.f26811a, str);
            } else {
                intent = new Intent(str2).setPackage(this.f26811a.getPackageName());
            }
            list = packageManager.queryIntentServices(intent, 0);
        }
        if (C10167d.m25661a(list)) {
            Log.e("GcmNetworkManager", String.valueOf(str).concat(" is not available. This may cause the task to be lost."));
            return true;
        }
        for (ResolveInfo resolveInfo : list) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 118);
        sb.append("The GcmTaskService class you provided ");
        sb.append(str);
        sb.append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo27707b(String str, String str2) {
        Map map = (Map) this.f26812b.get(str2);
        if (map != null) {
            if ((map.remove(str) != null) && map.isEmpty()) {
                this.f26812b.remove(str2);
            }
        }
    }

    /* renamed from: a */
    private final C10222m m25816a() {
        if (C10211b.m25826a(this.f26811a) >= 5000000) {
            return new C10221l(this.f26811a);
        }
        Log.e("GcmNetworkManager", "Google Play services is not available, dropping all GcmNetworkManager requests");
        return new C10223n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        m25817a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo27703a(com.google.android.gms.gcm.Task r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.gcm.o r0 = new com.google.android.gms.gcm.o     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "nts:client:schedule:"
            java.lang.String r2 = r5.mo27701b()     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0063 }
            int r3 = r2.length()     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x0018
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x001e
        L_0x0018:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0063 }
            r2.<init>(r1)     // Catch:{ all -> 0x0063 }
            r1 = r2
        L_0x001e:
            r0.<init>(r1)     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = r5.mo27700a()     // Catch:{ all -> 0x005c }
            r4.m25819c(r1)     // Catch:{ all -> 0x005c }
            com.google.android.gms.gcm.m r1 = r4.m25816a()     // Catch:{ all -> 0x005c }
            boolean r1 = r1.mo27728a(r5)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r1 = r4.f26812b     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r5.mo27700a()     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x005c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0056
            java.lang.String r2 = r5.mo27701b()     // Catch:{ all -> 0x005c }
            boolean r2 = r1.containsKey(r2)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0056
            java.lang.String r5 = r5.mo27701b()     // Catch:{ all -> 0x005c }
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x005c }
            r1.put(r5, r2)     // Catch:{ all -> 0x005c }
        L_0x0056:
            r5 = 0
            m25817a(r5, r0)     // Catch:{ all -> 0x0063 }
            monitor-exit(r4)
            return
        L_0x005c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            m25817a(r5, r0)     // Catch:{ all -> 0x0063 }
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.C10210a.mo27703a(com.google.android.gms.gcm.Task):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized boolean mo27708c(String str, String str2) {
        Map map = (Map) this.f26812b.get(str2);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        m25817a(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27704a(java.lang.String r5, java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService> r6) {
        /*
            r4 = this;
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r4.f26811a
            r0.<init>(r1, r6)
            com.google.android.gms.gcm.o r6 = new com.google.android.gms.gcm.o
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r2 = r1.length()
            java.lang.String r3 = "nts:client:cancel:"
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = r3.concat(r1)
            goto L_0x001f
        L_0x001a:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x001f:
            r6.<init>(r1)
            m25818b(r5)     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ all -> 0x0038 }
            r4.m25819c(r1)     // Catch:{ all -> 0x0038 }
            com.google.android.gms.gcm.m r1 = r4.m25816a()     // Catch:{ all -> 0x0038 }
            r1.mo27727a(r0, r5)     // Catch:{ all -> 0x0038 }
            r5 = 0
            m25817a(r5, r6)
            return
        L_0x0038:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            m25817a(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.C10210a.mo27704a(java.lang.String, java.lang.Class):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo27706a(String str, String str2) {
        Map map = (Map) this.f26812b.get(str2);
        if (map == null) {
            map = new C7571a();
            this.f26812b.put(str2, map);
        }
        if (map.put(str, Boolean.valueOf(false)) == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo27705a(String str) {
        return this.f26812b.containsKey(str);
    }

    /* renamed from: a */
    private static /* synthetic */ void m25817a(Throwable th, C10224o oVar) {
        if (th != null) {
            try {
                oVar.close();
            } catch (Throwable th2) {
                C10477j.m26859a(th, th2);
            }
        } else {
            oVar.close();
        }
    }
}

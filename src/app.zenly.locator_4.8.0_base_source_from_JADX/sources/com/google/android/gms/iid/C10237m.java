package com.google.android.gms.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.p310o.C10178a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.android.gms.iid.m */
public final class C10237m implements ServiceConnection {

    /* renamed from: a */
    private final Context f26851a;

    /* renamed from: b */
    private final Intent f26852b;

    /* renamed from: c */
    private final ScheduledExecutorService f26853c;

    /* renamed from: d */
    private final Queue<C10233i> f26854d;

    /* renamed from: e */
    private C10235k f26855e;

    /* renamed from: f */
    private boolean f26856f;

    public C10237m(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C10178a("EnhancedIntentService")));
    }

    /* renamed from: b */
    private final void m25866b() {
        while (!this.f26854d.isEmpty()) {
            ((C10233i) this.f26854d.poll()).mo27743a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo27747a(Intent intent, PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f26854d.add(new C10233i(intent, pendingResult, this.f26853c));
        m25865a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f26856f = false;
            this.f26855e = (C10235k) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            if (iBinder == null) {
                Log.e("EnhancedIntentService", "Null service connection");
                m25866b();
            } else {
                m25865a();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String str = "EnhancedIntentService";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d(str, sb.toString());
        }
        m25865a();
    }

    private C10237m(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f26854d = new ArrayDeque();
        this.f26856f = false;
        this.f26851a = context.getApplicationContext();
        this.f26852b = new Intent(str).setPackage(this.f26851a.getPackageName());
        this.f26853c = scheduledExecutorService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m25865a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0011:
            java.util.Queue<com.google.android.gms.iid.i> r0 = r6.f26854d     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0028:
            com.google.android.gms.iid.k r0 = r6.f26855e     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            com.google.android.gms.iid.k r0 = r6.f26855e     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0043:
            java.util.Queue<com.google.android.gms.iid.i> r0 = r6.f26854d     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.iid.i r0 = (com.google.android.gms.iid.C10233i) r0     // Catch:{ all -> 0x00ab }
            com.google.android.gms.iid.k r2 = r6.f26855e     // Catch:{ all -> 0x00ab }
            r2.mo27745a(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "EnhancedIntentService"
            boolean r3 = r6.f26856f     // Catch:{ all -> 0x00ab }
            if (r3 != 0) goto L_0x0063
            r3 = 1
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r5.<init>(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00ab }
            r5.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00ab }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ab }
        L_0x007a:
            boolean r0 = r6.f26856f     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a7
            r6.f26856f = r2     // Catch:{ all -> 0x00ab }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C10162a.m25644a()     // Catch:{ SecurityException -> 0x009a }
            android.content.Context r2 = r6.f26851a     // Catch:{ SecurityException -> 0x009a }
            android.content.Intent r3 = r6.f26852b     // Catch:{ SecurityException -> 0x009a }
            r4 = 65
            boolean r0 = r0.mo27588a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x009a }
            if (r0 == 0) goto L_0x0092
            monitor-exit(r6)
            return
        L_0x0092:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x009a }
            goto L_0x00a2
        L_0x009a:
            r0 = move-exception
            java.lang.String r2 = "EnhancedIntentService"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00ab }
        L_0x00a2:
            r6.f26856f = r1     // Catch:{ all -> 0x00ab }
            r6.m25866b()     // Catch:{ all -> 0x00ab }
        L_0x00a7:
            monitor-exit(r6)
            return
        L_0x00a9:
            monitor-exit(r6)
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.C10237m.m25865a():void");
    }
}

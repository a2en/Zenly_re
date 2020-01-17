package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import p214e.p228e.C7584g;

/* renamed from: com.google.firebase.iid.u */
public final class C11089u {

    /* renamed from: f */
    private static C11089u f28760f;

    /* renamed from: a */
    private final C7584g<String, String> f28761a = new C7584g<>();

    /* renamed from: b */
    private Boolean f28762b = null;

    /* renamed from: c */
    private Boolean f28763c = null;

    /* renamed from: d */
    final Queue<Intent> f28764d = new ArrayDeque();

    /* renamed from: e */
    private final Queue<Intent> f28765e = new ArrayDeque();

    private C11089u() {
    }

    /* renamed from: a */
    public static void m28533a(Context context, Intent intent) {
        context.sendBroadcast(m28534b(context, "com.google.firebase.INSTANCE_ID_EVENT", intent));
    }

    /* renamed from: b */
    public static synchronized C11089u m28535b() {
        C11089u uVar;
        synchronized (C11089u.class) {
            if (f28760f == null) {
                f28760f = new C11089u();
            }
            uVar = f28760f;
        }
        return uVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc A[Catch:{ SecurityException -> 0x0122, IllegalStateException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e1 A[Catch:{ SecurityException -> 0x0122, IllegalStateException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee A[Catch:{ SecurityException -> 0x0122, IllegalStateException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m28537c(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            e.e.g<java.lang.String, java.lang.String> r0 = r4.f28761a
            monitor-enter(r0)
            e.e.g<java.lang.String, java.lang.String> r1 = r4.f28761a     // Catch:{ all -> 0x012d }
            java.lang.String r2 = r6.getAction()     // Catch:{ all -> 0x012d }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x012d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x012d }
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            if (r1 != 0) goto L_0x00aa
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r1 = 0
            android.content.pm.ResolveInfo r0 = r0.resolveService(r6, r1)
            if (r0 == 0) goto L_0x00a2
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            if (r0 != 0) goto L_0x0023
            goto L_0x00a2
        L_0x0023:
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r2 = r0.packageName
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r0.name
            if (r1 != 0) goto L_0x0034
            goto L_0x006c
        L_0x0034:
            java.lang.String r0 = r0.name
            java.lang.String r1 = "."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0055
            java.lang.String r0 = r1.concat(r0)
            goto L_0x005a
        L_0x0055:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x005a:
            r1 = r0
            e.e.g<java.lang.String, java.lang.String> r2 = r4.f28761a
            monitor-enter(r2)
            e.e.g<java.lang.String, java.lang.String> r0 = r4.f28761a     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = r6.getAction()     // Catch:{ all -> 0x0069 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x00aa
        L_0x0069:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            throw r5
        L_0x006c:
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = r0.name
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r2 = r2 + 94
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "/"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "FirebaseInstanceId"
            android.util.Log.e(r1, r0)
            goto L_0x00d6
        L_0x00a2:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r0, r1)
            goto L_0x00d6
        L_0x00aa:
            r0 = 3
            java.lang.String r2 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = "Restricting intent to a specific service: "
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00c4
            java.lang.String r0 = r0.concat(r2)
            goto L_0x00ca
        L_0x00c4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x00ca:
            java.lang.String r2 = "FirebaseInstanceId"
            android.util.Log.d(r2, r0)
        L_0x00cf:
            java.lang.String r0 = r5.getPackageName()
            r6.setClassName(r0, r1)
        L_0x00d6:
            boolean r0 = r4.mo32313a(r5)     // Catch:{ SecurityException -> 0x0122, IllegalStateException -> 0x00fa }
            if (r0 == 0) goto L_0x00e1
            android.content.ComponentName r5 = androidx.legacy.content.WakefulBroadcastReceiver.m3974a(r5, r6)     // Catch:{ SecurityException -> 0x0122, IllegalStateException -> 0x00fa }
            goto L_0x00ec
        L_0x00e1:
            android.content.ComponentName r5 = r5.startService(r6)     // Catch:{ SecurityException -> 0x0122, IllegalStateException -> 0x00fa }
            java.lang.String r6 = "FirebaseInstanceId"
            java.lang.String r0 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r6, r0)     // Catch:{ SecurityException -> 0x0122, IllegalStateException -> 0x00fa }
        L_0x00ec:
            if (r5 != 0) goto L_0x00f8
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r6 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r5, r6)     // Catch:{ SecurityException -> 0x0122, IllegalStateException -> 0x00fa }
            r5 = 404(0x194, float:5.66E-43)
            return r5
        L_0x00f8:
            r5 = -1
            return r5
        L_0x00fa:
            r5 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.String r6 = "Failed to start service while in background: "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "FirebaseInstanceId"
            android.util.Log.e(r6, r5)
            r5 = 402(0x192, float:5.63E-43)
            return r5
        L_0x0122:
            r5 = move-exception
            java.lang.String r6 = "FirebaseInstanceId"
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r6, r0, r5)
            r5 = 401(0x191, float:5.62E-43)
            return r5
        L_0x012d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C11089u.m28537c(android.content.Context, android.content.Intent):int");
    }

    /* renamed from: a */
    public final Intent mo32312a() {
        return (Intent) this.f28765e.poll();
    }

    /* renamed from: a */
    public final int mo32311a(Context context, String str, Intent intent) {
        String str2 = "FirebaseInstanceId";
        if (Log.isLoggable(str2, 3)) {
            String str3 = "Starting service: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                c = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            c = 0;
        }
        if (c == 0) {
            this.f28764d.offer(intent);
        } else if (c != 1) {
            String str4 = "Unknown service action: ";
            String valueOf2 = String.valueOf(str);
            Log.w(str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
            return 500;
        } else {
            this.f28765e.offer(intent);
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return m28537c(context, intent2);
    }

    /* renamed from: b */
    public static void m28536b(Context context, Intent intent) {
        context.sendBroadcast(m28534b(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    /* renamed from: b */
    private static Intent m28534b(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo32314b(Context context) {
        if (this.f28763c == null) {
            this.f28763c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f28762b.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.f28763c.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32313a(Context context) {
        if (this.f28762b == null) {
            this.f28762b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f28762b.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.f28762b.booleanValue();
    }
}

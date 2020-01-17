package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import java.io.IOException;
import java.util.Map;
import p214e.p228e.C7571a;

/* renamed from: com.google.firebase.iid.b0 */
final class C11052b0 {

    /* renamed from: a */
    private int f28676a = 0;

    /* renamed from: b */
    private final Map<Integer, C10694d<Void>> f28677b = new C7571a();

    /* renamed from: c */
    private final C11095x f28678c;

    C11052b0(C11095x xVar) {
        this.f28678c = xVar;
    }

    /* renamed from: b */
    private final String m28469b() {
        String a;
        synchronized (this.f28678c) {
            a = this.f28678c.mo32321a();
        }
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C10693c<Void> mo32266a(String str) {
        String a;
        C10694d dVar;
        int i;
        synchronized (this.f28678c) {
            a = this.f28678c.mo32321a();
            C11095x xVar = this.f28678c;
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(str).length());
            sb.append(a);
            sb.append(",");
            sb.append(str);
            xVar.mo32322a(sb.toString());
        }
        dVar = new C10694d();
        Map<Integer, C10694d<Void>> map = this.f28677b;
        if (TextUtils.isEmpty(a)) {
            i = 0;
        } else {
            i = a.split(",").length - 1;
        }
        map.put(Integer.valueOf(this.f28676a + i), dVar);
        return dVar.mo29325a();
    }

    /* renamed from: b */
    private final synchronized boolean m28470b(String str) {
        synchronized (this.f28678c) {
            String a = this.f28678c.mo32321a();
            String str2 = ",";
            String valueOf = String.valueOf(str);
            if (!a.startsWith(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2))) {
                return false;
            }
            String str3 = ",";
            String valueOf2 = String.valueOf(str);
            this.f28678c.mo32322a(a.substring((valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3)).length()));
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo32267a() {
        return m28469b() != null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (m28468a(r5, r0) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = (com.google.android.gms.tasks.C10694d) r4.f28677b.remove(java.lang.Integer.valueOf(r4.f28676a));
        m28470b(r0);
        r4.f28676a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r2.mo29327a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32268a(com.google.firebase.iid.FirebaseInstanceId r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.m28469b()     // Catch:{ all -> 0x0042 }
            r1 = 1
            if (r0 != 0) goto L_0x0017
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.zzm()     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0015
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0042 }
        L_0x0015:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            return r1
        L_0x0017:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            boolean r2 = m28468a(r5, r0)
            if (r2 != 0) goto L_0x0020
            r5 = 0
            return r5
        L_0x0020:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.google.android.gms.tasks.d<java.lang.Void>> r2 = r4.f28677b     // Catch:{ all -> 0x003f }
            int r3 = r4.f28676a     // Catch:{ all -> 0x003f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x003f }
            com.google.android.gms.tasks.d r2 = (com.google.android.gms.tasks.C10694d) r2     // Catch:{ all -> 0x003f }
            r4.m28470b(r0)     // Catch:{ all -> 0x003f }
            int r0 = r4.f28676a     // Catch:{ all -> 0x003f }
            int r0 = r0 + r1
            r4.f28676a = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.mo29327a(r0)
            goto L_0x0000
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            throw r5
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C11052b0.mo32268a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    /* renamed from: a */
    private static boolean m28468a(FirebaseInstanceId firebaseInstanceId, String str) {
        String str2 = "FirebaseInstanceId";
        String[] split = str.split("!");
        if (split.length == 2) {
            String str3 = split[0];
            String str4 = split[1];
            char c = 65535;
            try {
                int hashCode = str3.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str3.equals("U")) {
                            c = 1;
                        }
                    }
                } else if (str3.equals("S")) {
                    c = 0;
                }
                if (c == 0) {
                    firebaseInstanceId.zzb(str4);
                    if (FirebaseInstanceId.zzm()) {
                        Log.d(str2, "subscribe operation succeeded");
                    }
                } else if (c == 1) {
                    firebaseInstanceId.zzc(str4);
                    if (FirebaseInstanceId.zzm()) {
                        Log.d(str2, "unsubscribe operation succeeded");
                    }
                }
            } catch (IOException e) {
                String str5 = "Topic sync failed: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str2, valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
                return false;
            }
        }
        return true;
    }
}

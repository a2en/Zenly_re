package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.C10697f;
import com.google.firebase.iid.zzm.C11099a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p214e.p228e.C7584g;

/* renamed from: com.google.firebase.iid.s */
final class C11085s {

    /* renamed from: g */
    private static int f28751g;

    /* renamed from: h */
    private static PendingIntent f28752h;

    /* renamed from: a */
    private final C7584g<String, C10694d<Bundle>> f28753a = new C7584g<>();

    /* renamed from: b */
    private final Context f28754b;

    /* renamed from: c */
    private final C11073m f28755c;

    /* renamed from: d */
    private Messenger f28756d;

    /* renamed from: e */
    private Messenger f28757e;

    /* renamed from: f */
    private zzm f28758f;

    public C11085s(Context context, C11073m mVar) {
        this.f28754b = context;
        this.f28755c = mVar;
        this.f28756d = new Messenger(new C11091v(this, Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m28526a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C11099a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzm) {
                        this.f28758f = (zzm) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f28757e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str = "Unexpected response action: ";
                        String valueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("FirebaseInstanceId", sb.toString());
                    } else {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str2 = "Received InstanceID error ";
                            String valueOf3 = String.valueOf(stringExtra2);
                            Log.d("FirebaseInstanceId", valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2) {
                                if ("ID".equals(split[1])) {
                                    String str3 = split[2];
                                    String str4 = split[3];
                                    if (str4.startsWith(":")) {
                                        str4 = str4.substring(1);
                                    }
                                    m28528a(str3, intent2.putExtra("error", str4).getExtras());
                                }
                            }
                            String str5 = "Unexpected structured response ";
                            String valueOf4 = String.valueOf(stringExtra2);
                            Log.w("FirebaseInstanceId", valueOf4.length() != 0 ? str5.concat(valueOf4) : new String(str5));
                        } else {
                            synchronized (this.f28753a) {
                                for (int i = 0; i < this.f28753a.size(); i++) {
                                    m28528a((String) this.f28753a.mo19595b(i), intent2.getExtras());
                                }
                            }
                        }
                    }
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str6 = "Unexpected response string: ";
                        String valueOf5 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? str6.concat(valueOf5) : new String(str6));
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                m28528a(group, extras);
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    /* renamed from: b */
    private final Bundle m28529b(Bundle bundle) throws IOException {
        Bundle c = m28530c(bundle);
        if (c == null) {
            return c;
        }
        String str = "google.messenger";
        if (!c.containsKey(str)) {
            return c;
        }
        Bundle c2 = m28530c(bundle);
        if (c2 == null || !c2.containsKey(str)) {
            return c2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m28530c(android.os.Bundle r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = m28524a()
            com.google.android.gms.tasks.d r1 = new com.google.android.gms.tasks.d
            r1.<init>()
            e.e.g<java.lang.String, com.google.android.gms.tasks.d<android.os.Bundle>> r2 = r7.f28753a
            monitor-enter(r2)
            e.e.g<java.lang.String, com.google.android.gms.tasks.d<android.os.Bundle>> r3 = r7.f28753a     // Catch:{ all -> 0x0126 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0126 }
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            com.google.firebase.iid.m r2 = r7.f28755c
            int r2 = r2.mo32301a()
            if (r2 == 0) goto L_0x011e
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.m r3 = r7.f28755c
            int r3 = r3.mo32301a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r8)
            android.content.Context r8 = r7.f28754b
            m28525a(r8, r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            java.lang.String r8 = "|ID|"
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = "|"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x0096
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.d(r5, r3)
        L_0x0096:
            android.os.Messenger r3 = r7.f28756d
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.f28757e
            if (r3 != 0) goto L_0x00a5
            com.google.firebase.iid.zzm r3 = r7.f28758f
            if (r3 == 0) goto L_0x00cb
        L_0x00a5:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.f28757e     // Catch:{ RemoteException -> 0x00bb }
            if (r5 == 0) goto L_0x00b5
            android.os.Messenger r5 = r7.f28757e     // Catch:{ RemoteException -> 0x00bb }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00de
        L_0x00b5:
            com.google.firebase.iid.zzm r5 = r7.f28758f     // Catch:{ RemoteException -> 0x00bb }
            r5.mo32337a(r3)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x00de
        L_0x00bb:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r3, r8)
            if (r8 == 0) goto L_0x00cb
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r8, r3)
        L_0x00cb:
            com.google.firebase.iid.m r8 = r7.f28755c
            int r8 = r8.mo32301a()
            if (r8 != r4) goto L_0x00d9
            android.content.Context r8 = r7.f28754b
            r8.sendBroadcast(r2)
            goto L_0x00de
        L_0x00d9:
            android.content.Context r8 = r7.f28754b
            r8.startService(r2)
        L_0x00de:
            com.google.android.gms.tasks.c r8 = r1.mo29325a()     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            java.lang.Object r8 = com.google.android.gms.tasks.C10697f.m27264a(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x0102, ExecutionException -> 0x00fb }
            e.e.g<java.lang.String, com.google.android.gms.tasks.d<android.os.Bundle>> r1 = r7.f28753a
            monitor-enter(r1)
            e.e.g<java.lang.String, com.google.android.gms.tasks.d<android.os.Bundle>> r2 = r7.f28753a     // Catch:{ all -> 0x00f6 }
            r2.remove(r0)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            return r8
        L_0x00f6:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            throw r8
        L_0x00f9:
            r8 = move-exception
            goto L_0x0111
        L_0x00fb:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            r1.<init>(r8)     // Catch:{ all -> 0x00f9 }
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x0102:
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00f9 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00f9 }
            throw r8     // Catch:{ all -> 0x00f9 }
        L_0x0111:
            e.e.g<java.lang.String, com.google.android.gms.tasks.d<android.os.Bundle>> r1 = r7.f28753a
            monitor-enter(r1)
            e.e.g<java.lang.String, com.google.android.gms.tasks.d<android.os.Bundle>> r2 = r7.f28753a     // Catch:{ all -> 0x011b }
            r2.remove(r0)     // Catch:{ all -> 0x011b }
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r8
        L_0x011b:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011b }
            throw r8
        L_0x011e:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0126:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0126 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C11085s.m28530c(android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: a */
    private static synchronized void m28525a(Context context, Intent intent) {
        synchronized (C11085s.class) {
            if (f28752h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f28752h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f28752h);
        }
    }

    /* renamed from: a */
    private final void m28528a(String str, Bundle bundle) {
        synchronized (this.f28753a) {
            C10694d dVar = (C10694d) this.f28753a.remove(str);
            if (dVar == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
            dVar.mo29327a(bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo32309a(Bundle bundle) throws IOException {
        if (this.f28755c.mo32304d() < 12000000) {
            return m28529b(bundle);
        }
        try {
            return (Bundle) C10697f.m27263a(C11053c.m28477a(this.f28754b).mo32270b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d(str, sb.toString());
            }
            if (!(e.getCause() instanceof zzak) || ((zzak) e.getCause()).mo32333a() != 4) {
                return null;
            }
            return m28529b(bundle);
        }
    }

    /* renamed from: a */
    private static synchronized String m28524a() {
        String num;
        synchronized (C11085s.class) {
            int i = f28751g;
            f28751g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }
}

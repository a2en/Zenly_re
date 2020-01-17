package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.util.C10174k;
import com.google.android.gms.common.util.C10177n;
import com.google.android.gms.internal.gcm.C10470c;
import com.google.android.gms.internal.gcm.C10473f;
import com.google.android.gms.internal.gcm.C10474g;
import com.google.android.gms.internal.gcm.C10477j;
import com.google.android.gms.internal.gcm.zzl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public abstract class GcmTaskService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f26768e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26769f;

    /* renamed from: g */
    private ExecutorService f26770g;

    /* renamed from: h */
    private Messenger f26771h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ComponentName f26772i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10210a f26773j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public zzl f26774k;

    @TargetApi(21)
    /* renamed from: com.google.android.gms.gcm.GcmTaskService$a */
    class C10205a extends C10473f {
        C10205a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            String str = "GcmTaskService";
            if (!C10177n.m25692a(GcmTaskService.this, message.sendingUid, "com.google.android.gms")) {
                Log.e(str, "unable to verify presence of Google Play Services");
                return;
            }
            int i = message.what;
            if (i == 1) {
                Bundle data = message.getData();
                if (!data.isEmpty()) {
                    Messenger messenger = message.replyTo;
                    if (messenger != null) {
                        String string = data.getString("tag");
                        ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                        long j = data.getLong("max_exec_duration", 180);
                        if (!GcmTaskService.this.m25745a(string)) {
                            C10206b bVar = new C10206b(string, messenger, data.getBundle("extras"), j, (List<Uri>) parcelableArrayList);
                            GcmTaskService.this.m25742a(bVar);
                        }
                    }
                }
            } else if (i == 2) {
                if (Log.isLoggable(str, 3)) {
                    String valueOf = String.valueOf(message);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                    sb.append("ignoring unimplemented stop message for now: ");
                    sb.append(valueOf);
                    Log.d(str, sb.toString());
                }
            } else if (i != 4) {
                String valueOf2 = String.valueOf(message);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb2.append("Unrecognized message received: ");
                sb2.append(valueOf2);
                Log.e(str, sb2.toString());
            } else {
                GcmTaskService.this.mo25323a();
            }
        }
    }

    /* renamed from: com.google.android.gms.gcm.GcmTaskService$b */
    class C10206b implements Runnable {

        /* renamed from: e */
        private final String f26776e;

        /* renamed from: f */
        private final Bundle f26777f;

        /* renamed from: g */
        private final List<Uri> f26778g;

        /* renamed from: h */
        private final long f26779h;

        /* renamed from: i */
        private final zzg f26780i;

        /* renamed from: j */
        private final Messenger f26781j;

        C10206b(String str, IBinder iBinder, Bundle bundle, long j, List<Uri> list) {
            zzg zzg;
            this.f26776e = str;
            if (iBinder == null) {
                zzg = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                if (queryLocalInterface instanceof zzg) {
                    zzg = (zzg) queryLocalInterface;
                } else {
                    zzg = new C10216g(iBinder);
                }
            }
            this.f26780i = zzg;
            this.f26777f = bundle;
            this.f26779h = j;
            this.f26778g = list;
            this.f26781j = null;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m25752a(int r6) {
            /*
                r5 = this;
                com.google.android.gms.gcm.GcmTaskService r0 = com.google.android.gms.gcm.GcmTaskService.this
                java.lang.Object r0 = r0.f26768e
                monitor-enter(r0)
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00d0 }
                com.google.android.gms.gcm.a r1 = r1.f26773j     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r2 = r5.f26776e     // Catch:{ RemoteException -> 0x00d0 }
                com.google.android.gms.gcm.GcmTaskService r3 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00d0 }
                android.content.ComponentName r3 = r3.f26772i     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = r3.getClassName()     // Catch:{ RemoteException -> 0x00d0 }
                boolean r1 = r1.mo27708c(r2, r3)     // Catch:{ RemoteException -> 0x00d0 }
                if (r1 == 0) goto L_0x005d
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f26773j     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f26776e     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f26772i     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.mo27707b(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.m25755a()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x005b
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f26773j     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f26772i     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.mo27705a(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x005b
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f26769f     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
            L_0x005b:
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                return
            L_0x005d:
                boolean r1 = r5.m25755a()     // Catch:{ RemoteException -> 0x00d0 }
                if (r1 == 0) goto L_0x008c
                android.os.Messenger r1 = r5.f26781j     // Catch:{ RemoteException -> 0x00d0 }
                android.os.Message r2 = android.os.Message.obtain()     // Catch:{ RemoteException -> 0x00d0 }
                r3 = 3
                r2.what = r3     // Catch:{ RemoteException -> 0x00d0 }
                r2.arg1 = r6     // Catch:{ RemoteException -> 0x00d0 }
                android.os.Bundle r6 = new android.os.Bundle     // Catch:{ RemoteException -> 0x00d0 }
                r6.<init>()     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = "component"
                com.google.android.gms.gcm.GcmTaskService r4 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ RemoteException -> 0x00d0 }
                android.content.ComponentName r4 = r4.f26772i     // Catch:{ RemoteException -> 0x00d0 }
                r6.putParcelable(r3, r4)     // Catch:{ RemoteException -> 0x00d0 }
                java.lang.String r3 = "tag"
                java.lang.String r4 = r5.f26776e     // Catch:{ RemoteException -> 0x00d0 }
                r6.putString(r3, r4)     // Catch:{ RemoteException -> 0x00d0 }
                r2.setData(r6)     // Catch:{ RemoteException -> 0x00d0 }
                r1.send(r2)     // Catch:{ RemoteException -> 0x00d0 }
                goto L_0x0091
            L_0x008c:
                com.google.android.gms.gcm.zzg r1 = r5.f26780i     // Catch:{ RemoteException -> 0x00d0 }
                r1.zzf(r6)     // Catch:{ RemoteException -> 0x00d0 }
            L_0x0091:
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f26773j     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f26776e     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f26772i     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.mo27707b(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.m25755a()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f26773j     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f26772i     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.mo27705a(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f26769f     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
                goto L_0x012a
            L_0x00ce:
                r6 = move-exception
                goto L_0x012c
            L_0x00d0:
                java.lang.String r6 = "GcmTaskService"
                java.lang.String r1 = "Error reporting result of operation to scheduler for "
                java.lang.String r2 = r5.f26776e     // Catch:{ all -> 0x00ce }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00ce }
                int r3 = r2.length()     // Catch:{ all -> 0x00ce }
                if (r3 == 0) goto L_0x00e5
                java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00ce }
                goto L_0x00eb
            L_0x00e5:
                java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00ce }
                r2.<init>(r1)     // Catch:{ all -> 0x00ce }
                r1 = r2
            L_0x00eb:
                android.util.Log.e(r6, r1)     // Catch:{ all -> 0x00ce }
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f26773j     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r5.f26776e     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f26772i     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                r6.mo27707b(r1, r2)     // Catch:{ all -> 0x0169 }
                boolean r6 = r5.m25755a()     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r6 = r6.f26773j     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r1 = r1.f26772i     // Catch:{ all -> 0x0169 }
                java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r6 = r6.mo27705a(r1)     // Catch:{ all -> 0x0169 }
                if (r6 != 0) goto L_0x012a
                com.google.android.gms.gcm.GcmTaskService r6 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                int r1 = r1.f26769f     // Catch:{ all -> 0x0169 }
                r6.stopSelf(r1)     // Catch:{ all -> 0x0169 }
            L_0x012a:
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                return
            L_0x012c:
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r1 = r1.f26773j     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r5.f26776e     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r3 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r3 = r3.f26772i     // Catch:{ all -> 0x0169 }
                java.lang.String r3 = r3.getClassName()     // Catch:{ all -> 0x0169 }
                r1.mo27707b(r2, r3)     // Catch:{ all -> 0x0169 }
                boolean r1 = r5.m25755a()     // Catch:{ all -> 0x0169 }
                if (r1 != 0) goto L_0x0168
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.a r1 = r1.f26773j     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                android.content.ComponentName r2 = r2.f26772i     // Catch:{ all -> 0x0169 }
                java.lang.String r2 = r2.getClassName()     // Catch:{ all -> 0x0169 }
                boolean r1 = r1.mo27705a(r2)     // Catch:{ all -> 0x0169 }
                if (r1 != 0) goto L_0x0168
                com.google.android.gms.gcm.GcmTaskService r1 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0169 }
                int r2 = r2.f26769f     // Catch:{ all -> 0x0169 }
                r1.stopSelf(r2)     // Catch:{ all -> 0x0169 }
            L_0x0168:
                throw r6     // Catch:{ all -> 0x0169 }
            L_0x0169:
                r6 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0169 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmTaskService.C10206b.m25752a(int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            m25754a(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                com.google.android.gms.gcm.o r0 = new com.google.android.gms.gcm.o
                java.lang.String r1 = r8.f26776e
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r1.length()
                java.lang.String r3 = "nts:client:onRunTask:"
                if (r2 == 0) goto L_0x0015
                java.lang.String r1 = r3.concat(r1)
                goto L_0x001a
            L_0x0015:
                java.lang.String r1 = new java.lang.String
                r1.<init>(r3)
            L_0x001a:
                r0.<init>(r1)
                com.google.android.gms.gcm.d r1 = new com.google.android.gms.gcm.d     // Catch:{ all -> 0x004a }
                java.lang.String r3 = r8.f26776e     // Catch:{ all -> 0x004a }
                android.os.Bundle r4 = r8.f26777f     // Catch:{ all -> 0x004a }
                long r5 = r8.f26779h     // Catch:{ all -> 0x004a }
                java.util.List<android.net.Uri> r7 = r8.f26778g     // Catch:{ all -> 0x004a }
                r2 = r1
                r2.<init>(r3, r4, r5, r7)     // Catch:{ all -> 0x004a }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x004a }
                com.google.android.gms.internal.gcm.zzl r2 = r2.f26774k     // Catch:{ all -> 0x004a }
                java.lang.String r3 = "onRunTask"
                int r4 = com.google.android.gms.internal.gcm.C10476i.f27390a     // Catch:{ all -> 0x004a }
                r2.zzd(r3, r4)     // Catch:{ all -> 0x004a }
                com.google.android.gms.gcm.GcmTaskService r2 = com.google.android.gms.gcm.GcmTaskService.this     // Catch:{ all -> 0x0046 }
                int r1 = r2.mo25322a(r1)     // Catch:{ all -> 0x0046 }
                r8.m25752a(r1)     // Catch:{ all -> 0x004a }
                r1 = 0
                m25754a(r1, r0)
                return
            L_0x0046:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0048 }
            L_0x0048:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x004a }
            L_0x004a:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x004c }
            L_0x004c:
                r2 = move-exception
                m25754a(r1, r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmTaskService.C10206b.run():void");
        }

        C10206b(String str, Messenger messenger, Bundle bundle, long j, List<Uri> list) {
            this.f26776e = str;
            this.f26781j = messenger;
            this.f26777f = bundle;
            this.f26779h = j;
            this.f26778g = list;
            this.f26780i = null;
        }

        /* renamed from: a */
        private final boolean m25755a() {
            return this.f26781j != null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m25754a(Throwable th, C10224o oVar) {
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m25745a(String str) {
        boolean z;
        synchronized (this.f26768e) {
            z = !this.f26773j.mo27706a(str, this.f26772i.getClassName());
            if (z) {
                String packageName = getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 44 + String.valueOf(str).length());
                sb.append(packageName);
                sb.append(" ");
                sb.append(str);
                sb.append(": Task already running, won't start another");
                Log.w("GcmTaskService", sb.toString());
            }
        }
        return z;
    }

    /* renamed from: a */
    public abstract int mo25322a(C10213d dVar);

    /* renamed from: a */
    public void mo25323a() {
    }

    public IBinder onBind(Intent intent) {
        if (intent != null && C10174k.m25684g()) {
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
                return this.f26771h.getBinder();
            }
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f26773j = C10210a.m25815a((Context) this);
        this.f26770g = C10470c.m26856a().zzd(10, new C10215f(this), 10);
        this.f26771h = new Messenger(new C10205a(Looper.getMainLooper()));
        this.f26772i = new ComponentName(this, getClass());
        C10474g.m26857a();
        getClass();
        this.f26774k = C10474g.f27387a;
    }

    public void onDestroy() {
        super.onDestroy();
        List shutdownNow = this.f26770g.shutdownNow();
        if (!shutdownNow.isEmpty()) {
            int size = shutdownNow.size();
            StringBuilder sb = new StringBuilder(79);
            sb.append("Shutting down, but not all tasks are finished executing. Remaining: ");
            sb.append(size);
            Log.e("GcmTaskService", sb.toString());
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            m25741a(i2);
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            String str = "GcmTaskService";
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundleExtra = intent.getBundleExtra("extras");
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                long longExtra = intent.getLongExtra("max_exec_duration", 180);
                if (!(parcelableExtra instanceof PendingCallback)) {
                    String packageName = getPackageName();
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 47 + String.valueOf(stringExtra).length());
                    sb.append(packageName);
                    sb.append(" ");
                    sb.append(stringExtra);
                    sb.append(": Could not process request, invalid callback.");
                    Log.e(str, sb.toString());
                    return 2;
                } else if (m25745a(stringExtra)) {
                    m25741a(i2);
                    return 2;
                } else {
                    C10206b bVar = new C10206b(stringExtra, ((PendingCallback) parcelableExtra).f26787e, bundleExtra, longExtra, (List<Uri>) parcelableArrayListExtra);
                    m25742a(bVar);
                }
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                mo25323a();
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 37);
                sb2.append("Unknown action received ");
                sb2.append(action);
                sb2.append(", terminating");
                Log.e(str, sb2.toString());
            }
            m25741a(i2);
            return 2;
        } finally {
            m25741a(i2);
        }
    }

    /* renamed from: a */
    private final void m25741a(int i) {
        synchronized (this.f26768e) {
            this.f26769f = i;
            if (!this.f26773j.mo27705a(this.f26772i.getClassName())) {
                stopSelf(this.f26769f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25742a(C10206b bVar) {
        try {
            this.f26770g.execute(bVar);
        } catch (RejectedExecutionException e) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            bVar.m25752a(1);
        }
    }
}

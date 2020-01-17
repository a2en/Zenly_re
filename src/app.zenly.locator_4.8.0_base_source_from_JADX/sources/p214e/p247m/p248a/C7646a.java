package p214e.p247m.p248a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: e.m.a.a */
public final class C7646a {

    /* renamed from: f */
    private static final Object f19271f = new Object();

    /* renamed from: g */
    private static C7646a f19272g;

    /* renamed from: a */
    private final Context f19273a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<C7649c>> f19274b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C7649c>> f19275c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C7648b> f19276d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f19277e;

    /* renamed from: e.m.a.a$a */
    class C7647a extends Handler {
        C7647a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C7646a.this.mo19783a();
            }
        }
    }

    /* renamed from: e.m.a.a$b */
    private static final class C7648b {

        /* renamed from: a */
        final Intent f19279a;

        /* renamed from: b */
        final ArrayList<C7649c> f19280b;

        C7648b(Intent intent, ArrayList<C7649c> arrayList) {
            this.f19279a = intent;
            this.f19280b = arrayList;
        }
    }

    /* renamed from: e.m.a.a$c */
    private static final class C7649c {

        /* renamed from: a */
        final IntentFilter f19281a;

        /* renamed from: b */
        final BroadcastReceiver f19282b;

        /* renamed from: c */
        boolean f19283c;

        /* renamed from: d */
        boolean f19284d;

        C7649c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f19281a = intentFilter;
            this.f19282b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f19282b);
            sb.append(" filter=");
            sb.append(this.f19281a);
            if (this.f19284d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C7646a(Context context) {
        this.f19273a = context;
        this.f19277e = new C7647a(context.getMainLooper());
    }

    /* renamed from: a */
    public static C7646a m18632a(Context context) {
        C7646a aVar;
        synchronized (f19271f) {
            if (f19272g == null) {
                f19272g = new C7646a(context.getApplicationContext());
            }
            aVar = f19272g;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo19785a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f19274b) {
            C7649c cVar = new C7649c(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f19274b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f19274b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f19275c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f19275c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo19784a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f19274b) {
            ArrayList arrayList = (ArrayList) this.f19274b.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C7649c cVar = (C7649c) arrayList.get(size);
                    cVar.f19284d = true;
                    for (int i = 0; i < cVar.f19281a.countActions(); i++) {
                        String action = cVar.f19281a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.f19275c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C7649c cVar2 = (C7649c) arrayList2.get(size2);
                                if (cVar2.f19282b == broadcastReceiver) {
                                    cVar2.f19284d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f19275c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0174, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19786a(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<e.m.a.a$c>> r2 = r1.f19274b
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch:{ all -> 0x0175 }
            android.content.Context r3 = r1.f19273a     // Catch:{ all -> 0x0175 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0175 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x0175 }
            android.net.Uri r12 = r22.getData()     // Catch:{ all -> 0x0175 }
            java.lang.String r13 = r22.getScheme()     // Catch:{ all -> 0x0175 }
            java.util.Set r14 = r22.getCategories()     // Catch:{ all -> 0x0175 }
            int r3 = r22.getFlags()     // Catch:{ all -> 0x0175 }
            r3 = r3 & 8
            if (r3 == 0) goto L_0x002c
            r16 = 1
            goto L_0x002e
        L_0x002c:
            r16 = 0
        L_0x002e:
            if (r16 == 0) goto L_0x0056
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = "Resolving type "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r11)     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = " scheme "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r13)     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = " of intent "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x0056:
            java.util.HashMap<java.lang.String, java.util.ArrayList<e.m.a.a$c>> r3 = r1.f19275c     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r22.getAction()     // Catch:{ all -> 0x0175 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0175 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0175 }
            if (r8 == 0) goto L_0x0172
            if (r16 == 0) goto L_0x007d
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = "Action list: "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r8)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x007d:
            r3 = 0
            r6 = r3
            r7 = 0
        L_0x0080:
            int r3 = r8.size()     // Catch:{ all -> 0x0175 }
            if (r7 >= r3) goto L_0x0142
            java.lang.Object r3 = r8.get(r7)     // Catch:{ all -> 0x0175 }
            r5 = r3
            e.m.a.a$c r5 = (p214e.p247m.p248a.C7646a.C7649c) r5     // Catch:{ all -> 0x0175 }
            if (r16 == 0) goto L_0x00a7
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r9 = "Matching against filter "
            r4.append(r9)     // Catch:{ all -> 0x0175 }
            android.content.IntentFilter r9 = r5.f19281a     // Catch:{ all -> 0x0175 }
            r4.append(r9)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x00a7:
            boolean r3 = r5.f19283c     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x00c0
            if (r16 == 0) goto L_0x00b4
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r4 = "  Filter's target already added"
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x00b4:
            r18 = r7
            r19 = r8
            r17 = r10
            r20 = r11
            r11 = 1
            r10 = r6
            goto L_0x0137
        L_0x00c0:
            android.content.IntentFilter r3 = r5.f19281a     // Catch:{ all -> 0x0175 }
            java.lang.String r9 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r17 = r10
            r10 = r6
            r6 = r13
            r18 = r7
            r7 = r12
            r19 = r8
            r8 = r14
            r20 = r11
            r11 = 1
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0175 }
            if (r3 < 0) goto L_0x0105
            if (r16 == 0) goto L_0x00f6
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r5.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "  Filter matched!  match=0x"
            r5.append(r6)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x0175 }
            r5.append(r3)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x0175 }
        L_0x00f6:
            if (r10 != 0) goto L_0x00fe
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0175 }
            r6.<init>()     // Catch:{ all -> 0x0175 }
            goto L_0x00ff
        L_0x00fe:
            r6 = r10
        L_0x00ff:
            r6.add(r15)     // Catch:{ all -> 0x0175 }
            r15.f19283c = r11     // Catch:{ all -> 0x0175 }
            goto L_0x0138
        L_0x0105:
            if (r16 == 0) goto L_0x0137
            r4 = -4
            if (r3 == r4) goto L_0x011f
            r4 = -3
            if (r3 == r4) goto L_0x011c
            r4 = -2
            if (r3 == r4) goto L_0x0119
            r4 = -1
            if (r3 == r4) goto L_0x0116
            java.lang.String r3 = "unknown reason"
            goto L_0x0121
        L_0x0116:
            java.lang.String r3 = "type"
            goto L_0x0121
        L_0x0119:
            java.lang.String r3 = "data"
            goto L_0x0121
        L_0x011c:
            java.lang.String r3 = "action"
            goto L_0x0121
        L_0x011f:
            java.lang.String r3 = "category"
        L_0x0121:
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r5.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "  Filter did not match: "
            r5.append(r6)     // Catch:{ all -> 0x0175 }
            r5.append(r3)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x0175 }
        L_0x0137:
            r6 = r10
        L_0x0138:
            int r7 = r18 + 1
            r10 = r17
            r8 = r19
            r11 = r20
            goto L_0x0080
        L_0x0142:
            r10 = r6
            r11 = 1
            if (r10 == 0) goto L_0x0172
            r3 = 0
        L_0x0147:
            int r4 = r10.size()     // Catch:{ all -> 0x0175 }
            if (r3 >= r4) goto L_0x0159
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x0175 }
            e.m.a.a$c r4 = (p214e.p247m.p248a.C7646a.C7649c) r4     // Catch:{ all -> 0x0175 }
            r5 = 0
            r4.f19283c = r5     // Catch:{ all -> 0x0175 }
            int r3 = r3 + 1
            goto L_0x0147
        L_0x0159:
            java.util.ArrayList<e.m.a.a$b> r3 = r1.f19276d     // Catch:{ all -> 0x0175 }
            e.m.a.a$b r4 = new e.m.a.a$b     // Catch:{ all -> 0x0175 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x0175 }
            r3.add(r4)     // Catch:{ all -> 0x0175 }
            android.os.Handler r0 = r1.f19277e     // Catch:{ all -> 0x0175 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x0175 }
            if (r0 != 0) goto L_0x0170
            android.os.Handler r0 = r1.f19277e     // Catch:{ all -> 0x0175 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x0175 }
        L_0x0170:
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            return r11
        L_0x0172:
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            r0 = 0
            return r0
        L_0x0175:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p247m.p248a.C7646a.mo19786a(android.content.Intent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2 >= r1.length) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = r1[r2];
        r4 = r3.f19280b.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 >= r4) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r6 = (p214e.p247m.p248a.C7646a.C7649c) r3.f19280b.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r6.f19284d != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r6.f19282b.onReceive(r9.f19273a, r3.f19279a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19783a() {
        /*
            r9 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<e.m.a.a$c>> r0 = r9.f19274b
            monitor-enter(r0)
            java.util.ArrayList<e.m.a.a$b> r1 = r9.f19276d     // Catch:{ all -> 0x0045 }
            int r1 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x000d:
            e.m.a.a$b[] r1 = new p214e.p247m.p248a.C7646a.C7648b[r1]     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<e.m.a.a$b> r2 = r9.f19276d     // Catch:{ all -> 0x0045 }
            r2.toArray(r1)     // Catch:{ all -> 0x0045 }
            java.util.ArrayList<e.m.a.a$b> r2 = r9.f19276d     // Catch:{ all -> 0x0045 }
            r2.clear()     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r0 = 0
            r2 = 0
        L_0x001c:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0000
            r3 = r1[r2]
            java.util.ArrayList<e.m.a.a$c> r4 = r3.f19280b
            int r4 = r4.size()
            r5 = 0
        L_0x0028:
            if (r5 >= r4) goto L_0x0042
            java.util.ArrayList<e.m.a.a$c> r6 = r3.f19280b
            java.lang.Object r6 = r6.get(r5)
            e.m.a.a$c r6 = (p214e.p247m.p248a.C7646a.C7649c) r6
            boolean r7 = r6.f19284d
            if (r7 != 0) goto L_0x003f
            android.content.BroadcastReceiver r6 = r6.f19282b
            android.content.Context r7 = r9.f19273a
            android.content.Intent r8 = r3.f19279a
            r6.onReceive(r7, r8)
        L_0x003f:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0042:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p247m.p248a.C7646a.mo19783a():void");
    }
}

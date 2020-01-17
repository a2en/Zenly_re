package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.internal.m */
public final class C8778m {

    /* renamed from: ˊॱ */
    private static final Handler f22732 = new Handler(Looper.getMainLooper());

    /* renamed from: ˏ */
    static final BitSet f22733 = new BitSet(6);

    /* renamed from: ͺ */
    private static volatile C8778m f22734;

    /* renamed from: ʻ */
    boolean f22735;

    /* renamed from: ʼ */
    final Runnable f22736 = new Runnable() {
        public final void run() {
            synchronized (C8778m.this.f22739) {
                C8778m.this.mo23794();
                C8778m.this.f22742.postDelayed(C8778m.this.f22743, 1800000);
            }
        }
    };

    /* renamed from: ʽ */
    public final Runnable f22737 = new Runnable() {
        public final void run() {
            synchronized (C8778m.this.f22739) {
                if (C8778m.this.f22744) {
                    C8778m.this.f22742.removeCallbacks(C8778m.this.f22743);
                    C8778m.this.f22742.removeCallbacks(C8778m.this.f22736);
                    C8778m.this.mo23794();
                    C8778m.this.f22744 = false;
                }
            }
        }
    };

    /* renamed from: ˊ */
    final SensorManager f22738;

    /* renamed from: ˋ */
    final Object f22739 = new Object();

    /* renamed from: ˎ */
    final Map<C8782n, C8782n> f22740 = new HashMap(f22733.size());

    /* renamed from: ˏॱ */
    private final Map<C8782n, Map<String, Object>> f22741 = new HashMap(f22733.size());

    /* renamed from: ॱ */
    public final Handler f22742;

    /* renamed from: ॱॱ */
    public final Runnable f22743 = new Runnable() {
        /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|4|5|6|(5:9|(1:14)(1:13)|(4:16|(1:18)|19|29)(1:28)|27|7)|20|21|22) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0052 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                com.appsflyer.internal.m r0 = com.appsflyer.internal.C8778m.this
                java.lang.Object r0 = r0.f22739
                monitor-enter(r0)
                com.appsflyer.internal.m r1 = com.appsflyer.internal.C8778m.this     // Catch:{ all -> 0x0067 }
                r2 = 1
                android.hardware.SensorManager r3 = r1.f22738     // Catch:{ all -> 0x0052 }
                r4 = -1
                java.util.List r3 = r3.getSensorList(r4)     // Catch:{ all -> 0x0052 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0052 }
            L_0x0013:
                boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0052 }
                if (r4 == 0) goto L_0x0052
                java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0052 }
                android.hardware.Sensor r4 = (android.hardware.Sensor) r4     // Catch:{ all -> 0x0052 }
                int r5 = r4.getType()     // Catch:{ all -> 0x0052 }
                r6 = 0
                if (r5 < 0) goto L_0x0030
                java.util.BitSet r7 = com.appsflyer.internal.C8778m.f22733     // Catch:{ all -> 0x0052 }
                boolean r5 = r7.get(r5)     // Catch:{ all -> 0x0052 }
                if (r5 == 0) goto L_0x0030
                r5 = 1
                goto L_0x0031
            L_0x0030:
                r5 = 0
            L_0x0031:
                if (r5 == 0) goto L_0x0013
                com.appsflyer.internal.n r5 = com.appsflyer.internal.C8782n.m20746(r4)     // Catch:{ all -> 0x0052 }
                java.util.Map<com.appsflyer.internal.n, com.appsflyer.internal.n> r7 = r1.f22740     // Catch:{ all -> 0x0052 }
                boolean r7 = r7.containsKey(r5)     // Catch:{ all -> 0x0052 }
                if (r7 != 0) goto L_0x0044
                java.util.Map<com.appsflyer.internal.n, com.appsflyer.internal.n> r7 = r1.f22740     // Catch:{ all -> 0x0052 }
                r7.put(r5, r5)     // Catch:{ all -> 0x0052 }
            L_0x0044:
                java.util.Map<com.appsflyer.internal.n, com.appsflyer.internal.n> r7 = r1.f22740     // Catch:{ all -> 0x0052 }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x0052 }
                android.hardware.SensorEventListener r5 = (android.hardware.SensorEventListener) r5     // Catch:{ all -> 0x0052 }
                android.hardware.SensorManager r7 = r1.f22738     // Catch:{ all -> 0x0052 }
                r7.registerListener(r5, r4, r6)     // Catch:{ all -> 0x0052 }
                goto L_0x0013
            L_0x0052:
                r1.f22735 = r2     // Catch:{ all -> 0x0067 }
                com.appsflyer.internal.m r1 = com.appsflyer.internal.C8778m.this     // Catch:{ all -> 0x0067 }
                android.os.Handler r1 = r1.f22742     // Catch:{ all -> 0x0067 }
                com.appsflyer.internal.m r3 = com.appsflyer.internal.C8778m.this     // Catch:{ all -> 0x0067 }
                java.lang.Runnable r3 = r3.f22736     // Catch:{ all -> 0x0067 }
                r4 = 500(0x1f4, double:2.47E-321)
                r1.postDelayed(r3, r4)     // Catch:{ all -> 0x0067 }
                com.appsflyer.internal.m r1 = com.appsflyer.internal.C8778m.this     // Catch:{ all -> 0x0067 }
                r1.f22744 = r2     // Catch:{ all -> 0x0067 }
                monitor-exit(r0)     // Catch:{ all -> 0x0067 }
                return
            L_0x0067:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8778m.C87802.run():void");
        }
    };

    /* renamed from: ᐝ */
    boolean f22744;

    static {
        f22733.set(1);
        f22733.set(2);
        f22733.set(4);
    }

    private C8778m(SensorManager sensorManager, Handler handler) {
        this.f22738 = sensorManager;
        this.f22742 = handler;
    }

    /* renamed from: ˊ */
    private static C8778m m20740(SensorManager sensorManager, Handler handler) {
        if (f22734 == null) {
            synchronized (C8778m.class) {
                if (f22734 == null) {
                    f22734 = new C8778m(sensorManager, handler);
                }
            }
        }
        return f22734;
    }

    /* renamed from: ˎ */
    public static C8778m m20741(Context context) {
        return m20740((SensorManager) context.getApplicationContext().getSystemService("sensor"), f22732);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final void mo23794() {
        try {
            if (!this.f22740.isEmpty()) {
                for (C8782n nVar : this.f22740.values()) {
                    this.f22738.unregisterListener(nVar);
                    nVar.mo23802(this.f22741, true);
                }
            }
        } catch (Throwable unused) {
        }
        this.f22735 = false;
    }

    /* renamed from: ˊ */
    public final List<Map<String, Object>> mo23793() {
        synchronized (this.f22739) {
            if (!this.f22740.isEmpty() && this.f22735) {
                for (C8782n r2 : this.f22740.values()) {
                    r2.mo23802(this.f22741, false);
                }
            }
            if (this.f22741.isEmpty()) {
                List<Map<String, Object>> emptyList = Collections.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList(this.f22741.values());
            return arrayList;
        }
    }
}

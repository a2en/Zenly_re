package com.crashlytics.android.core;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12179g;

/* renamed from: com.crashlytics.android.core.m0 */
class C9391m0 {

    /* renamed from: g */
    static final Map<String, String> f24340g = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final short[] f24341h = {10, 20, 30, 60, 120, 300};

    /* renamed from: a */
    private final Object f24342a = new Object();

    /* renamed from: b */
    private final C9409s f24343b;

    /* renamed from: c */
    private final String f24344c;

    /* renamed from: d */
    private final C9394c f24345d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9393b f24346e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Thread f24347f;

    /* renamed from: com.crashlytics.android.core.m0$a */
    static final class C9392a implements C9395d {
        C9392a() {
        }

        /* renamed from: a */
        public boolean mo25168a() {
            return true;
        }
    }

    /* renamed from: com.crashlytics.android.core.m0$b */
    interface C9393b {
        /* renamed from: a */
        boolean mo25173a();
    }

    /* renamed from: com.crashlytics.android.core.m0$c */
    interface C9394c {
        /* renamed from: a */
        File[] mo25170a();

        /* renamed from: b */
        File[] mo25171b();

        /* renamed from: c */
        File[] mo25172c();
    }

    /* renamed from: com.crashlytics.android.core.m0$d */
    interface C9395d {
        /* renamed from: a */
        boolean mo25168a();
    }

    /* renamed from: com.crashlytics.android.core.m0$e */
    private class C9396e extends C12179g {

        /* renamed from: e */
        private final float f24348e;

        /* renamed from: f */
        private final C9395d f24349f;

        C9396e(float f, C9395d dVar) {
            this.f24348e = f;
            this.f24349f = dVar;
        }

        /* renamed from: b */
        private void m22718b() {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Starting report processing in ");
            sb.append(this.f24348e);
            sb.append(" second(s)...");
            String str = "CrashlyticsCore";
            f.mo35954d(str, sb.toString());
            float f2 = this.f24348e;
            if (f2 > 0.0f) {
                try {
                    Thread.sleep((long) (f2 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<C9388l0> a = C9391m0.this.mo25212a();
            if (!C9391m0.this.f24346e.mo25173a()) {
                if (a.isEmpty() || this.f24349f.mo25168a()) {
                    int i = 0;
                    while (!a.isEmpty() && !C9391m0.this.f24346e.mo25173a()) {
                        Logger f3 = C12154c.m32113f();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Attempting to send ");
                        sb2.append(a.size());
                        sb2.append(" report(s)");
                        f3.mo35954d(str, sb2.toString());
                        for (C9388l0 a2 : a) {
                            C9391m0.this.mo25214a(a2);
                        }
                        a = C9391m0.this.mo25212a();
                        if (!a.isEmpty()) {
                            int i2 = i + 1;
                            long j = (long) C9391m0.f24341h[Math.min(i, C9391m0.f24341h.length - 1)];
                            Logger f4 = C12154c.m32113f();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Report submisson: scheduling delayed retry in ");
                            sb3.append(j);
                            sb3.append(" seconds");
                            f4.mo35954d(str, sb3.toString());
                            try {
                                Thread.sleep(j * 1000);
                                i = i2;
                            } catch (InterruptedException unused2) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    }
                    return;
                }
                Logger f5 = C12154c.m32113f();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("User declined to send. Removing ");
                sb4.append(a.size());
                sb4.append(" Report(s).");
                f5.mo35954d(str, sb4.toString());
                for (C9388l0 remove : a) {
                    remove.remove();
                }
            }
        }

        /* renamed from: a */
        public void mo25215a() {
            try {
                m22718b();
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            C9391m0.this.f24347f = null;
        }
    }

    public C9391m0(String str, C9409s sVar, C9394c cVar, C9393b bVar) {
        if (sVar != null) {
            this.f24343b = sVar;
            this.f24344c = str;
            this.f24345d = cVar;
            this.f24346e = bVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* renamed from: a */
    public synchronized void mo25213a(float f, C9395d dVar) {
        if (this.f24347f != null) {
            C12154c.m32113f().mo35954d("CrashlyticsCore", "Report upload has already been started.");
            return;
        }
        this.f24347f = new Thread(new C9396e(f, dVar), "Crashlytics Report Uploader");
        this.f24347f.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25214a(C9388l0 l0Var) {
        boolean z;
        synchronized (this.f24342a) {
            z = false;
            try {
                boolean a = this.f24343b.mo25076a(new C9407r(this.f24344c, l0Var));
                Logger f = C12154c.m32113f();
                String str = "CrashlyticsCore";
                StringBuilder sb = new StringBuilder();
                sb.append("Crashlytics report upload ");
                sb.append(a ? "complete: " : "FAILED: ");
                sb.append(l0Var.getIdentifier());
                f.mo35959i(str, sb.toString());
                if (a) {
                    l0Var.remove();
                    z = true;
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error occurred sending report ");
                sb2.append(l0Var);
                C12154c.m32113f().mo35957e("CrashlyticsCore", sb2.toString(), e);
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C9388l0> mo25212a() {
        File[] c;
        File[] b;
        File[] a;
        C12154c.m32113f().mo35954d("CrashlyticsCore", "Checking for crash reports...");
        synchronized (this.f24342a) {
            c = this.f24345d.mo25172c();
            b = this.f24345d.mo25171b();
            a = this.f24345d.mo25170a();
        }
        LinkedList linkedList = new LinkedList();
        if (c != null) {
            for (File file : c) {
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Found crash report ");
                sb.append(file.getPath());
                f.mo35954d("CrashlyticsCore", sb.toString());
                linkedList.add(new C9402p0(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (b != null) {
            for (File file2 : b) {
                String a2 = C9337k.m22553a(file2);
                if (!hashMap.containsKey(a2)) {
                    hashMap.put(a2, new LinkedList());
                }
                ((List) hashMap.get(a2)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            Logger f2 = C12154c.m32113f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found invalid session: ");
            sb2.append(str);
            f2.mo35954d("CrashlyticsCore", sb2.toString());
            List list = (List) hashMap.get(str);
            linkedList.add(new C9424y(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (a != null) {
            for (File f0Var : a) {
                linkedList.add(new C9317f0(f0Var));
            }
        }
        if (linkedList.isEmpty()) {
            C12154c.m32113f().mo35954d("CrashlyticsCore", "No reports found.");
        }
        return linkedList;
    }
}

package p389io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: io.fabric.sdk.android.services.common.j */
public class C12186j {

    /* renamed from: f */
    private static C12186j f31678f;

    /* renamed from: g */
    private static Object f31679g = new Object();

    /* renamed from: a */
    private final SharedPreferences f31680a;

    /* renamed from: b */
    private volatile boolean f31681b;

    /* renamed from: c */
    private volatile boolean f31682c;

    /* renamed from: d */
    private final C12192m f31683d;

    /* renamed from: e */
    private boolean f31684e = false;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C12186j(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f31684e = r0
            if (r7 == 0) goto L_0x006a
            java.lang.String r1 = "com.google.firebase.crashlytics.prefs"
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r1, r0)
            r6.f31680a = r1
            io.fabric.sdk.android.services.common.m r1 = p389io.fabric.sdk.android.services.common.C12193n.m32299a(r7)
            r6.f31683d = r1
            android.content.SharedPreferences r1 = r6.f31680a
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.contains(r2)
            r3 = 1
            if (r1 == 0) goto L_0x0029
            android.content.SharedPreferences r1 = r6.f31680a
            boolean r1 = r1.getBoolean(r2, r3)
        L_0x0027:
            r2 = 1
            goto L_0x005c
        L_0x0029:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x005a
            java.lang.String r4 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x004e }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r1 == 0) goto L_0x005a
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            if (r4 == 0) goto L_0x005a
            android.os.Bundle r4 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r4 = r4.containsKey(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            if (r4 == 0) goto L_0x005a
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x004e }
            boolean r1 = r1.getBoolean(r2)     // Catch:{ NameNotFoundException -> 0x004e }
            goto L_0x0027
        L_0x004e:
            r1 = move-exception
            io.fabric.sdk.android.Logger r2 = p389io.fabric.sdk.android.C12154c.m32113f()
            java.lang.String r4 = "Fabric"
            java.lang.String r5 = "Unable to get PackageManager. Falling through"
            r2.mo35955d(r4, r5, r1)
        L_0x005a:
            r1 = 1
            r2 = 0
        L_0x005c:
            r6.f31682c = r1
            r6.f31681b = r2
            java.lang.String r7 = p389io.fabric.sdk.android.services.common.C12180h.m32281o(r7)
            if (r7 == 0) goto L_0x0067
            r0 = 1
        L_0x0067:
            r6.f31684e = r0
            return
        L_0x006a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.fabric.sdk.android.services.common.C12186j.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static C12186j m32286a(Context context) {
        C12186j jVar;
        synchronized (f31679g) {
            if (f31678f == null) {
                f31678f = new C12186j(context);
            }
            jVar = f31678f;
        }
        return jVar;
    }

    /* renamed from: b */
    public boolean mo36072b() {
        return this.f31682c;
    }

    /* renamed from: a */
    public boolean mo36071a() {
        if (this.f31684e && this.f31681b) {
            return this.f31682c;
        }
        C12192m mVar = this.f31683d;
        if (mVar != null) {
            return mVar.mo36076a();
        }
        return true;
    }
}

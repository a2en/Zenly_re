package com.crashlytics.android.answers.shim;

/* renamed from: com.crashlytics.android.answers.shim.b */
public class C9288b {

    /* renamed from: a */
    private static final KitEventLogger f24133a;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    static {
        /*
            com.crashlytics.android.answers.shim.a r0 = com.crashlytics.android.answers.shim.C9287a.m22382a()     // Catch:{ IllegalStateException | NoClassDefFoundError -> 0x000d, all -> 0x0005 }
            goto L_0x000e
        L_0x0005:
            r0 = move-exception
            java.lang.String r1 = "AnswersOptionalLogger"
            java.lang.String r2 = "Unexpected error creating AnswersKitEventLogger"
            android.util.Log.w(r1, r2, r0)
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            com.crashlytics.android.answers.shim.KitEventLogger r0 = com.crashlytics.android.answers.shim.C9290d.m22387a()
        L_0x0015:
            f24133a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.answers.shim.C9288b.<clinit>():void");
    }

    /* renamed from: a */
    public static KitEventLogger m22384a() {
        return f24133a;
    }
}

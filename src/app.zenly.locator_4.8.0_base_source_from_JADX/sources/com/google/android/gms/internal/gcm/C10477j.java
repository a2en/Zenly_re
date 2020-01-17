package com.google.android.gms.internal.gcm;

/* renamed from: com.google.android.gms.internal.gcm.j */
public final class C10477j {

    /* renamed from: a */
    private static final C10479k f27391a;

    /* renamed from: com.google.android.gms.internal.gcm.j$a */
    static final class C10478a extends C10479k {
        C10478a() {
        }

        /* renamed from: a */
        public final void mo28305a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    static {
        /*
            java.lang.Integer r0 = m26858a()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0014
            int r1 = r0.intValue()     // Catch:{ all -> 0x002a }
            r2 = 19
            if (r1 < r2) goto L_0x0014
            com.google.android.gms.internal.gcm.o r1 = new com.google.android.gms.internal.gcm.o     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0014:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x002a }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.gcm.n r1 = new com.google.android.gms.internal.gcm.n     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0024:
            com.google.android.gms.internal.gcm.j$a r1 = new com.google.android.gms.internal.gcm.j$a     // Catch:{ all -> 0x002a }
            r1.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x002a:
            r1 = move-exception
            goto L_0x002e
        L_0x002c:
            r1 = move-exception
            r0 = 0
        L_0x002e:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.gcm.j$a> r3 = com.google.android.gms.internal.gcm.C10477j.C10478a.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 133
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            com.google.android.gms.internal.gcm.j$a r1 = new com.google.android.gms.internal.gcm.j$a
            r1.<init>()
        L_0x0063:
            f27391a = r1
            if (r0 != 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            r0.intValue()
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gcm.C10477j.<clinit>():void");
    }

    /* renamed from: a */
    public static void m26859a(Throwable th, Throwable th2) {
        f27391a.mo28305a(th, th2);
    }

    /* renamed from: a */
    private static Integer m26858a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}

package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFExecutor.C87382.C87391;

/* renamed from: com.appsflyer.internal.o */
public final class C8783o {

    /* renamed from: com.appsflyer.internal.o$a */
    static final class C8784a {

        /* renamed from: ˏ */
        static final C8783o f22756 = new C8783o();
    }

    C8783o() {
    }

    /* renamed from: ˊ */
    public static C8783o m20750() {
        return C8784a.f22756;
    }

    /* renamed from: ˋ */
    private static boolean m20751(Context context, String[] strArr) {
        for (String r3 : strArr) {
            if (C87391.m20579(context, r3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r8 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (60000 >= (r3.getTime() - r8.getTime())) goto L_0x0051;
     */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.location.Location m20752(android.content.Context r8) {
        /*
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            r1 = 0
            java.lang.String r2 = "location"
            java.lang.Object r2 = r8.getSystemService(r2)     // Catch:{ all -> 0x0054 }
            android.location.LocationManager r2 = (android.location.LocationManager) r2     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "network"
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4}     // Catch:{ all -> 0x0054 }
            boolean r4 = m20751(r8, r4)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x001e
            android.location.Location r3 = r2.getLastKnownLocation(r3)     // Catch:{ all -> 0x0054 }
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            java.lang.String r4 = "gps"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0054 }
            boolean r8 = m20751(r8, r0)     // Catch:{ all -> 0x0054 }
            if (r8 == 0) goto L_0x0030
            android.location.Location r8 = r2.getLastKnownLocation(r4)     // Catch:{ all -> 0x0054 }
            goto L_0x0031
        L_0x0030:
            r8 = r1
        L_0x0031:
            if (r8 != 0) goto L_0x0037
            if (r3 != 0) goto L_0x0037
            r8 = r1
            goto L_0x0051
        L_0x0037:
            if (r8 != 0) goto L_0x003c
            if (r3 == 0) goto L_0x003c
            goto L_0x0050
        L_0x003c:
            if (r3 != 0) goto L_0x0040
            if (r8 != 0) goto L_0x0051
        L_0x0040:
            long r4 = r3.getTime()     // Catch:{ all -> 0x0054 }
            long r6 = r8.getTime()     // Catch:{ all -> 0x0054 }
            long r4 = r4 - r6
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
        L_0x0050:
            r8 = r3
        L_0x0051:
            if (r8 == 0) goto L_0x0054
            r1 = r8
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8783o.m20752(android.content.Context):android.location.Location");
    }
}

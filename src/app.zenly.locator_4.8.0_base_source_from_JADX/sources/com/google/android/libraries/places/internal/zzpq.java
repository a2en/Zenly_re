package com.google.android.libraries.places.internal;

import com.android.volley.toolbox.C8733j;
import java.math.RoundingMode;

public final class zzpq {
    private static final byte[] zza = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    private static final int[] zzb = {1, 10, 100, C8733j.DEFAULT_IMAGE_TIMEOUT_MS, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    private static final int[] zzc = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] zzd = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    private static int[] zze = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int zza(int i, RoundingMode roundingMode) {
        if (i > 0) {
            switch (zzps.zza[roundingMode.ordinal()]) {
                case 1:
                    boolean z = false;
                    boolean z2 = i > 0;
                    if (((i - 1) & i) == 0) {
                        z = true;
                    }
                    zzpr.zza(z & z2);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + ((~(~((-1257966797 >>> numberOfLeadingZeros) - i))) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        String str = "x";
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (((r7 == java.math.RoundingMode.HALF_EVEN) & ((r0 & 1) != 0)) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r1 > 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r5 > 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r5 < 0) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(int r5, int r6, java.math.RoundingMode r7) {
        /*
            com.google.android.libraries.places.internal.zzgg.zza(r7)
            if (r6 == 0) goto L_0x005c
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = com.google.android.libraries.places.internal.zzps.zza
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L_0x0050;
                case 2: goto L_0x0057;
                case 3: goto L_0x004d;
                case 4: goto L_0x0058;
                case 5: goto L_0x004a;
                case 6: goto L_0x0025;
                case 7: goto L_0x0025;
                case 8: goto L_0x0025;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L_0x0025:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L_0x0047
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L_0x0058
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r7 = r0 & 1
            if (r7 == 0) goto L_0x0042
            r7 = 1
            goto L_0x0043
        L_0x0042:
            r7 = 0
        L_0x0043:
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0047:
            if (r1 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x004a:
            if (r5 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x004d:
            if (r5 >= 0) goto L_0x0057
            goto L_0x0058
        L_0x0050:
            if (r1 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            com.google.android.libraries.places.internal.zzpr.zza(r2)
        L_0x0057:
            r2 = 0
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            int r0 = r0 + r5
        L_0x005b:
            return r0
        L_0x005c:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzpq.zza(int, int, java.math.RoundingMode):int");
    }
}

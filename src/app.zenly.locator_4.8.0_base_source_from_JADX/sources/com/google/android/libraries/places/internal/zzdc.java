package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.DropBoxManager;
import java.util.LinkedHashMap;
import java.util.List;

public final class zzdc {
    private static DropBoxManager zza;
    private static final LinkedHashMap<Long, Integer> zzb = new zzde(16, 0.75f, true);
    private static String zzc;

    public static synchronized void zza(Context context, boolean z) {
        synchronized (zzdc.class) {
            if (zza == null) {
                zza = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                zzc = "com.google.android.libraries.places";
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void zza(java.lang.Throwable r14) {
        /*
            java.lang.Class<com.google.android.libraries.places.internal.zzdc> r0 = com.google.android.libraries.places.internal.zzdc.class
            monitor-enter(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x008e }
            long r1 = r1.getId()     // Catch:{ all -> 0x008e }
            int r3 = r14.hashCode()     // Catch:{ all -> 0x008e }
            java.util.LinkedHashMap<java.lang.Long, java.lang.Integer> r4 = zzb     // Catch:{ all -> 0x008e }
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x008e }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x008e }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x0025
            int r4 = r4.intValue()     // Catch:{ all -> 0x008e }
            if (r4 != r3) goto L_0x0025
            monitor-exit(r0)
            return
        L_0x0025:
            android.os.DropBoxManager r4 = zza     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x008c
            android.os.DropBoxManager r4 = zza     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "system_app_crash"
            boolean r4 = r4.isTagEnabled(r5)     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x008c
            android.os.DropBoxManager r4 = zza     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "system_app_crash"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r6.<init>()     // Catch:{ all -> 0x008e }
            java.lang.String r7 = "2.0.0"
            java.lang.String r8 = "Package: %s v%d (%s)\n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x008e }
            java.lang.String r10 = zzc     // Catch:{ all -> 0x008e }
            r11 = 0
            r9[r11] = r10     // Catch:{ all -> 0x008e }
            long r12 = zza(r7)     // Catch:{ all -> 0x008e }
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x008e }
            r12 = 1
            r9[r12] = r10     // Catch:{ all -> 0x008e }
            r10 = 2
            r9[r10] = r7     // Catch:{ all -> 0x008e }
            java.lang.String r7 = java.lang.String.format(r8, r9)     // Catch:{ all -> 0x008e }
            r6.append(r7)     // Catch:{ all -> 0x008e }
            java.lang.String r7 = "Build: %s\n"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ all -> 0x008e }
            java.lang.String r9 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x008e }
            r8[r11] = r9     // Catch:{ all -> 0x008e }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x008e }
            r6.append(r7)     // Catch:{ all -> 0x008e }
            java.lang.String r7 = "\n"
            r6.append(r7)     // Catch:{ all -> 0x008e }
            java.lang.String r14 = android.util.Log.getStackTraceString(r14)     // Catch:{ all -> 0x008e }
            r6.append(r14)     // Catch:{ all -> 0x008e }
            java.lang.String r14 = r6.toString()     // Catch:{ all -> 0x008e }
            r4.addText(r5, r14)     // Catch:{ all -> 0x008e }
            java.util.LinkedHashMap<java.lang.Long, java.lang.Integer> r14 = zzb     // Catch:{ all -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x008e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x008e }
            r14.put(r1, r2)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r0)
            return
        L_0x008e:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzdc.zza(java.lang.Throwable):void");
    }

    private static long zza(String str) {
        List zza2 = zzgi.zza(zzft.zza('.')).zza((CharSequence) str);
        long j = -1;
        if (zza2.size() != 3) {
            return -1;
        }
        long j2 = 0;
        int i = 0;
        while (i < zza2.size()) {
            try {
                j2 = (j2 * 100) + ((long) Integer.parseInt((String) zza2.get(i)));
                i++;
            } catch (NumberFormatException unused) {
            }
        }
        j = j2;
        return j;
    }
}

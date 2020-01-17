package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.google.android.gms.common.util.l */
public class C10175l {

    /* renamed from: a */
    private static String f26729a;

    /* renamed from: b */
    private static int f26730b;

    /* renamed from: a */
    public static String m25688a() {
        if (f26729a == null) {
            if (f26730b == 0) {
                f26730b = Process.myPid();
            }
            f26729a = m25689a(f26730b);
        }
        return f26729a;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m25689a(int r4) {
        /*
            r0 = 0
            if (r4 > 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r1 = "/proc/"
            r2.append(r1)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            r2.append(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r4 = "/cmdline"
            r2.append(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.io.BufferedReader r4 = m25687a(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x0037, all -> 0x002c }
            java.lang.String r0 = r1.trim()     // Catch:{ IOException -> 0x0037, all -> 0x002c }
            com.google.android.gms.common.util.C10171h.m25673a(r4)
            goto L_0x003a
        L_0x002c:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0032
        L_0x0031:
            r4 = move-exception
        L_0x0032:
            com.google.android.gms.common.util.C10171h.m25673a(r0)
            throw r4
        L_0x0036:
            r4 = r0
        L_0x0037:
            com.google.android.gms.common.util.C10171h.m25673a(r4)
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C10175l.m25689a(int):java.lang.String");
    }

    /* renamed from: a */
    private static BufferedReader m25687a(String str) throws IOException {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}

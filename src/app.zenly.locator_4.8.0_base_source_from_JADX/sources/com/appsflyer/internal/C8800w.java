package com.appsflyer.internal;

import android.content.Context;
import android.util.Log;
import com.appsflyer.AFFacebookDeferredDeeplink;
import com.appsflyer.AppsFlyerLibCore;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appsflyer.internal.w */
public final class C8800w {

    /* renamed from: ˋ */
    private static C8800w f22788 = new C8800w();

    private C8800w() {
    }

    /* renamed from: ˋ */
    public static File m20767(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

    /* renamed from: ˎ */
    public static C8800w m20769() {
        return f22788;
    }

    /* renamed from: ˎ */
    public static List<AFFacebookDeferredDeeplink> m20770(Context context) {
        File[] listFiles;
        String str = AppsFlyerLibCore.LOG_TAG;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    Log.i(str, sb.toString());
                    arrayList.add(m20768(file2));
                }
            }
        } catch (Exception unused) {
            Log.i(str, "Could not cache request");
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[SYNTHETIC, Splitter:B:13:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c A[SYNTHETIC, Splitter:B:21:0x002c] */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.AFFacebookDeferredDeeplink m20768(java.io.File r4) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0029, all -> 0x0021 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0029, all -> 0x0021 }
            long r2 = r4.length()     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            int r3 = (int) r2     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            char[] r2 = new char[r3]     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r1.read(r2)     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            com.appsflyer.AFFacebookDeferredDeeplink r3 = new com.appsflyer.AFFacebookDeferredDeeplink     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r3.<init>(r2)     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r3.f22510 = r4     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return r3
        L_0x001f:
            r4 = move-exception
            goto L_0x0023
        L_0x0021:
            r4 = move-exception
            r1 = r0
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r4
        L_0x0029:
            r1 = r0
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8800w.m20768(java.io.File):com.appsflyer.AFFacebookDeferredDeeplink");
    }

    /* renamed from: ˎ */
    public static void m20771(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        String str2 = " from cache";
        sb.append(str2);
        String obj = sb.toString();
        String str3 = AppsFlyerLibCore.LOG_TAG;
        Log.i(str3, obj);
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(str);
                sb2.append(str2);
                Log.i(str3, sb2.toString(), e);
            }
        }
    }
}

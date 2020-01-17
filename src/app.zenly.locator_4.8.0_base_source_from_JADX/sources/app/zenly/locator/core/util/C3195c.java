package app.zenly.locator.core.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: app.zenly.locator.core.util.c */
public class C3195c {
    /* renamed from: a */
    public static boolean m10165a(File file, Bitmap bitmap) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r5 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r5 != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047 A[SYNTHETIC, Splitter:B:27:0x0047] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m10166a(android.content.Context r5, android.net.Uri r6) {
        /*
            r0 = 0
            r1 = 0
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            if (r5 == 0) goto L_0x0027
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0025 }
            r6.<init>()     // Catch:{ Exception -> 0x0025 }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0025 }
        L_0x0015:
            int r3 = r5.read(r2)     // Catch:{ Exception -> 0x0025 }
            r4 = -1
            if (r3 == r4) goto L_0x0020
            r6.write(r2, r1, r3)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0015
        L_0x0020:
            byte[] r0 = r6.toByteArray()     // Catch:{ Exception -> 0x0025 }
            goto L_0x0027
        L_0x0025:
            r6 = move-exception
            goto L_0x0034
        L_0x0027:
            if (r5 == 0) goto L_0x003e
        L_0x0029:
            r5.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x003e
        L_0x002d:
            goto L_0x003e
        L_0x002f:
            r6 = move-exception
            r5 = r0
            goto L_0x0045
        L_0x0032:
            r6 = move-exception
            r5 = r0
        L_0x0034:
            java.lang.String r2 = "Failed getting byte array from uri"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0044 }
            p387h.p388a.C12143a.m32032b(r6, r2, r3)     // Catch:{ all -> 0x0044 }
            if (r5 == 0) goto L_0x003e
            goto L_0x0029
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            byte[] r0 = new byte[r1]
        L_0x0043:
            return r0
        L_0x0044:
            r6 = move-exception
        L_0x0045:
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.util.C3195c.m10166a(android.content.Context, android.net.Uri):byte[]");
    }
}

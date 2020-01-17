package p333g.p339c.p344b.p345a;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: g.c.b.a.a */
public class C12031a {

    /* renamed from: a */
    private static final FileFilter f31340a = new C12032a();

    /* renamed from: g.c.b.a.a$a */
    static class C12032a implements FileFilter {
        C12032a() {
        }

        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027 A[SYNTHETIC, Splitter:B:14:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC, Splitter:B:22:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m31692a(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002b, all -> 0x0023 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x002b, all -> 0x0023 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            r2.close()     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            int r2 = m31697b(r0)     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return r2
        L_0x001f:
            r2 = move-exception
            goto L_0x0025
        L_0x0021:
            goto L_0x002c
        L_0x0023:
            r2 = move-exception
            r1 = r0
        L_0x0025:
            if (r1 == 0) goto L_0x002a
            r1.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            throw r2
        L_0x002b:
            r1 = r0
        L_0x002c:
            r2 = -1
            if (r1 == 0) goto L_0x0032
            r1.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p339c.p344b.p345a.C12031a.m31692a(java.lang.String):int");
    }

    /* renamed from: b */
    static int m31697b(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* renamed from: c */
    public static int m31698c() {
        if (VERSION.SDK_INT <= 10) {
            return 1;
        }
        int i = -1;
        try {
            int a = m31692a("/sys/devices/system/cpu/possible");
            if (a == -1) {
                a = m31692a("/sys/devices/system/cpu/present");
            }
            i = a == -1 ? m31696b() : a;
        } catch (NullPointerException | SecurityException unused) {
        }
        return i;
    }

    /* renamed from: b */
    private static int m31696b() {
        return new File("/sys/devices/system/cpu/").listFiles(f31340a).length;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0063 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m31691a() {
        /*
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = -1
        L_0x0004:
            int r4 = m31698c()     // Catch:{ IOException -> 0x008f }
            if (r2 >= r4) goto L_0x006f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008f }
            r4.<init>()     // Catch:{ IOException -> 0x008f }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.append(r5)     // Catch:{ IOException -> 0x008f }
            r4.append(r2)     // Catch:{ IOException -> 0x008f }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ IOException -> 0x008f }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x008f }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x008f }
            r5.<init>(r4)     // Catch:{ IOException -> 0x008f }
            boolean r4 = r5.exists()     // Catch:{ IOException -> 0x008f }
            if (r4 == 0) goto L_0x006c
            boolean r4 = r5.canRead()     // Catch:{ IOException -> 0x008f }
            if (r4 == 0) goto L_0x006c
            r4 = 128(0x80, float:1.794E-43)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x008f }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008f }
            r6.<init>(r5)     // Catch:{ IOException -> 0x008f }
            r6.read(r4)     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            r5 = 0
        L_0x003e:
            byte r7 = r4[r5]     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            boolean r7 = java.lang.Character.isDigit(r7)     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            if (r7 == 0) goto L_0x004c
            int r7 = r4.length     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            if (r5 >= r7) goto L_0x004c
            int r5 = r5 + 1
            goto L_0x003e
        L_0x004c:
            java.lang.String r7 = new java.lang.String     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            r7.<init>(r4, r0, r5)     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            int r4 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            int r5 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
            if (r5 <= r3) goto L_0x0063
            int r3 = r4.intValue()     // Catch:{ NumberFormatException -> 0x0063, all -> 0x0067 }
        L_0x0063:
            r6.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x006c
        L_0x0067:
            r0 = move-exception
            r6.close()     // Catch:{ IOException -> 0x008f }
            throw r0     // Catch:{ IOException -> 0x008f }
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x006f:
            if (r3 != r1) goto L_0x008e
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008f }
            java.lang.String r2 = "/proc/cpuinfo"
            r0.<init>(r2)     // Catch:{ IOException -> 0x008f }
            java.lang.String r2 = "cpu MHz"
            int r2 = m31693a(r2, r0)     // Catch:{ all -> 0x0089 }
            int r2 = r2 * 1000
            if (r2 <= r3) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r2 = r3
        L_0x0084:
            r0.close()     // Catch:{ IOException -> 0x008f }
            r1 = r2
            goto L_0x008f
        L_0x0089:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x008f }
            throw r2     // Catch:{ IOException -> 0x008f }
        L_0x008e:
            r1 = r3
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p339c.p344b.p345a.C12031a.m31691a():int");
    }

    @TargetApi(16)
    /* renamed from: a */
    public static long m31695a(Context context) {
        FileInputStream fileInputStream;
        if (VERSION.SDK_INT >= 16) {
            MemoryInfo memoryInfo = new MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        long j = -1;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
            j = ((long) m31693a("MemTotal", fileInputStream)) * 1024;
            fileInputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
        return j;
    }

    /* renamed from: a */
    private static int m31693a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (true) {
                        if (i2 >= read) {
                            continue;
                            break;
                        }
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            break;
                        } else if (i3 == str.length() - 1) {
                            return m31694a(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                }
                i++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }

    /* renamed from: a */
    private static int m31694a(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }
}

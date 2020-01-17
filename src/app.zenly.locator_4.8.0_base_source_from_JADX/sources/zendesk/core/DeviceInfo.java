package zendesk.core;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import com.zendesk.logger.Logger;
import com.zendesk.util.C12014d;
import com.zendesk.util.C12017g;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class DeviceInfo {
    private final ActivityManager activityManager;
    private final Context context;

    DeviceInfo(Context context2) {
        this.context = context2;
        this.activityManager = (ActivityManager) context2.getSystemService("activity");
    }

    @TargetApi(18)
    private long getAvailableInternalDiskMemory() {
        long blockSizeLong;
        long availableBlocksLong;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (VERSION.SDK_INT < 18) {
            blockSizeLong = (long) statFs.getBlockSize();
            availableBlocksLong = (long) statFs.getAvailableBlocks();
        } else {
            blockSizeLong = statFs.getBlockSizeLong();
            availableBlocksLong = statFs.getAvailableBlocksLong();
        }
        return availableBlocksLong * blockSizeLong;
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("level", -1);
        }
        return -1;
    }

    private String getBytesInMb(long j) {
        return String.valueOf(j / 1048576);
    }

    public static Locale getCurrentLocale(Context context2) {
        if (VERSION.SDK_INT >= 24) {
            return context2.getResources().getConfiguration().getLocales().get(0);
        }
        return context2.getResources().getConfiguration().locale;
    }

    private long getDiskSize() {
        return getTotalInternalDiskSize();
    }

    private String getManufacturer() {
        if ("unknown".equals(Build.MANUFACTURER) || C12017g.m31659c(Build.MANUFACTURER)) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    private String getOS() {
        boolean z = "unknown".equals(VERSION.RELEASE) || C12017g.m31659c(VERSION.RELEASE);
        boolean z2 = VERSION.SDK_INT == 0;
        if (z && z2) {
            return "";
        }
        return String.format(Locale.US, "%s/%s", new Object[]{VERSION.RELEASE, Integer.valueOf(VERSION.SDK_INT)});
    }

    @TargetApi(18)
    private long getTotalInternalDiskSize() {
        long blockSizeLong;
        long blockCountLong;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (VERSION.SDK_INT < 18) {
            blockSizeLong = (long) statFs.getBlockSize();
            blockCountLong = (long) statFs.getBlockCount();
        } else {
            blockSizeLong = statFs.getBlockSizeLong();
            blockCountLong = statFs.getBlockCountLong();
        }
        return blockCountLong * blockSizeLong;
    }

    @TargetApi(16)
    private long getTotalMemory() {
        String str = "DeviceInfo";
        if (VERSION.SDK_INT >= 16) {
            Logger.m31608a(str, "Using getTotalMemoryApi() to determine memory", new Object[0]);
            return getTotalMemoryApi();
        }
        Logger.m31608a(str, "Using getTotalMemoryCompat() to determine memory", new Object[0]);
        return getTotalMemoryCompat();
    }

    private long getTotalMemoryApi() {
        MemoryInfo memoryInfo = new MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e A[SYNTHETIC, Splitter:B:18:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[Catch:{ NoSuchElementException -> 0x00a9, NumberFormatException -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4 A[SYNTHETIC, Splitter:B:34:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long getTotalMemoryCompat() {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to close /proc/meminfo file stream: "
            java.lang.String r1 = "DeviceInfo"
            r2 = 0
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0041 }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ IOException -> 0x0041 }
            java.lang.String r6 = "/proc/meminfo"
            r5.<init>(r6)     // Catch:{ IOException -> 0x0041 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0041 }
            java.lang.String r3 = r4.readLine()     // Catch:{ IOException -> 0x003a, all -> 0x0034 }
            r4.close()     // Catch:{ IOException -> 0x001a }
            goto L_0x007d
        L_0x001a:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = r4.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.zendesk.logger.Logger.m31612c(r1, r0, r4, r5)
            goto L_0x007d
        L_0x0034:
            r3 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L_0x00b2
        L_0x003a:
            r3 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L_0x0042
        L_0x003f:
            r4 = move-exception
            goto L_0x00b2
        L_0x0041:
            r4 = move-exception
        L_0x0042:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r5.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r6 = "Failed to determine total memory from /proc/meminfo: "
            r5.append(r6)     // Catch:{ all -> 0x003f }
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x003f }
            r5.append(r6)     // Catch:{ all -> 0x003f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x003f }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x003f }
            com.zendesk.logger.Logger.m31607a(r1, r5, r4, r6)     // Catch:{ all -> 0x003f }
            if (r3 == 0) goto L_0x007b
            r3.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x007b
        L_0x0062:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = r3.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.zendesk.logger.Logger.m31612c(r1, r0, r3, r4)
        L_0x007b:
            java.lang.String r3 = ""
        L_0x007d:
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r0.<init>(r3)
            r3 = -1
            int r5 = r0.countTokens()     // Catch:{ NoSuchElementException -> 0x00a9, NumberFormatException -> 0x00a0 }
            r6 = 3
            if (r5 != r6) goto L_0x00b1
            r0.nextToken()     // Catch:{ NoSuchElementException -> 0x00a9, NumberFormatException -> 0x00a0 }
            java.lang.String r0 = r0.nextToken()     // Catch:{ NoSuchElementException -> 0x00a9, NumberFormatException -> 0x00a0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NoSuchElementException -> 0x00a9, NumberFormatException -> 0x00a0 }
            long r0 = r0.longValue()     // Catch:{ NoSuchElementException -> 0x00a9, NumberFormatException -> 0x00a0 }
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            r3 = r0
            goto L_0x00b1
        L_0x00a0:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = "Error reading memory size from proc/meminfo"
            com.zendesk.logger.Logger.m31607a(r1, r5, r0, r2)
            goto L_0x00b1
        L_0x00a9:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = "Error reading tokens from the /proc/meminfo"
            com.zendesk.logger.Logger.m31607a(r1, r5, r0, r2)
        L_0x00b1:
            return r3
        L_0x00b2:
            if (r3 == 0) goto L_0x00d1
            r3.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00d1
        L_0x00b8:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = r3.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.zendesk.logger.Logger.m31612c(r1, r0, r3, r2)
        L_0x00d1:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.core.DeviceInfo.getTotalMemoryCompat():long");
    }

    private long getUsedDiskSpace() {
        return getDiskSize() - getAvailableInternalDiskMemory();
    }

    private long getUsedMemory() {
        MemoryInfo memoryInfo = new MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    /* access modifiers changed from: 0000 */
    public Map<String, String> getInfo() {
        HashMap hashMap = new HashMap();
        String os = getOS();
        String model = getModel();
        long usedMemory = getUsedMemory();
        long totalMemory = getTotalMemory();
        long diskSize = getDiskSize();
        long usedDiskSpace = getUsedDiskSpace();
        int batteryLevel = getBatteryLevel();
        String locale = getLocale();
        String manufacturer = getManufacturer();
        if (!C12017g.m31659c(os)) {
            hashMap.put("os", os);
        }
        if (!C12017g.m31659c(model)) {
            hashMap.put("model", model);
        }
        if (usedMemory != -1) {
            hashMap.put("memory_used", getBytesInMb(usedMemory));
        }
        if (totalMemory != -1) {
            hashMap.put("memory_total", getBytesInMb(totalMemory));
        }
        if (diskSize != -1) {
            hashMap.put("disk_total", getBytesInMb(diskSize));
        }
        if (usedDiskSpace != -1) {
            hashMap.put("disk_used", getBytesInMb(usedDiskSpace));
        }
        if (batteryLevel != -1) {
            hashMap.put("battery_level", String.valueOf(batteryLevel));
        }
        if (!C12017g.m31659c(locale)) {
            hashMap.put("sys_locale", locale);
        }
        if (!C12017g.m31659c(manufacturer)) {
            hashMap.put("manufacturer", manufacturer);
        }
        hashMap.put("platform", "Android");
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    public String getLocale() {
        return C12014d.m31647a(Locale.getDefault());
    }

    /* access modifiers changed from: 0000 */
    public String getModel() {
        String str = "unknown";
        boolean z = str.equals(Build.MODEL) || C12017g.m31659c(Build.MODEL);
        boolean z2 = str.equals(Build.DEVICE) || C12017g.m31659c(Build.DEVICE);
        if (z && z2) {
            return "";
        }
        if (Build.MODEL.equals(Build.DEVICE)) {
            return Build.MODEL;
        }
        return String.format(Locale.US, "%s/%s", new Object[]{Build.MODEL, Build.DEVICE});
    }
}

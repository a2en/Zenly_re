package p389io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: io.fabric.sdk.android.services.common.h */
public class C12180h {

    /* renamed from: a */
    private static Boolean f31660a;

    /* renamed from: b */
    private static final char[] f31661b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    private static long f31662c = -1;

    /* renamed from: d */
    public static final Comparator<File> f31663d = new C12181a();

    /* renamed from: io.fabric.sdk.android.services.common.h$a */
    static class C12181a implements Comparator<File> {
        C12181a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.h$b */
    enum C12182b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: o */
        private static final Map<String, C12182b> f31674o = null;

        static {
            f31674o = new HashMap(4);
            f31674o.put("armeabi-v7a", ARMV7);
            f31674o.put("armeabi", ARMV6);
            f31674o.put("arm64-v8a", ARM64);
            f31674o.put("x86", X86_32);
        }

        /* renamed from: a */
        static C12182b m32283a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C12154c.m32113f().mo35954d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            C12182b bVar = (C12182b) f31674o.get(str.toLowerCase(Locale.US));
            if (bVar == null) {
                bVar = UNKNOWN;
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public static String m32243a(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    /* renamed from: a */
    public static String m32244a(File file, String str) {
        BufferedReader bufferedReader;
        String str2 = "Failed to close system file reader.";
        String str3 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str3 = split[1];
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error parsing ");
                            sb.append(file);
                            C12154c.m32113f().mo35957e("Fabric", sb.toString(), e);
                            m32254a((Closeable) bufferedReader, str2);
                            return str3;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error parsing ");
                sb2.append(file);
                C12154c.m32113f().mo35957e("Fabric", sb2.toString(), e);
                m32254a((Closeable) bufferedReader, str2);
                return str3;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                m32254a((Closeable) bufferedReader, str2);
                throw th;
            }
            m32254a((Closeable) bufferedReader, str2);
        }
        return str3;
    }

    /* renamed from: b */
    public static synchronized long m32259b() {
        long j;
        synchronized (C12180h.class) {
            if (f31662c == -1) {
                long j2 = 0;
                String a = m32244a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a)) {
                    String upperCase = a.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m32241a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m32241a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m32241a(upperCase, "GB", 1073741824);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            C12154c.m32113f().mo35954d("Fabric", sb.toString());
                        }
                    } catch (NumberFormatException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        C12154c.m32113f().mo35957e("Fabric", sb2.toString(), e);
                    }
                }
                f31662c = j2;
            }
            j = f31662c;
        }
        return j;
    }

    /* renamed from: c */
    public static String m32266c(String str) {
        return m32247a(str, "SHA-1");
    }

    /* renamed from: d */
    public static String m32270d(String str) {
        return m32247a(str, "SHA-256");
    }

    /* renamed from: e */
    public static Float m32271e(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    /* renamed from: f */
    public static int m32272f(Context context) {
        int i = m32278l(context) ? 1 : 0;
        if (m32279m(context)) {
            i |= 2;
        }
        return m32268c() ? i | 4 : i;
    }

    /* renamed from: g */
    public static boolean m32273g(Context context) {
        boolean z = false;
        if (m32278l(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public static String m32274h(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            return context.getResources().getResourcePackageName(i);
        } catch (NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: i */
    public static SharedPreferences m32275i(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* renamed from: j */
    public static boolean m32276j(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: k */
    public static boolean m32277k(Context context) {
        if (f31660a == null) {
            f31660a = Boolean.valueOf(m32258a(context, "com.crashlytics.Trace", false));
        }
        return f31660a.booleanValue();
    }

    /* renamed from: l */
    public static boolean m32278l(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!"sdk".equals(Build.PRODUCT)) {
            if (!"google_sdk".equals(Build.PRODUCT) && string != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m32279m(Context context) {
        boolean l = m32278l(context);
        String str = Build.TAGS;
        if ((!l && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (l || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static String m32280n(Context context) {
        String str = "string";
        int a = m32237a(context, "io.fabric.android.build_id", str);
        if (a == 0) {
            a = m32237a(context, "com.crashlytics.android.build_id", str);
        }
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Build ID is: ");
        sb.append(string);
        f.mo35954d("Fabric", sb.toString());
        return string;
    }

    /* renamed from: o */
    public static String m32281o(Context context) {
        int a = m32237a(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Unity Editor version is: ");
        sb.append(string);
        f.mo35954d("Fabric", sb.toString());
        return string;
    }

    /* renamed from: c */
    public static void m32267c(Context context, String str) {
        if (m32277k(context)) {
            C12154c.m32113f().mo35954d("Fabric", str);
        }
    }

    /* renamed from: d */
    public static int m32269d(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    /* renamed from: c */
    public static boolean m32268c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: c */
    public static String m32265c(Context context) {
        InputStream inputStream;
        String str = "Failed to close icon input stream.";
        String str2 = null;
        try {
            inputStream = context.getResources().openRawResource(m32269d(context));
            try {
                String a = m32245a(inputStream);
                if (!m32264b(a)) {
                    str2 = a;
                }
                m32254a((Closeable) inputStream, str);
                return str2;
            } catch (Exception e) {
                e = e;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not calculate hash for app icon:");
                    sb.append(e.getMessage());
                    C12154c.m32113f().mo35967w("Fabric", sb.toString());
                    m32254a((Closeable) inputStream, str);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    m32254a((Closeable) inputStream, str);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not calculate hash for app icon:");
            sb2.append(e.getMessage());
            C12154c.m32113f().mo35967w("Fabric", sb2.toString());
            m32254a((Closeable) inputStream, str);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m32254a((Closeable) inputStream, str);
            throw th;
        }
    }

    /* renamed from: a */
    public static int m32236a() {
        return C12182b.m32283a().ordinal();
    }

    /* renamed from: a */
    static long m32241a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: a */
    public static RunningAppProcessInfo m32242a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m32262b(InputStream inputStream) throws IOException {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: b */
    public static String m32261b(Context context, String str) {
        int a = m32237a(context, str, "string");
        return a > 0 ? context.getString(a) : "";
    }

    /* renamed from: a */
    public static String m32245a(InputStream inputStream) {
        return m32246a(inputStream, "SHA-1");
    }

    /* renamed from: a */
    private static String m32247a(String str, String str2) {
        return m32249a(str.getBytes(), str2);
    }

    /* renamed from: b */
    public static boolean m32264b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    private static String m32246a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m32248a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            C12154c.m32113f().mo35957e("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    /* renamed from: b */
    public static String m32260b(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public static boolean m32263b(Context context) {
        if (!m32257a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m32249a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m32248a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(str);
            sb.append(", returning empty string.");
            f.mo35957e("Fabric", sb.toString(), e);
            return "";
        }
    }

    /* renamed from: a */
    public static String m32250a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m32266c(sb2);
        }
        return null;
    }

    /* renamed from: a */
    public static long m32239a(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: a */
    public static long m32240a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: a */
    public static void m32252a(Context context, String str, Throwable th) {
        if (m32277k(context)) {
            C12154c.m32113f().mo35956e("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m32251a(Context context, int i, String str, String str2) {
        if (m32277k(context)) {
            C12154c.m32113f().log(i, "Fabric", str2);
        }
    }

    /* renamed from: a */
    public static boolean m32258a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = m32237a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                int a2 = m32237a(context, str, "string");
                if (a2 > 0) {
                    return Boolean.parseBoolean(context.getString(a2));
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static int m32237a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m32274h(context));
    }

    /* renamed from: a */
    public static int m32238a(Context context, boolean z) {
        Float e = m32271e(context);
        if (!z || e == null) {
            return 1;
        }
        if (((double) e.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) e.floatValue()) < 99.0d ? 2 : 0;
    }

    /* renamed from: a */
    public static String m32248a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f31661b;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static void m32254a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C12154c.m32113f().mo35957e("Fabric", str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m32255a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                C12154c.m32113f().mo35957e("Fabric", str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m32256a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m32253a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m32257a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}

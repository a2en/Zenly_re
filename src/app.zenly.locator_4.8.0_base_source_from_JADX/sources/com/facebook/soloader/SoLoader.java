package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {

    /* renamed from: a */
    static final boolean f26012a;

    /* renamed from: b */
    static SoFileLoader f26013b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f26014c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static C9926j[] f26015d = null;

    /* renamed from: e */
    private static int f26016e = 0;

    /* renamed from: f */
    private static C9927k[] f26017f;

    /* renamed from: g */
    private static C9909b f26018g;

    /* renamed from: h */
    private static final HashSet<String> f26019h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f26020i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f26021j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static SystemLoadLibraryWrapper f26022k = null;

    /* renamed from: l */
    private static int f26023l;

    @C9911d
    @TargetApi(14)
    private static class Api14Utils {
        private Api14Utils() {
        }

        /* renamed from: a */
        public static String m24775a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("ClassLoader ");
                sb.append(classLoader.getClass().getName());
                sb.append(" should be of type BaseDexClassLoader");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$a */
    static class C9905a implements SoFileLoader {

        /* renamed from: a */
        final /* synthetic */ boolean f26024a;

        /* renamed from: b */
        final /* synthetic */ String f26025b;

        /* renamed from: c */
        final /* synthetic */ String f26026c;

        /* renamed from: d */
        final /* synthetic */ Runtime f26027d;

        /* renamed from: e */
        final /* synthetic */ Method f26028e;

        C9905a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f26024a = z;
            this.f26025b = str;
            this.f26026c = str2;
            this.f26027d = runtime;
            this.f26028e = method;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String m24776a(java.lang.String r7) {
            /*
                r6 = this;
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r0.<init>(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                java.lang.String r7 = "MD5"
                java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r1.<init>(r0)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r0 = 4096(0x1000, float:5.74E-42)
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
            L_0x0014:
                int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                r3 = 0
                if (r2 <= 0) goto L_0x001f
                r7.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                goto L_0x0014
            L_0x001f:
                java.lang.String r0 = "%32x"
                r2 = 1
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                byte[] r7 = r7.digest()     // Catch:{ all -> 0x0037 }
                r5.<init>(r2, r7)     // Catch:{ all -> 0x0037 }
                r4[r3] = r5     // Catch:{ all -> 0x0037 }
                java.lang.String r7 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                r1.close()     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                goto L_0x0054
            L_0x0037:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x0039 }
            L_0x0039:
                r0 = move-exception
                r1.close()     // Catch:{ all -> 0x003e }
                goto L_0x0042
            L_0x003e:
                r1 = move-exception
                r7.addSuppressed(r1)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
            L_0x0042:
                throw r0     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
            L_0x0043:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
                goto L_0x0054
            L_0x0049:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
                goto L_0x0054
            L_0x004f:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
            L_0x0054:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C9905a.m24776a(java.lang.String):java.lang.String");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            r0 = new java.lang.StringBuilder();
            r0.append("Error when loading lib: ");
            r0.append(r1);
            r0.append(" lib hash: ");
            r0.append(m24776a(r9));
            r0.append(" search path is ");
            r0.append(r10);
            android.util.Log.e("SoLoader", r0.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void load(java.lang.String r9, int r10) {
            /*
                r8 = this;
                boolean r0 = r8.f26024a
                if (r0 == 0) goto L_0x00bb
                r0 = 4
                r10 = r10 & r0
                r1 = 1
                r2 = 0
                if (r10 != r0) goto L_0x000c
                r10 = 1
                goto L_0x000d
            L_0x000c:
                r10 = 0
            L_0x000d:
                if (r10 == 0) goto L_0x0012
                java.lang.String r10 = r8.f26025b
                goto L_0x0014
            L_0x0012:
                java.lang.String r10 = r8.f26026c
            L_0x0014:
                r0 = 0
                java.lang.Runtime r3 = r8.f26027d     // Catch:{ IllegalAccessException -> 0x0076, IllegalArgumentException -> 0x0074, InvocationTargetException -> 0x0072 }
                monitor-enter(r3)     // Catch:{ IllegalAccessException -> 0x0076, IllegalArgumentException -> 0x0074, InvocationTargetException -> 0x0072 }
                java.lang.reflect.Method r4 = r8.f26028e     // Catch:{ all -> 0x006d }
                java.lang.Runtime r5 = r8.f26027d     // Catch:{ all -> 0x006d }
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x006d }
                r6[r2] = r9     // Catch:{ all -> 0x006d }
                java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x006d }
                r6[r1] = r2     // Catch:{ all -> 0x006d }
                r1 = 2
                r6[r1] = r10     // Catch:{ all -> 0x006d }
                java.lang.Object r1 = r4.invoke(r5, r6)     // Catch:{ all -> 0x006d }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x006d }
                if (r1 != 0) goto L_0x0067
                monitor-exit(r3)     // Catch:{ all -> 0x0062 }
                if (r1 == 0) goto L_0x00be
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error when loading lib: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = " lib hash: "
                r0.append(r1)
                java.lang.String r9 = r8.m24776a(r9)
                r0.append(r9)
                java.lang.String r9 = " search path is "
                r0.append(r9)
                r0.append(r10)
                java.lang.String r9 = r0.toString()
                java.lang.String r10 = "SoLoader"
                android.util.Log.e(r10, r9)
                goto L_0x00be
            L_0x0062:
                r0 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
                goto L_0x006e
            L_0x0067:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0062 }
                r0.<init>(r1)     // Catch:{ all -> 0x0062 }
                throw r0     // Catch:{ all -> 0x0062 }
            L_0x006d:
                r1 = move-exception
            L_0x006e:
                monitor-exit(r3)     // Catch:{ all -> 0x006d }
                throw r1     // Catch:{ IllegalAccessException -> 0x0076, IllegalArgumentException -> 0x0074, InvocationTargetException -> 0x0072 }
            L_0x0070:
                r1 = move-exception
                goto L_0x008e
            L_0x0072:
                r1 = move-exception
                goto L_0x0077
            L_0x0074:
                r1 = move-exception
                goto L_0x0077
            L_0x0076:
                r1 = move-exception
            L_0x0077:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
                r2.<init>()     // Catch:{ all -> 0x0070 }
                java.lang.String r3 = "Error: Cannot load "
                r2.append(r3)     // Catch:{ all -> 0x0070 }
                r2.append(r9)     // Catch:{ all -> 0x0070 }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0070 }
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0070 }
                r2.<init>(r0, r1)     // Catch:{ all -> 0x0070 }
                throw r2     // Catch:{ all -> 0x0070 }
            L_0x008e:
                if (r0 == 0) goto L_0x00ba
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error when loading lib: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = " lib hash: "
                r2.append(r0)
                java.lang.String r9 = r8.m24776a(r9)
                r2.append(r9)
                java.lang.String r9 = " search path is "
                r2.append(r9)
                r2.append(r10)
                java.lang.String r9 = r2.toString()
                java.lang.String r10 = "SoLoader"
                android.util.Log.e(r10, r9)
            L_0x00ba:
                throw r1
            L_0x00bb:
                java.lang.System.load(r9)
            L_0x00be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C9905a.load(java.lang.String, int):void");
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$b */
    public static final class C9906b extends UnsatisfiedLinkError {
        C9906b(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f26012a = z;
    }

    /* renamed from: a */
    public static void m24763a(Context context, int i) throws IOException {
        m24764a(context, i, (SoFileLoader) null);
    }

    /* renamed from: b */
    private static void m24772b(Context context, int i, SoFileLoader soFileLoader) throws IOException {
        int i2;
        String str = "init exiting";
        String str2 = "SoLoader";
        f26014c.writeLock().lock();
        try {
            if (f26015d == null) {
                Log.d(str2, "init start");
                f26023l = i;
                ArrayList arrayList = new ArrayList();
                String str3 = System.getenv("LD_LIBRARY_PATH");
                if (str3 == null) {
                    str3 = "/vendor/lib:/system/lib";
                }
                String[] split = str3.split(":");
                for (int i3 = 0; i3 < split.length; i3++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("adding system library source: ");
                    sb.append(split[i3]);
                    Log.d(str2, sb.toString());
                    arrayList.add(new C9910c(new File(split[i3]), 2));
                }
                if (context != null) {
                    String str4 = "lib-main";
                    if ((i & 1) != 0) {
                        f26017f = null;
                        Log.d(str2, "adding exo package source: lib-main");
                        arrayList.add(0, new C9912e(context, str4));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                            i2 = 0;
                        } else {
                            f26018g = new C9909b(context, VERSION.SDK_INT <= 17 ? 1 : 0);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("adding application source: ");
                            sb2.append(f26018g.toString());
                            Log.d(str2, sb2.toString());
                            arrayList.add(0, f26018g);
                            i2 = 1;
                        }
                        if ((f26023l & 8) != 0) {
                            f26017f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            C9907a aVar = new C9907a(context, file, str4, i2);
                            arrayList2.add(aVar);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("adding backup source from : ");
                            sb3.append(aVar.toString());
                            Log.d(str2, sb3.toString());
                            if (VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d(str2, "adding backup sources from split apks");
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    File file2 = new File(strArr[i4]);
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("lib-");
                                    int i6 = i5 + 1;
                                    sb4.append(i5);
                                    C9907a aVar2 = new C9907a(context, file2, sb4.toString(), i2);
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("adding backup source: ");
                                    sb5.append(aVar2.toString());
                                    Log.d(str2, sb5.toString());
                                    arrayList2.add(aVar2);
                                    i4++;
                                    i5 = i6;
                                }
                            }
                            f26017f = (C9927k[]) arrayList2.toArray(new C9927k[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                C9926j[] jVarArr = (C9926j[]) arrayList.toArray(new C9926j[arrayList.size()]);
                int c = m24774c();
                int length2 = jVarArr.length;
                while (true) {
                    int i7 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Preparing SO source: ");
                    sb6.append(jVarArr[i7]);
                    Log.d(str2, sb6.toString());
                    jVarArr[i7].mo26771a(c);
                    length2 = i7;
                }
                f26015d = jVarArr;
                f26016e++;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("init finish: ");
                sb7.append(f26015d.length);
                sb7.append(" SO sources prepared");
                Log.d(str2, sb7.toString());
            }
        } finally {
            Log.d(str2, str);
            f26014c.writeLock().unlock();
        }
    }

    /* renamed from: c */
    private static int m24774c() {
        f26014c.writeLock().lock();
        try {
            return (f26023l & 2) != 0 ? 1 : 0;
        } finally {
            f26014c.writeLock().unlock();
        }
    }

    /* renamed from: a */
    private static void m24764a(Context context, int i, SoFileLoader soFileLoader) throws IOException {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m24765a(soFileLoader);
            m24772b(context, i, soFileLoader);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: a */
    private static synchronized void m24765a(SoFileLoader soFileLoader) {
        synchronized (SoLoader.class) {
            if (soFileLoader != null) {
                f26013b = soFileLoader;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method b = m24771b();
            boolean z = b != null;
            String a = z ? Api14Utils.m24775a() : null;
            C9905a aVar = new C9905a(z, a, m24770b(a), runtime, b);
            f26013b = aVar;
        }
    }

    /* renamed from: a */
    public static boolean m24767a(String str) {
        return m24768a(str, 0);
    }

    /* renamed from: a */
    public static boolean m24768a(String str, int i) throws UnsatisfiedLinkError {
        boolean z;
        f26014c.readLock().lock();
        try {
            if (f26015d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    m24762a();
                } else {
                    synchronized (SoLoader.class) {
                        z = !f26019h.contains(str);
                        if (z) {
                            if (f26022k != null) {
                                f26022k.loadLibrary(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    f26014c.readLock().unlock();
                    return z;
                }
            }
            f26014c.readLock().unlock();
            String b = C9923h.m24813b(str);
            return m24769a(System.mapLibraryName(b != null ? b : str), str, b, i | 2, null);
        } catch (Throwable th) {
            f26014c.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (f26019h.contains(r8) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r10 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        if (r1 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
        r5 = "SoLoader";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("About to load: ");
        r6.append(r8);
        android.util.Log.d(r5, r6.toString());
        m24766a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006c, code lost:
        r11 = "SoLoader";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r12 = new java.lang.StringBuilder();
        r12.append("Loaded: ");
        r12.append(r8);
        android.util.Log.d(r11, r12.toString());
        f26019h.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008d, code lost:
        r9 = r8.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0091, code lost:
        if (r9 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a0, code lost:
        throw new com.facebook.soloader.SoLoader.C9906b(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a1, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a2, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a8, code lost:
        throw new java.lang.RuntimeException(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b0, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b8, code lost:
        if (f26021j.contains(r9) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ba, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00bb, code lost:
        if (r10 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00bd, code lost:
        if (r2 != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c1, code lost:
        if (f26012a == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c3, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("MergedSoMapping.invokeJniOnload[");
        r10.append(r9);
        r10.append("]");
        com.facebook.soloader.Api18TraceUtils.m24761a(r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00dc, code lost:
        r10 = "SoLoader";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r11 = new java.lang.StringBuilder();
        r11.append("About to merge: ");
        r11.append(r9);
        r11.append(" / ");
        r11.append(r8);
        android.util.Log.d(r10, r11.toString());
        com.facebook.soloader.C9923h.m24812a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fe, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ff, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0102, code lost:
        if (f26012a != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0104, code lost:
        com.facebook.soloader.Api18TraceUtils.m24760a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0107, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0108, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x010b, code lost:
        return !r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m24769a(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, android.os.StrictMode.ThreadPolicy r12) {
        /*
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            r2 = 0
            if (r1 != 0) goto L_0x0012
            java.util.Set<java.lang.String> r1 = f26021j
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x0012
            return r2
        L_0x0012:
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = f26019h     // Catch:{ all -> 0x010f }
            boolean r1 = r1.contains(r8)     // Catch:{ all -> 0x010f }
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r10 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            return r2
        L_0x0020:
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r4 = f26020i     // Catch:{ all -> 0x010f }
            boolean r4 = r4.containsKey(r8)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.Object> r4 = f26020i     // Catch:{ all -> 0x010f }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ all -> 0x010f }
            goto L_0x003c
        L_0x0032:
            java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x010f }
            r4.<init>()     // Catch:{ all -> 0x010f }
            java.util.Map<java.lang.String, java.lang.Object> r5 = f26020i     // Catch:{ all -> 0x010f }
            r5.put(r8, r4)     // Catch:{ all -> 0x010f }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            monitor-enter(r4)
            if (r1 != 0) goto L_0x00ac
            monitor-enter(r0)     // Catch:{ all -> 0x010c }
            java.util.HashSet<java.lang.String> r5 = f26019h     // Catch:{ all -> 0x00a9 }
            boolean r5 = r5.contains(r8)     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x004f
            if (r10 != 0) goto L_0x004e
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r4)     // Catch:{ all -> 0x010c }
            return r2
        L_0x004e:
            r1 = 1
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            if (r1 != 0) goto L_0x00ac
            java.lang.String r5 = "SoLoader"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a2, UnsatisfiedLinkError -> 0x008c }
            r6.<init>()     // Catch:{ IOException -> 0x00a2, UnsatisfiedLinkError -> 0x008c }
            java.lang.String r7 = "About to load: "
            r6.append(r7)     // Catch:{ IOException -> 0x00a2, UnsatisfiedLinkError -> 0x008c }
            r6.append(r8)     // Catch:{ IOException -> 0x00a2, UnsatisfiedLinkError -> 0x008c }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x00a2, UnsatisfiedLinkError -> 0x008c }
            android.util.Log.d(r5, r6)     // Catch:{ IOException -> 0x00a2, UnsatisfiedLinkError -> 0x008c }
            m24766a(r8, r11, r12)     // Catch:{ IOException -> 0x00a2, UnsatisfiedLinkError -> 0x008c }
            monitor-enter(r0)     // Catch:{ all -> 0x010c }
            java.lang.String r11 = "SoLoader"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r12.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r5 = "Loaded: "
            r12.append(r5)     // Catch:{ all -> 0x0089 }
            r12.append(r8)     // Catch:{ all -> 0x0089 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0089 }
            android.util.Log.d(r11, r12)     // Catch:{ all -> 0x0089 }
            java.util.HashSet<java.lang.String> r11 = f26019h     // Catch:{ all -> 0x0089 }
            r11.add(r8)     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            goto L_0x00ac
        L_0x0089:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r8     // Catch:{ all -> 0x010c }
        L_0x008c:
            r8 = move-exception
            java.lang.String r9 = r8.getMessage()     // Catch:{ all -> 0x010c }
            if (r9 == 0) goto L_0x00a1
            java.lang.String r10 = "unexpected e_machine:"
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x010c }
            if (r9 == 0) goto L_0x00a1
            com.facebook.soloader.SoLoader$b r9 = new com.facebook.soloader.SoLoader$b     // Catch:{ all -> 0x010c }
            r9.<init>(r8)     // Catch:{ all -> 0x010c }
            throw r9     // Catch:{ all -> 0x010c }
        L_0x00a1:
            throw r8     // Catch:{ all -> 0x010c }
        L_0x00a2:
            r8 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ all -> 0x010c }
            r9.<init>(r8)     // Catch:{ all -> 0x010c }
            throw r9     // Catch:{ all -> 0x010c }
        L_0x00a9:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            throw r8     // Catch:{ all -> 0x010c }
        L_0x00ac:
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x010c }
            if (r11 != 0) goto L_0x00bb
            java.util.Set<java.lang.String> r11 = f26021j     // Catch:{ all -> 0x010c }
            boolean r11 = r11.contains(r9)     // Catch:{ all -> 0x010c }
            if (r11 == 0) goto L_0x00bb
            r2 = 1
        L_0x00bb:
            if (r10 == 0) goto L_0x0108
            if (r2 != 0) goto L_0x0108
            boolean r10 = f26012a     // Catch:{ all -> 0x010c }
            if (r10 == 0) goto L_0x00dc
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
            r10.<init>()     // Catch:{ all -> 0x010c }
            java.lang.String r11 = "MergedSoMapping.invokeJniOnload["
            r10.append(r11)     // Catch:{ all -> 0x010c }
            r10.append(r9)     // Catch:{ all -> 0x010c }
            java.lang.String r11 = "]"
            r10.append(r11)     // Catch:{ all -> 0x010c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x010c }
            com.facebook.soloader.Api18TraceUtils.m24761a(r10)     // Catch:{ all -> 0x010c }
        L_0x00dc:
            java.lang.String r10 = "SoLoader"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r11.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r12 = "About to merge: "
            r11.append(r12)     // Catch:{ all -> 0x00ff }
            r11.append(r9)     // Catch:{ all -> 0x00ff }
            java.lang.String r12 = " / "
            r11.append(r12)     // Catch:{ all -> 0x00ff }
            r11.append(r8)     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x00ff }
            android.util.Log.d(r10, r8)     // Catch:{ all -> 0x00ff }
            com.facebook.soloader.C9923h.m24812a(r9)     // Catch:{ all -> 0x00ff }
            r8 = 0
            throw r8
        L_0x00ff:
            r8 = move-exception
            boolean r9 = f26012a     // Catch:{ all -> 0x010c }
            if (r9 == 0) goto L_0x0107
            com.facebook.soloader.Api18TraceUtils.m24760a()     // Catch:{ all -> 0x010c }
        L_0x0107:
            throw r8     // Catch:{ all -> 0x010c }
        L_0x0108:
            monitor-exit(r4)     // Catch:{ all -> 0x010c }
            r8 = r1 ^ 1
            return r8
        L_0x010c:
            r8 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010c }
            throw r8
        L_0x010f:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m24769a(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* renamed from: b */
    private static Method m24771b() {
        int i = VERSION.SDK_INT;
        if (i >= 23 && i <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class, String.class});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e);
            }
        }
        return null;
    }

    /* renamed from: b */
    static void m24773b(String str, int i, ThreadPolicy threadPolicy) {
        m24769a(str, null, null, i, threadPolicy);
    }

    /* renamed from: b */
    public static String m24770b(String str) {
        if (str == null) {
            return null;
        }
        String str2 = ":";
        String[] split = str.split(str2);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str3 : split) {
            if (!str3.contains("!")) {
                arrayList.add(str3);
            }
        }
        return TextUtils.join(str2, arrayList);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m24766a(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        boolean z2;
        f26014c.readLock().lock();
        try {
            String str2 = "couldn't find DSO to load: ";
            String str3 = "SoLoader";
            if (f26015d != null) {
                f26014c.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (f26012a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SoLoader.loadLibrary[");
                    sb.append(str);
                    sb.append("]");
                    Api18TraceUtils.m24761a(sb.toString());
                }
                int i2 = 0;
                do {
                    try {
                        f26014c.readLock().lock();
                        int i3 = f26016e;
                        int i4 = 0;
                        while (true) {
                            if (i2 == 0) {
                                if (i4 >= f26015d.length) {
                                    break;
                                }
                                i2 = f26015d[i4].mo26770a(str, i, threadPolicy);
                                if (i2 == 3 && f26017f != null) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Trying backup SoSource for ");
                                    sb2.append(str);
                                    Log.d(str3, sb2.toString());
                                    C9927k[] kVarArr = f26017f;
                                    int length = kVarArr.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= length) {
                                            break;
                                        }
                                        C9927k kVar = kVarArr[i5];
                                        kVar.mo26783a(str);
                                        int a = kVar.mo26770a(str, i, threadPolicy);
                                        if (a == 1) {
                                            i2 = a;
                                            break;
                                        }
                                        i5++;
                                    }
                                } else {
                                    i4++;
                                }
                            } else {
                                break;
                            }
                        }
                        f26014c.readLock().unlock();
                        if ((i & 2) == 2 && i2 == 0) {
                            f26014c.writeLock().lock();
                            if (f26018g != null && f26018g.mo26772a()) {
                                f26016e++;
                            }
                            z2 = f26016e != i3;
                            f26014c.writeLock().unlock();
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th) {
                        if (f26012a) {
                            Api18TraceUtils.m24760a();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str2);
                            sb3.append(str);
                            String sb4 = sb3.toString();
                            String message = th.getMessage();
                            if (message == null) {
                                message = th.toString();
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(sb4);
                            sb5.append(" caused by: ");
                            sb5.append(message);
                            String sb6 = sb5.toString();
                            Log.e(str3, sb6);
                            throw new UnsatisfiedLinkError(sb6);
                        }
                        return;
                    }
                } while (z2);
                if (f26012a) {
                    Api18TraceUtils.m24760a();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str2);
                    sb7.append(str);
                    String sb8 = sb7.toString();
                    Log.e(str3, sb8);
                    throw new UnsatisfiedLinkError(sb8);
                }
                return;
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Could not load: ");
            sb9.append(str);
            sb9.append(" because no SO source exists");
            Log.e(str3, sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str2);
            sb10.append(str);
            throw new UnsatisfiedLinkError(sb10.toString());
        } catch (Throwable th2) {
            f26014c.readLock().unlock();
            throw th2;
        }
    }

    /* renamed from: a */
    private static void m24762a() {
        f26014c.readLock().lock();
        try {
            if (f26015d == null) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            f26014c.readLock().unlock();
        }
    }
}

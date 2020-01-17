package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.clearcut.f5 */
public class C10310f5 {

    /* renamed from: a */
    private static final Uri f26992a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    private static final Uri f26993b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f26994c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f26995d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicBoolean f26996e = new AtomicBoolean();

    /* renamed from: f */
    private static HashMap<String, String> f26997f;

    /* renamed from: g */
    private static final HashMap<String, Boolean> f26998g = new HashMap<>();

    /* renamed from: h */
    private static final HashMap<String, Integer> f26999h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<String, Long> f27000i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<String, Float> f27001j = new HashMap<>();

    /* renamed from: k */
    private static Object f27002k;

    /* renamed from: l */
    private static boolean f27003l;

    /* renamed from: m */
    private static String[] f27004m = new String[0];

    /* renamed from: a */
    public static long m26109a(ContentResolver contentResolver, String str, long j) {
        Object b = m26118b(contentResolver);
        long j2 = 0;
        Long l = (Long) m26110a(f27000i, str, (T) Long.valueOf(0));
        if (l != null) {
            return l.longValue();
        }
        String a = m26111a(contentResolver, str, (String) null);
        if (a != null) {
            try {
                long parseLong = Long.parseLong(a);
                l = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        m26116a(b, f27000i, str, l);
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m26110a(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.f5> r0 = com.google.android.gms.internal.clearcut.C10310f5.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0013
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r2 = r4
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            r2 = 0
            return r2
        L_0x0016:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10310f5.m26110a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r13 = r13.query(f26992a, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r13 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r13.moveToFirst() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r15 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r15.equals(null) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        m26115a(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (r15 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008f, code lost:
        if (r13 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        m26115a(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0098, code lost:
        if (r13 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009a, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009f, code lost:
        if (r13 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a1, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a4, code lost:
        throw r14;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m26111a(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.f5> r15 = com.google.android.gms.internal.clearcut.C10310f5.class
            monitor-enter(r15)
            m26114a(r13)     // Catch:{ all -> 0x00a5 }
            java.lang.Object r0 = f27002k     // Catch:{ all -> 0x00a5 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f26997f     // Catch:{ all -> 0x00a5 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x00a5 }
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f26997f     // Catch:{ all -> 0x00a5 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a5 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a5 }
            if (r13 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r13 = r2
        L_0x001d:
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            return r13
        L_0x001f:
            java.lang.String[] r1 = f27004m     // Catch:{ all -> 0x00a5 }
            int r3 = r1.length     // Catch:{ all -> 0x00a5 }
            r4 = 0
            r5 = 0
        L_0x0024:
            r6 = 1
            if (r5 >= r3) goto L_0x0063
            r7 = r1[r5]     // Catch:{ all -> 0x00a5 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00a5 }
            if (r7 == 0) goto L_0x0060
            boolean r0 = f27003l     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x003b
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f26997f     // Catch:{ all -> 0x00a5 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x005e
        L_0x003b:
            java.lang.String[] r0 = f27004m     // Catch:{ all -> 0x00a5 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f26997f     // Catch:{ all -> 0x00a5 }
            java.util.Map r13 = m26112a(r13, r0)     // Catch:{ all -> 0x00a5 }
            r1.putAll(r13)     // Catch:{ all -> 0x00a5 }
            f27003l = r6     // Catch:{ all -> 0x00a5 }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f26997f     // Catch:{ all -> 0x00a5 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00a5 }
            if (r13 == 0) goto L_0x005e
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f26997f     // Catch:{ all -> 0x00a5 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a5 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a5 }
            if (r13 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r13 = r2
        L_0x005c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            return r13
        L_0x005e:
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            return r2
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x0024
        L_0x0063:
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            android.net.Uri r8 = f26992a
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0095
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x009e }
            if (r15 != 0) goto L_0x007b
            goto L_0x0095
        L_0x007b:
            java.lang.String r15 = r13.getString(r6)     // Catch:{ all -> 0x009e }
            if (r15 == 0) goto L_0x0088
            boolean r1 = r15.equals(r2)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0088
            r15 = r2
        L_0x0088:
            m26115a(r0, r14, r15)     // Catch:{ all -> 0x009e }
            if (r15 == 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r15 = r2
        L_0x008f:
            if (r13 == 0) goto L_0x0094
            r13.close()
        L_0x0094:
            return r15
        L_0x0095:
            m26115a(r0, r14, r2)     // Catch:{ all -> 0x009e }
            if (r13 == 0) goto L_0x009d
            r13.close()
        L_0x009d:
            return r2
        L_0x009e:
            r14 = move-exception
            if (r13 == 0) goto L_0x00a4
            r13.close()
        L_0x00a4:
            throw r14
        L_0x00a5:
            r13 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a5 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10310f5.m26111a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static Map<String, String> m26112a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f26993b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    private static void m26114a(ContentResolver contentResolver) {
        if (f26997f == null) {
            f26996e.set(false);
            f26997f = new HashMap<>();
            f27002k = new Object();
            f27003l = false;
            contentResolver.registerContentObserver(f26992a, true, new C10317g5(null));
            return;
        }
        if (f26996e.getAndSet(false)) {
            f26997f.clear();
            f26998g.clear();
            f26999h.clear();
            f27000i.clear();
            f27001j.clear();
            f27002k = new Object();
            f27003l = false;
        }
    }

    /* renamed from: a */
    private static void m26115a(Object obj, String str, String str2) {
        synchronized (C10310f5.class) {
            if (obj == f27002k) {
                f26997f.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    private static <T> void m26116a(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (C10310f5.class) {
            if (obj == f27002k) {
                hashMap.put(str, t);
                f26997f.remove(str);
            }
        }
    }

    /* renamed from: a */
    public static boolean m26117a(ContentResolver contentResolver, String str, boolean z) {
        Object b = m26118b(contentResolver);
        Boolean bool = (Boolean) m26110a(f26998g, str, (T) Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String a = m26111a(contentResolver, str, (String) null);
        if (a != null && !a.equals("")) {
            if (f26994c.matcher(a).matches()) {
                bool = Boolean.valueOf(true);
                z = true;
            } else if (f26995d.matcher(a).matches()) {
                bool = Boolean.valueOf(false);
                z = false;
            } else {
                StringBuilder sb = new StringBuilder("attempt to read gservices key ");
                sb.append(str);
                sb.append(" (value \"");
                sb.append(a);
                sb.append("\") as boolean");
                Log.w("Gservices", sb.toString());
            }
        }
        m26116a(b, f26998g, str, bool);
        return z;
    }

    /* renamed from: b */
    private static Object m26118b(ContentResolver contentResolver) {
        Object obj;
        synchronized (C10310f5.class) {
            m26114a(contentResolver);
            obj = f27002k;
        }
        return obj;
    }
}

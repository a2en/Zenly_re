package com.facebook.common.logging;

/* renamed from: com.facebook.common.logging.a */
public class C9543a {

    /* renamed from: a */
    private static LoggingDelegate f24716a = C9544b.m23326a();

    /* renamed from: a */
    public static boolean m23311a(int i) {
        return f24716a.isLoggable(i);
    }

    /* renamed from: b */
    public static void m23312b(Class<?> cls, String str) {
        if (f24716a.isLoggable(2)) {
            f24716a.mo25680v(m23298a(cls), str);
        }
    }

    /* renamed from: c */
    public static void m23320c(Class<?> cls, String str) {
        if (f24716a.isLoggable(5)) {
            f24716a.mo25682w(m23298a(cls), str);
        }
    }

    /* renamed from: d */
    public static void m23325d(String str, String str2, Object... objArr) {
        if (f24716a.isLoggable(6)) {
            f24716a.wtf(str, m23299a(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m23302a(Class<?> cls, String str, Object obj, Object obj2) {
        if (f24716a.isLoggable(2)) {
            f24716a.mo25680v(m23298a(cls), m23299a(str, obj, obj2));
        }
    }

    /* renamed from: b */
    public static void m23313b(Class<?> cls, String str, Object obj) {
        if (f24716a.isLoggable(2)) {
            f24716a.mo25680v(m23298a(cls), m23299a(str, obj));
        }
    }

    /* renamed from: c */
    public static void m23324c(String str, String str2, Object... objArr) {
        if (f24716a.isLoggable(5)) {
            f24716a.mo25682w(str, m23299a(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m23303a(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (m23311a(2)) {
            m23312b(cls, m23299a(str, obj, obj2, obj3));
        }
    }

    /* renamed from: b */
    public static void m23319b(String str, String str2, Object... objArr) {
        if (f24716a.isLoggable(2)) {
            f24716a.mo25680v(str, m23299a(str2, objArr));
        }
    }

    /* renamed from: c */
    public static void m23322c(Class<?> cls, String str, Object... objArr) {
        if (f24716a.isLoggable(5)) {
            f24716a.mo25682w(m23298a(cls), m23299a(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m23304a(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f24716a.isLoggable(2)) {
            f24716a.mo25680v(m23298a(cls), m23299a(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: b */
    public static void m23315b(Class<?> cls, String str, Object... objArr) {
        if (f24716a.isLoggable(2)) {
            f24716a.mo25680v(m23298a(cls), m23299a(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m23323c(String str, String str2) {
        if (f24716a.isLoggable(6)) {
            f24716a.wtf(str, str2);
        }
    }

    /* renamed from: a */
    public static void m23308a(String str, String str2) {
        if (f24716a.isLoggable(3)) {
            f24716a.mo25670d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m23316b(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (m23311a(5)) {
            m23314b(cls, m23299a(str, objArr), th);
        }
    }

    /* renamed from: c */
    public static void m23321c(Class<?> cls, String str, Throwable th) {
        if (f24716a.isLoggable(6)) {
            f24716a.wtf(m23298a(cls), str, th);
        }
    }

    /* renamed from: a */
    public static void m23301a(Class<?> cls, String str, Object obj) {
        if (f24716a.isLoggable(3)) {
            f24716a.mo25670d(m23298a(cls), m23299a(str, obj));
        }
    }

    /* renamed from: b */
    public static void m23314b(Class<?> cls, String str, Throwable th) {
        if (f24716a.isLoggable(5)) {
            f24716a.mo25683w(m23298a(cls), str, th);
        }
    }

    /* renamed from: a */
    public static void m23309a(String str, String str2, Throwable th) {
        if (f24716a.isLoggable(3)) {
            f24716a.mo25671d(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m23317b(String str, String str2) {
        if (f24716a.isLoggable(6)) {
            f24716a.mo25672e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m23300a(Class<?> cls, String str) {
        if (f24716a.isLoggable(6)) {
            f24716a.mo25672e(m23298a(cls), str);
        }
    }

    /* renamed from: b */
    public static void m23318b(String str, String str2, Throwable th) {
        if (f24716a.isLoggable(6)) {
            f24716a.mo25673e(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m23310a(String str, String str2, Object... objArr) {
        if (f24716a.isLoggable(6)) {
            f24716a.mo25672e(str, m23299a(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m23306a(Class<?> cls, String str, Object... objArr) {
        if (f24716a.isLoggable(6)) {
            f24716a.mo25672e(m23298a(cls), m23299a(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m23307a(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (f24716a.isLoggable(6)) {
            f24716a.mo25673e(m23298a(cls), m23299a(str, objArr), th);
        }
    }

    /* renamed from: a */
    public static void m23305a(Class<?> cls, String str, Throwable th) {
        if (f24716a.isLoggable(6)) {
            f24716a.mo25673e(m23298a(cls), str, th);
        }
    }

    /* renamed from: a */
    private static String m23299a(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    /* renamed from: a */
    private static String m23298a(Class<?> cls) {
        return cls.getSimpleName();
    }
}

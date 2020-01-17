package androidx.core.util;

/* renamed from: androidx.core.util.i */
public final class C0607i {
    /* renamed from: a */
    public static void m2775a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m2776a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static <T> T m2773a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m2774a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m2777a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static int m2772a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    public static int m2771a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }
}

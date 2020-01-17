package com.google.common.base;

/* renamed from: com.google.common.base.i */
public final class C10850i {
    /* renamed from: a */
    public static void m28008a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m28016b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public static int m28019c(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m28007a(i, i2, str));
    }

    /* renamed from: d */
    public static int m28020d(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m28014b(i, i2, str));
    }

    /* renamed from: a */
    public static void m28009a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m28017b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m28011a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C10860k.m28026a(str, obj));
        }
    }

    /* renamed from: b */
    public static void m28018b(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C10860k.m28026a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m28012a(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C10860k.m28026a(str, obj, obj2));
        }
    }

    /* renamed from: b */
    public static int m28013b(int i, int i2) {
        m28020d(i, i2, "index");
        return i;
    }

    /* renamed from: a */
    public static void m28010a(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(C10860k.m28026a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: b */
    private static String m28014b(int i, int i2, String str) {
        if (i < 0) {
            return C10860k.m28026a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C10860k.m28026a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> T m28004a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m28005a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m28003a(int i, int i2) {
        m28019c(i, i2, "index");
        return i;
    }

    /* renamed from: b */
    public static void m28015b(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m28006a(i, i2, i3));
        }
    }

    /* renamed from: a */
    private static String m28007a(int i, int i2, String str) {
        if (i < 0) {
            return C10860k.m28026a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C10860k.m28026a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static String m28006a(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m28014b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m28014b(i2, i3, "end index");
        }
        return C10860k.m28026a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }
}

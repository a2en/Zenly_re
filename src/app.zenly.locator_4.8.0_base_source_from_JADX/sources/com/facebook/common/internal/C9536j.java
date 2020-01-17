package com.facebook.common.internal;

/* renamed from: com.facebook.common.internal.j */
public final class C9536j {
    /* renamed from: a */
    public static void m23275a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m23279b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m23276a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m23280b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m23277a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(m23274a(str, objArr));
        }
    }

    /* renamed from: b */
    public static int m23278b(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m23273a(i, i2, str));
    }

    /* renamed from: a */
    public static <T> T m23271a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m23272a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m23270a(int i, int i2) {
        m23278b(i, i2, "index");
        return i;
    }

    /* renamed from: a */
    private static String m23273a(int i, int i2, String str) {
        if (i < 0) {
            return m23274a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return m23274a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    static String m23274a(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf.substring(i2, indexOf));
            int i3 = i + 1;
            sb.append(objArr[i]);
            int i4 = i3;
            i2 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            int i5 = i + 1;
            sb.append(objArr[i]);
            while (i5 < objArr.length) {
                sb.append(", ");
                int i6 = i5 + 1;
                sb.append(objArr[i5]);
                i5 = i6;
            }
            sb.append(']');
        }
        return sb.toString();
    }
}

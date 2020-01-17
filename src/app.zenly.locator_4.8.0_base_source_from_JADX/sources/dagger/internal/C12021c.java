package dagger.internal;

/* renamed from: dagger.internal.c */
public final class C12021c {
    /* renamed from: a */
    public static <T> T m31670a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m31671a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static <T> T m31672a(T t, String str, Object obj) {
        String str2;
        if (t != null) {
            return t;
        }
        String str3 = "%s";
        if (!str.contains(str3)) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        } else if (str.indexOf(str3) == str.lastIndexOf(str3)) {
            if (obj instanceof Class) {
                str2 = ((Class) obj).getCanonicalName();
            } else {
                str2 = String.valueOf(obj);
            }
            throw new NullPointerException(str.replace(str3, str2));
        } else {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
    }
}

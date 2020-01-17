package com.google.android.libraries.places.internal;

public final class zzgg {
    public static void zza(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void zza(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int zzb(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zzb(i, i2, "index"));
    }

    public static void zza(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(zzgl.zza(str, Character.valueOf(c)));
        }
    }

    private static String zzb(int i, int i2, String str) {
        if (i < 0) {
            return zzgl.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return zzgl.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void zza(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(zzgl.zza(str, Integer.valueOf(i)));
        }
    }

    public static void zza(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(zzgl.zza(str, obj, obj2, obj3));
        }
    }

    public static <T> T zza(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T zza(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int zza(int i, int i2) {
        String str;
        if (i >= 0 && i < i2) {
            return i;
        }
        String str2 = "index";
        if (i < 0) {
            str = zzgl.zza("%s (%s) must not be negative", str2, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            str = zzgl.zza("%s (%s) must be less than size (%s)", str2, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static int zza(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zzb(i, i2, str));
    }

    public static void zza(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = zzb(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = zzb(i2, i3, "end index");
            } else {
                str = zzgl.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}

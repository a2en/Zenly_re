package p389io.reactivex.p393i.p394a;

import p389io.reactivex.functions.BiPredicate;

/* renamed from: io.reactivex.i.a.b */
public final class C12324b {

    /* renamed from: a */
    static final BiPredicate<Object, Object> f31995a = new C12325a();

    /* renamed from: io.reactivex.i.a.b$a */
    static final class C12325a implements BiPredicate<Object, Object> {
        C12325a() {
        }

        public boolean test(Object obj, Object obj2) {
            return C12324b.m32837a(obj, obj2);
        }
    }

    /* renamed from: a */
    public static int m32832a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m32834a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> T m32836a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static boolean m32837a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static <T> BiPredicate<T, T> m32835a() {
        return f31995a;
    }

    /* renamed from: a */
    public static int m32833a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}

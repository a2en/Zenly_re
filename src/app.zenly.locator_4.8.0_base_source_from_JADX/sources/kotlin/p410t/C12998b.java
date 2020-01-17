package kotlin.p410t;

/* renamed from: kotlin.t.b */
class C12998b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m33940a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}

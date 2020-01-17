package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12963e;

/* renamed from: kotlin.collections.o */
class C12848o extends C12846n {
    /* renamed from: a */
    public static final <T> Collection<T> m33639a(T[] tArr) {
        C12932j.m33818b(tArr, "$this$asCollection");
        return new C12830f(tArr, false);
    }

    /* renamed from: b */
    public static <T> List<T> m33643b(T... tArr) {
        C12932j.m33818b(tArr, "elements");
        return tArr.length > 0 ? C12838j.m33557a(tArr) : m33640a();
    }

    /* renamed from: c */
    public static <T> List<T> m33645c(T... tArr) {
        C12932j.m33818b(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C12830f(tArr, true));
    }

    /* renamed from: a */
    public static <T> List<T> m33640a() {
        return C12860y.f33432e;
    }

    /* renamed from: b */
    public static <T> List<T> m33642b(List<? extends T> list) {
        C12932j.m33818b(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size == 0) {
            return m33640a();
        }
        if (size != 1) {
            return list;
        }
        return C12846n.m33635a(list.get(0));
    }

    /* renamed from: c */
    public static void m33646c() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: a */
    public static C12963e m33641a(Collection<?> collection) {
        C12932j.m33818b(collection, "$this$indices");
        return new C12963e(0, collection.size() - 1);
    }

    /* renamed from: a */
    public static <T> int m33638a(List<? extends T> list) {
        C12932j.m33818b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: b */
    public static void m33644b() {
        throw new ArithmeticException("Count overflow has happened.");
    }
}

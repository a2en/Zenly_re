package kotlin.collections;

import java.util.Set;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.m0 */
class C12845m0 extends C12843l0 {
    /* renamed from: a */
    public static <T> Set<T> m33632a() {
        return C12817a0.f33411e;
    }

    /* renamed from: a */
    public static <T> Set<T> m33634a(T... tArr) {
        C12932j.m33818b(tArr, "elements");
        return tArr.length > 0 ? C12840k.m33584i(tArr) : m33632a();
    }

    /* renamed from: a */
    public static final <T> Set<T> m33633a(Set<? extends T> set) {
        C12932j.m33818b(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        if (size == 0) {
            return m33632a();
        }
        if (size != 1) {
            return set;
        }
        return C12843l0.m33589a(set.iterator().next());
    }
}

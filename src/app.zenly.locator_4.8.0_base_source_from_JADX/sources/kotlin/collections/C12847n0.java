package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.n0 */
class C12847n0 extends C12845m0 {
    /* renamed from: a */
    public static <T> Set<T> m33637a(Set<? extends T> set, T t) {
        C12932j.m33818b(set, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C12835h0.m33544a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}

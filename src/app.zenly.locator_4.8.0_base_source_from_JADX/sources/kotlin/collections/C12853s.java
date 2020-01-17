package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.s */
class C12853s extends C12852r {
    /* renamed from: a */
    public static <T> void m33649a(List<T> list, Comparator<? super T> comparator) {
        C12932j.m33818b(list, "$this$sortWith");
        C12932j.m33818b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: c */
    public static <T extends Comparable<? super T>> void m33650c(List<T> list) {
        C12932j.m33818b(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: a */
    public static <T> List<T> m33648a(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$shuffled");
        List<T> k = C12857w.m33690k(iterable);
        Collections.shuffle(k);
        return k;
    }
}

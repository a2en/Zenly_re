package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.t */
class C12854t extends C12853s {
    /* renamed from: a */
    public static <T> boolean m33651a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C12932j.m33818b(collection, "$this$addAll");
        C12932j.m33818b(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static <T> boolean m33652a(Collection<? super T> collection, T[] tArr) {
        C12932j.m33818b(collection, "$this$addAll");
        C12932j.m33818b(tArr, "elements");
        return collection.addAll(C12838j.m33557a(tArr));
    }
}

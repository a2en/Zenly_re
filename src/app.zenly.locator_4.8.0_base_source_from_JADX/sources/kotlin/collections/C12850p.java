package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.p */
class C12850p extends C12848o {
    /* renamed from: a */
    public static <T> int m33647a(Iterable<? extends T> iterable, int i) {
        C12932j.m33818b(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}

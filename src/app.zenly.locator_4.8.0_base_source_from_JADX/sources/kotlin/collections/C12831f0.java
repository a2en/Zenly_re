package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.f0 */
class C12831f0 {
    /* renamed from: a */
    public static final <K, V> V m33526a(Map<K, ? extends V> map, K k) {
        C12932j.m33818b(map, "$this$getOrImplicitDefault");
        if (map instanceof C12827d0) {
            return ((C12827d0) map).mo37072a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Key ");
        sb.append(k);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }
}

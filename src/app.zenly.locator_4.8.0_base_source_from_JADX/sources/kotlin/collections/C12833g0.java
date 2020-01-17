package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12899i;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.g0 */
class C12833g0 extends C12831f0 {
    /* renamed from: a */
    public static <K, V> Map<K, V> m33543a(C12899i<? extends K, ? extends V> iVar) {
        C12932j.m33818b(iVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(iVar.mo37204c(), iVar.mo37205d());
        C12932j.m33815a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m33542a(Map<? extends K, ? extends V> map) {
        C12932j.m33818b(map, "$this$toSingletonMap");
        Entry entry = (Entry) map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C12932j.m33815a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        C12932j.m33815a((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}

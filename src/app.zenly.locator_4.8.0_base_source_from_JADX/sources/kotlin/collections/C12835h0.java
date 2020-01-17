package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C12899i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.h0 */
class C12835h0 extends C12833g0 {
    /* renamed from: a */
    public static <K, V> Map<K, V> m33545a() {
        C12861z zVar = C12861z.f33433e;
        if (zVar != null) {
            return zVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m33554b(C12899i<? extends K, ? extends V>... iVarArr) {
        C12932j.m33818b(iVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(m33544a(iVarArr.length));
        m33551a((Map<? super K, ? super V>) linkedHashMap, iVarArr);
        return linkedHashMap;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m33555c(Map<? extends K, ? extends V> map) {
        C12932j.m33818b(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m33548a(C12899i<? extends K, ? extends V>... iVarArr) {
        C12932j.m33818b(iVarArr, "pairs");
        if (iVarArr.length <= 0) {
            return m33545a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m33544a(iVarArr.length));
        m33549a(iVarArr, (M) linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: b */
    public static <K, V> V m33552b(Map<K, ? extends V> map, K k) {
        C12932j.m33818b(map, "$this$getValue");
        return C12831f0.m33526a(map, k);
    }

    /* renamed from: a */
    public static int m33544a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m33553b(Map<K, ? extends V> map) {
        C12932j.m33818b(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        if (size == 0) {
            return m33545a();
        }
        if (size != 1) {
            return map;
        }
        return C12833g0.m33542a(map);
    }

    /* renamed from: a */
    public static final <K, V> void m33551a(Map<? super K, ? super V> map, C12899i<? extends K, ? extends V>[] iVarArr) {
        C12932j.m33818b(map, "$this$putAll");
        C12932j.m33818b(iVarArr, "pairs");
        for (C12899i<? extends K, ? extends V> iVar : iVarArr) {
            map.put(iVar.mo37202a(), iVar.mo37203b());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m33550a(Map<? super K, ? super V> map, Iterable<? extends C12899i<? extends K, ? extends V>> iterable) {
        C12932j.m33818b(map, "$this$putAll");
        C12932j.m33818b(iterable, "pairs");
        for (C12899i iVar : iterable) {
            map.put(iVar.mo37202a(), iVar.mo37203b());
        }
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m33546a(Iterable<? extends C12899i<? extends K, ? extends V>> iterable) {
        Map<K, V> map;
        C12932j.m33818b(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                map = m33545a();
            } else if (size != 1) {
                map = new LinkedHashMap<>(m33544a(collection.size()));
                m33547a(iterable, (M) map);
            } else {
                map = C12833g0.m33543a((C12899i) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
            }
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m33547a(iterable, (M) linkedHashMap);
        return m33553b((Map<K, ? extends V>) linkedHashMap);
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m33547a(Iterable<? extends C12899i<? extends K, ? extends V>> iterable, M m) {
        C12932j.m33818b(iterable, "$this$toMap");
        C12932j.m33818b(m, "destination");
        m33550a((Map<? super K, ? super V>) m, iterable);
        return m;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m33549a(C12899i<? extends K, ? extends V>[] iVarArr, M m) {
        C12932j.m33818b(iVarArr, "$this$toMap");
        C12932j.m33818b(m, "destination");
        m33551a((Map<? super K, ? super V>) m, iVarArr);
        return m;
    }
}

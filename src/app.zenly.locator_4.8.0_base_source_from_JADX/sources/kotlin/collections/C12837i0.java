package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12899i;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.collections.i0 */
class C12837i0 extends C12835h0 {
    /* renamed from: d */
    public static <K, V> List<C12899i<K, V>> m33556d(Map<? extends K, ? extends V> map) {
        C12932j.m33818b(map, "$this$toList");
        if (map.size() == 0) {
            return C12848o.m33640a();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C12848o.m33640a();
        }
        Entry entry = (Entry) it.next();
        if (!it.hasNext()) {
            return C12846n.m33635a(new C12899i(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C12899i(entry.getKey(), entry.getValue()));
        do {
            Entry entry2 = (Entry) it.next();
            arrayList.add(new C12899i(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}

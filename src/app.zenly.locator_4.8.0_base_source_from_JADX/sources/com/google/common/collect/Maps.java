package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Map;
import java.util.Map.Entry;

public final class Maps {

    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(K k, V1 v1);
    }

    /* renamed from: com.google.common.collect.Maps$a */
    private enum C10863a implements Function<Entry<?, ?>, Object> {
        KEY {
            /* renamed from: a */
            public Object apply(Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: a */
            public Object apply(Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: a */
    static <V> Function<Entry<?, V>, V> m28027a() {
        return C10863a.VALUE;
    }

    /* renamed from: a */
    static boolean m28029a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    /* renamed from: a */
    static String m28028a(Map<?, ?> map) {
        StringBuilder a = C10884g.m28062a(map.size());
        a.append('{');
        boolean z = true;
        for (Entry entry : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            a.append(entry.getKey());
            a.append('=');
            a.append(entry.getValue());
        }
        a.append('}');
        return a.toString();
    }
}

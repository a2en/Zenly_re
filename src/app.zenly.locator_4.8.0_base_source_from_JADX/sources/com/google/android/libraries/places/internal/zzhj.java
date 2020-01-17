package com.google.android.libraries.places.internal;

import java.util.Set;

public final class zzhj {
    static int zza(Set<?> set) {
        int i = 0;
        for (Object next : set) {
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    static boolean zza(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }
}

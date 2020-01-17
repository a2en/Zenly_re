package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class zzde extends LinkedHashMap<Long, Integer> {
    zzde(int i, float f, boolean z) {
        super(16, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Entry<Long, Integer> entry) {
        return size() > 10;
    }
}

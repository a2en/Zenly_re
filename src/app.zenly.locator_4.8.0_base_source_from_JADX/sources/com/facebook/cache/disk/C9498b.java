package com.facebook.cache.disk;

import com.facebook.cache.disk.DiskStorage.Entry;

/* renamed from: com.facebook.cache.disk.b */
public class C9498b implements EntryEvictionComparatorSupplier {

    /* renamed from: com.facebook.cache.disk.b$a */
    class C9499a implements EntryEvictionComparator {
        C9499a(C9498b bVar) {
        }

        /* renamed from: a */
        public int compare(Entry entry, Entry entry2) {
            long timestamp = entry.getTimestamp();
            long timestamp2 = entry2.getTimestamp();
            if (timestamp < timestamp2) {
                return -1;
            }
            return timestamp2 == timestamp ? 0 : 1;
        }
    }

    public EntryEvictionComparator get() {
        return new C9499a(this);
    }
}

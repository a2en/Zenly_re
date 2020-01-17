package app.zenly.android.feature.descendants.model;

import app.zenly.android.feature.descendants.C1385j;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.model.a */
public final class C1389a {

    /* renamed from: a */
    private static final NavigableMap<Integer, C1390a> f5039a;

    /* renamed from: app.zenly.android.feature.descendants.model.a$a */
    public static final class C1390a {

        /* renamed from: a */
        private final int f5040a;

        /* renamed from: b */
        private final int f5041b;

        public C1390a(int i, int i2, int i3) {
            this.f5040a = i2;
            this.f5041b = i3;
        }

        /* renamed from: a */
        public final int mo6654a() {
            return this.f5040a;
        }

        /* renamed from: b */
        public final int mo6655b() {
            return this.f5041b;
        }
    }

    static {
        new C1389a();
        TreeMap treeMap = new TreeMap();
        treeMap.put(Integer.valueOf(0), new C1390a(0, C1385j.ic_card_descendant_0, C1385j.ic_leaderboard_descendant_0));
        treeMap.put(Integer.valueOf(1), new C1390a(1, C1385j.ic_card_descendant_1, C1385j.ic_leaderboard_descendant_1));
        treeMap.put(Integer.valueOf(2), new C1390a(2, C1385j.ic_card_descendant_2, C1385j.ic_leaderboard_descendant_2));
        treeMap.put(Integer.valueOf(3), new C1390a(3, C1385j.ic_card_descendant_3, C1385j.ic_leaderboard_descendant_3));
        treeMap.put(Integer.valueOf(6), new C1390a(4, C1385j.ic_card_descendant_4, C1385j.ic_leaderboard_descendant_4));
        treeMap.put(Integer.valueOf(10), new C1390a(5, C1385j.ic_card_descendant_5, C1385j.ic_leaderboard_descendant_5));
        treeMap.put(Integer.valueOf(20), new C1390a(6, C1385j.ic_card_descendant_6, C1385j.ic_leaderboard_descendant_6));
        treeMap.put(Integer.valueOf(35), new C1390a(7, C1385j.ic_card_descendant_7, C1385j.ic_leaderboard_descendant_7));
        treeMap.put(Integer.valueOf(50), new C1390a(8, C1385j.ic_card_descendant_8, C1385j.ic_leaderboard_descendant_8));
        f5039a = treeMap;
    }

    private C1389a() {
    }

    /* renamed from: a */
    public static final C1390a m6432a(int i) {
        Entry floorEntry = f5039a.floorEntry(Integer.valueOf(i));
        if (floorEntry != null) {
            Object value = floorEntry.getValue();
            C12932j.m33815a(value, "levels.floorEntry(count)!!.value");
            return (C1390a) value;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: b */
    public static final int m6434b(int i) {
        Object floorKey = f5039a.floorKey(Integer.valueOf(i));
        if (floorKey != null) {
            return ((Number) floorKey).intValue();
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public static final boolean m6433a(int i, int i2) {
        return m6434b(i) != m6434b(i2);
    }
}

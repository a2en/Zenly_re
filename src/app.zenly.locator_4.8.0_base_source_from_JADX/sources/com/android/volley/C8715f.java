package com.android.volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: com.android.volley.f */
public class C8715f {

    /* renamed from: a */
    public final int f22455a;

    /* renamed from: b */
    public final byte[] f22456b;

    /* renamed from: c */
    public final Map<String, String> f22457c;

    /* renamed from: d */
    public final List<C8713d> f22458d;

    /* renamed from: e */
    public final boolean f22459e;

    @Deprecated
    public C8715f(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m20503a(map), z, j);
    }

    /* renamed from: a */
    private static Map<String, String> m20504a(List<C8713d> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C8713d dVar : list) {
            treeMap.put(dVar.mo23571a(), dVar.mo23572b());
        }
        return treeMap;
    }

    public C8715f(int i, byte[] bArr, boolean z, long j, List<C8713d> list) {
        this(i, bArr, m20504a(list), list, z, j);
    }

    @Deprecated
    public C8715f(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }

    private C8715f(int i, byte[] bArr, Map<String, String> map, List<C8713d> list, boolean z, long j) {
        this.f22455a = i;
        this.f22456b = bArr;
        this.f22457c = map;
        if (list == null) {
            this.f22458d = null;
        } else {
            this.f22458d = Collections.unmodifiableList(list);
        }
        this.f22459e = z;
    }

    /* renamed from: a */
    private static List<C8713d> m20503a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new C8713d((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}

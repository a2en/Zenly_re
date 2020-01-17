package com.google.gson;

import com.google.gson.internal.C11140a;
import com.google.gson.internal.C11160d;
import com.google.gson.internal.p312m.C11207l;
import com.google.gson.internal.p312m.C11212n;
import com.google.gson.p316k.C11261a;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.e */
public final class C11132e {

    /* renamed from: a */
    private C11160d f28832a = C11160d.f28871k;

    /* renamed from: b */
    private C11135h f28833b = C11135h.DEFAULT;

    /* renamed from: c */
    private FieldNamingStrategy f28834c = C11118c.IDENTITY;

    /* renamed from: d */
    private final Map<Type, InstanceCreator<?>> f28835d = new HashMap();

    /* renamed from: e */
    private final List<TypeAdapterFactory> f28836e = new ArrayList();

    /* renamed from: f */
    private final List<TypeAdapterFactory> f28837f = new ArrayList();

    /* renamed from: g */
    private boolean f28838g = false;

    /* renamed from: h */
    private String f28839h;

    /* renamed from: i */
    private int f28840i = 2;

    /* renamed from: j */
    private int f28841j = 2;

    /* renamed from: k */
    private boolean f28842k = false;

    /* renamed from: l */
    private boolean f28843l = false;

    /* renamed from: m */
    private boolean f28844m = true;

    /* renamed from: n */
    private boolean f28845n = false;

    /* renamed from: o */
    private boolean f28846o = false;

    /* renamed from: p */
    private boolean f28847p = false;

    /* renamed from: a */
    public C11132e mo32480a(int... iArr) {
        this.f28832a = this.f28832a.mo32512a(iArr);
        return this;
    }

    /* renamed from: b */
    public C11132e mo32481b() {
        this.f28845n = true;
        return this;
    }

    /* renamed from: a */
    public C11132e mo32478a(C11118c cVar) {
        this.f28834c = cVar;
        return this;
    }

    /* renamed from: a */
    public C11132e mo32479a(Type type, Object obj) {
        boolean z = obj instanceof JsonSerializer;
        C11140a.m28678a(z || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof C11138i));
        if (obj instanceof InstanceCreator) {
            this.f28835d.put(type, (InstanceCreator) obj);
        }
        if (z || (obj instanceof JsonDeserializer)) {
            this.f28836e.add(C11207l.m28807a(C11261a.get(type), obj));
        }
        if (obj instanceof C11138i) {
            this.f28836e.add(C11212n.m28810a(C11261a.get(type), (C11138i) obj));
        }
        return this;
    }

    /* renamed from: a */
    public C11132e mo32477a(TypeAdapterFactory typeAdapterFactory) {
        this.f28836e.add(typeAdapterFactory);
        return this;
    }

    /* renamed from: a */
    public C11125d mo32476a() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f28836e.size() + this.f28837f.size() + 3);
        arrayList2.addAll(this.f28836e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f28837f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m28667a(this.f28839h, this.f28840i, this.f28841j, arrayList2);
        C11125d dVar = new C11125d(this.f28832a, this.f28834c, this.f28835d, this.f28838g, this.f28842k, this.f28846o, this.f28844m, this.f28845n, this.f28847p, this.f28843l, this.f28833b, this.f28839h, this.f28840i, this.f28841j, this.f28836e, this.f28837f, arrayList);
        return dVar;
    }

    /* renamed from: a */
    private void m28667a(String str, int i, int i2, List<TypeAdapterFactory> list) {
        C11116a aVar;
        C11116a aVar2;
        C11116a aVar3;
        if (str != null) {
            if (!"".equals(str.trim())) {
                C11116a aVar4 = new C11116a(Date.class, str);
                aVar = new C11116a(Timestamp.class, str);
                aVar3 = new C11116a(java.sql.Date.class, str);
                aVar2 = aVar4;
                list.add(C11212n.m28811a(Date.class, (C11138i<TT>) aVar2));
                list.add(C11212n.m28811a(Timestamp.class, (C11138i<TT>) aVar));
                list.add(C11212n.m28811a(java.sql.Date.class, (C11138i<TT>) aVar3));
            }
        }
        if (i != 2 && i2 != 2) {
            aVar2 = new C11116a(Date.class, i, i2);
            C11116a aVar5 = new C11116a(Timestamp.class, i, i2);
            C11116a aVar6 = new C11116a(java.sql.Date.class, i, i2);
            aVar = aVar5;
            aVar3 = aVar6;
            list.add(C11212n.m28811a(Date.class, (C11138i<TT>) aVar2));
            list.add(C11212n.m28811a(Timestamp.class, (C11138i<TT>) aVar));
            list.add(C11212n.m28811a(java.sql.Date.class, (C11138i<TT>) aVar3));
        }
    }
}

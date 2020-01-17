package com.zendesk.util;

import com.zendesk.func.ZFunc1;
import com.zendesk.func.ZFunc2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.zendesk.util.a */
public class C12010a {

    /* renamed from: com.zendesk.util.a$a */
    static class C12011a implements ZFunc1 {
        C12011a() {
        }

        public Object apply(Object obj) {
            return obj;
        }
    }

    static {
        new C12011a();
    }

    /* renamed from: a */
    public static <Type> boolean m31636a(Type[] typeArr) {
        return typeArr == null || typeArr.length == 0;
    }

    /* renamed from: b */
    public static <Type> boolean m31640b(Type[] typeArr) {
        return !m31636a(typeArr);
    }

    /* renamed from: c */
    public static <Type> List<Type> m31641c(List<Type> list) {
        return Collections.unmodifiableList(m31638b(list));
    }

    /* renamed from: a */
    public static <Type> boolean m31635a(Collection<Type> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: b */
    public static <Type> boolean m31639b(Collection<Type> collection) {
        return !m31635a(collection);
    }

    @SafeVarargs
    /* renamed from: a */
    public static <Type> List<Type> m31633a(List<Type>... listArr) {
        if (listArr == null || listArr.length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new CopyOnWriteArrayList(listArr).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            if (m31639b((Collection<Type>) list)) {
                Iterator it2 = new CopyOnWriteArrayList(list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static <Type> List<Type> m31638b(List<Type> list) {
        return m31635a((Collection<Type>) list) ? new ArrayList() : list;
    }

    /* renamed from: b */
    public static <Type, Return> List<Return> m31637b(Collection<Type> collection, ZFunc1<Type, Return> zFunc1) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Type apply : collection) {
            arrayList.add(zFunc1.apply(apply));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <Type> List<Type> m31632a(List<Type> list) {
        if (list == null) {
            return new ArrayList();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size());
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <Key, Value> Map<Key, Value> m31634a(Map<Key, Value> map) {
        if (map == null) {
            return new HashMap();
        }
        Map synchronizedMap = Collections.synchronizedMap(map);
        HashMap hashMap = new HashMap();
        hashMap.putAll(synchronizedMap);
        return hashMap;
    }

    /* renamed from: a */
    public static <Type> List<Type> m31630a(Collection<Type> collection, ZFunc1<Type, Boolean> zFunc1) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (((Boolean) zFunc1.apply(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <Type> List<Type> m31631a(Collection<Type> collection, Type type, ZFunc2<Type, Type, Boolean> zFunc2) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection);
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Boolean) zFunc2.apply(arrayList.get(i), type)).booleanValue()) {
                arrayList.set(i, type);
                z = true;
            }
        }
        if (!z) {
            arrayList.add(type);
        }
        return arrayList;
    }
}

package com.google.common.collect;

import com.google.common.base.C10848g;
import com.google.common.base.C10850i;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.u */
public final class C10921u {
    /* renamed from: a */
    public static <E> ArrayList<E> m28138a(int i) {
        C10882f.m28056a(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    /* renamed from: b */
    static int m28140b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m28141c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C10848g.m28000a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static int m28141c(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(list.get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: d */
    static int m28142d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m28143e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C10848g.m28000a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m28143e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (obj.equals(list.get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    static boolean m28139a(List<?> list, Object obj) {
        C10850i.m28004a(list);
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C10917t.m28135a(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C10848g.m28000a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}

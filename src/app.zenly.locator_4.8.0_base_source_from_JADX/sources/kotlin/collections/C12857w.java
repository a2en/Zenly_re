package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12963e;
import kotlin.sequences.Sequence;

/* renamed from: kotlin.collections.w */
class C12857w extends C12856v {

    /* renamed from: kotlin.collections.w$a */
    public static final class C12858a implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f33430a;

        public C12858a(Iterable iterable) {
            this.f33430a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f33430a.iterator();
        }
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m33663a(Iterable<? extends T> iterable, C c) {
        C12932j.m33818b(iterable, "$this$filterNotNullTo");
        C12932j.m33818b(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: b */
    public static <T> List<T> m33669b(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C12932j.m33818b(iterable, "$this$drop");
        int i2 = 0;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return m33689j(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C12848o.m33640a();
                }
                if (size == 1) {
                    return C12846n.m33635a(m33680e(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return C12848o.m33642b((List<? extends T>) arrayList);
        }
    }

    /* renamed from: c */
    public static <T> T m33673c(List<? extends T> list, int i) {
        C12932j.m33818b(list, "$this$getOrNull");
        if (i < 0 || i > C12848o.m33638a(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: d */
    public static <T> T m33677d(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$first");
        if (iterable instanceof List) {
            return m33682f((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: e */
    public static final <T> T m33680e(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$last");
        if (iterable instanceof List) {
            return m33686h((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: f */
    public static <T> T m33682f(List<? extends T> list) {
        C12932j.m33818b(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: g */
    public static <T> T m33683g(List<? extends T> list) {
        C12932j.m33818b(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: h */
    public static <T> T m33686h(List<? extends T> list) {
        C12932j.m33818b(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(C12848o.m33638a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: i */
    public static final <T> T m33687i(List<? extends T> list) {
        C12932j.m33818b(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: j */
    public static <T> List<T> m33689j(Iterable<? extends T> iterable) {
        List<T> list;
        C12932j.m33818b(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return C12848o.m33642b(m33690k(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            list = C12848o.m33640a();
        } else if (size != 1) {
            list = m33678d(collection);
        } else {
            list = C12846n.m33635a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        return list;
    }

    /* renamed from: k */
    public static final <T> List<T> m33690k(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return m33678d((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m33668b(iterable, (C) arrayList);
        return arrayList;
    }

    /* renamed from: l */
    public static <T> Set<T> m33691l(Iterable<? extends T> iterable) {
        Set<T> set;
        C12932j.m33818b(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                set = C12845m0.m33632a();
            } else if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C12835h0.m33544a(collection.size()));
                m33668b(iterable, (C) linkedHashSet);
                set = linkedHashSet;
            } else {
                set = C12843l0.m33589a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return set;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m33668b(iterable, (C) linkedHashSet2);
        return C12845m0.m33633a((Set<? extends T>) linkedHashSet2);
    }

    /* renamed from: a */
    public static <T> List<T> m33667a(List<? extends T> list, C12963e eVar) {
        C12932j.m33818b(list, "$this$slice");
        C12932j.m33818b(eVar, "indices");
        if (eVar.isEmpty()) {
            return C12848o.m33640a();
        }
        return m33689j(list.subList(eVar.getStart().intValue(), eVar.getEndInclusive().intValue() + 1));
    }

    /* renamed from: c */
    public static <T> List<T> m33674c(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        m33663a(iterable, (C) arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public static <T> List<T> m33684g(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$reversed");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m33689j(iterable);
        }
        List<T> k = m33690k(iterable);
        C12856v.m33658e(k);
        return k;
    }

    /* renamed from: c */
    public static <T> List<T> m33675c(Iterable<? extends T> iterable, int i) {
        C12932j.m33818b(iterable, "$this$take");
        int i2 = 0;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return C12848o.m33640a();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m33689j(iterable);
                }
                if (i == 1) {
                    return C12846n.m33635a(m33677d(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 == i) {
                    break;
                }
                arrayList.add(next);
                i2 = i3;
            }
            return C12848o.m33642b((List<? extends T>) arrayList);
        }
    }

    /* renamed from: a */
    public static <T> List<T> m33665a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C12932j.m33818b(iterable, "$this$sortedWith");
        C12932j.m33818b(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m33689j(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            String str = "null cannot be cast to non-null type kotlin.Array<T>";
            if (array == null) {
                throw new TypeCastException(str);
            } else if (array != null) {
                C12838j.m33560a(array, comparator);
                return C12838j.m33557a(array);
            } else {
                throw new TypeCastException(str);
            }
        } else {
            List<T> k = m33690k(iterable);
            C12853s.m33649a(k, comparator);
            return k;
        }
    }

    /* renamed from: f */
    public static <T extends Comparable<? super T>> T m33681f(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$min");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: h */
    public static <T> T m33685h(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$single");
        if (iterable instanceof List) {
            return m33687i((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: i */
    public static <T extends Comparable<? super T>> List<T> m33688i(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$sorted");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m33689j(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            String str = "null cannot be cast to non-null type kotlin.Array<T>";
            if (array == null) {
                throw new TypeCastException(str);
            } else if (array != null) {
                Comparable[] comparableArr = (Comparable[]) array;
                if (comparableArr != null) {
                    C12838j.m33563b(comparableArr);
                    return C12838j.m33557a(comparableArr);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            } else {
                throw new TypeCastException(str);
            }
        } else {
            List<T> k = m33690k(iterable);
            C12853s.m33650c(k);
            return k;
        }
    }

    /* renamed from: d */
    public static <T> List<T> m33679d(List<? extends T> list, int i) {
        C12932j.m33818b(list, "$this$takeLast");
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return C12848o.m33640a();
        } else {
            int size = list.size();
            if (i >= size) {
                return m33689j(list);
            }
            if (i == 1) {
                return C12846n.m33635a(m33686h(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static <T> List<T> m33666a(Collection<? extends T> collection, T t) {
        C12932j.m33818b(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: c */
    public static long[] m33676c(Collection<Long> collection) {
        C12932j.m33818b(collection, "$this$toLongArray");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Number longValue : collection) {
            int i2 = i + 1;
            jArr[i] = longValue.longValue();
            i = i2;
        }
        return jArr;
    }

    /* renamed from: a */
    public static /* synthetic */ Appendable m33660a(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5 = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = (i2 & 4) != 0 ? charSequence6 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        m33659a(iterable, appendable, charSequence5, charSequence7, charSequence6, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : function1);
        return appendable;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m33659a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12932j.m33818b(iterable, "$this$joinTo");
        C12932j.m33818b(a, "buffer");
        C12932j.m33818b(charSequence, "separator");
        C12932j.m33818b(charSequence2, "prefix");
        C12932j.m33818b(charSequence3, "postfix");
        C12932j.m33818b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C13025n.m33993a(a, next, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: d */
    public static <T> List<T> m33678d(Collection<? extends T> collection) {
        C12932j.m33818b(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    /* renamed from: b */
    public static int[] m33672b(Collection<Integer> collection) {
        C12932j.m33818b(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Number intValue : collection) {
            int i2 = i + 1;
            iArr[i] = intValue.intValue();
            i = i2;
        }
        return iArr;
    }

    /* renamed from: a */
    public static /* synthetic */ String m33662a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m33661a(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, function1);
    }

    /* renamed from: a */
    public static final <T> String m33661a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) {
        C12932j.m33818b(iterable, "$this$joinToString");
        C12932j.m33818b(charSequence, "separator");
        C12932j.m33818b(charSequence2, "prefix");
        C12932j.m33818b(charSequence3, "postfix");
        C12932j.m33818b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m33659a(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, function1);
        String sb2 = sb.toString();
        C12932j.m33815a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m33668b(Iterable<? extends T> iterable, C c) {
        C12932j.m33818b(iterable, "$this$toCollection");
        C12932j.m33818b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: a */
    public static <T, R> List<C12899i<T, R>> m33664a(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C12932j.m33818b(iterable, "$this$zip");
        C12932j.m33818b(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C12850p.m33647a(iterable, 10), C12850p.m33647a(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C12954o.m33853a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static <T> List<T> m33670b(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C12932j.m33818b(collection, "$this$plus");
        C12932j.m33818b(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C12854t.m33651a((Collection<? super T>) arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: b */
    public static <T> Sequence<T> m33671b(Iterable<? extends T> iterable) {
        C12932j.m33818b(iterable, "$this$asSequence");
        return new C12858a(iterable);
    }
}
